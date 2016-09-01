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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.GastoDepreciacionCentroCostoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class GastoDepreciacionCentroCostoDetalleFormJInternalFrame extends GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGastoDepreciacionCentroCosto;
	
	protected JMenuBar jmenuBarDetalleGastoDepreciacionCentroCosto;
	
	protected JMenu jmenuDetalleGastoDepreciacionCentroCosto;
	protected JMenu jmenuDetalleArchivoGastoDepreciacionCentroCosto;
	protected JMenu jmenuDetalleAccionesGastoDepreciacionCentroCosto;
	protected JMenu jmenuDetalleDatosGastoDepreciacionCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoDepreciacionCentroCosto;	
	protected GridBagConstraints gridBagConstraintsGastoDepreciacionCentroCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleGastoDepreciacionCentroCosto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public GastoDepreciacionCentroCostoLogic gastodepreciacioncentrocostoLogic;
	
	public JScrollPane jScrollPanelDatosGastoDepreciacionCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionGastoDepreciacionCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralGastoDepreciacionCentroCosto;
	
	protected JPanel jPanelCamposGastoDepreciacionCentroCosto;    
	protected JPanel jPanelCamposOcultosGastoDepreciacionCentroCosto;    	
	protected JPanel jPanelAccionesGastoDepreciacionCentroCosto;
	protected JPanel jPanelAccionesFormularioGastoDepreciacionCentroCosto;
    
	
	
	protected Integer iXPanelCamposGastoDepreciacionCentroCosto=0;
	protected Integer iYPanelCamposGastoDepreciacionCentroCosto=0;
	
	protected Integer iXPanelCamposOcultosGastoDepreciacionCentroCosto=0;
	protected Integer iYPanelCamposOcultosGastoDepreciacionCentroCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGastoDepreciacionCentroCosto;
	public JButton jButtonModificarGastoDepreciacionCentroCosto;
	public JButton jButtonActualizarGastoDepreciacionCentroCosto;
    public JButton jButtonEliminarGastoDepreciacionCentroCosto;
	public JButton jButtonCancelarGastoDepreciacionCentroCosto;
    public JButton jButtonGuardarCambiosGastoDepreciacionCentroCosto;
	public JButton jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto;
	protected JButton jButtonCerrarGastoDepreciacionCentroCosto;
	
	
	protected JButton jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonModificarToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonActualizarToolBarGastoDepreciacionCentroCosto;
    protected JButton jButtonEliminarToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonCancelarToolBarGastoDepreciacionCentroCosto;
    protected JButton jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoDepreciacionCentroCosto;
	protected JButton jButtonCerrarToolBarGastoDepreciacionCentroCosto;
	
	protected JButton jButtonProcesarInformacionToolBarGastoDepreciacionCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemModificarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemActualizarGastoDepreciacionCentroCosto;
    protected JMenuItem jMenuItemEliminarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemCancelarGastoDepreciacionCentroCosto;
    protected JMenuItem jMenuItemGuardarCambiosGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemCerrarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarGastoDepreciacionCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoDepreciacionCentroCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGastoDepreciacionCentroCosto;
	public JLabel jLabelIdGastoDepreciacionCentroCosto;
	public JLabel jLabelidGastoDepreciacionCentroCosto;
	public JButton jButtonidGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeGastoDepreciacionCentroCosto;
	public JLabel jLabelporcentajeGastoDepreciacionCentroCosto;
	public JTextField jTextFieldporcentajeGastoDepreciacionCentroCosto;
	public JButton jButtonporcentajeGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGastoDepreciacionCentroCosto;
	public JLabel jLabelid_empresaGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGastoDepreciacionCentroCosto;
	public JButton jButtonid_empresaGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_empresaGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empresaGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalGastoDepreciacionCentroCosto;
	public JLabel jLabelid_sucursalGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalGastoDepreciacionCentroCosto;
	public JButton jButtonid_sucursalGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_sucursalGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoGastoDepreciacionCentroCosto;
	public JLabel jLabelid_centro_costoGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoGastoDepreciacionCentroCosto;
	public JButton jButtonid_centro_costoGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoGastoDepreciacionCentroCostoArbol= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto;
	public JLabel jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto;
	public JButton jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableGastoDepreciacionCentroCosto;
	public JLabel jLabelid_cuenta_contableGastoDepreciacionCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto;
	public JButton jButtonid_cuenta_contableGastoDepreciacionCentroCosto= new JButtonMe();
	public JButton jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGastoDepreciacionCentroCosto;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGastoDepreciacionCentroCosto=new JPanel();
				this.jPanelAccionesFormularioGastoDepreciacionCentroCosto=new JPanel();
				this.jmenuBarDetalleGastoDepreciacionCentroCosto=new JMenuBar();
				this.jTtoolBarDetalleGastoDepreciacionCentroCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionCentroCostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoDepreciacionCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGastoDepreciacionCentroCosto() {
		return this.jButtonActualizarToolBarGastoDepreciacionCentroCosto;
	}
	
	public JButton getjButtonEliminarToolBarGastoDepreciacionCentroCosto() {
		return this.jButtonEliminarToolBarGastoDepreciacionCentroCosto;
	}
	
	public JButton getjButtonCancelarToolBarGastoDepreciacionCentroCosto() {
		return this.jButtonCancelarToolBarGastoDepreciacionCentroCosto;
	}		
	
	public JButton getjButtonProcesarInformacionGastoDepreciacionCentroCosto() {
		return this.jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoDepreciacionCentroCosto)	{
		this.jButtonProcesarInformacionGastoDepreciacionCentroCosto = jButtonProcesarInformacionGastoDepreciacionCentroCosto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposRelacionesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto = jComboBoxTiposRelacionesGastoDepreciacionCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposAccionesGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto = jComboBoxTiposAccionesGastoDepreciacionCentroCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto() {
		return this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto(
			JComboBox jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto) {
		this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto = jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		
		this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoDepreciacionCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Depreciacion Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
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
	
		GastoDepreciacionCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGastoDepreciacionCentroCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGastoDepreciacionCentroCosto=new JButtonMe();
				this.jButtonModificarToolBarGastoDepreciacionCentroCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto,
							"actualizar","actualizar","Actualizar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto,
							"eliminar","eliminar","Eliminar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto,
							"cancelar","cancelar","Cancelar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGastoDepreciacionCentroCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGastoDepreciacionCentroCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGastoDepreciacionCentroCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGastoDepreciacionCentroCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGastoDepreciacionCentroCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoDepreciacionCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoDepreciacionCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoDepreciacionCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGastoDepreciacionCentroCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGastoDepreciacionCentroCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGastoDepreciacionCentroCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGastoDepreciacionCentroCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGastoDepreciacionCentroCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGastoDepreciacionCentroCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGastoDepreciacionCentroCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGastoDepreciacionCentroCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGastoDepreciacionCentroCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGastoDepreciacionCentroCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGastoDepreciacionCentroCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGastoDepreciacionCentroCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoDepreciacionCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoDepreciacionCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoDepreciacionCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGastoDepreciacionCentroCosto.add(this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto);
		
		this.jmenuDetalleAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemActualizarGastoDepreciacionCentroCosto);
		this.jmenuDetalleAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemEliminarGastoDepreciacionCentroCosto);
		this.jmenuDetalleAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemCancelarGastoDepreciacionCentroCosto);		
		
		//this.jmenuDetalleDatosGastoDepreciacionCentroCosto.add(this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto);				
		this.jmenuDetalleDatosGastoDepreciacionCentroCosto.add(this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto);				
				
		//this.jmenuDetalleAccionesGastoDepreciacionCentroCosto.add(this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGastoDepreciacionCentroCosto.add(this.jmenuDetalleArchivoGastoDepreciacionCentroCosto);		
		this.jmenuBarDetalleGastoDepreciacionCentroCosto.add(this.jmenuDetalleAccionesGastoDepreciacionCentroCosto);		
		this.jmenuBarDetalleGastoDepreciacionCentroCosto.add(this.jmenuDetalleDatosGastoDepreciacionCentroCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGastoDepreciacionCentroCosto);				
	}
	
	
	public void inicializarElementosCamposGastoDepreciacionCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGastoDepreciacionCentroCosto = new JLabelMe();
		jLabelIdGastoDepreciacionCentroCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGastoDepreciacionCentroCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGastoDepreciacionCentroCosto= new GridBagLayout();

		this.jPanelidGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);

		jLabelidGastoDepreciacionCentroCosto = new JLabel();
		jLabelidGastoDepreciacionCentroCosto.setText("Id");

		jLabelidGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelporcentajeGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeGastoDepreciacionCentroCosto.setToolTipText("Porcentaje");
		this.jLabelporcentajeGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelporcentajeGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jTextFieldporcentajeGastoDepreciacionCentroCosto= new JTextFieldMe();
		jTextFieldporcentajeGastoDepreciacionCentroCosto.setEnabled(false);
		jTextFieldporcentajeGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeGastoDepreciacionCentroCosto.setText("0.0");

		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGastoDepreciacionCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelid_empresaGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGastoDepreciacionCentroCosto.setToolTipText("Empresa");
		this.jLabelid_empresaGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelid_empresaGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jComboBoxid_empresaGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_empresaGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGastoDepreciacionCentroCosto.setEnabled(false);

		this.jButtonid_empresaGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGastoDepreciacionCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacionCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacionCentroCosto"));

		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate= new JButtonMe();
		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setText("U");
		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoDepreciacionCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoDepreciacionCentroCostoUpdate"));



					
		this.jLabelid_sucursalGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelid_sucursalGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalGastoDepreciacionCentroCosto.setToolTipText("Sucursal");
		this.jLabelid_sucursalGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelid_sucursalGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jComboBoxid_sucursalGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.setEnabled(false);

		this.jButtonid_sucursalGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalGastoDepreciacionCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoDepreciacionCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoDepreciacionCentroCosto"));

		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate= new JButtonMe();
		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setText("U");
		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoDepreciacionCentroCostoUpdate"));



					
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelid_centro_costoGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jComboBoxid_centro_costoGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoGastoDepreciacionCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGastoDepreciacionCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGastoDepreciacionCentroCosto"));

		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setText("U");
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGastoDepreciacionCentroCostoUpdate"));


		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol= new JButtonMe();
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setText("Arbol");
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGastoDepreciacionCentroCostoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGastoDepreciacionCentroCostoArbol"));



					
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoGastoDepreciacionCentroCosto"));

		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate"));



					
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto = new JLabelMe();
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto.setText(""+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.setToolTipText(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.setLayout(this.gridaBagLayoutGastoDepreciacionCentroCosto);


		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto= new JComboBoxMe();
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto= new JButtonMe();
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setText("Buscar");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGastoDepreciacionCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));

		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setText("U");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGastoDepreciacionCentroCostoBusqueda"));

		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setText("U");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGastoDepreciacionCentroCostoUpdate"));


		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol= new JButtonMe();
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setText("Arbol");
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGastoDepreciacionCentroCostoArbol"));



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
		//this.jInternalFrameDetalleGastoDepreciacionCentroCosto = new GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Gasto Depreciacion Centro Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoDepreciacionCentroCosto= new GridBagLayout();
		

		
		String sToolTipGastoDepreciacionCentroCosto="";
		sToolTipGastoDepreciacionCentroCosto=GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoDepreciacionCentroCosto+="(ActivosFijos.GastoDepreciacionCentroCosto)";
		}
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoDepreciacionCentroCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonModificarGastoDepreciacionCentroCosto = new JButtonMe();
        this.jButtonActualizarGastoDepreciacionCentroCosto = new JButtonMe();
        this.jButtonEliminarGastoDepreciacionCentroCosto = new JButtonMe();
        this.jButtonCancelarGastoDepreciacionCentroCosto = new JButtonMe();
        this.jButtonGuardarCambiosGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto = new JButtonMe();
		this.jButtonCerrarGastoDepreciacionCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosGastoDepreciacionCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto = new JScrollPane();
				
		
		
		this.jPanelCamposGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Depreciacion Centro Costo";
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciacion Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoDepreciacionCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGastoDepreciacionCentroCosto.setName("jPanelCamposGastoDepreciacionCentroCosto"); 

		this.jPanelCamposOcultosGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGastoDepreciacionCentroCosto.setName("jPanelCamposOcultosGastoDepreciacionCentroCosto"); 

        this.jPanelAccionesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoDepreciacionCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesGastoDepreciacionCentroCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGastoDepreciacionCentroCosto.setText("Nuevo");
		this.jButtonModificarGastoDepreciacionCentroCosto.setText("Editar");
        this.jButtonActualizarGastoDepreciacionCentroCosto.setText("Actualizar");
        this.jButtonEliminarGastoDepreciacionCentroCosto.setText("Eliminar");
        this.jButtonCancelarGastoDepreciacionCentroCosto.setText("Cancelar");
        this.jButtonGuardarCambiosGastoDepreciacionCentroCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setText("Guardar");
		this.jButtonCerrarGastoDepreciacionCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoDepreciacionCentroCosto,"nuevo_button","Nuevo",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGastoDepreciacionCentroCosto,"modificar_button","Editar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGastoDepreciacionCentroCosto,"actualizar_button","Actualizar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGastoDepreciacionCentroCosto,"eliminar_button","Eliminar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGastoDepreciacionCentroCosto,"cancelar_button","Cancelar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGastoDepreciacionCentroCosto,"guardarcambios_button","Guardar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto,"guardarcambiostabla_button","Guardar",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoDepreciacionCentroCosto,"cerrar_button","Salir",this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGastoDepreciacionCentroCosto.setToolTipText("Nuevo"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGastoDepreciacionCentroCosto.setToolTipText("Editar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGastoDepreciacionCentroCosto.setToolTipText("Actualizar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGastoDepreciacionCentroCosto.setToolTipText("Eliminar)"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGastoDepreciacionCentroCosto.setToolTipText("Cancelar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGastoDepreciacionCentroCosto.setToolTipText("Guardar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setToolTipText("Guardar"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoDepreciacionCentroCosto.setToolTipText("Salir"+" "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoDepreciacionCentroCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonActualizarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGastoDepreciacionCentroCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonEliminarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGastoDepreciacionCentroCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCancelarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGastoDepreciacionCentroCosto"));
		
		//CERRAR		
		sMapKey = "CerrarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCerrarGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoDepreciacionCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoDepreciacionCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoDepreciacionCentroCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto.setToolTipText("Nuevo GastoDepreciacionCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto.setToolTipText("Sin Cerrar Ventana GastoDepreciacionCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGastoDepreciacionCentroCosto = new JLabelMe();
		
		this.jLabelAccionesGastoDepreciacionCentroCosto.setText("Acciones");		
		this.jLabelAccionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGastoDepreciacionCentroCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGastoDepreciacionCentroCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGastoDepreciacionCentroCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGastoDepreciacionCentroCosto = new GridBagLayout();
		
		this.jPanelCamposGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutCamposGastoDepreciacionCentroCosto);
		this.jPanelCamposOcultosGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutCamposOcultosGastoDepreciacionCentroCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGastoDepreciacionCentroCosto.add(jLabelIdGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGastoDepreciacionCentroCosto.add(jLabelidGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGastoDepreciacionCentroCosto.add(jLabelid_empresaGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoDepreciacionCentroCosto.add(jButtonid_empresaGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 3;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoDepreciacionCentroCosto.add(jButtonid_empresaGastoDepreciacionCentroCostoUpdate, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGastoDepreciacionCentroCosto.add(jComboBoxid_empresaGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalGastoDepreciacionCentroCosto.add(jLabelid_sucursalGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGastoDepreciacionCentroCosto.add(jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 3;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGastoDepreciacionCentroCosto.add(jButtonid_sucursalGastoDepreciacionCentroCostoUpdate, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalGastoDepreciacionCentroCosto.add(jComboBoxid_sucursalGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jLabelid_centro_costoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jButtonid_centro_costoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 3;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jButtonid_centro_costoGastoDepreciacionCentroCostoArbol, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 4;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 5;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoGastoDepreciacionCentroCosto.add(jComboBoxid_centro_costoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.add(jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.add(jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 3;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.add(jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.add(jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jLabelid_cuenta_contableGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jButtonid_cuenta_contableGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 3;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 4;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 5;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.add(jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeGastoDepreciacionCentroCosto.add(jLabelporcentajeGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 2;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeGastoDepreciacionCentroCosto.add(jButtonporcentajeGastoDepreciacionCentroCostoBusqueda, this.gridBagConstraintsGastoDepreciacionCentroCosto);
	}

	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 1;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeGastoDepreciacionCentroCosto.add(jTextFieldporcentajeGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacionCentroCosto.add(this.jPanelidGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposGastoDepreciacionCentroCosto=0;
		iYPanelCamposGastoDepreciacionCentroCosto++;
	}
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacionCentroCosto.add(this.jPanelid_centro_costoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposGastoDepreciacionCentroCosto=0;
		iYPanelCamposGastoDepreciacionCentroCosto++;
	}
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacionCentroCosto.add(this.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposGastoDepreciacionCentroCosto=0;
		iYPanelCamposGastoDepreciacionCentroCosto++;
	}
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacionCentroCosto.add(this.jPanelid_cuenta_contableGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposGastoDepreciacionCentroCosto=0;
		iYPanelCamposGastoDepreciacionCentroCosto++;
	}
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoDepreciacionCentroCosto.add(this.jPanelporcentajeGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposGastoDepreciacionCentroCosto=0;
		iYPanelCamposGastoDepreciacionCentroCosto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposOcultosGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposOcultosGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoDepreciacionCentroCosto.add(this.jPanelid_empresaGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposOcultosGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposOcultosGastoDepreciacionCentroCosto=0;
		iYPanelCamposOcultosGastoDepreciacionCentroCosto++;
	}
	this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iYPanelCamposOcultosGastoDepreciacionCentroCosto;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iXPanelCamposOcultosGastoDepreciacionCentroCosto++;
	this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoDepreciacionCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoDepreciacionCentroCosto.add(this.jPanelid_sucursalGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);



	if(iXPanelCamposOcultosGastoDepreciacionCentroCosto % 1==0) {
		iXPanelCamposOcultosGastoDepreciacionCentroCosto=0;
		iYPanelCamposOcultosGastoDepreciacionCentroCosto++;
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
			
		GridBagLayout gridaBagLayoutAccionesGastoDepreciacionCentroCosto= new GridBagLayout();
		this.jPanelAccionesGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutAccionesGastoDepreciacionCentroCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGastoDepreciacionCentroCosto= new GridBagLayout();
		this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutAccionesFormularioGastoDepreciacionCentroCosto);
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.add(this.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.add(this.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.add(this.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoDepreciacionCentroCosto.add(this.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonModificarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);							

		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonEliminarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonActualizarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);


		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonGuardarCambiosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);	
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = 0;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesGastoDepreciacionCentroCosto.add(this.jButtonCancelarGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoDepreciacionCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoDepreciacionCentroCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;		
			//this.gridBagConstraintsGastoDepreciacionCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoDepreciacionCentroCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =0;
		this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoDepreciacionCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGastoDepreciacionCentroCosto = new GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Gasto Depreciacion Centro Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Gasto Depreciacion Centro Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Gasto Depreciacion Centro Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GastoDepreciacionCentroCostoModel gastodepreciacioncentrocostoModel=new GastoDepreciacionCentroCostoModel(this);
			
			//SI USARA CLASE INTERNA
			//GastoDepreciacionCentroCostoModel.GastoDepreciacionCentroCostoFocusTraversalPolicy gastodepreciacioncentrocostoFocusTraversalPolicy = gastodepreciacioncentrocostoModel.new GastoDepreciacionCentroCostoFocusTraversalPolicy(this);
			
			//gastodepreciacioncentrocostoFocusTraversalPolicy.setgastodepreciacioncentrocostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(gastodepreciacioncentrocostoModel);
			
			
			this.jContentPaneDetalleGastoDepreciacionCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGastoDepreciacionCentroCosto = new GridBagLayout();	
			this.jContentPaneDetalleGastoDepreciacionCentroCosto.setLayout(gridaBagLayoutDetalleGastoDepreciacionCentroCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoDepreciacionCentroCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
					
				
				this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(jTtoolBarDetalleGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);								
				
}
			
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto=   new JScrollPane(jContentPaneDetalleGastoDepreciacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	        
			this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(jPanelCamposGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);
			
			
			
			
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
						&& gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGastoDepreciacionCentroCosto= new GridBagConstraints();
						this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
						this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(this.jTabbedPaneRelacionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGastoDepreciacionCentroCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
					this.gridBagConstraintsGastoDepreciacionCentroCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
					
				
					this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(jPanelCamposOcultosGastoDepreciacionCentroCosto, gridBagConstraintsGastoDepreciacionCentroCosto);
				
					this.jPanelCamposOcultosGastoDepreciacionCentroCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(this.jPanelAccionesFormularioGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);							
			
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleGastoDepreciacionCentroCosto.add(this.jPanelAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGastoDepreciacionCentroCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto=   new JScrollPane(this.jPanelCamposGastoDepreciacionCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGastoDepreciacionCentroCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);			
			
			this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
			
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		
			
		this.gridBagConstraintsGastoDepreciacionCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacionCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoDepreciacionCentroCosto, this.gridBagConstraintsGastoDepreciacionCentroCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGastoDepreciacionCentroCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionGastoDepreciacionCentroCosto;
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
