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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProcesoGenerarSaldosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProcesoGenerarSaldosDetalleFormJInternalFrame extends ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoGenerarSaldos;
	
	protected JMenuBar jmenuBarDetalleProcesoGenerarSaldos;
	
	protected JMenu jmenuDetalleProcesoGenerarSaldos;
	protected JMenu jmenuDetalleArchivoProcesoGenerarSaldos;
	protected JMenu jmenuDetalleAccionesProcesoGenerarSaldos;
	protected JMenu jmenuDetalleDatosProcesoGenerarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGenerarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoGenerarSaldos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoGenerarSaldos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public ProcesoGenerarSaldosSessionBean procesogenerarsaldosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;	
	
	public ProcesoGenerarSaldosLogic procesogenerarsaldosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoGenerarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoGenerarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoGenerarSaldos;
	
	protected JPanel jPanelCamposProcesoGenerarSaldos;    
	protected JPanel jPanelCamposOcultosProcesoGenerarSaldos;    	
	protected JPanel jPanelAccionesProcesoGenerarSaldos;
	protected JPanel jPanelAccionesFormularioProcesoGenerarSaldos;
    
	
	
	protected Integer iXPanelCamposProcesoGenerarSaldos=0;
	protected Integer iYPanelCamposProcesoGenerarSaldos=0;
	
	protected Integer iXPanelCamposOcultosProcesoGenerarSaldos=0;
	protected Integer iYPanelCamposOcultosProcesoGenerarSaldos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoGenerarSaldos;
	public JButton jButtonModificarProcesoGenerarSaldos;
	public JButton jButtonActualizarProcesoGenerarSaldos;
    public JButton jButtonEliminarProcesoGenerarSaldos;
	public JButton jButtonCancelarProcesoGenerarSaldos;
    public JButton jButtonGuardarCambiosProcesoGenerarSaldos;
	public JButton jButtonGuardarCambiosTablaProcesoGenerarSaldos;
	protected JButton jButtonCerrarProcesoGenerarSaldos;
	
	
	protected JButton jButtonProcesarInformacionProcesoGenerarSaldos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoGenerarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGenerarSaldos;
	protected JButton jButtonModificarToolBarProcesoGenerarSaldos;
	protected JButton jButtonActualizarToolBarProcesoGenerarSaldos;
    protected JButton jButtonEliminarToolBarProcesoGenerarSaldos;
	protected JButton jButtonCancelarToolBarProcesoGenerarSaldos;
    protected JButton jButtonGuardarCambiosToolBarProcesoGenerarSaldos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGenerarSaldos;
	protected JButton jButtonCerrarToolBarProcesoGenerarSaldos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoGenerarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGenerarSaldos;
	protected JMenuItem jMenuItemModificarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemActualizarProcesoGenerarSaldos;
    protected JMenuItem jMenuItemEliminarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemCancelarProcesoGenerarSaldos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoGenerarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGenerarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGenerarSaldos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoGenerarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGenerarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGenerarSaldos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGenerarSaldos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoGenerarSaldos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoGenerarSaldos;
	public JLabel jLabelIdProcesoGenerarSaldos;
	public JLabel jLabelidProcesoGenerarSaldos;
	public JButton jButtonidProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalProcesoGenerarSaldos;
	public JLabel jLabelnombre_sucursalProcesoGenerarSaldos;
	public JTextArea jTextAreanombre_sucursalProcesoGenerarSaldos;
	public JScrollPane jscrollPanenombre_sucursalProcesoGenerarSaldos;
	public JButton jButtonnombre_sucursalProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteProcesoGenerarSaldos;
	public JLabel jLabelnumero_comprobanteProcesoGenerarSaldos;
	public JTextField jTextFieldnumero_comprobanteProcesoGenerarSaldos;
	public JButton jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoGenerarSaldos;
	public JLabel jLabelfechaProcesoGenerarSaldos;
	//public JFormattedTextField jDateChooserfechaProcesoGenerarSaldos;

	public JDateChooser jDateChooserfechaProcesoGenerarSaldos;
	public JButton jButtonfechaProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaProcesoGenerarSaldos;
	public JLabel jLabelnombre_bodegaProcesoGenerarSaldos;
	public JTextArea jTextAreanombre_bodegaProcesoGenerarSaldos;
	public JScrollPane jscrollPanenombre_bodegaProcesoGenerarSaldos;
	public JButton jButtonnombre_bodegaProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProcesoGenerarSaldos;
	public JLabel jLabelnombre_productoProcesoGenerarSaldos;
	public JTextArea jTextAreanombre_productoProcesoGenerarSaldos;
	public JScrollPane jscrollPanenombre_productoProcesoGenerarSaldos;
	public JButton jButtonnombre_productoProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProcesoGenerarSaldos;
	public JLabel jLabelcantidadProcesoGenerarSaldos;
	public JTextField jTextFieldcantidadProcesoGenerarSaldos;
	public JButton jButtoncantidadProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioProcesoGenerarSaldos;
	public JLabel jLabelcosto_unitarioProcesoGenerarSaldos;
	public JTextField jTextFieldcosto_unitarioProcesoGenerarSaldos;
	public JButton jButtoncosto_unitarioProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProcesoGenerarSaldos;
	public JLabel jLabelcosto_totalProcesoGenerarSaldos;
	public JTextField jTextFieldcosto_totalProcesoGenerarSaldos;
	public JButton jButtoncosto_totalProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodega_enviarProcesoGenerarSaldos;
	public JLabel jLabelnombre_bodega_enviarProcesoGenerarSaldos;
	public JTextArea jTextAreanombre_bodega_enviarProcesoGenerarSaldos;
	public JScrollPane jscrollPanenombre_bodega_enviarProcesoGenerarSaldos;
	public JButton jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPaneltotalProcesoGenerarSaldos;
	public JLabel jLabeltotalProcesoGenerarSaldos;
	public JTextField jTextFieldtotalProcesoGenerarSaldos;
	public JButton jButtontotalProcesoGenerarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoGenerarSaldos;
	public JLabel jLabelid_empresaProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoGenerarSaldos;
	public JButton jButtonid_empresaProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_empresaProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoGenerarSaldos;
	public JLabel jLabelid_sucursalProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoGenerarSaldos;
	public JButton jButtonid_sucursalProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_sucursalProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioProcesoGenerarSaldos;
	public JLabel jLabelid_ejercicioProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoGenerarSaldos;
	public JButton jButtonid_ejercicioProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoProcesoGenerarSaldos;
	public JLabel jLabelid_periodoProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoProcesoGenerarSaldos;
	public JButton jButtonid_periodoProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_periodoProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoProcesoGenerarSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos;
	public JLabel jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos;
	public JButton jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoGenerarSaldos;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoGenerarSaldos=new JPanel();
				this.jPanelAccionesFormularioProcesoGenerarSaldos=new JPanel();
				this.jmenuBarDetalleProcesoGenerarSaldos=new JMenuBar();
				this.jTtoolBarDetalleProcesoGenerarSaldos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoGenerarSaldosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoGenerarSaldos() {
		return this.jButtonActualizarToolBarProcesoGenerarSaldos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoGenerarSaldos() {
		return this.jButtonEliminarToolBarProcesoGenerarSaldos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoGenerarSaldos() {
		return this.jButtonCancelarToolBarProcesoGenerarSaldos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoGenerarSaldos() {
		return this.jButtonProcesarInformacionProcesoGenerarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGenerarSaldos)	{
		this.jButtonProcesarInformacionProcesoGenerarSaldos = jButtonProcesarInformacionProcesoGenerarSaldos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGenerarSaldos() {
		return this.jComboBoxTiposAccionesProcesoGenerarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoGenerarSaldos) {
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos = jComboBoxTiposRelacionesProcesoGenerarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoGenerarSaldos) {
		this.jComboBoxTiposAccionesProcesoGenerarSaldos = jComboBoxTiposAccionesProcesoGenerarSaldos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoGenerarSaldos() {
		return this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoGenerarSaldos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoGenerarSaldos) {
		this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos = jComboBoxTiposAccionesFormularioProcesoGenerarSaldos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
		
		this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGenerarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Generar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoGenerarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoGenerarSaldos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoGenerarSaldos=new JButtonMe();
				this.jButtonModificarToolBarProcesoGenerarSaldos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoGenerarSaldos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoGenerarSaldos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoGenerarSaldos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoGenerarSaldos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoGenerarSaldos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGenerarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGenerarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGenerarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoGenerarSaldos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoGenerarSaldos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoGenerarSaldos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoGenerarSaldos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoGenerarSaldos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoGenerarSaldos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoGenerarSaldos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoGenerarSaldos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoGenerarSaldos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoGenerarSaldos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoGenerarSaldos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoGenerarSaldos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGenerarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGenerarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGenerarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGenerarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoGenerarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoGenerarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoGenerarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGenerarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGenerarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGenerarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoGenerarSaldos.add(this.jMenuItemDetalleCerrarProcesoGenerarSaldos);
		
		this.jmenuDetalleAccionesProcesoGenerarSaldos.add(this.jMenuItemActualizarProcesoGenerarSaldos);
		this.jmenuDetalleAccionesProcesoGenerarSaldos.add(this.jMenuItemEliminarProcesoGenerarSaldos);
		this.jmenuDetalleAccionesProcesoGenerarSaldos.add(this.jMenuItemCancelarProcesoGenerarSaldos);		
		
		//this.jmenuDetalleDatosProcesoGenerarSaldos.add(this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos);				
		this.jmenuDetalleDatosProcesoGenerarSaldos.add(this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos);				
				
		//this.jmenuDetalleAccionesProcesoGenerarSaldos.add(this.jMenuItemGuardarCambiosProcesoGenerarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoGenerarSaldos.add(this.jmenuDetalleArchivoProcesoGenerarSaldos);		
		this.jmenuBarDetalleProcesoGenerarSaldos.add(this.jmenuDetalleAccionesProcesoGenerarSaldos);		
		this.jmenuBarDetalleProcesoGenerarSaldos.add(this.jmenuDetalleDatosProcesoGenerarSaldos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoGenerarSaldos);				
	}
	
	
	public void inicializarElementosCamposProcesoGenerarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoGenerarSaldos = new JLabelMe();
		jLabelIdProcesoGenerarSaldos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoGenerarSaldos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoGenerarSaldos= new GridBagLayout();

		this.jPanelidProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);

		jLabelidProcesoGenerarSaldos = new JLabel();
		jLabelidProcesoGenerarSaldos.setText("Id");

		jLabelidProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sucursalProcesoGenerarSaldos = new JLabelMe();
		this.jLabelnombre_sucursalProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalProcesoGenerarSaldos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelnombre_sucursalProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextAreanombre_sucursalProcesoGenerarSaldos= new JTextAreaMe();
		jTextAreanombre_sucursalProcesoGenerarSaldos.setEnabled(false);
		jTextAreanombre_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalProcesoGenerarSaldos.setLineWrap(true);
		jTextAreanombre_sucursalProcesoGenerarSaldos.setWrapStyleWord(true);
		jTextAreanombre_sucursalProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalProcesoGenerarSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalProcesoGenerarSaldos = new JScrollPane(jTextAreanombre_sucursalProcesoGenerarSaldos);
		jscrollPanenombre_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteProcesoGenerarSaldos = new JLabelMe();
		this.jLabelnumero_comprobanteProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteProcesoGenerarSaldos.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelnumero_comprobanteProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextFieldnumero_comprobanteProcesoGenerarSaldos= new JTextFieldMe();

		jTextFieldnumero_comprobanteProcesoGenerarSaldos.setEnabled(false);
		jTextFieldnumero_comprobanteProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelfechaProcesoGenerarSaldos = new JLabelMe();
		this.jLabelfechaProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoGenerarSaldos.setToolTipText("Fecha");
		this.jLabelfechaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelfechaProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		//jFormattedTextFieldfechaProcesoGenerarSaldos= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoGenerarSaldos= new JDateChooser();
		jDateChooserfechaProcesoGenerarSaldos.setEnabled(false);
		jDateChooserfechaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoGenerarSaldos.setDate(new Date());
		jDateChooserfechaProcesoGenerarSaldos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoGenerarSaldos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaProcesoGenerarSaldos = new JLabelMe();
		this.jLabelnombre_bodegaProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaProcesoGenerarSaldos.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelnombre_bodegaProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextAreanombre_bodegaProcesoGenerarSaldos= new JTextAreaMe();
		jTextAreanombre_bodegaProcesoGenerarSaldos.setEnabled(false);
		jTextAreanombre_bodegaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaProcesoGenerarSaldos.setLineWrap(true);
		jTextAreanombre_bodegaProcesoGenerarSaldos.setWrapStyleWord(true);
		jTextAreanombre_bodegaProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaProcesoGenerarSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaProcesoGenerarSaldos = new JScrollPane(jTextAreanombre_bodegaProcesoGenerarSaldos);
		jscrollPanenombre_bodegaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProcesoGenerarSaldos = new JLabelMe();
		this.jLabelnombre_productoProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProcesoGenerarSaldos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelnombre_productoProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextAreanombre_productoProcesoGenerarSaldos= new JTextAreaMe();
		jTextAreanombre_productoProcesoGenerarSaldos.setEnabled(false);
		jTextAreanombre_productoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoGenerarSaldos.setLineWrap(true);
		jTextAreanombre_productoProcesoGenerarSaldos.setWrapStyleWord(true);
		jTextAreanombre_productoProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProcesoGenerarSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProcesoGenerarSaldos = new JScrollPane(jTextAreanombre_productoProcesoGenerarSaldos);
		jscrollPanenombre_productoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProcesoGenerarSaldos = new JLabelMe();
		this.jLabelcantidadProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProcesoGenerarSaldos.setToolTipText("Cantidad");
		this.jLabelcantidadProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelcantidadProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextFieldcantidadProcesoGenerarSaldos= new JTextFieldMe();
		jTextFieldcantidadProcesoGenerarSaldos.setEnabled(false);
		jTextFieldcantidadProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProcesoGenerarSaldos.setText("0");

		this.jButtoncantidadProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioProcesoGenerarSaldos = new JLabelMe();
		this.jLabelcosto_unitarioProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioProcesoGenerarSaldos.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelcosto_unitarioProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextFieldcosto_unitarioProcesoGenerarSaldos= new JTextFieldMe();
		jTextFieldcosto_unitarioProcesoGenerarSaldos.setEnabled(false);
		jTextFieldcosto_unitarioProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioProcesoGenerarSaldos.setText("0.0");

		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProcesoGenerarSaldos = new JLabelMe();
		this.jLabelcosto_totalProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProcesoGenerarSaldos.setToolTipText("Costo Total");
		this.jLabelcosto_totalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelcosto_totalProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextFieldcosto_totalProcesoGenerarSaldos= new JTextFieldMe();
		jTextFieldcosto_totalProcesoGenerarSaldos.setEnabled(false);
		jTextFieldcosto_totalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProcesoGenerarSaldos.setText("0.0");

		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos = new JLabelMe();
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR+" : *");
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos.setToolTipText("Nombre Bodega Enviar");
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_bodega_enviarProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodega_enviarProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodega_enviarProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodega_enviarProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelnombre_bodega_enviarProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextAreanombre_bodega_enviarProcesoGenerarSaldos= new JTextAreaMe();
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setEnabled(false);
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setLineWrap(true);
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setWrapStyleWord(true);
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodega_enviarProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodega_enviarProcesoGenerarSaldos = new JScrollPane(jTextAreanombre_bodega_enviarProcesoGenerarSaldos);
		jscrollPanenombre_bodega_enviarProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodega_enviarProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodega_enviarProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodega_enviarProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodega_enviarProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.setVisible(false);		}


					
		this.jLabeltotalProcesoGenerarSaldos = new JLabelMe();
		this.jLabeltotalProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalProcesoGenerarSaldos.setToolTipText("Total");
		this.jLabeltotalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPaneltotalProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jTextFieldtotalProcesoGenerarSaldos= new JTextFieldMe();
		jTextFieldtotalProcesoGenerarSaldos.setEnabled(false);
		jTextFieldtotalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalProcesoGenerarSaldos.setText("0.0");

		this.jButtontotalProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtontotalProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtontotalProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalProcesoGenerarSaldosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoGenerarSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoGenerarSaldos = new JLabelMe();
		this.jLabelid_empresaProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoGenerarSaldos.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelid_empresaProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jComboBoxid_empresaProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_empresaProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoGenerarSaldos.setEnabled(false);

		this.jButtonid_empresaProcesoGenerarSaldos= new JButtonMe();
		this.jButtonid_empresaProcesoGenerarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoGenerarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoGenerarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoGenerarSaldos.setText("Buscar");
		this.jButtonid_empresaProcesoGenerarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoGenerarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoGenerarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoGenerarSaldos"));

		this.jButtonid_empresaProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoGenerarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoGenerarSaldosUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoGenerarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoGenerarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoGenerarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoGenerarSaldosUpdate.setText("U");
		this.jButtonid_empresaProcesoGenerarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoGenerarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoGenerarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoGenerarSaldosUpdate"));



					
		this.jLabelid_sucursalProcesoGenerarSaldos = new JLabelMe();
		this.jLabelid_sucursalProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoGenerarSaldos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelid_sucursalProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jComboBoxid_sucursalProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoGenerarSaldos.setEnabled(false);

		this.jButtonid_sucursalProcesoGenerarSaldos= new JButtonMe();
		this.jButtonid_sucursalProcesoGenerarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoGenerarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoGenerarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoGenerarSaldos.setText("Buscar");
		this.jButtonid_sucursalProcesoGenerarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoGenerarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoGenerarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoGenerarSaldos"));

		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoGenerarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoGenerarSaldosUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setText("U");
		this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoGenerarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoGenerarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoGenerarSaldosUpdate"));



					
		this.jLabelid_ejercicioProcesoGenerarSaldos = new JLabelMe();
		this.jLabelid_ejercicioProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoGenerarSaldos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelid_ejercicioProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jComboBoxid_ejercicioProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoGenerarSaldos.setEnabled(false);

		this.jButtonid_ejercicioProcesoGenerarSaldos= new JButtonMe();
		this.jButtonid_ejercicioProcesoGenerarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoGenerarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoGenerarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoGenerarSaldos.setText("Buscar");
		this.jButtonid_ejercicioProcesoGenerarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoGenerarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoGenerarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoGenerarSaldos"));

		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setText("U");
		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoGenerarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoGenerarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoGenerarSaldosUpdate"));



					
		this.jLabelid_periodoProcesoGenerarSaldos = new JLabelMe();
		this.jLabelid_periodoProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoProcesoGenerarSaldos.setToolTipText("Periodo");
		this.jLabelid_periodoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelid_periodoProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jComboBoxid_periodoProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_periodoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoProcesoGenerarSaldos.setEnabled(false);

		this.jButtonid_periodoProcesoGenerarSaldos= new JButtonMe();
		this.jButtonid_periodoProcesoGenerarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoGenerarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoGenerarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoGenerarSaldos.setText("Buscar");
		this.jButtonid_periodoProcesoGenerarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoProcesoGenerarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoGenerarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoGenerarSaldos"));

		this.jButtonid_periodoProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoProcesoGenerarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_periodoProcesoGenerarSaldosUpdate= new JButtonMe();
		this.jButtonid_periodoProcesoGenerarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoGenerarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoGenerarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoGenerarSaldosUpdate.setText("U");
		this.jButtonid_periodoProcesoGenerarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoProcesoGenerarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoGenerarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoGenerarSaldosUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos.setText(""+ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.setToolTipText(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.setLayout(this.gridaBagLayoutProcesoGenerarSaldos);


		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloProcesoGenerarSaldos"));

		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda"));

		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate"));



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
		//this.jInternalFrameDetalleProcesoGenerarSaldos = new ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Generar Saldos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGenerarSaldos= new GridBagLayout();
		

		
		String sToolTipProcesoGenerarSaldos="";
		sToolTipProcesoGenerarSaldos=ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGenerarSaldos+="(Inventario.ProcesoGenerarSaldos)";
		}
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGenerarSaldos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoGenerarSaldos = new JButtonMe();
		this.jButtonModificarProcesoGenerarSaldos = new JButtonMe();
        this.jButtonActualizarProcesoGenerarSaldos = new JButtonMe();
        this.jButtonEliminarProcesoGenerarSaldos = new JButtonMe();
        this.jButtonCancelarProcesoGenerarSaldos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoGenerarSaldos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoGenerarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGenerarSaldos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoGenerarSaldos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoGenerarSaldos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Generar Saldos";
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoGenerarSaldos.setName("jPanelCamposProcesoGenerarSaldos"); 

		this.jPanelCamposOcultosProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoGenerarSaldos.setName("jPanelCamposOcultosProcesoGenerarSaldos"); 

        this.jPanelAccionesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGenerarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGenerarSaldos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoGenerarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoGenerarSaldos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoGenerarSaldos.setText("Nuevo");
		this.jButtonModificarProcesoGenerarSaldos.setText("Editar");
        this.jButtonActualizarProcesoGenerarSaldos.setText("Actualizar");
        this.jButtonEliminarProcesoGenerarSaldos.setText("Eliminar");
        this.jButtonCancelarProcesoGenerarSaldos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoGenerarSaldos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoGenerarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGenerarSaldos,"nuevo_button","Nuevo",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoGenerarSaldos,"modificar_button","Editar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoGenerarSaldos,"actualizar_button","Actualizar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoGenerarSaldos,"eliminar_button","Eliminar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoGenerarSaldos,"cancelar_button","Cancelar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoGenerarSaldos,"guardarcambios_button","Guardar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGenerarSaldos,"guardarcambiostabla_button","Guardar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGenerarSaldos,"cerrar_button","Salir",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoGenerarSaldos.setToolTipText("Nuevo"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoGenerarSaldos.setToolTipText("Editar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoGenerarSaldos.setToolTipText("Actualizar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoGenerarSaldos.setToolTipText("Eliminar)"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoGenerarSaldos.setToolTipText("Cancelar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoGenerarSaldos.setToolTipText("Guardar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setToolTipText("Guardar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGenerarSaldos.setToolTipText("Salir"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGenerarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGenerarSaldos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoGenerarSaldos";
		inputMap = this.jButtonActualizarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoGenerarSaldos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoGenerarSaldos";
		inputMap = this.jButtonEliminarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoGenerarSaldos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoGenerarSaldos";
		inputMap = this.jButtonCancelarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoGenerarSaldos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoGenerarSaldos";
		inputMap = this.jButtonCerrarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGenerarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGenerarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGenerarSaldos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoGenerarSaldos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoGenerarSaldos.setToolTipText("Nuevo ProcesoGenerarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos.setToolTipText("Sin Cerrar Ventana ProcesoGenerarSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoGenerarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoGenerarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoGenerarSaldos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoGenerarSaldos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoGenerarSaldos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoGenerarSaldos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoGenerarSaldos = new GridBagLayout();
		
		this.jPanelCamposProcesoGenerarSaldos.setLayout(gridaBagLayoutCamposProcesoGenerarSaldos);
		this.jPanelCamposOcultosProcesoGenerarSaldos.setLayout(gridaBagLayoutCamposOcultosProcesoGenerarSaldos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoGenerarSaldos.add(jLabelIdProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoGenerarSaldos.add(jLabelidProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoGenerarSaldos.add(jLabelid_empresaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoGenerarSaldos.add(jButtonid_empresaProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoGenerarSaldos.add(jButtonid_empresaProcesoGenerarSaldosUpdate, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoGenerarSaldos.add(jComboBoxid_empresaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoGenerarSaldos.add(jLabelid_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoGenerarSaldos.add(jButtonid_sucursalProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoGenerarSaldos.add(jButtonid_sucursalProcesoGenerarSaldosUpdate, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoGenerarSaldos.add(jComboBoxid_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoGenerarSaldos.add(jLabelid_ejercicioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoGenerarSaldos.add(jButtonid_ejercicioProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoGenerarSaldos.add(jButtonid_ejercicioProcesoGenerarSaldosUpdate, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoGenerarSaldos.add(jComboBoxid_ejercicioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoProcesoGenerarSaldos.add(jLabelid_periodoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoGenerarSaldos.add(jButtonid_periodoProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoGenerarSaldos.add(jButtonid_periodoProcesoGenerarSaldosUpdate, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoProcesoGenerarSaldos.add(jComboBoxid_periodoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalProcesoGenerarSaldos.add(jLabelnombre_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalProcesoGenerarSaldos.add(jButtonnombre_sucursalProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalProcesoGenerarSaldos.add(jscrollPanenombre_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.add(jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.add(jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 3;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.add(jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.add(jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteProcesoGenerarSaldos.add(jLabelnumero_comprobanteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteProcesoGenerarSaldos.add(jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteProcesoGenerarSaldos.add(jTextFieldnumero_comprobanteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoGenerarSaldos.add(jLabelfechaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoGenerarSaldos.add(jButtonfechaProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoGenerarSaldos.add(jDateChooserfechaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaProcesoGenerarSaldos.add(jLabelnombre_bodegaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaProcesoGenerarSaldos.add(jButtonnombre_bodegaProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaProcesoGenerarSaldos.add(jscrollPanenombre_bodegaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProcesoGenerarSaldos.add(jLabelnombre_productoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProcesoGenerarSaldos.add(jButtonnombre_productoProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProcesoGenerarSaldos.add(jscrollPanenombre_productoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProcesoGenerarSaldos.add(jLabelcantidadProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProcesoGenerarSaldos.add(jButtoncantidadProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProcesoGenerarSaldos.add(jTextFieldcantidadProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioProcesoGenerarSaldos.add(jLabelcosto_unitarioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioProcesoGenerarSaldos.add(jButtoncosto_unitarioProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioProcesoGenerarSaldos.add(jTextFieldcosto_unitarioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProcesoGenerarSaldos.add(jLabelcosto_totalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProcesoGenerarSaldos.add(jButtoncosto_totalProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProcesoGenerarSaldos.add(jTextFieldcosto_totalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodega_enviarProcesoGenerarSaldos.add(jLabelnombre_bodega_enviarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodega_enviarProcesoGenerarSaldos.add(jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodega_enviarProcesoGenerarSaldos.add(jscrollPanenombre_bodega_enviarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalProcesoGenerarSaldos.add(jLabeltotalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 2;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalProcesoGenerarSaldos.add(jButtontotalProcesoGenerarSaldosBusqueda, this.gridBagConstraintsProcesoGenerarSaldos);
	}

	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalProcesoGenerarSaldos.add(jTextFieldtotalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelidProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelnombre_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelnumero_comprobanteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelfechaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelnombre_bodegaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelnombre_productoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelcantidadProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelcosto_unitarioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelcosto_totalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPanelnombre_bodega_enviarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGenerarSaldos.add(this.jPaneltotalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposProcesoGenerarSaldos % 2==0) {
		iXPanelCamposProcesoGenerarSaldos=0;
		iYPanelCamposProcesoGenerarSaldos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposOcultosProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposOcultosProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoGenerarSaldos.add(this.jPanelid_empresaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposOcultosProcesoGenerarSaldos % 2==0) {
		iXPanelCamposOcultosProcesoGenerarSaldos=0;
		iYPanelCamposOcultosProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposOcultosProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposOcultosProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoGenerarSaldos.add(this.jPanelid_sucursalProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposOcultosProcesoGenerarSaldos % 2==0) {
		iXPanelCamposOcultosProcesoGenerarSaldos=0;
		iYPanelCamposOcultosProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposOcultosProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposOcultosProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoGenerarSaldos.add(this.jPanelid_ejercicioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposOcultosProcesoGenerarSaldos % 2==0) {
		iXPanelCamposOcultosProcesoGenerarSaldos=0;
		iYPanelCamposOcultosProcesoGenerarSaldos++;
	}
	this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGenerarSaldos.gridy = iYPanelCamposOcultosProcesoGenerarSaldos;
	this.gridBagConstraintsProcesoGenerarSaldos.gridx = iXPanelCamposOcultosProcesoGenerarSaldos++;
	this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGenerarSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoGenerarSaldos.add(this.jPanelid_periodoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);



	if(iXPanelCamposOcultosProcesoGenerarSaldos % 2==0) {
		iXPanelCamposOcultosProcesoGenerarSaldos=0;
		iYPanelCamposOcultosProcesoGenerarSaldos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoGenerarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoGenerarSaldos.setLayout(gridaBagLayoutAccionesProcesoGenerarSaldos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoGenerarSaldos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoGenerarSaldos.setLayout(gridaBagLayoutAccionesFormularioProcesoGenerarSaldos);
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoGenerarSaldos.add(this.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonModificarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);							

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonEliminarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonActualizarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonGuardarCambiosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);	
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonCancelarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGenerarSaldos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoGenerarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =0;
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGenerarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoGenerarSaldos = new ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Generar Saldos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Generar Saldos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Generar Saldos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoGenerarSaldosModel procesogenerarsaldosModel=new ProcesoGenerarSaldosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoGenerarSaldosModel.ProcesoGenerarSaldosFocusTraversalPolicy procesogenerarsaldosFocusTraversalPolicy = procesogenerarsaldosModel.new ProcesoGenerarSaldosFocusTraversalPolicy(this);
			
			//procesogenerarsaldosFocusTraversalPolicy.setprocesogenerarsaldosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesogenerarsaldosModel);
			
			
			this.jContentPaneDetalleProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoGenerarSaldos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoGenerarSaldos.setLayout(gridaBagLayoutDetalleProcesoGenerarSaldos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGenerarSaldos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoGenerarSaldos.add(jTtoolBarDetalleProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos=   new JScrollPane(jContentPaneDetalleProcesoGenerarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoGenerarSaldos.add(jPanelCamposProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);
			
			
			
			
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
						//&& procesogenerarsaldosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoGenerarSaldos= new GridBagConstraints();
						this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
						this.jContentPaneDetalleProcesoGenerarSaldos.add(this.jTabbedPaneRelacionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoGenerarSaldos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoGenerarSaldos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
					this.gridBagConstraintsProcesoGenerarSaldos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoGenerarSaldos.add(jPanelCamposOcultosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);
				
					this.jPanelCamposOcultosProcesoGenerarSaldos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	        this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoGenerarSaldos.add(this.jPanelAccionesFormularioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);							
			
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoGenerarSaldos.add(this.jPanelAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoGenerarSaldos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos=   new JScrollPane(this.jPanelCamposProcesoGenerarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoGenerarSaldos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoGenerarSaldos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoGenerarSaldos;
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
