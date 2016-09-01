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
import com.bydan.erp.facturacion.util.report.FacturasDescuentosLineasConstantesFunciones;

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
public class FacturasDescuentosLineasDetalleFormJInternalFrame extends FacturasDescuentosLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturasDescuentosLineas;
	
	protected JMenuBar jmenuBarDetalleFacturasDescuentosLineas;
	
	protected JMenu jmenuDetalleFacturasDescuentosLineas;
	protected JMenu jmenuDetalleArchivoFacturasDescuentosLineas;
	protected JMenu jmenuDetalleAccionesFacturasDescuentosLineas;
	protected JMenu jmenuDetalleDatosFacturasDescuentosLineas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasDescuentosLineas;	
	protected GridBagConstraints gridBagConstraintsFacturasDescuentosLineas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturasDescuentosLineasBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturasDescuentosLineas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public FacturasDescuentosLineasSessionBean facturasdescuentoslineasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public FacturasDescuentosLineasLogic facturasdescuentoslineasLogic;
	
	public JScrollPane jScrollPanelDatosFacturasDescuentosLineas;
	public JScrollPane jScrollPanelDatosEdicionFacturasDescuentosLineas;
	public JScrollPane jScrollPanelDatosGeneralFacturasDescuentosLineas;
	
	protected JPanel jPanelCamposFacturasDescuentosLineas;    
	protected JPanel jPanelCamposOcultosFacturasDescuentosLineas;    	
	protected JPanel jPanelAccionesFacturasDescuentosLineas;
	protected JPanel jPanelAccionesFormularioFacturasDescuentosLineas;
    
	
	
	protected Integer iXPanelCamposFacturasDescuentosLineas=0;
	protected Integer iYPanelCamposFacturasDescuentosLineas=0;
	
	protected Integer iXPanelCamposOcultosFacturasDescuentosLineas=0;
	protected Integer iYPanelCamposOcultosFacturasDescuentosLineas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturasDescuentosLineas;
	public JButton jButtonModificarFacturasDescuentosLineas;
	public JButton jButtonActualizarFacturasDescuentosLineas;
    public JButton jButtonEliminarFacturasDescuentosLineas;
	public JButton jButtonCancelarFacturasDescuentosLineas;
    public JButton jButtonGuardarCambiosFacturasDescuentosLineas;
	public JButton jButtonGuardarCambiosTablaFacturasDescuentosLineas;
	protected JButton jButtonCerrarFacturasDescuentosLineas;
	
	
	protected JButton jButtonProcesarInformacionFacturasDescuentosLineas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturasDescuentosLineas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasDescuentosLineas;
	protected JButton jButtonModificarToolBarFacturasDescuentosLineas;
	protected JButton jButtonActualizarToolBarFacturasDescuentosLineas;
    protected JButton jButtonEliminarToolBarFacturasDescuentosLineas;
	protected JButton jButtonCancelarToolBarFacturasDescuentosLineas;
    protected JButton jButtonGuardarCambiosToolBarFacturasDescuentosLineas;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasDescuentosLineas;
	protected JButton jButtonCerrarToolBarFacturasDescuentosLineas;
	
	protected JButton jButtonProcesarInformacionToolBarFacturasDescuentosLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasDescuentosLineas;
	protected JMenuItem jMenuItemModificarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemActualizarFacturasDescuentosLineas;
    protected JMenuItem jMenuItemEliminarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemCancelarFacturasDescuentosLineas;
    protected JMenuItem jMenuItemGuardarCambiosFacturasDescuentosLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasDescuentosLineas;
	protected JMenuItem jMenuItemCerrarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDetalleCerrarFacturasDescuentosLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasDescuentosLineas;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturasDescuentosLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas;
	protected JMenuItem jMenuItemMostrarOcultarFacturasDescuentosLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasDescuentosLineas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasDescuentosLineas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturasDescuentosLineas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturasDescuentosLineas;
	public JLabel jLabelIdFacturasDescuentosLineas;
	public JLabel jLabelidFacturasDescuentosLineas;
	public JButton jButtonidFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeFacturasDescuentosLineas;
	public JLabel jLabelfecha_emision_desdeFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_emision_desdeFacturasDescuentosLineas;
	public JButton jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaFacturasDescuentosLineas;
	public JLabel jLabelfecha_emision_hastaFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_emision_hastaFacturasDescuentosLineas;
	public JButton jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombreFacturasDescuentosLineas;
	public JLabel jLabelnombreFacturasDescuentosLineas;
	public JTextArea jTextAreanombreFacturasDescuentosLineas;
	public JScrollPane jscrollPanenombreFacturasDescuentosLineas;
	public JButton jButtonnombreFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteFacturasDescuentosLineas;
	public JLabel jLabelnombre_completo_clienteFacturasDescuentosLineas;
	public JTextArea jTextAreanombre_completo_clienteFacturasDescuentosLineas;
	public JScrollPane jscrollPanenombre_completo_clienteFacturasDescuentosLineas;
	public JButton jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_facturaFacturasDescuentosLineas;
	public JLabel jLabelnombre_tipo_facturaFacturasDescuentosLineas;
	public JTextArea jTextAreanombre_tipo_facturaFacturasDescuentosLineas;
	public JScrollPane jscrollPanenombre_tipo_facturaFacturasDescuentosLineas;
	public JButton jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturasDescuentosLineas;
	public JLabel jLabelfecha_emisionFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_emisionFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_emisionFacturasDescuentosLineas;
	public JButton jButtonfecha_emisionFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoFacturasDescuentosLineas;
	public JLabel jLabelfecha_vencimientoFacturasDescuentosLineas;
	//public JFormattedTextField jDateChooserfecha_vencimientoFacturasDescuentosLineas;

	public JDateChooser jDateChooserfecha_vencimientoFacturasDescuentosLineas;
	public JButton jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoFacturasDescuentosLineas;
	public JLabel jLabelnumero_pre_impresoFacturasDescuentosLineas;
	public JTextField jTextFieldnumero_pre_impresoFacturasDescuentosLineas;
	public JButton jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoFacturasDescuentosLineas;
	public JLabel jLabeltotal_descuentoFacturasDescuentosLineas;
	public JTextField jTextFieldtotal_descuentoFacturasDescuentosLineas;
	public JButton jButtontotal_descuentoFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroFacturasDescuentosLineas;
	public JLabel jLabeltotal_otroFacturasDescuentosLineas;
	public JTextField jTextFieldtotal_otroFacturasDescuentosLineas;
	public JButton jButtontotal_otroFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalFacturasDescuentosLineas;
	public JLabel jLabelsub_totalFacturasDescuentosLineas;
	public JTextField jTextFieldsub_totalFacturasDescuentosLineas;
	public JButton jButtonsub_totalFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturasDescuentosLineas;
	public JLabel jLabeltotalFacturasDescuentosLineas;
	public JTextField jTextFieldtotalFacturasDescuentosLineas;
	public JButton jButtontotalFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelivaFacturasDescuentosLineas;
	public JLabel jLabelivaFacturasDescuentosLineas;
	public JTextField jTextFieldivaFacturasDescuentosLineas;
	public JButton jButtonivaFacturasDescuentosLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturasDescuentosLineas;
	public JLabel jLabelid_empresaFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturasDescuentosLineas;
	public JButton jButtonid_empresaFacturasDescuentosLineas= new JButtonMe();
	public JButton jButtonid_empresaFacturasDescuentosLineasUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturasDescuentosLineas;
	public JLabel jLabelid_sucursalFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturasDescuentosLineas;
	public JButton jButtonid_sucursalFacturasDescuentosLineas= new JButtonMe();
	public JButton jButtonid_sucursalFacturasDescuentosLineasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturasDescuentosLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorFacturasDescuentosLineas;
	public JLabel jLabelid_vendedorFacturasDescuentosLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFacturasDescuentosLineas;
	public JButton jButtonid_vendedorFacturasDescuentosLineas= new JButtonMe();
	public JButton jButtonid_vendedorFacturasDescuentosLineasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFacturasDescuentosLineasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturasDescuentosLineas;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturasDescuentosLineas=new JPanel();
				this.jPanelAccionesFormularioFacturasDescuentosLineas=new JPanel();
				this.jmenuBarDetalleFacturasDescuentosLineas=new JMenuBar();
				this.jTtoolBarDetalleFacturasDescuentosLineas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturasDescuentosLineasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasDescuentosLineasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasDescuentosLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturasDescuentosLineas() {
		return this.jButtonActualizarToolBarFacturasDescuentosLineas;
	}
	
	public JButton getjButtonEliminarToolBarFacturasDescuentosLineas() {
		return this.jButtonEliminarToolBarFacturasDescuentosLineas;
	}
	
	public JButton getjButtonCancelarToolBarFacturasDescuentosLineas() {
		return this.jButtonCancelarToolBarFacturasDescuentosLineas;
	}		
	
	public JButton getjButtonProcesarInformacionFacturasDescuentosLineas() {
		return this.jButtonProcesarInformacionFacturasDescuentosLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasDescuentosLineas)	{
		this.jButtonProcesarInformacionFacturasDescuentosLineas = jButtonProcesarInformacionFacturasDescuentosLineas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasDescuentosLineas() {
		return this.jComboBoxTiposAccionesFacturasDescuentosLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposRelacionesFacturasDescuentosLineas) {
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas = jComboBoxTiposRelacionesFacturasDescuentosLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasDescuentosLineas(
			JComboBox jComboBoxTiposAccionesFacturasDescuentosLineas) {
		this.jComboBoxTiposAccionesFacturasDescuentosLineas = jComboBoxTiposAccionesFacturasDescuentosLineas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturasDescuentosLineas() {
		return this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturasDescuentosLineas(
			JComboBox jComboBoxTiposAccionesFormularioFacturasDescuentosLineas) {
		this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas = jComboBoxTiposAccionesFormularioFacturasDescuentosLineas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
		
		this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasdescuentoslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasDescuentosLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasDescuentosLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Descuentos Lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturasDescuentosLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturasDescuentosLineas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturasDescuentosLineas=new JButtonMe();
				this.jButtonModificarToolBarFacturasDescuentosLineas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas,
							"actualizar","actualizar","Actualizar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas,
							"eliminar","eliminar","Eliminar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas,
							"cancelar","cancelar","Cancelar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturasDescuentosLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturasDescuentosLineas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturasDescuentosLineas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturasDescuentosLineas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturasDescuentosLineas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturasDescuentosLineas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasDescuentosLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasDescuentosLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasDescuentosLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturasDescuentosLineas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturasDescuentosLineas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturasDescuentosLineas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturasDescuentosLineas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturasDescuentosLineas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturasDescuentosLineas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturasDescuentosLineas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturasDescuentosLineas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturasDescuentosLineas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturasDescuentosLineas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturasDescuentosLineas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturasDescuentosLineas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasDescuentosLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasDescuentosLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasDescuentosLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasDescuentosLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturasDescuentosLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturasDescuentosLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturasDescuentosLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasDescuentosLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasDescuentosLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasDescuentosLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturasDescuentosLineas.add(this.jMenuItemDetalleCerrarFacturasDescuentosLineas);
		
		this.jmenuDetalleAccionesFacturasDescuentosLineas.add(this.jMenuItemActualizarFacturasDescuentosLineas);
		this.jmenuDetalleAccionesFacturasDescuentosLineas.add(this.jMenuItemEliminarFacturasDescuentosLineas);
		this.jmenuDetalleAccionesFacturasDescuentosLineas.add(this.jMenuItemCancelarFacturasDescuentosLineas);		
		
		//this.jmenuDetalleDatosFacturasDescuentosLineas.add(this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas);				
		this.jmenuDetalleDatosFacturasDescuentosLineas.add(this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas);				
				
		//this.jmenuDetalleAccionesFacturasDescuentosLineas.add(this.jMenuItemGuardarCambiosFacturasDescuentosLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturasDescuentosLineas.add(this.jmenuDetalleArchivoFacturasDescuentosLineas);		
		this.jmenuBarDetalleFacturasDescuentosLineas.add(this.jmenuDetalleAccionesFacturasDescuentosLineas);		
		this.jmenuBarDetalleFacturasDescuentosLineas.add(this.jmenuDetalleDatosFacturasDescuentosLineas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturasDescuentosLineas);				
	}
	
	
	public void inicializarElementosCamposFacturasDescuentosLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturasDescuentosLineas = new JLabelMe();
		jLabelIdFacturasDescuentosLineas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturasDescuentosLineas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturasDescuentosLineas= new GridBagLayout();

		this.jPanelidFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);

		jLabelidFacturasDescuentosLineas = new JLabel();
		jLabelidFacturasDescuentosLineas.setText("Id");

		jLabelidFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas = new JLabelMe();
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelfecha_emision_desdeFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		//jFormattedTextFieldfecha_emision_desdeFacturasDescuentosLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setEnabled(false);
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas = new JLabelMe();
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelfecha_emision_hastaFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		//jFormattedTextFieldfecha_emision_hastaFacturasDescuentosLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setEnabled(false);
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombreFacturasDescuentosLineas = new JLabelMe();
		this.jLabelnombreFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFacturasDescuentosLineas.setToolTipText("Nombre");
		this.jLabelnombreFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelnombreFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextAreanombreFacturasDescuentosLineas= new JTextAreaMe();
		jTextAreanombreFacturasDescuentosLineas.setEnabled(false);
		jTextAreanombreFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFacturasDescuentosLineas.setLineWrap(true);
		jTextAreanombreFacturasDescuentosLineas.setWrapStyleWord(true);
		jTextAreanombreFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFacturasDescuentosLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFacturasDescuentosLineas = new JScrollPane(jTextAreanombreFacturasDescuentosLineas);
		jscrollPanenombreFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas = new JLabelMe();
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelnombre_completo_clienteFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextAreanombre_completo_clienteFacturasDescuentosLineas= new JTextAreaMe();
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setEnabled(false);
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setLineWrap(true);
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteFacturasDescuentosLineas = new JScrollPane(jTextAreanombre_completo_clienteFacturasDescuentosLineas);
		jscrollPanenombre_completo_clienteFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas = new JLabelMe();
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA+" : *");
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas.setToolTipText("Nombre Tipo Factura");
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_facturaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_facturaFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_facturaFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelnombre_tipo_facturaFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextAreanombre_tipo_facturaFacturasDescuentosLineas= new JTextAreaMe();
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setEnabled(false);
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setLineWrap(true);
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setWrapStyleWord(true);
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_facturaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_facturaFacturasDescuentosLineas = new JScrollPane(jTextAreanombre_tipo_facturaFacturasDescuentosLineas);
		jscrollPanenombre_tipo_facturaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_facturaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_facturaFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturasDescuentosLineas = new JLabelMe();
		this.jLabelfecha_emisionFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturasDescuentosLineas.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelfecha_emisionFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		//jFormattedTextFieldfecha_emisionFacturasDescuentosLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_emisionFacturasDescuentosLineas.setEnabled(false);
		jDateChooserfecha_emisionFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_emisionFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoFacturasDescuentosLineas = new JLabelMe();
		this.jLabelfecha_vencimientoFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoFacturasDescuentosLineas.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelfecha_vencimientoFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		//jFormattedTextFieldfecha_vencimientoFacturasDescuentosLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoFacturasDescuentosLineas= new JDateChooser();
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setEnabled(false);
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setDate(new Date());
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoFacturasDescuentosLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas = new JLabelMe();
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelnumero_pre_impresoFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldnumero_pre_impresoFacturasDescuentosLineas= new JTextFieldMe();

		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setEnabled(false);
		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoFacturasDescuentosLineas = new JLabelMe();
		this.jLabeltotal_descuentoFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoFacturasDescuentosLineas.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPaneltotal_descuentoFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldtotal_descuentoFacturasDescuentosLineas= new JTextFieldMe();
		jTextFieldtotal_descuentoFacturasDescuentosLineas.setEnabled(false);
		jTextFieldtotal_descuentoFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoFacturasDescuentosLineas.setText("0.0");

		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroFacturasDescuentosLineas = new JLabelMe();
		this.jLabeltotal_otroFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroFacturasDescuentosLineas.setToolTipText("Total Otro");
		this.jLabeltotal_otroFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPaneltotal_otroFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldtotal_otroFacturasDescuentosLineas= new JTextFieldMe();
		jTextFieldtotal_otroFacturasDescuentosLineas.setEnabled(false);
		jTextFieldtotal_otroFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroFacturasDescuentosLineas.setText("0.0");

		this.jButtontotal_otroFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalFacturasDescuentosLineas = new JLabelMe();
		this.jLabelsub_totalFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalFacturasDescuentosLineas.setToolTipText("Sub Total");
		this.jLabelsub_totalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelsub_totalFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldsub_totalFacturasDescuentosLineas= new JTextFieldMe();
		jTextFieldsub_totalFacturasDescuentosLineas.setEnabled(false);
		jTextFieldsub_totalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalFacturasDescuentosLineas.setText("0.0");

		this.jButtonsub_totalFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturasDescuentosLineas = new JLabelMe();
		this.jLabeltotalFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturasDescuentosLineas.setToolTipText("Total");
		this.jLabeltotalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPaneltotalFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldtotalFacturasDescuentosLineas= new JTextFieldMe();
		jTextFieldtotalFacturasDescuentosLineas.setEnabled(false);
		jTextFieldtotalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturasDescuentosLineas.setText("0.0");

		this.jButtontotalFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtontotalFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtontotalFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturasDescuentosLineasBusqueda.setVisible(false);		}


					
		this.jLabelivaFacturasDescuentosLineas = new JLabelMe();
		this.jLabelivaFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFacturasDescuentosLineas.setToolTipText("Iva");
		this.jLabelivaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelivaFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jTextFieldivaFacturasDescuentosLineas= new JTextFieldMe();
		jTextFieldivaFacturasDescuentosLineas.setEnabled(false);
		jTextFieldivaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFacturasDescuentosLineas.setText("0.0");

		this.jButtonivaFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonivaFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonivaFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturasDescuentosLineasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturasDescuentosLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturasDescuentosLineas = new JLabelMe();
		this.jLabelid_empresaFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturasDescuentosLineas.setToolTipText("Empresa");
		this.jLabelid_empresaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelid_empresaFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jComboBoxid_empresaFacturasDescuentosLineas= new JComboBoxMe();
		jComboBoxid_empresaFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturasDescuentosLineas.setEnabled(false);

		this.jButtonid_empresaFacturasDescuentosLineas= new JButtonMe();
		this.jButtonid_empresaFacturasDescuentosLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasDescuentosLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasDescuentosLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturasDescuentosLineas.setText("Buscar");
		this.jButtonid_empresaFacturasDescuentosLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturasDescuentosLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasDescuentosLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasDescuentosLineas"));

		this.jButtonid_empresaFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturasDescuentosLineasBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturasDescuentosLineasUpdate= new JButtonMe();
		this.jButtonid_empresaFacturasDescuentosLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasDescuentosLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturasDescuentosLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturasDescuentosLineasUpdate.setText("U");
		this.jButtonid_empresaFacturasDescuentosLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturasDescuentosLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturasDescuentosLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturasDescuentosLineasUpdate"));



					
		this.jLabelid_sucursalFacturasDescuentosLineas = new JLabelMe();
		this.jLabelid_sucursalFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturasDescuentosLineas.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelid_sucursalFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jComboBoxid_sucursalFacturasDescuentosLineas= new JComboBoxMe();
		jComboBoxid_sucursalFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturasDescuentosLineas.setEnabled(false);

		this.jButtonid_sucursalFacturasDescuentosLineas= new JButtonMe();
		this.jButtonid_sucursalFacturasDescuentosLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasDescuentosLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasDescuentosLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturasDescuentosLineas.setText("Buscar");
		this.jButtonid_sucursalFacturasDescuentosLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturasDescuentosLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasDescuentosLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasDescuentosLineas"));

		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturasDescuentosLineasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturasDescuentosLineasUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setText("U");
		this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturasDescuentosLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturasDescuentosLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturasDescuentosLineasUpdate"));



					
		this.jLabelid_vendedorFacturasDescuentosLineas = new JLabelMe();
		this.jLabelid_vendedorFacturasDescuentosLineas.setText(""+FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorFacturasDescuentosLineas.setToolTipText("Vendedor");
		this.jLabelid_vendedorFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorFacturasDescuentosLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorFacturasDescuentosLineas.setToolTipText(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		this.jPanelid_vendedorFacturasDescuentosLineas.setLayout(this.gridaBagLayoutFacturasDescuentosLineas);


		jComboBoxid_vendedorFacturasDescuentosLineas= new JComboBoxMe();
		jComboBoxid_vendedorFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorFacturasDescuentosLineas= new JButtonMe();
		this.jButtonid_vendedorFacturasDescuentosLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturasDescuentosLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturasDescuentosLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturasDescuentosLineas.setText("Buscar");
		this.jButtonid_vendedorFacturasDescuentosLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorFacturasDescuentosLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturasDescuentosLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturasDescuentosLineas"));

		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda= new JButtonMe();
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setText("U");
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturasDescuentosLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturasDescuentosLineasBusqueda"));

		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorFacturasDescuentosLineasBusqueda.setVisible(false);		}

		this.jButtonid_vendedorFacturasDescuentosLineasUpdate= new JButtonMe();
		this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setText("U");
		this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorFacturasDescuentosLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturasDescuentosLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturasDescuentosLineasUpdate"));



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
		//this.jInternalFrameDetalleFacturasDescuentosLineas = new FacturasDescuentosLineasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturas Descuentos Lineas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasDescuentosLineas= new GridBagLayout();
		

		
		String sToolTipFacturasDescuentosLineas="";
		sToolTipFacturasDescuentosLineas=FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasDescuentosLineas+="(Facturacion.FacturasDescuentosLineas)";
		}
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasDescuentosLineas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturasDescuentosLineas = new JButtonMe();
		this.jButtonModificarFacturasDescuentosLineas = new JButtonMe();
        this.jButtonActualizarFacturasDescuentosLineas = new JButtonMe();
        this.jButtonEliminarFacturasDescuentosLineas = new JButtonMe();
        this.jButtonCancelarFacturasDescuentosLineas = new JButtonMe();
        this.jButtonGuardarCambiosFacturasDescuentosLineas = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas = new JButtonMe();
		this.jButtonCerrarFacturasDescuentosLineas = new JButtonMe();
		
		this.jScrollPanelDatosFacturasDescuentosLineas = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturasDescuentosLineas = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturasDescuentosLineas = new JScrollPane();
				
		
		
		this.jPanelCamposFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Descuentos Lineas";
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Descuentos Lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasDescuentosLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturasDescuentosLineas.setName("jPanelCamposFacturasDescuentosLineas"); 

		this.jPanelCamposOcultosFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturasDescuentosLineas.setName("jPanelCamposOcultosFacturasDescuentosLineas"); 

        this.jPanelAccionesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasDescuentosLineas.setToolTipText("Acciones");
        this.jPanelAccionesFacturasDescuentosLineas.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturasDescuentosLineas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturasDescuentosLineas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturasDescuentosLineas.setText("Nuevo");
		this.jButtonModificarFacturasDescuentosLineas.setText("Editar");
        this.jButtonActualizarFacturasDescuentosLineas.setText("Actualizar");
        this.jButtonEliminarFacturasDescuentosLineas.setText("Eliminar");
        this.jButtonCancelarFacturasDescuentosLineas.setText("Cancelar");
        this.jButtonGuardarCambiosFacturasDescuentosLineas.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setText("Guardar");
		this.jButtonCerrarFacturasDescuentosLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasDescuentosLineas,"nuevo_button","Nuevo",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturasDescuentosLineas,"modificar_button","Editar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturasDescuentosLineas,"actualizar_button","Actualizar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturasDescuentosLineas,"eliminar_button","Eliminar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturasDescuentosLineas,"cancelar_button","Cancelar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturasDescuentosLineas,"guardarcambios_button","Guardar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasDescuentosLineas,"guardarcambiostabla_button","Guardar",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasDescuentosLineas,"cerrar_button","Salir",this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturasDescuentosLineas.setToolTipText("Nuevo"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturasDescuentosLineas.setToolTipText("Editar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturasDescuentosLineas.setToolTipText("Actualizar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturasDescuentosLineas.setToolTipText("Eliminar)"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturasDescuentosLineas.setToolTipText("Cancelar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturasDescuentosLineas.setToolTipText("Guardar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setToolTipText("Guardar"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasDescuentosLineas.setToolTipText("Salir"+" "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasDescuentosLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasDescuentosLineas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturasDescuentosLineas";
		inputMap = this.jButtonActualizarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturasDescuentosLineas"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturasDescuentosLineas";
		inputMap = this.jButtonEliminarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturasDescuentosLineas"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturasDescuentosLineas";
		inputMap = this.jButtonCancelarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturasDescuentosLineas"));
		
		//CERRAR		
		sMapKey = "CerrarFacturasDescuentosLineas";
		inputMap = this.jButtonCerrarFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasDescuentosLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasDescuentosLineas";
		inputMap = this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasDescuentosLineas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturasDescuentosLineas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturasDescuentosLineas.setToolTipText("Nuevo FacturasDescuentosLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas.setToolTipText("Sin Cerrar Ventana FacturasDescuentosLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setText("Accion");
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturasDescuentosLineas = new JLabelMe();
		
		this.jLabelAccionesFacturasDescuentosLineas.setText("Acciones");		
		this.jLabelAccionesFacturasDescuentosLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasDescuentosLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasDescuentosLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturasDescuentosLineas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturasDescuentosLineas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturasDescuentosLineas=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturasDescuentosLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturasDescuentosLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturasDescuentosLineas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturasDescuentosLineas = new GridBagLayout();
		
		this.jPanelCamposFacturasDescuentosLineas.setLayout(gridaBagLayoutCamposFacturasDescuentosLineas);
		this.jPanelCamposOcultosFacturasDescuentosLineas.setLayout(gridaBagLayoutCamposOcultosFacturasDescuentosLineas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturasDescuentosLineas.add(jLabelIdFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturasDescuentosLineas.add(jLabelidFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturasDescuentosLineas.add(jLabelid_empresaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasDescuentosLineas.add(jButtonid_empresaFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 3;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturasDescuentosLineas.add(jButtonid_empresaFacturasDescuentosLineasUpdate, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturasDescuentosLineas.add(jComboBoxid_empresaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFacturasDescuentosLineas.add(jLabelid_sucursalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturasDescuentosLineas.add(jButtonid_sucursalFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 3;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturasDescuentosLineas.add(jButtonid_sucursalFacturasDescuentosLineasUpdate, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFacturasDescuentosLineas.add(jComboBoxid_sucursalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorFacturasDescuentosLineas.add(jLabelid_vendedorFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFacturasDescuentosLineas.add(jButtonid_vendedorFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 3;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFacturasDescuentosLineas.add(jButtonid_vendedorFacturasDescuentosLineasUpdate, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorFacturasDescuentosLineas.add(jComboBoxid_vendedorFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeFacturasDescuentosLineas.add(jLabelfecha_emision_desdeFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeFacturasDescuentosLineas.add(jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeFacturasDescuentosLineas.add(jDateChooserfecha_emision_desdeFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaFacturasDescuentosLineas.add(jLabelfecha_emision_hastaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaFacturasDescuentosLineas.add(jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaFacturasDescuentosLineas.add(jDateChooserfecha_emision_hastaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFacturasDescuentosLineas.add(jLabelnombreFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFacturasDescuentosLineas.add(jButtonnombreFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFacturasDescuentosLineas.add(jscrollPanenombreFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteFacturasDescuentosLineas.add(jLabelnombre_completo_clienteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteFacturasDescuentosLineas.add(jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteFacturasDescuentosLineas.add(jscrollPanenombre_completo_clienteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_facturaFacturasDescuentosLineas.add(jLabelnombre_tipo_facturaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_facturaFacturasDescuentosLineas.add(jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_facturaFacturasDescuentosLineas.add(jscrollPanenombre_tipo_facturaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFacturasDescuentosLineas.add(jLabelfecha_emisionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturasDescuentosLineas.add(jButtonfecha_emisionFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFacturasDescuentosLineas.add(jDateChooserfecha_emisionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoFacturasDescuentosLineas.add(jLabelfecha_vencimientoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoFacturasDescuentosLineas.add(jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoFacturasDescuentosLineas.add(jDateChooserfecha_vencimientoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoFacturasDescuentosLineas.add(jLabelnumero_pre_impresoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoFacturasDescuentosLineas.add(jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoFacturasDescuentosLineas.add(jTextFieldnumero_pre_impresoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoFacturasDescuentosLineas.add(jLabeltotal_descuentoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoFacturasDescuentosLineas.add(jButtontotal_descuentoFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoFacturasDescuentosLineas.add(jTextFieldtotal_descuentoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_otroFacturasDescuentosLineas.add(jLabeltotal_otroFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroFacturasDescuentosLineas.add(jButtontotal_otroFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_otroFacturasDescuentosLineas.add(jTextFieldtotal_otroFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalFacturasDescuentosLineas.add(jLabelsub_totalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalFacturasDescuentosLineas.add(jButtonsub_totalFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalFacturasDescuentosLineas.add(jTextFieldsub_totalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFacturasDescuentosLineas.add(jLabeltotalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturasDescuentosLineas.add(jButtontotalFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFacturasDescuentosLineas.add(jTextFieldtotalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaFacturasDescuentosLineas.add(jLabelivaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		//this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 2;
		this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFacturasDescuentosLineas.add(jButtonivaFacturasDescuentosLineasBusqueda, this.gridBagConstraintsFacturasDescuentosLineas);
	}

	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = 1;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaFacturasDescuentosLineas.add(jTextFieldivaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelidFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelid_vendedorFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelfecha_emision_desdeFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelfecha_emision_hastaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelnombreFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelnombre_completo_clienteFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelnombre_tipo_facturaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelfecha_emisionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelfecha_vencimientoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelnumero_pre_impresoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPaneltotal_descuentoFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPaneltotal_otroFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelsub_totalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPaneltotalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturasDescuentosLineas.add(this.jPanelivaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposFacturasDescuentosLineas % 2==0) {
		iXPanelCamposFacturasDescuentosLineas=0;
		iYPanelCamposFacturasDescuentosLineas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposOcultosFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposOcultosFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasDescuentosLineas.add(this.jPanelid_empresaFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposOcultosFacturasDescuentosLineas % 2==0) {
		iXPanelCamposOcultosFacturasDescuentosLineas=0;
		iYPanelCamposOcultosFacturasDescuentosLineas++;
	}
	this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturasDescuentosLineas.gridy = iYPanelCamposOcultosFacturasDescuentosLineas;
	this.gridBagConstraintsFacturasDescuentosLineas.gridx = iXPanelCamposOcultosFacturasDescuentosLineas++;
	this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturasDescuentosLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturasDescuentosLineas.add(this.jPanelid_sucursalFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);



	if(iXPanelCamposOcultosFacturasDescuentosLineas % 2==0) {
		iXPanelCamposOcultosFacturasDescuentosLineas=0;
		iYPanelCamposOcultosFacturasDescuentosLineas++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturasDescuentosLineas= new GridBagLayout();
		this.jPanelAccionesFacturasDescuentosLineas.setLayout(gridaBagLayoutAccionesFacturasDescuentosLineas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturasDescuentosLineas= new GridBagLayout();
		this.jPanelAccionesFormularioFacturasDescuentosLineas.setLayout(gridaBagLayoutAccionesFormularioFacturasDescuentosLineas);
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturasDescuentosLineas.add(this.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonModificarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);							

		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonEliminarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonActualizarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);


		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonGuardarCambiosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);	
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = 0;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturasDescuentosLineas.add(this.jButtonCancelarFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasDescuentosLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasDescuentosLineas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();						
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;		
			//this.gridBagConstraintsFacturasDescuentosLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasDescuentosLineas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =0;
		this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasDescuentosLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturasDescuentosLineas = new FacturasDescuentosLineasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturas Descuentos Lineas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturas Descuentos Lineas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Descuentos Lineas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturasDescuentosLineasModel facturasdescuentoslineasModel=new FacturasDescuentosLineasModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturasDescuentosLineasModel.FacturasDescuentosLineasFocusTraversalPolicy facturasdescuentoslineasFocusTraversalPolicy = facturasdescuentoslineasModel.new FacturasDescuentosLineasFocusTraversalPolicy(this);
			
			//facturasdescuentoslineasFocusTraversalPolicy.setfacturasdescuentoslineasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturasdescuentoslineasModel);
			
			
			this.jContentPaneDetalleFacturasDescuentosLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturasDescuentosLineas = new GridBagLayout();	
			this.jContentPaneDetalleFacturasDescuentosLineas.setLayout(gridaBagLayoutDetalleFacturasDescuentosLineas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasDescuentosLineas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
				this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
					
				
				this.jContentPaneDetalleFacturasDescuentosLineas.add(jTtoolBarDetalleFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);								
				
}
			
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas=   new JScrollPane(jContentPaneDetalleFacturasDescuentosLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	        
			this.jContentPaneDetalleFacturasDescuentosLineas.add(jPanelCamposFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);
			
			
			
			
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
						//&& facturasdescuentoslineasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturasDescuentosLineas= new GridBagConstraints();
						this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
						this.jContentPaneDetalleFacturasDescuentosLineas.add(this.jTabbedPaneRelacionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturasDescuentosLineas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturasDescuentosLineas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
					this.gridBagConstraintsFacturasDescuentosLineas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
					
				
					this.jContentPaneDetalleFacturasDescuentosLineas.add(jPanelCamposOcultosFacturasDescuentosLineas, gridBagConstraintsFacturasDescuentosLineas);
				
					this.jPanelCamposOcultosFacturasDescuentosLineas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	        this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturasDescuentosLineas.add(this.jPanelAccionesFormularioFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);							
			
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
	        this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturasDescuentosLineas.add(this.jPanelAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturasDescuentosLineas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas=   new JScrollPane(this.jPanelCamposFacturasDescuentosLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
			this.gridBagConstraintsFacturasDescuentosLineas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturasDescuentosLineas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturasDescuentosLineas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);			
			
			this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
			this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
			
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		
			
		this.gridBagConstraintsFacturasDescuentosLineas = new GridBagConstraints();
		this.gridBagConstraintsFacturasDescuentosLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasDescuentosLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasDescuentosLineas, this.gridBagConstraintsFacturasDescuentosLineas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturasDescuentosLineas;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturasDescuentosLineas;
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
