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
import com.bydan.erp.facturacion.util.ParametroFactuConstantesFunciones;

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
public class ParametroFactuDetalleFormJInternalFrame extends ParametroFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFactu;
	
	protected JMenuBar jmenuBarDetalleParametroFactu;
	
	protected JMenu jmenuDetalleParametroFactu;
	protected JMenu jmenuDetalleArchivoParametroFactu;
	protected JMenu jmenuDetalleAccionesParametroFactu;
	protected JMenu jmenuDetalleDatosParametroFactu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactu;	
	protected GridBagConstraints gridBagConstraintsParametroFactu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFactuBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFactu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefactuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefactu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinan="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotro="";

	protected FormatoBeanSwingJInternalFrame formatoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoproforma="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected FormatoBeanSwingJInternalFrame formatofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatofactura="";

	protected FormatoBeanSwingJInternalFrame formatonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotacredito="";

	protected FormatoBeanSwingJInternalFrame formatoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoinventario="";
	
	public ParametroFactuSessionBean parametrofactuSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CuentaContableSessionBean cuentacontablefactuSessionBean;
	public CuentaContableSessionBean cuentacontablefinanSessionBean;
	public CuentaContableSessionBean cuentacontableotroSessionBean;
	public FormatoSessionBean formatoproformaSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public FormatoSessionBean formatofacturaSessionBean;
	public FormatoSessionBean formatonotacreditoSessionBean;
	public FormatoSessionBean formatoinventarioSessionBean;	
	
	public ParametroFactuLogic parametrofactuLogic;
	
	public JScrollPane jScrollPanelDatosParametroFactu;
	public JScrollPane jScrollPanelDatosEdicionParametroFactu;
	public JScrollPane jScrollPanelDatosGeneralParametroFactu;
	
	protected JPanel jPanelCamposParametroFactu;    
	protected JPanel jPanelCamposOcultosParametroFactu;    	
	protected JPanel jPanelAccionesParametroFactu;
	protected JPanel jPanelAccionesFormularioParametroFactu;
    
	
	
	protected Integer iXPanelCamposParametroFactu=0;
	protected Integer iYPanelCamposParametroFactu=0;
	
	protected Integer iXPanelCamposOcultosParametroFactu=0;
	protected Integer iYPanelCamposOcultosParametroFactu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFactu;
	public JButton jButtonModificarParametroFactu;
	public JButton jButtonActualizarParametroFactu;
    public JButton jButtonEliminarParametroFactu;
	public JButton jButtonCancelarParametroFactu;
    public JButton jButtonGuardarCambiosParametroFactu;
	public JButton jButtonGuardarCambiosTablaParametroFactu;
	protected JButton jButtonCerrarParametroFactu;
	
	
	protected JButton jButtonProcesarInformacionParametroFactu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFactu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFactu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFactu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactu;
	protected JButton jButtonModificarToolBarParametroFactu;
	protected JButton jButtonActualizarToolBarParametroFactu;
    protected JButton jButtonEliminarToolBarParametroFactu;
	protected JButton jButtonCancelarToolBarParametroFactu;
    protected JButton jButtonGuardarCambiosToolBarParametroFactu;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactu;
	protected JButton jButtonCerrarToolBarParametroFactu;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactu;
	protected JMenuItem jMenuItemModificarParametroFactu;
	protected JMenuItem jMenuItemActualizarParametroFactu;
    protected JMenuItem jMenuItemEliminarParametroFactu;
	protected JMenuItem jMenuItemCancelarParametroFactu;
    protected JMenuItem jMenuItemGuardarCambiosParametroFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactu;
	protected JMenuItem jMenuItemCerrarParametroFactu;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactu;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactu;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFactu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFactu;
	public JLabel jLabelIdParametroFactu;
	public JLabel jLabelidParametroFactu;
	public JButton jButtonidParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_proformaParametroFactu;
	public JLabel jLabelsecuencial_proformaParametroFactu;
	public JTextField jTextFieldsecuencial_proformaParametroFactu;
	public JButton jButtonsecuencial_proformaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelsecuancial_pedidoParametroFactu;
	public JLabel jLabelsecuancial_pedidoParametroFactu;
	public JTextField jTextFieldsecuancial_pedidoParametroFactu;
	public JButton jButtonsecuancial_pedidoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_facturaParametroFactu;
	public JLabel jLabelsecuencial_facturaParametroFactu;
	public JTextField jTextFieldsecuencial_facturaParametroFactu;
	public JButton jButtonsecuencial_facturaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_nota_creditoParametroFactu;
	public JLabel jLabelsecuencial_nota_creditoParametroFactu;
	public JTextField jTextFieldsecuencial_nota_creditoParametroFactu;
	public JButton jButtonsecuencial_nota_creditoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelitem_proformaParametroFactu;
	public JLabel jLabelitem_proformaParametroFactu;
	public JTextField jTextFielditem_proformaParametroFactu;
	public JButton jButtonitem_proformaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelitem_pedidoParametroFactu;
	public JLabel jLabelitem_pedidoParametroFactu;
	public JTextField jTextFielditem_pedidoParametroFactu;
	public JButton jButtonitem_pedidoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelitem_facturaParametroFactu;
	public JLabel jLabelitem_facturaParametroFactu;
	public JTextField jTextFielditem_facturaParametroFactu;
	public JButton jButtonitem_facturaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelitem_nota_creditoParametroFactu;
	public JLabel jLabelitem_nota_creditoParametroFactu;
	public JTextField jTextFielditem_nota_creditoParametroFactu;
	public JButton jButtonitem_nota_creditoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelitem_inventarioParametroFactu;
	public JLabel jLabelitem_inventarioParametroFactu;
	public JTextField jTextFielditem_inventarioParametroFactu;
	public JButton jButtonitem_inventarioParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalle_proformaParametroFactu;
	public JLabel jLabelcon_detalle_proformaParametroFactu;
	public JCheckBox jCheckBoxcon_detalle_proformaParametroFactu;
	public JButton jButtoncon_detalle_proformaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalle_pedidoParametroFactu;
	public JLabel jLabelcon_detalle_pedidoParametroFactu;
	public JCheckBox jCheckBoxcon_detalle_pedidoParametroFactu;
	public JButton jButtoncon_detalle_pedidoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalle_facturaParametroFactu;
	public JLabel jLabelcon_detalle_facturaParametroFactu;
	public JCheckBox jCheckBoxcon_detalle_facturaParametroFactu;
	public JButton jButtoncon_detalle_facturaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalle_nota_creditoParametroFactu;
	public JLabel jLabelcon_detalle_nota_creditoParametroFactu;
	public JCheckBox jCheckBoxcon_detalle_nota_creditoParametroFactu;
	public JButton jButtoncon_detalle_nota_creditoParametroFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFactu;
	public JLabel jLabelid_empresaParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFactu;
	public JButton jButtonid_empresaParametroFactu= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFactu;
	public JLabel jLabelid_sucursalParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFactu;
	public JButton jButtonid_sucursalParametroFactu= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_factuParametroFactu;
	public JLabel jLabelid_cuenta_contable_factuParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_factuParametroFactu;
	public JButton jButtonid_cuenta_contable_factuParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuParametroFactuArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_finanParametroFactu;
	public JLabel jLabelid_cuenta_contable_finanParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finanParametroFactu;
	public JButton jButtonid_cuenta_contable_finanParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_otroParametroFactu;
	public JLabel jLabelid_cuenta_contable_otroParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otroParametroFactu;
	public JButton jButtonid_cuenta_contable_otroParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroParametroFactuArbol= new JButtonMe();

	public JPanel jPanelid_formato_proformaParametroFactu;
	public JLabel jLabelid_formato_proformaParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_proformaParametroFactu;
	public JButton jButtonid_formato_proformaParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_proformaParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_proformaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_pedidoParametroFactu;
	public JLabel jLabelid_formato_pedidoParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoParametroFactu;
	public JButton jButtonid_formato_pedidoParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_facturaParametroFactu;
	public JLabel jLabelid_formato_facturaParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_facturaParametroFactu;
	public JButton jButtonid_formato_facturaParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_facturaParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_facturaParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nota_creditoParametroFactu;
	public JLabel jLabelid_formato_nota_creditoParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_creditoParametroFactu;
	public JButton jButtonid_formato_nota_creditoParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoParametroFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_inventarioParametroFactu;
	public JLabel jLabelid_formato_inventarioParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_inventarioParametroFactu;
	public JButton jButtonid_formato_inventarioParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_inventarioParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_inventarioParametroFactuBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFactu;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFactuDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFactu=new JPanel();
				this.jPanelAccionesFormularioParametroFactu=new JPanel();
				this.jmenuBarDetalleParametroFactu=new JMenuBar();
				this.jTtoolBarDetalleParametroFactu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFactuDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFactu() {
		return this.jButtonActualizarToolBarParametroFactu;
	}
	
	public JButton getjButtonEliminarToolBarParametroFactu() {
		return this.jButtonEliminarToolBarParametroFactu;
	}
	
	public JButton getjButtonCancelarToolBarParametroFactu() {
		return this.jButtonCancelarToolBarParametroFactu;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFactu() {
		return this.jButtonProcesarInformacionParametroFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactu)	{
		this.jButtonProcesarInformacionParametroFactu = jButtonProcesarInformacionParametroFactu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactu() {
		return this.jComboBoxTiposAccionesParametroFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactu(
			JComboBox jComboBoxTiposRelacionesParametroFactu) {
		this.jComboBoxTiposRelacionesParametroFactu = jComboBoxTiposRelacionesParametroFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactu(
			JComboBox jComboBoxTiposAccionesParametroFactu) {
		this.jComboBoxTiposAccionesParametroFactu = jComboBoxTiposAccionesParametroFactu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFactu() {
		return this.jComboBoxTiposAccionesFormularioParametroFactu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFactu(
			JComboBox jComboBoxTiposAccionesFormularioParametroFactu) {
		this.jComboBoxTiposAccionesFormularioParametroFactu = jComboBoxTiposAccionesFormularioParametroFactu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofactuSessionBean=new ParametroFactuSessionBean();
		
		this.parametrofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Factu MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFactu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFactu=new JButtonMe();
				this.jButtonModificarToolBarParametroFactu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFactu,this.jTtoolBarDetalleParametroFactu,
							"actualizar","actualizar","Actualizar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFactu,this.jTtoolBarDetalleParametroFactu,
							"eliminar","eliminar","Eliminar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFactu,this.jTtoolBarDetalleParametroFactu,
							"cancelar","cancelar","Cancelar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFactu,this.jTtoolBarDetalleParametroFactu,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFactu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFactu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFactu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFactu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFactu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFactu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFactu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFactu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFactu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFactu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFactu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFactu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFactu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFactu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFactu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFactu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFactu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFactu.add(this.jMenuItemDetalleCerrarParametroFactu);
		
		this.jmenuDetalleAccionesParametroFactu.add(this.jMenuItemActualizarParametroFactu);
		this.jmenuDetalleAccionesParametroFactu.add(this.jMenuItemEliminarParametroFactu);
		this.jmenuDetalleAccionesParametroFactu.add(this.jMenuItemCancelarParametroFactu);		
		
		//this.jmenuDetalleDatosParametroFactu.add(this.jMenuItemDetalleAbrirOrderByParametroFactu);				
		this.jmenuDetalleDatosParametroFactu.add(this.jMenuItemDetalleMostarOcultarParametroFactu);				
				
		//this.jmenuDetalleAccionesParametroFactu.add(this.jMenuItemGuardarCambiosParametroFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFactu.add(this.jmenuDetalleArchivoParametroFactu);		
		this.jmenuBarDetalleParametroFactu.add(this.jmenuDetalleAccionesParametroFactu);		
		this.jmenuBarDetalleParametroFactu.add(this.jmenuDetalleDatosParametroFactu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFactu);				
	}
	
	
	public void inicializarElementosCamposParametroFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFactu = new JLabelMe();
		jLabelIdParametroFactu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFactu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFactu= new GridBagLayout();

		this.jPanelidParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);

		jLabelidParametroFactu = new JLabel();
		jLabelidParametroFactu.setText("Id");

		jLabelidParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencial_proformaParametroFactu = new JLabelMe();
		this.jLabelsecuencial_proformaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_SECUENCIALPROFORMA+" : *");
		this.jLabelsecuencial_proformaParametroFactu.setToolTipText("Secuencial Proforma");
		this.jLabelsecuencial_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_proformaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_proformaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_SECUENCIALPROFORMA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelsecuencial_proformaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFieldsecuencial_proformaParametroFactu= new JTextFieldMe();

		jTextFieldsecuencial_proformaParametroFactu.setEnabled(false);
		jTextFieldsecuencial_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_proformaParametroFactuBusqueda= new JButtonMe();
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_proformaParametroFactuBusqueda.setText("U");
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_proformaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_proformaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_proformaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelsecuancial_pedidoParametroFactu = new JLabelMe();
		this.jLabelsecuancial_pedidoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_SECUANCIALPEDIDO+" : *");
		this.jLabelsecuancial_pedidoParametroFactu.setToolTipText("Secuancial Pedido");
		this.jLabelsecuancial_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuancial_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuancial_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuancial_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuancial_pedidoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuancial_pedidoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_SECUANCIALPEDIDO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelsecuancial_pedidoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFieldsecuancial_pedidoParametroFactu= new JTextFieldMe();

		jTextFieldsecuancial_pedidoParametroFactu.setEnabled(false);
		jTextFieldsecuancial_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuancial_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuancial_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuancial_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuancial_pedidoParametroFactuBusqueda= new JButtonMe();
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuancial_pedidoParametroFactuBusqueda.setText("U");
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuancial_pedidoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuancial_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuancial_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuancial_pedidoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuancial_pedidoParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_facturaParametroFactu = new JLabelMe();
		this.jLabelsecuencial_facturaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_SECUENCIALFACTURA+" : *");
		this.jLabelsecuencial_facturaParametroFactu.setToolTipText("Secuencial Factura");
		this.jLabelsecuencial_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_facturaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_facturaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_SECUENCIALFACTURA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelsecuencial_facturaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFieldsecuencial_facturaParametroFactu= new JTextFieldMe();

		jTextFieldsecuencial_facturaParametroFactu.setEnabled(false);
		jTextFieldsecuencial_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_facturaParametroFactuBusqueda= new JButtonMe();
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_facturaParametroFactuBusqueda.setText("U");
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_facturaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_facturaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_facturaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_nota_creditoParametroFactu = new JLabelMe();
		this.jLabelsecuencial_nota_creditoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_SECUENCIALNOTACREDITO+" : *");
		this.jLabelsecuencial_nota_creditoParametroFactu.setToolTipText("Secuencial Nota Credito");
		this.jLabelsecuencial_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_nota_creditoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_nota_creditoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_SECUENCIALNOTACREDITO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelsecuencial_nota_creditoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFieldsecuencial_nota_creditoParametroFactu= new JTextFieldMe();

		jTextFieldsecuencial_nota_creditoParametroFactu.setEnabled(false);
		jTextFieldsecuencial_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda= new JButtonMe();
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setText("U");
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_nota_creditoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_nota_creditoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_nota_creditoParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelitem_proformaParametroFactu = new JLabelMe();
		this.jLabelitem_proformaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_ITEMPROFORMA+" : *");
		this.jLabelitem_proformaParametroFactu.setToolTipText("Item Proforma");
		this.jLabelitem_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelitem_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelitem_proformaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelitem_proformaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ITEMPROFORMA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelitem_proformaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFielditem_proformaParametroFactu= new JTextFieldMe();
		jTextFielditem_proformaParametroFactu.setEnabled(false);
		jTextFielditem_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielditem_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielditem_proformaParametroFactu.setText("0");

		this.jButtonitem_proformaParametroFactuBusqueda= new JButtonMe();
		this.jButtonitem_proformaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_proformaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_proformaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonitem_proformaParametroFactuBusqueda.setText("U");
		this.jButtonitem_proformaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonitem_proformaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonitem_proformaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielditem_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielditem_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"item_proformaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonitem_proformaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelitem_pedidoParametroFactu = new JLabelMe();
		this.jLabelitem_pedidoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_ITEMPEDIDO+" : *");
		this.jLabelitem_pedidoParametroFactu.setToolTipText("Item Pedido");
		this.jLabelitem_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelitem_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelitem_pedidoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelitem_pedidoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ITEMPEDIDO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelitem_pedidoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFielditem_pedidoParametroFactu= new JTextFieldMe();
		jTextFielditem_pedidoParametroFactu.setEnabled(false);
		jTextFielditem_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielditem_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielditem_pedidoParametroFactu.setText("0");

		this.jButtonitem_pedidoParametroFactuBusqueda= new JButtonMe();
		this.jButtonitem_pedidoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_pedidoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_pedidoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonitem_pedidoParametroFactuBusqueda.setText("U");
		this.jButtonitem_pedidoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonitem_pedidoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonitem_pedidoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielditem_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielditem_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"item_pedidoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonitem_pedidoParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelitem_facturaParametroFactu = new JLabelMe();
		this.jLabelitem_facturaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_ITEMFACTURA+" : *");
		this.jLabelitem_facturaParametroFactu.setToolTipText("Item Factura");
		this.jLabelitem_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelitem_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelitem_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelitem_facturaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelitem_facturaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ITEMFACTURA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelitem_facturaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFielditem_facturaParametroFactu= new JTextFieldMe();
		jTextFielditem_facturaParametroFactu.setEnabled(false);
		jTextFielditem_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielditem_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielditem_facturaParametroFactu.setText("0");

		this.jButtonitem_facturaParametroFactuBusqueda= new JButtonMe();
		this.jButtonitem_facturaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_facturaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_facturaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonitem_facturaParametroFactuBusqueda.setText("U");
		this.jButtonitem_facturaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonitem_facturaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonitem_facturaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielditem_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielditem_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"item_facturaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonitem_facturaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelitem_nota_creditoParametroFactu = new JLabelMe();
		this.jLabelitem_nota_creditoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_ITEMNOTACREDITO+" : *");
		this.jLabelitem_nota_creditoParametroFactu.setToolTipText("Item Nota Credito");
		this.jLabelitem_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelitem_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelitem_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelitem_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelitem_nota_creditoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelitem_nota_creditoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ITEMNOTACREDITO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelitem_nota_creditoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFielditem_nota_creditoParametroFactu= new JTextFieldMe();
		jTextFielditem_nota_creditoParametroFactu.setEnabled(false);
		jTextFielditem_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielditem_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielditem_nota_creditoParametroFactu.setText("0");

		this.jButtonitem_nota_creditoParametroFactuBusqueda= new JButtonMe();
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonitem_nota_creditoParametroFactuBusqueda.setText("U");
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonitem_nota_creditoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielditem_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielditem_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"item_nota_creditoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonitem_nota_creditoParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelitem_inventarioParametroFactu = new JLabelMe();
		this.jLabelitem_inventarioParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_ITEMINVENTARIO+" : *");
		this.jLabelitem_inventarioParametroFactu.setToolTipText("Item Inventario");
		this.jLabelitem_inventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelitem_inventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelitem_inventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelitem_inventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelitem_inventarioParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelitem_inventarioParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_ITEMINVENTARIO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelitem_inventarioParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jTextFielditem_inventarioParametroFactu= new JTextFieldMe();
		jTextFielditem_inventarioParametroFactu.setEnabled(false);
		jTextFielditem_inventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_inventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielditem_inventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielditem_inventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielditem_inventarioParametroFactu.setText("0");

		this.jButtonitem_inventarioParametroFactuBusqueda= new JButtonMe();
		this.jButtonitem_inventarioParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_inventarioParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonitem_inventarioParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonitem_inventarioParametroFactuBusqueda.setText("U");
		this.jButtonitem_inventarioParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonitem_inventarioParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonitem_inventarioParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielditem_inventarioParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielditem_inventarioParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"item_inventarioParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonitem_inventarioParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalle_proformaParametroFactu = new JLabelMe();
		this.jLabelcon_detalle_proformaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_CONDETALLEPROFORMA+" : *");
		this.jLabelcon_detalle_proformaParametroFactu.setToolTipText("Con Detalle Proforma");
		this.jLabelcon_detalle_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_detalle_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_detalle_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalle_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalle_proformaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalle_proformaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_CONDETALLEPROFORMA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelcon_detalle_proformaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jCheckBoxcon_detalle_proformaParametroFactu= new JCheckBoxMe();
		jCheckBoxcon_detalle_proformaParametroFactu.setEnabled(false);

		jCheckBoxcon_detalle_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalle_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalle_proformaParametroFactuBusqueda= new JButtonMe();
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalle_proformaParametroFactuBusqueda.setText("U");
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalle_proformaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalle_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalle_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalle_proformaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalle_proformaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalle_pedidoParametroFactu = new JLabelMe();
		this.jLabelcon_detalle_pedidoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_CONDETALLEPEDIDO+" : *");
		this.jLabelcon_detalle_pedidoParametroFactu.setToolTipText("Con Detalle Pedido");
		this.jLabelcon_detalle_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_detalle_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_detalle_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalle_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalle_pedidoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalle_pedidoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_CONDETALLEPEDIDO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelcon_detalle_pedidoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jCheckBoxcon_detalle_pedidoParametroFactu= new JCheckBoxMe();
		jCheckBoxcon_detalle_pedidoParametroFactu.setEnabled(false);

		jCheckBoxcon_detalle_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalle_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalle_pedidoParametroFactuBusqueda= new JButtonMe();
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setText("U");
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalle_pedidoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalle_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalle_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalle_pedidoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalle_pedidoParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalle_facturaParametroFactu = new JLabelMe();
		this.jLabelcon_detalle_facturaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_CONDETALLEFACTURA+" : *");
		this.jLabelcon_detalle_facturaParametroFactu.setToolTipText("Con Detalle Factura");
		this.jLabelcon_detalle_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_detalle_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_detalle_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalle_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalle_facturaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalle_facturaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_CONDETALLEFACTURA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelcon_detalle_facturaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jCheckBoxcon_detalle_facturaParametroFactu= new JCheckBoxMe();
		jCheckBoxcon_detalle_facturaParametroFactu.setEnabled(false);

		jCheckBoxcon_detalle_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalle_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalle_facturaParametroFactuBusqueda= new JButtonMe();
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalle_facturaParametroFactuBusqueda.setText("U");
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalle_facturaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalle_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalle_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalle_facturaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalle_facturaParametroFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalle_nota_creditoParametroFactu = new JLabelMe();
		this.jLabelcon_detalle_nota_creditoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_CONDETALLENOTACREDITO+" : *");
		this.jLabelcon_detalle_nota_creditoParametroFactu.setToolTipText("Con Detalle Nota Credito");
		this.jLabelcon_detalle_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_detalle_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_detalle_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalle_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalle_nota_creditoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalle_nota_creditoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_CONDETALLENOTACREDITO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelcon_detalle_nota_creditoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jCheckBoxcon_detalle_nota_creditoParametroFactu= new JCheckBoxMe();
		jCheckBoxcon_detalle_nota_creditoParametroFactu.setEnabled(false);

		jCheckBoxcon_detalle_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalle_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalle_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda= new JButtonMe();
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setText("U");
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalle_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalle_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalle_nota_creditoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalle_nota_creditoParametroFactuBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFactu = new JLabelMe();
		this.jLabelid_empresaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFactu.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_empresaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_empresaParametroFactu= new JComboBoxMe();
		jComboBoxid_empresaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFactu.setEnabled(false);

		this.jButtonid_empresaParametroFactu= new JButtonMe();
		this.jButtonid_empresaParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactu.setText("Buscar");
		this.jButtonid_empresaParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactu"));

		this.jButtonid_empresaParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuBusqueda.setText("U");
		this.jButtonid_empresaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFactuUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuUpdate.setText("U");
		this.jButtonid_empresaParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuUpdate"));



					
		this.jLabelid_sucursalParametroFactu = new JLabelMe();
		this.jLabelid_sucursalParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFactu.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_sucursalParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_sucursalParametroFactu= new JComboBoxMe();
		jComboBoxid_sucursalParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroFactu.setEnabled(false);

		this.jButtonid_sucursalParametroFactu= new JButtonMe();
		this.jButtonid_sucursalParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactu.setText("Buscar");
		this.jButtonid_sucursalParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactu"));

		this.jButtonid_sucursalParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuBusqueda.setText("U");
		this.jButtonid_sucursalParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFactuUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuUpdate.setText("U");
		this.jButtonid_sucursalParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuUpdate"));



					
		this.jLabelid_cuenta_contable_factuParametroFactu = new JLabelMe();
		this.jLabelid_cuenta_contable_factuParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFACTU+" : *");
		this.jLabelid_cuenta_contable_factuParametroFactu.setToolTipText("Cuenta Contable Factu");
		this.jLabelid_cuenta_contable_factuParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_factuParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_factuParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_factuParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_factuParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_factuParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFACTU);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_cuenta_contable_factuParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_cuenta_contable_factuParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_factuParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_factuParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_factuParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_factuParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_factuParametroFactu= new JButtonMe();
		this.jButtonid_cuenta_contable_factuParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_factuParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_factuParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_factuParametroFactu.setText("Buscar");
		this.jButtonid_cuenta_contable_factuParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_factuParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_factuParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_factuParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_factuParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_factuParametroFactu"));

		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setText("U");
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_factuParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_factuParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_factuParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_factuParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_factuParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_factuParametroFactuUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setText("U");
		this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_factuParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_factuParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_factuParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_factuParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_factuParametroFactuUpdate"));


		jButtonid_cuenta_contable_factuParametroFactuArbol= new JButtonMe();
		jButtonid_cuenta_contable_factuParametroFactuArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_factuParametroFactuArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_factuParametroFactuArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_factuParametroFactuArbol.setText("Arbol");
		jButtonid_cuenta_contable_factuParametroFactuArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_factuParametroFactuArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_factuParametroFactuArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_factuParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_factuParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_factuParametroFactuArbol"));



					
		this.jLabelid_cuenta_contable_finanParametroFactu = new JLabelMe();
		this.jLabelid_cuenta_contable_finanParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN+" : *");
		this.jLabelid_cuenta_contable_finanParametroFactu.setToolTipText("Cuenta Contable Finan");
		this.jLabelid_cuenta_contable_finanParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_finanParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_finanParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finanParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_finanParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_finanParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_cuenta_contable_finanParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_cuenta_contable_finanParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finanParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finanParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_finanParametroFactu= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactu.setText("Buscar");
		this.jButtonid_cuenta_contable_finanParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_finanParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_finanParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactu"));

		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setText("U");
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_finanParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_finanParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_finanParametroFactuUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setText("U");
		this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_finanParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_finanParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuUpdate"));


		jButtonid_cuenta_contable_finanParametroFactuArbol= new JButtonMe();
		jButtonid_cuenta_contable_finanParametroFactuArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuArbol.setText("Arbol");
		jButtonid_cuenta_contable_finanParametroFactuArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_finanParametroFactuArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_finanParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuArbol"));



					
		this.jLabelid_cuenta_contable_otroParametroFactu = new JLabelMe();
		this.jLabelid_cuenta_contable_otroParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEOTRO+" : *");
		this.jLabelid_cuenta_contable_otroParametroFactu.setToolTipText("Cuenta Contable Otro");
		this.jLabelid_cuenta_contable_otroParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_otroParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_otroParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otroParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_otroParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_otroParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEOTRO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_cuenta_contable_otroParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_cuenta_contable_otroParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otroParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otroParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otroParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otroParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_otroParametroFactu= new JButtonMe();
		this.jButtonid_cuenta_contable_otroParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otroParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otroParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otroParametroFactu.setText("Buscar");
		this.jButtonid_cuenta_contable_otroParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_otroParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otroParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_otroParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otroParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otroParametroFactu"));

		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setText("U");
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otroParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_otroParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otroParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otroParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_otroParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_otroParametroFactuUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setText("U");
		this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_otroParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otroParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_otroParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otroParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otroParametroFactuUpdate"));


		jButtonid_cuenta_contable_otroParametroFactuArbol= new JButtonMe();
		jButtonid_cuenta_contable_otroParametroFactuArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otroParametroFactuArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otroParametroFactuArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otroParametroFactuArbol.setText("Arbol");
		jButtonid_cuenta_contable_otroParametroFactuArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_otroParametroFactuArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otroParametroFactuArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_otroParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otroParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otroParametroFactuArbol"));



					
		this.jLabelid_formato_proformaParametroFactu = new JLabelMe();
		this.jLabelid_formato_proformaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDFORMATOPROFORMA+" : *");
		this.jLabelid_formato_proformaParametroFactu.setToolTipText("Formato Proforma");
		this.jLabelid_formato_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_proformaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_proformaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDFORMATOPROFORMA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_formato_proformaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_formato_proformaParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_proformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_proformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_proformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_proformaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_proformaParametroFactu= new JButtonMe();
		this.jButtonid_formato_proformaParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_proformaParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_proformaParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_proformaParametroFactu.setText("Buscar");
		this.jButtonid_formato_proformaParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_proformaParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_proformaParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_proformaParametroFactu"));

		this.jButtonid_formato_proformaParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_formato_proformaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_proformaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_proformaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_proformaParametroFactuBusqueda.setText("U");
		this.jButtonid_formato_proformaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_proformaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_proformaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_proformaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_proformaParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_formato_proformaParametroFactuUpdate= new JButtonMe();
		this.jButtonid_formato_proformaParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_proformaParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_proformaParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_proformaParametroFactuUpdate.setText("U");
		this.jButtonid_formato_proformaParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_proformaParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_proformaParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_proformaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_proformaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_proformaParametroFactuUpdate"));



					
		this.jLabelid_formato_pedidoParametroFactu = new JLabelMe();
		this.jLabelid_formato_pedidoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDFORMATOPEDIDO+" : *");
		this.jLabelid_formato_pedidoParametroFactu.setToolTipText("Formato Pedo");
		this.jLabelid_formato_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_pedidoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_pedidoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDFORMATOPEDIDO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_formato_pedidoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_formato_pedidoParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_pedidoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_pedidoParametroFactu= new JButtonMe();
		this.jButtonid_formato_pedidoParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroFactu.setText("Buscar");
		this.jButtonid_formato_pedidoParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_pedidoParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroFactu"));

		this.jButtonid_formato_pedidoParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroFactuBusqueda.setText("U");
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_pedidoParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_formato_pedidoParametroFactuUpdate= new JButtonMe();
		this.jButtonid_formato_pedidoParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroFactuUpdate.setText("U");
		this.jButtonid_formato_pedidoParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_pedidoParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_pedidoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroFactuUpdate"));



					
		this.jLabelid_formato_facturaParametroFactu = new JLabelMe();
		this.jLabelid_formato_facturaParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDFORMATOFACTURA+" : *");
		this.jLabelid_formato_facturaParametroFactu.setToolTipText("Formato Factura");
		this.jLabelid_formato_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_facturaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_facturaParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDFORMATOFACTURA);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_formato_facturaParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_formato_facturaParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_facturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_facturaParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_facturaParametroFactu= new JButtonMe();
		this.jButtonid_formato_facturaParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaParametroFactu.setText("Buscar");
		this.jButtonid_formato_facturaParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_facturaParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaParametroFactu"));

		this.jButtonid_formato_facturaParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_formato_facturaParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_facturaParametroFactuBusqueda.setText("U");
		this.jButtonid_formato_facturaParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_facturaParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_facturaParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_formato_facturaParametroFactuUpdate= new JButtonMe();
		this.jButtonid_formato_facturaParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_facturaParametroFactuUpdate.setText("U");
		this.jButtonid_formato_facturaParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_facturaParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_facturaParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaParametroFactuUpdate"));



					
		this.jLabelid_formato_nota_creditoParametroFactu = new JLabelMe();
		this.jLabelid_formato_nota_creditoParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDFORMATONOTACREDITO+" : *");
		this.jLabelid_formato_nota_creditoParametroFactu.setToolTipText("Formato Nota Credito");
		this.jLabelid_formato_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nota_creditoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nota_creditoParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDFORMATONOTACREDITO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_formato_nota_creditoParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_formato_nota_creditoParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_nota_creditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_creditoParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nota_creditoParametroFactu= new JButtonMe();
		this.jButtonid_formato_nota_creditoParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoParametroFactu.setText("Buscar");
		this.jButtonid_formato_nota_creditoParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nota_creditoParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoParametroFactu"));

		this.jButtonid_formato_nota_creditoParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setText("U");
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nota_creditoParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_formato_nota_creditoParametroFactuUpdate= new JButtonMe();
		this.jButtonid_formato_nota_creditoParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_creditoParametroFactuUpdate.setText("U");
		this.jButtonid_formato_nota_creditoParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nota_creditoParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nota_creditoParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoParametroFactuUpdate"));



					
		this.jLabelid_formato_inventarioParametroFactu = new JLabelMe();
		this.jLabelid_formato_inventarioParametroFactu.setText(""+ParametroFactuConstantesFunciones.LABEL_IDFORMATOINVENTARIO+" : *");
		this.jLabelid_formato_inventarioParametroFactu.setToolTipText("Formato Inventario");
		this.jLabelid_formato_inventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_inventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_inventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_inventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_inventarioParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_inventarioParametroFactu.setToolTipText(ParametroFactuConstantesFunciones.LABEL_IDFORMATOINVENTARIO);
		this.gridaBagLayoutParametroFactu = new GridBagLayout();
		this.jPanelid_formato_inventarioParametroFactu.setLayout(this.gridaBagLayoutParametroFactu);


		jComboBoxid_formato_inventarioParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_inventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_inventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_inventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_inventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_inventarioParametroFactu= new JButtonMe();
		this.jButtonid_formato_inventarioParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_inventarioParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_inventarioParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_inventarioParametroFactu.setText("Buscar");
		this.jButtonid_formato_inventarioParametroFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_inventarioParametroFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_inventarioParametroFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_inventarioParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_inventarioParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_inventarioParametroFactu"));

		this.jButtonid_formato_inventarioParametroFactuBusqueda= new JButtonMe();
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_inventarioParametroFactuBusqueda.setText("U");
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_inventarioParametroFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_inventarioParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_inventarioParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_inventarioParametroFactuBusqueda"));

		if(this.parametrofactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_inventarioParametroFactuBusqueda.setVisible(false);		}

		this.jButtonid_formato_inventarioParametroFactuUpdate= new JButtonMe();
		this.jButtonid_formato_inventarioParametroFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_inventarioParametroFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_inventarioParametroFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_inventarioParametroFactuUpdate.setText("U");
		this.jButtonid_formato_inventarioParametroFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_inventarioParametroFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_inventarioParametroFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_inventarioParametroFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_inventarioParametroFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_inventarioParametroFactuUpdate"));



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
		//this.jInternalFrameDetalleParametroFactu = new ParametroFactuBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Factu DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactu= new GridBagLayout();
		

		
		String sToolTipParametroFactu="";
		sToolTipParametroFactu=ParametroFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactu+="(Facturacion.ParametroFactu)";
		}
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFactu = new JButtonMe();
		this.jButtonModificarParametroFactu = new JButtonMe();
        this.jButtonActualizarParametroFactu = new JButtonMe();
        this.jButtonEliminarParametroFactu = new JButtonMe();
        this.jButtonCancelarParametroFactu = new JButtonMe();
        this.jButtonGuardarCambiosParametroFactu = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFactu = new JButtonMe();
		this.jButtonCerrarParametroFactu = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactu = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFactu = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFactu = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Factu";
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFactu.setName("jPanelCamposParametroFactu"); 

		this.jPanelCamposOcultosParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFactu.setName("jPanelCamposOcultosParametroFactu"); 

        this.jPanelAccionesParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactu.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactu.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFactu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFactu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFactu.setText("Nuevo");
		this.jButtonModificarParametroFactu.setText("Editar");
        this.jButtonActualizarParametroFactu.setText("Actualizar");
        this.jButtonEliminarParametroFactu.setText("Eliminar");
        this.jButtonCancelarParametroFactu.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFactu.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFactu.setText("Guardar");
		this.jButtonCerrarParametroFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactu,"nuevo_button","Nuevo",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFactu,"modificar_button","Editar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFactu,"actualizar_button","Actualizar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFactu,"eliminar_button","Eliminar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFactu,"cancelar_button","Cancelar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFactu,"guardarcambios_button","Guardar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactu,"guardarcambiostabla_button","Guardar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactu,"cerrar_button","Salir",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFactu.setToolTipText("Nuevo"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFactu.setToolTipText("Editar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFactu.setToolTipText("Actualizar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFactu.setToolTipText("Eliminar)"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFactu.setToolTipText("Cancelar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFactu.setToolTipText("Guardar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFactu.setToolTipText("Guardar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactu.setToolTipText("Salir"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactu";
		inputMap = this.jButtonNuevoParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFactu";
		inputMap = this.jButtonActualizarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFactu"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFactu";
		inputMap = this.jButtonEliminarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFactu"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFactu";
		inputMap = this.jButtonCancelarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFactu"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFactu";
		inputMap = this.jButtonCerrarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactu";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFactu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFactu.setToolTipText("Nuevo ParametroFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFactu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFactu.setToolTipText("Sin Cerrar Ventana ParametroFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFactu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFactu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactu.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFactu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFactu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFactu = new JLabelMe();
		
		this.jLabelAccionesParametroFactu.setText("Acciones");		
		this.jLabelAccionesParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFactu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFactu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFactu=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFactu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFactu = new GridBagLayout();
		
		this.jPanelCamposParametroFactu.setLayout(gridaBagLayoutCamposParametroFactu);
		this.jPanelCamposOcultosParametroFactu.setLayout(gridaBagLayoutCamposOcultosParametroFactu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFactu.add(jLabelIdParametroFactu, this.gridBagConstraintsParametroFactu);



	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFactu.add(jLabelidParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFactu.add(jLabelid_empresaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactu.add(jButtonid_empresaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactu.add(jButtonid_empresaParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFactu.add(jComboBoxid_empresaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFactu.add(jLabelid_sucursalParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactu.add(jButtonid_sucursalParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactu.add(jButtonid_sucursalParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFactu.add(jComboBoxid_sucursalParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_factuParametroFactu.add(jLabelid_cuenta_contable_factuParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 2;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_factuParametroFactu.add(jButtonid_cuenta_contable_factuParametroFactu, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 3;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_factuParametroFactu.add(jButtonid_cuenta_contable_factuParametroFactuArbol, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 4;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_factuParametroFactu.add(jButtonid_cuenta_contable_factuParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 5;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_factuParametroFactu.add(jButtonid_cuenta_contable_factuParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_factuParametroFactu.add(jComboBoxid_cuenta_contable_factuParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_finanParametroFactu.add(jLabelid_cuenta_contable_finanParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 2;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finanParametroFactu.add(jButtonid_cuenta_contable_finanParametroFactu, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 3;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finanParametroFactu.add(jButtonid_cuenta_contable_finanParametroFactuArbol, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 4;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finanParametroFactu.add(jButtonid_cuenta_contable_finanParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 5;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finanParametroFactu.add(jButtonid_cuenta_contable_finanParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_finanParametroFactu.add(jComboBoxid_cuenta_contable_finanParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_otroParametroFactu.add(jLabelid_cuenta_contable_otroParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 2;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_otroParametroFactu.add(jButtonid_cuenta_contable_otroParametroFactu, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 3;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_otroParametroFactu.add(jButtonid_cuenta_contable_otroParametroFactuArbol, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 4;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otroParametroFactu.add(jButtonid_cuenta_contable_otroParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 5;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otroParametroFactu.add(jButtonid_cuenta_contable_otroParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_otroParametroFactu.add(jComboBoxid_cuenta_contable_otroParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_proformaParametroFactu.add(jLabelid_formato_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_proformaParametroFactu.add(jButtonid_formato_proformaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_proformaParametroFactu.add(jButtonid_formato_proformaParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_proformaParametroFactu.add(jComboBoxid_formato_proformaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_pedidoParametroFactu.add(jLabelid_formato_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroFactu.add(jButtonid_formato_pedidoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroFactu.add(jButtonid_formato_pedidoParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_pedidoParametroFactu.add(jComboBoxid_formato_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_facturaParametroFactu.add(jLabelid_formato_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_facturaParametroFactu.add(jButtonid_formato_facturaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_facturaParametroFactu.add(jButtonid_formato_facturaParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_facturaParametroFactu.add(jComboBoxid_formato_facturaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nota_creditoParametroFactu.add(jLabelid_formato_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_creditoParametroFactu.add(jButtonid_formato_nota_creditoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_creditoParametroFactu.add(jButtonid_formato_nota_creditoParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nota_creditoParametroFactu.add(jComboBoxid_formato_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_inventarioParametroFactu.add(jLabelid_formato_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_inventarioParametroFactu.add(jButtonid_formato_inventarioParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 3;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_inventarioParametroFactu.add(jButtonid_formato_inventarioParametroFactuUpdate, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_inventarioParametroFactu.add(jComboBoxid_formato_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_proformaParametroFactu.add(jLabelsecuencial_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_proformaParametroFactu.add(jButtonsecuencial_proformaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_proformaParametroFactu.add(jTextFieldsecuencial_proformaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuancial_pedidoParametroFactu.add(jLabelsecuancial_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuancial_pedidoParametroFactu.add(jButtonsecuancial_pedidoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuancial_pedidoParametroFactu.add(jTextFieldsecuancial_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_facturaParametroFactu.add(jLabelsecuencial_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_facturaParametroFactu.add(jButtonsecuencial_facturaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_facturaParametroFactu.add(jTextFieldsecuencial_facturaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_nota_creditoParametroFactu.add(jLabelsecuencial_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_nota_creditoParametroFactu.add(jButtonsecuencial_nota_creditoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_nota_creditoParametroFactu.add(jTextFieldsecuencial_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelitem_proformaParametroFactu.add(jLabelitem_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelitem_proformaParametroFactu.add(jButtonitem_proformaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelitem_proformaParametroFactu.add(jTextFielditem_proformaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelitem_pedidoParametroFactu.add(jLabelitem_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelitem_pedidoParametroFactu.add(jButtonitem_pedidoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelitem_pedidoParametroFactu.add(jTextFielditem_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelitem_facturaParametroFactu.add(jLabelitem_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelitem_facturaParametroFactu.add(jButtonitem_facturaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelitem_facturaParametroFactu.add(jTextFielditem_facturaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelitem_nota_creditoParametroFactu.add(jLabelitem_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelitem_nota_creditoParametroFactu.add(jButtonitem_nota_creditoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelitem_nota_creditoParametroFactu.add(jTextFielditem_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelitem_inventarioParametroFactu.add(jLabelitem_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelitem_inventarioParametroFactu.add(jButtonitem_inventarioParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelitem_inventarioParametroFactu.add(jTextFielditem_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalle_proformaParametroFactu.add(jLabelcon_detalle_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalle_proformaParametroFactu.add(jButtoncon_detalle_proformaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalle_proformaParametroFactu.add(jCheckBoxcon_detalle_proformaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalle_pedidoParametroFactu.add(jLabelcon_detalle_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalle_pedidoParametroFactu.add(jButtoncon_detalle_pedidoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalle_pedidoParametroFactu.add(jCheckBoxcon_detalle_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalle_facturaParametroFactu.add(jLabelcon_detalle_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalle_facturaParametroFactu.add(jButtoncon_detalle_facturaParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalle_facturaParametroFactu.add(jCheckBoxcon_detalle_facturaParametroFactu, this.gridBagConstraintsParametroFactu);


	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 0;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalle_nota_creditoParametroFactu.add(jLabelcon_detalle_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 2;
		this.gridBagConstraintsParametroFactu.ipadx = 0;
		this.gridBagConstraintsParametroFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalle_nota_creditoParametroFactu.add(jButtoncon_detalle_nota_creditoParametroFactuBusqueda, this.gridBagConstraintsParametroFactu);
	}

	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactu.gridy = 0;
	this.gridBagConstraintsParametroFactu.gridx = 1;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalle_nota_creditoParametroFactu.add(jCheckBoxcon_detalle_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelidParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_cuenta_contable_factuParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_cuenta_contable_finanParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_cuenta_contable_otroParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_formato_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_formato_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_formato_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_formato_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelid_formato_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelsecuencial_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelsecuancial_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelsecuencial_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelsecuencial_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelitem_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelitem_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelitem_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelitem_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelitem_inventarioParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelcon_detalle_proformaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelcon_detalle_pedidoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelcon_detalle_facturaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFactu.add(this.jPanelcon_detalle_nota_creditoParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposParametroFactu % 3==0) {
		iXPanelCamposParametroFactu=0;
		iYPanelCamposParametroFactu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposOcultosParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposOcultosParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactu.add(this.jPanelid_empresaParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposOcultosParametroFactu % 3==0) {
		iXPanelCamposOcultosParametroFactu=0;
		iYPanelCamposOcultosParametroFactu++;
	}
	this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactu.gridy = iYPanelCamposOcultosParametroFactu;
	this.gridBagConstraintsParametroFactu.gridx = iXPanelCamposOcultosParametroFactu++;
	this.gridBagConstraintsParametroFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactu.add(this.jPanelid_sucursalParametroFactu, this.gridBagConstraintsParametroFactu);



	if(iXPanelCamposOcultosParametroFactu % 3==0) {
		iXPanelCamposOcultosParametroFactu=0;
		iYPanelCamposOcultosParametroFactu++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFactu= new GridBagLayout();
		this.jPanelAccionesParametroFactu.setLayout(gridaBagLayoutAccionesParametroFactu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFactu= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFactu.setLayout(gridaBagLayoutAccionesFormularioParametroFactu);
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactu.add(this.jComboBoxTiposAccionesFormularioParametroFactu, this.gridBagConstraintsParametroFactu);

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactu.add(this.jCheckBoxPostAccionNuevoParametroFactu, this.gridBagConstraintsParametroFactu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofactuSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactu.add(this.jCheckBoxPostAccionSinCerrarParametroFactu, this.gridBagConstraintsParametroFactu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofactuSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactu.add(this.jCheckBoxPostAccionSinMensajeParametroFactu, this.gridBagConstraintsParametroFactu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFactu.add(this.jButtonModificarParametroFactu, this.gridBagConstraintsParametroFactu);							

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFactu.add(this.jButtonEliminarParametroFactu, this.gridBagConstraintsParametroFactu);
		
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = 0;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactu.add(this.jButtonActualizarParametroFactu, this.gridBagConstraintsParametroFactu);


		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = 0;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactu.add(this.jButtonGuardarCambiosParametroFactu, this.gridBagConstraintsParametroFactu);	
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = 0;		
		this.gridBagConstraintsParametroFactu.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFactu.add(this.jButtonCancelarParametroFactu, this.gridBagConstraintsParametroFactu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactu.gridx = 0;		
			//this.gridBagConstraintsParametroFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactu.gridx =0;
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactu, this.gridBagConstraintsParametroFactu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFactuJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFactu = new ParametroFactuBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Factu DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Factu DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Factu Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFactuModel parametrofactuModel=new ParametroFactuModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFactuModel.ParametroFactuFocusTraversalPolicy parametrofactuFocusTraversalPolicy = parametrofactuModel.new ParametroFactuFocusTraversalPolicy(this);
			
			//parametrofactuFocusTraversalPolicy.setparametrofactuJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofactuModel);
			
			
			this.jContentPaneDetalleParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFactu = new GridBagLayout();	
			this.jContentPaneDetalleParametroFactu.setLayout(gridaBagLayoutDetalleParametroFactu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFactu = new GridBagConstraints();
				this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFactu.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFactu.add(jTtoolBarDetalleParametroFactu, gridBagConstraintsParametroFactu);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFactu=   new JScrollPane(jContentPaneDetalleParametroFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFactu.gridx = 0;
	        
			this.jContentPaneDetalleParametroFactu.add(jPanelCamposParametroFactu, gridBagConstraintsParametroFactu);
			
			
			
			
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
						&& parametrofactuSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofactuSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFactu= new GridBagConstraints();
						this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFactu.gridx = 0;
						this.jContentPaneDetalleParametroFactu.add(this.jTabbedPaneRelacionesParametroFactu, this.gridBagConstraintsParametroFactu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFactu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFactu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFactu = new GridBagConstraints();
					this.gridBagConstraintsParametroFactu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFactu.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFactu.add(jPanelCamposOcultosParametroFactu, gridBagConstraintsParametroFactu);
				
					this.jPanelCamposOcultosParametroFactu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFactu.gridx = 0;
	        this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFactu.add(this.jPanelAccionesFormularioParametroFactu, this.gridBagConstraintsParametroFactu);							
			
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
	        this.gridBagConstraintsParametroFactu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFactu.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFactu.add(this.jPanelAccionesParametroFactu, this.gridBagConstraintsParametroFactu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFactu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFactu=   new JScrollPane(this.jPanelCamposParametroFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactu.gridx = 0;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFactu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFactu, this.gridBagConstraintsParametroFactu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFactu, this.gridBagConstraintsParametroFactu);			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFactu, this.gridBagConstraintsParametroFactu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactu, this.gridBagConstraintsParametroFactu);
			
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactu, this.gridBagConstraintsParametroFactu);
		
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactu, this.gridBagConstraintsParametroFactu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFactu;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFactu;
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
