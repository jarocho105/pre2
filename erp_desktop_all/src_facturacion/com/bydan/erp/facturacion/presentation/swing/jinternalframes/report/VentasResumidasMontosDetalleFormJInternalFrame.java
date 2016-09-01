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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.report.VentasResumidasMontosConstantesFunciones;

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
public class VentasResumidasMontosDetalleFormJInternalFrame extends VentasResumidasMontosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasResumidasMontos;
	
	protected JMenuBar jmenuBarDetalleVentasResumidasMontos;
	
	protected JMenu jmenuDetalleVentasResumidasMontos;
	protected JMenu jmenuDetalleArchivoVentasResumidasMontos;
	protected JMenu jmenuDetalleAccionesVentasResumidasMontos;
	protected JMenu jmenuDetalleDatosVentasResumidasMontos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidasMontos;	
	protected GridBagConstraints gridBagConstraintsVentasResumidasMontos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasResumidasMontosBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasResumidasMontos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public VentasResumidasMontosSessionBean ventasresumidasmontosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public VentasResumidasMontosLogic ventasresumidasmontosLogic;
	
	public JScrollPane jScrollPanelDatosVentasResumidasMontos;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidasMontos;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidasMontos;
	
	protected JPanel jPanelCamposVentasResumidasMontos;    
	protected JPanel jPanelCamposOcultosVentasResumidasMontos;    	
	protected JPanel jPanelAccionesVentasResumidasMontos;
	protected JPanel jPanelAccionesFormularioVentasResumidasMontos;
    
	
	
	protected Integer iXPanelCamposVentasResumidasMontos=0;
	protected Integer iYPanelCamposVentasResumidasMontos=0;
	
	protected Integer iXPanelCamposOcultosVentasResumidasMontos=0;
	protected Integer iYPanelCamposOcultosVentasResumidasMontos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasResumidasMontos;
	public JButton jButtonModificarVentasResumidasMontos;
	public JButton jButtonActualizarVentasResumidasMontos;
    public JButton jButtonEliminarVentasResumidasMontos;
	public JButton jButtonCancelarVentasResumidasMontos;
    public JButton jButtonGuardarCambiosVentasResumidasMontos;
	public JButton jButtonGuardarCambiosTablaVentasResumidasMontos;
	protected JButton jButtonCerrarVentasResumidasMontos;
	
	
	protected JButton jButtonProcesarInformacionVentasResumidasMontos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasResumidasMontos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasResumidasMontos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasResumidasMontos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidasMontos;
	protected JButton jButtonModificarToolBarVentasResumidasMontos;
	protected JButton jButtonActualizarToolBarVentasResumidasMontos;
    protected JButton jButtonEliminarToolBarVentasResumidasMontos;
	protected JButton jButtonCancelarToolBarVentasResumidasMontos;
    protected JButton jButtonGuardarCambiosToolBarVentasResumidasMontos;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasResumidasMontos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidasMontos;
	protected JButton jButtonCerrarToolBarVentasResumidasMontos;
	
	protected JButton jButtonProcesarInformacionToolBarVentasResumidasMontos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidasMontos;
	protected JMenuItem jMenuItemModificarVentasResumidasMontos;
	protected JMenuItem jMenuItemActualizarVentasResumidasMontos;
    protected JMenuItem jMenuItemEliminarVentasResumidasMontos;
	protected JMenuItem jMenuItemCancelarVentasResumidasMontos;
    protected JMenuItem jMenuItemGuardarCambiosVentasResumidasMontos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidasMontos;
	protected JMenuItem jMenuItemCerrarVentasResumidasMontos;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidasMontos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidasMontos;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidasMontos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidasMontos;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidasMontos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidasMontos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidasMontos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasResumidasMontos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasResumidasMontos;
	public JLabel jLabelIdVentasResumidasMontos;
	public JLabel jLabelidVentasResumidasMontos;
	public JButton jButtonidVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasResumidasMontos;
	public JLabel jLabelfecha_emision_desdeVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_emision_desdeVentasResumidasMontos;
	public JButton jButtonfecha_emision_desdeVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasResumidasMontos;
	public JLabel jLabelfecha_emision_hastaVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_emision_hastaVentasResumidasMontos;
	public JButton jButtonfecha_emision_hastaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoVentasResumidasMontos;
	public JLabel jLabelnombre_completoVentasResumidasMontos;
	public JTextArea jTextAreanombre_completoVentasResumidasMontos;
	public JScrollPane jscrollPanenombre_completoVentasResumidasMontos;
	public JButton jButtonnombre_completoVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorVentasResumidasMontos;
	public JLabel jLabelnombre_vendedorVentasResumidasMontos;
	public JTextArea jTextAreanombre_vendedorVentasResumidasMontos;
	public JScrollPane jscrollPanenombre_vendedorVentasResumidasMontos;
	public JButton jButtonnombre_vendedorVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_facturaVentasResumidasMontos;
	public JLabel jLabelnombre_tipo_facturaVentasResumidasMontos;
	public JTextArea jTextAreanombre_tipo_facturaVentasResumidasMontos;
	public JScrollPane jscrollPanenombre_tipo_facturaVentasResumidasMontos;
	public JButton jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionVentasResumidasMontos;
	public JLabel jLabelfecha_emisionVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_emisionVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_emisionVentasResumidasMontos;
	public JButton jButtonfecha_emisionVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoVentasResumidasMontos;
	public JLabel jLabelfecha_vencimientoVentasResumidasMontos;
	//public JFormattedTextField jDateChooserfecha_vencimientoVentasResumidasMontos;

	public JDateChooser jDateChooserfecha_vencimientoVentasResumidasMontos;
	public JButton jButtonfecha_vencimientoVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoVentasResumidasMontos;
	public JLabel jLabelnumero_pre_impresoVentasResumidasMontos;
	public JTextField jTextFieldnumero_pre_impresoVentasResumidasMontos;
	public JButton jButtonnumero_pre_impresoVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaVentasResumidasMontos;
	public JLabel jLabeltotal_ivaVentasResumidasMontos;
	public JTextField jTextFieldtotal_ivaVentasResumidasMontos;
	public JButton jButtontotal_ivaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaVentasResumidasMontos;
	public JLabel jLabeltotal_sin_ivaVentasResumidasMontos;
	public JTextField jTextFieldtotal_sin_ivaVentasResumidasMontos;
	public JButton jButtontotal_sin_ivaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoVentasResumidasMontos;
	public JLabel jLabeltotal_descuentoVentasResumidasMontos;
	public JTextField jTextFieldtotal_descuentoVentasResumidasMontos;
	public JButton jButtontotal_descuentoVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroVentasResumidasMontos;
	public JLabel jLabeltotal_otroVentasResumidasMontos;
	public JTextField jTextFieldtotal_otroVentasResumidasMontos;
	public JButton jButtontotal_otroVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalVentasResumidasMontos;
	public JLabel jLabelsub_totalVentasResumidasMontos;
	public JTextField jTextFieldsub_totalVentasResumidasMontos;
	public JButton jButtonsub_totalVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneltotalVentasResumidasMontos;
	public JLabel jLabeltotalVentasResumidasMontos;
	public JTextField jTextFieldtotalVentasResumidasMontos;
	public JButton jButtontotalVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelivaVentasResumidasMontos;
	public JLabel jLabelivaVentasResumidasMontos;
	public JTextField jTextFieldivaVentasResumidasMontos;
	public JButton jButtonivaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionVentasResumidasMontos;
	public JLabel jLabeldescripcionVentasResumidasMontos;
	public JTextArea jTextAreadescripcionVentasResumidasMontos;
	public JScrollPane jscrollPanedescripcionVentasResumidasMontos;
	public JButton jButtondescripcionVentasResumidasMontosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasResumidasMontos;
	public JLabel jLabelid_empresaVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasResumidasMontos;
	public JButton jButtonid_empresaVentasResumidasMontos= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidasMontosUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentasResumidasMontos;
	public JLabel jLabelid_sucursalVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentasResumidasMontos;
	public JButton jButtonid_sucursalVentasResumidasMontos= new JButtonMe();
	public JButton jButtonid_sucursalVentasResumidasMontosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentasResumidasMontosBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorVentasResumidasMontos;
	public JLabel jLabelid_vendedorVentasResumidasMontos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorVentasResumidasMontos;
	public JButton jButtonid_vendedorVentasResumidasMontos= new JButtonMe();
	public JButton jButtonid_vendedorVentasResumidasMontosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorVentasResumidasMontosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasResumidasMontos;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasResumidasMontosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasResumidasMontos=new JPanel();
				this.jPanelAccionesFormularioVentasResumidasMontos=new JPanel();
				this.jmenuBarDetalleVentasResumidasMontos=new JMenuBar();
				this.jTtoolBarDetalleVentasResumidasMontos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasResumidasMontosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidasMontosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidasMontos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasResumidasMontos() {
		return this.jButtonActualizarToolBarVentasResumidasMontos;
	}
	
	public JButton getjButtonEliminarToolBarVentasResumidasMontos() {
		return this.jButtonEliminarToolBarVentasResumidasMontos;
	}
	
	public JButton getjButtonCancelarToolBarVentasResumidasMontos() {
		return this.jButtonCancelarToolBarVentasResumidasMontos;
	}		
	
	public JButton getjButtonProcesarInformacionVentasResumidasMontos() {
		return this.jButtonProcesarInformacionVentasResumidasMontos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidasMontos)	{
		this.jButtonProcesarInformacionVentasResumidasMontos = jButtonProcesarInformacionVentasResumidasMontos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidasMontos() {
		return this.jComboBoxTiposAccionesVentasResumidasMontos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidasMontos(
			JComboBox jComboBoxTiposRelacionesVentasResumidasMontos) {
		this.jComboBoxTiposRelacionesVentasResumidasMontos = jComboBoxTiposRelacionesVentasResumidasMontos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidasMontos(
			JComboBox jComboBoxTiposAccionesVentasResumidasMontos) {
		this.jComboBoxTiposAccionesVentasResumidasMontos = jComboBoxTiposAccionesVentasResumidasMontos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasResumidasMontos() {
		return this.jComboBoxTiposAccionesFormularioVentasResumidasMontos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasResumidasMontos(
			JComboBox jComboBoxTiposAccionesFormularioVentasResumidasMontos) {
		this.jComboBoxTiposAccionesFormularioVentasResumidasMontos = jComboBoxTiposAccionesFormularioVentasResumidasMontos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
		
		this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidasmontosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidasMontosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidasMontosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidas Montos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasResumidasMontosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasResumidasMontos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasResumidasMontos=new JButtonMe();
				this.jButtonModificarToolBarVentasResumidasMontos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos,
							"actualizar","actualizar","Actualizar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos,
							"eliminar","eliminar","Eliminar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos,
							"cancelar","cancelar","Cancelar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasResumidasMontos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasResumidasMontos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasResumidasMontos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasResumidasMontos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasResumidasMontos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasResumidasMontos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidasMontos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidasMontos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidasMontos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasResumidasMontos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasResumidasMontos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasResumidasMontos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasResumidasMontos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasResumidasMontos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasResumidasMontos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasResumidasMontos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasResumidasMontos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasResumidasMontos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasResumidasMontos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasResumidasMontos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasResumidasMontos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasResumidasMontos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidasMontos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidasMontos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidasMontos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidasMontos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidasMontos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasResumidasMontos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasResumidasMontos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasResumidasMontos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidasMontos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidasMontos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidasMontos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidasMontos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidasMontos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidasMontos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasResumidasMontos.add(this.jMenuItemDetalleCerrarVentasResumidasMontos);
		
		this.jmenuDetalleAccionesVentasResumidasMontos.add(this.jMenuItemActualizarVentasResumidasMontos);
		this.jmenuDetalleAccionesVentasResumidasMontos.add(this.jMenuItemEliminarVentasResumidasMontos);
		this.jmenuDetalleAccionesVentasResumidasMontos.add(this.jMenuItemCancelarVentasResumidasMontos);		
		
		//this.jmenuDetalleDatosVentasResumidasMontos.add(this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos);				
		this.jmenuDetalleDatosVentasResumidasMontos.add(this.jMenuItemDetalleMostarOcultarVentasResumidasMontos);				
				
		//this.jmenuDetalleAccionesVentasResumidasMontos.add(this.jMenuItemGuardarCambiosVentasResumidasMontos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasResumidasMontos.add(this.jmenuDetalleArchivoVentasResumidasMontos);		
		this.jmenuBarDetalleVentasResumidasMontos.add(this.jmenuDetalleAccionesVentasResumidasMontos);		
		this.jmenuBarDetalleVentasResumidasMontos.add(this.jmenuDetalleDatosVentasResumidasMontos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasResumidasMontos);				
	}
	
	
	public void inicializarElementosCamposVentasResumidasMontos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasResumidasMontos = new JLabelMe();
		jLabelIdVentasResumidasMontos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasResumidasMontos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasResumidasMontos= new GridBagLayout();

		this.jPanelidVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);

		jLabelidVentasResumidasMontos = new JLabel();
		jLabelidVentasResumidasMontos.setText("Id");

		jLabelidVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasResumidasMontos = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasResumidasMontos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		//jFormattedTextFieldfecha_emision_desdeVentasResumidasMontos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasResumidasMontos = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasResumidasMontos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		//jFormattedTextFieldfecha_emision_hastaVentasResumidasMontos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoVentasResumidasMontos = new JLabelMe();
		this.jLabelnombre_completoVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoVentasResumidasMontos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelnombre_completoVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextAreanombre_completoVentasResumidasMontos= new JTextAreaMe();
		jTextAreanombre_completoVentasResumidasMontos.setEnabled(false);
		jTextAreanombre_completoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidasMontos.setLineWrap(true);
		jTextAreanombre_completoVentasResumidasMontos.setWrapStyleWord(true);
		jTextAreanombre_completoVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoVentasResumidasMontos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoVentasResumidasMontos = new JScrollPane(jTextAreanombre_completoVentasResumidasMontos);
		jscrollPanenombre_completoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoVentasResumidasMontosBusqueda.setText("U");
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorVentasResumidasMontos = new JLabelMe();
		this.jLabelnombre_vendedorVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorVentasResumidasMontos.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelnombre_vendedorVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextAreanombre_vendedorVentasResumidasMontos= new JTextAreaMe();
		jTextAreanombre_vendedorVentasResumidasMontos.setEnabled(false);
		jTextAreanombre_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorVentasResumidasMontos.setLineWrap(true);
		jTextAreanombre_vendedorVentasResumidasMontos.setWrapStyleWord(true);
		jTextAreanombre_vendedorVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorVentasResumidasMontos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorVentasResumidasMontos = new JScrollPane(jTextAreanombre_vendedorVentasResumidasMontos);
		jscrollPanenombre_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setText("U");
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_facturaVentasResumidasMontos = new JLabelMe();
		this.jLabelnombre_tipo_facturaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA+" : *");
		this.jLabelnombre_tipo_facturaVentasResumidasMontos.setToolTipText("Nombre Tipo Factura");
		this.jLabelnombre_tipo_facturaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_facturaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_facturaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_facturaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelnombre_tipo_facturaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextAreanombre_tipo_facturaVentasResumidasMontos= new JTextAreaMe();
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setEnabled(false);
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setLineWrap(true);
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setWrapStyleWord(true);
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_facturaVentasResumidasMontos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_facturaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_facturaVentasResumidasMontos = new JScrollPane(jTextAreanombre_tipo_facturaVentasResumidasMontos);
		jscrollPanenombre_tipo_facturaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setText("U");
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_facturaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_facturaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_facturaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionVentasResumidasMontos = new JLabelMe();
		this.jLabelfecha_emisionVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionVentasResumidasMontos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelfecha_emisionVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		//jFormattedTextFieldfecha_emisionVentasResumidasMontos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_emisionVentasResumidasMontos.setEnabled(false);
		jDateChooserfecha_emisionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_emisionVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setText("U");
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoVentasResumidasMontos = new JLabelMe();
		this.jLabelfecha_vencimientoVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoVentasResumidasMontos.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelfecha_vencimientoVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		//jFormattedTextFieldfecha_vencimientoVentasResumidasMontos= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoVentasResumidasMontos= new JDateChooser();
		jDateChooserfecha_vencimientoVentasResumidasMontos.setEnabled(false);
		jDateChooserfecha_vencimientoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoVentasResumidasMontos.setDate(new Date());
		jDateChooserfecha_vencimientoVentasResumidasMontos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoVentasResumidasMontos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setText("U");
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoVentasResumidasMontos = new JLabelMe();
		this.jLabelnumero_pre_impresoVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoVentasResumidasMontos.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelnumero_pre_impresoVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldnumero_pre_impresoVentasResumidasMontos= new JTextFieldMe();

		jTextFieldnumero_pre_impresoVentasResumidasMontos.setEnabled(false);
		jTextFieldnumero_pre_impresoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setText("U");
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaVentasResumidasMontos = new JLabelMe();
		this.jLabeltotal_ivaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaVentasResumidasMontos.setToolTipText("Total Iva");
		this.jLabeltotal_ivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneltotal_ivaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldtotal_ivaVentasResumidasMontos= new JTextFieldMe();
		jTextFieldtotal_ivaVentasResumidasMontos.setEnabled(false);
		jTextFieldtotal_ivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaVentasResumidasMontos.setText("0.0");

		this.jButtontotal_ivaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaVentasResumidasMontosBusqueda.setText("U");
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaVentasResumidasMontos = new JLabelMe();
		this.jLabeltotal_sin_ivaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaVentasResumidasMontos.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneltotal_sin_ivaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldtotal_sin_ivaVentasResumidasMontos= new JTextFieldMe();
		jTextFieldtotal_sin_ivaVentasResumidasMontos.setEnabled(false);
		jTextFieldtotal_sin_ivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaVentasResumidasMontos.setText("0.0");

		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setText("U");
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoVentasResumidasMontos = new JLabelMe();
		this.jLabeltotal_descuentoVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoVentasResumidasMontos.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneltotal_descuentoVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldtotal_descuentoVentasResumidasMontos= new JTextFieldMe();
		jTextFieldtotal_descuentoVentasResumidasMontos.setEnabled(false);
		jTextFieldtotal_descuentoVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoVentasResumidasMontos.setText("0.0");

		this.jButtontotal_descuentoVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setText("U");
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroVentasResumidasMontos = new JLabelMe();
		this.jLabeltotal_otroVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroVentasResumidasMontos.setToolTipText("Total Otro");
		this.jLabeltotal_otroVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneltotal_otroVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldtotal_otroVentasResumidasMontos= new JTextFieldMe();
		jTextFieldtotal_otroVentasResumidasMontos.setEnabled(false);
		jTextFieldtotal_otroVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroVentasResumidasMontos.setText("0.0");

		this.jButtontotal_otroVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroVentasResumidasMontosBusqueda.setText("U");
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalVentasResumidasMontos = new JLabelMe();
		this.jLabelsub_totalVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalVentasResumidasMontos.setToolTipText("Sub Total");
		this.jLabelsub_totalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelsub_totalVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldsub_totalVentasResumidasMontos= new JTextFieldMe();
		jTextFieldsub_totalVentasResumidasMontos.setEnabled(false);
		jTextFieldsub_totalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalVentasResumidasMontos.setText("0.0");

		this.jButtonsub_totalVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalVentasResumidasMontosBusqueda.setText("U");
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeltotalVentasResumidasMontos = new JLabelMe();
		this.jLabeltotalVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalVentasResumidasMontos.setToolTipText("Total");
		this.jLabeltotalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneltotalVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldtotalVentasResumidasMontos= new JTextFieldMe();
		jTextFieldtotalVentasResumidasMontos.setEnabled(false);
		jTextFieldtotalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalVentasResumidasMontos.setText("0.0");

		this.jButtontotalVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtontotalVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalVentasResumidasMontosBusqueda.setText("U");
		this.jButtontotalVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabelivaVentasResumidasMontos = new JLabelMe();
		this.jLabelivaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaVentasResumidasMontos.setToolTipText("Iva");
		this.jLabelivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelivaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextFieldivaVentasResumidasMontos= new JTextFieldMe();
		jTextFieldivaVentasResumidasMontos.setEnabled(false);
		jTextFieldivaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaVentasResumidasMontos.setText("0.0");

		this.jButtonivaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonivaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaVentasResumidasMontosBusqueda.setText("U");
		this.jButtonivaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaVentasResumidasMontosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionVentasResumidasMontos = new JLabelMe();
		this.jLabeldescripcionVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionVentasResumidasMontos.setToolTipText("Descripcion");
		this.jLabeldescripcionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPaneldescripcionVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jTextAreadescripcionVentasResumidasMontos= new JTextAreaMe();
		jTextAreadescripcionVentasResumidasMontos.setEnabled(false);
		jTextAreadescripcionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVentasResumidasMontos.setLineWrap(true);
		jTextAreadescripcionVentasResumidasMontos.setWrapStyleWord(true);
		jTextAreadescripcionVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionVentasResumidasMontos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionVentasResumidasMontos = new JScrollPane(jTextAreadescripcionVentasResumidasMontos);
		jscrollPanedescripcionVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtondescripcionVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionVentasResumidasMontosBusqueda.setText("U");
		this.jButtondescripcionVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionVentasResumidasMontosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasResumidasMontos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasResumidasMontos = new JLabelMe();
		this.jLabelid_empresaVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasResumidasMontos.setToolTipText("Empresa");
		this.jLabelid_empresaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelid_empresaVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jComboBoxid_empresaVentasResumidasMontos= new JComboBoxMe();
		jComboBoxid_empresaVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasResumidasMontos.setEnabled(false);

		this.jButtonid_empresaVentasResumidasMontos= new JButtonMe();
		this.jButtonid_empresaVentasResumidasMontos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidasMontos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidasMontos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidasMontos.setText("Buscar");
		this.jButtonid_empresaVentasResumidasMontos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasResumidasMontos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidasMontos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidasMontos"));

		this.jButtonid_empresaVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidasMontosBusqueda.setText("U");
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasResumidasMontosBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasResumidasMontosUpdate= new JButtonMe();
		this.jButtonid_empresaVentasResumidasMontosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidasMontosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidasMontosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidasMontosUpdate.setText("U");
		this.jButtonid_empresaVentasResumidasMontosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasResumidasMontosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidasMontosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidasMontosUpdate"));



					
		this.jLabelid_sucursalVentasResumidasMontos = new JLabelMe();
		this.jLabelid_sucursalVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentasResumidasMontos.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelid_sucursalVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jComboBoxid_sucursalVentasResumidasMontos= new JComboBoxMe();
		jComboBoxid_sucursalVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentasResumidasMontos.setEnabled(false);

		this.jButtonid_sucursalVentasResumidasMontos= new JButtonMe();
		this.jButtonid_sucursalVentasResumidasMontos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidasMontos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidasMontos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidasMontos.setText("Buscar");
		this.jButtonid_sucursalVentasResumidasMontos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentasResumidasMontos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidasMontos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidasMontos"));

		this.jButtonid_sucursalVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasResumidasMontosBusqueda.setText("U");
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentasResumidasMontosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentasResumidasMontosUpdate= new JButtonMe();
		this.jButtonid_sucursalVentasResumidasMontosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidasMontosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidasMontosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasResumidasMontosUpdate.setText("U");
		this.jButtonid_sucursalVentasResumidasMontosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentasResumidasMontosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidasMontosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidasMontosUpdate"));



					
		this.jLabelid_vendedorVentasResumidasMontos = new JLabelMe();
		this.jLabelid_vendedorVentasResumidasMontos.setText(""+VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorVentasResumidasMontos.setToolTipText("Vendedor");
		this.jLabelid_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorVentasResumidasMontos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorVentasResumidasMontos.setToolTipText(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		this.jPanelid_vendedorVentasResumidasMontos.setLayout(this.gridaBagLayoutVentasResumidasMontos);


		jComboBoxid_vendedorVentasResumidasMontos= new JComboBoxMe();
		jComboBoxid_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorVentasResumidasMontos= new JButtonMe();
		this.jButtonid_vendedorVentasResumidasMontos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVentasResumidasMontos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVentasResumidasMontos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVentasResumidasMontos.setText("Buscar");
		this.jButtonid_vendedorVentasResumidasMontos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorVentasResumidasMontos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVentasResumidasMontos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVentasResumidasMontos"));

		this.jButtonid_vendedorVentasResumidasMontosBusqueda= new JButtonMe();
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVentasResumidasMontosBusqueda.setText("U");
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVentasResumidasMontosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVentasResumidasMontosBusqueda"));

		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorVentasResumidasMontosBusqueda.setVisible(false);		}

		this.jButtonid_vendedorVentasResumidasMontosUpdate= new JButtonMe();
		this.jButtonid_vendedorVentasResumidasMontosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVentasResumidasMontosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVentasResumidasMontosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVentasResumidasMontosUpdate.setText("U");
		this.jButtonid_vendedorVentasResumidasMontosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorVentasResumidasMontosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVentasResumidasMontosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVentasResumidasMontosUpdate"));



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
		//this.jInternalFrameDetalleVentasResumidasMontos = new VentasResumidasMontosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Resumidas Montos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidasMontos= new GridBagLayout();
		

		
		String sToolTipVentasResumidasMontos="";
		sToolTipVentasResumidasMontos=VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidasMontos+="(Facturacion.VentasResumidasMontos)";
		}
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidasMontos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasResumidasMontos = new JButtonMe();
		this.jButtonModificarVentasResumidasMontos = new JButtonMe();
        this.jButtonActualizarVentasResumidasMontos = new JButtonMe();
        this.jButtonEliminarVentasResumidasMontos = new JButtonMe();
        this.jButtonCancelarVentasResumidasMontos = new JButtonMe();
        this.jButtonGuardarCambiosVentasResumidasMontos = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasResumidasMontos = new JButtonMe();
		this.jButtonCerrarVentasResumidasMontos = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidasMontos = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasResumidasMontos = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasResumidasMontos = new JScrollPane();
				
		
		
		this.jPanelCamposVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidas Montos";
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidas Montoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidasMontos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasResumidasMontos.setName("jPanelCamposVentasResumidasMontos"); 

		this.jPanelCamposOcultosVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasResumidasMontos.setName("jPanelCamposOcultosVentasResumidasMontos"); 

        this.jPanelAccionesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidasMontos.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidasMontos.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasResumidasMontos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasResumidasMontos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasResumidasMontos.setText("Nuevo");
		this.jButtonModificarVentasResumidasMontos.setText("Editar");
        this.jButtonActualizarVentasResumidasMontos.setText("Actualizar");
        this.jButtonEliminarVentasResumidasMontos.setText("Eliminar");
        this.jButtonCancelarVentasResumidasMontos.setText("Cancelar");
        this.jButtonGuardarCambiosVentasResumidasMontos.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.setText("Guardar");
		this.jButtonCerrarVentasResumidasMontos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidasMontos,"nuevo_button","Nuevo",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasResumidasMontos,"modificar_button","Editar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasResumidasMontos,"actualizar_button","Actualizar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasResumidasMontos,"eliminar_button","Eliminar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasResumidasMontos,"cancelar_button","Cancelar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasResumidasMontos,"guardarcambios_button","Guardar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidasMontos,"guardarcambiostabla_button","Guardar",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidasMontos,"cerrar_button","Salir",this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasResumidasMontos.setToolTipText("Nuevo"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasResumidasMontos.setToolTipText("Editar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasResumidasMontos.setToolTipText("Actualizar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasResumidasMontos.setToolTipText("Eliminar)"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasResumidasMontos.setToolTipText("Cancelar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasResumidasMontos.setToolTipText("Guardar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.setToolTipText("Guardar"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidasMontos.setToolTipText("Salir"+" "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidasMontos";
		inputMap = this.jButtonNuevoVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidasMontos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidasMontos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasResumidasMontos";
		inputMap = this.jButtonActualizarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasResumidasMontos"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasResumidasMontos";
		inputMap = this.jButtonEliminarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasResumidasMontos"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasResumidasMontos";
		inputMap = this.jButtonCancelarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasResumidasMontos"));
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidasMontos";
		inputMap = this.jButtonCerrarVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidasMontos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidasMontos";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidasMontos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidasMontos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasResumidasMontos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasResumidasMontos.setToolTipText("Nuevo VentasResumidasMontos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasResumidasMontos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasResumidasMontos.setToolTipText("Sin Cerrar Ventana VentasResumidasMontos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasResumidasMontos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasResumidasMontos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasResumidasMontos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidasMontos.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidasMontos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasResumidasMontos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasResumidasMontos = new JLabelMe();
		
		this.jLabelAccionesVentasResumidasMontos.setText("Acciones");		
		this.jLabelAccionesVentasResumidasMontos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidasMontos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidasMontos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasResumidasMontos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasResumidasMontos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasResumidasMontos=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasResumidasMontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasResumidasMontos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidasMontos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasResumidasMontos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasResumidasMontos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasResumidasMontos = new GridBagLayout();
		
		this.jPanelCamposVentasResumidasMontos.setLayout(gridaBagLayoutCamposVentasResumidasMontos);
		this.jPanelCamposOcultosVentasResumidasMontos.setLayout(gridaBagLayoutCamposOcultosVentasResumidasMontos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasResumidasMontos.add(jLabelIdVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasResumidasMontos.add(jLabelidVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasResumidasMontos.add(jLabelid_empresaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidasMontos.add(jButtonid_empresaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 3;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidasMontos.add(jButtonid_empresaVentasResumidasMontosUpdate, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasResumidasMontos.add(jComboBoxid_empresaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentasResumidasMontos.add(jLabelid_sucursalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasResumidasMontos.add(jButtonid_sucursalVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 3;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasResumidasMontos.add(jButtonid_sucursalVentasResumidasMontosUpdate, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentasResumidasMontos.add(jComboBoxid_sucursalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorVentasResumidasMontos.add(jLabelid_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVentasResumidasMontos.add(jButtonid_vendedorVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 3;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVentasResumidasMontos.add(jButtonid_vendedorVentasResumidasMontosUpdate, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorVentasResumidasMontos.add(jComboBoxid_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasResumidasMontos.add(jLabelfecha_emision_desdeVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasResumidasMontos.add(jButtonfecha_emision_desdeVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasResumidasMontos.add(jDateChooserfecha_emision_desdeVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasResumidasMontos.add(jLabelfecha_emision_hastaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasResumidasMontos.add(jButtonfecha_emision_hastaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasResumidasMontos.add(jDateChooserfecha_emision_hastaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoVentasResumidasMontos.add(jLabelnombre_completoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoVentasResumidasMontos.add(jButtonnombre_completoVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoVentasResumidasMontos.add(jscrollPanenombre_completoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorVentasResumidasMontos.add(jLabelnombre_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorVentasResumidasMontos.add(jButtonnombre_vendedorVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorVentasResumidasMontos.add(jscrollPanenombre_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_facturaVentasResumidasMontos.add(jLabelnombre_tipo_facturaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_facturaVentasResumidasMontos.add(jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_facturaVentasResumidasMontos.add(jscrollPanenombre_tipo_facturaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionVentasResumidasMontos.add(jLabelfecha_emisionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionVentasResumidasMontos.add(jButtonfecha_emisionVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionVentasResumidasMontos.add(jDateChooserfecha_emisionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoVentasResumidasMontos.add(jLabelfecha_vencimientoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoVentasResumidasMontos.add(jButtonfecha_vencimientoVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoVentasResumidasMontos.add(jDateChooserfecha_vencimientoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoVentasResumidasMontos.add(jLabelnumero_pre_impresoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoVentasResumidasMontos.add(jButtonnumero_pre_impresoVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoVentasResumidasMontos.add(jTextFieldnumero_pre_impresoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaVentasResumidasMontos.add(jLabeltotal_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaVentasResumidasMontos.add(jButtontotal_ivaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaVentasResumidasMontos.add(jTextFieldtotal_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaVentasResumidasMontos.add(jLabeltotal_sin_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaVentasResumidasMontos.add(jButtontotal_sin_ivaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaVentasResumidasMontos.add(jTextFieldtotal_sin_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoVentasResumidasMontos.add(jLabeltotal_descuentoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoVentasResumidasMontos.add(jButtontotal_descuentoVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoVentasResumidasMontos.add(jTextFieldtotal_descuentoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_otroVentasResumidasMontos.add(jLabeltotal_otroVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroVentasResumidasMontos.add(jButtontotal_otroVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_otroVentasResumidasMontos.add(jTextFieldtotal_otroVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalVentasResumidasMontos.add(jLabelsub_totalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalVentasResumidasMontos.add(jButtonsub_totalVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalVentasResumidasMontos.add(jTextFieldsub_totalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalVentasResumidasMontos.add(jLabeltotalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalVentasResumidasMontos.add(jButtontotalVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalVentasResumidasMontos.add(jTextFieldtotalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaVentasResumidasMontos.add(jLabelivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaVentasResumidasMontos.add(jButtonivaVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaVentasResumidasMontos.add(jTextFieldivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionVentasResumidasMontos.add(jLabeldescripcionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = 2;
		this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
		this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionVentasResumidasMontos.add(jButtondescripcionVentasResumidasMontosBusqueda, this.gridBagConstraintsVentasResumidasMontos);
	}

	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
	this.gridBagConstraintsVentasResumidasMontos.gridx = 1;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionVentasResumidasMontos.add(jscrollPanedescripcionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelidVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelid_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelfecha_emision_desdeVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelfecha_emision_hastaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelnombre_completoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelnombre_vendedorVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelnombre_tipo_facturaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelfecha_emisionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelfecha_vencimientoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelnumero_pre_impresoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneltotal_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneltotal_sin_ivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneltotal_descuentoVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneltotal_otroVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelsub_totalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneltotalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPanelivaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidasMontos.add(this.jPaneldescripcionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposVentasResumidasMontos % 2==0) {
		iXPanelCamposVentasResumidasMontos=0;
		iYPanelCamposVentasResumidasMontos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposOcultosVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposOcultosVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasResumidasMontos.add(this.jPanelid_empresaVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposOcultosVentasResumidasMontos % 2==0) {
		iXPanelCamposOcultosVentasResumidasMontos=0;
		iYPanelCamposOcultosVentasResumidasMontos++;
	}
	this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidasMontos.gridy = iYPanelCamposOcultosVentasResumidasMontos;
	this.gridBagConstraintsVentasResumidasMontos.gridx = iXPanelCamposOcultosVentasResumidasMontos++;
	this.gridBagConstraintsVentasResumidasMontos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidasMontos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasResumidasMontos.add(this.jPanelid_sucursalVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);



	if(iXPanelCamposOcultosVentasResumidasMontos % 2==0) {
		iXPanelCamposOcultosVentasResumidasMontos=0;
		iYPanelCamposOcultosVentasResumidasMontos++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidasMontos= new GridBagLayout();
		this.jPanelAccionesVentasResumidasMontos.setLayout(gridaBagLayoutAccionesVentasResumidasMontos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasResumidasMontos= new GridBagLayout();
		this.jPanelAccionesFormularioVentasResumidasMontos.setLayout(gridaBagLayoutAccionesFormularioVentasResumidasMontos);
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasResumidasMontos.add(this.jComboBoxTiposAccionesFormularioVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonModificarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);							

		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;
		this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonEliminarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonActualizarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);


		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonGuardarCambiosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);	
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = 0;		
		this.gridBagConstraintsVentasResumidasMontos.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasResumidasMontos.add(this.jButtonCancelarVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidasMontos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidasMontos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;		
			//this.gridBagConstraintsVentasResumidasMontos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidasMontos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidasMontos.gridx =0;
		this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidasMontos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasResumidasMontos = new VentasResumidasMontosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Resumidas Montos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Resumidas Montos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidas Montos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasResumidasMontosModel ventasresumidasmontosModel=new VentasResumidasMontosModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasResumidasMontosModel.VentasResumidasMontosFocusTraversalPolicy ventasresumidasmontosFocusTraversalPolicy = ventasresumidasmontosModel.new VentasResumidasMontosFocusTraversalPolicy(this);
			
			//ventasresumidasmontosFocusTraversalPolicy.setventasresumidasmontosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventasresumidasmontosModel);
			
			
			this.jContentPaneDetalleVentasResumidasMontos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasResumidasMontos = new GridBagLayout();	
			this.jContentPaneDetalleVentasResumidasMontos.setLayout(gridaBagLayoutDetalleVentasResumidasMontos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidasMontos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
					
				
				this.jContentPaneDetalleVentasResumidasMontos.add(jTtoolBarDetalleVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);								
				
}
			
			this.jScrollPanelDatosEdicionVentasResumidasMontos=   new JScrollPane(jContentPaneDetalleVentasResumidasMontos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasResumidasMontos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidasMontos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	        
			this.jContentPaneDetalleVentasResumidasMontos.add(jPanelCamposVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);
			
			
			
			
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
						//&& ventasresumidasmontosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasResumidasMontos= new GridBagConstraints();
						this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
						this.jContentPaneDetalleVentasResumidasMontos.add(this.jTabbedPaneRelacionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasResumidasMontos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasResumidasMontos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
					this.gridBagConstraintsVentasResumidasMontos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
					
				
					this.jContentPaneDetalleVentasResumidasMontos.add(jPanelCamposOcultosVentasResumidasMontos, gridBagConstraintsVentasResumidasMontos);
				
					this.jPanelCamposOcultosVentasResumidasMontos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	        this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasResumidasMontos.add(this.jPanelAccionesFormularioVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);							
			
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
	        this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasResumidasMontos.add(this.jPanelAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasResumidasMontos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasResumidasMontos=   new JScrollPane(this.jPanelCamposVentasResumidasMontos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidasMontos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
			this.gridBagConstraintsVentasResumidasMontos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasResumidasMontos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasResumidasMontos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);			
			
			this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
			
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		
			
		this.gridBagConstraintsVentasResumidasMontos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidasMontos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidasMontos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidasMontos, this.gridBagConstraintsVentasResumidasMontos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasResumidasMontos;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasResumidasMontos;
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
