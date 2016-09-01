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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.TransferenciasResumidosConstantesFunciones;

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
public class TransferenciasResumidosDetalleFormJInternalFrame extends TransferenciasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransferenciasResumidos;
	
	protected JMenuBar jmenuBarDetalleTransferenciasResumidos;
	
	protected JMenu jmenuDetalleTransferenciasResumidos;
	protected JMenu jmenuDetalleArchivoTransferenciasResumidos;
	protected JMenu jmenuDetalleAccionesTransferenciasResumidos;
	protected JMenu jmenuDetalleDatosTransferenciasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferenciasResumidos;	
	protected GridBagConstraints gridBagConstraintsTransferenciasResumidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransferenciasResumidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransferenciasResumidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public TransferenciasResumidosSessionBean transferenciasresumidosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public TransferenciasResumidosLogic transferenciasresumidosLogic;
	
	public JScrollPane jScrollPanelDatosTransferenciasResumidos;
	public JScrollPane jScrollPanelDatosEdicionTransferenciasResumidos;
	public JScrollPane jScrollPanelDatosGeneralTransferenciasResumidos;
	
	protected JPanel jPanelCamposTransferenciasResumidos;    
	protected JPanel jPanelCamposOcultosTransferenciasResumidos;    	
	protected JPanel jPanelAccionesTransferenciasResumidos;
	protected JPanel jPanelAccionesFormularioTransferenciasResumidos;
    
	
	
	protected Integer iXPanelCamposTransferenciasResumidos=0;
	protected Integer iYPanelCamposTransferenciasResumidos=0;
	
	protected Integer iXPanelCamposOcultosTransferenciasResumidos=0;
	protected Integer iYPanelCamposOcultosTransferenciasResumidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransferenciasResumidos;
	public JButton jButtonModificarTransferenciasResumidos;
	public JButton jButtonActualizarTransferenciasResumidos;
    public JButton jButtonEliminarTransferenciasResumidos;
	public JButton jButtonCancelarTransferenciasResumidos;
    public JButton jButtonGuardarCambiosTransferenciasResumidos;
	public JButton jButtonGuardarCambiosTablaTransferenciasResumidos;
	protected JButton jButtonCerrarTransferenciasResumidos;
	
	
	protected JButton jButtonProcesarInformacionTransferenciasResumidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransferenciasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransferenciasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransferenciasResumidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferenciasResumidos;
	protected JButton jButtonModificarToolBarTransferenciasResumidos;
	protected JButton jButtonActualizarToolBarTransferenciasResumidos;
    protected JButton jButtonEliminarToolBarTransferenciasResumidos;
	protected JButton jButtonCancelarToolBarTransferenciasResumidos;
    protected JButton jButtonGuardarCambiosToolBarTransferenciasResumidos;
	protected JButton jButtonGuardarCambiosTablaToolBarTransferenciasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferenciasResumidos;
	protected JButton jButtonCerrarToolBarTransferenciasResumidos;
	
	protected JButton jButtonProcesarInformacionToolBarTransferenciasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferenciasResumidos;
	protected JMenuItem jMenuItemModificarTransferenciasResumidos;
	protected JMenuItem jMenuItemActualizarTransferenciasResumidos;
    protected JMenuItem jMenuItemEliminarTransferenciasResumidos;
	protected JMenuItem jMenuItemCancelarTransferenciasResumidos;
    protected JMenuItem jMenuItemGuardarCambiosTransferenciasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferenciasResumidos;
	protected JMenuItem jMenuItemCerrarTransferenciasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarTransferenciasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferenciasResumidos;
	
	protected JMenuItem jMenuItemProcesarInformacionTransferenciasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferenciasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarTransferenciasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferenciasResumidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferenciasResumidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransferenciasResumidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransferenciasResumidos;
	public JLabel jLabelIdTransferenciasResumidos;
	public JLabel jLabelidTransferenciasResumidos;
	public JButton jButtonidTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeTransferenciasResumidos;
	public JLabel jLabelfecha_emision_desdeTransferenciasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeTransferenciasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeTransferenciasResumidos;
	public JButton jButtonfecha_emision_desdeTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaTransferenciasResumidos;
	public JLabel jLabelfecha_emision_hastaTransferenciasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaTransferenciasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaTransferenciasResumidos;
	public JButton jButtonfecha_emision_hastaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionTransferenciasResumidos;
	public JLabel jLabelnombre_transaccionTransferenciasResumidos;
	public JTextArea jTextAreanombre_transaccionTransferenciasResumidos;
	public JScrollPane jscrollPanenombre_transaccionTransferenciasResumidos;
	public JButton jButtonnombre_transaccionTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaTransferenciasResumidos;
	public JLabel jLabelnombre_bodegaTransferenciasResumidos;
	public JTextArea jTextAreanombre_bodegaTransferenciasResumidos;
	public JScrollPane jscrollPanenombre_bodegaTransferenciasResumidos;
	public JButton jButtonnombre_bodegaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoTransferenciasResumidos;
	public JLabel jLabelnombre_productoTransferenciasResumidos;
	public JTextArea jTextAreanombre_productoTransferenciasResumidos;
	public JScrollPane jscrollPanenombre_productoTransferenciasResumidos;
	public JButton jButtonnombre_productoTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadTransferenciasResumidos;
	public JLabel jLabelnombre_unidadTransferenciasResumidos;
	public JTextField jTextFieldnombre_unidadTransferenciasResumidos;
	public JButton jButtonnombre_unidadTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadTransferenciasResumidos;
	public JLabel jLabelcantidadTransferenciasResumidos;
	public JTextField jTextFieldcantidadTransferenciasResumidos;
	public JButton jButtoncantidadTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioTransferenciasResumidos;
	public JLabel jLabelcosto_unitarioTransferenciasResumidos;
	public JTextField jTextFieldcosto_unitarioTransferenciasResumidos;
	public JButton jButtoncosto_unitarioTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalTransferenciasResumidos;
	public JLabel jLabelcosto_totalTransferenciasResumidos;
	public JTextField jTextFieldcosto_totalTransferenciasResumidos;
	public JButton jButtoncosto_totalTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodega_enviarTransferenciasResumidos;
	public JLabel jLabelnombre_bodega_enviarTransferenciasResumidos;
	public JTextArea jTextAreanombre_bodega_enviarTransferenciasResumidos;
	public JScrollPane jscrollPanenombre_bodega_enviarTransferenciasResumidos;
	public JButton jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoTransferenciasResumidos;
	public JLabel jLabelcodigo_productoTransferenciasResumidos;
	public JTextField jTextFieldcodigo_productoTransferenciasResumidos;
	public JButton jButtoncodigo_productoTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltipoTransferenciasResumidos;
	public JLabel jLabeltipoTransferenciasResumidos;
	public JTextField jTextFieldtipoTransferenciasResumidos;
	public JButton jButtontipoTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransferenciasResumidos;
	public JLabel jLabelid_empresaTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransferenciasResumidos;
	public JButton jButtonid_empresaTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_empresaTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTransferenciasResumidos;
	public JLabel jLabelid_sucursalTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTransferenciasResumidos;
	public JButton jButtonid_sucursalTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_sucursalTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaTransferenciasResumidos;
	public JLabel jLabelid_bodegaTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaTransferenciasResumidos;
	public JButton jButtonid_bodegaTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_bodegaTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoTransferenciasResumidos;
	public JLabel jLabelid_productoTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoTransferenciasResumidos;
	public JButton jButtonid_productoTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_productoTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_productoTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionTransferenciasResumidos;
	public JLabel jLabelid_transaccionTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionTransferenciasResumidos;
	public JButton jButtonid_transaccionTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_transaccionTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaTransferenciasResumidos;
	public JLabel jLabelid_lineaTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaTransferenciasResumidos;
	public JButton jButtonid_lineaTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_lineaTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_lineaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoTransferenciasResumidos;
	public JLabel jLabelid_linea_grupoTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoTransferenciasResumidos;
	public JButton jButtonid_linea_grupoTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_grupoTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaTransferenciasResumidos;
	public JLabel jLabelid_linea_categoriaTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaTransferenciasResumidos;
	public JButton jButtonid_linea_categoriaTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_categoriaTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaTransferenciasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaTransferenciasResumidos;
	public JLabel jLabelid_linea_marcaTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaTransferenciasResumidos;
	public JButton jButtonid_linea_marcaTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_marcaTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaTransferenciasResumidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransferenciasResumidos;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransferenciasResumidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransferenciasResumidos=new JPanel();
				this.jPanelAccionesFormularioTransferenciasResumidos=new JPanel();
				this.jmenuBarDetalleTransferenciasResumidos=new JMenuBar();
				this.jTtoolBarDetalleTransferenciasResumidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransferenciasResumidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransferenciasResumidos() {
		return this.jButtonActualizarToolBarTransferenciasResumidos;
	}
	
	public JButton getjButtonEliminarToolBarTransferenciasResumidos() {
		return this.jButtonEliminarToolBarTransferenciasResumidos;
	}
	
	public JButton getjButtonCancelarToolBarTransferenciasResumidos() {
		return this.jButtonCancelarToolBarTransferenciasResumidos;
	}		
	
	public JButton getjButtonProcesarInformacionTransferenciasResumidos() {
		return this.jButtonProcesarInformacionTransferenciasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferenciasResumidos)	{
		this.jButtonProcesarInformacionTransferenciasResumidos = jButtonProcesarInformacionTransferenciasResumidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferenciasResumidos() {
		return this.jComboBoxTiposAccionesTransferenciasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferenciasResumidos(
			JComboBox jComboBoxTiposRelacionesTransferenciasResumidos) {
		this.jComboBoxTiposRelacionesTransferenciasResumidos = jComboBoxTiposRelacionesTransferenciasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferenciasResumidos(
			JComboBox jComboBoxTiposAccionesTransferenciasResumidos) {
		this.jComboBoxTiposAccionesTransferenciasResumidos = jComboBoxTiposAccionesTransferenciasResumidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransferenciasResumidos() {
		return this.jComboBoxTiposAccionesFormularioTransferenciasResumidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransferenciasResumidos(
			JComboBox jComboBoxTiposAccionesFormularioTransferenciasResumidos) {
		this.jComboBoxTiposAccionesFormularioTransferenciasResumidos = jComboBoxTiposAccionesFormularioTransferenciasResumidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
		
		this.transferenciasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciasresumidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencias Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
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
	
		TransferenciasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransferenciasResumidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransferenciasResumidos=new JButtonMe();
				this.jButtonModificarToolBarTransferenciasResumidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos,
							"actualizar","actualizar","Actualizar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos,
							"eliminar","eliminar","Eliminar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos,
							"cancelar","cancelar","Cancelar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos,
							"guardarcambios","guardarcambios","Guardar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransferenciasResumidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransferenciasResumidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransferenciasResumidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransferenciasResumidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransferenciasResumidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferenciasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferenciasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferenciasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransferenciasResumidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransferenciasResumidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransferenciasResumidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransferenciasResumidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransferenciasResumidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransferenciasResumidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransferenciasResumidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransferenciasResumidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransferenciasResumidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransferenciasResumidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransferenciasResumidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransferenciasResumidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransferenciasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferenciasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferenciasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferenciasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferenciasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferenciasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransferenciasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransferenciasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransferenciasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferenciasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferenciasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferenciasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferenciasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferenciasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferenciasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransferenciasResumidos.add(this.jMenuItemDetalleCerrarTransferenciasResumidos);
		
		this.jmenuDetalleAccionesTransferenciasResumidos.add(this.jMenuItemActualizarTransferenciasResumidos);
		this.jmenuDetalleAccionesTransferenciasResumidos.add(this.jMenuItemEliminarTransferenciasResumidos);
		this.jmenuDetalleAccionesTransferenciasResumidos.add(this.jMenuItemCancelarTransferenciasResumidos);		
		
		//this.jmenuDetalleDatosTransferenciasResumidos.add(this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos);				
		this.jmenuDetalleDatosTransferenciasResumidos.add(this.jMenuItemDetalleMostarOcultarTransferenciasResumidos);				
				
		//this.jmenuDetalleAccionesTransferenciasResumidos.add(this.jMenuItemGuardarCambiosTransferenciasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransferenciasResumidos.add(this.jmenuDetalleArchivoTransferenciasResumidos);		
		this.jmenuBarDetalleTransferenciasResumidos.add(this.jmenuDetalleAccionesTransferenciasResumidos);		
		this.jmenuBarDetalleTransferenciasResumidos.add(this.jmenuDetalleDatosTransferenciasResumidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransferenciasResumidos);				
	}
	
	
	public void inicializarElementosCamposTransferenciasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransferenciasResumidos = new JLabelMe();
		jLabelIdTransferenciasResumidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransferenciasResumidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransferenciasResumidos= new GridBagLayout();

		this.jPanelidTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);

		jLabelidTransferenciasResumidos = new JLabel();
		jLabelidTransferenciasResumidos.setText("Id");

		jLabelidTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeTransferenciasResumidos = new JLabelMe();
		this.jLabelfecha_emision_desdeTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeTransferenciasResumidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_desdeTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		//jFormattedTextFieldfecha_emision_desdeTransferenciasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeTransferenciasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setEnabled(false);
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeTransferenciasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeTransferenciasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaTransferenciasResumidos = new JLabelMe();
		this.jLabelfecha_emision_hastaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaTransferenciasResumidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		//jFormattedTextFieldfecha_emision_hastaTransferenciasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaTransferenciasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setEnabled(false);
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaTransferenciasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaTransferenciasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionTransferenciasResumidos = new JLabelMe();
		this.jLabelnombre_transaccionTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionTransferenciasResumidos.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelnombre_transaccionTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextAreanombre_transaccionTransferenciasResumidos= new JTextAreaMe();
		jTextAreanombre_transaccionTransferenciasResumidos.setEnabled(false);
		jTextAreanombre_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionTransferenciasResumidos.setLineWrap(true);
		jTextAreanombre_transaccionTransferenciasResumidos.setWrapStyleWord(true);
		jTextAreanombre_transaccionTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionTransferenciasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionTransferenciasResumidos = new JScrollPane(jTextAreanombre_transaccionTransferenciasResumidos);
		jscrollPanenombre_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setText("U");
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaTransferenciasResumidos = new JLabelMe();
		this.jLabelnombre_bodegaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaTransferenciasResumidos.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelnombre_bodegaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextAreanombre_bodegaTransferenciasResumidos= new JTextAreaMe();
		jTextAreanombre_bodegaTransferenciasResumidos.setEnabled(false);
		jTextAreanombre_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaTransferenciasResumidos.setLineWrap(true);
		jTextAreanombre_bodegaTransferenciasResumidos.setWrapStyleWord(true);
		jTextAreanombre_bodegaTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaTransferenciasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaTransferenciasResumidos = new JScrollPane(jTextAreanombre_bodegaTransferenciasResumidos);
		jscrollPanenombre_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoTransferenciasResumidos = new JLabelMe();
		this.jLabelnombre_productoTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoTransferenciasResumidos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelnombre_productoTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextAreanombre_productoTransferenciasResumidos= new JTextAreaMe();
		jTextAreanombre_productoTransferenciasResumidos.setEnabled(false);
		jTextAreanombre_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoTransferenciasResumidos.setLineWrap(true);
		jTextAreanombre_productoTransferenciasResumidos.setWrapStyleWord(true);
		jTextAreanombre_productoTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoTransferenciasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoTransferenciasResumidos = new JScrollPane(jTextAreanombre_productoTransferenciasResumidos);
		jscrollPanenombre_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoTransferenciasResumidosBusqueda.setText("U");
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadTransferenciasResumidos = new JLabelMe();
		this.jLabelnombre_unidadTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadTransferenciasResumidos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelnombre_unidadTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldnombre_unidadTransferenciasResumidos= new JTextFieldMe();

		jTextFieldnombre_unidadTransferenciasResumidos.setEnabled(false);
		jTextFieldnombre_unidadTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setText("U");
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadTransferenciasResumidos = new JLabelMe();
		this.jLabelcantidadTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadTransferenciasResumidos.setToolTipText("Cantad");
		this.jLabelcantidadTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelcantidadTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldcantidadTransferenciasResumidos= new JTextFieldMe();
		jTextFieldcantidadTransferenciasResumidos.setEnabled(false);
		jTextFieldcantidadTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadTransferenciasResumidos.setText("0");

		this.jButtoncantidadTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtoncantidadTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadTransferenciasResumidosBusqueda.setText("U");
		this.jButtoncantidadTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioTransferenciasResumidos = new JLabelMe();
		this.jLabelcosto_unitarioTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioTransferenciasResumidos.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelcosto_unitarioTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldcosto_unitarioTransferenciasResumidos= new JTextFieldMe();
		jTextFieldcosto_unitarioTransferenciasResumidos.setEnabled(false);
		jTextFieldcosto_unitarioTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioTransferenciasResumidos.setText("0.0");

		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setText("U");
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalTransferenciasResumidos = new JLabelMe();
		this.jLabelcosto_totalTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalTransferenciasResumidos.setToolTipText("Costo Total");
		this.jLabelcosto_totalTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelcosto_totalTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldcosto_totalTransferenciasResumidos= new JTextFieldMe();
		jTextFieldcosto_totalTransferenciasResumidos.setEnabled(false);
		jTextFieldcosto_totalTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalTransferenciasResumidos.setText("0.0");

		this.jButtoncosto_totalTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalTransferenciasResumidosBusqueda.setText("U");
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodega_enviarTransferenciasResumidos = new JLabelMe();
		this.jLabelnombre_bodega_enviarTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR+" : *");
		this.jLabelnombre_bodega_enviarTransferenciasResumidos.setToolTipText("Nombre Bodega Enviar");
		this.jLabelnombre_bodega_enviarTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_bodega_enviarTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_bodega_enviarTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodega_enviarTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodega_enviarTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodega_enviarTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelnombre_bodega_enviarTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextAreanombre_bodega_enviarTransferenciasResumidos= new JTextAreaMe();
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setEnabled(false);
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setLineWrap(true);
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setWrapStyleWord(true);
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodega_enviarTransferenciasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodega_enviarTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodega_enviarTransferenciasResumidos = new JScrollPane(jTextAreanombre_bodega_enviarTransferenciasResumidos);
		jscrollPanenombre_bodega_enviarTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodega_enviarTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodega_enviarTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setText("U");
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodega_enviarTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodega_enviarTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodega_enviarTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoTransferenciasResumidos = new JLabelMe();
		this.jLabelcodigo_productoTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoTransferenciasResumidos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelcodigo_productoTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldcodigo_productoTransferenciasResumidos= new JTextFieldMe();

		jTextFieldcodigo_productoTransferenciasResumidos.setEnabled(false);
		jTextFieldcodigo_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setText("U");
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoTransferenciasResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltipoTransferenciasResumidos = new JLabelMe();
		this.jLabeltipoTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoTransferenciasResumidos.setToolTipText("Tipo");
		this.jLabeltipoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPaneltipoTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jTextFieldtipoTransferenciasResumidos= new JTextFieldMe();

		jTextFieldtipoTransferenciasResumidos.setEnabled(false);
		jTextFieldtipoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtontipoTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoTransferenciasResumidosBusqueda.setText("U");
		this.jButtontipoTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoTransferenciasResumidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransferenciasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransferenciasResumidos = new JLabelMe();
		this.jLabelid_empresaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransferenciasResumidos.setToolTipText("Empresa");
		this.jLabelid_empresaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_empresaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_empresaTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_empresaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransferenciasResumidos.setEnabled(false);

		this.jButtonid_empresaTransferenciasResumidos= new JButtonMe();
		this.jButtonid_empresaTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferenciasResumidos.setText("Buscar");
		this.jButtonid_empresaTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciasResumidos"));

		this.jButtonid_empresaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_empresaTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_empresaTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciasResumidosUpdate"));



					
		this.jLabelid_sucursalTransferenciasResumidos = new JLabelMe();
		this.jLabelid_sucursalTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTransferenciasResumidos.setToolTipText("Sucursal");
		this.jLabelid_sucursalTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_sucursalTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_sucursalTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_sucursalTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTransferenciasResumidos.setEnabled(false);

		this.jButtonid_sucursalTransferenciasResumidos= new JButtonMe();
		this.jButtonid_sucursalTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferenciasResumidos.setText("Buscar");
		this.jButtonid_sucursalTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferenciasResumidos"));

		this.jButtonid_sucursalTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_sucursalTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_sucursalTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferenciasResumidosUpdate"));



					
		this.jLabelid_bodegaTransferenciasResumidos = new JLabelMe();
		this.jLabelid_bodegaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaTransferenciasResumidos.setToolTipText("Bodega");
		this.jLabelid_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_bodegaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_bodegaTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaTransferenciasResumidos= new JButtonMe();
		this.jButtonid_bodegaTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaTransferenciasResumidos.setText("Buscar");
		this.jButtonid_bodegaTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaTransferenciasResumidos"));

		this.jButtonid_bodegaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_bodegaTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_bodegaTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaTransferenciasResumidosUpdate"));



					
		this.jLabelid_productoTransferenciasResumidos = new JLabelMe();
		this.jLabelid_productoTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoTransferenciasResumidos.setToolTipText("Producto");
		this.jLabelid_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_productoTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_productoTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_productoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoTransferenciasResumidos= new JButtonMe();
		this.jButtonid_productoTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTransferenciasResumidos.setText("Buscar");
		this.jButtonid_productoTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTransferenciasResumidos"));

		this.jButtonid_productoTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_productoTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_productoTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_productoTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_productoTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_productoTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTransferenciasResumidosUpdate"));



					
		this.jLabelid_transaccionTransferenciasResumidos = new JLabelMe();
		this.jLabelid_transaccionTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionTransferenciasResumidos.setToolTipText("Transaccion");
		this.jLabelid_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_transaccionTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_transaccionTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionTransferenciasResumidos= new JButtonMe();
		this.jButtonid_transaccionTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransferenciasResumidos.setText("Buscar");
		this.jButtonid_transaccionTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransferenciasResumidos"));

		this.jButtonid_transaccionTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_transaccionTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_transaccionTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_transaccionTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransferenciasResumidosUpdate"));



					
		this.jLabelid_lineaTransferenciasResumidos = new JLabelMe();
		this.jLabelid_lineaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaTransferenciasResumidos.setToolTipText("Linea");
		this.jLabelid_lineaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_lineaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_lineaTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_lineaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaTransferenciasResumidos= new JButtonMe();
		this.jButtonid_lineaTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaTransferenciasResumidos.setText("Buscar");
		this.jButtonid_lineaTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaTransferenciasResumidos"));

		this.jButtonid_lineaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_lineaTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_lineaTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_lineaTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaTransferenciasResumidosUpdate"));



					
		this.jLabelid_linea_grupoTransferenciasResumidos = new JLabelMe();
		this.jLabelid_linea_grupoTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoTransferenciasResumidos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_linea_grupoTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_linea_grupoTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_grupoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoTransferenciasResumidos= new JButtonMe();
		this.jButtonid_linea_grupoTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoTransferenciasResumidos.setText("Buscar");
		this.jButtonid_linea_grupoTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoTransferenciasResumidos"));

		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoTransferenciasResumidosUpdate"));



					
		this.jLabelid_linea_categoriaTransferenciasResumidos = new JLabelMe();
		this.jLabelid_linea_categoriaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaTransferenciasResumidos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_linea_categoriaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_linea_categoriaTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_categoriaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaTransferenciasResumidos= new JButtonMe();
		this.jButtonid_linea_categoriaTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaTransferenciasResumidos.setText("Buscar");
		this.jButtonid_linea_categoriaTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaTransferenciasResumidos"));

		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaTransferenciasResumidosUpdate"));



					
		this.jLabelid_linea_marcaTransferenciasResumidos = new JLabelMe();
		this.jLabelid_linea_marcaTransferenciasResumidos.setText(""+TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaTransferenciasResumidos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaTransferenciasResumidos.setToolTipText(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		this.jPanelid_linea_marcaTransferenciasResumidos.setLayout(this.gridaBagLayoutTransferenciasResumidos);


		jComboBoxid_linea_marcaTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_marcaTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaTransferenciasResumidos= new JButtonMe();
		this.jButtonid_linea_marcaTransferenciasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaTransferenciasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaTransferenciasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaTransferenciasResumidos.setText("Buscar");
		this.jButtonid_linea_marcaTransferenciasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaTransferenciasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaTransferenciasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaTransferenciasResumidos"));

		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setText("U");
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaTransferenciasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaTransferenciasResumidosBusqueda"));

		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaTransferenciasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaTransferenciasResumidosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setText("U");
		this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaTransferenciasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaTransferenciasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaTransferenciasResumidosUpdate"));



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
		//this.jInternalFrameDetalleTransferenciasResumidos = new TransferenciasResumidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transferencias Resumidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferenciasResumidos= new GridBagLayout();
		

		
		String sToolTipTransferenciasResumidos="";
		sToolTipTransferenciasResumidos=TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferenciasResumidos+="(Inventario.TransferenciasResumidos)";
		}
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferenciasResumidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransferenciasResumidos = new JButtonMe();
		this.jButtonModificarTransferenciasResumidos = new JButtonMe();
        this.jButtonActualizarTransferenciasResumidos = new JButtonMe();
        this.jButtonEliminarTransferenciasResumidos = new JButtonMe();
        this.jButtonCancelarTransferenciasResumidos = new JButtonMe();
        this.jButtonGuardarCambiosTransferenciasResumidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransferenciasResumidos = new JButtonMe();
		this.jButtonCerrarTransferenciasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosTransferenciasResumidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransferenciasResumidos = new JScrollPane();
		this.jScrollPanelDatosGeneralTransferenciasResumidos = new JScrollPane();
				
		
		
		this.jPanelCamposTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencias Resumidos";
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransferenciasResumidos.setName("jPanelCamposTransferenciasResumidos"); 

		this.jPanelCamposOcultosTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransferenciasResumidos.setName("jPanelCamposOcultosTransferenciasResumidos"); 

        this.jPanelAccionesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferenciasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesTransferenciasResumidos.setName("Acciones"); 

		this.jPanelAccionesFormularioTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransferenciasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransferenciasResumidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransferenciasResumidos.setText("Nuevo");
		this.jButtonModificarTransferenciasResumidos.setText("Editar");
        this.jButtonActualizarTransferenciasResumidos.setText("Actualizar");
        this.jButtonEliminarTransferenciasResumidos.setText("Eliminar");
        this.jButtonCancelarTransferenciasResumidos.setText("Cancelar");
        this.jButtonGuardarCambiosTransferenciasResumidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.setText("Guardar");
		this.jButtonCerrarTransferenciasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferenciasResumidos,"nuevo_button","Nuevo",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransferenciasResumidos,"modificar_button","Editar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransferenciasResumidos,"actualizar_button","Actualizar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransferenciasResumidos,"eliminar_button","Eliminar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransferenciasResumidos,"cancelar_button","Cancelar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransferenciasResumidos,"guardarcambios_button","Guardar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferenciasResumidos,"guardarcambiostabla_button","Guardar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferenciasResumidos,"cerrar_button","Salir",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransferenciasResumidos.setToolTipText("Nuevo"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransferenciasResumidos.setToolTipText("Editar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransferenciasResumidos.setToolTipText("Actualizar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransferenciasResumidos.setToolTipText("Eliminar)"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransferenciasResumidos.setToolTipText("Cancelar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransferenciasResumidos.setToolTipText("Guardar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.setToolTipText("Guardar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferenciasResumidos.setToolTipText("Salir"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferenciasResumidos";
		inputMap = this.jButtonNuevoTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferenciasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferenciasResumidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransferenciasResumidos";
		inputMap = this.jButtonActualizarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransferenciasResumidos"));
		
		//ELIMINAR
		sMapKey = "EliminarTransferenciasResumidos";
		inputMap = this.jButtonEliminarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransferenciasResumidos"));
		
		//CANCELAR	
		sMapKey = "CancelarTransferenciasResumidos";
		inputMap = this.jButtonCancelarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransferenciasResumidos"));
		
		//CERRAR		
		sMapKey = "CerrarTransferenciasResumidos";
		inputMap = this.jButtonCerrarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferenciasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferenciasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferenciasResumidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransferenciasResumidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransferenciasResumidos.setToolTipText("Nuevo TransferenciasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransferenciasResumidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransferenciasResumidos.setToolTipText("Sin Cerrar Ventana TransferenciasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransferenciasResumidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransferenciasResumidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferenciasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesTransferenciasResumidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransferenciasResumidos = new JLabelMe();
		
		this.jLabelAccionesTransferenciasResumidos.setText("Acciones");		
		this.jLabelAccionesTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransferenciasResumidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransferenciasResumidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransferenciasResumidos=new JTabbedPane();
		this.jTabbedPaneRelacionesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferenciasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransferenciasResumidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransferenciasResumidos = new GridBagLayout();
		
		this.jPanelCamposTransferenciasResumidos.setLayout(gridaBagLayoutCamposTransferenciasResumidos);
		this.jPanelCamposOcultosTransferenciasResumidos.setLayout(gridaBagLayoutCamposOcultosTransferenciasResumidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransferenciasResumidos.add(jLabelIdTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransferenciasResumidos.add(jLabelidTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransferenciasResumidos.add(jLabelid_empresaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferenciasResumidos.add(jButtonid_empresaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferenciasResumidos.add(jButtonid_empresaTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransferenciasResumidos.add(jComboBoxid_empresaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTransferenciasResumidos.add(jLabelid_sucursalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransferenciasResumidos.add(jButtonid_sucursalTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransferenciasResumidos.add(jButtonid_sucursalTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTransferenciasResumidos.add(jComboBoxid_sucursalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaTransferenciasResumidos.add(jLabelid_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaTransferenciasResumidos.add(jButtonid_bodegaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaTransferenciasResumidos.add(jButtonid_bodegaTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaTransferenciasResumidos.add(jComboBoxid_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoTransferenciasResumidos.add(jLabelid_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoTransferenciasResumidos.add(jButtonid_productoTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoTransferenciasResumidos.add(jButtonid_productoTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoTransferenciasResumidos.add(jComboBoxid_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionTransferenciasResumidos.add(jLabelid_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTransferenciasResumidos.add(jButtonid_transaccionTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTransferenciasResumidos.add(jButtonid_transaccionTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionTransferenciasResumidos.add(jComboBoxid_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaTransferenciasResumidos.add(jLabelid_lineaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaTransferenciasResumidos.add(jButtonid_lineaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaTransferenciasResumidos.add(jButtonid_lineaTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaTransferenciasResumidos.add(jComboBoxid_lineaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoTransferenciasResumidos.add(jLabelid_linea_grupoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoTransferenciasResumidos.add(jButtonid_linea_grupoTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoTransferenciasResumidos.add(jButtonid_linea_grupoTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoTransferenciasResumidos.add(jComboBoxid_linea_grupoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaTransferenciasResumidos.add(jLabelid_linea_categoriaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaTransferenciasResumidos.add(jButtonid_linea_categoriaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaTransferenciasResumidos.add(jButtonid_linea_categoriaTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaTransferenciasResumidos.add(jComboBoxid_linea_categoriaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaTransferenciasResumidos.add(jLabelid_linea_marcaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaTransferenciasResumidos.add(jButtonid_linea_marcaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 3;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaTransferenciasResumidos.add(jButtonid_linea_marcaTransferenciasResumidosUpdate, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaTransferenciasResumidos.add(jComboBoxid_linea_marcaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeTransferenciasResumidos.add(jLabelfecha_emision_desdeTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeTransferenciasResumidos.add(jButtonfecha_emision_desdeTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeTransferenciasResumidos.add(jDateChooserfecha_emision_desdeTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaTransferenciasResumidos.add(jLabelfecha_emision_hastaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaTransferenciasResumidos.add(jButtonfecha_emision_hastaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaTransferenciasResumidos.add(jDateChooserfecha_emision_hastaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionTransferenciasResumidos.add(jLabelnombre_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionTransferenciasResumidos.add(jButtonnombre_transaccionTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionTransferenciasResumidos.add(jscrollPanenombre_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaTransferenciasResumidos.add(jLabelnombre_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaTransferenciasResumidos.add(jButtonnombre_bodegaTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaTransferenciasResumidos.add(jscrollPanenombre_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoTransferenciasResumidos.add(jLabelnombre_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoTransferenciasResumidos.add(jButtonnombre_productoTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoTransferenciasResumidos.add(jscrollPanenombre_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadTransferenciasResumidos.add(jLabelnombre_unidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadTransferenciasResumidos.add(jButtonnombre_unidadTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadTransferenciasResumidos.add(jTextFieldnombre_unidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadTransferenciasResumidos.add(jLabelcantidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadTransferenciasResumidos.add(jButtoncantidadTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadTransferenciasResumidos.add(jTextFieldcantidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioTransferenciasResumidos.add(jLabelcosto_unitarioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioTransferenciasResumidos.add(jButtoncosto_unitarioTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioTransferenciasResumidos.add(jTextFieldcosto_unitarioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalTransferenciasResumidos.add(jLabelcosto_totalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalTransferenciasResumidos.add(jButtoncosto_totalTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalTransferenciasResumidos.add(jTextFieldcosto_totalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodega_enviarTransferenciasResumidos.add(jLabelnombre_bodega_enviarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodega_enviarTransferenciasResumidos.add(jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodega_enviarTransferenciasResumidos.add(jscrollPanenombre_bodega_enviarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoTransferenciasResumidos.add(jLabelcodigo_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoTransferenciasResumidos.add(jButtoncodigo_productoTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoTransferenciasResumidos.add(jTextFieldcodigo_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoTransferenciasResumidos.add(jLabeltipoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 2;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
		this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoTransferenciasResumidos.add(jButtontipoTransferenciasResumidosBusqueda, this.gridBagConstraintsTransferenciasResumidos);
	}

	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
	this.gridBagConstraintsTransferenciasResumidos.gridx = 1;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoTransferenciasResumidos.add(jTextFieldtipoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelidTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_lineaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_linea_grupoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_linea_categoriaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelid_linea_marcaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelfecha_emision_desdeTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelfecha_emision_hastaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelnombre_transaccionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelnombre_bodegaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelnombre_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelnombre_unidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelcantidadTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelcosto_unitarioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelcosto_totalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelnombre_bodega_enviarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPanelcodigo_productoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferenciasResumidos.add(this.jPaneltipoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposTransferenciasResumidos % 2==0) {
		iXPanelCamposTransferenciasResumidos=0;
		iYPanelCamposTransferenciasResumidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposOcultosTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposOcultosTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransferenciasResumidos.add(this.jPanelid_empresaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposOcultosTransferenciasResumidos % 2==0) {
		iXPanelCamposOcultosTransferenciasResumidos=0;
		iYPanelCamposOcultosTransferenciasResumidos++;
	}
	this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferenciasResumidos.gridy = iYPanelCamposOcultosTransferenciasResumidos;
	this.gridBagConstraintsTransferenciasResumidos.gridx = iXPanelCamposOcultosTransferenciasResumidos++;
	this.gridBagConstraintsTransferenciasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferenciasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransferenciasResumidos.add(this.jPanelid_sucursalTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);



	if(iXPanelCamposOcultosTransferenciasResumidos % 2==0) {
		iXPanelCamposOcultosTransferenciasResumidos=0;
		iYPanelCamposOcultosTransferenciasResumidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransferenciasResumidos= new GridBagLayout();
		this.jPanelAccionesTransferenciasResumidos.setLayout(gridaBagLayoutAccionesTransferenciasResumidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransferenciasResumidos= new GridBagLayout();
		this.jPanelAccionesFormularioTransferenciasResumidos.setLayout(gridaBagLayoutAccionesFormularioTransferenciasResumidos);
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransferenciasResumidos.add(this.jComboBoxTiposAccionesFormularioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonModificarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);							

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonEliminarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonActualizarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonGuardarCambiosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);	
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;		
		this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonCancelarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferenciasResumidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;		
			//this.gridBagConstraintsTransferenciasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferenciasResumidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferenciasResumidos.gridx =0;
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferenciasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransferenciasResumidos = new TransferenciasResumidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transferencias Resumidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transferencias Resumidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencias Resumidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransferenciasResumidosModel transferenciasresumidosModel=new TransferenciasResumidosModel(this);
			
			//SI USARA CLASE INTERNA
			//TransferenciasResumidosModel.TransferenciasResumidosFocusTraversalPolicy transferenciasresumidosFocusTraversalPolicy = transferenciasresumidosModel.new TransferenciasResumidosFocusTraversalPolicy(this);
			
			//transferenciasresumidosFocusTraversalPolicy.settransferenciasresumidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transferenciasresumidosModel);
			
			
			this.jContentPaneDetalleTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransferenciasResumidos = new GridBagLayout();	
			this.jContentPaneDetalleTransferenciasResumidos.setLayout(gridaBagLayoutDetalleTransferenciasResumidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferenciasResumidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
				this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
					
				
				this.jContentPaneDetalleTransferenciasResumidos.add(jTtoolBarDetalleTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);								
				
}
			
			this.jScrollPanelDatosEdicionTransferenciasResumidos=   new JScrollPane(jContentPaneDetalleTransferenciasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransferenciasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	        
			this.jContentPaneDetalleTransferenciasResumidos.add(jPanelCamposTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);
			
			
			
			
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
						//&& transferenciasresumidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransferenciasResumidos= new GridBagConstraints();
						this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
						this.jContentPaneDetalleTransferenciasResumidos.add(this.jTabbedPaneRelacionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransferenciasResumidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransferenciasResumidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
					this.gridBagConstraintsTransferenciasResumidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
					
				
					this.jContentPaneDetalleTransferenciasResumidos.add(jPanelCamposOcultosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);
				
					this.jPanelCamposOcultosTransferenciasResumidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	        this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransferenciasResumidos.add(this.jPanelAccionesFormularioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);							
			
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
	        this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
	        
			
			this.jContentPaneDetalleTransferenciasResumidos.add(this.jPanelAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransferenciasResumidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransferenciasResumidos=   new JScrollPane(this.jPanelCamposTransferenciasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferenciasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransferenciasResumidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransferenciasResumidos;//jContentPane;
		
		return jScrollPanelDatosEdicionTransferenciasResumidos;
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
