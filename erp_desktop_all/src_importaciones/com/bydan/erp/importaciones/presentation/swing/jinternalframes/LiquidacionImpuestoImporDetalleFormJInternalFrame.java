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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class LiquidacionImpuestoImporDetalleFormJInternalFrame extends LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor;
	
	protected JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor;
	
	protected JMenu jmenuDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleArchivoLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleAccionesLiquidacionImpuestoImpor;
	protected JMenu jmenuDetalleDatosLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLiquidacionImpuestoImpor;	
	protected GridBagConstraints gridBagConstraintsLiquidacionImpuestoImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleLiquidacionImpuestoImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompraimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean;
	
	

	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleLiquidacionImpuestoImpor=false;
	public DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean;
	
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;	
	
	public LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic;
	
	public JScrollPane jScrollPanelDatosLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosEdicionLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosGeneralLiquidacionImpuestoImpor;
	
	protected JPanel jPanelCamposLiquidacionImpuestoImpor;    
	protected JPanel jPanelCamposOcultosLiquidacionImpuestoImpor;    	
	protected JPanel jPanelAccionesLiquidacionImpuestoImpor;
	protected JPanel jPanelAccionesFormularioLiquidacionImpuestoImpor;
    
	
	
	protected Integer iXPanelCamposLiquidacionImpuestoImpor=0;
	protected Integer iYPanelCamposLiquidacionImpuestoImpor=0;
	
	protected Integer iXPanelCamposOcultosLiquidacionImpuestoImpor=0;
	protected Integer iYPanelCamposOcultosLiquidacionImpuestoImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLiquidacionImpuestoImpor;
	public JButton jButtonModificarLiquidacionImpuestoImpor;
	public JButton jButtonActualizarLiquidacionImpuestoImpor;
    public JButton jButtonEliminarLiquidacionImpuestoImpor;
	public JButton jButtonCancelarLiquidacionImpuestoImpor;
    public JButton jButtonGuardarCambiosLiquidacionImpuestoImpor;
	public JButton jButtonGuardarCambiosTablaLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonProcesarInformacionLiquidacionImpuestoImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonModificarToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonActualizarToolBarLiquidacionImpuestoImpor;
    protected JButton jButtonEliminarToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonCancelarToolBarLiquidacionImpuestoImpor;
    protected JButton jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarToolBarLiquidacionImpuestoImpor;
	
	protected JButton jButtonProcesarInformacionToolBarLiquidacionImpuestoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemModificarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemActualizarLiquidacionImpuestoImpor;
    protected JMenuItem jMenuItemEliminarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCancelarLiquidacionImpuestoImpor;
    protected JMenuItem jMenuItemGuardarCambiosLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCerrarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleCerrarLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemMostrarOcultarLiquidacionImpuestoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLiquidacionImpuestoImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLiquidacionImpuestoImpor;
	public JLabel jLabelIdLiquidacionImpuestoImpor;
	public JLabel jLabelidLiquidacionImpuestoImpor;
	public JButton jButtonidLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteLiquidacionImpuestoImpor;
	public JLabel jLabelnumero_comprobanteLiquidacionImpuestoImpor;
	public JTextField jTextFieldnumero_comprobanteLiquidacionImpuestoImpor;
	public JButton jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_duiLiquidacionImpuestoImpor;
	public JLabel jLabelnumero_duiLiquidacionImpuestoImpor;
	public JTextField jTextFieldnumero_duiLiquidacionImpuestoImpor;
	public JButton jButtonnumero_duiLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfechaLiquidacionImpuestoImpor;
	public JLabel jLabelfechaLiquidacionImpuestoImpor;
	//public JFormattedTextField jDateChooserfechaLiquidacionImpuestoImpor;

	public JDateChooser jDateChooserfechaLiquidacionImpuestoImpor;
	public JButton jButtonfechaLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoLiquidacionImpuestoImpor;
	public JLabel jLabelfecha_pagoLiquidacionImpuestoImpor;
	//public JFormattedTextField jDateChooserfecha_pagoLiquidacionImpuestoImpor;

	public JDateChooser jDateChooserfecha_pagoLiquidacionImpuestoImpor;
	public JButton jButtonfecha_pagoLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfobLiquidacionImpuestoImpor;
	public JLabel jLabelfobLiquidacionImpuestoImpor;
	public JTextField jTextFieldfobLiquidacionImpuestoImpor;
	public JButton jButtonfobLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelseguroLiquidacionImpuestoImpor;
	public JLabel jLabelseguroLiquidacionImpuestoImpor;
	public JTextField jTextFieldseguroLiquidacionImpuestoImpor;
	public JButton jButtonseguroLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelfleteLiquidacionImpuestoImpor;
	public JLabel jLabelfleteLiquidacionImpuestoImpor;
	public JTextField jTextFieldfleteLiquidacionImpuestoImpor;
	public JButton jButtonfleteLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_fodiLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_fodiLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_fodiLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ivaLiquidacionImpuestoImpor;
	public JLabel jLabelporcentaje_ivaLiquidacionImpuestoImpor;
	public JTextField jTextFieldporcentaje_ivaLiquidacionImpuestoImpor;
	public JButton jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPaneltasa_controlLiquidacionImpuestoImpor;
	public JLabel jLabeltasa_controlLiquidacionImpuestoImpor;
	public JTextField jTextFieldtasa_controlLiquidacionImpuestoImpor;
	public JButton jButtontasa_controlLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelcfrLiquidacionImpuestoImpor;
	public JLabel jLabelcfrLiquidacionImpuestoImpor;
	public JTextField jTextFieldcfrLiquidacionImpuestoImpor;
	public JButton jButtoncfrLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelcifLiquidacionImpuestoImpor;
	public JLabel jLabelcifLiquidacionImpuestoImpor;
	public JTextField jTextFieldcifLiquidacionImpuestoImpor;
	public JButton jButtoncifLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPaneltotalLiquidacionImpuestoImpor;
	public JLabel jLabeltotalLiquidacionImpuestoImpor;
	public JTextField jTextFieldtotalLiquidacionImpuestoImpor;
	public JButton jButtontotalLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_compra_imporLiquidacionImpuestoImpor;
	public JLabel jLabelid_pedido_compra_imporLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor;
	public JButton jButtonid_pedido_compra_imporLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaLiquidacionImpuestoImpor;
	public JLabel jLabelid_empresaLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLiquidacionImpuestoImpor;
	public JButton jButtonid_empresaLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_empresaLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalLiquidacionImpuestoImpor;
	public JLabel jLabelid_sucursalLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalLiquidacionImpuestoImpor;
	public JButton jButtonid_sucursalLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_sucursalLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteLiquidacionImpuestoImpor;
	public JLabel jLabelid_clienteLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteLiquidacionImpuestoImpor;
	public JButton jButtonid_clienteLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_clienteLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_clienteLiquidacionImpuestoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaLiquidacionImpuestoImpor;
	public JLabel jLabelid_facturaLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaLiquidacionImpuestoImpor;
	public JButton jButtonid_facturaLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_facturaLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_facturaLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLiquidacionImpuestoImpor;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLiquidacionImpuestoImpor=new JPanel();
				this.jPanelAccionesFormularioLiquidacionImpuestoImpor=new JPanel();
				this.jmenuBarDetalleLiquidacionImpuestoImpor=new JMenuBar();
				this.jTtoolBarDetalleLiquidacionImpuestoImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LiquidacionImpuestoImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImpuestoImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLiquidacionImpuestoImpor() {
		return this.jButtonActualizarToolBarLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonEliminarToolBarLiquidacionImpuestoImpor() {
		return this.jButtonEliminarToolBarLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonCancelarToolBarLiquidacionImpuestoImpor() {
		return this.jButtonCancelarToolBarLiquidacionImpuestoImpor;
	}		
	
	public JButton getjButtonProcesarInformacionLiquidacionImpuestoImpor() {
		return this.jButtonProcesarInformacionLiquidacionImpuestoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLiquidacionImpuestoImpor)	{
		this.jButtonProcesarInformacionLiquidacionImpuestoImpor = jButtonProcesarInformacionLiquidacionImpuestoImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposRelacionesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor = jComboBoxTiposRelacionesLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor = jComboBoxTiposAccionesLiquidacionImpuestoImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor = jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		
		this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LiquidacionImpuestoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Liquidacion Impuesto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
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
	
		LiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLiquidacionImpuestoImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLiquidacionImpuestoImpor=new JButtonMe();
				this.jButtonModificarToolBarLiquidacionImpuestoImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"actualizar","actualizar","Actualizar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"eliminar","eliminar","Eliminar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"cancelar","cancelar","Cancelar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLiquidacionImpuestoImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLiquidacionImpuestoImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLiquidacionImpuestoImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLiquidacionImpuestoImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLiquidacionImpuestoImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLiquidacionImpuestoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLiquidacionImpuestoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLiquidacionImpuestoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLiquidacionImpuestoImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLiquidacionImpuestoImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLiquidacionImpuestoImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLiquidacionImpuestoImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLiquidacionImpuestoImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLiquidacionImpuestoImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLiquidacionImpuestoImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLiquidacionImpuestoImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLiquidacionImpuestoImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLiquidacionImpuestoImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLiquidacionImpuestoImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLiquidacionImpuestoImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLiquidacionImpuestoImpor.add(this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor);
		
		this.jmenuDetalleAccionesLiquidacionImpuestoImpor.add(this.jMenuItemActualizarLiquidacionImpuestoImpor);
		this.jmenuDetalleAccionesLiquidacionImpuestoImpor.add(this.jMenuItemEliminarLiquidacionImpuestoImpor);
		this.jmenuDetalleAccionesLiquidacionImpuestoImpor.add(this.jMenuItemCancelarLiquidacionImpuestoImpor);		
		
		//this.jmenuDetalleDatosLiquidacionImpuestoImpor.add(this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor);				
		this.jmenuDetalleDatosLiquidacionImpuestoImpor.add(this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor);				
				
		//this.jmenuDetalleAccionesLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleArchivoLiquidacionImpuestoImpor);		
		this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleAccionesLiquidacionImpuestoImpor);		
		this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleDatosLiquidacionImpuestoImpor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuDetalleLiquidacionImpuestoImpor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLiquidacionImpuestoImpor);				
	}
	
	
	public void inicializarElementosCamposLiquidacionImpuestoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLiquidacionImpuestoImpor = new JLabelMe();
		jLabelIdLiquidacionImpuestoImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLiquidacionImpuestoImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLiquidacionImpuestoImpor= new GridBagLayout();

		this.jPanelidLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);

		jLabelidLiquidacionImpuestoImpor = new JLabel();
		jLabelidLiquidacionImpuestoImpor.setText("Id");

		jLabelidLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelnumero_comprobanteLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor= new JTextFieldMe();

		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_duiLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelnumero_duiLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI+" : *");
		this.jLabelnumero_duiLiquidacionImpuestoImpor.setToolTipText("Numero Dui");
		this.jLabelnumero_duiLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_duiLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_duiLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_duiLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_duiLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_duiLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelnumero_duiLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldnumero_duiLiquidacionImpuestoImpor= new JTextFieldMe();

		jTextFieldnumero_duiLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldnumero_duiLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_duiLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_duiLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_duiLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_duiLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_duiLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_duiLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfechaLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfechaLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaLiquidacionImpuestoImpor.setToolTipText("Fecha");
		this.jLabelfechaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfechaLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		//jFormattedTextFieldfechaLiquidacionImpuestoImpor= new JFormattedTextFieldMe();

		jDateChooserfechaLiquidacionImpuestoImpor= new JDateChooser();
		jDateChooserfechaLiquidacionImpuestoImpor.setEnabled(false);
		jDateChooserfechaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaLiquidacionImpuestoImpor.setDate(new Date());
		jDateChooserfechaLiquidacionImpuestoImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaLiquidacionImpuestoImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfecha_pagoLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoLiquidacionImpuestoImpor.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfecha_pagoLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		//jFormattedTextFieldfecha_pagoLiquidacionImpuestoImpor= new JFormattedTextFieldMe();

		jDateChooserfecha_pagoLiquidacionImpuestoImpor= new JDateChooser();
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setEnabled(false);
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pagoLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setDate(new Date());
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pagoLiquidacionImpuestoImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pagoLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfobLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfobLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB+" : *");
		this.jLabelfobLiquidacionImpuestoImpor.setToolTipText("Fob");
		this.jLabelfobLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfobLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfobLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfobLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfobLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldfobLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldfobLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldfobLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfobLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfobLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonfobLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfobLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfobLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfobLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfobLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fobLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfobLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelseguroLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelseguroLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO+" : *");
		this.jLabelseguroLiquidacionImpuestoImpor.setToolTipText("Seguro");
		this.jLabelseguroLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelseguroLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelseguroLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelseguroLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelseguroLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldseguroLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldseguroLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldseguroLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldseguroLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldseguroLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonseguroLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonseguroLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonseguroLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldseguroLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldseguroLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"seguroLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonseguroLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelfleteLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelfleteLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteLiquidacionImpuestoImpor.setToolTipText("Flete");
		this.jLabelfleteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelfleteLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldfleteLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldfleteLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldfleteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonfleteLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI+" : *");
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor.setToolTipText("Porcentaje Fodi");
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_fodiLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_fodiLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_fodiLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_fodiLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_fodiLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_fodiLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_fodiLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA+" : *");
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor.setToolTipText("Porcentaje Iva");
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ivaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ivaLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ivaLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelporcentaje_ivaLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ivaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setText("0.0");

		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ivaLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabeltasa_controlLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabeltasa_controlLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL+" : *");
		this.jLabeltasa_controlLiquidacionImpuestoImpor.setToolTipText("Tasa Control");
		this.jLabeltasa_controlLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltasa_controlLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltasa_controlLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltasa_controlLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltasa_controlLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltasa_controlLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPaneltasa_controlLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldtasa_controlLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldtasa_controlLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldtasa_controlLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtasa_controlLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtasa_controlLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtasa_controlLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtasa_controlLiquidacionImpuestoImpor.setText("0.0");

		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontasa_controlLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtasa_controlLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtasa_controlLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tasa_controlLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontasa_controlLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelcfrLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelcfrLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR+" : *");
		this.jLabelcfrLiquidacionImpuestoImpor.setToolTipText("Cfr");
		this.jLabelcfrLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcfrLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcfrLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcfrLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcfrLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcfrLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelcfrLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldcfrLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldcfrLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldcfrLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcfrLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcfrLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcfrLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcfrLiquidacionImpuestoImpor.setText("0.0");

		this.jButtoncfrLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncfrLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncfrLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcfrLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcfrLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cfrLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncfrLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabelcifLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelcifLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF+" : *");
		this.jLabelcifLiquidacionImpuestoImpor.setToolTipText("Cif");
		this.jLabelcifLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcifLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcifLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcifLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcifLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcifLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelcifLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldcifLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldcifLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldcifLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcifLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcifLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcifLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcifLiquidacionImpuestoImpor.setText("0.0");

		this.jButtoncifLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncifLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncifLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcifLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcifLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cifLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncifLiquidacionImpuestoImporBusqueda.setVisible(false);		}


					
		this.jLabeltotalLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabeltotalLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalLiquidacionImpuestoImpor.setToolTipText("Total");
		this.jLabeltotalLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPaneltotalLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jTextFieldtotalLiquidacionImpuestoImpor= new JTextFieldMe();
		jTextFieldtotalLiquidacionImpuestoImpor.setEnabled(false);
		jTextFieldtotalLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalLiquidacionImpuestoImpor.setText("0.0");

		this.jButtontotalLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalLiquidacionImpuestoImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLiquidacionImpuestoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR+" : *");
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor.setToolTipText("Pedo Compra Impor");
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compra_imporLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporLiquidacionImpuestoImpor"));

		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_empresaLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_empresaLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLiquidacionImpuestoImpor.setToolTipText("Empresa");
		this.jLabelid_empresaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_empresaLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jComboBoxid_empresaLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_empresaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLiquidacionImpuestoImpor.setEnabled(false);

		this.jButtonid_empresaLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_empresaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_empresaLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImpuestoImpor"));

		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_sucursalLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_sucursalLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalLiquidacionImpuestoImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_sucursalLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jComboBoxid_sucursalLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_sucursalLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalLiquidacionImpuestoImpor.setEnabled(false);

		this.jButtonid_sucursalLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImpuestoImpor"));

		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_clienteLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_clienteLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteLiquidacionImpuestoImpor.setToolTipText("Cliente");
		this.jLabelid_clienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_clienteLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jComboBoxid_clienteLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_clienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_clienteLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_clienteLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteLiquidacionImpuestoImpor"));

		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_clienteLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteLiquidacionImpuestoImporUpdate"));



					
		this.jLabelid_facturaLiquidacionImpuestoImpor = new JLabelMe();
		this.jLabelid_facturaLiquidacionImpuestoImpor.setText(""+LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaLiquidacionImpuestoImpor.setToolTipText("Factura");
		this.jLabelid_facturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaLiquidacionImpuestoImpor.setToolTipText(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		this.jPanelid_facturaLiquidacionImpuestoImpor.setLayout(this.gridaBagLayoutLiquidacionImpuestoImpor);


		jComboBoxid_facturaLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_facturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonid_facturaLiquidacionImpuestoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaLiquidacionImpuestoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaLiquidacionImpuestoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonid_facturaLiquidacionImpuestoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaLiquidacionImpuestoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaLiquidacionImpuestoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaLiquidacionImpuestoImpor"));

		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda= new JButtonMe();
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setText("U");
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaLiquidacionImpuestoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaLiquidacionImpuestoImporBusqueda"));

		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaLiquidacionImpuestoImporBusqueda.setVisible(false);		}

		this.jButtonid_facturaLiquidacionImpuestoImporUpdate= new JButtonMe();
		this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setText("U");
		this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaLiquidacionImpuestoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaLiquidacionImpuestoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaLiquidacionImpuestoImporUpdate"));



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
		//this.jInternalFrameDetalleLiquidacionImpuestoImpor = new LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Liquidacion Impuesto Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLiquidacionImpuestoImpor= new GridBagLayout();
		

		
		String sToolTipLiquidacionImpuestoImpor="";
		sToolTipLiquidacionImpuestoImpor=LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLiquidacionImpuestoImpor+="(Importaciones.LiquidacionImpuestoImpor)";
		}
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipLiquidacionImpuestoImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonModificarLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonActualizarLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonEliminarLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonCancelarLiquidacionImpuestoImpor = new JButtonMe();
        this.jButtonGuardarCambiosLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jScrollPanelDatosLiquidacionImpuestoImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor = new JScrollPane();
				
		
		
		this.jPanelCamposLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Liquidacion Impuesto Impor";
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impuesto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLiquidacionImpuestoImpor.setName("jPanelCamposLiquidacionImpuestoImpor"); 

		this.jPanelCamposOcultosLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLiquidacionImpuestoImpor.setName("jPanelCamposOcultosLiquidacionImpuestoImpor"); 

        this.jPanelAccionesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesLiquidacionImpuestoImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLiquidacionImpuestoImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLiquidacionImpuestoImpor.setText("Nuevo");
		this.jButtonModificarLiquidacionImpuestoImpor.setText("Editar");
        this.jButtonActualizarLiquidacionImpuestoImpor.setText("Actualizar");
        this.jButtonEliminarLiquidacionImpuestoImpor.setText("Eliminar");
        this.jButtonCancelarLiquidacionImpuestoImpor.setText("Cancelar");
        this.jButtonGuardarCambiosLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonCerrarLiquidacionImpuestoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLiquidacionImpuestoImpor,"nuevo_button","Nuevo",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLiquidacionImpuestoImpor,"modificar_button","Editar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLiquidacionImpuestoImpor,"actualizar_button","Actualizar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLiquidacionImpuestoImpor,"eliminar_button","Eliminar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLiquidacionImpuestoImpor,"cancelar_button","Cancelar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLiquidacionImpuestoImpor,"guardarcambios_button","Guardar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLiquidacionImpuestoImpor,"cerrar_button","Salir",this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLiquidacionImpuestoImpor.setToolTipText("Nuevo"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLiquidacionImpuestoImpor.setToolTipText("Editar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLiquidacionImpuestoImpor.setToolTipText("Actualizar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLiquidacionImpuestoImpor.setToolTipText("Eliminar)"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLiquidacionImpuestoImpor.setToolTipText("Salir"+" "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLiquidacionImpuestoImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLiquidacionImpuestoImpor";
		inputMap = this.jButtonActualizarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLiquidacionImpuestoImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarLiquidacionImpuestoImpor";
		inputMap = this.jButtonEliminarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLiquidacionImpuestoImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCancelarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLiquidacionImpuestoImpor"));
		
		//CERRAR		
		sMapKey = "CerrarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLiquidacionImpuestoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLiquidacionImpuestoImpor";
		inputMap = this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLiquidacionImpuestoImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor.setToolTipText("Nuevo LiquidacionImpuestoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor.setToolTipText("Sin Cerrar Ventana LiquidacionImpuestoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLiquidacionImpuestoImpor = new JLabelMe();
		
		this.jLabelAccionesLiquidacionImpuestoImpor.setText("Acciones");		
		this.jLabelAccionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLiquidacionImpuestoImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLiquidacionImpuestoImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLiquidacionImpuestoImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLiquidacionImpuestoImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jPanelCamposLiquidacionImpuestoImpor.setLayout(gridaBagLayoutCamposLiquidacionImpuestoImpor);
		this.jPanelCamposOcultosLiquidacionImpuestoImpor.setLayout(gridaBagLayoutCamposOcultosLiquidacionImpuestoImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLiquidacionImpuestoImpor.add(jLabelIdLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLiquidacionImpuestoImpor.add(jLabelidLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.add(jLabelid_pedido_compra_imporLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.add(jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.add(jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.add(jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLiquidacionImpuestoImpor.add(jLabelid_empresaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLiquidacionImpuestoImpor.add(jButtonid_empresaLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLiquidacionImpuestoImpor.add(jButtonid_empresaLiquidacionImpuestoImporUpdate, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLiquidacionImpuestoImpor.add(jComboBoxid_empresaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalLiquidacionImpuestoImpor.add(jLabelid_sucursalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLiquidacionImpuestoImpor.add(jButtonid_sucursalLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLiquidacionImpuestoImpor.add(jButtonid_sucursalLiquidacionImpuestoImporUpdate, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalLiquidacionImpuestoImpor.add(jComboBoxid_sucursalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteLiquidacionImpuestoImpor.add(jLabelid_clienteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteLiquidacionImpuestoImpor.add(jButtonid_clienteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteLiquidacionImpuestoImpor.add(jButtonid_clienteLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 4;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteLiquidacionImpuestoImpor.add(jButtonid_clienteLiquidacionImpuestoImporUpdate, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteLiquidacionImpuestoImpor.add(jComboBoxid_clienteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaLiquidacionImpuestoImpor.add(jLabelid_facturaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaLiquidacionImpuestoImpor.add(jButtonid_facturaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaLiquidacionImpuestoImpor.add(jButtonid_facturaLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 4;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaLiquidacionImpuestoImpor.add(jButtonid_facturaLiquidacionImpuestoImporUpdate, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaLiquidacionImpuestoImpor.add(jComboBoxid_facturaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteLiquidacionImpuestoImpor.add(jLabelnumero_comprobanteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteLiquidacionImpuestoImpor.add(jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteLiquidacionImpuestoImpor.add(jTextFieldnumero_comprobanteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_duiLiquidacionImpuestoImpor.add(jLabelnumero_duiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_duiLiquidacionImpuestoImpor.add(jButtonnumero_duiLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_duiLiquidacionImpuestoImpor.add(jTextFieldnumero_duiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaLiquidacionImpuestoImpor.add(jLabelfechaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaLiquidacionImpuestoImpor.add(jButtonfechaLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaLiquidacionImpuestoImpor.add(jDateChooserfechaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoLiquidacionImpuestoImpor.add(jLabelfecha_pagoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoLiquidacionImpuestoImpor.add(jButtonfecha_pagoLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoLiquidacionImpuestoImpor.add(jDateChooserfecha_pagoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfobLiquidacionImpuestoImpor.add(jLabelfobLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfobLiquidacionImpuestoImpor.add(jButtonfobLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfobLiquidacionImpuestoImpor.add(jTextFieldfobLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelseguroLiquidacionImpuestoImpor.add(jLabelseguroLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelseguroLiquidacionImpuestoImpor.add(jButtonseguroLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelseguroLiquidacionImpuestoImpor.add(jTextFieldseguroLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteLiquidacionImpuestoImpor.add(jLabelfleteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteLiquidacionImpuestoImpor.add(jButtonfleteLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteLiquidacionImpuestoImpor.add(jTextFieldfleteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_fodiLiquidacionImpuestoImpor.add(jLabelporcentaje_fodiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_fodiLiquidacionImpuestoImpor.add(jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_fodiLiquidacionImpuestoImpor.add(jTextFieldporcentaje_fodiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ivaLiquidacionImpuestoImpor.add(jLabelporcentaje_ivaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ivaLiquidacionImpuestoImpor.add(jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ivaLiquidacionImpuestoImpor.add(jTextFieldporcentaje_ivaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltasa_controlLiquidacionImpuestoImpor.add(jLabeltasa_controlLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltasa_controlLiquidacionImpuestoImpor.add(jButtontasa_controlLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltasa_controlLiquidacionImpuestoImpor.add(jTextFieldtasa_controlLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcfrLiquidacionImpuestoImpor.add(jLabelcfrLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcfrLiquidacionImpuestoImpor.add(jButtoncfrLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcfrLiquidacionImpuestoImpor.add(jTextFieldcfrLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcifLiquidacionImpuestoImpor.add(jLabelcifLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcifLiquidacionImpuestoImpor.add(jButtoncifLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcifLiquidacionImpuestoImpor.add(jTextFieldcifLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalLiquidacionImpuestoImpor.add(jLabeltotalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalLiquidacionImpuestoImpor.add(jButtontotalLiquidacionImpuestoImporBusqueda, this.gridBagConstraintsLiquidacionImpuestoImpor);
	}

	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalLiquidacionImpuestoImpor.add(jTextFieldtotalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelidLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelid_clienteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelid_facturaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelnumero_comprobanteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelnumero_duiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelfechaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelfecha_pagoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelfobLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelseguroLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelfleteLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelporcentaje_fodiLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelporcentaje_ivaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPaneltasa_controlLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelcfrLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPanelcifLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpuestoImpor.add(this.jPaneltotalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposLiquidacionImpuestoImpor=0;
		iYPanelCamposLiquidacionImpuestoImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposOcultosLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposOcultosLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLiquidacionImpuestoImpor.add(this.jPanelid_empresaLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposOcultosLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposOcultosLiquidacionImpuestoImpor=0;
		iYPanelCamposOcultosLiquidacionImpuestoImpor++;
	}
	this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iYPanelCamposOcultosLiquidacionImpuestoImpor;
	this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iXPanelCamposOcultosLiquidacionImpuestoImpor++;
	this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpuestoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLiquidacionImpuestoImpor.add(this.jPanelid_sucursalLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);



	if(iXPanelCamposOcultosLiquidacionImpuestoImpor % 2==0) {
		iXPanelCamposOcultosLiquidacionImpuestoImpor=0;
		iYPanelCamposOcultosLiquidacionImpuestoImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesLiquidacionImpuestoImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesFormularioLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesFormularioLiquidacionImpuestoImpor);
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLiquidacionImpuestoImpor.add(this.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLiquidacionImpuestoImpor.add(this.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonModificarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);							

		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonEliminarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonActualizarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);


		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonGuardarCambiosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);	
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpuestoImpor.add(this.jButtonCancelarLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLiquidacionImpuestoImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();						
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;		
			//this.gridBagConstraintsLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLiquidacionImpuestoImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =0;
		this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLiquidacionImpuestoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLiquidacionImpuestoImpor = new LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Liquidacion Impuesto Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Liquidacion Impuesto Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Liquidacion Impuesto Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LiquidacionImpuestoImporModel liquidacionimpuestoimporModel=new LiquidacionImpuestoImporModel(this);
			
			//SI USARA CLASE INTERNA
			//LiquidacionImpuestoImporModel.LiquidacionImpuestoImporFocusTraversalPolicy liquidacionimpuestoimporFocusTraversalPolicy = liquidacionimpuestoimporModel.new LiquidacionImpuestoImporFocusTraversalPolicy(this);
			
			//liquidacionimpuestoimporFocusTraversalPolicy.setliquidacionimpuestoimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(liquidacionimpuestoimporModel);
			
			
			this.jContentPaneDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();	
			this.jContentPaneDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutDetalleLiquidacionImpuestoImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLiquidacionImpuestoImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
					
				
				this.jContentPaneDetalleLiquidacionImpuestoImpor.add(jTtoolBarDetalleLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);								
				
}
			
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor=   new JScrollPane(jContentPaneDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	        
			this.jContentPaneDetalleLiquidacionImpuestoImpor.add(jPanelCamposLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);
			
			
			
			
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
						&& liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpuestoImpor(this.puedeCargarPorParteDetalleLiquidacionImpuestoImpor,false,-1);
					
					if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLiquidacionImpuestoImpor= new GridBagConstraints();
						this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
						this.jContentPaneDetalleLiquidacionImpuestoImpor.add(this.jTabbedPaneRelacionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpuestoImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLiquidacionImpuestoImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
					this.gridBagConstraintsLiquidacionImpuestoImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
					
				
					this.jContentPaneDetalleLiquidacionImpuestoImpor.add(jPanelCamposOcultosLiquidacionImpuestoImpor, gridBagConstraintsLiquidacionImpuestoImpor);
				
					this.jPanelCamposOcultosLiquidacionImpuestoImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	        this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLiquidacionImpuestoImpor.add(this.jPanelAccionesFormularioLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);							
			
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
	        this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleLiquidacionImpuestoImpor.add(this.jPanelAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLiquidacionImpuestoImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor=   new JScrollPane(this.jPanelCamposLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
			this.gridBagConstraintsLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLiquidacionImpuestoImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);			
			
			this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
			
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpuestoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLiquidacionImpuestoImpor, this.gridBagConstraintsLiquidacionImpuestoImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLiquidacionImpuestoImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionLiquidacionImpuestoImpor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpuestoImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(false);
		this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(true);

		this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {

				DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(true);

				this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame=new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setdetalleliquidacionimpuestoimporSessionBean(this.detalleliquidacionimpuestoimporSessionBean);

				//this.gridBagConstraintsLiquidacionImpuestoImpor = new GridBagConstraints();
				//this.gridBagConstraintsLiquidacionImpuestoImpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLiquidacionImpuestoImpor.gridx = 0;
				//this.jContentPaneDetalleLiquidacionImpuestoImpor.add(this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLiquidacionImpuestoImpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.add("Detalle Liquidacion Impuesto Impores",this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setComponentAt(iIndexTab,this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(false);
				this.detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleLiquidacionImpuestoImpor) {
					this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.add("Detalle Liquidacion Impuesto Impores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors,LiquidacionImpuestoImpor liquidacionimpuestoimpor,DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame detalleliquidacionimpuestoimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleliquidacionimpuestoimporBeanSwingJInternalFrame=new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getDetalleLiquidacionImpuestoImporLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setliquidacionimpuestoimporsForeignKey(liquidacionimpuestoimpors);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setliquidacionimpuestoimporForeignKey(liquidacionimpuestoimpor);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor(true);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setlidLiquidacionImpuestoImporActual(liquidacionimpuestoimpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaLiquidacionImpuestoImpor(true);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor(liquidacionimpuestoimpor.getId());

					if(!this.conCargarFormDetalle) {
						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setSelectedItemCombosFrameLiquidacionImpuestoImporForeignKey(liquidacionimpuestoimpor,1,false,true,true);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdLiquidacionImpuestoImpor");
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLiquidacionImpuestoImpor");
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(true);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n",detalleliquidacionimpuestoimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleliquidacionimpuestoimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpuestoImpor("relacionado");
					} else {
						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpuestoImpor("no_relacionado");
					}

					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleLiquidacionImpuestoImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
