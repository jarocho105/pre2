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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.CuentaContableTipoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class CuentaContableTipoDetalleFormJInternalFrame extends CuentaContableTipoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaContableTipo;
	
	protected JMenuBar jmenuBarDetalleCuentaContableTipo;
	
	protected JMenu jmenuDetalleCuentaContableTipo;
	protected JMenu jmenuDetalleArchivoCuentaContableTipo;
	protected JMenu jmenuDetalleAccionesCuentaContableTipo;
	protected JMenu jmenuDetalleDatosCuentaContableTipo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContableTipo;	
	protected GridBagConstraints gridBagConstraintsCuentaContableTipo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaContableTipoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaContableTipo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoCuentaContableTipoBeanSwingJInternalFrame tipocuentacontabletipoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentacontabletipo="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";
	
	public CuentaContableTipoSessionBean cuentacontabletipoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;	
	
	public CuentaContableTipoLogic cuentacontabletipoLogic;
	
	public JScrollPane jScrollPanelDatosCuentaContableTipo;
	public JScrollPane jScrollPanelDatosEdicionCuentaContableTipo;
	public JScrollPane jScrollPanelDatosGeneralCuentaContableTipo;
	
	protected JPanel jPanelCamposCuentaContableTipo;    
	protected JPanel jPanelCamposOcultosCuentaContableTipo;    	
	protected JPanel jPanelAccionesCuentaContableTipo;
	protected JPanel jPanelAccionesFormularioCuentaContableTipo;
    
	
	
	protected Integer iXPanelCamposCuentaContableTipo=0;
	protected Integer iYPanelCamposCuentaContableTipo=0;
	
	protected Integer iXPanelCamposOcultosCuentaContableTipo=0;
	protected Integer iYPanelCamposOcultosCuentaContableTipo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaContableTipo;
	public JButton jButtonModificarCuentaContableTipo;
	public JButton jButtonActualizarCuentaContableTipo;
    public JButton jButtonEliminarCuentaContableTipo;
	public JButton jButtonCancelarCuentaContableTipo;
    public JButton jButtonGuardarCambiosCuentaContableTipo;
	public JButton jButtonGuardarCambiosTablaCuentaContableTipo;
	protected JButton jButtonCerrarCuentaContableTipo;
	
	
	protected JButton jButtonProcesarInformacionCuentaContableTipo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaContableTipo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaContableTipo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaContableTipo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContableTipo;
	protected JButton jButtonModificarToolBarCuentaContableTipo;
	protected JButton jButtonActualizarToolBarCuentaContableTipo;
    protected JButton jButtonEliminarToolBarCuentaContableTipo;
	protected JButton jButtonCancelarToolBarCuentaContableTipo;
    protected JButton jButtonGuardarCambiosToolBarCuentaContableTipo;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaContableTipo;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContableTipo;
	protected JButton jButtonCerrarToolBarCuentaContableTipo;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaContableTipo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContableTipo;
	protected JMenuItem jMenuItemModificarCuentaContableTipo;
	protected JMenuItem jMenuItemActualizarCuentaContableTipo;
    protected JMenuItem jMenuItemEliminarCuentaContableTipo;
	protected JMenuItem jMenuItemCancelarCuentaContableTipo;
    protected JMenuItem jMenuItemGuardarCambiosCuentaContableTipo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContableTipo;
	protected JMenuItem jMenuItemCerrarCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContableTipo;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContableTipo;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContableTipo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContableTipo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContableTipo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaContableTipo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaContableTipo;
	public JLabel jLabelIdCuentaContableTipo;
	public JLabel jLabelidCuentaContableTipo;
	public JButton jButtonidCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCuentaContableTipo;
	public JLabel jLabelnombreCuentaContableTipo;
	public JTextArea jTextAreanombreCuentaContableTipo;
	public JScrollPane jscrollPanenombreCuentaContableTipo;
	public JButton jButtonnombreCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPaneldigito_verificadorCuentaContableTipo;
	public JLabel jLabeldigito_verificadorCuentaContableTipo;
	public JTextField jTextFielddigito_verificadorCuentaContableTipo;
	public JButton jButtondigito_verificadorCuentaContableTipoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaContableTipo;
	public JLabel jLabelid_empresaCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaContableTipo;
	public JButton jButtonid_empresaCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_empresaCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo;
	public JLabel jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo;
	public JButton jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioCuentaContableTipo;
	public JLabel jLabelid_tipo_producto_servicioCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioCuentaContableTipo;
	public JButton jButtonid_tipo_producto_servicioCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaCuentaContableTipo;
	public JLabel jLabelid_cuenta_contable_ventaCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaCuentaContableTipo;
	public JButton jButtonid_cuenta_contable_ventaCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentaContableTipoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoCuentaContableTipo;
	public JLabel jLabelid_cuenta_contable_descuentoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoCuentaContableTipo;
	public JButton jButtonid_cuenta_contable_descuentoCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionCuentaContableTipo;
	public JLabel jLabelid_cuenta_contable_devolucionCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionCuentaContableTipo;
	public JButton jButtonid_cuenta_contable_devolucionCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoCuentaContableTipo;
	public JLabel jLabelid_cuenta_contable_costoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoCuentaContableTipo;
	public JButton jButtonid_cuenta_contable_costoCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoCuentaContableTipoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaContableTipo;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaContableTipoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaContableTipo=new JPanel();
				this.jPanelAccionesFormularioCuentaContableTipo=new JPanel();
				this.jmenuBarDetalleCuentaContableTipo=new JMenuBar();
				this.jTtoolBarDetalleCuentaContableTipo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaContableTipoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaContableTipo() {
		return this.jButtonActualizarToolBarCuentaContableTipo;
	}
	
	public JButton getjButtonEliminarToolBarCuentaContableTipo() {
		return this.jButtonEliminarToolBarCuentaContableTipo;
	}
	
	public JButton getjButtonCancelarToolBarCuentaContableTipo() {
		return this.jButtonCancelarToolBarCuentaContableTipo;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaContableTipo() {
		return this.jButtonProcesarInformacionCuentaContableTipo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContableTipo)	{
		this.jButtonProcesarInformacionCuentaContableTipo = jButtonProcesarInformacionCuentaContableTipo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContableTipo() {
		return this.jComboBoxTiposAccionesCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContableTipo(
			JComboBox jComboBoxTiposRelacionesCuentaContableTipo) {
		this.jComboBoxTiposRelacionesCuentaContableTipo = jComboBoxTiposRelacionesCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesCuentaContableTipo) {
		this.jComboBoxTiposAccionesCuentaContableTipo = jComboBoxTiposAccionesCuentaContableTipo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaContableTipo() {
		return this.jComboBoxTiposAccionesFormularioCuentaContableTipo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesFormularioCuentaContableTipo) {
		this.jComboBoxTiposAccionesFormularioCuentaContableTipo = jComboBoxTiposAccionesFormularioCuentaContableTipo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		
		this.cuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontabletipoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContableTipoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable Tipo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaContableTipo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaContableTipo=new JButtonMe();
				this.jButtonModificarToolBarCuentaContableTipo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo,
							"actualizar","actualizar","Actualizar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo,
							"eliminar","eliminar","Eliminar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo,
							"cancelar","cancelar","Cancelar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaContableTipo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaContableTipo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaContableTipo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaContableTipo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaContableTipo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContableTipo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContableTipo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContableTipo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaContableTipo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaContableTipo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaContableTipo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaContableTipo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaContableTipo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaContableTipo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaContableTipo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaContableTipo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaContableTipo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaContableTipo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaContableTipo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaContableTipo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaContableTipo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContableTipo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContableTipo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaContableTipo.add(this.jMenuItemDetalleCerrarCuentaContableTipo);
		
		this.jmenuDetalleAccionesCuentaContableTipo.add(this.jMenuItemActualizarCuentaContableTipo);
		this.jmenuDetalleAccionesCuentaContableTipo.add(this.jMenuItemEliminarCuentaContableTipo);
		this.jmenuDetalleAccionesCuentaContableTipo.add(this.jMenuItemCancelarCuentaContableTipo);		
		
		//this.jmenuDetalleDatosCuentaContableTipo.add(this.jMenuItemDetalleAbrirOrderByCuentaContableTipo);				
		this.jmenuDetalleDatosCuentaContableTipo.add(this.jMenuItemDetalleMostarOcultarCuentaContableTipo);				
				
		//this.jmenuDetalleAccionesCuentaContableTipo.add(this.jMenuItemGuardarCambiosCuentaContableTipo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaContableTipo.add(this.jmenuDetalleArchivoCuentaContableTipo);		
		this.jmenuBarDetalleCuentaContableTipo.add(this.jmenuDetalleAccionesCuentaContableTipo);		
		this.jmenuBarDetalleCuentaContableTipo.add(this.jmenuDetalleDatosCuentaContableTipo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaContableTipo);				
	}
	
	
	public void inicializarElementosCamposCuentaContableTipo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaContableTipo = new JLabelMe();
		jLabelIdCuentaContableTipo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaContableTipo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaContableTipo= new GridBagLayout();

		this.jPanelidCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);

		jLabelidCuentaContableTipo = new JLabel();
		jLabelidCuentaContableTipo.setText("Id");

		jLabelidCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCuentaContableTipo = new JLabelMe();
		this.jLabelnombreCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCuentaContableTipo.setToolTipText("Nombre");
		this.jLabelnombreCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelnombreCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jTextAreanombreCuentaContableTipo= new JTextAreaMe();
		jTextAreanombreCuentaContableTipo.setEnabled(false);
		jTextAreanombreCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContableTipo.setLineWrap(true);
		jTextAreanombreCuentaContableTipo.setWrapStyleWord(true);
		jTextAreanombreCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCuentaContableTipo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCuentaContableTipo = new JScrollPane(jTextAreanombreCuentaContableTipo);
		jscrollPanenombreCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonnombreCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCuentaContableTipoBusqueda.setText("U");
		this.jButtonnombreCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCuentaContableTipoBusqueda.setVisible(false);		}


					
		this.jLabeldigito_verificadorCuentaContableTipo = new JLabelMe();
		this.jLabeldigito_verificadorCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR+" : *");
		this.jLabeldigito_verificadorCuentaContableTipo.setToolTipText("Digito Verificador");
		this.jLabeldigito_verificadorCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldigito_verificadorCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldigito_verificadorCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldigito_verificadorCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldigito_verificadorCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldigito_verificadorCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPaneldigito_verificadorCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jTextFielddigito_verificadorCuentaContableTipo= new JTextFieldMe();
		jTextFielddigito_verificadorCuentaContableTipo.setEnabled(false);
		jTextFielddigito_verificadorCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_verificadorCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_verificadorCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddigito_verificadorCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddigito_verificadorCuentaContableTipo.setText("0");

		this.jButtondigito_verificadorCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondigito_verificadorCuentaContableTipoBusqueda.setText("U");
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondigito_verificadorCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddigito_verificadorCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddigito_verificadorCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"digito_verificadorCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondigito_verificadorCuentaContableTipoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaContableTipo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaContableTipo = new JLabelMe();
		this.jLabelid_empresaCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaContableTipo.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_empresaCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_empresaCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_empresaCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaContableTipo.setEnabled(false);

		this.jButtonid_empresaCuentaContableTipo= new JButtonMe();
		this.jButtonid_empresaCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContableTipo.setText("Buscar");
		this.jButtonid_empresaCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContableTipo"));

		this.jButtonid_empresaCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_empresaCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaContableTipoUpdate.setText("U");
		this.jButtonid_empresaCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContableTipoUpdate"));



					
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo = new JLabelMe();
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO+" : *");
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo.setToolTipText("T. Cuenta Contable Tipo");
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo= new JButtonMe();
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setText("Buscar");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_contable_tipoCuentaContableTipo"));

		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setText("U");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate"));



					
		this.jLabelid_tipo_producto_servicioCuentaContableTipo = new JLabelMe();
		this.jLabelid_tipo_producto_servicioCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioCuentaContableTipo.setToolTipText("T. Producto Servicio");
		this.jLabelid_tipo_producto_servicioCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_tipo_producto_servicioCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioCuentaContableTipo= new JButtonMe();
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setText("Buscar");
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioCuentaContableTipo"));

		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioCuentaContableTipoUpdate"));



					
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo.setToolTipText("C. Contable Venta");
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_cuenta_contable_ventaCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaCuentaContableTipo= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentaContableTipo"));

		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentaContableTipoUpdate"));


		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentaContableTipoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentaContableTipoArbol"));



					
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo.setToolTipText("C. Contable Descuento");
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_descuentoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentaContableTipo"));

		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentaContableTipoUpdate"));


		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentaContableTipoArbol"));



					
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo.setToolTipText("C. Contable Devolucion");
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentaContableTipo"));

		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentaContableTipoUpdate"));


		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentaContableTipoArbol"));



					
		this.jLabelid_cuenta_contable_costoCuentaContableTipo = new JLabelMe();
		this.jLabelid_cuenta_contable_costoCuentaContableTipo.setText(""+CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" : *");
		this.jLabelid_cuenta_contable_costoCuentaContableTipo.setToolTipText("C. Contable Costo");
		this.jLabelid_cuenta_contable_costoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoCuentaContableTipo.setToolTipText(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoCuentaContableTipo.setLayout(this.gridaBagLayoutCuentaContableTipo);


		jComboBoxid_cuenta_contable_costoCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costoCuentaContableTipo= new JButtonMe();
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setText("Buscar");
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoCuentaContableTipo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoCuentaContableTipo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoCuentaContableTipo"));

		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoCuentaContableTipoBusqueda"));

		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoCuentaContableTipoUpdate"));


		jButtonid_cuenta_contable_costoCuentaContableTipoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoCuentaContableTipoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoCuentaContableTipoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoCuentaContableTipoArbol"));



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
		//this.jInternalFrameDetalleCuentaContableTipo = new CuentaContableTipoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Contable Tipo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContableTipo= new GridBagLayout();
		

		
		String sToolTipCuentaContableTipo="";
		sToolTipCuentaContableTipo=CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContableTipo+="(Facturacion.CuentaContableTipo)";
		}
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContableTipo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaContableTipo = new JButtonMe();
		this.jButtonModificarCuentaContableTipo = new JButtonMe();
        this.jButtonActualizarCuentaContableTipo = new JButtonMe();
        this.jButtonEliminarCuentaContableTipo = new JButtonMe();
        this.jButtonCancelarCuentaContableTipo = new JButtonMe();
        this.jButtonGuardarCambiosCuentaContableTipo = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarCuentaContableTipo = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContableTipo = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaContableTipo = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaContableTipo = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable Tipo";
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaContableTipo.setName("jPanelCamposCuentaContableTipo"); 

		this.jPanelCamposOcultosCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaContableTipo.setName("jPanelCamposOcultosCuentaContableTipo"); 

        this.jPanelAccionesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContableTipo.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaContableTipo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaContableTipo.setText("Nuevo");
		this.jButtonModificarCuentaContableTipo.setText("Editar");
        this.jButtonActualizarCuentaContableTipo.setText("Actualizar");
        this.jButtonEliminarCuentaContableTipo.setText("Eliminar");
        this.jButtonCancelarCuentaContableTipo.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaContableTipo.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaContableTipo.setText("Guardar");
		this.jButtonCerrarCuentaContableTipo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContableTipo,"nuevo_button","Nuevo",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaContableTipo,"modificar_button","Editar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaContableTipo,"actualizar_button","Actualizar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaContableTipo,"eliminar_button","Eliminar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaContableTipo,"cancelar_button","Cancelar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaContableTipo,"guardarcambios_button","Guardar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContableTipo,"guardarcambiostabla_button","Guardar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContableTipo,"cerrar_button","Salir",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaContableTipo.setToolTipText("Nuevo"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaContableTipo.setToolTipText("Editar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaContableTipo.setToolTipText("Actualizar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaContableTipo.setToolTipText("Eliminar)"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaContableTipo.setToolTipText("Cancelar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaContableTipo.setToolTipText("Guardar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaContableTipo.setToolTipText("Guardar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContableTipo.setToolTipText("Salir"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContableTipo";
		inputMap = this.jButtonNuevoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContableTipo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaContableTipo";
		inputMap = this.jButtonActualizarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaContableTipo"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaContableTipo";
		inputMap = this.jButtonEliminarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaContableTipo"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaContableTipo";
		inputMap = this.jButtonCancelarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaContableTipo"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaContableTipo";
		inputMap = this.jButtonCerrarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContableTipo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContableTipo";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContableTipo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaContableTipo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaContableTipo.setToolTipText("Nuevo CuentaContableTipo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaContableTipo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaContableTipo.setToolTipText("Sin Cerrar Ventana CuentaContableTipo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaContableTipo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaContableTipo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContableTipo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaContableTipo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaContableTipo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaContableTipo = new JLabelMe();
		
		this.jLabelAccionesCuentaContableTipo.setText("Acciones");		
		this.jLabelAccionesCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaContableTipo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaContableTipo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaContableTipo=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaContableTipo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContableTipo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContableTipo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaContableTipo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaContableTipo = new GridBagLayout();
		
		this.jPanelCamposCuentaContableTipo.setLayout(gridaBagLayoutCamposCuentaContableTipo);
		this.jPanelCamposOcultosCuentaContableTipo.setLayout(gridaBagLayoutCamposOcultosCuentaContableTipo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaContableTipo.add(jLabelIdCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaContableTipo.add(jLabelidCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaContableTipo.add(jLabelid_empresaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaContableTipo.add(jButtonid_empresaCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 3;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaContableTipo.add(jButtonid_empresaCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaContableTipo.add(jComboBoxid_empresaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCuentaContableTipo.add(jLabelnombreCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCuentaContableTipo.add(jButtonnombreCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCuentaContableTipo.add(jscrollPanenombreCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldigito_verificadorCuentaContableTipo.add(jLabeldigito_verificadorCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldigito_verificadorCuentaContableTipo.add(jButtondigito_verificadorCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldigito_verificadorCuentaContableTipo.add(jTextFielddigito_verificadorCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.add(jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.add(jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 3;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.add(jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.add(jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioCuentaContableTipo.add(jLabelid_tipo_producto_servicioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioCuentaContableTipo.add(jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 3;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioCuentaContableTipo.add(jButtonid_tipo_producto_servicioCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioCuentaContableTipo.add(jComboBoxid_tipo_producto_servicioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jLabelid_cuenta_contable_ventaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 2;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jButtonid_cuenta_contable_ventaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 3;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jButtonid_cuenta_contable_ventaCuentaContableTipoArbol, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 4;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 5;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaCuentaContableTipo.add(jComboBoxid_cuenta_contable_ventaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jLabelid_cuenta_contable_descuentoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 2;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jButtonid_cuenta_contable_descuentoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 3;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 4;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 5;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoCuentaContableTipo.add(jComboBoxid_cuenta_contable_descuentoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jLabelid_cuenta_contable_devolucionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 2;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jButtonid_cuenta_contable_devolucionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 3;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 4;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 5;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionCuentaContableTipo.add(jComboBoxid_cuenta_contable_devolucionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jLabelid_cuenta_contable_costoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 2;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jButtonid_cuenta_contable_costoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 3;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jButtonid_cuenta_contable_costoCuentaContableTipoArbol, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 4;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda, this.gridBagConstraintsCuentaContableTipo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 5;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jButtonid_cuenta_contable_costoCuentaContableTipoUpdate, this.gridBagConstraintsCuentaContableTipo);
	}

	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoCuentaContableTipo.add(jComboBoxid_cuenta_contable_costoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelidCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelnombreCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPaneldigito_verificadorCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_tipo_producto_servicioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_cuenta_contable_ventaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_cuenta_contable_descuentoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_cuenta_contable_devolucionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContableTipo.add(this.jPanelid_cuenta_contable_costoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposCuentaContableTipo % 1==0) {
		iXPanelCamposCuentaContableTipo=0;
		iYPanelCamposCuentaContableTipo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContableTipo.gridy = iYPanelCamposOcultosCuentaContableTipo;
	this.gridBagConstraintsCuentaContableTipo.gridx = iXPanelCamposOcultosCuentaContableTipo++;
	this.gridBagConstraintsCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaContableTipo.add(this.jPanelid_empresaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);



	if(iXPanelCamposOcultosCuentaContableTipo % 1==0) {
		iXPanelCamposOcultosCuentaContableTipo=0;
		iYPanelCamposOcultosCuentaContableTipo++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesCuentaContableTipo.setLayout(gridaBagLayoutAccionesCuentaContableTipo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaContableTipo.setLayout(gridaBagLayoutAccionesFormularioCuentaContableTipo);
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContableTipo.add(this.jComboBoxTiposAccionesFormularioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContableTipo.add(this.jCheckBoxPostAccionNuevoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContableTipo.add(this.jCheckBoxPostAccionSinCerrarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContableTipo.add(this.jCheckBoxPostAccionSinMensajeCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonModificarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);							

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonEliminarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonActualizarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);


		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonGuardarCambiosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);	
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsCuentaContableTipo.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonCancelarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContableTipo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;		
			//this.gridBagConstraintsCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContableTipo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContableTipo.gridx =0;
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContableTipo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaContableTipo = new CuentaContableTipoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Contable Tipo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Contable Tipo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Tipo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaContableTipoModel cuentacontabletipoModel=new CuentaContableTipoModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaContableTipoModel.CuentaContableTipoFocusTraversalPolicy cuentacontabletipoFocusTraversalPolicy = cuentacontabletipoModel.new CuentaContableTipoFocusTraversalPolicy(this);
			
			//cuentacontabletipoFocusTraversalPolicy.setcuentacontabletipoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentacontabletipoModel);
			
			
			this.jContentPaneDetalleCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaContableTipo = new GridBagLayout();	
			this.jContentPaneDetalleCuentaContableTipo.setLayout(gridaBagLayoutDetalleCuentaContableTipo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContableTipo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaContableTipo.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaContableTipo.add(jTtoolBarDetalleCuentaContableTipo, gridBagConstraintsCuentaContableTipo);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaContableTipo=   new JScrollPane(jContentPaneDetalleCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaContableTipo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	        
			this.jContentPaneDetalleCuentaContableTipo.add(jPanelCamposCuentaContableTipo, gridBagConstraintsCuentaContableTipo);
			
			
			
			
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
						&& cuentacontabletipoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaContableTipo= new GridBagConstraints();
						this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaContableTipo.gridx = 0;
						this.jContentPaneDetalleCuentaContableTipo.add(this.jTabbedPaneRelacionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaContableTipo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaContableTipo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
					this.gridBagConstraintsCuentaContableTipo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaContableTipo.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaContableTipo.add(jPanelCamposOcultosCuentaContableTipo, gridBagConstraintsCuentaContableTipo);
				
					this.jPanelCamposOcultosCuentaContableTipo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	        this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaContableTipo.add(this.jPanelAccionesFormularioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);							
			
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
	        this.gridBagConstraintsCuentaContableTipo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaContableTipo.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaContableTipo.add(this.jPanelAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaContableTipo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaContableTipo=   new JScrollPane(this.jPanelCamposCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaContableTipo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaContableTipo;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaContableTipo;
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
