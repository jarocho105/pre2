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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.MovimientosDetalladosConstantesFunciones;

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
public class MovimientosDetalladosDetalleFormJInternalFrame extends MovimientosDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMovimientosDetallados;
	
	protected JMenuBar jmenuBarDetalleMovimientosDetallados;
	
	protected JMenu jmenuDetalleMovimientosDetallados;
	protected JMenu jmenuDetalleArchivoMovimientosDetallados;
	protected JMenu jmenuDetalleAccionesMovimientosDetallados;
	protected JMenu jmenuDetalleDatosMovimientosDetallados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientosDetallados;	
	protected GridBagConstraints gridBagConstraintsMovimientosDetallados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MovimientosDetalladosBeanSwingJInternalFrameAdditional jInternalFrameDetalleMovimientosDetallados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

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
	
	public MovimientosDetalladosSessionBean movimientosdetalladosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public MovimientosDetalladosLogic movimientosdetalladosLogic;
	
	public JScrollPane jScrollPanelDatosMovimientosDetallados;
	public JScrollPane jScrollPanelDatosEdicionMovimientosDetallados;
	public JScrollPane jScrollPanelDatosGeneralMovimientosDetallados;
	
	protected JPanel jPanelCamposMovimientosDetallados;    
	protected JPanel jPanelCamposOcultosMovimientosDetallados;    	
	protected JPanel jPanelAccionesMovimientosDetallados;
	protected JPanel jPanelAccionesFormularioMovimientosDetallados;
    
	
	
	protected Integer iXPanelCamposMovimientosDetallados=0;
	protected Integer iYPanelCamposMovimientosDetallados=0;
	
	protected Integer iXPanelCamposOcultosMovimientosDetallados=0;
	protected Integer iYPanelCamposOcultosMovimientosDetallados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMovimientosDetallados;
	public JButton jButtonModificarMovimientosDetallados;
	public JButton jButtonActualizarMovimientosDetallados;
    public JButton jButtonEliminarMovimientosDetallados;
	public JButton jButtonCancelarMovimientosDetallados;
    public JButton jButtonGuardarCambiosMovimientosDetallados;
	public JButton jButtonGuardarCambiosTablaMovimientosDetallados;
	protected JButton jButtonCerrarMovimientosDetallados;
	
	
	protected JButton jButtonProcesarInformacionMovimientosDetallados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMovimientosDetallados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMovimientosDetallados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMovimientosDetallados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientosDetallados;
	protected JButton jButtonModificarToolBarMovimientosDetallados;
	protected JButton jButtonActualizarToolBarMovimientosDetallados;
    protected JButton jButtonEliminarToolBarMovimientosDetallados;
	protected JButton jButtonCancelarToolBarMovimientosDetallados;
    protected JButton jButtonGuardarCambiosToolBarMovimientosDetallados;
	protected JButton jButtonGuardarCambiosTablaToolBarMovimientosDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientosDetallados;
	protected JButton jButtonCerrarToolBarMovimientosDetallados;
	
	protected JButton jButtonProcesarInformacionToolBarMovimientosDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientosDetallados;
	protected JMenuItem jMenuItemModificarMovimientosDetallados;
	protected JMenuItem jMenuItemActualizarMovimientosDetallados;
    protected JMenuItem jMenuItemEliminarMovimientosDetallados;
	protected JMenuItem jMenuItemCancelarMovimientosDetallados;
    protected JMenuItem jMenuItemGuardarCambiosMovimientosDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientosDetallados;
	protected JMenuItem jMenuItemCerrarMovimientosDetallados;
	protected JMenuItem jMenuItemDetalleCerrarMovimientosDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientosDetallados;
	
	protected JMenuItem jMenuItemProcesarInformacionMovimientosDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientosDetallados;
	protected JMenuItem jMenuItemMostrarOcultarMovimientosDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientosDetallados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientosDetallados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMovimientosDetallados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMovimientosDetallados;
	public JLabel jLabelIdMovimientosDetallados;
	public JLabel jLabelidMovimientosDetallados;
	public JButton jButtonidMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeMovimientosDetallados;
	public JLabel jLabelfecha_emision_desdeMovimientosDetallados;
	//public JFormattedTextField jDateChooserfecha_emision_desdeMovimientosDetallados;

	public JDateChooser jDateChooserfecha_emision_desdeMovimientosDetallados;
	public JButton jButtonfecha_emision_desdeMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaMovimientosDetallados;
	public JLabel jLabelfecha_emision_hastaMovimientosDetallados;
	//public JFormattedTextField jDateChooserfecha_emision_hastaMovimientosDetallados;

	public JDateChooser jDateChooserfecha_emision_hastaMovimientosDetallados;
	public JButton jButtonfecha_emision_hastaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalMovimientosDetallados;
	public JLabel jLabelnombre_sucursalMovimientosDetallados;
	public JTextArea jTextAreanombre_sucursalMovimientosDetallados;
	public JScrollPane jscrollPanenombre_sucursalMovimientosDetallados;
	public JButton jButtonnombre_sucursalMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteMovimientosDetallados;
	public JLabel jLabelnombre_completo_clienteMovimientosDetallados;
	public JTextArea jTextAreanombre_completo_clienteMovimientosDetallados;
	public JScrollPane jscrollPanenombre_completo_clienteMovimientosDetallados;
	public JButton jButtonnombre_completo_clienteMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionMovimientosDetallados;
	public JLabel jLabelnombre_transaccionMovimientosDetallados;
	public JTextArea jTextAreanombre_transaccionMovimientosDetallados;
	public JScrollPane jscrollPanenombre_transaccionMovimientosDetallados;
	public JButton jButtonnombre_transaccionMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteMovimientosDetallados;
	public JLabel jLabelnumero_comprobanteMovimientosDetallados;
	public JTextField jTextFieldnumero_comprobanteMovimientosDetallados;
	public JButton jButtonnumero_comprobanteMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaMovimientosDetallados;
	public JLabel jLabelnumero_facturaMovimientosDetallados;
	public JTextField jTextFieldnumero_facturaMovimientosDetallados;
	public JButton jButtonnumero_facturaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialMovimientosDetallados;
	public JLabel jLabelnumero_secuencialMovimientosDetallados;
	public JTextField jTextFieldnumero_secuencialMovimientosDetallados;
	public JButton jButtonnumero_secuencialMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionMovimientosDetallados;
	public JLabel jLabelfecha_emisionMovimientosDetallados;
	//public JFormattedTextField jDateChooserfecha_emisionMovimientosDetallados;

	public JDateChooser jDateChooserfecha_emisionMovimientosDetallados;
	public JButton jButtonfecha_emisionMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoMovimientosDetallados;
	public JLabel jLabelnombre_productoMovimientosDetallados;
	public JTextArea jTextAreanombre_productoMovimientosDetallados;
	public JScrollPane jscrollPanenombre_productoMovimientosDetallados;
	public JButton jButtonnombre_productoMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadMovimientosDetallados;
	public JLabel jLabelnombre_unidadMovimientosDetallados;
	public JTextField jTextFieldnombre_unidadMovimientosDetallados;
	public JButton jButtonnombre_unidadMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadMovimientosDetallados;
	public JLabel jLabelcantidadMovimientosDetallados;
	public JTextField jTextFieldcantidadMovimientosDetallados;
	public JButton jButtoncantidadMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelivaMovimientosDetallados;
	public JLabel jLabelivaMovimientosDetallados;
	public JTextField jTextFieldivaMovimientosDetallados;
	public JButton jButtonivaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioMovimientosDetallados;
	public JLabel jLabelcosto_unitarioMovimientosDetallados;
	public JTextField jTextFieldcosto_unitarioMovimientosDetallados;
	public JButton jButtoncosto_unitarioMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalMovimientosDetallados;
	public JLabel jLabelcosto_totalMovimientosDetallados;
	public JTextField jTextFieldcosto_totalMovimientosDetallados;
	public JButton jButtoncosto_totalMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPaneliceMovimientosDetallados;
	public JLabel jLabeliceMovimientosDetallados;
	public JTextField jTextFieldiceMovimientosDetallados;
	public JButton jButtoniceMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoMovimientosDetallados;
	public JLabel jLabelcodigo_productoMovimientosDetallados;
	public JTextField jTextFieldcodigo_productoMovimientosDetallados;
	public JButton jButtoncodigo_productoMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMovimientosDetallados;
	public JLabel jLabelid_empresaMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMovimientosDetallados;
	public JButton jButtonid_empresaMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_empresaMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empresaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMovimientosDetallados;
	public JLabel jLabelid_sucursalMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMovimientosDetallados;
	public JButton jButtonid_sucursalMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_sucursalMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteMovimientosDetallados;
	public JLabel jLabelid_clienteMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteMovimientosDetallados;
	public JButton jButtonid_clienteMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_clienteMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_clienteMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionMovimientosDetallados;
	public JLabel jLabelid_transaccionMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionMovimientosDetallados;
	public JButton jButtonid_transaccionMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_transaccionMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaMovimientosDetallados;
	public JLabel jLabelid_lineaMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaMovimientosDetallados;
	public JButton jButtonid_lineaMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_lineaMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_lineaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoMovimientosDetallados;
	public JLabel jLabelid_linea_grupoMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoMovimientosDetallados;
	public JButton jButtonid_linea_grupoMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_grupoMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaMovimientosDetallados;
	public JLabel jLabelid_linea_categoriaMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaMovimientosDetallados;
	public JButton jButtonid_linea_categoriaMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_categoriaMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaMovimientosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaMovimientosDetallados;
	public JLabel jLabelid_linea_marcaMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaMovimientosDetallados;
	public JButton jButtonid_linea_marcaMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_marcaMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaMovimientosDetalladosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMovimientosDetallados;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MovimientosDetalladosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMovimientosDetallados=new JPanel();
				this.jPanelAccionesFormularioMovimientosDetallados=new JPanel();
				this.jmenuBarDetalleMovimientosDetallados=new JMenuBar();
				this.jTtoolBarDetalleMovimientosDetallados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MovimientosDetalladosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMovimientosDetallados() {
		return this.jButtonActualizarToolBarMovimientosDetallados;
	}
	
	public JButton getjButtonEliminarToolBarMovimientosDetallados() {
		return this.jButtonEliminarToolBarMovimientosDetallados;
	}
	
	public JButton getjButtonCancelarToolBarMovimientosDetallados() {
		return this.jButtonCancelarToolBarMovimientosDetallados;
	}		
	
	public JButton getjButtonProcesarInformacionMovimientosDetallados() {
		return this.jButtonProcesarInformacionMovimientosDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientosDetallados)	{
		this.jButtonProcesarInformacionMovimientosDetallados = jButtonProcesarInformacionMovimientosDetallados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientosDetallados() {
		return this.jComboBoxTiposAccionesMovimientosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientosDetallados(
			JComboBox jComboBoxTiposRelacionesMovimientosDetallados) {
		this.jComboBoxTiposRelacionesMovimientosDetallados = jComboBoxTiposRelacionesMovimientosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientosDetallados(
			JComboBox jComboBoxTiposAccionesMovimientosDetallados) {
		this.jComboBoxTiposAccionesMovimientosDetallados = jComboBoxTiposAccionesMovimientosDetallados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMovimientosDetallados() {
		return this.jComboBoxTiposAccionesFormularioMovimientosDetallados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMovimientosDetallados(
			JComboBox jComboBoxTiposAccionesFormularioMovimientosDetallados) {
		this.jComboBoxTiposAccionesFormularioMovimientosDetallados = jComboBoxTiposAccionesFormularioMovimientosDetallados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
		
		this.movimientosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientosdetalladosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientosDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimientos Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
	
		MovimientosDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMovimientosDetallados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMovimientosDetallados=new JButtonMe();
				this.jButtonModificarToolBarMovimientosDetallados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados,
							"actualizar","actualizar","Actualizar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados,
							"eliminar","eliminar","Eliminar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados,
							"cancelar","cancelar","Cancelar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados,
							"guardarcambios","guardarcambios","Guardar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMovimientosDetallados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMovimientosDetallados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMovimientosDetallados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMovimientosDetallados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMovimientosDetallados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientosDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientosDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientosDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMovimientosDetallados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMovimientosDetallados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMovimientosDetallados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMovimientosDetallados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMovimientosDetallados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMovimientosDetallados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMovimientosDetallados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMovimientosDetallados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMovimientosDetallados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMovimientosDetallados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMovimientosDetallados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMovimientosDetallados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMovimientosDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientosDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientosDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMovimientosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMovimientosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMovimientosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMovimientosDetallados.add(this.jMenuItemDetalleCerrarMovimientosDetallados);
		
		this.jmenuDetalleAccionesMovimientosDetallados.add(this.jMenuItemActualizarMovimientosDetallados);
		this.jmenuDetalleAccionesMovimientosDetallados.add(this.jMenuItemEliminarMovimientosDetallados);
		this.jmenuDetalleAccionesMovimientosDetallados.add(this.jMenuItemCancelarMovimientosDetallados);		
		
		//this.jmenuDetalleDatosMovimientosDetallados.add(this.jMenuItemDetalleAbrirOrderByMovimientosDetallados);				
		this.jmenuDetalleDatosMovimientosDetallados.add(this.jMenuItemDetalleMostarOcultarMovimientosDetallados);				
				
		//this.jmenuDetalleAccionesMovimientosDetallados.add(this.jMenuItemGuardarCambiosMovimientosDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMovimientosDetallados.add(this.jmenuDetalleArchivoMovimientosDetallados);		
		this.jmenuBarDetalleMovimientosDetallados.add(this.jmenuDetalleAccionesMovimientosDetallados);		
		this.jmenuBarDetalleMovimientosDetallados.add(this.jmenuDetalleDatosMovimientosDetallados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMovimientosDetallados);				
	}
	
	
	public void inicializarElementosCamposMovimientosDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMovimientosDetallados = new JLabelMe();
		jLabelIdMovimientosDetallados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMovimientosDetallados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMovimientosDetallados= new GridBagLayout();

		this.jPanelidMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);

		jLabelidMovimientosDetallados = new JLabel();
		jLabelidMovimientosDetallados.setText("Id");

		jLabelidMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeMovimientosDetallados = new JLabelMe();
		this.jLabelfecha_emision_desdeMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeMovimientosDetallados.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelfecha_emision_desdeMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		//jFormattedTextFieldfecha_emision_desdeMovimientosDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeMovimientosDetallados= new JDateChooser();
		jDateChooserfecha_emision_desdeMovimientosDetallados.setEnabled(false);
		jDateChooserfecha_emision_desdeMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeMovimientosDetallados.setDate(new Date());
		jDateChooserfecha_emision_desdeMovimientosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeMovimientosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaMovimientosDetallados = new JLabelMe();
		this.jLabelfecha_emision_hastaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaMovimientosDetallados.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelfecha_emision_hastaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		//jFormattedTextFieldfecha_emision_hastaMovimientosDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaMovimientosDetallados= new JDateChooser();
		jDateChooserfecha_emision_hastaMovimientosDetallados.setEnabled(false);
		jDateChooserfecha_emision_hastaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaMovimientosDetallados.setDate(new Date());
		jDateChooserfecha_emision_hastaMovimientosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaMovimientosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalMovimientosDetallados = new JLabelMe();
		this.jLabelnombre_sucursalMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalMovimientosDetallados.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnombre_sucursalMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextAreanombre_sucursalMovimientosDetallados= new JTextAreaMe();
		jTextAreanombre_sucursalMovimientosDetallados.setEnabled(false);
		jTextAreanombre_sucursalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMovimientosDetallados.setLineWrap(true);
		jTextAreanombre_sucursalMovimientosDetallados.setWrapStyleWord(true);
		jTextAreanombre_sucursalMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalMovimientosDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalMovimientosDetallados = new JScrollPane(jTextAreanombre_sucursalMovimientosDetallados);
		jscrollPanenombre_sucursalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteMovimientosDetallados = new JLabelMe();
		this.jLabelnombre_completo_clienteMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteMovimientosDetallados.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnombre_completo_clienteMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextAreanombre_completo_clienteMovimientosDetallados= new JTextAreaMe();
		jTextAreanombre_completo_clienteMovimientosDetallados.setEnabled(false);
		jTextAreanombre_completo_clienteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteMovimientosDetallados.setLineWrap(true);
		jTextAreanombre_completo_clienteMovimientosDetallados.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteMovimientosDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteMovimientosDetallados = new JScrollPane(jTextAreanombre_completo_clienteMovimientosDetallados);
		jscrollPanenombre_completo_clienteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionMovimientosDetallados = new JLabelMe();
		this.jLabelnombre_transaccionMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionMovimientosDetallados.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnombre_transaccionMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextAreanombre_transaccionMovimientosDetallados= new JTextAreaMe();
		jTextAreanombre_transaccionMovimientosDetallados.setEnabled(false);
		jTextAreanombre_transaccionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionMovimientosDetallados.setLineWrap(true);
		jTextAreanombre_transaccionMovimientosDetallados.setWrapStyleWord(true);
		jTextAreanombre_transaccionMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionMovimientosDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionMovimientosDetallados = new JScrollPane(jTextAreanombre_transaccionMovimientosDetallados);
		jscrollPanenombre_transaccionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_transaccionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_transaccionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteMovimientosDetallados = new JLabelMe();
		this.jLabelnumero_comprobanteMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteMovimientosDetallados.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnumero_comprobanteMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldnumero_comprobanteMovimientosDetallados= new JTextFieldMe();

		jTextFieldnumero_comprobanteMovimientosDetallados.setEnabled(false);
		jTextFieldnumero_comprobanteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaMovimientosDetallados = new JLabelMe();
		this.jLabelnumero_facturaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaMovimientosDetallados.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnumero_facturaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldnumero_facturaMovimientosDetallados= new JTextFieldMe();

		jTextFieldnumero_facturaMovimientosDetallados.setEnabled(false);
		jTextFieldnumero_facturaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialMovimientosDetallados = new JLabelMe();
		this.jLabelnumero_secuencialMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialMovimientosDetallados.setToolTipText("Numero Secuencial");
		this.jLabelnumero_secuencialMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnumero_secuencialMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldnumero_secuencialMovimientosDetallados= new JTextFieldMe();

		jTextFieldnumero_secuencialMovimientosDetallados.setEnabled(false);
		jTextFieldnumero_secuencialMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionMovimientosDetallados = new JLabelMe();
		this.jLabelfecha_emisionMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionMovimientosDetallados.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelfecha_emisionMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		//jFormattedTextFieldfecha_emisionMovimientosDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionMovimientosDetallados= new JDateChooser();
		jDateChooserfecha_emisionMovimientosDetallados.setEnabled(false);
		jDateChooserfecha_emisionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionMovimientosDetallados.setDate(new Date());
		jDateChooserfecha_emisionMovimientosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionMovimientosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setText("U");
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoMovimientosDetallados = new JLabelMe();
		this.jLabelnombre_productoMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoMovimientosDetallados.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnombre_productoMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextAreanombre_productoMovimientosDetallados= new JTextAreaMe();
		jTextAreanombre_productoMovimientosDetallados.setEnabled(false);
		jTextAreanombre_productoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoMovimientosDetallados.setLineWrap(true);
		jTextAreanombre_productoMovimientosDetallados.setWrapStyleWord(true);
		jTextAreanombre_productoMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoMovimientosDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoMovimientosDetallados = new JScrollPane(jTextAreanombre_productoMovimientosDetallados);
		jscrollPanenombre_productoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_productoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_productoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_productoMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadMovimientosDetallados = new JLabelMe();
		this.jLabelnombre_unidadMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadMovimientosDetallados.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelnombre_unidadMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldnombre_unidadMovimientosDetallados= new JTextFieldMe();

		jTextFieldnombre_unidadMovimientosDetallados.setEnabled(false);
		jTextFieldnombre_unidadMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setText("U");
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadMovimientosDetallados = new JLabelMe();
		this.jLabelcantidadMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadMovimientosDetallados.setToolTipText("Cantad");
		this.jLabelcantidadMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelcantidadMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldcantidadMovimientosDetallados= new JTextFieldMe();
		jTextFieldcantidadMovimientosDetallados.setEnabled(false);
		jTextFieldcantidadMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadMovimientosDetallados.setText("0");

		this.jButtoncantidadMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtoncantidadMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadMovimientosDetalladosBusqueda.setText("U");
		this.jButtoncantidadMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelivaMovimientosDetallados = new JLabelMe();
		this.jLabelivaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaMovimientosDetallados.setToolTipText("Iva");
		this.jLabelivaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelivaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldivaMovimientosDetallados= new JTextFieldMe();
		jTextFieldivaMovimientosDetallados.setEnabled(false);
		jTextFieldivaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaMovimientosDetallados.setText("0.0");

		this.jButtonivaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonivaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonivaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioMovimientosDetallados = new JLabelMe();
		this.jLabelcosto_unitarioMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioMovimientosDetallados.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelcosto_unitarioMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldcosto_unitarioMovimientosDetallados= new JTextFieldMe();
		jTextFieldcosto_unitarioMovimientosDetallados.setEnabled(false);
		jTextFieldcosto_unitarioMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioMovimientosDetallados.setText("0.0");

		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setText("U");
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalMovimientosDetallados = new JLabelMe();
		this.jLabelcosto_totalMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalMovimientosDetallados.setToolTipText("Costo Total");
		this.jLabelcosto_totalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelcosto_totalMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldcosto_totalMovimientosDetallados= new JTextFieldMe();
		jTextFieldcosto_totalMovimientosDetallados.setEnabled(false);
		jTextFieldcosto_totalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalMovimientosDetallados.setText("0.0");

		this.jButtoncosto_totalMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalMovimientosDetalladosBusqueda.setText("U");
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabeliceMovimientosDetallados = new JLabelMe();
		this.jLabeliceMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceMovimientosDetallados.setToolTipText("Ice");
		this.jLabeliceMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPaneliceMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldiceMovimientosDetallados= new JTextFieldMe();
		jTextFieldiceMovimientosDetallados.setEnabled(false);
		jTextFieldiceMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceMovimientosDetallados.setText("0.0");

		this.jButtoniceMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtoniceMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceMovimientosDetalladosBusqueda.setText("U");
		this.jButtoniceMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceMovimientosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoMovimientosDetallados = new JLabelMe();
		this.jLabelcodigo_productoMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoMovimientosDetallados.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelcodigo_productoMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jTextFieldcodigo_productoMovimientosDetallados= new JTextFieldMe();

		jTextFieldcodigo_productoMovimientosDetallados.setEnabled(false);
		jTextFieldcodigo_productoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setText("U");
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoMovimientosDetalladosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMovimientosDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMovimientosDetallados = new JLabelMe();
		this.jLabelid_empresaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMovimientosDetallados.setToolTipText("Empresa");
		this.jLabelid_empresaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_empresaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_empresaMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_empresaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMovimientosDetallados.setEnabled(false);

		this.jButtonid_empresaMovimientosDetallados= new JButtonMe();
		this.jButtonid_empresaMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientosDetallados.setText("Buscar");
		this.jButtonid_empresaMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosDetallados"));

		this.jButtonid_empresaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_empresaMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_empresaMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_empresaMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientosDetalladosUpdate"));



					
		this.jLabelid_sucursalMovimientosDetallados = new JLabelMe();
		this.jLabelid_sucursalMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMovimientosDetallados.setToolTipText("Sucursal");
		this.jLabelid_sucursalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_sucursalMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_sucursalMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_sucursalMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMovimientosDetallados.setEnabled(false);

		this.jButtonid_sucursalMovimientosDetallados= new JButtonMe();
		this.jButtonid_sucursalMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientosDetallados.setText("Buscar");
		this.jButtonid_sucursalMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosDetallados"));

		this.jButtonid_sucursalMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_sucursalMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_sucursalMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientosDetalladosUpdate"));



					
		this.jLabelid_clienteMovimientosDetallados = new JLabelMe();
		this.jLabelid_clienteMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteMovimientosDetallados.setToolTipText("Cliente");
		this.jLabelid_clienteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_clienteMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_clienteMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_clienteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteMovimientosDetallados= new JButtonMe();
		this.jButtonid_clienteMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMovimientosDetallados.setText("Buscar");
		this.jButtonid_clienteMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMovimientosDetallados"));

		this.jButtonid_clienteMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_clienteMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_clienteMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_clienteMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMovimientosDetalladosUpdate"));



					
		this.jLabelid_transaccionMovimientosDetallados = new JLabelMe();
		this.jLabelid_transaccionMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionMovimientosDetallados.setToolTipText("Transaccion");
		this.jLabelid_transaccionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_transaccionMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_transaccionMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_transaccionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionMovimientosDetallados= new JButtonMe();
		this.jButtonid_transaccionMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientosDetallados.setText("Buscar");
		this.jButtonid_transaccionMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosDetallados"));

		this.jButtonid_transaccionMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_transaccionMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_transaccionMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_transaccionMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientosDetalladosUpdate"));



					
		this.jLabelid_lineaMovimientosDetallados = new JLabelMe();
		this.jLabelid_lineaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaMovimientosDetallados.setToolTipText("Linea");
		this.jLabelid_lineaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_lineaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_lineaMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_lineaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaMovimientosDetallados= new JButtonMe();
		this.jButtonid_lineaMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaMovimientosDetallados.setText("Buscar");
		this.jButtonid_lineaMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaMovimientosDetallados"));

		this.jButtonid_lineaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_lineaMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_lineaMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_lineaMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaMovimientosDetalladosUpdate"));



					
		this.jLabelid_linea_grupoMovimientosDetallados = new JLabelMe();
		this.jLabelid_linea_grupoMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoMovimientosDetallados.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_linea_grupoMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_linea_grupoMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_grupoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoMovimientosDetallados= new JButtonMe();
		this.jButtonid_linea_grupoMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoMovimientosDetallados.setText("Buscar");
		this.jButtonid_linea_grupoMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoMovimientosDetallados"));

		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoMovimientosDetalladosUpdate"));



					
		this.jLabelid_linea_categoriaMovimientosDetallados = new JLabelMe();
		this.jLabelid_linea_categoriaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaMovimientosDetallados.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_linea_categoriaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_linea_categoriaMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_categoriaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaMovimientosDetallados= new JButtonMe();
		this.jButtonid_linea_categoriaMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaMovimientosDetallados.setText("Buscar");
		this.jButtonid_linea_categoriaMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaMovimientosDetallados"));

		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaMovimientosDetalladosUpdate"));



					
		this.jLabelid_linea_marcaMovimientosDetallados = new JLabelMe();
		this.jLabelid_linea_marcaMovimientosDetallados.setText(""+MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaMovimientosDetallados.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaMovimientosDetallados.setToolTipText(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		this.jPanelid_linea_marcaMovimientosDetallados.setLayout(this.gridaBagLayoutMovimientosDetallados);


		jComboBoxid_linea_marcaMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_marcaMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaMovimientosDetallados= new JButtonMe();
		this.jButtonid_linea_marcaMovimientosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaMovimientosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaMovimientosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaMovimientosDetallados.setText("Buscar");
		this.jButtonid_linea_marcaMovimientosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaMovimientosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaMovimientosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaMovimientosDetallados"));

		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setText("U");
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaMovimientosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaMovimientosDetalladosBusqueda"));

		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaMovimientosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaMovimientosDetalladosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setText("U");
		this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaMovimientosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaMovimientosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaMovimientosDetalladosUpdate"));



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
		//this.jInternalFrameDetalleMovimientosDetallados = new MovimientosDetalladosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Movimientos Detallados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientosDetallados= new GridBagLayout();
		

		
		String sToolTipMovimientosDetallados="";
		sToolTipMovimientosDetallados=MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientosDetallados+="(Inventario.MovimientosDetallados)";
		}
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientosDetallados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMovimientosDetallados = new JButtonMe();
		this.jButtonModificarMovimientosDetallados = new JButtonMe();
        this.jButtonActualizarMovimientosDetallados = new JButtonMe();
        this.jButtonEliminarMovimientosDetallados = new JButtonMe();
        this.jButtonCancelarMovimientosDetallados = new JButtonMe();
        this.jButtonGuardarCambiosMovimientosDetallados = new JButtonMe();
		this.jButtonGuardarCambiosTablaMovimientosDetallados = new JButtonMe();
		this.jButtonCerrarMovimientosDetallados = new JButtonMe();
		
		this.jScrollPanelDatosMovimientosDetallados = new JScrollPane();   
        this.jScrollPanelDatosEdicionMovimientosDetallados = new JScrollPane();
		this.jScrollPanelDatosGeneralMovimientosDetallados = new JScrollPane();
				
		
		
		this.jPanelCamposMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Movimientos Detallados";
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMovimientosDetallados.setName("jPanelCamposMovimientosDetallados"); 

		this.jPanelCamposOcultosMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMovimientosDetallados.setName("jPanelCamposOcultosMovimientosDetallados"); 

        this.jPanelAccionesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesMovimientosDetallados.setName("Acciones"); 

		this.jPanelAccionesFormularioMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMovimientosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMovimientosDetallados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMovimientosDetallados.setText("Nuevo");
		this.jButtonModificarMovimientosDetallados.setText("Editar");
        this.jButtonActualizarMovimientosDetallados.setText("Actualizar");
        this.jButtonEliminarMovimientosDetallados.setText("Eliminar");
        this.jButtonCancelarMovimientosDetallados.setText("Cancelar");
        this.jButtonGuardarCambiosMovimientosDetallados.setText("Guardar");
		this.jButtonGuardarCambiosTablaMovimientosDetallados.setText("Guardar");
		this.jButtonCerrarMovimientosDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientosDetallados,"nuevo_button","Nuevo",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMovimientosDetallados,"modificar_button","Editar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMovimientosDetallados,"actualizar_button","Actualizar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMovimientosDetallados,"eliminar_button","Eliminar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMovimientosDetallados,"cancelar_button","Cancelar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMovimientosDetallados,"guardarcambios_button","Guardar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientosDetallados,"guardarcambiostabla_button","Guardar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientosDetallados,"cerrar_button","Salir",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMovimientosDetallados.setToolTipText("Nuevo"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMovimientosDetallados.setToolTipText("Editar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMovimientosDetallados.setToolTipText("Actualizar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMovimientosDetallados.setToolTipText("Eliminar)"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMovimientosDetallados.setToolTipText("Cancelar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMovimientosDetallados.setToolTipText("Guardar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMovimientosDetallados.setToolTipText("Guardar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientosDetallados.setToolTipText("Salir"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientosDetallados";
		inputMap = this.jButtonNuevoMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientosDetallados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMovimientosDetallados";
		inputMap = this.jButtonActualizarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMovimientosDetallados"));
		
		//ELIMINAR
		sMapKey = "EliminarMovimientosDetallados";
		inputMap = this.jButtonEliminarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMovimientosDetallados"));
		
		//CANCELAR	
		sMapKey = "CancelarMovimientosDetallados";
		inputMap = this.jButtonCancelarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMovimientosDetallados"));
		
		//CERRAR		
		sMapKey = "CerrarMovimientosDetallados";
		inputMap = this.jButtonCerrarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientosDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientosDetallados";
		inputMap = this.jButtonGuardarCambiosTablaMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientosDetallados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMovimientosDetallados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMovimientosDetallados.setToolTipText("Nuevo MovimientosDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMovimientosDetallados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMovimientosDetallados.setToolTipText("Sin Cerrar Ventana MovimientosDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMovimientosDetallados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMovimientosDetallados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientosDetallados.setText("Accion");
		this.jComboBoxTiposAccionesMovimientosDetallados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMovimientosDetallados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMovimientosDetallados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMovimientosDetallados = new JLabelMe();
		
		this.jLabelAccionesMovimientosDetallados.setText("Acciones");		
		this.jLabelAccionesMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMovimientosDetallados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMovimientosDetallados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMovimientosDetallados=new JTabbedPane();
		this.jTabbedPaneRelacionesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMovimientosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMovimientosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientosDetallados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMovimientosDetallados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMovimientosDetallados = new GridBagLayout();
		
		this.jPanelCamposMovimientosDetallados.setLayout(gridaBagLayoutCamposMovimientosDetallados);
		this.jPanelCamposOcultosMovimientosDetallados.setLayout(gridaBagLayoutCamposOcultosMovimientosDetallados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMovimientosDetallados.add(jLabelIdMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMovimientosDetallados.add(jLabelidMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMovimientosDetallados.add(jLabelid_empresaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientosDetallados.add(jButtonid_empresaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientosDetallados.add(jButtonid_empresaMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMovimientosDetallados.add(jComboBoxid_empresaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMovimientosDetallados.add(jLabelid_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientosDetallados.add(jButtonid_sucursalMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientosDetallados.add(jButtonid_sucursalMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMovimientosDetallados.add(jComboBoxid_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteMovimientosDetallados.add(jLabelid_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteMovimientosDetallados.add(jButtonid_clienteMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteMovimientosDetallados.add(jButtonid_clienteMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteMovimientosDetallados.add(jComboBoxid_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionMovimientosDetallados.add(jLabelid_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientosDetallados.add(jButtonid_transaccionMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientosDetallados.add(jButtonid_transaccionMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionMovimientosDetallados.add(jComboBoxid_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaMovimientosDetallados.add(jLabelid_lineaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaMovimientosDetallados.add(jButtonid_lineaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaMovimientosDetallados.add(jButtonid_lineaMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaMovimientosDetallados.add(jComboBoxid_lineaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoMovimientosDetallados.add(jLabelid_linea_grupoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoMovimientosDetallados.add(jButtonid_linea_grupoMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoMovimientosDetallados.add(jButtonid_linea_grupoMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoMovimientosDetallados.add(jComboBoxid_linea_grupoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaMovimientosDetallados.add(jLabelid_linea_categoriaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaMovimientosDetallados.add(jButtonid_linea_categoriaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaMovimientosDetallados.add(jButtonid_linea_categoriaMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaMovimientosDetallados.add(jComboBoxid_linea_categoriaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaMovimientosDetallados.add(jLabelid_linea_marcaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaMovimientosDetallados.add(jButtonid_linea_marcaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 3;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaMovimientosDetallados.add(jButtonid_linea_marcaMovimientosDetalladosUpdate, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaMovimientosDetallados.add(jComboBoxid_linea_marcaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeMovimientosDetallados.add(jLabelfecha_emision_desdeMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeMovimientosDetallados.add(jButtonfecha_emision_desdeMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeMovimientosDetallados.add(jDateChooserfecha_emision_desdeMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaMovimientosDetallados.add(jLabelfecha_emision_hastaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaMovimientosDetallados.add(jButtonfecha_emision_hastaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaMovimientosDetallados.add(jDateChooserfecha_emision_hastaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalMovimientosDetallados.add(jLabelnombre_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalMovimientosDetallados.add(jButtonnombre_sucursalMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalMovimientosDetallados.add(jscrollPanenombre_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteMovimientosDetallados.add(jLabelnombre_completo_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteMovimientosDetallados.add(jButtonnombre_completo_clienteMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteMovimientosDetallados.add(jscrollPanenombre_completo_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionMovimientosDetallados.add(jLabelnombre_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionMovimientosDetallados.add(jButtonnombre_transaccionMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionMovimientosDetallados.add(jscrollPanenombre_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteMovimientosDetallados.add(jLabelnumero_comprobanteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteMovimientosDetallados.add(jButtonnumero_comprobanteMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteMovimientosDetallados.add(jTextFieldnumero_comprobanteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaMovimientosDetallados.add(jLabelnumero_facturaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaMovimientosDetallados.add(jButtonnumero_facturaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaMovimientosDetallados.add(jTextFieldnumero_facturaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialMovimientosDetallados.add(jLabelnumero_secuencialMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialMovimientosDetallados.add(jButtonnumero_secuencialMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialMovimientosDetallados.add(jTextFieldnumero_secuencialMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionMovimientosDetallados.add(jLabelfecha_emisionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionMovimientosDetallados.add(jButtonfecha_emisionMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionMovimientosDetallados.add(jDateChooserfecha_emisionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoMovimientosDetallados.add(jLabelnombre_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoMovimientosDetallados.add(jButtonnombre_productoMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoMovimientosDetallados.add(jscrollPanenombre_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadMovimientosDetallados.add(jLabelnombre_unidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadMovimientosDetallados.add(jButtonnombre_unidadMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadMovimientosDetallados.add(jTextFieldnombre_unidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadMovimientosDetallados.add(jLabelcantidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadMovimientosDetallados.add(jButtoncantidadMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadMovimientosDetallados.add(jTextFieldcantidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaMovimientosDetallados.add(jLabelivaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaMovimientosDetallados.add(jButtonivaMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaMovimientosDetallados.add(jTextFieldivaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioMovimientosDetallados.add(jLabelcosto_unitarioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioMovimientosDetallados.add(jButtoncosto_unitarioMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioMovimientosDetallados.add(jTextFieldcosto_unitarioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalMovimientosDetallados.add(jLabelcosto_totalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalMovimientosDetallados.add(jButtoncosto_totalMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalMovimientosDetallados.add(jTextFieldcosto_totalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceMovimientosDetallados.add(jLabeliceMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceMovimientosDetallados.add(jButtoniceMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceMovimientosDetallados.add(jTextFieldiceMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoMovimientosDetallados.add(jLabelcodigo_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 2;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
		this.gridBagConstraintsMovimientosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoMovimientosDetallados.add(jButtoncodigo_productoMovimientosDetalladosBusqueda, this.gridBagConstraintsMovimientosDetallados);
	}

	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientosDetallados.gridy = 0;
	this.gridBagConstraintsMovimientosDetallados.gridx = 1;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoMovimientosDetallados.add(jTextFieldcodigo_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelidMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_lineaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_linea_grupoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_linea_categoriaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelid_linea_marcaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelfecha_emision_desdeMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelfecha_emision_hastaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnombre_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnombre_completo_clienteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnombre_transaccionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnumero_comprobanteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnumero_facturaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnumero_secuencialMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelfecha_emisionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnombre_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelnombre_unidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelcantidadMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelivaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelcosto_unitarioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelcosto_totalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPaneliceMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMovimientosDetallados.add(this.jPanelcodigo_productoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposMovimientosDetallados % 3==0) {
		iXPanelCamposMovimientosDetallados=0;
		iYPanelCamposMovimientosDetallados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposOcultosMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposOcultosMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientosDetallados.add(this.jPanelid_empresaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposOcultosMovimientosDetallados % 3==0) {
		iXPanelCamposOcultosMovimientosDetallados=0;
		iYPanelCamposOcultosMovimientosDetallados++;
	}
	this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientosDetallados.gridy = iYPanelCamposOcultosMovimientosDetallados;
	this.gridBagConstraintsMovimientosDetallados.gridx = iXPanelCamposOcultosMovimientosDetallados++;
	this.gridBagConstraintsMovimientosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMovimientosDetallados.add(this.jPanelid_sucursalMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);



	if(iXPanelCamposOcultosMovimientosDetallados % 3==0) {
		iXPanelCamposOcultosMovimientosDetallados=0;
		iYPanelCamposOcultosMovimientosDetallados++;
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
			
		GridBagLayout gridaBagLayoutAccionesMovimientosDetallados= new GridBagLayout();
		this.jPanelAccionesMovimientosDetallados.setLayout(gridaBagLayoutAccionesMovimientosDetallados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMovimientosDetallados= new GridBagLayout();
		this.jPanelAccionesFormularioMovimientosDetallados.setLayout(gridaBagLayoutAccionesFormularioMovimientosDetallados);
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientosDetallados.add(this.jComboBoxTiposAccionesFormularioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccion++;
			
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonModificarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);							

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx =iPosXAccion++;
			
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonEliminarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonActualizarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonGuardarCambiosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);	
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;		
		this.gridBagConstraintsMovimientosDetallados.gridx =iPosXAccion++;
		
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonCancelarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientosDetallados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();						
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;		
			//this.gridBagConstraintsMovimientosDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientosDetallados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientosDetallados.gridx =0;
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientosDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMovimientosDetallados = new MovimientosDetalladosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Movimientos Detallados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Movimientos Detallados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimientos Detallados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MovimientosDetalladosModel movimientosdetalladosModel=new MovimientosDetalladosModel(this);
			
			//SI USARA CLASE INTERNA
			//MovimientosDetalladosModel.MovimientosDetalladosFocusTraversalPolicy movimientosdetalladosFocusTraversalPolicy = movimientosdetalladosModel.new MovimientosDetalladosFocusTraversalPolicy(this);
			
			//movimientosdetalladosFocusTraversalPolicy.setmovimientosdetalladosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(movimientosdetalladosModel);
			
			
			this.jContentPaneDetalleMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMovimientosDetallados = new GridBagLayout();	
			this.jContentPaneDetalleMovimientosDetallados.setLayout(gridaBagLayoutDetalleMovimientosDetallados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientosDetallados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
				this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMovimientosDetallados.gridx = 0;
					
				
				this.jContentPaneDetalleMovimientosDetallados.add(jTtoolBarDetalleMovimientosDetallados, gridBagConstraintsMovimientosDetallados);								
				
}
			
			this.jScrollPanelDatosEdicionMovimientosDetallados=   new JScrollPane(jContentPaneDetalleMovimientosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMovimientosDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	        
			this.jContentPaneDetalleMovimientosDetallados.add(jPanelCamposMovimientosDetallados, gridBagConstraintsMovimientosDetallados);
			
			
			
			
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
						//&& movimientosdetalladosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMovimientosDetallados= new GridBagConstraints();
						this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMovimientosDetallados.gridx = 0;
						this.jContentPaneDetalleMovimientosDetallados.add(this.jTabbedPaneRelacionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMovimientosDetallados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMovimientosDetallados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
					this.gridBagConstraintsMovimientosDetallados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMovimientosDetallados.gridx = 0;
					
				
					this.jContentPaneDetalleMovimientosDetallados.add(jPanelCamposOcultosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);
				
					this.jPanelCamposOcultosMovimientosDetallados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	        this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMovimientosDetallados.add(this.jPanelAccionesFormularioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);							
			
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
	        this.gridBagConstraintsMovimientosDetallados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMovimientosDetallados.gridx = 0;
	        
			
			this.jContentPaneDetalleMovimientosDetallados.add(this.jPanelAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMovimientosDetallados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMovimientosDetallados=   new JScrollPane(this.jPanelCamposMovimientosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMovimientosDetallados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMovimientosDetallados;//jContentPane;
		
		return jScrollPanelDatosEdicionMovimientosDetallados;
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
