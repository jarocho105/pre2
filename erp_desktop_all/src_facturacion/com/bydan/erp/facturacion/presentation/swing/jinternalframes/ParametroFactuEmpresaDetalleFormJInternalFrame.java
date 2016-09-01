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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuEmpresaConstantesFunciones;

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
public class ParametroFactuEmpresaDetalleFormJInternalFrame extends ParametroFactuEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFactuEmpresa;
	
	protected JMenuBar jmenuBarDetalleParametroFactuEmpresa;
	
	protected JMenu jmenuDetalleParametroFactuEmpresa;
	protected JMenu jmenuDetalleArchivoParametroFactuEmpresa;
	protected JMenu jmenuDetalleAccionesParametroFactuEmpresa;
	protected JMenu jmenuDetalleDatosParametroFactuEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuEmpresa;	
	protected GridBagConstraints gridBagConstraintsParametroFactuEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFactuEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFactuEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpresaBeanSwingJInternalFrame empresaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresaorigen="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccionorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionorigen="";

	protected BodegaBeanSwingJInternalFrame bodegaorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaorigen="";

	protected ClienteBeanSwingJInternalFrame clienteorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteorigen="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected SucursalBeanSwingJInternalFrame sucursaldestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursaldestino="";

	protected TransaccionBeanSwingJInternalFrame transacciondestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciondestino="";

	protected BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegadestino="";

	protected ClienteBeanSwingJInternalFrame clientedestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clientedestino="";

	protected EmpresaBeanSwingJInternalFrame empresamultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresamultidestino="";

	protected SucursalBeanSwingJInternalFrame sucursalmultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmultidestino="";

	protected TransaccionBeanSwingJInternalFrame transaccionmultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionmultidestino="";

	protected BodegaBeanSwingJInternalFrame bodegamultiorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamultiorigen="";

	protected BodegaBeanSwingJInternalFrame bodegamultidestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamultidestino="";
	
	public ParametroFactuEmpresaSessionBean parametrofactuempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpresaSessionBean empresaorigenSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccionorigenSessionBean;
	public BodegaSessionBean bodegaorigenSessionBean;
	public ClienteSessionBean clienteorigenSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public SucursalSessionBean sucursaldestinoSessionBean;
	public TransaccionSessionBean transacciondestinoSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public ClienteSessionBean clientedestinoSessionBean;
	public EmpresaSessionBean empresamultidestinoSessionBean;
	public SucursalSessionBean sucursalmultidestinoSessionBean;
	public TransaccionSessionBean transaccionmultidestinoSessionBean;
	public BodegaSessionBean bodegamultiorigenSessionBean;
	public BodegaSessionBean bodegamultidestinoSessionBean;	
	
	public ParametroFactuEmpresaLogic parametrofactuempresaLogic;
	
	public JScrollPane jScrollPanelDatosParametroFactuEmpresa;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuEmpresa;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuEmpresa;
	
	protected JPanel jPanelCamposParametroFactuEmpresa;    
	protected JPanel jPanelCamposOcultosParametroFactuEmpresa;    	
	protected JPanel jPanelAccionesParametroFactuEmpresa;
	protected JPanel jPanelAccionesFormularioParametroFactuEmpresa;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroFactuEmpresa;	
	protected Integer iXPanelCamposParametroFactuEmpresa=0;
	protected Integer iYPanelCamposParametroFactuEmpresa=0;
	
	protected Integer iXPanelCamposOcultosParametroFactuEmpresa=0;
	protected Integer iYPanelCamposOcultosParametroFactuEmpresa=0;
	
	

	protected JPanel jPanelCamposInicioorigenParametroFactuEmpresa;
	protected Integer iXPanelCamposInicioorigenParametroFactuEmpresa=0;
	protected Integer iYPanelCamposInicioorigenParametroFactuEmpresa=0;

	protected JPanel jPanelCamposIniciodestinoParametroFactuEmpresa;
	protected Integer iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
	protected Integer iYPanelCamposIniciodestinoParametroFactuEmpresa=0;

	protected JPanel jPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	protected Integer iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
	protected Integer iYPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFactuEmpresa;
	public JButton jButtonModificarParametroFactuEmpresa;
	public JButton jButtonActualizarParametroFactuEmpresa;
    public JButton jButtonEliminarParametroFactuEmpresa;
	public JButton jButtonCancelarParametroFactuEmpresa;
    public JButton jButtonGuardarCambiosParametroFactuEmpresa;
	public JButton jButtonGuardarCambiosTablaParametroFactuEmpresa;
	protected JButton jButtonCerrarParametroFactuEmpresa;
	
	
	protected JButton jButtonProcesarInformacionParametroFactuEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFactuEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFactuEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFactuEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuEmpresa;
	protected JButton jButtonModificarToolBarParametroFactuEmpresa;
	protected JButton jButtonActualizarToolBarParametroFactuEmpresa;
    protected JButton jButtonEliminarToolBarParametroFactuEmpresa;
	protected JButton jButtonCancelarToolBarParametroFactuEmpresa;
    protected JButton jButtonGuardarCambiosToolBarParametroFactuEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFactuEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuEmpresa;
	protected JButton jButtonCerrarToolBarParametroFactuEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFactuEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuEmpresa;
	protected JMenuItem jMenuItemModificarParametroFactuEmpresa;
	protected JMenuItem jMenuItemActualizarParametroFactuEmpresa;
    protected JMenuItem jMenuItemEliminarParametroFactuEmpresa;
	protected JMenuItem jMenuItemCancelarParametroFactuEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosParametroFactuEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuEmpresa;
	protected JMenuItem jMenuItemCerrarParametroFactuEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFactuEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFactuEmpresa;
	public JLabel jLabelIdParametroFactuEmpresa;
	public JLabel jLabelidParametroFactuEmpresa;
	public JButton jButtonidParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_origenParametroFactuEmpresa;
	public JLabel jLabelcosto_origenParametroFactuEmpresa;
	public JTextField jTextFieldcosto_origenParametroFactuEmpresa;
	public JButton jButtoncosto_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_destinoParametroFactuEmpresa;
	public JLabel jLabelcosto_destinoParametroFactuEmpresa;
	public JTextField jTextFieldcosto_destinoParametroFactuEmpresa;
	public JButton jButtoncosto_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcon_transferenciaParametroFactuEmpresa;
	public JLabel jLabelcon_transferenciaParametroFactuEmpresa;
	public JCheckBox jCheckBoxcon_transferenciaParametroFactuEmpresa;
	public JButton jButtoncon_transferenciaParametroFactuEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFactuEmpresa;
	public JLabel jLabelid_empresaParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFactuEmpresa;
	public JButton jButtonid_empresaParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_origenParametroFactuEmpresa;
	public JLabel jLabelid_empresa_origenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_origenParametroFactuEmpresa;
	public JButton jButtonid_empresa_origenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_origenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFactuEmpresa;
	public JLabel jLabelid_sucursalParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFactuEmpresa;
	public JButton jButtonid_sucursalParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_origenParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_origenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_origenParametroFactuEmpresa;
	public JButton jButtonid_transaccion_origenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_origenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_origenParametroFactuEmpresa;
	public JLabel jLabelid_bodega_origenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_origenParametroFactuEmpresa;
	public JButton jButtonid_bodega_origenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_origenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_cliente_origenParametroFactuEmpresa;
	public JLabel jLabelid_cliente_origenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_origenParametroFactuEmpresa;
	public JButton jButtonid_cliente_origenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_cliente_origenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cliente_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_destinoParametroFactuEmpresa;
	public JLabel jLabelid_empresa_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoParametroFactuEmpresa;
	public JButton jButtonid_empresa_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_destinoParametroFactuEmpresa;
	public JLabel jLabelid_sucursal_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_destinoParametroFactuEmpresa;
	public JButton jButtonid_sucursal_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursal_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_destinoParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_destinoParametroFactuEmpresa;
	public JButton jButtonid_transaccion_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_destinoParametroFactuEmpresa;
	public JLabel jLabelid_bodega_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoParametroFactuEmpresa;
	public JButton jButtonid_bodega_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_cliente_destinoParametroFactuEmpresa;
	public JLabel jLabelid_cliente_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_destinoParametroFactuEmpresa;
	public JButton jButtonid_cliente_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_cliente_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cliente_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresa_multi_destinoParametroFactuEmpresa;
	public JLabel jLabelid_empresa_multi_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_multi_destinoParametroFactuEmpresa;
	public JButton jButtonid_empresa_multi_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_multi_destinoParametroFactuEmpresa;
	public JLabel jLabelid_sucursal_multi_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa;
	public JButton jButtonid_sucursal_multi_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_multi_destinoParametroFactuEmpresa;
	public JLabel jLabelid_transaccion_multi_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa;
	public JButton jButtonid_transaccion_multi_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_multi_origenParametroFactuEmpresa;
	public JLabel jLabelid_bodega_multi_origenParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_multi_origenParametroFactuEmpresa;
	public JButton jButtonid_bodega_multi_origenParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_multi_destinoParametroFactuEmpresa;
	public JLabel jLabelid_bodega_multi_destinoParametroFactuEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_multi_destinoParametroFactuEmpresa;
	public JButton jButtonid_bodega_multi_destinoParametroFactuEmpresa= new JButtonMe();
	public JButton jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFactuEmpresa;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFactuEmpresa=new JPanel();
				this.jPanelAccionesFormularioParametroFactuEmpresa=new JPanel();
				this.jmenuBarDetalleParametroFactuEmpresa=new JMenuBar();
				this.jTtoolBarDetalleParametroFactuEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFactuEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFactuEmpresa() {
		return this.jButtonActualizarToolBarParametroFactuEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarParametroFactuEmpresa() {
		return this.jButtonEliminarToolBarParametroFactuEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarParametroFactuEmpresa() {
		return this.jButtonCancelarToolBarParametroFactuEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFactuEmpresa() {
		return this.jButtonProcesarInformacionParametroFactuEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuEmpresa)	{
		this.jButtonProcesarInformacionParametroFactuEmpresa = jButtonProcesarInformacionParametroFactuEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuEmpresa() {
		return this.jComboBoxTiposAccionesParametroFactuEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuEmpresa(
			JComboBox jComboBoxTiposRelacionesParametroFactuEmpresa) {
		this.jComboBoxTiposRelacionesParametroFactuEmpresa = jComboBoxTiposRelacionesParametroFactuEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuEmpresa(
			JComboBox jComboBoxTiposAccionesParametroFactuEmpresa) {
		this.jComboBoxTiposAccionesParametroFactuEmpresa = jComboBoxTiposAccionesParametroFactuEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFactuEmpresa() {
		return this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFactuEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioParametroFactuEmpresa) {
		this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa = jComboBoxTiposAccionesFormularioParametroFactuEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofactuempresaSessionBean=new ParametroFactuEmpresaSessionBean();
		
		this.parametrofactuempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Empresa  MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFactuEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFactuEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFactuEmpresa=new JButtonMe();
				this.jButtonModificarToolBarParametroFactuEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFactuEmpresa,this.jTtoolBarDetalleParametroFactuEmpresa,
							"actualizar","actualizar","Actualizar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFactuEmpresa,this.jTtoolBarDetalleParametroFactuEmpresa,
							"eliminar","eliminar","Eliminar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFactuEmpresa,this.jTtoolBarDetalleParametroFactuEmpresa,
							"cancelar","cancelar","Cancelar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFactuEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFactuEmpresa,this.jTtoolBarDetalleParametroFactuEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFactuEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFactuEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFactuEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFactuEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFactuEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFactuEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFactuEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFactuEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFactuEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFactuEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFactuEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFactuEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFactuEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFactuEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFactuEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFactuEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFactuEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFactuEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFactuEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFactuEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFactuEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFactuEmpresa.add(this.jMenuItemDetalleCerrarParametroFactuEmpresa);
		
		this.jmenuDetalleAccionesParametroFactuEmpresa.add(this.jMenuItemActualizarParametroFactuEmpresa);
		this.jmenuDetalleAccionesParametroFactuEmpresa.add(this.jMenuItemEliminarParametroFactuEmpresa);
		this.jmenuDetalleAccionesParametroFactuEmpresa.add(this.jMenuItemCancelarParametroFactuEmpresa);		
		
		//this.jmenuDetalleDatosParametroFactuEmpresa.add(this.jMenuItemDetalleAbrirOrderByParametroFactuEmpresa);				
		this.jmenuDetalleDatosParametroFactuEmpresa.add(this.jMenuItemDetalleMostarOcultarParametroFactuEmpresa);				
				
		//this.jmenuDetalleAccionesParametroFactuEmpresa.add(this.jMenuItemGuardarCambiosParametroFactuEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFactuEmpresa.add(this.jmenuDetalleArchivoParametroFactuEmpresa);		
		this.jmenuBarDetalleParametroFactuEmpresa.add(this.jmenuDetalleAccionesParametroFactuEmpresa);		
		this.jmenuBarDetalleParametroFactuEmpresa.add(this.jmenuDetalleDatosParametroFactuEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFactuEmpresa);				
	}
	
	
	public void inicializarElementosCamposParametroFactuEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFactuEmpresa = new JLabelMe();
		jLabelIdParametroFactuEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFactuEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFactuEmpresa= new GridBagLayout();

		this.jPanelidParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);

		jLabelidParametroFactuEmpresa = new JLabel();
		jLabelidParametroFactuEmpresa.setText("Id");

		jLabelidParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcosto_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelcosto_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_COSTOORIGEN+" : *");
		this.jLabelcosto_origenParametroFactuEmpresa.setToolTipText("Costo Origen");
		this.jLabelcosto_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_COSTOORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelcosto_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jTextFieldcosto_origenParametroFactuEmpresa= new JTextFieldMe();
		jTextFieldcosto_origenParametroFactuEmpresa.setEnabled(false);
		jTextFieldcosto_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_origenParametroFactuEmpresa.setText("0.0");

		this.jButtoncosto_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_origenParametroFactuEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelcosto_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_COSTODESTINO+" : *");
		this.jLabelcosto_destinoParametroFactuEmpresa.setToolTipText("Costo Destino");
		this.jLabelcosto_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_COSTODESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelcosto_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jTextFieldcosto_destinoParametroFactuEmpresa= new JTextFieldMe();
		jTextFieldcosto_destinoParametroFactuEmpresa.setEnabled(false);
		jTextFieldcosto_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_destinoParametroFactuEmpresa.setText("0.0");

		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcon_transferenciaParametroFactuEmpresa = new JLabelMe();
		this.jLabelcon_transferenciaParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_CONTRANSFERENCIA+" : *");
		this.jLabelcon_transferenciaParametroFactuEmpresa.setToolTipText("Con Transferencia");
		this.jLabelcon_transferenciaParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_transferenciaParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_transferenciaParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_transferenciaParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_transferenciaParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_transferenciaParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_CONTRANSFERENCIA);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelcon_transferenciaParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jCheckBoxcon_transferenciaParametroFactuEmpresa= new JCheckBoxMe();
		jCheckBoxcon_transferenciaParametroFactuEmpresa.setEnabled(false);

		jCheckBoxcon_transferenciaParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_transferenciaParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_transferenciaParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_transferenciaParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setText("U");
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_transferenciaParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_transferenciaParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_transferenciaParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_transferenciaParametroFactuEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFactuEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_empresaParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFactuEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_empresaParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_empresaParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresaParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFactuEmpresa.setEnabled(false);

		this.jButtonid_empresaParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_empresaParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_empresaParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuEmpresa"));

		this.jButtonid_empresaParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_empresaParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuEmpresaUpdate"));



					
		this.jLabelid_empresa_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_empresa_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESAORIGEN+" : *");
		this.jLabelid_empresa_origenParametroFactuEmpresa.setToolTipText("Empresa Origen");
		this.jLabelid_empresa_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresa_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresa_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESAORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_empresa_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_empresa_origenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_empresa_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_empresa_origenParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_origenParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenParametroFactuEmpresa"));

		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_origenParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_origenParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_origenParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_origenParametroFactuEmpresaUpdate"));



					
		this.jLabelid_sucursalParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_sucursalParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFactuEmpresa.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_sucursalParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_sucursalParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursalParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursalParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_sucursalParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_sucursalParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuEmpresa"));

		this.jButtonid_sucursalParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_sucursalParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuEmpresaUpdate"));



					
		this.jLabelid_transaccion_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_transaccion_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONORIGEN+" : *");
		this.jLabelid_transaccion_origenParametroFactuEmpresa.setToolTipText("Transaccion Origen");
		this.jLabelid_transaccion_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_transaccion_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_transaccion_origenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_origenParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_origenParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_origenParametroFactuEmpresa"));

		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_origenParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_origenParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_origenParametroFactuEmpresaUpdate"));



					
		this.jLabelid_bodega_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_bodega_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAORIGEN+" : *");
		this.jLabelid_bodega_origenParametroFactuEmpresa.setToolTipText("Bodega Origen");
		this.jLabelid_bodega_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_bodega_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_bodega_origenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_bodega_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_bodega_origenParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_origenParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_origenParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_origenParametroFactuEmpresa"));

		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_origenParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_origenParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_origenParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_origenParametroFactuEmpresaUpdate"));



					
		this.jLabelid_cliente_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_cliente_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDCLIENTEORIGEN+" : *");
		this.jLabelid_cliente_origenParametroFactuEmpresa.setToolTipText("Cliente Origen");
		this.jLabelid_cliente_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cliente_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cliente_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDCLIENTEORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_cliente_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_cliente_origenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_cliente_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_cliente_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_cliente_origenParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_origenParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_origenParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_origenParametroFactuEmpresa"));

		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_origenParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_origenParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_origenParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_origenParametroFactuEmpresaUpdate"));



					
		this.jLabelid_empresa_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_empresa_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESADESTINO+" :");
		this.jLabelid_empresa_destinoParametroFactuEmpresa.setToolTipText("Empresa Destino");
		this.jLabelid_empresa_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empresa_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESADESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_empresa_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_empresa_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoParametroFactuEmpresa"));

		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_sucursal_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_sucursal_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSALDESTINO+" : *");
		this.jLabelid_sucursal_destinoParametroFactuEmpresa.setToolTipText("Sucursal Destino");
		this.jLabelid_sucursal_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSALDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_sucursal_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_sucursal_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursal_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoParametroFactuEmpresa"));

		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_transaccion_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_transaccion_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONDESTINO+" : *");
		this.jLabelid_transaccion_destinoParametroFactuEmpresa.setToolTipText("Transaccion Destino");
		this.jLabelid_transaccion_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_transaccion_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_transaccion_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_destinoParametroFactuEmpresa"));

		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_bodega_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_bodega_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGADESTINO+" : *");
		this.jLabelid_bodega_destinoParametroFactuEmpresa.setToolTipText("Bodega Destino");
		this.jLabelid_bodega_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGADESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_bodega_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_bodega_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoParametroFactuEmpresa"));

		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_cliente_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_cliente_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDCLIENTEDESTINO+" : *");
		this.jLabelid_cliente_destinoParametroFactuEmpresa.setToolTipText("Cliente Destino");
		this.jLabelid_cliente_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDCLIENTEDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_cliente_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_cliente_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_cliente_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_destinoParametroFactuEmpresa"));

		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESAMULTIDESTINO+" : *");
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa.setToolTipText("Empresa Multi Destino");
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empresa_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresa_multi_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDEMPRESAMULTIDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_multi_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_multi_destinoParametroFactuEmpresa"));

		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_multi_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresa_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresa_multi_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSALMULTIDESTINO+" : *");
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa.setToolTipText("Sucursal Multi Destino");
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sucursal_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDSUCURSALMULTIDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_multi_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_multi_destinoParametroFactuEmpresa"));

		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_multi_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_multi_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONMULTIDESTINO+" : *");
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa.setToolTipText("Transaccion Multi Destino");
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDTRANSACCIONMULTIDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_multi_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_multi_destinoParametroFactuEmpresa"));

		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_multi_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_multi_destinoParametroFactuEmpresaUpdate"));



					
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAMULTIORIGEN+" : *");
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa.setToolTipText("Bodega Multi Origen");
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_multi_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_multi_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_multi_origenParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_multi_origenParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAMULTIORIGEN);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_bodega_multi_origenParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_bodega_multi_origenParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_multi_origenParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_multi_origenParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_origenParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_origenParametroFactuEmpresa"));

		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_origenParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_origenParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_origenParametroFactuEmpresaUpdate"));



					
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa = new JLabelMe();
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa.setText(""+ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAMULTIDESTINO+" : *");
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa.setToolTipText("Bodega Multi Destino");
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_bodega_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_multi_destinoParametroFactuEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.setToolTipText(ParametroFactuEmpresaConstantesFunciones.LABEL_IDBODEGAMULTIDESTINO);
		this.gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.setLayout(this.gridaBagLayoutParametroFactuEmpresa);


		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa= new JComboBoxMe();
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_multi_destinoParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa= new JButtonMe();
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setText("Buscar");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_destinoParametroFactuEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_destinoParametroFactuEmpresa"));

		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda= new JButtonMe();
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setText("U");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_destinoParametroFactuEmpresaBusqueda"));

		if(this.parametrofactuempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate= new JButtonMe();
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setText("U");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_multi_destinoParametroFactuEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_multi_destinoParametroFactuEmpresaUpdate"));



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
		//this.jInternalFrameDetalleParametroFactuEmpresa = new ParametroFactuEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Empresa  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuEmpresa= new GridBagLayout();
		

		
		String sToolTipParametroFactuEmpresa="";
		sToolTipParametroFactuEmpresa=ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuEmpresa+="(Facturacion.ParametroFactuEmpresa)";
		}
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFactuEmpresa = new JButtonMe();
		this.jButtonModificarParametroFactuEmpresa = new JButtonMe();
        this.jButtonActualizarParametroFactuEmpresa = new JButtonMe();
        this.jButtonEliminarParametroFactuEmpresa = new JButtonMe();
        this.jButtonCancelarParametroFactuEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosParametroFactuEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa = new JButtonMe();
		this.jButtonCerrarParametroFactuEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFactuEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFactuEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroFactuEmpresa=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioorigenParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodestinoParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Empresa ";
		
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Empresa s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFactuEmpresa.setName("jPanelCamposParametroFactuEmpresa"); 

		this.jPanelCamposOcultosParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFactuEmpresa.setName("jPanelCamposOcultosParametroFactuEmpresa"); 

        this.jPanelAccionesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFactuEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFactuEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioorigenParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Origen"));
		this.jPanelCamposInicioorigenParametroFactuEmpresa.setName("jPanelCamposFinorigenParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioorigenParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));
		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setName("jPanelCamposFindestinoParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodestinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Multi Destino"));
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setName("jPanelCamposFinmulti_destinoParametroFactuEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFactuEmpresa.setText("Nuevo");
		this.jButtonModificarParametroFactuEmpresa.setText("Editar");
        this.jButtonActualizarParametroFactuEmpresa.setText("Actualizar");
        this.jButtonEliminarParametroFactuEmpresa.setText("Eliminar");
        this.jButtonCancelarParametroFactuEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFactuEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.setText("Guardar");
		this.jButtonCerrarParametroFactuEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuEmpresa,"nuevo_button","Nuevo",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFactuEmpresa,"modificar_button","Editar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFactuEmpresa,"actualizar_button","Actualizar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFactuEmpresa,"eliminar_button","Eliminar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFactuEmpresa,"cancelar_button","Cancelar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFactuEmpresa,"guardarcambios_button","Guardar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuEmpresa,"guardarcambiostabla_button","Guardar",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuEmpresa,"cerrar_button","Salir",this.parametrofactuempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFactuEmpresa.setToolTipText("Nuevo"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFactuEmpresa.setToolTipText("Editar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFactuEmpresa.setToolTipText("Actualizar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFactuEmpresa.setToolTipText("Eliminar)"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFactuEmpresa.setToolTipText("Cancelar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFactuEmpresa.setToolTipText("Guardar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.setToolTipText("Guardar"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuEmpresa.setToolTipText("Salir"+" "+ParametroFactuEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuEmpresa";
		inputMap = this.jButtonNuevoParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFactuEmpresa";
		inputMap = this.jButtonActualizarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFactuEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFactuEmpresa";
		inputMap = this.jButtonEliminarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFactuEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFactuEmpresa";
		inputMap = this.jButtonCancelarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFactuEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuEmpresa";
		inputMap = this.jButtonCerrarParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFactuEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFactuEmpresa.setToolTipText("Nuevo ParametroFactuEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFactuEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFactuEmpresa.setToolTipText("Sin Cerrar Ventana ParametroFactuEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFactuEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFactuEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFactuEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFactuEmpresa = new JLabelMe();
		
		this.jLabelAccionesParametroFactuEmpresa.setText("Acciones");		
		this.jLabelAccionesParametroFactuEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFactuEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFactuEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFactuEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFactuEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFactuEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFactuEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFactuEmpresa = new GridBagLayout();
		
		this.jPanelCamposParametroFactuEmpresa.setLayout(gridaBagLayoutCamposParametroFactuEmpresa);
		this.jPanelCamposOcultosParametroFactuEmpresa.setLayout(gridaBagLayoutCamposOcultosParametroFactuEmpresa);
		
		

		GridBagLayout gridaBagLayoutCamposInicioorigenParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposInicioorigenParametroFactuEmpresa.setLayout(gridaBagLayoutCamposInicioorigenParametroFactuEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciodestinoParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposIniciodestinoParametroFactuEmpresa.setLayout(gridaBagLayoutCamposIniciodestinoParametroFactuEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciomulti_destinoParametroFactuEmpresa= new GridBagLayout();
		this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.setLayout(gridaBagLayoutCamposIniciomulti_destinoParametroFactuEmpresa);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFactuEmpresa.add(jLabelIdParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFactuEmpresa.add(jLabelidParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFactuEmpresa.add(jLabelid_empresaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuEmpresa.add(jButtonid_empresaParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuEmpresa.add(jButtonid_empresaParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFactuEmpresa.add(jComboBoxid_empresaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_origenParametroFactuEmpresa.add(jLabelid_empresa_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_origenParametroFactuEmpresa.add(jButtonid_empresa_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_origenParametroFactuEmpresa.add(jButtonid_empresa_origenParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_origenParametroFactuEmpresa.add(jComboBoxid_empresa_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFactuEmpresa.add(jLabelid_sucursalParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuEmpresa.add(jButtonid_sucursalParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuEmpresa.add(jButtonid_sucursalParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFactuEmpresa.add(jComboBoxid_sucursalParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_origenParametroFactuEmpresa.add(jLabelid_transaccion_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_origenParametroFactuEmpresa.add(jButtonid_transaccion_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_origenParametroFactuEmpresa.add(jButtonid_transaccion_origenParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_origenParametroFactuEmpresa.add(jComboBoxid_transaccion_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_origenParametroFactuEmpresa.add(jLabelid_bodega_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_origenParametroFactuEmpresa.add(jButtonid_bodega_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_origenParametroFactuEmpresa.add(jButtonid_bodega_origenParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_origenParametroFactuEmpresa.add(jComboBoxid_bodega_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_origenParametroFactuEmpresa.add(jLabelid_cliente_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_origenParametroFactuEmpresa.add(jButtonid_cliente_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_origenParametroFactuEmpresa.add(jButtonid_cliente_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 4;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_origenParametroFactuEmpresa.add(jButtonid_cliente_origenParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_origenParametroFactuEmpresa.add(jComboBoxid_cliente_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_origenParametroFactuEmpresa.add(jLabelcosto_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_origenParametroFactuEmpresa.add(jButtoncosto_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_origenParametroFactuEmpresa.add(jTextFieldcosto_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_destinoParametroFactuEmpresa.add(jLabelid_empresa_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoParametroFactuEmpresa.add(jButtonid_empresa_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_destinoParametroFactuEmpresa.add(jButtonid_empresa_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_destinoParametroFactuEmpresa.add(jComboBoxid_empresa_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursal_destinoParametroFactuEmpresa.add(jLabelid_sucursal_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_destinoParametroFactuEmpresa.add(jButtonid_sucursal_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_destinoParametroFactuEmpresa.add(jButtonid_sucursal_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursal_destinoParametroFactuEmpresa.add(jComboBoxid_sucursal_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_destinoParametroFactuEmpresa.add(jLabelid_transaccion_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_destinoParametroFactuEmpresa.add(jButtonid_transaccion_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_destinoParametroFactuEmpresa.add(jButtonid_transaccion_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_destinoParametroFactuEmpresa.add(jComboBoxid_transaccion_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_destinoParametroFactuEmpresa.add(jLabelid_bodega_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoParametroFactuEmpresa.add(jButtonid_bodega_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoParametroFactuEmpresa.add(jButtonid_bodega_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_destinoParametroFactuEmpresa.add(jComboBoxid_bodega_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_destinoParametroFactuEmpresa.add(jLabelid_cliente_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_destinoParametroFactuEmpresa.add(jButtonid_cliente_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_destinoParametroFactuEmpresa.add(jButtonid_cliente_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 4;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_destinoParametroFactuEmpresa.add(jButtonid_cliente_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_destinoParametroFactuEmpresa.add(jComboBoxid_cliente_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_destinoParametroFactuEmpresa.add(jLabelcosto_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_destinoParametroFactuEmpresa.add(jButtoncosto_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_destinoParametroFactuEmpresa.add(jTextFieldcosto_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_transferenciaParametroFactuEmpresa.add(jLabelcon_transferenciaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_transferenciaParametroFactuEmpresa.add(jButtoncon_transferenciaParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_transferenciaParametroFactuEmpresa.add(jCheckBoxcon_transferenciaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.add(jLabelid_empresa_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.add(jButtonid_empresa_multi_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.add(jButtonid_empresa_multi_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresa_multi_destinoParametroFactuEmpresa.add(jComboBoxid_empresa_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.add(jLabelid_sucursal_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.add(jButtonid_sucursal_multi_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.add(jButtonid_sucursal_multi_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa.add(jComboBoxid_sucursal_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.add(jLabelid_transaccion_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.add(jButtonid_transaccion_multi_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.add(jButtonid_transaccion_multi_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa.add(jComboBoxid_transaccion_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_multi_origenParametroFactuEmpresa.add(jLabelid_bodega_multi_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_multi_origenParametroFactuEmpresa.add(jButtonid_bodega_multi_origenParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_multi_origenParametroFactuEmpresa.add(jButtonid_bodega_multi_origenParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_multi_origenParametroFactuEmpresa.add(jComboBoxid_bodega_multi_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.add(jLabelid_bodega_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 2;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.add(jButtonid_bodega_multi_destinoParametroFactuEmpresaBusqueda, this.gridBagConstraintsParametroFactuEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 3;
		this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
		this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.add(jButtonid_bodega_multi_destinoParametroFactuEmpresaUpdate, this.gridBagConstraintsParametroFactuEmpresa);
	}

	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = 1;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_multi_destinoParametroFactuEmpresa.add(jComboBoxid_bodega_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposOcultosParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposOcultosParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuEmpresa.add(this.jPanelid_empresaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposOcultosParametroFactuEmpresa % 1==0) {
		iXPanelCamposOcultosParametroFactuEmpresa=0;
		iYPanelCamposOcultosParametroFactuEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelidParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelid_empresa_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelid_sucursalParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelid_transaccion_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelid_bodega_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelid_cliente_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposInicioorigenParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposInicioorigenParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorigenParametroFactuEmpresa.add(this.jPanelcosto_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposInicioorigenParametroFactuEmpresa % 1==0) {
		iXPanelCamposInicioorigenParametroFactuEmpresa=0;
		iYPanelCamposInicioorigenParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelid_empresa_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelid_sucursal_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelid_transaccion_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelid_bodega_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelid_cliente_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelcosto_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciodestinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciodestinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodestinoParametroFactuEmpresa.add(this.jPanelcon_transferenciaParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciodestinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciodestinoParametroFactuEmpresa=0;
		iYPanelCamposIniciodestinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.add(this.jPanelid_empresa_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciomulti_destinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
		iYPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.add(this.jPanelid_sucursal_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciomulti_destinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
		iYPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.add(this.jPanelid_transaccion_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciomulti_destinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
		iYPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.add(this.jPanelid_bodega_multi_origenParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciomulti_destinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
		iYPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	}
	this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuEmpresa.gridy = iYPanelCamposIniciomulti_destinoParametroFactuEmpresa;
	this.gridBagConstraintsParametroFactuEmpresa.gridx = iXPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
	this.gridBagConstraintsParametroFactuEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa.add(this.jPanelid_bodega_multi_destinoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);



	if(iXPanelCamposIniciomulti_destinoParametroFactuEmpresa % 1==0) {
		iXPanelCamposIniciomulti_destinoParametroFactuEmpresa=0;
		iYPanelCamposIniciomulti_destinoParametroFactuEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuEmpresa= new GridBagLayout();
		this.jPanelAccionesParametroFactuEmpresa.setLayout(gridaBagLayoutAccionesParametroFactuEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFactuEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFactuEmpresa.setLayout(gridaBagLayoutAccionesFormularioParametroFactuEmpresa);
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuEmpresa.add(this.jComboBoxTiposAccionesFormularioParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuEmpresa.add(this.jCheckBoxPostAccionNuevoParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofactuempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuEmpresa.add(this.jCheckBoxPostAccionSinCerrarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofactuempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuEmpresa.add(this.jCheckBoxPostAccionSinMensajeParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonModificarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);							

		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;
		this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonEliminarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonActualizarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);


		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonGuardarCambiosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);	
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = 0;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFactuEmpresa.add(this.jButtonCancelarParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;		
			//this.gridBagConstraintsParametroFactuEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuEmpresa.gridx =0;
		this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFactuEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFactuEmpresa = new ParametroFactuEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Empresa  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Empresa  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Empresa  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFactuEmpresaModel parametrofactuempresaModel=new ParametroFactuEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFactuEmpresaModel.ParametroFactuEmpresaFocusTraversalPolicy parametrofactuempresaFocusTraversalPolicy = parametrofactuempresaModel.new ParametroFactuEmpresaFocusTraversalPolicy(this);
			
			//parametrofactuempresaFocusTraversalPolicy.setparametrofactuempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofactuempresaModel);
			
			
			this.jContentPaneDetalleParametroFactuEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFactuEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleParametroFactuEmpresa.setLayout(gridaBagLayoutDetalleParametroFactuEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFactuEmpresa.add(jTtoolBarDetalleParametroFactuEmpresa, gridBagConstraintsParametroFactuEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFactuEmpresa=   new JScrollPane(jContentPaneDetalleParametroFactuEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFactuEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroFactuEmpresa.add("Origen",this.jPanelCamposInicioorigenParametroFactuEmpresa);
		this.jTabbedPaneCamposParametroFactuEmpresa.add("Destino",this.jPanelCamposIniciodestinoParametroFactuEmpresa);
		this.jTabbedPaneCamposParametroFactuEmpresa.add("Multi Destino",this.jPanelCamposIniciomulti_destinoParametroFactuEmpresa);
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
						
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleParametroFactuEmpresa.add(jTabbedPaneCamposParametroFactuEmpresa, gridBagConstraintsParametroFactuEmpresa);
			
			
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
						&& parametrofactuempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofactuempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFactuEmpresa= new GridBagConstraints();
						this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
						this.jContentPaneDetalleParametroFactuEmpresa.add(this.jTabbedPaneRelacionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFactuEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFactuEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
					this.gridBagConstraintsParametroFactuEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFactuEmpresa.add(jPanelCamposOcultosParametroFactuEmpresa, gridBagConstraintsParametroFactuEmpresa);
				
					this.jPanelCamposOcultosParametroFactuEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	        this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFactuEmpresa.add(this.jPanelAccionesFormularioParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);							
			
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFactuEmpresa.add(this.jPanelAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFactuEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFactuEmpresa=   new JScrollPane(this.jPanelCamposParametroFactuEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
			this.gridBagConstraintsParametroFactuEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFactuEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFactuEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);			
			
			this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
			
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		
			
		this.gridBagConstraintsParametroFactuEmpresa = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuEmpresa, this.gridBagConstraintsParametroFactuEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFactuEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFactuEmpresa;
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
