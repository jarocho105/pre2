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
import com.bydan.erp.facturacion.util.HistorialFormaPagoConstantesFunciones;

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
public class HistorialFormaPagoDetalleFormJInternalFrame extends HistorialFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialFormaPago;
	
	protected JMenuBar jmenuBarDetalleHistorialFormaPago;
	
	protected JMenu jmenuDetalleHistorialFormaPago;
	protected JMenu jmenuDetalleArchivoHistorialFormaPago;
	protected JMenu jmenuDetalleAccionesHistorialFormaPago;
	protected JMenu jmenuDetalleDatosHistorialFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialFormaPago;	
	protected GridBagConstraints gridBagConstraintsHistorialFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialFormaPagoSessionBean historialformapagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public HistorialFormaPagoLogic historialformapagoLogic;
	
	public JScrollPane jScrollPanelDatosHistorialFormaPago;
	public JScrollPane jScrollPanelDatosEdicionHistorialFormaPago;
	public JScrollPane jScrollPanelDatosGeneralHistorialFormaPago;
	
	protected JPanel jPanelCamposHistorialFormaPago;    
	protected JPanel jPanelCamposOcultosHistorialFormaPago;    	
	protected JPanel jPanelAccionesHistorialFormaPago;
	protected JPanel jPanelAccionesFormularioHistorialFormaPago;
    
	
	
	protected Integer iXPanelCamposHistorialFormaPago=0;
	protected Integer iYPanelCamposHistorialFormaPago=0;
	
	protected Integer iXPanelCamposOcultosHistorialFormaPago=0;
	protected Integer iYPanelCamposOcultosHistorialFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialFormaPago;
	public JButton jButtonModificarHistorialFormaPago;
	public JButton jButtonActualizarHistorialFormaPago;
    public JButton jButtonEliminarHistorialFormaPago;
	public JButton jButtonCancelarHistorialFormaPago;
    public JButton jButtonGuardarCambiosHistorialFormaPago;
	public JButton jButtonGuardarCambiosTablaHistorialFormaPago;
	protected JButton jButtonCerrarHistorialFormaPago;
	
	
	protected JButton jButtonProcesarInformacionHistorialFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialFormaPago;
	protected JButton jButtonModificarToolBarHistorialFormaPago;
	protected JButton jButtonActualizarToolBarHistorialFormaPago;
    protected JButton jButtonEliminarToolBarHistorialFormaPago;
	protected JButton jButtonCancelarToolBarHistorialFormaPago;
    protected JButton jButtonGuardarCambiosToolBarHistorialFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialFormaPago;
	protected JButton jButtonCerrarToolBarHistorialFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialFormaPago;
	protected JMenuItem jMenuItemModificarHistorialFormaPago;
	protected JMenuItem jMenuItemActualizarHistorialFormaPago;
    protected JMenuItem jMenuItemEliminarHistorialFormaPago;
	protected JMenuItem jMenuItemCancelarHistorialFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosHistorialFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialFormaPago;
	protected JMenuItem jMenuItemCerrarHistorialFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarHistorialFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarHistorialFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialFormaPago;
	public JLabel jLabelIdHistorialFormaPago;
	public JLabel jLabelidHistorialFormaPago;
	public JButton jButtonidHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasHistorialFormaPago;
	public JLabel jLabelnumero_diasHistorialFormaPago;
	public JTextField jTextFieldnumero_diasHistorialFormaPago;
	public JButton jButtonnumero_diasHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalorHistorialFormaPago;
	public JLabel jLabelvalorHistorialFormaPago;
	public JTextField jTextFieldvalorHistorialFormaPago;
	public JButton jButtonvalorHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfechaHistorialFormaPago;
	public JLabel jLabelfechaHistorialFormaPago;
	//public JFormattedTextField jDateChooserfechaHistorialFormaPago;

	public JDateChooser jDateChooserfechaHistorialFormaPago;
	public JButton jButtonfechaHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeHistorialFormaPago;
	public JLabel jLabelporcentajeHistorialFormaPago;
	public JTextField jTextFieldporcentajeHistorialFormaPago;
	public JButton jButtonporcentajeHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_retencionHistorialFormaPago;
	public JLabel jLabelporcentaje_retencionHistorialFormaPago;
	public JTextField jTextFieldporcentaje_retencionHistorialFormaPago;
	public JButton jButtonporcentaje_retencionHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelbase_retencionHistorialFormaPago;
	public JLabel jLabelbase_retencionHistorialFormaPago;
	public JTextField jTextFieldbase_retencionHistorialFormaPago;
	public JButton jButtonbase_retencionHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionHistorialFormaPago;
	public JLabel jLabelnumero_retencionHistorialFormaPago;
	public JTextField jTextFieldnumero_retencionHistorialFormaPago;
	public JButton jButtonnumero_retencionHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_retencionHistorialFormaPago;
	public JLabel jLabelnombre_retencionHistorialFormaPago;
	public JTextArea jTextAreanombre_retencionHistorialFormaPago;
	public JScrollPane jscrollPanenombre_retencionHistorialFormaPago;
	public JButton jButtonnombre_retencionHistorialFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHistorialFormaPago;
	public JLabel jLabelid_empresaHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHistorialFormaPago;
	public JButton jButtonid_empresaHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_empresaHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalHistorialFormaPago;
	public JLabel jLabelid_sucursalHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalHistorialFormaPago;
	public JButton jButtonid_sucursalHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioHistorialFormaPago;
	public JLabel jLabelid_ejercicioHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioHistorialFormaPago;
	public JButton jButtonid_ejercicioHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_ejercicioHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoHistorialFormaPago;
	public JLabel jLabelid_periodoHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoHistorialFormaPago;
	public JButton jButtonid_periodoHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_periodoHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_periodoHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaHistorialFormaPago;
	public JLabel jLabelid_facturaHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaHistorialFormaPago;
	public JButton jButtonid_facturaHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_facturaHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoHistorialFormaPago;
	public JLabel jLabelid_tipo_forma_pagoHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoHistorialFormaPago;
	public JButton jButtonid_tipo_forma_pagoHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableHistorialFormaPago;
	public JLabel jLabelid_cuenta_contableHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableHistorialFormaPago;
	public JButton jButtonid_cuenta_contableHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableHistorialFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableHistorialFormaPagoArbol= new JButtonMe();

	public JPanel jPanelid_anioHistorialFormaPago;
	public JLabel jLabelid_anioHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioHistorialFormaPago;
	public JButton jButtonid_anioHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_anioHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_anioHistorialFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesHistorialFormaPago;
	public JLabel jLabelid_mesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesHistorialFormaPago;
	public JButton jButtonid_mesHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_mesHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_mesHistorialFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialFormaPago;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HistorialFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialFormaPago=new JPanel();
				this.jPanelAccionesFormularioHistorialFormaPago=new JPanel();
				this.jmenuBarDetalleHistorialFormaPago=new JMenuBar();
				this.jTtoolBarDetalleHistorialFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialFormaPago() {
		return this.jButtonActualizarToolBarHistorialFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarHistorialFormaPago() {
		return this.jButtonEliminarToolBarHistorialFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarHistorialFormaPago() {
		return this.jButtonCancelarToolBarHistorialFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialFormaPago() {
		return this.jButtonProcesarInformacionHistorialFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialFormaPago)	{
		this.jButtonProcesarInformacionHistorialFormaPago = jButtonProcesarInformacionHistorialFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialFormaPago() {
		return this.jComboBoxTiposAccionesHistorialFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialFormaPago(
			JComboBox jComboBoxTiposRelacionesHistorialFormaPago) {
		this.jComboBoxTiposRelacionesHistorialFormaPago = jComboBoxTiposRelacionesHistorialFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialFormaPago(
			JComboBox jComboBoxTiposAccionesHistorialFormaPago) {
		this.jComboBoxTiposAccionesHistorialFormaPago = jComboBoxTiposAccionesHistorialFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialFormaPago() {
		return this.jComboBoxTiposAccionesFormularioHistorialFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioHistorialFormaPago) {
		this.jComboBoxTiposAccionesFormularioHistorialFormaPago = jComboBoxTiposAccionesFormularioHistorialFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		
		this.historialformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialFormaPago=new JButtonMe();
				this.jButtonModificarToolBarHistorialFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago,
							"actualizar","actualizar","Actualizar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago,
							"eliminar","eliminar","Eliminar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago,
							"cancelar","cancelar","Cancelar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialFormaPago.add(this.jMenuItemDetalleCerrarHistorialFormaPago);
		
		this.jmenuDetalleAccionesHistorialFormaPago.add(this.jMenuItemActualizarHistorialFormaPago);
		this.jmenuDetalleAccionesHistorialFormaPago.add(this.jMenuItemEliminarHistorialFormaPago);
		this.jmenuDetalleAccionesHistorialFormaPago.add(this.jMenuItemCancelarHistorialFormaPago);		
		
		//this.jmenuDetalleDatosHistorialFormaPago.add(this.jMenuItemDetalleAbrirOrderByHistorialFormaPago);				
		this.jmenuDetalleDatosHistorialFormaPago.add(this.jMenuItemDetalleMostarOcultarHistorialFormaPago);				
				
		//this.jmenuDetalleAccionesHistorialFormaPago.add(this.jMenuItemGuardarCambiosHistorialFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialFormaPago.add(this.jmenuDetalleArchivoHistorialFormaPago);		
		this.jmenuBarDetalleHistorialFormaPago.add(this.jmenuDetalleAccionesHistorialFormaPago);		
		this.jmenuBarDetalleHistorialFormaPago.add(this.jmenuDetalleDatosHistorialFormaPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialFormaPago);				
	}
	
	
	public void inicializarElementosCamposHistorialFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialFormaPago = new JLabelMe();
		jLabelIdHistorialFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialFormaPago= new GridBagLayout();

		this.jPanelidHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);

		jLabelidHistorialFormaPago = new JLabel();
		jLabelidHistorialFormaPago.setText("Id");

		jLabelidHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_diasHistorialFormaPago = new JLabelMe();
		this.jLabelnumero_diasHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasHistorialFormaPago.setToolTipText("Numero Dias");
		this.jLabelnumero_diasHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelnumero_diasHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldnumero_diasHistorialFormaPago= new JTextFieldMe();
		jTextFieldnumero_diasHistorialFormaPago.setEnabled(false);
		jTextFieldnumero_diasHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasHistorialFormaPago.setText("0");

		this.jButtonnumero_diasHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasHistorialFormaPagoBusqueda.setText("U");
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalorHistorialFormaPago = new JLabelMe();
		this.jLabelvalorHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorHistorialFormaPago.setToolTipText("Valor");
		this.jLabelvalorHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelvalorHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldvalorHistorialFormaPago= new JTextFieldMe();
		jTextFieldvalorHistorialFormaPago.setEnabled(false);
		jTextFieldvalorHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorHistorialFormaPago.setText("0.0");

		this.jButtonvalorHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalorHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorHistorialFormaPagoBusqueda.setText("U");
		this.jButtonvalorHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfechaHistorialFormaPago = new JLabelMe();
		this.jLabelfechaHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaHistorialFormaPago.setToolTipText("Fecha");
		this.jLabelfechaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelfechaHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		//jFormattedTextFieldfechaHistorialFormaPago= new JFormattedTextFieldMe();

		jDateChooserfechaHistorialFormaPago= new JDateChooser();
		jDateChooserfechaHistorialFormaPago.setEnabled(false);
		jDateChooserfechaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaHistorialFormaPago.setDate(new Date());
		jDateChooserfechaHistorialFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaHistorialFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonfechaHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaHistorialFormaPagoBusqueda.setText("U");
		this.jButtonfechaHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeHistorialFormaPago = new JLabelMe();
		this.jLabelporcentajeHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeHistorialFormaPago.setToolTipText("Porcentaje");
		this.jLabelporcentajeHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelporcentajeHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldporcentajeHistorialFormaPago= new JTextFieldMe();
		jTextFieldporcentajeHistorialFormaPago.setEnabled(false);
		jTextFieldporcentajeHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeHistorialFormaPago.setText("0.0");

		this.jButtonporcentajeHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeHistorialFormaPagoBusqueda.setText("U");
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_retencionHistorialFormaPago = new JLabelMe();
		this.jLabelporcentaje_retencionHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION+" : *");
		this.jLabelporcentaje_retencionHistorialFormaPago.setToolTipText("Porcentaje Retencion");
		this.jLabelporcentaje_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_retencionHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_retencionHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelporcentaje_retencionHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldporcentaje_retencionHistorialFormaPago= new JTextFieldMe();
		jTextFieldporcentaje_retencionHistorialFormaPago.setEnabled(false);
		jTextFieldporcentaje_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_retencionHistorialFormaPago.setText("0.0");

		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setText("U");
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_retencionHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_retencionHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_retencionHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelbase_retencionHistorialFormaPago = new JLabelMe();
		this.jLabelbase_retencionHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION+" : *");
		this.jLabelbase_retencionHistorialFormaPago.setToolTipText("Base Retencion");
		this.jLabelbase_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_retencionHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_retencionHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelbase_retencionHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldbase_retencionHistorialFormaPago= new JTextFieldMe();
		jTextFieldbase_retencionHistorialFormaPago.setEnabled(false);
		jTextFieldbase_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_retencionHistorialFormaPago.setText("0.0");

		this.jButtonbase_retencionHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_retencionHistorialFormaPagoBusqueda.setText("U");
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_retencionHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_retencionHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_retencionHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_retencionHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_retencionHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionHistorialFormaPago = new JLabelMe();
		this.jLabelnumero_retencionHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionHistorialFormaPago.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelnumero_retencionHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextFieldnumero_retencionHistorialFormaPago= new JTextFieldMe();
		jTextFieldnumero_retencionHistorialFormaPago.setEnabled(false);
		jTextFieldnumero_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_retencionHistorialFormaPago.setText("0");

		this.jButtonnumero_retencionHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setText("U");
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionHistorialFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_retencionHistorialFormaPago = new JLabelMe();
		this.jLabelnombre_retencionHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION+" : *");
		this.jLabelnombre_retencionHistorialFormaPago.setToolTipText("Nombre Retencion");
		this.jLabelnombre_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_retencionHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_retencionHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelnombre_retencionHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jTextAreanombre_retencionHistorialFormaPago= new JTextAreaMe();
		jTextAreanombre_retencionHistorialFormaPago.setEnabled(false);
		jTextAreanombre_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionHistorialFormaPago.setLineWrap(true);
		jTextAreanombre_retencionHistorialFormaPago.setWrapStyleWord(true);
		jTextAreanombre_retencionHistorialFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_retencionHistorialFormaPago.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_retencionHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_retencionHistorialFormaPago = new JScrollPane(jTextAreanombre_retencionHistorialFormaPago);
		jscrollPanenombre_retencionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_retencionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_retencionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_retencionHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setText("U");
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_retencionHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_retencionHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_retencionHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_retencionHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_retencionHistorialFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHistorialFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHistorialFormaPago = new JLabelMe();
		this.jLabelid_empresaHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHistorialFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_empresaHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_empresaHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_empresaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHistorialFormaPago.setEnabled(false);

		this.jButtonid_empresaHistorialFormaPago= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPago.setText("Buscar");
		this.jButtonid_empresaHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPago"));

		this.jButtonid_empresaHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_empresaHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPagoUpdate"));



					
		this.jLabelid_sucursalHistorialFormaPago = new JLabelMe();
		this.jLabelid_sucursalHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalHistorialFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_sucursalHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_sucursalHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalHistorialFormaPago.setEnabled(false);

		this.jButtonid_sucursalHistorialFormaPago= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPago.setText("Buscar");
		this.jButtonid_sucursalHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPago"));

		this.jButtonid_sucursalHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPagoUpdate"));



					
		this.jLabelid_ejercicioHistorialFormaPago = new JLabelMe();
		this.jLabelid_ejercicioHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioHistorialFormaPago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_ejercicioHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_ejercicioHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_ejercicioHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioHistorialFormaPago.setEnabled(false);

		this.jButtonid_ejercicioHistorialFormaPago= new JButtonMe();
		this.jButtonid_ejercicioHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioHistorialFormaPago.setText("Buscar");
		this.jButtonid_ejercicioHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioHistorialFormaPago"));

		this.jButtonid_ejercicioHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_ejercicioHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioHistorialFormaPagoUpdate"));



					
		this.jLabelid_periodoHistorialFormaPago = new JLabelMe();
		this.jLabelid_periodoHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoHistorialFormaPago.setToolTipText("Periodo");
		this.jLabelid_periodoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_periodoHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_periodoHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_periodoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoHistorialFormaPago.setEnabled(false);

		this.jButtonid_periodoHistorialFormaPago= new JButtonMe();
		this.jButtonid_periodoHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoHistorialFormaPago.setText("Buscar");
		this.jButtonid_periodoHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoHistorialFormaPago"));

		this.jButtonid_periodoHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_periodoHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_periodoHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_periodoHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoHistorialFormaPagoUpdate"));



					
		this.jLabelid_facturaHistorialFormaPago = new JLabelMe();
		this.jLabelid_facturaHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaHistorialFormaPago.setToolTipText("Factura");
		this.jLabelid_facturaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_facturaHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_facturaHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_facturaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaHistorialFormaPago= new JButtonMe();
		this.jButtonid_facturaHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaHistorialFormaPago.setText("Buscar");
		this.jButtonid_facturaHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaHistorialFormaPago"));

		this.jButtonid_facturaHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_facturaHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_facturaHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_facturaHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaHistorialFormaPagoUpdate"));



					
		this.jLabelid_tipo_forma_pagoHistorialFormaPago = new JLabelMe();
		this.jLabelid_tipo_forma_pagoHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoHistorialFormaPago.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_tipo_forma_pagoHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoHistorialFormaPago= new JButtonMe();
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setText("Buscar");
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoHistorialFormaPago"));

		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoHistorialFormaPagoUpdate"));



					
		this.jLabelid_cuenta_contableHistorialFormaPago = new JLabelMe();
		this.jLabelid_cuenta_contableHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableHistorialFormaPago.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_cuenta_contableHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_cuenta_contableHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableHistorialFormaPago= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialFormaPago.setText("Buscar");
		this.jButtonid_cuenta_contableHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialFormaPago"));

		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialFormaPagoUpdate"));


		jButtonid_cuenta_contableHistorialFormaPagoArbol= new JButtonMe();
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setText("Arbol");
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableHistorialFormaPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialFormaPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialFormaPagoArbol"));



					
		this.jLabelid_anioHistorialFormaPago = new JLabelMe();
		this.jLabelid_anioHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioHistorialFormaPago.setToolTipText("Anio");
		this.jLabelid_anioHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_anioHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_anioHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_anioHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioHistorialFormaPago.setEnabled(false);

		this.jButtonid_anioHistorialFormaPago= new JButtonMe();
		this.jButtonid_anioHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialFormaPago.setText("Buscar");
		this.jButtonid_anioHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialFormaPago"));

		this.jButtonid_anioHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_anioHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_anioHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_anioHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_anioHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_anioHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialFormaPagoUpdate"));



					
		this.jLabelid_mesHistorialFormaPago = new JLabelMe();
		this.jLabelid_mesHistorialFormaPago.setText(""+HistorialFormaPagoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesHistorialFormaPago.setToolTipText("Mes");
		this.jLabelid_mesHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesHistorialFormaPago.setToolTipText(HistorialFormaPagoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		this.jPanelid_mesHistorialFormaPago.setLayout(this.gridaBagLayoutHistorialFormaPago);


		jComboBoxid_mesHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_mesHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesHistorialFormaPago.setEnabled(false);

		this.jButtonid_mesHistorialFormaPago= new JButtonMe();
		this.jButtonid_mesHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialFormaPago.setText("Buscar");
		this.jButtonid_mesHistorialFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesHistorialFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialFormaPago"));

		this.jButtonid_mesHistorialFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_mesHistorialFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialFormaPagoBusqueda.setText("U");
		this.jButtonid_mesHistorialFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesHistorialFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialFormaPagoBusqueda"));

		if(this.historialformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesHistorialFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_mesHistorialFormaPagoUpdate= new JButtonMe();
		this.jButtonid_mesHistorialFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialFormaPagoUpdate.setText("U");
		this.jButtonid_mesHistorialFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesHistorialFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleHistorialFormaPago = new HistorialFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialFormaPago= new GridBagLayout();
		

		
		String sToolTipHistorialFormaPago="";
		sToolTipHistorialFormaPago=HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialFormaPago+="(Facturacion.HistorialFormaPago)";
		}
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialFormaPago = new JButtonMe();
		this.jButtonModificarHistorialFormaPago = new JButtonMe();
        this.jButtonActualizarHistorialFormaPago = new JButtonMe();
        this.jButtonEliminarHistorialFormaPago = new JButtonMe();
        this.jButtonCancelarHistorialFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosHistorialFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialFormaPago = new JButtonMe();
		this.jButtonCerrarHistorialFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosHistorialFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Forma Pago";
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialFormaPago.setName("jPanelCamposHistorialFormaPago"); 

		this.jPanelCamposOcultosHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialFormaPago.setName("jPanelCamposOcultosHistorialFormaPago"); 

        this.jPanelAccionesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesHistorialFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialFormaPago.setText("Nuevo");
		this.jButtonModificarHistorialFormaPago.setText("Editar");
        this.jButtonActualizarHistorialFormaPago.setText("Actualizar");
        this.jButtonEliminarHistorialFormaPago.setText("Eliminar");
        this.jButtonCancelarHistorialFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialFormaPago.setText("Guardar");
		this.jButtonCerrarHistorialFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialFormaPago,"nuevo_button","Nuevo",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialFormaPago,"modificar_button","Editar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialFormaPago,"actualizar_button","Actualizar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialFormaPago,"eliminar_button","Eliminar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialFormaPago,"cancelar_button","Cancelar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialFormaPago,"guardarcambios_button","Guardar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialFormaPago,"guardarcambiostabla_button","Guardar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialFormaPago,"cerrar_button","Salir",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialFormaPago.setToolTipText("Nuevo"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialFormaPago.setToolTipText("Editar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialFormaPago.setToolTipText("Actualizar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialFormaPago.setToolTipText("Eliminar)"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialFormaPago.setToolTipText("Cancelar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialFormaPago.setToolTipText("Guardar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialFormaPago.setToolTipText("Guardar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialFormaPago.setToolTipText("Salir"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialFormaPago";
		inputMap = this.jButtonNuevoHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialFormaPago";
		inputMap = this.jButtonActualizarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialFormaPago";
		inputMap = this.jButtonEliminarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialFormaPago";
		inputMap = this.jButtonCancelarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialFormaPago";
		inputMap = this.jButtonCerrarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialFormaPago.setToolTipText("Nuevo HistorialFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPago.setToolTipText("Sin Cerrar Ventana HistorialFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesHistorialFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialFormaPago = new JLabelMe();
		
		this.jLabelAccionesHistorialFormaPago.setText("Acciones");		
		this.jLabelAccionesHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialFormaPago = new GridBagLayout();
		
		this.jPanelCamposHistorialFormaPago.setLayout(gridaBagLayoutCamposHistorialFormaPago);
		this.jPanelCamposOcultosHistorialFormaPago.setLayout(gridaBagLayoutCamposOcultosHistorialFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialFormaPago.add(jLabelIdHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialFormaPago.add(jLabelidHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHistorialFormaPago.add(jLabelid_empresaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialFormaPago.add(jButtonid_empresaHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialFormaPago.add(jButtonid_empresaHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHistorialFormaPago.add(jComboBoxid_empresaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalHistorialFormaPago.add(jLabelid_sucursalHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalHistorialFormaPago.add(jButtonid_sucursalHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalHistorialFormaPago.add(jButtonid_sucursalHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalHistorialFormaPago.add(jComboBoxid_sucursalHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioHistorialFormaPago.add(jLabelid_ejercicioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioHistorialFormaPago.add(jButtonid_ejercicioHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioHistorialFormaPago.add(jButtonid_ejercicioHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioHistorialFormaPago.add(jComboBoxid_ejercicioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoHistorialFormaPago.add(jLabelid_periodoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoHistorialFormaPago.add(jButtonid_periodoHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoHistorialFormaPago.add(jButtonid_periodoHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoHistorialFormaPago.add(jComboBoxid_periodoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaHistorialFormaPago.add(jLabelid_facturaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 2;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaHistorialFormaPago.add(jButtonid_facturaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaHistorialFormaPago.add(jButtonid_facturaHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 4;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaHistorialFormaPago.add(jButtonid_facturaHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaHistorialFormaPago.add(jComboBoxid_facturaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoHistorialFormaPago.add(jLabelid_tipo_forma_pagoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoHistorialFormaPago.add(jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoHistorialFormaPago.add(jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoHistorialFormaPago.add(jComboBoxid_tipo_forma_pagoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableHistorialFormaPago.add(jLabelid_cuenta_contableHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 2;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableHistorialFormaPago.add(jButtonid_cuenta_contableHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 3;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableHistorialFormaPago.add(jButtonid_cuenta_contableHistorialFormaPagoArbol, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 4;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableHistorialFormaPago.add(jButtonid_cuenta_contableHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 5;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableHistorialFormaPago.add(jButtonid_cuenta_contableHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableHistorialFormaPago.add(jComboBoxid_cuenta_contableHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasHistorialFormaPago.add(jLabelnumero_diasHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasHistorialFormaPago.add(jButtonnumero_diasHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasHistorialFormaPago.add(jTextFieldnumero_diasHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorHistorialFormaPago.add(jLabelvalorHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorHistorialFormaPago.add(jButtonvalorHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorHistorialFormaPago.add(jTextFieldvalorHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaHistorialFormaPago.add(jLabelfechaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaHistorialFormaPago.add(jButtonfechaHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaHistorialFormaPago.add(jDateChooserfechaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeHistorialFormaPago.add(jLabelporcentajeHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeHistorialFormaPago.add(jButtonporcentajeHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeHistorialFormaPago.add(jTextFieldporcentajeHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_retencionHistorialFormaPago.add(jLabelporcentaje_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_retencionHistorialFormaPago.add(jButtonporcentaje_retencionHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_retencionHistorialFormaPago.add(jTextFieldporcentaje_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_retencionHistorialFormaPago.add(jLabelbase_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_retencionHistorialFormaPago.add(jButtonbase_retencionHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_retencionHistorialFormaPago.add(jTextFieldbase_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionHistorialFormaPago.add(jLabelnumero_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionHistorialFormaPago.add(jButtonnumero_retencionHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionHistorialFormaPago.add(jTextFieldnumero_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_retencionHistorialFormaPago.add(jLabelnombre_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_retencionHistorialFormaPago.add(jButtonnombre_retencionHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_retencionHistorialFormaPago.add(jscrollPanenombre_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioHistorialFormaPago.add(jLabelid_anioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioHistorialFormaPago.add(jButtonid_anioHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioHistorialFormaPago.add(jButtonid_anioHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioHistorialFormaPago.add(jComboBoxid_anioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesHistorialFormaPago.add(jLabelid_mesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 2;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialFormaPago.add(jButtonid_mesHistorialFormaPagoBusqueda, this.gridBagConstraintsHistorialFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 3;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialFormaPago.add(jButtonid_mesHistorialFormaPagoUpdate, this.gridBagConstraintsHistorialFormaPago);
	}

	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPago.gridy = 0;
	this.gridBagConstraintsHistorialFormaPago.gridx = 1;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesHistorialFormaPago.add(jComboBoxid_mesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelidHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelid_facturaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelid_tipo_forma_pagoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelid_cuenta_contableHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelnumero_diasHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelvalorHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelfechaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelporcentajeHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelporcentaje_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelbase_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelnumero_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPago.add(this.jPanelnombre_retencionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposHistorialFormaPago % 2==0) {
		iXPanelCamposHistorialFormaPago=0;
		iYPanelCamposHistorialFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_empresaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_sucursalHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_ejercicioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_periodoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_anioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
	}
	this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPago.gridy = iYPanelCamposOcultosHistorialFormaPago;
	this.gridBagConstraintsHistorialFormaPago.gridx = iXPanelCamposOcultosHistorialFormaPago++;
	this.gridBagConstraintsHistorialFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPago.add(this.jPanelid_mesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);



	if(iXPanelCamposOcultosHistorialFormaPago % 2==0) {
		iXPanelCamposOcultosHistorialFormaPago=0;
		iYPanelCamposOcultosHistorialFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialFormaPago= new GridBagLayout();
		this.jPanelAccionesHistorialFormaPago.setLayout(gridaBagLayoutAccionesHistorialFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialFormaPago.setLayout(gridaBagLayoutAccionesFormularioHistorialFormaPago);
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialFormaPago.add(this.jComboBoxTiposAccionesFormularioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialFormaPago.add(this.jCheckBoxPostAccionNuevoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialFormaPago.add(this.jCheckBoxPostAccionSinCerrarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialFormaPago.add(this.jCheckBoxPostAccionSinMensajeHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonModificarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);							

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonEliminarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonActualizarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonGuardarCambiosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);	
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonCancelarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;		
			//this.gridBagConstraintsHistorialFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPago.gridx =0;
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialFormaPago = new HistorialFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialFormaPagoModel historialformapagoModel=new HistorialFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialFormaPagoModel.HistorialFormaPagoFocusTraversalPolicy historialformapagoFocusTraversalPolicy = historialformapagoModel.new HistorialFormaPagoFocusTraversalPolicy(this);
			
			//historialformapagoFocusTraversalPolicy.sethistorialformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialformapagoModel);
			
			
			this.jContentPaneDetalleHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleHistorialFormaPago.setLayout(gridaBagLayoutDetalleHistorialFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialFormaPago.add(jTtoolBarDetalleHistorialFormaPago, gridBagConstraintsHistorialFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialFormaPago=   new JScrollPane(jContentPaneDetalleHistorialFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleHistorialFormaPago.add(jPanelCamposHistorialFormaPago, gridBagConstraintsHistorialFormaPago);
			
			
			
			
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
						&& historialformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialFormaPago= new GridBagConstraints();
						this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialFormaPago.gridx = 0;
						this.jContentPaneDetalleHistorialFormaPago.add(this.jTabbedPaneRelacionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialFormaPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
					this.gridBagConstraintsHistorialFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialFormaPago.add(jPanelCamposOcultosHistorialFormaPago, gridBagConstraintsHistorialFormaPago);
				
					this.jPanelCamposOcultosHistorialFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	        this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialFormaPago.add(this.jPanelAccionesFormularioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);							
			
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsHistorialFormaPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialFormaPago.add(this.jPanelAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialFormaPago=   new JScrollPane(this.jPanelCamposHistorialFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialFormaPago;
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
