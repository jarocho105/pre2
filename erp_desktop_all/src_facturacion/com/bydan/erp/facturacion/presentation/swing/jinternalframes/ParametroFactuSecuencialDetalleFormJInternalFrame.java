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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuSecuencialConstantesFunciones;

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
public class ParametroFactuSecuencialDetalleFormJInternalFrame extends ParametroFactuSecuencialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFactuSecuencial;
	
	protected JMenuBar jmenuBarDetalleParametroFactuSecuencial;
	
	protected JMenu jmenuDetalleParametroFactuSecuencial;
	protected JMenu jmenuDetalleArchivoParametroFactuSecuencial;
	protected JMenu jmenuDetalleAccionesParametroFactuSecuencial;
	protected JMenu jmenuDetalleDatosParametroFactuSecuencial;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuSecuencial;	
	protected GridBagConstraints gridBagConstraintsParametroFactuSecuencial;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFactuSecuencialBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFactuSecuencial;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoParamFactuPlazoBeanSwingJInternalFrame tipoparamfactuplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactuplazo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected BodegaBeanSwingJInternalFrame bodegatransferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegatransferencia="";

	protected TransaccionBeanSwingJInternalFrame transacciontransferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciontransferencia="";
	
	public ParametroFactuSecuencialSessionBean parametrofactusecuencialSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public BodegaSessionBean bodegatransferenciaSessionBean;
	public TransaccionSessionBean transacciontransferenciaSessionBean;	
	
	public ParametroFactuSecuencialLogic parametrofactusecuencialLogic;
	
	public JScrollPane jScrollPanelDatosParametroFactuSecuencial;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuSecuencial;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuSecuencial;
	
	protected JPanel jPanelCamposParametroFactuSecuencial;    
	protected JPanel jPanelCamposOcultosParametroFactuSecuencial;    	
	protected JPanel jPanelAccionesParametroFactuSecuencial;
	protected JPanel jPanelAccionesFormularioParametroFactuSecuencial;
    
	
	
	protected Integer iXPanelCamposParametroFactuSecuencial=0;
	protected Integer iYPanelCamposParametroFactuSecuencial=0;
	
	protected Integer iXPanelCamposOcultosParametroFactuSecuencial=0;
	protected Integer iYPanelCamposOcultosParametroFactuSecuencial=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFactuSecuencial;
	protected Integer iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
	protected Integer iYPanelCamposIniciogeneralParametroFactuSecuencial=0;

	protected JPanel jPanelCamposIniciotransferenciaParametroFactuSecuencial;
	protected Integer iXPanelCamposIniciotransferenciaParametroFactuSecuencial=0;
	protected Integer iYPanelCamposIniciotransferenciaParametroFactuSecuencial=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFactuSecuencial;
	public JButton jButtonModificarParametroFactuSecuencial;
	public JButton jButtonActualizarParametroFactuSecuencial;
    public JButton jButtonEliminarParametroFactuSecuencial;
	public JButton jButtonCancelarParametroFactuSecuencial;
    public JButton jButtonGuardarCambiosParametroFactuSecuencial;
	public JButton jButtonGuardarCambiosTablaParametroFactuSecuencial;
	protected JButton jButtonCerrarParametroFactuSecuencial;
	
	
	protected JButton jButtonProcesarInformacionParametroFactuSecuencial;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFactuSecuencial;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFactuSecuencial;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFactuSecuencial;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuSecuencial;
	protected JButton jButtonModificarToolBarParametroFactuSecuencial;
	protected JButton jButtonActualizarToolBarParametroFactuSecuencial;
    protected JButton jButtonEliminarToolBarParametroFactuSecuencial;
	protected JButton jButtonCancelarToolBarParametroFactuSecuencial;
    protected JButton jButtonGuardarCambiosToolBarParametroFactuSecuencial;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFactuSecuencial;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuSecuencial;
	protected JButton jButtonCerrarToolBarParametroFactuSecuencial;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFactuSecuencial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuSecuencial;
	protected JMenuItem jMenuItemModificarParametroFactuSecuencial;
	protected JMenuItem jMenuItemActualizarParametroFactuSecuencial;
    protected JMenuItem jMenuItemEliminarParametroFactuSecuencial;
	protected JMenuItem jMenuItemCancelarParametroFactuSecuencial;
    protected JMenuItem jMenuItemGuardarCambiosParametroFactuSecuencial;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuSecuencial;
	protected JMenuItem jMenuItemCerrarParametroFactuSecuencial;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuSecuencial;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuSecuencial;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuSecuencial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuSecuencial;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuSecuencial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuSecuencial;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuSecuencial;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFactuSecuencial;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFactuSecuencial;
	public JLabel jLabelIdParametroFactuSecuencial;
	public JLabel jLabelidParametroFactuSecuencial;
	public JButton jButtonidParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialParametroFactuSecuencial;
	public JLabel jLabelsecuencialParametroFactuSecuencial;
	public JTextField jTextFieldsecuencialParametroFactuSecuencial;
	public JButton jButtonsecuencialParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digitosParametroFactuSecuencial;
	public JLabel jLabelnumero_digitosParametroFactuSecuencial;
	public JTextField jTextFieldnumero_digitosParametroFactuSecuencial;
	public JButton jButtonnumero_digitosParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_itemsParametroFactuSecuencial;
	public JLabel jLabelnumero_itemsParametroFactuSecuencial;
	public JTextField jTextFieldnumero_itemsParametroFactuSecuencial;
	public JButton jButtonnumero_itemsParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_descuentoParametroFactuSecuencial;
	public JLabel jLabelnumero_descuentoParametroFactuSecuencial;
	public JTextField jTextFieldnumero_descuentoParametroFactuSecuencial;
	public JButton jButtonnumero_descuentoParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_adiicionalesParametroFactuSecuencial;
	public JLabel jLabelnumero_adiicionalesParametroFactuSecuencial;
	public JTextField jTextFieldnumero_adiicionalesParametroFactuSecuencial;
	public JButton jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digito_inicioParametroFactuSecuencial;
	public JLabel jLabelnumero_digito_inicioParametroFactuSecuencial;
	public JTextField jTextFieldnumero_digito_inicioParametroFactuSecuencial;
	public JButton jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digito_finParametroFactuSecuencial;
	public JLabel jLabelnumero_digito_finParametroFactuSecuencial;
	public JTextField jTextFieldnumero_digito_finParametroFactuSecuencial;
	public JButton jButtonnumero_digito_finParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_dias_plazoParametroFactuSecuencial;
	public JLabel jLabelnumero_dias_plazoParametroFactuSecuencial;
	public JTextField jTextFieldnumero_dias_plazoParametroFactuSecuencial;
	public JButton jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalleParametroFactuSecuencial;
	public JLabel jLabelcon_detalleParametroFactuSecuencial;
	public JCheckBox jCheckBoxcon_detalleParametroFactuSecuencial;
	public JButton jButtoncon_detalleParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelcon_lectorParametroFactuSecuencial;
	public JLabel jLabelcon_lectorParametroFactuSecuencial;
	public JCheckBox jCheckBoxcon_lectorParametroFactuSecuencial;
	public JButton jButtoncon_lectorParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelcon_transferenciaParametroFactuSecuencial;
	public JLabel jLabelcon_transferenciaParametroFactuSecuencial;
	public JCheckBox jCheckBoxcon_transferenciaParametroFactuSecuencial;
	public JButton jButtoncon_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFactuSecuencial;
	public JLabel jLabelid_empresaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFactuSecuencial;
	public JButton jButtonid_empresaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFactuSecuencial;
	public JLabel jLabelid_sucursalParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFactuSecuencial;
	public JButton jButtonid_sucursalParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_generalParametroFactuSecuencial;
	public JLabel jLabelid_tipo_documento_generalParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalParametroFactuSecuencial;
	public JButton jButtonid_tipo_documento_generalParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroFactuSecuencial;
	public JLabel jLabelid_bodegaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroFactuSecuencial;
	public JButton jButtonid_bodegaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_bodegaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_param_factu_plazoParametroFactuSecuencial;
	public JLabel jLabelid_tipo_param_factu_plazoParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial;
	public JButton jButtonid_tipo_param_factu_plazoParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoParametroFactuSecuencial;
	public JLabel jLabelid_formatoParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoParametroFactuSecuencial;
	public JButton jButtonid_formatoParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_formatoParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_formatoParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_transferenciaParametroFactuSecuencial;
	public JLabel jLabelid_bodega_transferenciaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_transferenciaParametroFactuSecuencial;
	public JButton jButtonid_bodega_transferenciaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_transferenciaParametroFactuSecuencial;
	public JLabel jLabelid_transaccion_transferenciaParametroFactuSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_transferenciaParametroFactuSecuencial;
	public JButton jButtonid_transaccion_transferenciaParametroFactuSecuencial= new JButtonMe();
	public JButton jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFactuSecuencial;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFactuSecuencial=new JPanel();
				this.jPanelAccionesFormularioParametroFactuSecuencial=new JPanel();
				this.jmenuBarDetalleParametroFactuSecuencial=new JMenuBar();
				this.jTtoolBarDetalleParametroFactuSecuencial=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFactuSecuencialDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuSecuencialDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuSecuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFactuSecuencial() {
		return this.jButtonActualizarToolBarParametroFactuSecuencial;
	}
	
	public JButton getjButtonEliminarToolBarParametroFactuSecuencial() {
		return this.jButtonEliminarToolBarParametroFactuSecuencial;
	}
	
	public JButton getjButtonCancelarToolBarParametroFactuSecuencial() {
		return this.jButtonCancelarToolBarParametroFactuSecuencial;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFactuSecuencial() {
		return this.jButtonProcesarInformacionParametroFactuSecuencial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuSecuencial)	{
		this.jButtonProcesarInformacionParametroFactuSecuencial = jButtonProcesarInformacionParametroFactuSecuencial;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuSecuencial() {
		return this.jComboBoxTiposAccionesParametroFactuSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuSecuencial(
			JComboBox jComboBoxTiposRelacionesParametroFactuSecuencial) {
		this.jComboBoxTiposRelacionesParametroFactuSecuencial = jComboBoxTiposRelacionesParametroFactuSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuSecuencial(
			JComboBox jComboBoxTiposAccionesParametroFactuSecuencial) {
		this.jComboBoxTiposAccionesParametroFactuSecuencial = jComboBoxTiposAccionesParametroFactuSecuencial;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFactuSecuencial() {
		return this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFactuSecuencial(
			JComboBox jComboBoxTiposAccionesFormularioParametroFactuSecuencial) {
		this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial = jComboBoxTiposAccionesFormularioParametroFactuSecuencial;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofactusecuencialSessionBean=new ParametroFactuSecuencialSessionBean();
		
		this.parametrofactusecuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactusecuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuSecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuSecuencialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Secuencial  MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFactuSecuencialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFactuSecuencial= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFactuSecuencial=new JButtonMe();
				this.jButtonModificarToolBarParametroFactuSecuencial=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFactuSecuencial,this.jTtoolBarDetalleParametroFactuSecuencial,
							"actualizar","actualizar","Actualizar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFactuSecuencial,this.jTtoolBarDetalleParametroFactuSecuencial,
							"eliminar","eliminar","Eliminar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFactuSecuencial,this.jTtoolBarDetalleParametroFactuSecuencial,
							"cancelar","cancelar","Cancelar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFactuSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFactuSecuencial,this.jTtoolBarDetalleParametroFactuSecuencial,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFactuSecuencial=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFactuSecuencial=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFactuSecuencial=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFactuSecuencial=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFactuSecuencial=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuSecuencial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuSecuencial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuSecuencial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFactuSecuencial= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFactuSecuencial.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFactuSecuencial,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFactuSecuencial= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFactuSecuencial.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFactuSecuencial,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFactuSecuencial= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFactuSecuencial.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFactuSecuencial,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFactuSecuencial= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFactuSecuencial.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFactuSecuencial,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFactuSecuencial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuSecuencial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuSecuencial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFactuSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFactuSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFactuSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFactuSecuencial.add(this.jMenuItemDetalleCerrarParametroFactuSecuencial);
		
		this.jmenuDetalleAccionesParametroFactuSecuencial.add(this.jMenuItemActualizarParametroFactuSecuencial);
		this.jmenuDetalleAccionesParametroFactuSecuencial.add(this.jMenuItemEliminarParametroFactuSecuencial);
		this.jmenuDetalleAccionesParametroFactuSecuencial.add(this.jMenuItemCancelarParametroFactuSecuencial);		
		
		//this.jmenuDetalleDatosParametroFactuSecuencial.add(this.jMenuItemDetalleAbrirOrderByParametroFactuSecuencial);				
		this.jmenuDetalleDatosParametroFactuSecuencial.add(this.jMenuItemDetalleMostarOcultarParametroFactuSecuencial);				
				
		//this.jmenuDetalleAccionesParametroFactuSecuencial.add(this.jMenuItemGuardarCambiosParametroFactuSecuencial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFactuSecuencial.add(this.jmenuDetalleArchivoParametroFactuSecuencial);		
		this.jmenuBarDetalleParametroFactuSecuencial.add(this.jmenuDetalleAccionesParametroFactuSecuencial);		
		this.jmenuBarDetalleParametroFactuSecuencial.add(this.jmenuDetalleDatosParametroFactuSecuencial);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFactuSecuencial);				
	}
	
	
	public void inicializarElementosCamposParametroFactuSecuencial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFactuSecuencial = new JLabelMe();
		jLabelIdParametroFactuSecuencial.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFactuSecuencial = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFactuSecuencial= new GridBagLayout();

		this.jPanelidParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);

		jLabelidParametroFactuSecuencial = new JLabel();
		jLabelidParametroFactuSecuencial.setText("Id");

		jLabelidParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialParametroFactuSecuencial = new JLabelMe();
		this.jLabelsecuencialParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialParametroFactuSecuencial.setToolTipText("Secuencial");
		this.jLabelsecuencialParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelsecuencialParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldsecuencialParametroFactuSecuencial= new JTextFieldMe();

		jTextFieldsecuencialParametroFactuSecuencial.setEnabled(false);
		jTextFieldsecuencialParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_digitosParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_digitosParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOS+" : *");
		this.jLabelnumero_digitosParametroFactuSecuencial.setToolTipText("No Digitos");
		this.jLabelnumero_digitosParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digitosParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digitosParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digitosParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOS);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_digitosParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_digitosParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_digitosParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_digitosParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digitosParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digitosParametroFactuSecuencial.setText("0");

		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digitosParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digitosParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digitosParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digitosParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digitosParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_itemsParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_itemsParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROITEMS+" : *");
		this.jLabelnumero_itemsParametroFactuSecuencial.setToolTipText("No Items");
		this.jLabelnumero_itemsParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_itemsParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_itemsParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_itemsParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROITEMS);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_itemsParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_itemsParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_itemsParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_itemsParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_itemsParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_itemsParametroFactuSecuencial.setText("0");

		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_itemsParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_itemsParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_itemsParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_itemsParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_itemsParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_descuentoParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_descuentoParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODESCUENTO+" : *");
		this.jLabelnumero_descuentoParametroFactuSecuencial.setToolTipText("No Descuento");
		this.jLabelnumero_descuentoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_descuentoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_descuentoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_descuentoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_descuentoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_descuentoParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODESCUENTO);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_descuentoParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_descuentoParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_descuentoParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_descuentoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_descuentoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_descuentoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_descuentoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_descuentoParametroFactuSecuencial.setText("0");

		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_descuentoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_descuentoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_descuentoParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_descuentoParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_adiicionalesParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_adiicionalesParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROADIICIONALES+" : *");
		this.jLabelnumero_adiicionalesParametroFactuSecuencial.setToolTipText("No Adiicionales");
		this.jLabelnumero_adiicionalesParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_adiicionalesParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_adiicionalesParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_adiicionalesParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_adiicionalesParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_adiicionalesParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROADIICIONALES);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_adiicionalesParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_adiicionalesParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_adiicionalesParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_adiicionalesParametroFactuSecuencial.setText("0");

		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_adiicionalesParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_adiicionalesParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_digito_inicioParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_digito_inicioParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOINICIO+" : *");
		this.jLabelnumero_digito_inicioParametroFactuSecuencial.setToolTipText("No Digito Inicio");
		this.jLabelnumero_digito_inicioParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_digito_inicioParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_digito_inicioParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digito_inicioParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digito_inicioParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digito_inicioParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOINICIO);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_digito_inicioParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_digito_inicioParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digito_inicioParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digito_inicioParametroFactuSecuencial.setText("0");

		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digito_inicioParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digito_inicioParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_digito_finParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_digito_finParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOFIN+" : *");
		this.jLabelnumero_digito_finParametroFactuSecuencial.setToolTipText("No Digito Fin");
		this.jLabelnumero_digito_finParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digito_finParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digito_finParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digito_finParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digito_finParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digito_finParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOFIN);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_digito_finParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_digito_finParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_digito_finParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_digito_finParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digito_finParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digito_finParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digito_finParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digito_finParametroFactuSecuencial.setText("0");

		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digito_finParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digito_finParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digito_finParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digito_finParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_dias_plazoParametroFactuSecuencial = new JLabelMe();
		this.jLabelnumero_dias_plazoParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIASPLAZO+" : *");
		this.jLabelnumero_dias_plazoParametroFactuSecuencial.setToolTipText("No Dias Plazo");
		this.jLabelnumero_dias_plazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dias_plazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dias_plazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_dias_plazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_dias_plazoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_dias_plazoParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIASPLAZO);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelnumero_dias_plazoParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jTextFieldnumero_dias_plazoParametroFactuSecuencial= new JTextFieldMe();
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.setEnabled(false);
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_dias_plazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_dias_plazoParametroFactuSecuencial.setText("0");

		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_dias_plazoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_dias_plazoParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalleParametroFactuSecuencial = new JLabelMe();
		this.jLabelcon_detalleParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_CONDETALLE+" : *");
		this.jLabelcon_detalleParametroFactuSecuencial.setToolTipText("Detalle");
		this.jLabelcon_detalleParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalleParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalleParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalleParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_CONDETALLE);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelcon_detalleParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jCheckBoxcon_detalleParametroFactuSecuencial= new JCheckBoxMe();
		jCheckBoxcon_detalleParametroFactuSecuencial.setEnabled(false);

		jCheckBoxcon_detalleParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalleParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalleParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setText("U");
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalleParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalleParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalleParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalleParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalleParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelcon_lectorParametroFactuSecuencial = new JLabelMe();
		this.jLabelcon_lectorParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_CONLECTOR+" : *");
		this.jLabelcon_lectorParametroFactuSecuencial.setToolTipText("Lector");
		this.jLabelcon_lectorParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lectorParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lectorParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_lectorParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_lectorParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_lectorParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_CONLECTOR);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelcon_lectorParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jCheckBoxcon_lectorParametroFactuSecuencial= new JCheckBoxMe();
		jCheckBoxcon_lectorParametroFactuSecuencial.setEnabled(false);

		jCheckBoxcon_lectorParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lectorParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lectorParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_lectorParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_lectorParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setText("U");
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_lectorParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_lectorParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_lectorParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_lectorParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_lectorParametroFactuSecuencialBusqueda.setVisible(false);		}


					
		this.jLabelcon_transferenciaParametroFactuSecuencial = new JLabelMe();
		this.jLabelcon_transferenciaParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_CONTRANSFERENCIA+" : *");
		this.jLabelcon_transferenciaParametroFactuSecuencial.setToolTipText("Transferencia");
		this.jLabelcon_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_transferenciaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_transferenciaParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_CONTRANSFERENCIA);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelcon_transferenciaParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jCheckBoxcon_transferenciaParametroFactuSecuencial= new JCheckBoxMe();
		jCheckBoxcon_transferenciaParametroFactuSecuencial.setEnabled(false);

		jCheckBoxcon_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setText("U");
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_transferenciaParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_transferenciaParametroFactuSecuencialBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFactuSecuencial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_empresaParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFactuSecuencial.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_empresaParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_empresaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_empresaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFactuSecuencial.setEnabled(false);

		this.jButtonid_empresaParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_empresaParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_empresaParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuSecuencial"));

		this.jButtonid_empresaParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_empresaParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuSecuencialUpdate"));



					
		this.jLabelid_sucursalParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_sucursalParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFactuSecuencial.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_sucursalParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_sucursalParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_sucursalParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroFactuSecuencial.setEnabled(false);

		this.jButtonid_sucursalParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_sucursalParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_sucursalParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuSecuencial"));

		this.jButtonid_sucursalParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_sucursalParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuSecuencialUpdate"));



					
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL+" : *");
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial.setToolTipText("T. Documento General");
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_generalParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_generalParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_tipo_documento_generalParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_tipo_documento_generalParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_generalParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroFactuSecuencial"));

		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroFactuSecuencialUpdate"));



					
		this.jLabelid_bodegaParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_bodegaParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroFactuSecuencial.setToolTipText("Bodega Defecto");
		this.jLabelid_bodegaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_bodegaParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_bodegaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_bodegaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_bodegaParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_bodegaParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroFactuSecuencial"));

		this.jButtonid_bodegaParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_bodegaParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroFactuSecuencialUpdate"));



					
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPOPARAMFACTUPLAZO+" : *");
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial.setToolTipText("T. Parametro Plazo");
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_param_factu_plazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_plazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPOPARAMFACTUPLAZO);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_plazoParametroFactuSecuencial"));

		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_plazoParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_plazoParametroFactuSecuencialUpdate"));



					
		this.jLabelid_formatoParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_formatoParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoParametroFactuSecuencial.setToolTipText("Formato");
		this.jLabelid_formatoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_formatoParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_formatoParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_formatoParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_formatoParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_formatoParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuSecuencial"));

		this.jButtonid_formatoParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_formatoParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_formatoParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_formatoParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuSecuencialUpdate"));



					
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGATRANSFERENCIA+" : *");
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial.setToolTipText("Bodega Transferencia");
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_transferenciaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_transferenciaParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGATRANSFERENCIA);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_bodega_transferenciaParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_bodega_transferenciaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_transferenciaParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_transferenciaParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_transferenciaParametroFactuSecuencial"));

		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_transferenciaParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_transferenciaParametroFactuSecuencialUpdate"));



					
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial = new JLabelMe();
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial.setText(""+ParametroFactuSecuencialConstantesFunciones.LABEL_IDTRANSACCIONTRANSFERENCIA+" : *");
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial.setToolTipText("Transaccion Transferencia");
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_transferenciaParametroFactuSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.setToolTipText(ParametroFactuSecuencialConstantesFunciones.LABEL_IDTRANSACCIONTRANSFERENCIA);
		this.gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.setLayout(this.gridaBagLayoutParametroFactuSecuencial);


		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial= new JComboBoxMe();
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_transferenciaParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial= new JButtonMe();
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setText("Buscar");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_transferenciaParametroFactuSecuencial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_transferenciaParametroFactuSecuencial"));

		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda= new JButtonMe();
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setText("U");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_transferenciaParametroFactuSecuencialBusqueda"));

		if(this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate= new JButtonMe();
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setText("U");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_transferenciaParametroFactuSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_transferenciaParametroFactuSecuencialUpdate"));



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
		//this.jInternalFrameDetalleParametroFactuSecuencial = new ParametroFactuSecuencialBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Secuencial  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuSecuencial= new GridBagLayout();
		

		
		String sToolTipParametroFactuSecuencial="";
		sToolTipParametroFactuSecuencial=ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuSecuencial+="(Facturacion.ParametroFactuSecuencial)";
		}
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuSecuencial+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFactuSecuencial = new JButtonMe();
		this.jButtonModificarParametroFactuSecuencial = new JButtonMe();
        this.jButtonActualizarParametroFactuSecuencial = new JButtonMe();
        this.jButtonEliminarParametroFactuSecuencial = new JButtonMe();
        this.jButtonCancelarParametroFactuSecuencial = new JButtonMe();
        this.jButtonGuardarCambiosParametroFactuSecuencial = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial = new JButtonMe();
		this.jButtonCerrarParametroFactuSecuencial = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuSecuencial = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFactuSecuencial = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFactuSecuencial = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Secuencial ";
		
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Secuencial s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFactuSecuencial.setName("jPanelCamposParametroFactuSecuencial"); 

		this.jPanelCamposOcultosParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFactuSecuencial.setName("jPanelCamposOcultosParametroFactuSecuencial"); 

        this.jPanelAccionesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuSecuencial.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFactuSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFactuSecuencial.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setName("jPanelCamposFingeneralParametroFactuSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Transferencia"));
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setName("jPanelCamposFintransferenciaParametroFactuSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotransferenciaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFactuSecuencial.setText("Nuevo");
		this.jButtonModificarParametroFactuSecuencial.setText("Editar");
        this.jButtonActualizarParametroFactuSecuencial.setText("Actualizar");
        this.jButtonEliminarParametroFactuSecuencial.setText("Eliminar");
        this.jButtonCancelarParametroFactuSecuencial.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFactuSecuencial.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.setText("Guardar");
		this.jButtonCerrarParametroFactuSecuencial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuSecuencial,"nuevo_button","Nuevo",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFactuSecuencial,"modificar_button","Editar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFactuSecuencial,"actualizar_button","Actualizar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFactuSecuencial,"eliminar_button","Eliminar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFactuSecuencial,"cancelar_button","Cancelar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFactuSecuencial,"guardarcambios_button","Guardar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuSecuencial,"guardarcambiostabla_button","Guardar",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuSecuencial,"cerrar_button","Salir",this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFactuSecuencial.setToolTipText("Nuevo"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFactuSecuencial.setToolTipText("Editar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFactuSecuencial.setToolTipText("Actualizar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFactuSecuencial.setToolTipText("Eliminar)"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFactuSecuencial.setToolTipText("Cancelar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFactuSecuencial.setToolTipText("Guardar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.setToolTipText("Guardar"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuSecuencial.setToolTipText("Salir"+" "+ParametroFactuSecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuSecuencial";
		inputMap = this.jButtonNuevoParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuSecuencial"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFactuSecuencial";
		inputMap = this.jButtonActualizarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFactuSecuencial"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFactuSecuencial";
		inputMap = this.jButtonEliminarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFactuSecuencial"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFactuSecuencial";
		inputMap = this.jButtonCancelarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFactuSecuencial"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuSecuencial";
		inputMap = this.jButtonCerrarParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuSecuencial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuSecuencial";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuSecuencial"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFactuSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFactuSecuencial.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFactuSecuencial.setToolTipText("Nuevo ParametroFactuSecuencial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFactuSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFactuSecuencial.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFactuSecuencial.setToolTipText("Sin Cerrar Ventana ParametroFactuSecuencial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFactuSecuencial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFactuSecuencial.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFactuSecuencial.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuSecuencial.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFactuSecuencial = new JLabelMe();
		
		this.jLabelAccionesParametroFactuSecuencial.setText("Acciones");		
		this.jLabelAccionesParametroFactuSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFactuSecuencial();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFactuSecuencial();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFactuSecuencial=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFactuSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFactuSecuencial,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFactuSecuencial = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFactuSecuencial = new GridBagLayout();
		
		this.jPanelCamposParametroFactuSecuencial.setLayout(gridaBagLayoutCamposParametroFactuSecuencial);
		this.jPanelCamposOcultosParametroFactuSecuencial.setLayout(gridaBagLayoutCamposOcultosParametroFactuSecuencial);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFactuSecuencial= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFactuSecuencial.setLayout(gridaBagLayoutCamposIniciogeneralParametroFactuSecuencial);

		GridBagLayout gridaBagLayoutCamposIniciotransferenciaParametroFactuSecuencial= new GridBagLayout();
		this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.setLayout(gridaBagLayoutCamposIniciotransferenciaParametroFactuSecuencial);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFactuSecuencial.add(jLabelIdParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFactuSecuencial.add(jLabelidParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFactuSecuencial.add(jLabelid_empresaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuSecuencial.add(jButtonid_empresaParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuSecuencial.add(jButtonid_empresaParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFactuSecuencial.add(jComboBoxid_empresaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFactuSecuencial.add(jLabelid_sucursalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuSecuencial.add(jButtonid_sucursalParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuSecuencial.add(jButtonid_sucursalParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFactuSecuencial.add(jComboBoxid_sucursalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_generalParametroFactuSecuencial.add(jLabelid_tipo_documento_generalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalParametroFactuSecuencial.add(jButtonid_tipo_documento_generalParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalParametroFactuSecuencial.add(jButtonid_tipo_documento_generalParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_generalParametroFactuSecuencial.add(jComboBoxid_tipo_documento_generalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialParametroFactuSecuencial.add(jLabelsecuencialParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialParametroFactuSecuencial.add(jButtonsecuencialParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialParametroFactuSecuencial.add(jTextFieldsecuencialParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digitosParametroFactuSecuencial.add(jLabelnumero_digitosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digitosParametroFactuSecuencial.add(jButtonnumero_digitosParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digitosParametroFactuSecuencial.add(jTextFieldnumero_digitosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_itemsParametroFactuSecuencial.add(jLabelnumero_itemsParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_itemsParametroFactuSecuencial.add(jButtonnumero_itemsParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_itemsParametroFactuSecuencial.add(jTextFieldnumero_itemsParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_descuentoParametroFactuSecuencial.add(jLabelnumero_descuentoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_descuentoParametroFactuSecuencial.add(jButtonnumero_descuentoParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_descuentoParametroFactuSecuencial.add(jTextFieldnumero_descuentoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_adiicionalesParametroFactuSecuencial.add(jLabelnumero_adiicionalesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_adiicionalesParametroFactuSecuencial.add(jButtonnumero_adiicionalesParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_adiicionalesParametroFactuSecuencial.add(jTextFieldnumero_adiicionalesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digito_inicioParametroFactuSecuencial.add(jLabelnumero_digito_inicioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digito_inicioParametroFactuSecuencial.add(jButtonnumero_digito_inicioParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digito_inicioParametroFactuSecuencial.add(jTextFieldnumero_digito_inicioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digito_finParametroFactuSecuencial.add(jLabelnumero_digito_finParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digito_finParametroFactuSecuencial.add(jButtonnumero_digito_finParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digito_finParametroFactuSecuencial.add(jTextFieldnumero_digito_finParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_dias_plazoParametroFactuSecuencial.add(jLabelnumero_dias_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_dias_plazoParametroFactuSecuencial.add(jButtonnumero_dias_plazoParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_dias_plazoParametroFactuSecuencial.add(jTextFieldnumero_dias_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalleParametroFactuSecuencial.add(jLabelcon_detalleParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalleParametroFactuSecuencial.add(jButtoncon_detalleParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalleParametroFactuSecuencial.add(jCheckBoxcon_detalleParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_lectorParametroFactuSecuencial.add(jLabelcon_lectorParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_lectorParametroFactuSecuencial.add(jButtoncon_lectorParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_lectorParametroFactuSecuencial.add(jCheckBoxcon_lectorParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroFactuSecuencial.add(jLabelid_bodegaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroFactuSecuencial.add(jButtonid_bodegaParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroFactuSecuencial.add(jButtonid_bodegaParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroFactuSecuencial.add(jComboBoxid_bodegaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.add(jLabelid_tipo_param_factu_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.add(jButtonid_tipo_param_factu_plazoParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.add(jButtonid_tipo_param_factu_plazoParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial.add(jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoParametroFactuSecuencial.add(jLabelid_formatoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroFactuSecuencial.add(jButtonid_formatoParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroFactuSecuencial.add(jButtonid_formatoParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoParametroFactuSecuencial.add(jComboBoxid_formatoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_transferenciaParametroFactuSecuencial.add(jLabelcon_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_transferenciaParametroFactuSecuencial.add(jButtoncon_transferenciaParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_transferenciaParametroFactuSecuencial.add(jCheckBoxcon_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_transferenciaParametroFactuSecuencial.add(jLabelid_bodega_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_transferenciaParametroFactuSecuencial.add(jButtonid_bodega_transferenciaParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_transferenciaParametroFactuSecuencial.add(jButtonid_bodega_transferenciaParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_transferenciaParametroFactuSecuencial.add(jComboBoxid_bodega_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.add(jLabelid_transaccion_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 2;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.add(jButtonid_transaccion_transferenciaParametroFactuSecuencialBusqueda, this.gridBagConstraintsParametroFactuSecuencial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 3;
		this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
		this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.add(jButtonid_transaccion_transferenciaParametroFactuSecuencialUpdate, this.gridBagConstraintsParametroFactuSecuencial);
	}

	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = 1;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_transferenciaParametroFactuSecuencial.add(jComboBoxid_transaccion_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposOcultosParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposOcultosParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuSecuencial.add(this.jPanelid_empresaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposOcultosParametroFactuSecuencial % 1==0) {
		iXPanelCamposOcultosParametroFactuSecuencial=0;
		iYPanelCamposOcultosParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposOcultosParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposOcultosParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuSecuencial.add(this.jPanelid_sucursalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposOcultosParametroFactuSecuencial % 1==0) {
		iXPanelCamposOcultosParametroFactuSecuencial=0;
		iYPanelCamposOcultosParametroFactuSecuencial++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelidParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelid_tipo_documento_generalParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelsecuencialParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_digitosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_itemsParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_descuentoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_adiicionalesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_digito_inicioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_digito_finParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelnumero_dias_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelcon_detalleParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelcon_lectorParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelid_bodegaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelid_tipo_param_factu_plazoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciogeneralParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciogeneralParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuSecuencial.add(this.jPanelid_formatoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciogeneralParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuSecuencial=0;
		iYPanelCamposIniciogeneralParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciotransferenciaParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.add(this.jPanelcon_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciotransferenciaParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciotransferenciaParametroFactuSecuencial=0;
		iYPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciotransferenciaParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.add(this.jPanelid_bodega_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciotransferenciaParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciotransferenciaParametroFactuSecuencial=0;
		iYPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	}
	this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuSecuencial.gridy = iYPanelCamposIniciotransferenciaParametroFactuSecuencial;
	this.gridBagConstraintsParametroFactuSecuencial.gridx = iXPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	this.gridBagConstraintsParametroFactuSecuencial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuSecuencial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransferenciaParametroFactuSecuencial.add(this.jPanelid_transaccion_transferenciaParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);



	if(iXPanelCamposIniciotransferenciaParametroFactuSecuencial % 1==0) {
		iXPanelCamposIniciotransferenciaParametroFactuSecuencial=0;
		iYPanelCamposIniciotransferenciaParametroFactuSecuencial++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuSecuencial= new GridBagLayout();
		this.jPanelAccionesParametroFactuSecuencial.setLayout(gridaBagLayoutAccionesParametroFactuSecuencial);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFactuSecuencial= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFactuSecuencial.setLayout(gridaBagLayoutAccionesFormularioParametroFactuSecuencial);
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuSecuencial.add(this.jComboBoxTiposAccionesFormularioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuSecuencial.add(this.jCheckBoxPostAccionNuevoParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofactusecuencialSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuSecuencial.add(this.jCheckBoxPostAccionSinCerrarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofactusecuencialSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuSecuencial.add(this.jCheckBoxPostAccionSinMensajeParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonModificarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);							

		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;
		this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonEliminarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonActualizarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);


		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonGuardarCambiosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);	
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = 0;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFactuSecuencial.add(this.jButtonCancelarParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuSecuencial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuSecuencial);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactusecuencialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;		
			//this.gridBagConstraintsParametroFactuSecuencial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuSecuencial.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuSecuencial.gridx =0;
		this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuSecuencial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFactuSecuencialJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFactuSecuencial = new ParametroFactuSecuencialBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Secuencial  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Secuencial  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Secuencial  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFactuSecuencialModel parametrofactusecuencialModel=new ParametroFactuSecuencialModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFactuSecuencialModel.ParametroFactuSecuencialFocusTraversalPolicy parametrofactusecuencialFocusTraversalPolicy = parametrofactusecuencialModel.new ParametroFactuSecuencialFocusTraversalPolicy(this);
			
			//parametrofactusecuencialFocusTraversalPolicy.setparametrofactusecuencialJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofactusecuencialModel);
			
			
			this.jContentPaneDetalleParametroFactuSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFactuSecuencial = new GridBagLayout();	
			this.jContentPaneDetalleParametroFactuSecuencial.setLayout(gridaBagLayoutDetalleParametroFactuSecuencial);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuSecuencial = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFactuSecuencial.add(jTtoolBarDetalleParametroFactuSecuencial, gridBagConstraintsParametroFactuSecuencial);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFactuSecuencial=   new JScrollPane(jContentPaneDetalleParametroFactuSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFactuSecuencial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;

		this.jContentPaneDetalleParametroFactuSecuencial.add(jPanelCamposIniciogeneralParametroFactuSecuencial, gridBagConstraintsParametroFactuSecuencial);


		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;

		this.jContentPaneDetalleParametroFactuSecuencial.add(jPanelCamposIniciotransferenciaParametroFactuSecuencial, gridBagConstraintsParametroFactuSecuencial);
			
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
						&& parametrofactusecuencialSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofactusecuencialSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFactuSecuencial= new GridBagConstraints();
						this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
						this.jContentPaneDetalleParametroFactuSecuencial.add(this.jTabbedPaneRelacionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFactuSecuencial.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFactuSecuencial.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
					this.gridBagConstraintsParametroFactuSecuencial.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFactuSecuencial.add(jPanelCamposOcultosParametroFactuSecuencial, gridBagConstraintsParametroFactuSecuencial);
				
					this.jPanelCamposOcultosParametroFactuSecuencial.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	        this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFactuSecuencial.add(this.jPanelAccionesFormularioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);							
			
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
	        this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFactuSecuencial.add(this.jPanelAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFactuSecuencial);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFactuSecuencial=   new JScrollPane(this.jPanelCamposParametroFactuSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
			this.gridBagConstraintsParametroFactuSecuencial.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFactuSecuencial.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFactuSecuencial.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);			
			
			this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
			
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		
			
		this.gridBagConstraintsParametroFactuSecuencial = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuSecuencial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuSecuencial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuSecuencial, this.gridBagConstraintsParametroFactuSecuencial);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFactuSecuencial;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFactuSecuencial;
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
