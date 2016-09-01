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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.importaciones.util.ParametroImporConstantesFunciones;

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
public class ParametroImporDetalleFormJInternalFrame extends ParametroImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroImpor;
	
	protected JMenuBar jmenuBarDetalleParametroImpor;
	
	protected JMenu jmenuDetalleParametroImpor;
	protected JMenu jmenuDetalleArchivoParametroImpor;
	protected JMenu jmenuDetalleAccionesParametroImpor;
	protected JMenu jmenuDetalleDatosParametroImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroImpor;	
	protected GridBagConstraints gridBagConstraintsParametroImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TransaccionBeanSwingJInternalFrame transaccionordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionordencompra="";

	protected TransaccionBeanSwingJInternalFrame transaccioningresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioningreso="";

	protected FormatoBeanSwingJInternalFrame formatoordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoordencompra="";

	protected FormatoBeanSwingJInternalFrame formatoingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoingreso="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected FormatoBeanSwingJInternalFrame formatoliquidacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoliquidacion="";
	
	public ParametroImporSessionBean parametroimporSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TransaccionSessionBean transaccionordencompraSessionBean;
	public TransaccionSessionBean transaccioningresoSessionBean;
	public FormatoSessionBean formatoordencompraSessionBean;
	public FormatoSessionBean formatoingresoSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public FormatoSessionBean formatoliquidacionSessionBean;	
	
	public ParametroImporLogic parametroimporLogic;
	
	public JScrollPane jScrollPanelDatosParametroImpor;
	public JScrollPane jScrollPanelDatosEdicionParametroImpor;
	public JScrollPane jScrollPanelDatosGeneralParametroImpor;
	
	protected JPanel jPanelCamposParametroImpor;    
	protected JPanel jPanelCamposOcultosParametroImpor;    	
	protected JPanel jPanelAccionesParametroImpor;
	protected JPanel jPanelAccionesFormularioParametroImpor;
    
	
	
	protected Integer iXPanelCamposParametroImpor=0;
	protected Integer iYPanelCamposParametroImpor=0;
	
	protected Integer iXPanelCamposOcultosParametroImpor=0;
	protected Integer iYPanelCamposOcultosParametroImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroImpor;
	public JButton jButtonModificarParametroImpor;
	public JButton jButtonActualizarParametroImpor;
    public JButton jButtonEliminarParametroImpor;
	public JButton jButtonCancelarParametroImpor;
    public JButton jButtonGuardarCambiosParametroImpor;
	public JButton jButtonGuardarCambiosTablaParametroImpor;
	protected JButton jButtonCerrarParametroImpor;
	
	
	protected JButton jButtonProcesarInformacionParametroImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroImpor;
	protected JButton jButtonModificarToolBarParametroImpor;
	protected JButton jButtonActualizarToolBarParametroImpor;
    protected JButton jButtonEliminarToolBarParametroImpor;
	protected JButton jButtonCancelarToolBarParametroImpor;
    protected JButton jButtonGuardarCambiosToolBarParametroImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroImpor;
	protected JButton jButtonCerrarToolBarParametroImpor;
	
	protected JButton jButtonProcesarInformacionToolBarParametroImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroImpor;
	protected JMenuItem jMenuItemModificarParametroImpor;
	protected JMenuItem jMenuItemActualizarParametroImpor;
    protected JMenuItem jMenuItemEliminarParametroImpor;
	protected JMenuItem jMenuItemCancelarParametroImpor;
    protected JMenuItem jMenuItemGuardarCambiosParametroImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroImpor;
	protected JMenuItem jMenuItemCerrarParametroImpor;
	protected JMenuItem jMenuItemDetalleCerrarParametroImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroImpor;
	protected JMenuItem jMenuItemMostrarOcultarParametroImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroImpor;
	public JLabel jLabelIdParametroImpor;
	public JLabel jLabelidParametroImpor;
	public JButton jButtonidParametroImporBusqueda= new JButtonMe();

	public JPanel jPaneldias_llega_bodegaParametroImpor;
	public JLabel jLabeldias_llega_bodegaParametroImpor;
	public JTextField jTextFielddias_llega_bodegaParametroImpor;
	public JButton jButtondias_llega_bodegaParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_seguroParametroImpor;
	public JLabel jLabelporcentaje_seguroParametroImpor;
	public JTextField jTextFieldporcentaje_seguroParametroImpor;
	public JButton jButtonporcentaje_seguroParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelfodinParametroImpor;
	public JLabel jLabelfodinParametroImpor;
	public JTextField jTextFieldfodinParametroImpor;
	public JButton jButtonfodinParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcorpeiParametroImpor;
	public JLabel jLabelcorpeiParametroImpor;
	public JTextField jTextFieldcorpeiParametroImpor;
	public JButton jButtoncorpeiParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_secuencialParametroImpor;
	public JLabel jLabelcon_secuencialParametroImpor;
	public JCheckBox jCheckBoxcon_secuencialParametroImpor;
	public JButton jButtoncon_secuencialParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialParametroImpor;
	public JLabel jLabelsecuencialParametroImpor;
	public JTextField jTextFieldsecuencialParametroImpor;
	public JButton jButtonsecuencialParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_peso_precioParametroImpor;
	public JLabel jLabelcon_peso_precioParametroImpor;
	public JCheckBox jCheckBoxcon_peso_precioParametroImpor;
	public JButton jButtoncon_peso_precioParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_loteParametroImpor;
	public JLabel jLabelcon_loteParametroImpor;
	public JCheckBox jCheckBoxcon_loteParametroImpor;
	public JButton jButtoncon_loteParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_unidadParametroImpor;
	public JLabel jLabelcon_unidadParametroImpor;
	public JCheckBox jCheckBoxcon_unidadParametroImpor;
	public JButton jButtoncon_unidadParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_conversionParametroImpor;
	public JLabel jLabelcon_conversionParametroImpor;
	public JCheckBox jCheckBoxcon_conversionParametroImpor;
	public JButton jButtoncon_conversionParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroImpor;
	public JLabel jLabelid_empresaParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroImpor;
	public JButton jButtonid_empresaParametroImpor= new JButtonMe();
	public JButton jButtonid_empresaParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_paisParametroImpor;
	public JLabel jLabelid_paisParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisParametroImpor;
	public JButton jButtonid_paisParametroImpor= new JButtonMe();
	public JButton jButtonid_paisParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_paisParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroImpor;
	public JLabel jLabelid_bodegaParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroImpor;
	public JButton jButtonid_bodegaParametroImpor= new JButtonMe();
	public JButton jButtonid_bodegaParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoParametroImpor;
	public JLabel jLabelid_centro_costoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoParametroImpor;
	public JButton jButtonid_centro_costoParametroImpor= new JButtonMe();
	public JButton jButtonid_centro_costoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoParametroImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoParametroImporArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contableParametroImpor;
	public JLabel jLabelid_cuenta_contableParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableParametroImpor;
	public JButton jButtonid_cuenta_contableParametroImpor= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroImporBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroImporArbol= new JButtonMe();

	public JPanel jPanelid_transaccion_orden_compraParametroImpor;
	public JLabel jLabelid_transaccion_orden_compraParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_orden_compraParametroImpor;
	public JButton jButtonid_transaccion_orden_compraParametroImpor= new JButtonMe();
	public JButton jButtonid_transaccion_orden_compraParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_orden_compraParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_ingresoParametroImpor;
	public JLabel jLabelid_transaccion_ingresoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_ingresoParametroImpor;
	public JButton jButtonid_transaccion_ingresoParametroImpor= new JButtonMe();
	public JButton jButtonid_transaccion_ingresoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_ingresoParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_orden_compraParametroImpor;
	public JLabel jLabelid_formato_orden_compraParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_orden_compraParametroImpor;
	public JButton jButtonid_formato_orden_compraParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_orden_compraParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_orden_compraParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_ingresoParametroImpor;
	public JLabel jLabelid_formato_ingresoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_ingresoParametroImpor;
	public JButton jButtonid_formato_ingresoParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_ingresoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_ingresoParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_pedidoParametroImpor;
	public JLabel jLabelid_formato_pedidoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoParametroImpor;
	public JButton jButtonid_formato_pedidoParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroImporBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_liquidacionParametroImpor;
	public JLabel jLabelid_formato_liquidacionParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_liquidacionParametroImpor;
	public JButton jButtonid_formato_liquidacionParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_liquidacionParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_liquidacionParametroImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroImpor;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroImpor=new JPanel();
				this.jPanelAccionesFormularioParametroImpor=new JPanel();
				this.jmenuBarDetalleParametroImpor=new JMenuBar();
				this.jTtoolBarDetalleParametroImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroImpor() {
		return this.jButtonActualizarToolBarParametroImpor;
	}
	
	public JButton getjButtonEliminarToolBarParametroImpor() {
		return this.jButtonEliminarToolBarParametroImpor;
	}
	
	public JButton getjButtonCancelarToolBarParametroImpor() {
		return this.jButtonCancelarToolBarParametroImpor;
	}		
	
	public JButton getjButtonProcesarInformacionParametroImpor() {
		return this.jButtonProcesarInformacionParametroImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroImpor)	{
		this.jButtonProcesarInformacionParametroImpor = jButtonProcesarInformacionParametroImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroImpor() {
		return this.jComboBoxTiposAccionesParametroImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroImpor(
			JComboBox jComboBoxTiposRelacionesParametroImpor) {
		this.jComboBoxTiposRelacionesParametroImpor = jComboBoxTiposRelacionesParametroImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroImpor(
			JComboBox jComboBoxTiposAccionesParametroImpor) {
		this.jComboBoxTiposAccionesParametroImpor = jComboBoxTiposAccionesParametroImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroImpor() {
		return this.jComboBoxTiposAccionesFormularioParametroImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroImpor(
			JComboBox jComboBoxTiposAccionesFormularioParametroImpor) {
		this.jComboBoxTiposAccionesFormularioParametroImpor = jComboBoxTiposAccionesFormularioParametroImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroimporSessionBean=new ParametroImporSessionBean();
		
		this.parametroimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Impor MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroImpor=new JButtonMe();
				this.jButtonModificarToolBarParametroImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroImpor,this.jTtoolBarDetalleParametroImpor,
							"actualizar","actualizar","Actualizar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroImpor,this.jTtoolBarDetalleParametroImpor,
							"eliminar","eliminar","Eliminar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroImpor,this.jTtoolBarDetalleParametroImpor,
							"cancelar","cancelar","Cancelar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroImpor,this.jTtoolBarDetalleParametroImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroImpor.add(this.jMenuItemDetalleCerrarParametroImpor);
		
		this.jmenuDetalleAccionesParametroImpor.add(this.jMenuItemActualizarParametroImpor);
		this.jmenuDetalleAccionesParametroImpor.add(this.jMenuItemEliminarParametroImpor);
		this.jmenuDetalleAccionesParametroImpor.add(this.jMenuItemCancelarParametroImpor);		
		
		//this.jmenuDetalleDatosParametroImpor.add(this.jMenuItemDetalleAbrirOrderByParametroImpor);				
		this.jmenuDetalleDatosParametroImpor.add(this.jMenuItemDetalleMostarOcultarParametroImpor);				
				
		//this.jmenuDetalleAccionesParametroImpor.add(this.jMenuItemGuardarCambiosParametroImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroImpor.add(this.jmenuDetalleArchivoParametroImpor);		
		this.jmenuBarDetalleParametroImpor.add(this.jmenuDetalleAccionesParametroImpor);		
		this.jmenuBarDetalleParametroImpor.add(this.jmenuDetalleDatosParametroImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroImpor);				
	}
	
	
	public void inicializarElementosCamposParametroImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroImpor = new JLabelMe();
		jLabelIdParametroImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroImpor= new GridBagLayout();

		this.jPanelidParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);

		jLabelidParametroImpor = new JLabel();
		jLabelidParametroImpor.setText("Id");

		jLabelidParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldias_llega_bodegaParametroImpor = new JLabelMe();
		this.jLabeldias_llega_bodegaParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_DIASLLEGABODEGA+" : *");
		this.jLabeldias_llega_bodegaParametroImpor.setToolTipText("Dias Llega Bodega");
		this.jLabeldias_llega_bodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_llega_bodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_llega_bodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_llega_bodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_llega_bodegaParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_llega_bodegaParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_DIASLLEGABODEGA);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPaneldias_llega_bodegaParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jTextFielddias_llega_bodegaParametroImpor= new JTextFieldMe();
		jTextFielddias_llega_bodegaParametroImpor.setEnabled(false);
		jTextFielddias_llega_bodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_llega_bodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_llega_bodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_llega_bodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_llega_bodegaParametroImpor.setText("0");

		this.jButtondias_llega_bodegaParametroImporBusqueda= new JButtonMe();
		this.jButtondias_llega_bodegaParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_llega_bodegaParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_llega_bodegaParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_llega_bodegaParametroImporBusqueda.setText("U");
		this.jButtondias_llega_bodegaParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_llega_bodegaParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_llega_bodegaParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_llega_bodegaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_llega_bodegaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_llega_bodegaParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_llega_bodegaParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_seguroParametroImpor = new JLabelMe();
		this.jLabelporcentaje_seguroParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_PORCENTAJESEGURO+" : *");
		this.jLabelporcentaje_seguroParametroImpor.setToolTipText("Porcentaje Seguro");
		this.jLabelporcentaje_seguroParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_seguroParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_seguroParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_seguroParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_seguroParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_seguroParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_PORCENTAJESEGURO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelporcentaje_seguroParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jTextFieldporcentaje_seguroParametroImpor= new JTextFieldMe();
		jTextFieldporcentaje_seguroParametroImpor.setEnabled(false);
		jTextFieldporcentaje_seguroParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_seguroParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_seguroParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_seguroParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_seguroParametroImpor.setText("0.0");

		this.jButtonporcentaje_seguroParametroImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_seguroParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_seguroParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_seguroParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_seguroParametroImporBusqueda.setText("U");
		this.jButtonporcentaje_seguroParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_seguroParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_seguroParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_seguroParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_seguroParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_seguroParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_seguroParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelfodinParametroImpor = new JLabelMe();
		this.jLabelfodinParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_FODIN+" : *");
		this.jLabelfodinParametroImpor.setToolTipText("Fodin");
		this.jLabelfodinParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfodinParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfodinParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfodinParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfodinParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfodinParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_FODIN);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelfodinParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jTextFieldfodinParametroImpor= new JTextFieldMe();
		jTextFieldfodinParametroImpor.setEnabled(false);
		jTextFieldfodinParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfodinParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfodinParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfodinParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfodinParametroImpor.setText("0.0");

		this.jButtonfodinParametroImporBusqueda= new JButtonMe();
		this.jButtonfodinParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfodinParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfodinParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfodinParametroImporBusqueda.setText("U");
		this.jButtonfodinParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfodinParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfodinParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfodinParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfodinParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fodinParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfodinParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcorpeiParametroImpor = new JLabelMe();
		this.jLabelcorpeiParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CORPEI+" : *");
		this.jLabelcorpeiParametroImpor.setToolTipText("Corpei");
		this.jLabelcorpeiParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcorpeiParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcorpeiParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcorpeiParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcorpeiParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcorpeiParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CORPEI);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcorpeiParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jTextFieldcorpeiParametroImpor= new JTextFieldMe();
		jTextFieldcorpeiParametroImpor.setEnabled(false);
		jTextFieldcorpeiParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcorpeiParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcorpeiParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcorpeiParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcorpeiParametroImpor.setText("0.0");

		this.jButtoncorpeiParametroImporBusqueda= new JButtonMe();
		this.jButtoncorpeiParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncorpeiParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncorpeiParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncorpeiParametroImporBusqueda.setText("U");
		this.jButtoncorpeiParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncorpeiParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncorpeiParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcorpeiParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcorpeiParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"corpeiParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncorpeiParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_secuencialParametroImpor = new JLabelMe();
		this.jLabelcon_secuencialParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CONSECUENCIAL+" : *");
		this.jLabelcon_secuencialParametroImpor.setToolTipText("Con Secuencial");
		this.jLabelcon_secuencialParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_secuencialParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_secuencialParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_secuencialParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_secuencialParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_secuencialParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CONSECUENCIAL);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcon_secuencialParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jCheckBoxcon_secuencialParametroImpor= new JCheckBoxMe();
		jCheckBoxcon_secuencialParametroImpor.setEnabled(false);

		jCheckBoxcon_secuencialParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencialParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencialParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_secuencialParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_secuencialParametroImporBusqueda= new JButtonMe();
		this.jButtoncon_secuencialParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencialParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencialParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_secuencialParametroImporBusqueda.setText("U");
		this.jButtoncon_secuencialParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_secuencialParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_secuencialParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_secuencialParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_secuencialParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_secuencialParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_secuencialParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialParametroImpor = new JLabelMe();
		this.jLabelsecuencialParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialParametroImpor.setToolTipText("Secuencial");
		this.jLabelsecuencialParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelsecuencialParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jTextFieldsecuencialParametroImpor= new JTextFieldMe();

		jTextFieldsecuencialParametroImpor.setEnabled(false);
		jTextFieldsecuencialParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialParametroImporBusqueda= new JButtonMe();
		this.jButtonsecuencialParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialParametroImporBusqueda.setText("U");
		this.jButtonsecuencialParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_peso_precioParametroImpor = new JLabelMe();
		this.jLabelcon_peso_precioParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CONPESOPRECIO+" : *");
		this.jLabelcon_peso_precioParametroImpor.setToolTipText("Con Peso Precio");
		this.jLabelcon_peso_precioParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_peso_precioParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_peso_precioParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_peso_precioParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_peso_precioParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_peso_precioParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CONPESOPRECIO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcon_peso_precioParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jCheckBoxcon_peso_precioParametroImpor= new JCheckBoxMe();
		jCheckBoxcon_peso_precioParametroImpor.setEnabled(false);

		jCheckBoxcon_peso_precioParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_peso_precioParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_peso_precioParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_peso_precioParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_peso_precioParametroImporBusqueda= new JButtonMe();
		this.jButtoncon_peso_precioParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_peso_precioParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_peso_precioParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_peso_precioParametroImporBusqueda.setText("U");
		this.jButtoncon_peso_precioParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_peso_precioParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_peso_precioParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_peso_precioParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_peso_precioParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_peso_precioParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_peso_precioParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_loteParametroImpor = new JLabelMe();
		this.jLabelcon_loteParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CONLOTE+" : *");
		this.jLabelcon_loteParametroImpor.setToolTipText("Con Lote");
		this.jLabelcon_loteParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_loteParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_loteParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_loteParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_loteParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_loteParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CONLOTE);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcon_loteParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jCheckBoxcon_loteParametroImpor= new JCheckBoxMe();
		jCheckBoxcon_loteParametroImpor.setEnabled(false);

		jCheckBoxcon_loteParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_loteParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_loteParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_loteParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_loteParametroImporBusqueda= new JButtonMe();
		this.jButtoncon_loteParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_loteParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_loteParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_loteParametroImporBusqueda.setText("U");
		this.jButtoncon_loteParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_loteParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_loteParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_loteParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_loteParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_loteParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_loteParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_unidadParametroImpor = new JLabelMe();
		this.jLabelcon_unidadParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CONUNIDAD+" : *");
		this.jLabelcon_unidadParametroImpor.setToolTipText("Con Unad");
		this.jLabelcon_unidadParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_unidadParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_unidadParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_unidadParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_unidadParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_unidadParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CONUNIDAD);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcon_unidadParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jCheckBoxcon_unidadParametroImpor= new JCheckBoxMe();
		jCheckBoxcon_unidadParametroImpor.setEnabled(false);

		jCheckBoxcon_unidadParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_unidadParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_unidadParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_unidadParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_unidadParametroImporBusqueda= new JButtonMe();
		this.jButtoncon_unidadParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_unidadParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_unidadParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_unidadParametroImporBusqueda.setText("U");
		this.jButtoncon_unidadParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_unidadParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_unidadParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_unidadParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_unidadParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_unidadParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_unidadParametroImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_conversionParametroImpor = new JLabelMe();
		this.jLabelcon_conversionParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_CONCONVERSION+" : *");
		this.jLabelcon_conversionParametroImpor.setToolTipText("Con Conversion");
		this.jLabelcon_conversionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_conversionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_conversionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_conversionParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_conversionParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_conversionParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_CONCONVERSION);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelcon_conversionParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jCheckBoxcon_conversionParametroImpor= new JCheckBoxMe();
		jCheckBoxcon_conversionParametroImpor.setEnabled(false);

		jCheckBoxcon_conversionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_conversionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_conversionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_conversionParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_conversionParametroImporBusqueda= new JButtonMe();
		this.jButtoncon_conversionParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_conversionParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_conversionParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_conversionParametroImporBusqueda.setText("U");
		this.jButtoncon_conversionParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_conversionParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_conversionParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_conversionParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_conversionParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_conversionParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_conversionParametroImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroImpor = new JLabelMe();
		this.jLabelid_empresaParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroImpor.setToolTipText("Empresa");
		this.jLabelid_empresaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_empresaParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_empresaParametroImpor= new JComboBoxMe();
		jComboBoxid_empresaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroImpor.setEnabled(false);

		this.jButtonid_empresaParametroImpor= new JButtonMe();
		this.jButtonid_empresaParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroImpor.setText("Buscar");
		this.jButtonid_empresaParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroImpor"));

		this.jButtonid_empresaParametroImporBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroImporBusqueda.setText("U");
		this.jButtonid_empresaParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroImporUpdate= new JButtonMe();
		this.jButtonid_empresaParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroImporUpdate.setText("U");
		this.jButtonid_empresaParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroImporUpdate"));



					
		this.jLabelid_paisParametroImpor = new JLabelMe();
		this.jLabelid_paisParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisParametroImpor.setToolTipText("Pais");
		this.jLabelid_paisParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_paisParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_paisParametroImpor= new JComboBoxMe();
		jComboBoxid_paisParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisParametroImpor= new JButtonMe();
		this.jButtonid_paisParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroImpor.setText("Buscar");
		this.jButtonid_paisParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroImpor"));

		this.jButtonid_paisParametroImporBusqueda= new JButtonMe();
		this.jButtonid_paisParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroImporBusqueda.setText("U");
		this.jButtonid_paisParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_paisParametroImporUpdate= new JButtonMe();
		this.jButtonid_paisParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroImporUpdate.setText("U");
		this.jButtonid_paisParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroImporUpdate"));



					
		this.jLabelid_bodegaParametroImpor = new JLabelMe();
		this.jLabelid_bodegaParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroImpor.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_bodegaParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_bodegaParametroImpor= new JComboBoxMe();
		jComboBoxid_bodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroImpor= new JButtonMe();
		this.jButtonid_bodegaParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroImpor.setText("Buscar");
		this.jButtonid_bodegaParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroImpor"));

		this.jButtonid_bodegaParametroImporBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroImporBusqueda.setText("U");
		this.jButtonid_bodegaParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroImporUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroImporUpdate.setText("U");
		this.jButtonid_bodegaParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroImporUpdate"));



					
		this.jLabelid_centro_costoParametroImpor = new JLabelMe();
		this.jLabelid_centro_costoParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoParametroImpor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_centro_costoParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_centro_costoParametroImpor= new JComboBoxMe();
		jComboBoxid_centro_costoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoParametroImpor= new JButtonMe();
		this.jButtonid_centro_costoParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoParametroImpor.setText("Buscar");
		this.jButtonid_centro_costoParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoParametroImpor"));

		this.jButtonid_centro_costoParametroImporBusqueda= new JButtonMe();
		this.jButtonid_centro_costoParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoParametroImporBusqueda.setText("U");
		this.jButtonid_centro_costoParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoParametroImporUpdate= new JButtonMe();
		this.jButtonid_centro_costoParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoParametroImporUpdate.setText("U");
		this.jButtonid_centro_costoParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoParametroImporUpdate"));


		jButtonid_centro_costoParametroImporArbol= new JButtonMe();
		jButtonid_centro_costoParametroImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoParametroImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoParametroImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoParametroImporArbol.setText("Arbol");
		jButtonid_centro_costoParametroImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoParametroImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoParametroImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoParametroImporArbol"));



					
		this.jLabelid_cuenta_contableParametroImpor = new JLabelMe();
		this.jLabelid_cuenta_contableParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableParametroImpor.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_cuenta_contableParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_cuenta_contableParametroImpor= new JComboBoxMe();
		jComboBoxid_cuenta_contableParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableParametroImpor= new JButtonMe();
		this.jButtonid_cuenta_contableParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroImpor.setText("Buscar");
		this.jButtonid_cuenta_contableParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroImpor"));

		this.jButtonid_cuenta_contableParametroImporBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroImporBusqueda.setText("U");
		this.jButtonid_cuenta_contableParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableParametroImporUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroImporUpdate.setText("U");
		this.jButtonid_cuenta_contableParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroImporUpdate"));


		jButtonid_cuenta_contableParametroImporArbol= new JButtonMe();
		jButtonid_cuenta_contableParametroImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroImporArbol.setText("Arbol");
		jButtonid_cuenta_contableParametroImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableParametroImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroImporArbol"));



					
		this.jLabelid_transaccion_orden_compraParametroImpor = new JLabelMe();
		this.jLabelid_transaccion_orden_compraParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONORDENCOMPRA+" : *");
		this.jLabelid_transaccion_orden_compraParametroImpor.setToolTipText("Transaccion Orden Compra");
		this.jLabelid_transaccion_orden_compraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_orden_compraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_orden_compraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_orden_compraParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_orden_compraParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_orden_compraParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONORDENCOMPRA);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_transaccion_orden_compraParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_transaccion_orden_compraParametroImpor= new JComboBoxMe();
		jComboBoxid_transaccion_orden_compraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_orden_compraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_orden_compraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_orden_compraParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_orden_compraParametroImpor= new JButtonMe();
		this.jButtonid_transaccion_orden_compraParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_orden_compraParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_orden_compraParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_orden_compraParametroImpor.setText("Buscar");
		this.jButtonid_transaccion_orden_compraParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_orden_compraParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_orden_compraParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_orden_compraParametroImpor"));

		this.jButtonid_transaccion_orden_compraParametroImporBusqueda= new JButtonMe();
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setText("U");
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_orden_compraParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_orden_compraParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_orden_compraParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_orden_compraParametroImporUpdate= new JButtonMe();
		this.jButtonid_transaccion_orden_compraParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_orden_compraParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_orden_compraParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_orden_compraParametroImporUpdate.setText("U");
		this.jButtonid_transaccion_orden_compraParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_orden_compraParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_orden_compraParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_orden_compraParametroImporUpdate"));



					
		this.jLabelid_transaccion_ingresoParametroImpor = new JLabelMe();
		this.jLabelid_transaccion_ingresoParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONINGRESO+" : *");
		this.jLabelid_transaccion_ingresoParametroImpor.setToolTipText("Transaccion Ingreso");
		this.jLabelid_transaccion_ingresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_ingresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_ingresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_ingresoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_ingresoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_ingresoParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONINGRESO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_transaccion_ingresoParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_transaccion_ingresoParametroImpor= new JComboBoxMe();
		jComboBoxid_transaccion_ingresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_ingresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_ingresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_ingresoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_ingresoParametroImpor= new JButtonMe();
		this.jButtonid_transaccion_ingresoParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_ingresoParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_ingresoParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_ingresoParametroImpor.setText("Buscar");
		this.jButtonid_transaccion_ingresoParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_ingresoParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_ingresoParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_ingresoParametroImpor"));

		this.jButtonid_transaccion_ingresoParametroImporBusqueda= new JButtonMe();
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_ingresoParametroImporBusqueda.setText("U");
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_ingresoParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_ingresoParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_ingresoParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_ingresoParametroImporUpdate= new JButtonMe();
		this.jButtonid_transaccion_ingresoParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_ingresoParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_ingresoParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_ingresoParametroImporUpdate.setText("U");
		this.jButtonid_transaccion_ingresoParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_ingresoParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_ingresoParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_ingresoParametroImporUpdate"));



					
		this.jLabelid_formato_orden_compraParametroImpor = new JLabelMe();
		this.jLabelid_formato_orden_compraParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDFORMATOORDENCOMPRA+" : *");
		this.jLabelid_formato_orden_compraParametroImpor.setToolTipText("Formato Orden Compra");
		this.jLabelid_formato_orden_compraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_orden_compraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_orden_compraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_orden_compraParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_orden_compraParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_orden_compraParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDFORMATOORDENCOMPRA);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_formato_orden_compraParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_formato_orden_compraParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_orden_compraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_orden_compraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_orden_compraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_orden_compraParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_orden_compraParametroImpor= new JButtonMe();
		this.jButtonid_formato_orden_compraParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_orden_compraParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_orden_compraParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_orden_compraParametroImpor.setText("Buscar");
		this.jButtonid_formato_orden_compraParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_orden_compraParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_orden_compraParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_orden_compraParametroImpor"));

		this.jButtonid_formato_orden_compraParametroImporBusqueda= new JButtonMe();
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_orden_compraParametroImporBusqueda.setText("U");
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_orden_compraParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_orden_compraParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_orden_compraParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_formato_orden_compraParametroImporUpdate= new JButtonMe();
		this.jButtonid_formato_orden_compraParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_orden_compraParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_orden_compraParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_orden_compraParametroImporUpdate.setText("U");
		this.jButtonid_formato_orden_compraParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_orden_compraParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_orden_compraParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_orden_compraParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_orden_compraParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_orden_compraParametroImporUpdate"));



					
		this.jLabelid_formato_ingresoParametroImpor = new JLabelMe();
		this.jLabelid_formato_ingresoParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDFORMATOINGRESO+" : *");
		this.jLabelid_formato_ingresoParametroImpor.setToolTipText("Formato Ingreso");
		this.jLabelid_formato_ingresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_ingresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_ingresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_ingresoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_ingresoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_ingresoParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDFORMATOINGRESO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_formato_ingresoParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_formato_ingresoParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_ingresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_ingresoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_ingresoParametroImpor= new JButtonMe();
		this.jButtonid_formato_ingresoParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoParametroImpor.setText("Buscar");
		this.jButtonid_formato_ingresoParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_ingresoParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoParametroImpor"));

		this.jButtonid_formato_ingresoParametroImporBusqueda= new JButtonMe();
		this.jButtonid_formato_ingresoParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_ingresoParametroImporBusqueda.setText("U");
		this.jButtonid_formato_ingresoParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_ingresoParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_ingresoParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_formato_ingresoParametroImporUpdate= new JButtonMe();
		this.jButtonid_formato_ingresoParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_ingresoParametroImporUpdate.setText("U");
		this.jButtonid_formato_ingresoParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_ingresoParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_ingresoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoParametroImporUpdate"));



					
		this.jLabelid_formato_pedidoParametroImpor = new JLabelMe();
		this.jLabelid_formato_pedidoParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDFORMATOPEDIDO+" : *");
		this.jLabelid_formato_pedidoParametroImpor.setToolTipText("Formato Pedo");
		this.jLabelid_formato_pedidoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_pedidoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_pedidoParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDFORMATOPEDIDO);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_formato_pedidoParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_formato_pedidoParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_pedidoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_pedidoParametroImpor= new JButtonMe();
		this.jButtonid_formato_pedidoParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroImpor.setText("Buscar");
		this.jButtonid_formato_pedidoParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_pedidoParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_pedidoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroImpor"));

		this.jButtonid_formato_pedidoParametroImporBusqueda= new JButtonMe();
		this.jButtonid_formato_pedidoParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroImporBusqueda.setText("U");
		this.jButtonid_formato_pedidoParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_pedidoParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_pedidoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_pedidoParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_formato_pedidoParametroImporUpdate= new JButtonMe();
		this.jButtonid_formato_pedidoParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroImporUpdate.setText("U");
		this.jButtonid_formato_pedidoParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_pedidoParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_pedidoParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroImporUpdate"));



					
		this.jLabelid_formato_liquidacionParametroImpor = new JLabelMe();
		this.jLabelid_formato_liquidacionParametroImpor.setText(""+ParametroImporConstantesFunciones.LABEL_IDFORMATOLIQUIDACION+" : *");
		this.jLabelid_formato_liquidacionParametroImpor.setToolTipText("Formato Liquacion");
		this.jLabelid_formato_liquidacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_liquidacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_liquidacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_liquidacionParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_liquidacionParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_liquidacionParametroImpor.setToolTipText(ParametroImporConstantesFunciones.LABEL_IDFORMATOLIQUIDACION);
		this.gridaBagLayoutParametroImpor = new GridBagLayout();
		this.jPanelid_formato_liquidacionParametroImpor.setLayout(this.gridaBagLayoutParametroImpor);


		jComboBoxid_formato_liquidacionParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_liquidacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_liquidacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_liquidacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_liquidacionParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_liquidacionParametroImpor= new JButtonMe();
		this.jButtonid_formato_liquidacionParametroImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_liquidacionParametroImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_liquidacionParametroImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_liquidacionParametroImpor.setText("Buscar");
		this.jButtonid_formato_liquidacionParametroImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_liquidacionParametroImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_liquidacionParametroImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_liquidacionParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_liquidacionParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_liquidacionParametroImpor"));

		this.jButtonid_formato_liquidacionParametroImporBusqueda= new JButtonMe();
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_liquidacionParametroImporBusqueda.setText("U");
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_liquidacionParametroImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_liquidacionParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_liquidacionParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_liquidacionParametroImporBusqueda"));

		if(this.parametroimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_liquidacionParametroImporBusqueda.setVisible(false);		}

		this.jButtonid_formato_liquidacionParametroImporUpdate= new JButtonMe();
		this.jButtonid_formato_liquidacionParametroImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_liquidacionParametroImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_liquidacionParametroImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_liquidacionParametroImporUpdate.setText("U");
		this.jButtonid_formato_liquidacionParametroImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_liquidacionParametroImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_liquidacionParametroImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_liquidacionParametroImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_liquidacionParametroImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_liquidacionParametroImporUpdate"));



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
		//this.jInternalFrameDetalleParametroImpor = new ParametroImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroImpor= new GridBagLayout();
		

		
		String sToolTipParametroImpor="";
		sToolTipParametroImpor=ParametroImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroImpor+="(Importaciones.ParametroImpor)";
		}
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroImpor = new JButtonMe();
		this.jButtonModificarParametroImpor = new JButtonMe();
        this.jButtonActualizarParametroImpor = new JButtonMe();
        this.jButtonEliminarParametroImpor = new JButtonMe();
        this.jButtonCancelarParametroImpor = new JButtonMe();
        this.jButtonGuardarCambiosParametroImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroImpor = new JButtonMe();
		this.jButtonCerrarParametroImpor = new JButtonMe();
		
		this.jScrollPanelDatosParametroImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroImpor = new JScrollPane();
				
		
		
		this.jPanelCamposParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Impor";
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroImpor.setName("jPanelCamposParametroImpor"); 

		this.jPanelCamposOcultosParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroImpor.setName("jPanelCamposOcultosParametroImpor"); 

        this.jPanelAccionesParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroImpor.setToolTipText("Acciones");
        this.jPanelAccionesParametroImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroImpor.setText("Nuevo");
		this.jButtonModificarParametroImpor.setText("Editar");
        this.jButtonActualizarParametroImpor.setText("Actualizar");
        this.jButtonEliminarParametroImpor.setText("Eliminar");
        this.jButtonCancelarParametroImpor.setText("Cancelar");
        this.jButtonGuardarCambiosParametroImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroImpor.setText("Guardar");
		this.jButtonCerrarParametroImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroImpor,"nuevo_button","Nuevo",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroImpor,"modificar_button","Editar",this.parametroimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroImpor,"actualizar_button","Actualizar",this.parametroimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroImpor,"eliminar_button","Eliminar",this.parametroimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroImpor,"cancelar_button","Cancelar",this.parametroimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroImpor,"guardarcambios_button","Guardar",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroImpor,"guardarcambiostabla_button","Guardar",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroImpor,"cerrar_button","Salir",this.parametroimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroImpor.setToolTipText("Nuevo"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroImpor.setToolTipText("Editar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroImpor.setToolTipText("Actualizar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroImpor.setToolTipText("Eliminar)"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroImpor.setToolTipText("Cancelar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroImpor.setToolTipText("Guardar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroImpor.setToolTipText("Guardar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroImpor.setToolTipText("Salir"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroImpor";
		inputMap = this.jButtonNuevoParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroImpor";
		inputMap = this.jButtonActualizarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroImpor";
		inputMap = this.jButtonEliminarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroImpor";
		inputMap = this.jButtonCancelarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroImpor"));
		
		//CERRAR		
		sMapKey = "CerrarParametroImpor";
		inputMap = this.jButtonCerrarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroImpor";
		inputMap = this.jButtonGuardarCambiosTablaParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroImpor.setToolTipText("Nuevo ParametroImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroImpor.setToolTipText("Sin Cerrar Ventana ParametroImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroImpor.setText("Accion");
		this.jComboBoxTiposAccionesParametroImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroImpor = new JLabelMe();
		
		this.jLabelAccionesParametroImpor.setText("Acciones");		
		this.jLabelAccionesParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroImpor = new GridBagLayout();
		
		this.jPanelCamposParametroImpor.setLayout(gridaBagLayoutCamposParametroImpor);
		this.jPanelCamposOcultosParametroImpor.setLayout(gridaBagLayoutCamposOcultosParametroImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroImpor.add(jLabelIdParametroImpor, this.gridBagConstraintsParametroImpor);



	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroImpor.add(jLabelidParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroImpor.add(jLabelid_empresaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroImpor.add(jButtonid_empresaParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroImpor.add(jButtonid_empresaParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroImpor.add(jComboBoxid_empresaParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisParametroImpor.add(jLabelid_paisParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroImpor.add(jButtonid_paisParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroImpor.add(jButtonid_paisParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisParametroImpor.add(jComboBoxid_paisParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroImpor.add(jLabelid_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroImpor.add(jButtonid_bodegaParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroImpor.add(jButtonid_bodegaParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroImpor.add(jComboBoxid_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoParametroImpor.add(jLabelid_centro_costoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoParametroImpor.add(jButtonid_centro_costoParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoParametroImpor.add(jButtonid_centro_costoParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoParametroImpor.add(jComboBoxid_centro_costoParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableParametroImpor.add(jLabelid_cuenta_contableParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroImpor.add(jButtonid_cuenta_contableParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroImpor.add(jButtonid_cuenta_contableParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableParametroImpor.add(jComboBoxid_cuenta_contableParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_orden_compraParametroImpor.add(jLabelid_transaccion_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_orden_compraParametroImpor.add(jButtonid_transaccion_orden_compraParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_orden_compraParametroImpor.add(jButtonid_transaccion_orden_compraParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_orden_compraParametroImpor.add(jComboBoxid_transaccion_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_ingresoParametroImpor.add(jLabelid_transaccion_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_ingresoParametroImpor.add(jButtonid_transaccion_ingresoParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_ingresoParametroImpor.add(jButtonid_transaccion_ingresoParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_ingresoParametroImpor.add(jComboBoxid_transaccion_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_orden_compraParametroImpor.add(jLabelid_formato_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_orden_compraParametroImpor.add(jButtonid_formato_orden_compraParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_orden_compraParametroImpor.add(jButtonid_formato_orden_compraParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_orden_compraParametroImpor.add(jComboBoxid_formato_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_ingresoParametroImpor.add(jLabelid_formato_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_ingresoParametroImpor.add(jButtonid_formato_ingresoParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_ingresoParametroImpor.add(jButtonid_formato_ingresoParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_ingresoParametroImpor.add(jComboBoxid_formato_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_pedidoParametroImpor.add(jLabelid_formato_pedidoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroImpor.add(jButtonid_formato_pedidoParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroImpor.add(jButtonid_formato_pedidoParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_pedidoParametroImpor.add(jComboBoxid_formato_pedidoParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_liquidacionParametroImpor.add(jLabelid_formato_liquidacionParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_liquidacionParametroImpor.add(jButtonid_formato_liquidacionParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 3;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_liquidacionParametroImpor.add(jButtonid_formato_liquidacionParametroImporUpdate, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_liquidacionParametroImpor.add(jComboBoxid_formato_liquidacionParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_llega_bodegaParametroImpor.add(jLabeldias_llega_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_llega_bodegaParametroImpor.add(jButtondias_llega_bodegaParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_llega_bodegaParametroImpor.add(jTextFielddias_llega_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_seguroParametroImpor.add(jLabelporcentaje_seguroParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_seguroParametroImpor.add(jButtonporcentaje_seguroParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_seguroParametroImpor.add(jTextFieldporcentaje_seguroParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfodinParametroImpor.add(jLabelfodinParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfodinParametroImpor.add(jButtonfodinParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfodinParametroImpor.add(jTextFieldfodinParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcorpeiParametroImpor.add(jLabelcorpeiParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcorpeiParametroImpor.add(jButtoncorpeiParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcorpeiParametroImpor.add(jTextFieldcorpeiParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_secuencialParametroImpor.add(jLabelcon_secuencialParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_secuencialParametroImpor.add(jButtoncon_secuencialParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_secuencialParametroImpor.add(jCheckBoxcon_secuencialParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialParametroImpor.add(jLabelsecuencialParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialParametroImpor.add(jButtonsecuencialParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialParametroImpor.add(jTextFieldsecuencialParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_peso_precioParametroImpor.add(jLabelcon_peso_precioParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_peso_precioParametroImpor.add(jButtoncon_peso_precioParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_peso_precioParametroImpor.add(jCheckBoxcon_peso_precioParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_loteParametroImpor.add(jLabelcon_loteParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_loteParametroImpor.add(jButtoncon_loteParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_loteParametroImpor.add(jCheckBoxcon_loteParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_unidadParametroImpor.add(jLabelcon_unidadParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_unidadParametroImpor.add(jButtoncon_unidadParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_unidadParametroImpor.add(jCheckBoxcon_unidadParametroImpor, this.gridBagConstraintsParametroImpor);


	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 0;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_conversionParametroImpor.add(jLabelcon_conversionParametroImpor, this.gridBagConstraintsParametroImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 2;
		this.gridBagConstraintsParametroImpor.ipadx = 0;
		this.gridBagConstraintsParametroImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_conversionParametroImpor.add(jButtoncon_conversionParametroImporBusqueda, this.gridBagConstraintsParametroImpor);
	}

	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroImpor.gridy = 0;
	this.gridBagConstraintsParametroImpor.gridx = 1;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_conversionParametroImpor.add(jCheckBoxcon_conversionParametroImpor, this.gridBagConstraintsParametroImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelidParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_paisParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_centro_costoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_cuenta_contableParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_transaccion_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_transaccion_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_formato_orden_compraParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_formato_ingresoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_formato_pedidoParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelid_formato_liquidacionParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPaneldias_llega_bodegaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelporcentaje_seguroParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelfodinParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcorpeiParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcon_secuencialParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelsecuencialParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcon_peso_precioParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcon_loteParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcon_unidadParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroImpor.add(this.jPanelcon_conversionParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposParametroImpor % 2==0) {
		iXPanelCamposParametroImpor=0;
		iYPanelCamposParametroImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroImpor.gridy = iYPanelCamposOcultosParametroImpor;
	this.gridBagConstraintsParametroImpor.gridx = iXPanelCamposOcultosParametroImpor++;
	this.gridBagConstraintsParametroImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroImpor.add(this.jPanelid_empresaParametroImpor, this.gridBagConstraintsParametroImpor);



	if(iXPanelCamposOcultosParametroImpor % 2==0) {
		iXPanelCamposOcultosParametroImpor=0;
		iYPanelCamposOcultosParametroImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroImpor= new GridBagLayout();
		this.jPanelAccionesParametroImpor.setLayout(gridaBagLayoutAccionesParametroImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroImpor= new GridBagLayout();
		this.jPanelAccionesFormularioParametroImpor.setLayout(gridaBagLayoutAccionesFormularioParametroImpor);
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroImpor.add(this.jComboBoxTiposAccionesFormularioParametroImpor, this.gridBagConstraintsParametroImpor);

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroImpor.add(this.jCheckBoxPostAccionNuevoParametroImpor, this.gridBagConstraintsParametroImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroImpor.add(this.jCheckBoxPostAccionSinCerrarParametroImpor, this.gridBagConstraintsParametroImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroImpor.add(this.jCheckBoxPostAccionSinMensajeParametroImpor, this.gridBagConstraintsParametroImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroImpor.add(this.jButtonModificarParametroImpor, this.gridBagConstraintsParametroImpor);							

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroImpor.add(this.jButtonEliminarParametroImpor, this.gridBagConstraintsParametroImpor);
		
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = 0;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroImpor.add(this.jButtonActualizarParametroImpor, this.gridBagConstraintsParametroImpor);


		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = 0;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroImpor.add(this.jButtonGuardarCambiosParametroImpor, this.gridBagConstraintsParametroImpor);	
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = 0;		
		this.gridBagConstraintsParametroImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroImpor.add(this.jButtonCancelarParametroImpor, this.gridBagConstraintsParametroImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();						
			this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroImpor.gridx = 0;		
			//this.gridBagConstraintsParametroImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroImpor.gridx =0;
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroImpor, this.gridBagConstraintsParametroImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroImpor = new ParametroImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroImporModel parametroimporModel=new ParametroImporModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroImporModel.ParametroImporFocusTraversalPolicy parametroimporFocusTraversalPolicy = parametroimporModel.new ParametroImporFocusTraversalPolicy(this);
			
			//parametroimporFocusTraversalPolicy.setparametroimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroimporModel);
			
			
			this.jContentPaneDetalleParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroImpor = new GridBagLayout();	
			this.jContentPaneDetalleParametroImpor.setLayout(gridaBagLayoutDetalleParametroImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroImpor = new GridBagConstraints();
				this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroImpor.gridx = 0;
					
				
				this.jContentPaneDetalleParametroImpor.add(jTtoolBarDetalleParametroImpor, gridBagConstraintsParametroImpor);								
				
}
			
			this.jScrollPanelDatosEdicionParametroImpor=   new JScrollPane(jContentPaneDetalleParametroImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroImpor.gridx = 0;
	        
			this.jContentPaneDetalleParametroImpor.add(jPanelCamposParametroImpor, gridBagConstraintsParametroImpor);
			
			
			
			
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
						&& parametroimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroImpor= new GridBagConstraints();
						this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroImpor.gridx = 0;
						this.jContentPaneDetalleParametroImpor.add(this.jTabbedPaneRelacionesParametroImpor, this.gridBagConstraintsParametroImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroImpor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroImpor = new GridBagConstraints();
					this.gridBagConstraintsParametroImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroImpor.gridx = 0;
					
				
					this.jContentPaneDetalleParametroImpor.add(jPanelCamposOcultosParametroImpor, gridBagConstraintsParametroImpor);
				
					this.jPanelCamposOcultosParametroImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroImpor.gridx = 0;
	        this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroImpor.add(this.jPanelAccionesFormularioParametroImpor, this.gridBagConstraintsParametroImpor);							
			
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
	        this.gridBagConstraintsParametroImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroImpor.add(this.jPanelAccionesParametroImpor, this.gridBagConstraintsParametroImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroImpor=   new JScrollPane(this.jPanelCamposParametroImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroImpor.gridx = 0;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroImpor, this.gridBagConstraintsParametroImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroImpor, this.gridBagConstraintsParametroImpor);			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroImpor, this.gridBagConstraintsParametroImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroImpor, this.gridBagConstraintsParametroImpor);
			
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroImpor, this.gridBagConstraintsParametroImpor);
		
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroImpor, this.gridBagConstraintsParametroImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroImpor;
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
