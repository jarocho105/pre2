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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.FormaPagoInvenConstantesFunciones;

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
public class FormaPagoInvenDetalleFormJInternalFrame extends FormaPagoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleFormaPagoInven;
	
	protected JMenuBar jmenuBarDetalleFormaPagoInven;
	
	protected JMenu jmenuDetalleFormaPagoInven;
	protected JMenu jmenuDetalleArchivoFormaPagoInven;
	protected JMenu jmenuDetalleAccionesFormaPagoInven;
	protected JMenu jmenuDetalleDatosFormaPagoInven;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPagoInven;	
	protected GridBagConstraints gridBagConstraintsFormaPagoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormaPagoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormaPagoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public FormaPagoInvenSessionBean formapagoinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public CompraSessionBean compraSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public FormaPagoInvenLogic formapagoinvenLogic;
	
	public JScrollPane jScrollPanelDatosFormaPagoInven;
	public JScrollPane jScrollPanelDatosEdicionFormaPagoInven;
	public JScrollPane jScrollPanelDatosGeneralFormaPagoInven;
	
	protected JPanel jPanelCamposFormaPagoInven;    
	protected JPanel jPanelCamposOcultosFormaPagoInven;    	
	protected JPanel jPanelAccionesFormaPagoInven;
	protected JPanel jPanelAccionesFormularioFormaPagoInven;
    
	
	
	protected Integer iXPanelCamposFormaPagoInven=0;
	protected Integer iYPanelCamposFormaPagoInven=0;
	
	protected Integer iXPanelCamposOcultosFormaPagoInven=0;
	protected Integer iYPanelCamposOcultosFormaPagoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormaPagoInven;
	public JButton jButtonModificarFormaPagoInven;
	public JButton jButtonActualizarFormaPagoInven;
    public JButton jButtonEliminarFormaPagoInven;
	public JButton jButtonCancelarFormaPagoInven;
    public JButton jButtonGuardarCambiosFormaPagoInven;
	public JButton jButtonGuardarCambiosTablaFormaPagoInven;
	protected JButton jButtonCerrarFormaPagoInven;
	
	/*
	protected JButton jButtonProcesarInformacionFormaPagoInven;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormaPagoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormaPagoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormaPagoInven;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarFormaPagoInven;
	protected JButton jButtonModificarToolBarFormaPagoInven;
	protected JButton jButtonActualizarToolBarFormaPagoInven;
    protected JButton jButtonEliminarToolBarFormaPagoInven;
	protected JButton jButtonCancelarToolBarFormaPagoInven;
    protected JButton jButtonGuardarCambiosToolBarFormaPagoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarFormaPagoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPagoInven;
	protected JButton jButtonCerrarToolBarFormaPagoInven;
	
	protected JButton jButtonProcesarInformacionToolBarFormaPagoInven;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoFormaPagoInven;
	protected JMenuItem jMenuItemModificarFormaPagoInven;
	protected JMenuItem jMenuItemActualizarFormaPagoInven;
    protected JMenuItem jMenuItemEliminarFormaPagoInven;
	protected JMenuItem jMenuItemCancelarFormaPagoInven;
    protected JMenuItem jMenuItemGuardarCambiosFormaPagoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPagoInven;
	protected JMenuItem jMenuItemCerrarFormaPagoInven;
	protected JMenuItem jMenuItemDetalleCerrarFormaPagoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPagoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionFormaPagoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPagoInven;
	protected JMenuItem jMenuItemMostrarOcultarFormaPagoInven;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPagoInven;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPagoInven;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormaPagoInven;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormaPagoInven;
	public JLabel jLabelIdFormaPagoInven;
	public JLabel jLabelidFormaPagoInven;
	public JButton jButtonidFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioFormaPagoInven;
	public JLabel jLabelfecha_inicioFormaPagoInven;
	//public JFormattedTextField jDateChooserfecha_inicioFormaPagoInven;

	public JDateChooser jDateChooserfecha_inicioFormaPagoInven;
	public JButton jButtonfecha_inicioFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasFormaPagoInven;
	public JLabel jLabelnumero_diasFormaPagoInven;
	public JTextField jTextFieldnumero_diasFormaPagoInven;
	public JButton jButtonnumero_diasFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finFormaPagoInven;
	public JLabel jLabelfecha_finFormaPagoInven;
	//public JFormattedTextField jDateChooserfecha_finFormaPagoInven;

	public JDateChooser jDateChooserfecha_finFormaPagoInven;
	public JButton jButtonfecha_finFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeFormaPagoInven;
	public JLabel jLabelporcentajeFormaPagoInven;
	public JTextField jTextFieldporcentajeFormaPagoInven;
	public JButton jButtonporcentajeFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelvalorFormaPagoInven;
	public JLabel jLabelvalorFormaPagoInven;
	public JTextField jTextFieldvalorFormaPagoInven;
	public JButton jButtonvalorFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPaneldetalleFormaPagoInven;
	public JLabel jLabeldetalleFormaPagoInven;
	public JTextArea jTextAreadetalleFormaPagoInven;
	public JScrollPane jscrollPanedetalleFormaPagoInven;
	public JButton jButtondetalleFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelfechaFormaPagoInven;
	public JLabel jLabelfechaFormaPagoInven;
	//public JFormattedTextField jDateChooserfechaFormaPagoInven;

	public JDateChooser jDateChooserfechaFormaPagoInven;
	public JButton jButtonfechaFormaPagoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormaPagoInven;
	public JLabel jLabelid_empresaFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormaPagoInven;
	public JButton jButtonid_empresaFormaPagoInven= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormaPagoInven;
	public JLabel jLabelid_sucursalFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormaPagoInven;
	public JButton jButtonid_sucursalFormaPagoInven= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormaPagoInven;
	public JLabel jLabelid_ejercicioFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormaPagoInven;
	public JButton jButtonid_ejercicioFormaPagoInven= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormaPagoInven;
	public JLabel jLabelid_periodoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormaPagoInven;
	public JButton jButtonid_periodoFormaPagoInven= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoFormaPagoInven;
	public JLabel jLabelid_tipo_forma_pagoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFormaPagoInven;
	public JButton jButtonid_tipo_forma_pagoFormaPagoInven= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_compraFormaPagoInven;
	public JLabel jLabelid_compraFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFormaPagoInven;
	public JButton jButtonid_compraFormaPagoInven= new JButtonMe();
	public JButton jButtonid_compraFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_compraFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFormaPagoInven;
	public JLabel jLabelid_anioFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFormaPagoInven;
	public JButton jButtonid_anioFormaPagoInven= new JButtonMe();
	public JButton jButtonid_anioFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_anioFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFormaPagoInven;
	public JLabel jLabelid_mesFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFormaPagoInven;
	public JButton jButtonid_mesFormaPagoInven= new JButtonMe();
	public JButton jButtonid_mesFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_mesFormaPagoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableFormaPagoInven;
	public JLabel jLabelid_cuenta_contableFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFormaPagoInven;
	public JButton jButtonid_cuenta_contableFormaPagoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoInvenArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormaPagoInven;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormaPagoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormaPagoInven=new JPanel();
				this.jPanelAccionesFormularioFormaPagoInven=new JPanel();
				this.jmenuBarDetalleFormaPagoInven=new JMenuBar();
				this.jTtoolBarDetalleFormaPagoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormaPagoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarFormaPagoInven() {
		return this.jButtonActualizarToolBarFormaPagoInven;
	}
	
	public JButton getjButtonEliminarToolBarFormaPagoInven() {
		return this.jButtonEliminarToolBarFormaPagoInven;
	}
	
	public JButton getjButtonCancelarToolBarFormaPagoInven() {
		return this.jButtonCancelarToolBarFormaPagoInven;
	}		
	
	public JButton getjButtonProcesarInformacionFormaPagoInven() {
		return this.jButtonProcesarInformacionFormaPagoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPagoInven)	{
		this.jButtonProcesarInformacionFormaPagoInven = jButtonProcesarInformacionFormaPagoInven;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPagoInven() {
		return this.jComboBoxTiposAccionesFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPagoInven(
			JComboBox jComboBoxTiposRelacionesFormaPagoInven) {
		this.jComboBoxTiposRelacionesFormaPagoInven = jComboBoxTiposRelacionesFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPagoInven(
			JComboBox jComboBoxTiposAccionesFormaPagoInven) {
		this.jComboBoxTiposAccionesFormaPagoInven = jComboBoxTiposAccionesFormaPagoInven;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormaPagoInven() {
		return this.jComboBoxTiposAccionesFormularioFormaPagoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormaPagoInven(
			JComboBox jComboBoxTiposAccionesFormularioFormaPagoInven) {
		this.jComboBoxTiposAccionesFormularioFormaPagoInven = jComboBoxTiposAccionesFormularioFormaPagoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		
		this.formapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		FormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormaPagoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormaPagoInven=new JButtonMe();
				this.jButtonModificarToolBarFormaPagoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven,
							"actualizar","actualizar","Actualizar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven,
							"eliminar","eliminar","Eliminar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven,
							"cancelar","cancelar","Cancelar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormaPagoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormaPagoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormaPagoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormaPagoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormaPagoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPagoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPagoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPagoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormaPagoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormaPagoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormaPagoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormaPagoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormaPagoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormaPagoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormaPagoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormaPagoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormaPagoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormaPagoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormaPagoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormaPagoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormaPagoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPagoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPagoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormaPagoInven.add(this.jMenuItemDetalleCerrarFormaPagoInven);
		
		this.jmenuDetalleAccionesFormaPagoInven.add(this.jMenuItemActualizarFormaPagoInven);
		this.jmenuDetalleAccionesFormaPagoInven.add(this.jMenuItemEliminarFormaPagoInven);
		this.jmenuDetalleAccionesFormaPagoInven.add(this.jMenuItemCancelarFormaPagoInven);		
		
		//this.jmenuDetalleDatosFormaPagoInven.add(this.jMenuItemDetalleAbrirOrderByFormaPagoInven);				
		this.jmenuDetalleDatosFormaPagoInven.add(this.jMenuItemDetalleMostarOcultarFormaPagoInven);				
				
		//this.jmenuDetalleAccionesFormaPagoInven.add(this.jMenuItemGuardarCambiosFormaPagoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormaPagoInven.add(this.jmenuDetalleArchivoFormaPagoInven);		
		this.jmenuBarDetalleFormaPagoInven.add(this.jmenuDetalleAccionesFormaPagoInven);		
		this.jmenuBarDetalleFormaPagoInven.add(this.jmenuDetalleDatosFormaPagoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormaPagoInven);				
	}
	*/
	
	public void inicializarElementosCamposFormaPagoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormaPagoInven = new JLabelMe();
		jLabelIdFormaPagoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormaPagoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormaPagoInven= new GridBagLayout();

		this.jPanelidFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);

		jLabelidFormaPagoInven = new JLabel();
		jLabelidFormaPagoInven.setText("Id");

		jLabelidFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioFormaPagoInven = new JLabelMe();
		this.jLabelfecha_inicioFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioFormaPagoInven.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelfecha_inicioFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		//jFormattedTextFieldfecha_inicioFormaPagoInven= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioFormaPagoInven= new JDateChooser();
		jDateChooserfecha_inicioFormaPagoInven.setEnabled(false);
		jDateChooserfecha_inicioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioFormaPagoInven.setDate(new Date());
		jDateChooserfecha_inicioFormaPagoInven.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioFormaPagoInven.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioFormaPagoInvenBusqueda.setText("U");
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasFormaPagoInven = new JLabelMe();
		this.jLabelnumero_diasFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasFormaPagoInven.setToolTipText("Numero Dias");
		this.jLabelnumero_diasFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelnumero_diasFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jTextFieldnumero_diasFormaPagoInven= new JTextFieldMe();
		jTextFieldnumero_diasFormaPagoInven.setEnabled(false);
		jTextFieldnumero_diasFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasFormaPagoInven.setText("0");

		this.jButtonnumero_diasFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasFormaPagoInvenBusqueda.setText("U");
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finFormaPagoInven = new JLabelMe();
		this.jLabelfecha_finFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finFormaPagoInven.setToolTipText("Fecha Fin");
		this.jLabelfecha_finFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelfecha_finFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		//jFormattedTextFieldfecha_finFormaPagoInven= new JFormattedTextFieldMe();

		jDateChooserfecha_finFormaPagoInven= new JDateChooser();
		jDateChooserfecha_finFormaPagoInven.setEnabled(false);
		jDateChooserfecha_finFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finFormaPagoInven.setDate(new Date());
		jDateChooserfecha_finFormaPagoInven.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finFormaPagoInven.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonfecha_finFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finFormaPagoInvenBusqueda.setText("U");
		this.jButtonfecha_finFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeFormaPagoInven = new JLabelMe();
		this.jLabelporcentajeFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeFormaPagoInven.setToolTipText("Porcentaje");
		this.jLabelporcentajeFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelporcentajeFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jTextFieldporcentajeFormaPagoInven= new JTextFieldMe();
		jTextFieldporcentajeFormaPagoInven.setEnabled(false);
		jTextFieldporcentajeFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeFormaPagoInven.setText("0.0");

		this.jButtonporcentajeFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonporcentajeFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeFormaPagoInvenBusqueda.setText("U");
		this.jButtonporcentajeFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelvalorFormaPagoInven = new JLabelMe();
		this.jLabelvalorFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorFormaPagoInven.setToolTipText("Valor");
		this.jLabelvalorFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelvalorFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jTextFieldvalorFormaPagoInven= new JTextFieldMe();
		jTextFieldvalorFormaPagoInven.setEnabled(false);
		jTextFieldvalorFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorFormaPagoInven.setText("0.0");

		this.jButtonvalorFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonvalorFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorFormaPagoInvenBusqueda.setText("U");
		this.jButtonvalorFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabeldetalleFormaPagoInven = new JLabelMe();
		this.jLabeldetalleFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_DETALLE+" :");
		this.jLabeldetalleFormaPagoInven.setToolTipText("Detalle");
		this.jLabeldetalleFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPaneldetalleFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jTextAreadetalleFormaPagoInven= new JTextAreaMe();
		jTextAreadetalleFormaPagoInven.setEnabled(false);
		jTextAreadetalleFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFormaPagoInven.setLineWrap(true);
		jTextAreadetalleFormaPagoInven.setWrapStyleWord(true);
		jTextAreadetalleFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleFormaPagoInven.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleFormaPagoInven = new JScrollPane(jTextAreadetalleFormaPagoInven);
		jscrollPanedetalleFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalleFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalleFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondetalleFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtondetalleFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleFormaPagoInvenBusqueda.setText("U");
		this.jButtondetalleFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleFormaPagoInvenBusqueda.setVisible(false);		}


					
		this.jLabelfechaFormaPagoInven = new JLabelMe();
		this.jLabelfechaFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFormaPagoInven.setToolTipText("Fecha");
		this.jLabelfechaFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelfechaFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		//jFormattedTextFieldfechaFormaPagoInven= new JFormattedTextFieldMe();

		jDateChooserfechaFormaPagoInven= new JDateChooser();
		jDateChooserfechaFormaPagoInven.setEnabled(false);
		jDateChooserfechaFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFormaPagoInven.setDate(new Date());
		jDateChooserfechaFormaPagoInven.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFormaPagoInven.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonfechaFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFormaPagoInvenBusqueda.setText("U");
		this.jButtonfechaFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFormaPagoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormaPagoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormaPagoInven = new JLabelMe();
		this.jLabelid_empresaFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormaPagoInven.setToolTipText("Empresa");
		this.jLabelid_empresaFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_empresaFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_empresaFormaPagoInven= new JComboBoxMe();
		jComboBoxid_empresaFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormaPagoInven.setEnabled(false);

		this.jButtonid_empresaFormaPagoInven= new JButtonMe();
		this.jButtonid_empresaFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoInven.setText("Buscar");
		this.jButtonid_empresaFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoInven"));

		this.jButtonid_empresaFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_empresaFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoInvenUpdate.setText("U");
		this.jButtonid_empresaFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoInvenUpdate"));



					
		this.jLabelid_sucursalFormaPagoInven = new JLabelMe();
		this.jLabelid_sucursalFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormaPagoInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_sucursalFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_sucursalFormaPagoInven= new JComboBoxMe();
		jComboBoxid_sucursalFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormaPagoInven.setEnabled(false);

		this.jButtonid_sucursalFormaPagoInven= new JButtonMe();
		this.jButtonid_sucursalFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoInven.setText("Buscar");
		this.jButtonid_sucursalFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoInven"));

		this.jButtonid_sucursalFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoInvenUpdate.setText("U");
		this.jButtonid_sucursalFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoInvenUpdate"));



					
		this.jLabelid_ejercicioFormaPagoInven = new JLabelMe();
		this.jLabelid_ejercicioFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormaPagoInven.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_ejercicioFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_ejercicioFormaPagoInven= new JComboBoxMe();
		jComboBoxid_ejercicioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormaPagoInven.setEnabled(false);

		this.jButtonid_ejercicioFormaPagoInven= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoInven.setText("Buscar");
		this.jButtonid_ejercicioFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoInven"));

		this.jButtonid_ejercicioFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoInvenUpdate.setText("U");
		this.jButtonid_ejercicioFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoInvenUpdate"));



					
		this.jLabelid_periodoFormaPagoInven = new JLabelMe();
		this.jLabelid_periodoFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormaPagoInven.setToolTipText("Periodo");
		this.jLabelid_periodoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_periodoFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_periodoFormaPagoInven= new JComboBoxMe();
		jComboBoxid_periodoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormaPagoInven.setEnabled(false);

		this.jButtonid_periodoFormaPagoInven= new JButtonMe();
		this.jButtonid_periodoFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoInven.setText("Buscar");
		this.jButtonid_periodoFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoInven"));

		this.jButtonid_periodoFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_periodoFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_periodoFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_periodoFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoInvenUpdate.setText("U");
		this.jButtonid_periodoFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoInvenUpdate"));



					
		this.jLabelid_tipo_forma_pagoFormaPagoInven = new JLabelMe();
		this.jLabelid_tipo_forma_pagoFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoFormaPagoInven.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_tipo_forma_pagoFormaPagoInven= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoFormaPagoInven= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setText("Buscar");
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoInven"));

		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoInvenUpdate"));



					
		this.jLabelid_compraFormaPagoInven = new JLabelMe();
		this.jLabelid_compraFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA+" : *");
		this.jLabelid_compraFormaPagoInven.setToolTipText("Compra");
		this.jLabelid_compraFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_compraFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_compraFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_compraFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_compraFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_compraFormaPagoInven= new JComboBoxMe();
		jComboBoxid_compraFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_compraFormaPagoInven.setEnabled(false);

		this.jButtonid_compraFormaPagoInven= new JButtonMe();
		this.jButtonid_compraFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraFormaPagoInven.setText("Buscar");
		this.jButtonid_compraFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_compraFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_compraFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraFormaPagoInven"));

		this.jButtonid_compraFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_compraFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_compraFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_compraFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_compraFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_compraFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_compraFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_compraFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraFormaPagoInvenUpdate.setText("U");
		this.jButtonid_compraFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_compraFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_compraFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraFormaPagoInvenUpdate"));



					
		this.jLabelid_anioFormaPagoInven = new JLabelMe();
		this.jLabelid_anioFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioFormaPagoInven.setToolTipText("Anio");
		this.jLabelid_anioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_anioFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_anioFormaPagoInven= new JComboBoxMe();
		jComboBoxid_anioFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFormaPagoInven.setEnabled(false);

		this.jButtonid_anioFormaPagoInven= new JButtonMe();
		this.jButtonid_anioFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoInven.setText("Buscar");
		this.jButtonid_anioFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoInven"));

		this.jButtonid_anioFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_anioFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_anioFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_anioFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_anioFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoInvenUpdate.setText("U");
		this.jButtonid_anioFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoInvenUpdate"));



					
		this.jLabelid_mesFormaPagoInven = new JLabelMe();
		this.jLabelid_mesFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFormaPagoInven.setToolTipText("Mes");
		this.jLabelid_mesFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_mesFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_mesFormaPagoInven= new JComboBoxMe();
		jComboBoxid_mesFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesFormaPagoInven.setEnabled(false);

		this.jButtonid_mesFormaPagoInven= new JButtonMe();
		this.jButtonid_mesFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoInven.setText("Buscar");
		this.jButtonid_mesFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoInven"));

		this.jButtonid_mesFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_mesFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_mesFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_mesFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_mesFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoInvenUpdate.setText("U");
		this.jButtonid_mesFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoInvenUpdate"));



					
		this.jLabelid_cuenta_contableFormaPagoInven = new JLabelMe();
		this.jLabelid_cuenta_contableFormaPagoInven.setText(""+FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableFormaPagoInven.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableFormaPagoInven.setToolTipText(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutFormaPagoInven = new GridBagLayout();
		this.jPanelid_cuenta_contableFormaPagoInven.setLayout(this.gridaBagLayoutFormaPagoInven);


		jComboBoxid_cuenta_contableFormaPagoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contableFormaPagoInven.setEnabled(false);

		this.jButtonid_cuenta_contableFormaPagoInven= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoInven.setText("Buscar");
		this.jButtonid_cuenta_contableFormaPagoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableFormaPagoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoInven"));

		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setText("U");
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoInvenBusqueda"));

		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableFormaPagoInvenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableFormaPagoInvenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setText("U");
		this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableFormaPagoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoInvenUpdate"));


		jButtonid_cuenta_contableFormaPagoInvenArbol= new JButtonMe();
		jButtonid_cuenta_contableFormaPagoInvenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoInvenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoInvenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoInvenArbol.setText("Arbol");
		jButtonid_cuenta_contableFormaPagoInvenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableFormaPagoInvenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoInvenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoInvenArbol"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleFormaPagoInven = new FormaPagoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutFormaPagoInven= new GridBagLayout();
		

		
		String sToolTipFormaPagoInven="";
		sToolTipFormaPagoInven=FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPagoInven+="(Inventario.FormaPagoInven)";
		}
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPagoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormaPagoInven = new JButtonMe();
		this.jButtonModificarFormaPagoInven = new JButtonMe();
        this.jButtonActualizarFormaPagoInven = new JButtonMe();
        this.jButtonEliminarFormaPagoInven = new JButtonMe();
        this.jButtonCancelarFormaPagoInven = new JButtonMe();
        this.jButtonGuardarCambiosFormaPagoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormaPagoInven = new JButtonMe();
		this.jButtonCerrarFormaPagoInven = new JButtonMe();
		
		this.jScrollPanelDatosFormaPagoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormaPagoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralFormaPagoInven = new JScrollPane();
				
		
		
		this.jPanelCamposFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormaPagoInven.setName("jPanelCamposFormaPagoInven"); 

		this.jPanelCamposOcultosFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormaPagoInven.setName("jPanelCamposOcultosFormaPagoInven"); 

        this.jPanelAccionesFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormaPagoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormaPagoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormaPagoInven.setText("Nuevo");
		this.jButtonModificarFormaPagoInven.setText("Editar");
        this.jButtonActualizarFormaPagoInven.setText("Actualizar");
        this.jButtonEliminarFormaPagoInven.setText("Eliminar");
        this.jButtonCancelarFormaPagoInven.setText("Cancelar");
        this.jButtonGuardarCambiosFormaPagoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormaPagoInven.setText("Guardar");
		this.jButtonCerrarFormaPagoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPagoInven,"nuevo_button","Nuevo",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormaPagoInven,"modificar_button","Editar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormaPagoInven,"actualizar_button","Actualizar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormaPagoInven,"eliminar_button","Eliminar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormaPagoInven,"cancelar_button","Cancelar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormaPagoInven,"guardarcambios_button","Guardar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPagoInven,"guardarcambiostabla_button","Guardar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPagoInven,"cerrar_button","Salir",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormaPagoInven.setToolTipText("Nuevo"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormaPagoInven.setToolTipText("Editar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormaPagoInven.setToolTipText("Actualizar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormaPagoInven.setToolTipText("Eliminar)"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormaPagoInven.setToolTipText("Cancelar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormaPagoInven.setToolTipText("Guardar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormaPagoInven.setToolTipText("Guardar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPagoInven.setToolTipText("Salir"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPagoInven";
		inputMap = this.jButtonNuevoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPagoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormaPagoInven";
		inputMap = this.jButtonActualizarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormaPagoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarFormaPagoInven";
		inputMap = this.jButtonEliminarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormaPagoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarFormaPagoInven";
		inputMap = this.jButtonCancelarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormaPagoInven"));
		
		//CERRAR		
		sMapKey = "CerrarFormaPagoInven";
		inputMap = this.jButtonCerrarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPagoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPagoInven";
		inputMap = this.jButtonGuardarCambiosTablaFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPagoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormaPagoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormaPagoInven.setToolTipText("Nuevo FormaPagoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormaPagoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormaPagoInven.setToolTipText("Sin Cerrar Ventana FormaPagoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormaPagoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormaPagoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPagoInven.setText("Accion");
		this.jComboBoxTiposAccionesFormaPagoInven.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormaPagoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormaPagoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormaPagoInven = new JLabelMe();
		
		this.jLabelAccionesFormaPagoInven.setText("Acciones");		
		this.jLabelAccionesFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormaPagoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormaPagoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormaPagoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormaPagoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioFormaPagoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPagoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPagoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormaPagoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormaPagoInven = new GridBagLayout();
		
		this.jPanelCamposFormaPagoInven.setLayout(gridaBagLayoutCamposFormaPagoInven);
		this.jPanelCamposOcultosFormaPagoInven.setLayout(gridaBagLayoutCamposOcultosFormaPagoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormaPagoInven.add(jLabelIdFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormaPagoInven.add(jLabelidFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormaPagoInven.add(jLabelid_empresaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPagoInven.add(jButtonid_empresaFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPagoInven.add(jButtonid_empresaFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormaPagoInven.add(jComboBoxid_empresaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormaPagoInven.add(jLabelid_sucursalFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPagoInven.add(jButtonid_sucursalFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPagoInven.add(jButtonid_sucursalFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormaPagoInven.add(jComboBoxid_sucursalFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormaPagoInven.add(jLabelid_ejercicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPagoInven.add(jButtonid_ejercicioFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPagoInven.add(jButtonid_ejercicioFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormaPagoInven.add(jComboBoxid_ejercicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormaPagoInven.add(jLabelid_periodoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPagoInven.add(jButtonid_periodoFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPagoInven.add(jButtonid_periodoFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormaPagoInven.add(jComboBoxid_periodoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoFormaPagoInven.add(jLabelid_tipo_forma_pagoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPagoInven.add(jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPagoInven.add(jButtonid_tipo_forma_pagoFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoFormaPagoInven.add(jComboBoxid_tipo_forma_pagoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioFormaPagoInven.add(jLabelfecha_inicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioFormaPagoInven.add(jButtonfecha_inicioFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioFormaPagoInven.add(jDateChooserfecha_inicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasFormaPagoInven.add(jLabelnumero_diasFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasFormaPagoInven.add(jButtonnumero_diasFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasFormaPagoInven.add(jTextFieldnumero_diasFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finFormaPagoInven.add(jLabelfecha_finFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finFormaPagoInven.add(jButtonfecha_finFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finFormaPagoInven.add(jDateChooserfecha_finFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeFormaPagoInven.add(jLabelporcentajeFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeFormaPagoInven.add(jButtonporcentajeFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeFormaPagoInven.add(jTextFieldporcentajeFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorFormaPagoInven.add(jLabelvalorFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorFormaPagoInven.add(jButtonvalorFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorFormaPagoInven.add(jTextFieldvalorFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleFormaPagoInven.add(jLabeldetalleFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleFormaPagoInven.add(jButtondetalleFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleFormaPagoInven.add(jscrollPanedetalleFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_compraFormaPagoInven.add(jLabelid_compraFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraFormaPagoInven.add(jButtonid_compraFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraFormaPagoInven.add(jButtonid_compraFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_compraFormaPagoInven.add(jComboBoxid_compraFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioFormaPagoInven.add(jLabelid_anioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPagoInven.add(jButtonid_anioFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPagoInven.add(jButtonid_anioFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioFormaPagoInven.add(jComboBoxid_anioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesFormaPagoInven.add(jLabelid_mesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPagoInven.add(jButtonid_mesFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 3;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPagoInven.add(jButtonid_mesFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesFormaPagoInven.add(jComboBoxid_mesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableFormaPagoInven.add(jLabelid_cuenta_contableFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 2;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPagoInven.add(jButtonid_cuenta_contableFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 3;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPagoInven.add(jButtonid_cuenta_contableFormaPagoInvenArbol, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 4;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPagoInven.add(jButtonid_cuenta_contableFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 5;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPagoInven.add(jButtonid_cuenta_contableFormaPagoInvenUpdate, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableFormaPagoInven.add(jComboBoxid_cuenta_contableFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 0;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFormaPagoInven.add(jLabelfechaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 2;
		this.gridBagConstraintsFormaPagoInven.ipadx = 0;
		this.gridBagConstraintsFormaPagoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFormaPagoInven.add(jButtonfechaFormaPagoInvenBusqueda, this.gridBagConstraintsFormaPagoInven);
	}

	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoInven.gridy = 0;
	this.gridBagConstraintsFormaPagoInven.gridx = 1;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFormaPagoInven.add(jDateChooserfechaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelidFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelid_tipo_forma_pagoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelfecha_inicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelnumero_diasFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelfecha_finFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelporcentajeFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPanelvalorFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoInven.add(this.jPaneldetalleFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposFormaPagoInven % 1==0) {
		iXPanelCamposFormaPagoInven=0;
		iYPanelCamposFormaPagoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_empresaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_sucursalFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_ejercicioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_periodoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_compraFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_anioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_mesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelid_cuenta_contableFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
	}
	this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoInven.gridy = iYPanelCamposOcultosFormaPagoInven;
	this.gridBagConstraintsFormaPagoInven.gridx = iXPanelCamposOcultosFormaPagoInven++;
	this.gridBagConstraintsFormaPagoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoInven.add(this.jPanelfechaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);



	if(iXPanelCamposOcultosFormaPagoInven % 1==0) {
		iXPanelCamposOcultosFormaPagoInven=0;
		iYPanelCamposOcultosFormaPagoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesFormaPagoInven.setLayout(gridaBagLayoutAccionesFormaPagoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesFormularioFormaPagoInven.setLayout(gridaBagLayoutAccionesFormularioFormaPagoInven);
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPagoInven.add(this.jComboBoxTiposAccionesFormularioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPagoInven.add(this.jCheckBoxPostAccionNuevoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPagoInven.add(this.jCheckBoxPostAccionSinCerrarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPagoInven.add(this.jCheckBoxPostAccionSinMensajeFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormaPagoInven.add(this.jButtonModificarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);							

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormaPagoInven.add(this.jButtonEliminarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPagoInven.add(this.jButtonActualizarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPagoInven.add(this.jButtonGuardarCambiosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);	
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = 0;		
		this.gridBagConstraintsFormaPagoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormaPagoInven.add(this.jButtonCancelarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPagoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPagoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();						
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoInven.gridx = 0;		
			//this.gridBagConstraintsFormaPagoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPagoInven.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoInven.gridx =0;
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPagoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormaPagoInven = new FormaPagoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormaPagoInvenModel formapagoinvenModel=new FormaPagoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//FormaPagoInvenModel.FormaPagoInvenFocusTraversalPolicy formapagoinvenFocusTraversalPolicy = formapagoinvenModel.new FormaPagoInvenFocusTraversalPolicy(this);
			
			//formapagoinvenFocusTraversalPolicy.setformapagoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formapagoinvenModel);
			
			
			this.jContentPaneDetalleFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormaPagoInven = new GridBagLayout();	
			this.jContentPaneDetalleFormaPagoInven.setLayout(gridaBagLayoutDetalleFormaPagoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPagoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormaPagoInven.gridx = 0;
					
				
				this.jContentPaneDetalleFormaPagoInven.add(jTtoolBarDetalleFormaPagoInven, gridBagConstraintsFormaPagoInven);								
				*/
}
			
			this.jScrollPanelDatosEdicionFormaPagoInven=   new JScrollPane(jContentPaneDetalleFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormaPagoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormaPagoInven.gridx = 0;
	        
			this.jContentPaneDetalleFormaPagoInven.add(jPanelCamposFormaPagoInven, gridBagConstraintsFormaPagoInven);
			
			
			
			
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
						&& formapagoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormaPagoInven= new GridBagConstraints();
						this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormaPagoInven.gridx = 0;
						this.jContentPaneDetalleFormaPagoInven.add(this.jTabbedPaneRelacionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormaPagoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormaPagoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
					this.gridBagConstraintsFormaPagoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormaPagoInven.gridx = 0;
					
				
					this.jContentPaneDetalleFormaPagoInven.add(jPanelCamposOcultosFormaPagoInven, gridBagConstraintsFormaPagoInven);
				
					this.jPanelCamposOcultosFormaPagoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormaPagoInven.gridx = 0;
	        this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormaPagoInven.add(this.jPanelAccionesFormularioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);							
			
			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
	        this.gridBagConstraintsFormaPagoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormaPagoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleFormaPagoInven.add(this.jPanelAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormaPagoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormaPagoInven=   new JScrollPane(this.jPanelCamposFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoInven.gridx = 0;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormaPagoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormaPagoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionFormaPagoInven;
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
