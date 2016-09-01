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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ParametroGraficoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ParametroGraficoDetalleFormJInternalFrame extends ParametroGraficoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroGrafico;
	
	protected JMenuBar jmenuBarDetalleParametroGrafico;
	
	protected JMenu jmenuDetalleParametroGrafico;
	protected JMenu jmenuDetalleArchivoParametroGrafico;
	protected JMenu jmenuDetalleAccionesParametroGrafico;
	protected JMenu jmenuDetalleDatosParametroGrafico;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGrafico;	
	protected GridBagConstraints gridBagConstraintsParametroGrafico;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroGraficoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroGrafico;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableactivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableactivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepasivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepasivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledisponibilidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledisponibilidad="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostoventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioiniBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventarioini="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventariofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventariofin="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecuentascobrarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecuentascobrar="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventacredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableactivototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableactivototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepasivototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepasivototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepatrimonioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepatrimonio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablepatrimoniototalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablepatrimoniototal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";
	
	public ParametroGraficoSessionBean parametrograficoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableactivoSessionBean;
	public CuentaContableSessionBean cuentacontablepasivoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontabledisponibilidadSessionBean;
	public CuentaContableSessionBean cuentacontablecostoventaSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioiniSessionBean;
	public CuentaContableSessionBean cuentacontableinventariofinSessionBean;
	public CuentaContableSessionBean cuentacontablecuentascobrarSessionBean;
	public CuentaContableSessionBean cuentacontableventacreditoSessionBean;
	public CuentaContableSessionBean cuentacontableactivototalSessionBean;
	public CuentaContableSessionBean cuentacontablepasivototalSessionBean;
	public CuentaContableSessionBean cuentacontablepatrimonioSessionBean;
	public CuentaContableSessionBean cuentacontablepatrimoniototalSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;	
	
	public ParametroGraficoLogic parametrograficoLogic;
	
	public JScrollPane jScrollPanelDatosParametroGrafico;
	public JScrollPane jScrollPanelDatosEdicionParametroGrafico;
	public JScrollPane jScrollPanelDatosGeneralParametroGrafico;
	
	protected JPanel jPanelCamposParametroGrafico;    
	protected JPanel jPanelCamposOcultosParametroGrafico;    	
	protected JPanel jPanelAccionesParametroGrafico;
	protected JPanel jPanelAccionesFormularioParametroGrafico;
    
	
	
	protected Integer iXPanelCamposParametroGrafico=0;
	protected Integer iYPanelCamposParametroGrafico=0;
	
	protected Integer iXPanelCamposOcultosParametroGrafico=0;
	protected Integer iYPanelCamposOcultosParametroGrafico=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroGrafico;
	public JButton jButtonModificarParametroGrafico;
	public JButton jButtonActualizarParametroGrafico;
    public JButton jButtonEliminarParametroGrafico;
	public JButton jButtonCancelarParametroGrafico;
    public JButton jButtonGuardarCambiosParametroGrafico;
	public JButton jButtonGuardarCambiosTablaParametroGrafico;
	protected JButton jButtonCerrarParametroGrafico;
	
	
	protected JButton jButtonProcesarInformacionParametroGrafico;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroGrafico;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroGrafico;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroGrafico;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGrafico;
	protected JButton jButtonModificarToolBarParametroGrafico;
	protected JButton jButtonActualizarToolBarParametroGrafico;
    protected JButton jButtonEliminarToolBarParametroGrafico;
	protected JButton jButtonCancelarToolBarParametroGrafico;
    protected JButton jButtonGuardarCambiosToolBarParametroGrafico;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroGrafico;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGrafico;
	protected JButton jButtonCerrarToolBarParametroGrafico;
	
	protected JButton jButtonProcesarInformacionToolBarParametroGrafico;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGrafico;
	protected JMenuItem jMenuItemModificarParametroGrafico;
	protected JMenuItem jMenuItemActualizarParametroGrafico;
    protected JMenuItem jMenuItemEliminarParametroGrafico;
	protected JMenuItem jMenuItemCancelarParametroGrafico;
    protected JMenuItem jMenuItemGuardarCambiosParametroGrafico;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGrafico;
	protected JMenuItem jMenuItemCerrarParametroGrafico;
	protected JMenuItem jMenuItemDetalleCerrarParametroGrafico;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGrafico;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroGrafico;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGrafico;
	protected JMenuItem jMenuItemMostrarOcultarParametroGrafico;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGrafico;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGrafico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGrafico;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroGrafico;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroGrafico;
	public JLabel jLabelIdParametroGrafico;
	public JLabel jLabelidParametroGrafico;
	public JButton jButtonidParametroGraficoBusqueda= new JButtonMe();

	public JPanel jPanelinventario_inicialParametroGrafico;
	public JLabel jLabelinventario_inicialParametroGrafico;
	public JTextField jTextFieldinventario_inicialParametroGrafico;
	public JButton jButtoninventario_inicialParametroGraficoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroGrafico;
	public JLabel jLabelid_empresaParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroGrafico;
	public JButton jButtonid_empresaParametroGrafico= new JButtonMe();
	public JButton jButtonid_empresaParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroGraficoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_activoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_activoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activoParametroGrafico;
	public JButton jButtonid_cuenta_contable_activoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activoParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_pasivoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_pasivoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivoParametroGrafico;
	public JButton jButtonid_cuenta_contable_pasivoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivoParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventarioParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventarioParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_disponibilidadParametroGrafico;
	public JLabel jLabelid_cuenta_contable_disponibilidadParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_disponibilidadParametroGrafico;
	public JButton jButtonid_cuenta_contable_disponibilidadParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_ventaParametroGrafico;
	public JLabel jLabelid_cuenta_contable_costo_ventaParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_ventaParametroGrafico;
	public JButton jButtonid_cuenta_contable_costo_ventaParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventario_iniParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventario_iniParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventario_iniParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventario_iniParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventario_finParametroGrafico;
	public JLabel jLabelid_cuenta_contable_inventario_finParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventario_finParametroGrafico;
	public JButton jButtonid_cuenta_contable_inventario_finParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventario_finParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico;
	public JLabel jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico;
	public JButton jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_venta_creditoParametroGrafico;
	public JLabel jLabelid_cuenta_contable_venta_creditoParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_venta_creditoParametroGrafico;
	public JButton jButtonid_cuenta_contable_venta_creditoParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_activo_totalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_activo_totalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_activo_totalParametroGrafico;
	public JButton jButtonid_cuenta_contable_activo_totalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_activo_totalParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_pasivo_totalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_pasivo_totalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico;
	public JButton jButtonid_cuenta_contable_pasivo_totalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_patrimonioParametroGrafico;
	public JLabel jLabelid_cuenta_contable_patrimonioParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonioParametroGrafico;
	public JButton jButtonid_cuenta_contable_patrimonioParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonioParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_patrimonio_totalParametroGrafico;
	public JLabel jLabelid_cuenta_contable_patrimonio_totalParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico;
	public JButton jButtonid_cuenta_contable_patrimonio_totalParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaParametroGrafico;
	public JLabel jLabelid_cuenta_contable_ventaParametroGrafico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaParametroGrafico;
	public JButton jButtonid_cuenta_contable_ventaParametroGrafico= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaParametroGraficoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaParametroGraficoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaParametroGraficoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroGrafico;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroGraficoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroGrafico=new JPanel();
				this.jPanelAccionesFormularioParametroGrafico=new JPanel();
				this.jmenuBarDetalleParametroGrafico=new JMenuBar();
				this.jTtoolBarDetalleParametroGrafico=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGraficoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGraficoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGrafico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroGrafico() {
		return this.jButtonActualizarToolBarParametroGrafico;
	}
	
	public JButton getjButtonEliminarToolBarParametroGrafico() {
		return this.jButtonEliminarToolBarParametroGrafico;
	}
	
	public JButton getjButtonCancelarToolBarParametroGrafico() {
		return this.jButtonCancelarToolBarParametroGrafico;
	}		
	
	public JButton getjButtonProcesarInformacionParametroGrafico() {
		return this.jButtonProcesarInformacionParametroGrafico;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGrafico)	{
		this.jButtonProcesarInformacionParametroGrafico = jButtonProcesarInformacionParametroGrafico;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGrafico() {
		return this.jComboBoxTiposAccionesParametroGrafico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGrafico(
			JComboBox jComboBoxTiposRelacionesParametroGrafico) {
		this.jComboBoxTiposRelacionesParametroGrafico = jComboBoxTiposRelacionesParametroGrafico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGrafico(
			JComboBox jComboBoxTiposAccionesParametroGrafico) {
		this.jComboBoxTiposAccionesParametroGrafico = jComboBoxTiposAccionesParametroGrafico;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroGrafico() {
		return this.jComboBoxTiposAccionesFormularioParametroGrafico;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroGrafico(
			JComboBox jComboBoxTiposAccionesFormularioParametroGrafico) {
		this.jComboBoxTiposAccionesFormularioParametroGrafico = jComboBoxTiposAccionesFormularioParametroGrafico;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrograficoSessionBean=new ParametroGraficoSessionBean();
		
		this.parametrograficoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrograficoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrograficoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGraficoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGraficoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Grafico MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroGraficoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroGrafico= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroGrafico=new JButtonMe();
				this.jButtonModificarToolBarParametroGrafico=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroGrafico,this.jTtoolBarDetalleParametroGrafico,
							"actualizar","actualizar","Actualizar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroGrafico,this.jTtoolBarDetalleParametroGrafico,
							"eliminar","eliminar","Eliminar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroGrafico,this.jTtoolBarDetalleParametroGrafico,
							"cancelar","cancelar","Cancelar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroGrafico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroGrafico,this.jTtoolBarDetalleParametroGrafico,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroGrafico=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroGrafico=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroGrafico=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroGrafico=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroGrafico=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGrafico= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGrafico.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGrafico,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroGrafico= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroGrafico.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroGrafico,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroGrafico= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroGrafico.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroGrafico,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroGrafico= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroGrafico.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroGrafico,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroGrafico= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroGrafico.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroGrafico,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroGrafico= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGrafico.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGrafico,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGrafico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGrafico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGrafico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroGrafico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroGrafico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroGrafico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGrafico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGrafico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGrafico,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGrafico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGrafico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGrafico,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroGrafico.add(this.jMenuItemDetalleCerrarParametroGrafico);
		
		this.jmenuDetalleAccionesParametroGrafico.add(this.jMenuItemActualizarParametroGrafico);
		this.jmenuDetalleAccionesParametroGrafico.add(this.jMenuItemEliminarParametroGrafico);
		this.jmenuDetalleAccionesParametroGrafico.add(this.jMenuItemCancelarParametroGrafico);		
		
		//this.jmenuDetalleDatosParametroGrafico.add(this.jMenuItemDetalleAbrirOrderByParametroGrafico);				
		this.jmenuDetalleDatosParametroGrafico.add(this.jMenuItemDetalleMostarOcultarParametroGrafico);				
				
		//this.jmenuDetalleAccionesParametroGrafico.add(this.jMenuItemGuardarCambiosParametroGrafico);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroGrafico.add(this.jmenuDetalleArchivoParametroGrafico);		
		this.jmenuBarDetalleParametroGrafico.add(this.jmenuDetalleAccionesParametroGrafico);		
		this.jmenuBarDetalleParametroGrafico.add(this.jmenuDetalleDatosParametroGrafico);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroGrafico);				
	}
	
	
	public void inicializarElementosCamposParametroGrafico() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroGrafico = new JLabelMe();
		jLabelIdParametroGrafico.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroGrafico = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroGrafico= new GridBagLayout();

		this.jPanelidParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);

		jLabelidParametroGrafico = new JLabel();
		jLabelidParametroGrafico.setText("Id");

		jLabelidParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelinventario_inicialParametroGrafico = new JLabelMe();
		this.jLabelinventario_inicialParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_INVENTARIOINICIAL+" : *");
		this.jLabelinventario_inicialParametroGrafico.setToolTipText("Inventario Inicial");
		this.jLabelinventario_inicialParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelinventario_inicialParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelinventario_inicialParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelinventario_inicialParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinventario_inicialParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinventario_inicialParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_INVENTARIOINICIAL);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelinventario_inicialParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jTextFieldinventario_inicialParametroGrafico= new JTextFieldMe();
		jTextFieldinventario_inicialParametroGrafico.setEnabled(false);
		jTextFieldinventario_inicialParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinventario_inicialParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinventario_inicialParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinventario_inicialParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinventario_inicialParametroGrafico.setText("0.0");

		this.jButtoninventario_inicialParametroGraficoBusqueda= new JButtonMe();
		this.jButtoninventario_inicialParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninventario_inicialParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninventario_inicialParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninventario_inicialParametroGraficoBusqueda.setText("U");
		this.jButtoninventario_inicialParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninventario_inicialParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninventario_inicialParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinventario_inicialParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinventario_inicialParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"inventario_inicialParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninventario_inicialParametroGraficoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroGrafico() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroGrafico = new JLabelMe();
		this.jLabelid_empresaParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroGrafico.setToolTipText("Empresa");
		this.jLabelid_empresaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_empresaParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_empresaParametroGrafico= new JComboBoxMe();
		jComboBoxid_empresaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroGrafico.setEnabled(false);

		this.jButtonid_empresaParametroGrafico= new JButtonMe();
		this.jButtonid_empresaParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGrafico.setText("Buscar");
		this.jButtonid_empresaParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGrafico"));

		this.jButtonid_empresaParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGraficoBusqueda.setText("U");
		this.jButtonid_empresaParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGraficoUpdate.setText("U");
		this.jButtonid_empresaParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGraficoUpdate"));



					
		this.jLabelid_cuenta_contable_activoParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_activoParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVO+" : *");
		this.jLabelid_cuenta_contable_activoParametroGrafico.setToolTipText("Cuenta C. Activo");
		this.jLabelid_cuenta_contable_activoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_activoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_activoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_activoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_activoParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVO);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_activoParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_activoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_activoParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activoParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_activoParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_activoParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_activoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroGrafico"));

		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_activoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_activoParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_activoParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_activoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroGraficoUpdate"));


		jButtonid_cuenta_contable_activoParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_activoParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activoParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_activoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activoParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_pasivoParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_pasivoParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVO+" : *");
		this.jLabelid_cuenta_contable_pasivoParametroGrafico.setToolTipText("Cuenta C. Pasivo");
		this.jLabelid_cuenta_contable_pasivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_pasivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_pasivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_pasivoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_pasivoParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVO);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_pasivoParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_pasivoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_pasivoParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_pasivoParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroGrafico"));

		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroGraficoUpdate"));


		jButtonid_cuenta_contable_pasivoParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_pasivoParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivoParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivoParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_inventarioParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioParametroGrafico.setToolTipText("Cuenta C. Inventario");
		this.jLabelid_cuenta_contable_inventarioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_inventarioParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioParametroGrafico"));

		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioParametroGraficoUpdate"));


		jButtonid_cuenta_contable_inventarioParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEDISPONIBILIDAD+" : *");
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico.setToolTipText("Cuenta C. Disponibilad");
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_disponibilidadParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_disponibilidadParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_disponibilidadParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEDISPONIBILIDAD);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_disponibilidadParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_disponibilidadParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_disponibilidadParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_disponibilidadParametroGrafico"));

		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_disponibilidadParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_disponibilidadParametroGraficoUpdate"));


		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_disponibilidadParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_disponibilidadParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA+" : *");
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico.setToolTipText("Cuenta C. Costo Venta");
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_ventaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_ventaParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_ventaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_ventaParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaParametroGrafico"));

		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaParametroGraficoUpdate"));


		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIOINI+" : *");
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico.setToolTipText("Cuenta C. Inventario Ini");
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventario_iniParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventario_iniParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventario_iniParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIOINI);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventario_iniParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventario_iniParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_iniParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_iniParametroGrafico"));

		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_iniParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_iniParametroGraficoUpdate"));


		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_iniParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_iniParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIOFIN+" : *");
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico.setToolTipText("Cuenta C. Inventario Fin");
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventario_finParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventario_finParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventario_finParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventario_finParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIOFIN);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventario_finParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_inventario_finParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventario_finParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventario_finParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventario_finParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_finParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_finParametroGrafico"));

		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_finParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_finParametroGraficoUpdate"));


		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventario_finParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventario_finParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventario_finParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventario_finParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLECUENTASCOBRAR+" : *");
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico.setToolTipText("Cuenta C. Cuentas Cobrar");
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLECUENTASCOBRAR);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_cuenta_cobrarParametroGrafico"));

		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_cuenta_cobrarParametroGraficoUpdate"));


		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_cuenta_cobrarParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTACREDITO+" : *");
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico.setToolTipText("Cuenta C. Venta Credito");
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_venta_creditoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_venta_creditoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_venta_creditoParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTACREDITO);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_venta_creditoParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_venta_creditoParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_venta_creditoParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_venta_creditoParametroGrafico"));

		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_venta_creditoParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_venta_creditoParametroGraficoUpdate"));


		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_venta_creditoParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_venta_creditoParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVOTOTAL+" : *");
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico.setToolTipText("Cuenta C. Activo Total");
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_activo_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_activo_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_activo_totalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_activo_totalParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVOTOTAL);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_activo_totalParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_activo_totalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_activo_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_activo_totalParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_activo_totalParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activo_totalParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activo_totalParametroGrafico"));

		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activo_totalParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activo_totalParametroGraficoUpdate"));


		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_activo_totalParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_activo_totalParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_activo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_activo_totalParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVOTOTAL+" : *");
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico.setToolTipText("Cuenta C. Pasivo Total");
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_pasivo_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_pasivo_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVOTOTAL);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivo_totalParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivo_totalParametroGrafico"));

		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivo_totalParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivo_totalParametroGraficoUpdate"));


		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_pasivo_totalParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIO+" : *");
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico.setToolTipText("Cuenta C. Patrimonio");
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonioParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_patrimonioParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_patrimonioParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIO);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_patrimonioParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_patrimonioParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonioParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_patrimonioParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroGrafico"));

		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroGraficoUpdate"));


		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_patrimonioParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonioParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonioParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonioParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIOTOTAL+" : *");
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico.setToolTipText("Cuenta C. Patrimonio Total");
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_patrimonio_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_patrimonio_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIOTOTAL);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonio_totalParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonio_totalParametroGrafico"));

		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonio_totalParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonio_totalParametroGraficoUpdate"));


		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_patrimonio_totalParametroGraficoArbol"));



					
		this.jLabelid_cuenta_contable_ventaParametroGrafico = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaParametroGrafico.setText(""+ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaParametroGrafico.setToolTipText("Cuenta C. Venta");
		this.jLabelid_cuenta_contable_ventaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaParametroGrafico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaParametroGrafico.setToolTipText(ParametroGraficoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutParametroGrafico = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaParametroGrafico.setLayout(this.gridaBagLayoutParametroGrafico);


		jComboBoxid_cuenta_contable_ventaParametroGrafico= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaParametroGrafico= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaParametroGrafico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaParametroGrafico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaParametroGrafico"));

		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaParametroGraficoBusqueda"));

		if(this.parametrograficoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaParametroGraficoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaParametroGraficoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaParametroGraficoUpdate"));


		jButtonid_cuenta_contable_ventaParametroGraficoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaParametroGraficoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaParametroGraficoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaParametroGrafico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaParametroGraficoArbol"));



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
		//this.jInternalFrameDetalleParametroGrafico = new ParametroGraficoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Grafico DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGrafico= new GridBagLayout();
		

		
		String sToolTipParametroGrafico="";
		sToolTipParametroGrafico=ParametroGraficoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGrafico+="(Contabilidad.ParametroGrafico)";
		}
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGrafico+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroGrafico = new JButtonMe();
		this.jButtonModificarParametroGrafico = new JButtonMe();
        this.jButtonActualizarParametroGrafico = new JButtonMe();
        this.jButtonEliminarParametroGrafico = new JButtonMe();
        this.jButtonCancelarParametroGrafico = new JButtonMe();
        this.jButtonGuardarCambiosParametroGrafico = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroGrafico = new JButtonMe();
		this.jButtonCerrarParametroGrafico = new JButtonMe();
		
		this.jScrollPanelDatosParametroGrafico = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroGrafico = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroGrafico = new JScrollPane();
				
		
		
		this.jPanelCamposParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Grafico";
		
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Graficos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGrafico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroGrafico.setName("jPanelCamposParametroGrafico"); 

		this.jPanelCamposOcultosParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroGrafico.setName("jPanelCamposOcultosParametroGrafico"); 

        this.jPanelAccionesParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGrafico.setToolTipText("Acciones");
        this.jPanelAccionesParametroGrafico.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroGrafico.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroGrafico.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroGrafico.setText("Nuevo");
		this.jButtonModificarParametroGrafico.setText("Editar");
        this.jButtonActualizarParametroGrafico.setText("Actualizar");
        this.jButtonEliminarParametroGrafico.setText("Eliminar");
        this.jButtonCancelarParametroGrafico.setText("Cancelar");
        this.jButtonGuardarCambiosParametroGrafico.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroGrafico.setText("Guardar");
		this.jButtonCerrarParametroGrafico.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGrafico,"nuevo_button","Nuevo",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroGrafico,"modificar_button","Editar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroGrafico,"actualizar_button","Actualizar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroGrafico,"eliminar_button","Eliminar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroGrafico,"cancelar_button","Cancelar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroGrafico,"guardarcambios_button","Guardar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGrafico,"guardarcambiostabla_button","Guardar",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGrafico,"cerrar_button","Salir",this.parametrograficoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroGrafico.setToolTipText("Nuevo"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroGrafico.setToolTipText("Editar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroGrafico.setToolTipText("Actualizar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroGrafico.setToolTipText("Eliminar)"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroGrafico.setToolTipText("Cancelar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroGrafico.setToolTipText("Guardar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroGrafico.setToolTipText("Guardar"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGrafico.setToolTipText("Salir"+" "+ParametroGraficoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGrafico";
		inputMap = this.jButtonNuevoParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGrafico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGrafico"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroGrafico";
		inputMap = this.jButtonActualizarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroGrafico"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroGrafico";
		inputMap = this.jButtonEliminarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroGrafico"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroGrafico";
		inputMap = this.jButtonCancelarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroGrafico"));
		
		//CERRAR		
		sMapKey = "CerrarParametroGrafico";
		inputMap = this.jButtonCerrarParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGrafico"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGrafico";
		inputMap = this.jButtonGuardarCambiosTablaParametroGrafico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGrafico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGrafico"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroGrafico.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroGrafico.setToolTipText("Nuevo ParametroGrafico");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroGrafico.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroGrafico.setToolTipText("Sin Cerrar Ventana ParametroGrafico");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroGrafico = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroGrafico.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroGrafico.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGrafico.setText("Accion");
		this.jComboBoxTiposAccionesParametroGrafico.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroGrafico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroGrafico.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroGrafico.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroGrafico = new JLabelMe();
		
		this.jLabelAccionesParametroGrafico.setText("Acciones");		
		this.jLabelAccionesParametroGrafico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGrafico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGrafico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroGrafico();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroGrafico();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroGrafico=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroGrafico,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroGrafico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGrafico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGrafico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGrafico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroGrafico.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGrafico.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGrafico.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroGrafico, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroGrafico = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroGrafico = new GridBagLayout();
		
		this.jPanelCamposParametroGrafico.setLayout(gridaBagLayoutCamposParametroGrafico);
		this.jPanelCamposOcultosParametroGrafico.setLayout(gridaBagLayoutCamposOcultosParametroGrafico);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroGrafico.add(jLabelIdParametroGrafico, this.gridBagConstraintsParametroGrafico);



	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroGrafico.add(jLabelidParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroGrafico.add(jLabelid_empresaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 2;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGrafico.add(jButtonid_empresaParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 3;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGrafico.add(jButtonid_empresaParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroGrafico.add(jComboBoxid_empresaParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_activoParametroGrafico.add(jLabelid_cuenta_contable_activoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activoParametroGrafico.add(jButtonid_cuenta_contable_activoParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activoParametroGrafico.add(jButtonid_cuenta_contable_activoParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activoParametroGrafico.add(jButtonid_cuenta_contable_activoParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activoParametroGrafico.add(jButtonid_cuenta_contable_activoParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_activoParametroGrafico.add(jComboBoxid_cuenta_contable_activoParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jLabelid_cuenta_contable_pasivoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jButtonid_cuenta_contable_pasivoParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jButtonid_cuenta_contable_pasivoParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jButtonid_cuenta_contable_pasivoParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jButtonid_cuenta_contable_pasivoParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_pasivoParametroGrafico.add(jComboBoxid_cuenta_contable_pasivoParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jLabelid_cuenta_contable_inventarioParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jButtonid_cuenta_contable_inventarioParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jButtonid_cuenta_contable_inventarioParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jButtonid_cuenta_contable_inventarioParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jButtonid_cuenta_contable_inventarioParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioParametroGrafico.add(jComboBoxid_cuenta_contable_inventarioParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jLabelid_cuenta_contable_disponibilidadParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jButtonid_cuenta_contable_disponibilidadParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jButtonid_cuenta_contable_disponibilidadParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jButtonid_cuenta_contable_disponibilidadParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jButtonid_cuenta_contable_disponibilidadParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_disponibilidadParametroGrafico.add(jComboBoxid_cuenta_contable_disponibilidadParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jLabelid_cuenta_contable_costo_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jButtonid_cuenta_contable_costo_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jButtonid_cuenta_contable_costo_ventaParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jButtonid_cuenta_contable_costo_ventaParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jButtonid_cuenta_contable_costo_ventaParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_ventaParametroGrafico.add(jComboBoxid_cuenta_contable_costo_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jLabelid_cuenta_contable_inventario_iniParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jButtonid_cuenta_contable_inventario_iniParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jButtonid_cuenta_contable_inventario_iniParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jButtonid_cuenta_contable_inventario_iniParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jButtonid_cuenta_contable_inventario_iniParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventario_iniParametroGrafico.add(jComboBoxid_cuenta_contable_inventario_iniParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jLabelid_cuenta_contable_inventario_finParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jButtonid_cuenta_contable_inventario_finParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jButtonid_cuenta_contable_inventario_finParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jButtonid_cuenta_contable_inventario_finParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jButtonid_cuenta_contable_inventario_finParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventario_finParametroGrafico.add(jComboBoxid_cuenta_contable_inventario_finParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jLabelid_cuenta_contable_cuenta_cobrarParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jButtonid_cuenta_contable_cuenta_cobrarParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jButtonid_cuenta_contable_cuenta_cobrarParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico.add(jComboBoxid_cuenta_contable_cuenta_cobrarParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jLabelid_cuenta_contable_venta_creditoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jButtonid_cuenta_contable_venta_creditoParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jButtonid_cuenta_contable_venta_creditoParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jButtonid_cuenta_contable_venta_creditoParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jButtonid_cuenta_contable_venta_creditoParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_venta_creditoParametroGrafico.add(jComboBoxid_cuenta_contable_venta_creditoParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jLabelid_cuenta_contable_activo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jButtonid_cuenta_contable_activo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jButtonid_cuenta_contable_activo_totalParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jButtonid_cuenta_contable_activo_totalParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jButtonid_cuenta_contable_activo_totalParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_activo_totalParametroGrafico.add(jComboBoxid_cuenta_contable_activo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jLabelid_cuenta_contable_pasivo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jButtonid_cuenta_contable_pasivo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jButtonid_cuenta_contable_pasivo_totalParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jButtonid_cuenta_contable_pasivo_totalParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jButtonid_cuenta_contable_pasivo_totalParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico.add(jComboBoxid_cuenta_contable_pasivo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jLabelid_cuenta_contable_patrimonioParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jButtonid_cuenta_contable_patrimonioParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jButtonid_cuenta_contable_patrimonioParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jButtonid_cuenta_contable_patrimonioParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jButtonid_cuenta_contable_patrimonioParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_patrimonioParametroGrafico.add(jComboBoxid_cuenta_contable_patrimonioParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jLabelid_cuenta_contable_patrimonio_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jButtonid_cuenta_contable_patrimonio_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jButtonid_cuenta_contable_patrimonio_totalParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jButtonid_cuenta_contable_patrimonio_totalParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jButtonid_cuenta_contable_patrimonio_totalParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico.add(jComboBoxid_cuenta_contable_patrimonio_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jLabelid_cuenta_contable_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 2;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jButtonid_cuenta_contable_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 3;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jButtonid_cuenta_contable_ventaParametroGraficoArbol, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 4;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jButtonid_cuenta_contable_ventaParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 5;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jButtonid_cuenta_contable_ventaParametroGraficoUpdate, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaParametroGrafico.add(jComboBoxid_cuenta_contable_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);


	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 0;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinventario_inicialParametroGrafico.add(jLabelinventario_inicialParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = 2;
		this.gridBagConstraintsParametroGrafico.ipadx = 0;
		this.gridBagConstraintsParametroGrafico.insets = new Insets(0, 0, 0, 0);
		this.jPanelinventario_inicialParametroGrafico.add(jButtoninventario_inicialParametroGraficoBusqueda, this.gridBagConstraintsParametroGrafico);
	}

	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGrafico.gridy = 0;
	this.gridBagConstraintsParametroGrafico.gridx = 1;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinventario_inicialParametroGrafico.add(jTextFieldinventario_inicialParametroGrafico, this.gridBagConstraintsParametroGrafico);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelidParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_activoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_pasivoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_inventarioParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_disponibilidadParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_costo_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_inventario_iniParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_inventario_finParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_cuenta_cobrarParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_venta_creditoParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_activo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_pasivo_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_patrimonioParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_patrimonio_totalParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelid_cuenta_contable_ventaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGrafico.add(this.jPanelinventario_inicialParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposParametroGrafico % 1==0) {
		iXPanelCamposParametroGrafico=0;
		iYPanelCamposParametroGrafico++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGrafico.gridy = iYPanelCamposOcultosParametroGrafico;
	this.gridBagConstraintsParametroGrafico.gridx = iXPanelCamposOcultosParametroGrafico++;
	this.gridBagConstraintsParametroGrafico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGrafico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroGrafico.add(this.jPanelid_empresaParametroGrafico, this.gridBagConstraintsParametroGrafico);



	if(iXPanelCamposOcultosParametroGrafico % 1==0) {
		iXPanelCamposOcultosParametroGrafico=0;
		iYPanelCamposOcultosParametroGrafico++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroGrafico= new GridBagLayout();
		this.jPanelAccionesParametroGrafico.setLayout(gridaBagLayoutAccionesParametroGrafico);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroGrafico= new GridBagLayout();
		this.jPanelAccionesFormularioParametroGrafico.setLayout(gridaBagLayoutAccionesFormularioParametroGrafico);
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGrafico.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGrafico.add(this.jComboBoxTiposAccionesFormularioParametroGrafico, this.gridBagConstraintsParametroGrafico);

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGrafico.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGrafico.add(this.jCheckBoxPostAccionNuevoParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrograficoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGrafico.add(this.jCheckBoxPostAccionSinCerrarParametroGrafico, this.gridBagConstraintsParametroGrafico);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrograficoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrograficoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGrafico.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGrafico.add(this.jCheckBoxPostAccionSinMensajeParametroGrafico, this.gridBagConstraintsParametroGrafico);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroGrafico.add(this.jButtonModificarParametroGrafico, this.gridBagConstraintsParametroGrafico);							

		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGrafico.gridy = 0;
		this.gridBagConstraintsParametroGrafico.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroGrafico.add(this.jButtonEliminarParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = 0;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGrafico.add(this.jButtonActualizarParametroGrafico, this.gridBagConstraintsParametroGrafico);


		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = 0;		
		this.gridBagConstraintsParametroGrafico.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGrafico.add(this.jButtonGuardarCambiosParametroGrafico, this.gridBagConstraintsParametroGrafico);	
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = 0;		
		this.gridBagConstraintsParametroGrafico.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroGrafico.add(this.jButtonCancelarParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGrafico = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGrafico);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrograficoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();						
			this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGrafico.gridx = 0;		
			//this.gridBagConstraintsParametroGrafico.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGrafico.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGrafico.gridx =0;
		this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGrafico.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGrafico, this.gridBagConstraintsParametroGrafico);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroGraficoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroGrafico = new ParametroGraficoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Grafico DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Grafico DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Grafico Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGraficoModel parametrograficoModel=new ParametroGraficoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGraficoModel.ParametroGraficoFocusTraversalPolicy parametrograficoFocusTraversalPolicy = parametrograficoModel.new ParametroGraficoFocusTraversalPolicy(this);
			
			//parametrograficoFocusTraversalPolicy.setparametrograficoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrograficoModel);
			
			
			this.jContentPaneDetalleParametroGrafico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroGrafico = new GridBagLayout();	
			this.jContentPaneDetalleParametroGrafico.setLayout(gridaBagLayoutDetalleParametroGrafico);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGrafico = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
				this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroGrafico.gridx = 0;
					
				
				this.jContentPaneDetalleParametroGrafico.add(jTtoolBarDetalleParametroGrafico, gridBagConstraintsParametroGrafico);								
				
}
			
			this.jScrollPanelDatosEdicionParametroGrafico=   new JScrollPane(jContentPaneDetalleParametroGrafico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGrafico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGrafico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGrafico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroGrafico=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGrafico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGrafico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGrafico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroGrafico.gridx = 0;
	        
			this.jContentPaneDetalleParametroGrafico.add(jPanelCamposParametroGrafico, gridBagConstraintsParametroGrafico);
			
			
			
			
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
						&& parametrograficoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrograficoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroGrafico= new GridBagConstraints();
						this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroGrafico.gridx = 0;
						this.jContentPaneDetalleParametroGrafico.add(this.jTabbedPaneRelacionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGrafico.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroGrafico.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
					this.gridBagConstraintsParametroGrafico.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroGrafico.gridx = 0;
					
				
					this.jContentPaneDetalleParametroGrafico.add(jPanelCamposOcultosParametroGrafico, gridBagConstraintsParametroGrafico);
				
					this.jPanelCamposOcultosParametroGrafico.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroGrafico.gridx = 0;
	        this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroGrafico.add(this.jPanelAccionesFormularioParametroGrafico, this.gridBagConstraintsParametroGrafico);							
			
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
	        this.gridBagConstraintsParametroGrafico.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroGrafico.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroGrafico.add(this.jPanelAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroGrafico);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroGrafico=   new JScrollPane(this.jPanelCamposParametroGrafico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGrafico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGrafico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGrafico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroGrafico.gridx = 0;
			this.gridBagConstraintsParametroGrafico.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroGrafico.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroGrafico.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGrafico.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroGrafico, this.gridBagConstraintsParametroGrafico);			
			
			this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
			this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGrafico.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGrafico, this.gridBagConstraintsParametroGrafico);
			
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGrafico, this.gridBagConstraintsParametroGrafico);
		
			
		this.gridBagConstraintsParametroGrafico = new GridBagConstraints();
		this.gridBagConstraintsParametroGrafico.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGrafico.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGrafico, this.gridBagConstraintsParametroGrafico);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroGrafico;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroGrafico;
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
