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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.NegocioClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class NegocioClienteDetalleFormJInternalFrame extends NegocioClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNegocioCliente;
	
	protected JMenuBar jmenuBarDetalleNegocioCliente;
	
	protected JMenu jmenuDetalleNegocioCliente;
	protected JMenu jmenuDetalleArchivoNegocioCliente;
	protected JMenu jmenuDetalleAccionesNegocioCliente;
	protected JMenu jmenuDetalleDatosNegocioCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNegocioCliente;	
	protected GridBagConstraints gridBagConstraintsNegocioCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NegocioClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleNegocioCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoUbicacionNegocioBeanSwingJInternalFrame tipoubicacionnegocioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoubicacionnegocio="";
	
	public NegocioClienteSessionBean negocioclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean;	
	
	public NegocioClienteLogic negocioclienteLogic;
	
	public JScrollPane jScrollPanelDatosNegocioCliente;
	public JScrollPane jScrollPanelDatosEdicionNegocioCliente;
	public JScrollPane jScrollPanelDatosGeneralNegocioCliente;
	
	protected JPanel jPanelCamposNegocioCliente;    
	protected JPanel jPanelCamposOcultosNegocioCliente;    	
	protected JPanel jPanelAccionesNegocioCliente;
	protected JPanel jPanelAccionesFormularioNegocioCliente;
    
	
	
	protected Integer iXPanelCamposNegocioCliente=0;
	protected Integer iYPanelCamposNegocioCliente=0;
	
	protected Integer iXPanelCamposOcultosNegocioCliente=0;
	protected Integer iYPanelCamposOcultosNegocioCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNegocioCliente;
	public JButton jButtonModificarNegocioCliente;
	public JButton jButtonActualizarNegocioCliente;
    public JButton jButtonEliminarNegocioCliente;
	public JButton jButtonCancelarNegocioCliente;
    public JButton jButtonGuardarCambiosNegocioCliente;
	public JButton jButtonGuardarCambiosTablaNegocioCliente;
	protected JButton jButtonCerrarNegocioCliente;
	
	
	protected JButton jButtonProcesarInformacionNegocioCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNegocioCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNegocioCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNegocioCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNegocioCliente;
	protected JButton jButtonModificarToolBarNegocioCliente;
	protected JButton jButtonActualizarToolBarNegocioCliente;
    protected JButton jButtonEliminarToolBarNegocioCliente;
	protected JButton jButtonCancelarToolBarNegocioCliente;
    protected JButton jButtonGuardarCambiosToolBarNegocioCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarNegocioCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarNegocioCliente;
	protected JButton jButtonCerrarToolBarNegocioCliente;
	
	protected JButton jButtonProcesarInformacionToolBarNegocioCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNegocioCliente;
	protected JMenuItem jMenuItemModificarNegocioCliente;
	protected JMenuItem jMenuItemActualizarNegocioCliente;
    protected JMenuItem jMenuItemEliminarNegocioCliente;
	protected JMenuItem jMenuItemCancelarNegocioCliente;
    protected JMenuItem jMenuItemGuardarCambiosNegocioCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaNegocioCliente;
	protected JMenuItem jMenuItemCerrarNegocioCliente;
	protected JMenuItem jMenuItemDetalleCerrarNegocioCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarNegocioCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionNegocioCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNegocioCliente;
	protected JMenuItem jMenuItemMostrarOcultarNegocioCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNegocioCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNegocioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNegocioCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNegocioCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNegocioCliente;
	public JLabel jLabelIdNegocioCliente;
	public JLabel jLabelidNegocioCliente;
	public JButton jButtonidNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_quien_se_facturaNegocioCliente;
	public JLabel jLabelnombre_quien_se_facturaNegocioCliente;
	public JTextArea jTextAreanombre_quien_se_facturaNegocioCliente;
	public JScrollPane jscrollPanenombre_quien_se_facturaNegocioCliente;
	public JButton jButtonnombre_quien_se_facturaNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelfaxNegocioCliente;
	public JLabel jLabelfaxNegocioCliente;
	public JTextField jTextFieldfaxNegocioCliente;
	public JButton jButtonfaxNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelrucNegocioCliente;
	public JLabel jLabelrucNegocioCliente;
	public JTextField jTextFieldrucNegocioCliente;
	public JButton jButtonrucNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoNegocioCliente;
	public JLabel jLabeltelefonoNegocioCliente;
	public JTextField jTextFieldtelefonoNegocioCliente;
	public JButton jButtontelefonoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_localNegocioCliente;
	public JLabel jLabelnombre_localNegocioCliente;
	public JTextArea jTextAreanombre_localNegocioCliente;
	public JScrollPane jscrollPanenombre_localNegocioCliente;
	public JButton jButtonnombre_localNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanele_mailNegocioCliente;
	public JLabel jLabele_mailNegocioCliente;
	public JTextField jTextFielde_mailNegocioCliente;
	public JButton jButtone_mailNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneldireccionNegocioCliente;
	public JLabel jLabeldireccionNegocioCliente;
	public JTextArea jTextAreadireccionNegocioCliente;
	public JScrollPane jscrollPanedireccionNegocioCliente;
	public JButton jButtondireccionNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_local_propioNegocioCliente;
	public JLabel jLabeles_local_propioNegocioCliente;
	public JCheckBox jCheckBoxes_local_propioNegocioCliente;
	public JButton jButtones_local_propioNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_aniosNegocioCliente;
	public JLabel jLabelnumero_aniosNegocioCliente;
	public JTextField jTextFieldnumero_aniosNegocioCliente;
	public JButton jButtonnumero_aniosNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mesesNegocioCliente;
	public JLabel jLabelnumero_mesesNegocioCliente;
	public JTextField jTextFieldnumero_mesesNegocioCliente;
	public JButton jButtonnumero_mesesNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelempleados_fijosNegocioCliente;
	public JLabel jLabelempleados_fijosNegocioCliente;
	public JTextField jTextFieldempleados_fijosNegocioCliente;
	public JButton jButtonempleados_fijosNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelempleado_temporalesNegocioCliente;
	public JLabel jLabelempleado_temporalesNegocioCliente;
	public JTextField jTextFieldempleado_temporalesNegocioCliente;
	public JButton jButtonempleado_temporalesNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelempleados_totalNegocioCliente;
	public JLabel jLabelempleados_totalNegocioCliente;
	public JTextField jTextFieldempleados_totalNegocioCliente;
	public JButton jButtonempleados_totalNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ventas_contadoNegocioCliente;
	public JLabel jLabelporcentaje_ventas_contadoNegocioCliente;
	public JTextField jTextFieldporcentaje_ventas_contadoNegocioCliente;
	public JButton jButtonporcentaje_ventas_contadoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ventas_creditoNegocioCliente;
	public JLabel jLabelporcentaje_ventas_creditoNegocioCliente;
	public JTextField jTextFieldporcentaje_ventas_creditoNegocioCliente;
	public JButton jButtonporcentaje_ventas_creditoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelplazo_diasNegocioCliente;
	public JLabel jLabelplazo_diasNegocioCliente;
	public JTextField jTextFieldplazo_diasNegocioCliente;
	public JButton jButtonplazo_diasNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_clientesNegocioCliente;
	public JLabel jLabelnumero_clientesNegocioCliente;
	public JTextField jTextFieldnumero_clientesNegocioCliente;
	public JButton jButtonnumero_clientesNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelmonto_maximo_ventas_mensualNegocioCliente;
	public JLabel jLabelmonto_maximo_ventas_mensualNegocioCliente;
	public JTextField jTextFieldmonto_maximo_ventas_mensualNegocioCliente;
	public JButton jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimo_ventas_mensualNegocioCliente;
	public JLabel jLabelmonto_minimo_ventas_mensualNegocioCliente;
	public JTextField jTextFieldmonto_minimo_ventas_mensualNegocioCliente;
	public JButton jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_enero_altoNegocioCliente;
	public JLabel jLabeles_enero_altoNegocioCliente;
	public JCheckBox jCheckBoxes_enero_altoNegocioCliente;
	public JButton jButtones_enero_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_febrero_altoNegocioCliente;
	public JLabel jLabeles_febrero_altoNegocioCliente;
	public JCheckBox jCheckBoxes_febrero_altoNegocioCliente;
	public JButton jButtones_febrero_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_marzo_altoNegocioCliente;
	public JLabel jLabeles_marzo_altoNegocioCliente;
	public JCheckBox jCheckBoxes_marzo_altoNegocioCliente;
	public JButton jButtones_marzo_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_abril_altoNegocioCliente;
	public JLabel jLabeles_abril_altoNegocioCliente;
	public JCheckBox jCheckBoxes_abril_altoNegocioCliente;
	public JButton jButtones_abril_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_mayo_altoNegocioCliente;
	public JLabel jLabeles_mayo_altoNegocioCliente;
	public JCheckBox jCheckBoxes_mayo_altoNegocioCliente;
	public JButton jButtones_mayo_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_junio_altoNegocioCliente;
	public JLabel jLabeles_junio_altoNegocioCliente;
	public JCheckBox jCheckBoxes_junio_altoNegocioCliente;
	public JButton jButtones_junio_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_julio_altoNegocioCliente;
	public JLabel jLabeles_julio_altoNegocioCliente;
	public JCheckBox jCheckBoxes_julio_altoNegocioCliente;
	public JButton jButtones_julio_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_agosto_altoNegocioCliente;
	public JLabel jLabeles_agosto_altoNegocioCliente;
	public JCheckBox jCheckBoxes_agosto_altoNegocioCliente;
	public JButton jButtones_agosto_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_septiembre_altoNegocioCliente;
	public JLabel jLabeles_septiembre_altoNegocioCliente;
	public JCheckBox jCheckBoxes_septiembre_altoNegocioCliente;
	public JButton jButtones_septiembre_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_octubre_altoNegocioCliente;
	public JLabel jLabeles_octubre_altoNegocioCliente;
	public JCheckBox jCheckBoxes_octubre_altoNegocioCliente;
	public JButton jButtones_octubre_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_noviembre_altoNegocioCliente;
	public JLabel jLabeles_noviembre_altoNegocioCliente;
	public JCheckBox jCheckBoxes_noviembre_altoNegocioCliente;
	public JButton jButtones_noviembre_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_diciembre_altoNegocioCliente;
	public JLabel jLabeles_diciembre_altoNegocioCliente;
	public JCheckBox jCheckBoxes_diciembre_altoNegocioCliente;
	public JButton jButtones_diciembre_altoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_enero_bajoNegocioCliente;
	public JLabel jLabeles_enero_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_enero_bajoNegocioCliente;
	public JButton jButtones_enero_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_febrero_bajoNegocioCliente;
	public JLabel jLabeles_febrero_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_febrero_bajoNegocioCliente;
	public JButton jButtones_febrero_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_marzo_bajoNegocioCliente;
	public JLabel jLabeles_marzo_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_marzo_bajoNegocioCliente;
	public JButton jButtones_marzo_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_abril_bajoNegocioCliente;
	public JLabel jLabeles_abril_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_abril_bajoNegocioCliente;
	public JButton jButtones_abril_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_mayo_bajoNegocioCliente;
	public JLabel jLabeles_mayo_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_mayo_bajoNegocioCliente;
	public JButton jButtones_mayo_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_junio_bajoNegocioCliente;
	public JLabel jLabeles_junio_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_junio_bajoNegocioCliente;
	public JButton jButtones_junio_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_julio_bajoNegocioCliente;
	public JLabel jLabeles_julio_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_julio_bajoNegocioCliente;
	public JButton jButtones_julio_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_agosto_bajoNegocioCliente;
	public JLabel jLabeles_agosto_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_agosto_bajoNegocioCliente;
	public JButton jButtones_agosto_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_septiembre_bajoNegocioCliente;
	public JLabel jLabeles_septiembre_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_septiembre_bajoNegocioCliente;
	public JButton jButtones_septiembre_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_octubre_bajoNegocioCliente;
	public JLabel jLabeles_octubre_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_octubre_bajoNegocioCliente;
	public JButton jButtones_octubre_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_noviembre_bajoNegocioCliente;
	public JLabel jLabeles_noviembre_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_noviembre_bajoNegocioCliente;
	public JButton jButtones_noviembre_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_diciembre_bajoNegocioCliente;
	public JLabel jLabeles_diciembre_bajoNegocioCliente;
	public JCheckBox jCheckBoxes_diciembre_bajoNegocioCliente;
	public JButton jButtones_diciembre_bajoNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNegocioCliente;
	public JLabel jLabeldescripcionNegocioCliente;
	public JTextArea jTextAreadescripcionNegocioCliente;
	public JScrollPane jscrollPanedescripcionNegocioCliente;
	public JButton jButtondescripcionNegocioClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNegocioCliente;
	public JLabel jLabelid_empresaNegocioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNegocioCliente;
	public JButton jButtonid_empresaNegocioCliente= new JButtonMe();
	public JButton jButtonid_empresaNegocioClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteNegocioCliente;
	public JLabel jLabelid_clienteNegocioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteNegocioCliente;
	public JButton jButtonid_clienteNegocioCliente= new JButtonMe();
	public JButton jButtonid_clienteNegocioClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteNegocioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ubicacion_negocioNegocioCliente;
	public JLabel jLabelid_tipo_ubicacion_negocioNegocioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ubicacion_negocioNegocioCliente;
	public JButton jButtonid_tipo_ubicacion_negocioNegocioCliente= new JButtonMe();
	public JButton jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNegocioCliente;
	
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
	public int iHeightFormulario=1496;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NegocioClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNegocioCliente=new JPanel();
				this.jPanelAccionesFormularioNegocioCliente=new JPanel();
				this.jmenuBarDetalleNegocioCliente=new JMenuBar();
				this.jTtoolBarDetalleNegocioCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NegocioClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNegocioCliente() {
		return this.jButtonActualizarToolBarNegocioCliente;
	}
	
	public JButton getjButtonEliminarToolBarNegocioCliente() {
		return this.jButtonEliminarToolBarNegocioCliente;
	}
	
	public JButton getjButtonCancelarToolBarNegocioCliente() {
		return this.jButtonCancelarToolBarNegocioCliente;
	}		
	
	public JButton getjButtonProcesarInformacionNegocioCliente() {
		return this.jButtonProcesarInformacionNegocioCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNegocioCliente)	{
		this.jButtonProcesarInformacionNegocioCliente = jButtonProcesarInformacionNegocioCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNegocioCliente() {
		return this.jComboBoxTiposAccionesNegocioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNegocioCliente(
			JComboBox jComboBoxTiposRelacionesNegocioCliente) {
		this.jComboBoxTiposRelacionesNegocioCliente = jComboBoxTiposRelacionesNegocioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNegocioCliente(
			JComboBox jComboBoxTiposAccionesNegocioCliente) {
		this.jComboBoxTiposAccionesNegocioCliente = jComboBoxTiposAccionesNegocioCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNegocioCliente() {
		return this.jComboBoxTiposAccionesFormularioNegocioCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNegocioCliente(
			JComboBox jComboBoxTiposAccionesFormularioNegocioCliente) {
		this.jComboBoxTiposAccionesFormularioNegocioCliente = jComboBoxTiposAccionesFormularioNegocioCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.negocioclienteSessionBean=new NegocioClienteSessionBean();
		
		this.negocioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.negocioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.negocioclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NegocioClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Negocio Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 4850) {
			iWidth=4850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		NegocioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNegocioCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNegocioCliente=new JButtonMe();
				this.jButtonModificarToolBarNegocioCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNegocioCliente,this.jTtoolBarDetalleNegocioCliente,
							"actualizar","actualizar","Actualizar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNegocioCliente,this.jTtoolBarDetalleNegocioCliente,
							"eliminar","eliminar","Eliminar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNegocioCliente,this.jTtoolBarDetalleNegocioCliente,
							"cancelar","cancelar","Cancelar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNegocioCliente,this.jTtoolBarDetalleNegocioCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNegocioCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNegocioCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNegocioCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNegocioCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNegocioCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNegocioCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNegocioCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNegocioCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNegocioCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNegocioCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNegocioCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNegocioCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNegocioCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNegocioCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNegocioCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNegocioCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNegocioCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNegocioCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNegocioCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNegocioCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNegocioCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNegocioCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNegocioCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNegocioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNegocioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNegocioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNegocioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNegocioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNegocioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNegocioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNegocioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNegocioCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNegocioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNegocioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNegocioCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNegocioCliente.add(this.jMenuItemDetalleCerrarNegocioCliente);
		
		this.jmenuDetalleAccionesNegocioCliente.add(this.jMenuItemActualizarNegocioCliente);
		this.jmenuDetalleAccionesNegocioCliente.add(this.jMenuItemEliminarNegocioCliente);
		this.jmenuDetalleAccionesNegocioCliente.add(this.jMenuItemCancelarNegocioCliente);		
		
		//this.jmenuDetalleDatosNegocioCliente.add(this.jMenuItemDetalleAbrirOrderByNegocioCliente);				
		this.jmenuDetalleDatosNegocioCliente.add(this.jMenuItemDetalleMostarOcultarNegocioCliente);				
				
		//this.jmenuDetalleAccionesNegocioCliente.add(this.jMenuItemGuardarCambiosNegocioCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNegocioCliente.add(this.jmenuDetalleArchivoNegocioCliente);		
		this.jmenuBarDetalleNegocioCliente.add(this.jmenuDetalleAccionesNegocioCliente);		
		this.jmenuBarDetalleNegocioCliente.add(this.jmenuDetalleDatosNegocioCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNegocioCliente);				
	}
	
	
	public void inicializarElementosCamposNegocioCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNegocioCliente = new JLabelMe();
		jLabelIdNegocioCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNegocioCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNegocioCliente= new GridBagLayout();

		this.jPanelidNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);

		jLabelidNegocioCliente = new JLabel();
		jLabelidNegocioCliente.setText("Id");

		jLabelidNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_quien_se_facturaNegocioCliente = new JLabelMe();
		this.jLabelnombre_quien_se_facturaNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_NOMBREQUIENSEFACTURA+" : *");
		this.jLabelnombre_quien_se_facturaNegocioCliente.setToolTipText("Nombre Quien Se Factura");
		this.jLabelnombre_quien_se_facturaNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_quien_se_facturaNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_quien_se_facturaNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_quien_se_facturaNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_quien_se_facturaNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_quien_se_facturaNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_NOMBREQUIENSEFACTURA);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelnombre_quien_se_facturaNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextAreanombre_quien_se_facturaNegocioCliente= new JTextAreaMe();
		jTextAreanombre_quien_se_facturaNegocioCliente.setEnabled(false);
		jTextAreanombre_quien_se_facturaNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_quien_se_facturaNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_quien_se_facturaNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_quien_se_facturaNegocioCliente.setLineWrap(true);
		jTextAreanombre_quien_se_facturaNegocioCliente.setWrapStyleWord(true);
		jTextAreanombre_quien_se_facturaNegocioCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_quien_se_facturaNegocioCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_quien_se_facturaNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_quien_se_facturaNegocioCliente = new JScrollPane(jTextAreanombre_quien_se_facturaNegocioCliente);
		jscrollPanenombre_quien_se_facturaNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_quien_se_facturaNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_quien_se_facturaNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda= new JButtonMe();
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setText("U");
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_quien_se_facturaNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_quien_se_facturaNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_quien_se_facturaNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_quien_se_facturaNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelfaxNegocioCliente = new JLabelMe();
		this.jLabelfaxNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_FAX+" : *");
		this.jLabelfaxNegocioCliente.setToolTipText("Fax");
		this.jLabelfaxNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfaxNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfaxNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfaxNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_FAX);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelfaxNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldfaxNegocioCliente= new JTextFieldMe();

		jTextFieldfaxNegocioCliente.setEnabled(false);
		jTextFieldfaxNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfaxNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfaxNegocioClienteBusqueda= new JButtonMe();
		this.jButtonfaxNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfaxNegocioClienteBusqueda.setText("U");
		this.jButtonfaxNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfaxNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfaxNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfaxNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfaxNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"faxNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfaxNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelrucNegocioCliente = new JLabelMe();
		this.jLabelrucNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucNegocioCliente.setToolTipText("Ruc");
		this.jLabelrucNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelrucNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldrucNegocioCliente= new JTextFieldMe();

		jTextFieldrucNegocioCliente.setEnabled(false);
		jTextFieldrucNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucNegocioClienteBusqueda= new JButtonMe();
		this.jButtonrucNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucNegocioClienteBusqueda.setText("U");
		this.jButtonrucNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoNegocioCliente = new JLabelMe();
		this.jLabeltelefonoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoNegocioCliente.setToolTipText("Telefono");
		this.jLabeltelefonoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneltelefonoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldtelefonoNegocioCliente= new JTextFieldMe();

		jTextFieldtelefonoNegocioCliente.setEnabled(false);
		jTextFieldtelefonoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoNegocioClienteBusqueda= new JButtonMe();
		this.jButtontelefonoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoNegocioClienteBusqueda.setText("U");
		this.jButtontelefonoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombre_localNegocioCliente = new JLabelMe();
		this.jLabelnombre_localNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_NOMBRELOCAL+" : *");
		this.jLabelnombre_localNegocioCliente.setToolTipText("Nombre Local");
		this.jLabelnombre_localNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_localNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_localNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_localNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_localNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_localNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_NOMBRELOCAL);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelnombre_localNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextAreanombre_localNegocioCliente= new JTextAreaMe();
		jTextAreanombre_localNegocioCliente.setEnabled(false);
		jTextAreanombre_localNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_localNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_localNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_localNegocioCliente.setLineWrap(true);
		jTextAreanombre_localNegocioCliente.setWrapStyleWord(true);
		jTextAreanombre_localNegocioCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_localNegocioCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_localNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_localNegocioCliente = new JScrollPane(jTextAreanombre_localNegocioCliente);
		jscrollPanenombre_localNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_localNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_localNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_localNegocioClienteBusqueda= new JButtonMe();
		this.jButtonnombre_localNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_localNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_localNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_localNegocioClienteBusqueda.setText("U");
		this.jButtonnombre_localNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_localNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_localNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_localNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_localNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_localNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_localNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabele_mailNegocioCliente = new JLabelMe();
		this.jLabele_mailNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabele_mailNegocioCliente.setToolTipText("E Mail");
		this.jLabele_mailNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanele_mailNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFielde_mailNegocioCliente= new JTextFieldMe();

		jTextFielde_mailNegocioCliente.setEnabled(false);
		jTextFielde_mailNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielde_mailNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielde_mailNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielde_mailNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtone_mailNegocioClienteBusqueda= new JButtonMe();
		this.jButtone_mailNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailNegocioClienteBusqueda.setText("U");
		this.jButtone_mailNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielde_mailNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielde_mailNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeldireccionNegocioCliente = new JLabelMe();
		this.jLabeldireccionNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionNegocioCliente.setToolTipText("Direccion");
		this.jLabeldireccionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneldireccionNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextAreadireccionNegocioCliente= new JTextAreaMe();
		jTextAreadireccionNegocioCliente.setEnabled(false);
		jTextAreadireccionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNegocioCliente.setLineWrap(true);
		jTextAreadireccionNegocioCliente.setWrapStyleWord(true);
		jTextAreadireccionNegocioCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionNegocioCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionNegocioCliente = new JScrollPane(jTextAreadireccionNegocioCliente);
		jscrollPanedireccionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionNegocioClienteBusqueda= new JButtonMe();
		this.jButtondireccionNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionNegocioClienteBusqueda.setText("U");
		this.jButtondireccionNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_local_propioNegocioCliente = new JLabelMe();
		this.jLabeles_local_propioNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESLOCALPROPIO+" : *");
		this.jLabeles_local_propioNegocioCliente.setToolTipText("Es Local Propio");
		this.jLabeles_local_propioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_local_propioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_local_propioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_local_propioNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_local_propioNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_local_propioNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESLOCALPROPIO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_local_propioNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_local_propioNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_local_propioNegocioCliente.setEnabled(false);

		jCheckBoxes_local_propioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_local_propioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_local_propioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_local_propioNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_local_propioNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_local_propioNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_local_propioNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_local_propioNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_local_propioNegocioClienteBusqueda.setText("U");
		this.jButtones_local_propioNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_local_propioNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_local_propioNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_local_propioNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_local_propioNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_local_propioNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_local_propioNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_aniosNegocioCliente = new JLabelMe();
		this.jLabelnumero_aniosNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_NUMEROANIOS+" : *");
		this.jLabelnumero_aniosNegocioCliente.setToolTipText("Numero Anios");
		this.jLabelnumero_aniosNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_aniosNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_aniosNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_aniosNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_aniosNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_aniosNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_NUMEROANIOS);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelnumero_aniosNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldnumero_aniosNegocioCliente= new JTextFieldMe();
		jTextFieldnumero_aniosNegocioCliente.setEnabled(false);
		jTextFieldnumero_aniosNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_aniosNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_aniosNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_aniosNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_aniosNegocioCliente.setText("0");

		this.jButtonnumero_aniosNegocioClienteBusqueda= new JButtonMe();
		this.jButtonnumero_aniosNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_aniosNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_aniosNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_aniosNegocioClienteBusqueda.setText("U");
		this.jButtonnumero_aniosNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_aniosNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_aniosNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_aniosNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_aniosNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_aniosNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_aniosNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mesesNegocioCliente = new JLabelMe();
		this.jLabelnumero_mesesNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_NUMEROMESES+" : *");
		this.jLabelnumero_mesesNegocioCliente.setToolTipText("Numero Meses");
		this.jLabelnumero_mesesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mesesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mesesNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mesesNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_NUMEROMESES);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelnumero_mesesNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldnumero_mesesNegocioCliente= new JTextFieldMe();
		jTextFieldnumero_mesesNegocioCliente.setEnabled(false);
		jTextFieldnumero_mesesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mesesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_mesesNegocioCliente.setText("0");

		this.jButtonnumero_mesesNegocioClienteBusqueda= new JButtonMe();
		this.jButtonnumero_mesesNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mesesNegocioClienteBusqueda.setText("U");
		this.jButtonnumero_mesesNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mesesNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mesesNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mesesNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mesesNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mesesNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mesesNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelempleados_fijosNegocioCliente = new JLabelMe();
		this.jLabelempleados_fijosNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_EMPLEADOSFIJOS+" : *");
		this.jLabelempleados_fijosNegocioCliente.setToolTipText("Empleados Fijos");
		this.jLabelempleados_fijosNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleados_fijosNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleados_fijosNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelempleados_fijosNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempleados_fijosNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempleados_fijosNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_EMPLEADOSFIJOS);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelempleados_fijosNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldempleados_fijosNegocioCliente= new JTextFieldMe();
		jTextFieldempleados_fijosNegocioCliente.setEnabled(false);
		jTextFieldempleados_fijosNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleados_fijosNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleados_fijosNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldempleados_fijosNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldempleados_fijosNegocioCliente.setText("0");

		this.jButtonempleados_fijosNegocioClienteBusqueda= new JButtonMe();
		this.jButtonempleados_fijosNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleados_fijosNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleados_fijosNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempleados_fijosNegocioClienteBusqueda.setText("U");
		this.jButtonempleados_fijosNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempleados_fijosNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempleados_fijosNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldempleados_fijosNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldempleados_fijosNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empleados_fijosNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempleados_fijosNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelempleado_temporalesNegocioCliente = new JLabelMe();
		this.jLabelempleado_temporalesNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_EMPLEADOTEMPORALES+" : *");
		this.jLabelempleado_temporalesNegocioCliente.setToolTipText("Empleado Temporales");
		this.jLabelempleado_temporalesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleado_temporalesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleado_temporalesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelempleado_temporalesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempleado_temporalesNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempleado_temporalesNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_EMPLEADOTEMPORALES);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelempleado_temporalesNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldempleado_temporalesNegocioCliente= new JTextFieldMe();
		jTextFieldempleado_temporalesNegocioCliente.setEnabled(false);
		jTextFieldempleado_temporalesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleado_temporalesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleado_temporalesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldempleado_temporalesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldempleado_temporalesNegocioCliente.setText("0");

		this.jButtonempleado_temporalesNegocioClienteBusqueda= new JButtonMe();
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempleado_temporalesNegocioClienteBusqueda.setText("U");
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempleado_temporalesNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldempleado_temporalesNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldempleado_temporalesNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empleado_temporalesNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempleado_temporalesNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelempleados_totalNegocioCliente = new JLabelMe();
		this.jLabelempleados_totalNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_EMPLEADOSTOTAL+" : *");
		this.jLabelempleados_totalNegocioCliente.setToolTipText("Empleados Total");
		this.jLabelempleados_totalNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleados_totalNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempleados_totalNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelempleados_totalNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempleados_totalNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempleados_totalNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_EMPLEADOSTOTAL);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelempleados_totalNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldempleados_totalNegocioCliente= new JTextFieldMe();
		jTextFieldempleados_totalNegocioCliente.setEnabled(false);
		jTextFieldempleados_totalNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleados_totalNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldempleados_totalNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldempleados_totalNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldempleados_totalNegocioCliente.setText("0");

		this.jButtonempleados_totalNegocioClienteBusqueda= new JButtonMe();
		this.jButtonempleados_totalNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleados_totalNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempleados_totalNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempleados_totalNegocioClienteBusqueda.setText("U");
		this.jButtonempleados_totalNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempleados_totalNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempleados_totalNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldempleados_totalNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldempleados_totalNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empleados_totalNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempleados_totalNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ventas_contadoNegocioCliente = new JLabelMe();
		this.jLabelporcentaje_ventas_contadoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCONTADO+" : *");
		this.jLabelporcentaje_ventas_contadoNegocioCliente.setToolTipText("Porcentaje Ventas Contado");
		this.jLabelporcentaje_ventas_contadoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_ventas_contadoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_ventas_contadoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ventas_contadoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ventas_contadoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ventas_contadoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCONTADO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelporcentaje_ventas_contadoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldporcentaje_ventas_contadoNegocioCliente= new JTextFieldMe();
		jTextFieldporcentaje_ventas_contadoNegocioCliente.setEnabled(false);
		jTextFieldporcentaje_ventas_contadoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ventas_contadoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ventas_contadoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ventas_contadoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ventas_contadoNegocioCliente.setText("0.0");

		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda= new JButtonMe();
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setText("U");
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ventas_contadoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ventas_contadoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ventas_contadoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ventas_contadoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ventas_creditoNegocioCliente = new JLabelMe();
		this.jLabelporcentaje_ventas_creditoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCREDITO+" : *");
		this.jLabelporcentaje_ventas_creditoNegocioCliente.setToolTipText("Porcentaje Ventas Credito");
		this.jLabelporcentaje_ventas_creditoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_ventas_creditoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_ventas_creditoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ventas_creditoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ventas_creditoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ventas_creditoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCREDITO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelporcentaje_ventas_creditoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldporcentaje_ventas_creditoNegocioCliente= new JTextFieldMe();
		jTextFieldporcentaje_ventas_creditoNegocioCliente.setEnabled(false);
		jTextFieldporcentaje_ventas_creditoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ventas_creditoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ventas_creditoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ventas_creditoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ventas_creditoNegocioCliente.setText("0.0");

		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda= new JButtonMe();
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setText("U");
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ventas_creditoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ventas_creditoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ventas_creditoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ventas_creditoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelplazo_diasNegocioCliente = new JLabelMe();
		this.jLabelplazo_diasNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_PLAZODIAS+" : *");
		this.jLabelplazo_diasNegocioCliente.setToolTipText("Plazo Dias");
		this.jLabelplazo_diasNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazo_diasNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazo_diasNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplazo_diasNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplazo_diasNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplazo_diasNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_PLAZODIAS);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelplazo_diasNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldplazo_diasNegocioCliente= new JTextFieldMe();
		jTextFieldplazo_diasNegocioCliente.setEnabled(false);
		jTextFieldplazo_diasNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazo_diasNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazo_diasNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplazo_diasNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldplazo_diasNegocioCliente.setText("0");

		this.jButtonplazo_diasNegocioClienteBusqueda= new JButtonMe();
		this.jButtonplazo_diasNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazo_diasNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazo_diasNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplazo_diasNegocioClienteBusqueda.setText("U");
		this.jButtonplazo_diasNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplazo_diasNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplazo_diasNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplazo_diasNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplazo_diasNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"plazo_diasNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplazo_diasNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_clientesNegocioCliente = new JLabelMe();
		this.jLabelnumero_clientesNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_NUMEROCLIENTES+" : *");
		this.jLabelnumero_clientesNegocioCliente.setToolTipText("Numero Clientes");
		this.jLabelnumero_clientesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_clientesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_clientesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_clientesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_clientesNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_clientesNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_NUMEROCLIENTES);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelnumero_clientesNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldnumero_clientesNegocioCliente= new JTextFieldMe();
		jTextFieldnumero_clientesNegocioCliente.setEnabled(false);
		jTextFieldnumero_clientesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_clientesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_clientesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_clientesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_clientesNegocioCliente.setText("0");

		this.jButtonnumero_clientesNegocioClienteBusqueda= new JButtonMe();
		this.jButtonnumero_clientesNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_clientesNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_clientesNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_clientesNegocioClienteBusqueda.setText("U");
		this.jButtonnumero_clientesNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_clientesNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_clientesNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_clientesNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_clientesNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_clientesNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_clientesNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente = new JLabelMe();
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_MONTOMAXIMOVENTASMENSUAL+" : *");
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente.setToolTipText("Monto Maximo Ventas Mensual");
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelmonto_maximo_ventas_mensualNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_maximo_ventas_mensualNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_maximo_ventas_mensualNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_maximo_ventas_mensualNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_MONTOMAXIMOVENTASMENSUAL);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelmonto_maximo_ventas_mensualNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldmonto_maximo_ventas_mensualNegocioCliente= new JTextFieldMe();
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.setEnabled(false);
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_maximo_ventas_mensualNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.setText("0.0");

		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda= new JButtonMe();
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setText("U");
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_maximo_ventas_mensualNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_maximo_ventas_mensualNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente = new JLabelMe();
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_MONTOMINIMOVENTASMENSUAL+" : *");
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente.setToolTipText("Monto Minimo Ventas Mensual");
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelmonto_minimo_ventas_mensualNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimo_ventas_mensualNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimo_ventas_mensualNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimo_ventas_mensualNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_MONTOMINIMOVENTASMENSUAL);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelmonto_minimo_ventas_mensualNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextFieldmonto_minimo_ventas_mensualNegocioCliente= new JTextFieldMe();
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.setEnabled(false);
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimo_ventas_mensualNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.setText("0.0");

		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda= new JButtonMe();
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setText("U");
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimo_ventas_mensualNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimo_ventas_mensualNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_enero_altoNegocioCliente = new JLabelMe();
		this.jLabeles_enero_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESENEROALTO+" : *");
		this.jLabeles_enero_altoNegocioCliente.setToolTipText("Es Enero Alto");
		this.jLabeles_enero_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_enero_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_enero_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_enero_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_enero_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_enero_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESENEROALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_enero_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_enero_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_enero_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_enero_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_enero_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_enero_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_enero_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_enero_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_enero_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_enero_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_enero_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_enero_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_enero_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_enero_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_enero_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_enero_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_enero_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_enero_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_enero_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_febrero_altoNegocioCliente = new JLabelMe();
		this.jLabeles_febrero_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESFEBREROALTO+" : *");
		this.jLabeles_febrero_altoNegocioCliente.setToolTipText("Es Febrero Alto");
		this.jLabeles_febrero_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_febrero_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_febrero_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_febrero_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_febrero_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_febrero_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESFEBREROALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_febrero_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_febrero_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_febrero_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_febrero_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_febrero_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_febrero_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_febrero_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_febrero_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_febrero_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_febrero_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_febrero_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_febrero_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_febrero_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_febrero_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_febrero_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_febrero_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_febrero_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_febrero_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_febrero_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_marzo_altoNegocioCliente = new JLabelMe();
		this.jLabeles_marzo_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESMARZOALTO+" : *");
		this.jLabeles_marzo_altoNegocioCliente.setToolTipText("Es Marzo Alto");
		this.jLabeles_marzo_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_marzo_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_marzo_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_marzo_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_marzo_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_marzo_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESMARZOALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_marzo_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_marzo_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_marzo_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_marzo_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_marzo_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_marzo_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_marzo_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_marzo_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_marzo_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_marzo_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_marzo_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_marzo_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_marzo_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_marzo_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_marzo_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_marzo_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_marzo_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_marzo_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_marzo_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_abril_altoNegocioCliente = new JLabelMe();
		this.jLabeles_abril_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESABRILALTO+" : *");
		this.jLabeles_abril_altoNegocioCliente.setToolTipText("Es Abril Alto");
		this.jLabeles_abril_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_abril_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_abril_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_abril_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_abril_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_abril_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESABRILALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_abril_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_abril_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_abril_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_abril_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_abril_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_abril_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_abril_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_abril_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_abril_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_abril_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_abril_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_abril_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_abril_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_abril_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_abril_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_abril_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_abril_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_abril_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_abril_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_mayo_altoNegocioCliente = new JLabelMe();
		this.jLabeles_mayo_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESMAYOALTO+" : *");
		this.jLabeles_mayo_altoNegocioCliente.setToolTipText("Es Mayo Alto");
		this.jLabeles_mayo_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayo_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayo_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_mayo_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_mayo_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_mayo_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESMAYOALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_mayo_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_mayo_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_mayo_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_mayo_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayo_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayo_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_mayo_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_mayo_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_mayo_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayo_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayo_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_mayo_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_mayo_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_mayo_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_mayo_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_mayo_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_mayo_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_mayo_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_mayo_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_junio_altoNegocioCliente = new JLabelMe();
		this.jLabeles_junio_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESJUNIOALTO+" : *");
		this.jLabeles_junio_altoNegocioCliente.setToolTipText("Es Junio Alto");
		this.jLabeles_junio_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_junio_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_junio_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_junio_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_junio_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_junio_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESJUNIOALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_junio_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_junio_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_junio_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_junio_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_junio_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_junio_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_junio_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_junio_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_junio_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_junio_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_junio_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_junio_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_junio_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_junio_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_junio_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_junio_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_junio_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_junio_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_junio_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_julio_altoNegocioCliente = new JLabelMe();
		this.jLabeles_julio_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESJULIOALTO+" : *");
		this.jLabeles_julio_altoNegocioCliente.setToolTipText("Es Julio Alto");
		this.jLabeles_julio_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_julio_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_julio_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_julio_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_julio_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_julio_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESJULIOALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_julio_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_julio_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_julio_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_julio_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_julio_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_julio_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_julio_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_julio_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_julio_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_julio_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_julio_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_julio_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_julio_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_julio_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_julio_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_julio_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_julio_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_julio_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_julio_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_agosto_altoNegocioCliente = new JLabelMe();
		this.jLabeles_agosto_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESAGOSTOALTO+" : *");
		this.jLabeles_agosto_altoNegocioCliente.setToolTipText("Es Agosto Alto");
		this.jLabeles_agosto_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_agosto_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_agosto_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_agosto_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_agosto_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_agosto_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESAGOSTOALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_agosto_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_agosto_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_agosto_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_agosto_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_agosto_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_agosto_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_agosto_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_agosto_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_agosto_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_agosto_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_agosto_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_agosto_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_agosto_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_agosto_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_agosto_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_agosto_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_agosto_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_agosto_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_agosto_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_septiembre_altoNegocioCliente = new JLabelMe();
		this.jLabeles_septiembre_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREALTO+" : *");
		this.jLabeles_septiembre_altoNegocioCliente.setToolTipText("Es Septiembre Alto");
		this.jLabeles_septiembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_septiembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_septiembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_septiembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_septiembre_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_septiembre_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_septiembre_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_septiembre_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_septiembre_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_septiembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_septiembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_septiembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_septiembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_septiembre_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_septiembre_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_septiembre_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_septiembre_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_septiembre_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_septiembre_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_septiembre_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_octubre_altoNegocioCliente = new JLabelMe();
		this.jLabeles_octubre_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESOCTUBREALTO+" : *");
		this.jLabeles_octubre_altoNegocioCliente.setToolTipText("Es Octubre Alto");
		this.jLabeles_octubre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_octubre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_octubre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_octubre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_octubre_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_octubre_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESOCTUBREALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_octubre_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_octubre_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_octubre_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_octubre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_octubre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_octubre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_octubre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_octubre_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_octubre_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_octubre_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_octubre_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_octubre_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_octubre_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_octubre_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_octubre_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_octubre_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_octubre_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_octubre_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_octubre_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_noviembre_altoNegocioCliente = new JLabelMe();
		this.jLabeles_noviembre_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREALTO+" : *");
		this.jLabeles_noviembre_altoNegocioCliente.setToolTipText("Es Noviembre Alto");
		this.jLabeles_noviembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_noviembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_noviembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_noviembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_noviembre_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_noviembre_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_noviembre_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_noviembre_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_noviembre_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_noviembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_noviembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_noviembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_noviembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_noviembre_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_noviembre_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_noviembre_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_noviembre_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_noviembre_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_noviembre_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_noviembre_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_diciembre_altoNegocioCliente = new JLabelMe();
		this.jLabeles_diciembre_altoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREALTO+" : *");
		this.jLabeles_diciembre_altoNegocioCliente.setToolTipText("Es Diciembre Alto");
		this.jLabeles_diciembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_diciembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_diciembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_diciembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_diciembre_altoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_diciembre_altoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREALTO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_diciembre_altoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_diciembre_altoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_diciembre_altoNegocioCliente.setEnabled(false);

		jCheckBoxes_diciembre_altoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_diciembre_altoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_diciembre_altoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_diciembre_altoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_diciembre_altoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_diciembre_altoNegocioClienteBusqueda.setText("U");
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_diciembre_altoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_diciembre_altoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_diciembre_altoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_diciembre_altoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_diciembre_altoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_enero_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_enero_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESENEROBAJO+" : *");
		this.jLabeles_enero_bajoNegocioCliente.setToolTipText("Es Enero Bajo");
		this.jLabeles_enero_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_enero_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_enero_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_enero_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_enero_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_enero_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESENEROBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_enero_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_enero_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_enero_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_enero_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_enero_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_enero_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_enero_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_enero_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_enero_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_enero_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_enero_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_enero_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_enero_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_enero_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_enero_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_enero_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_enero_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_enero_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_enero_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_febrero_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_febrero_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESFEBREROBAJO+" : *");
		this.jLabeles_febrero_bajoNegocioCliente.setToolTipText("Es Febrero Bajo");
		this.jLabeles_febrero_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_febrero_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_febrero_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_febrero_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_febrero_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_febrero_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESFEBREROBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_febrero_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_febrero_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_febrero_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_febrero_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_febrero_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_febrero_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_febrero_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_febrero_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_febrero_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_febrero_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_febrero_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_febrero_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_febrero_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_febrero_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_marzo_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_marzo_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESMARZOBAJO+" : *");
		this.jLabeles_marzo_bajoNegocioCliente.setToolTipText("Es Marzo Bajo");
		this.jLabeles_marzo_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_marzo_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_marzo_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_marzo_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_marzo_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_marzo_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESMARZOBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_marzo_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_marzo_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_marzo_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_marzo_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_marzo_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_marzo_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_marzo_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_marzo_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_marzo_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_marzo_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_marzo_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_marzo_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_marzo_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_marzo_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_abril_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_abril_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESABRILBAJO+" : *");
		this.jLabeles_abril_bajoNegocioCliente.setToolTipText("Es Abril Bajo");
		this.jLabeles_abril_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_abril_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_abril_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_abril_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_abril_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_abril_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESABRILBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_abril_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_abril_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_abril_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_abril_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_abril_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_abril_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_abril_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_abril_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_abril_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_abril_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_abril_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_abril_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_abril_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_abril_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_abril_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_abril_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_abril_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_abril_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_abril_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_mayo_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_mayo_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESMAYOBAJO+" : *");
		this.jLabeles_mayo_bajoNegocioCliente.setToolTipText("Es Mayo Bajo");
		this.jLabeles_mayo_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayo_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayo_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_mayo_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_mayo_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_mayo_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESMAYOBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_mayo_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_mayo_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_mayo_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_mayo_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayo_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayo_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_mayo_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_mayo_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_mayo_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_mayo_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_mayo_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_mayo_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_mayo_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_mayo_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_junio_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_junio_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESJUNIOBAJO+" : *");
		this.jLabeles_junio_bajoNegocioCliente.setToolTipText("Es Junio Bajo");
		this.jLabeles_junio_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_junio_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_junio_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_junio_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_junio_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_junio_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESJUNIOBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_junio_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_junio_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_junio_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_junio_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_junio_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_junio_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_junio_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_junio_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_junio_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_junio_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_junio_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_junio_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_junio_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_junio_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_junio_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_junio_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_junio_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_junio_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_junio_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_julio_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_julio_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESJULIOBAJO+" : *");
		this.jLabeles_julio_bajoNegocioCliente.setToolTipText("Es Julio Bajo");
		this.jLabeles_julio_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_julio_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_julio_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_julio_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_julio_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_julio_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESJULIOBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_julio_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_julio_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_julio_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_julio_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_julio_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_julio_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_julio_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_julio_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_julio_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_julio_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_julio_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_julio_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_julio_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_julio_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_julio_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_julio_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_julio_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_julio_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_julio_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_agosto_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_agosto_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESAGOSTOBAJO+" : *");
		this.jLabeles_agosto_bajoNegocioCliente.setToolTipText("Es Agosto Bajo");
		this.jLabeles_agosto_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_agosto_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_agosto_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_agosto_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_agosto_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_agosto_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESAGOSTOBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_agosto_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_agosto_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_agosto_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_agosto_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_agosto_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_agosto_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_agosto_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_agosto_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_agosto_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_agosto_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_agosto_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_agosto_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_agosto_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_agosto_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_septiembre_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_septiembre_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREBAJO+" : *");
		this.jLabeles_septiembre_bajoNegocioCliente.setToolTipText("Es Septiembre Bajo");
		this.jLabeles_septiembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_septiembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_septiembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_septiembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_septiembre_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_septiembre_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_septiembre_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_septiembre_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_septiembre_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_septiembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_septiembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_septiembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_septiembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_septiembre_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_septiembre_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_septiembre_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_septiembre_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_septiembre_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_septiembre_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_septiembre_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_octubre_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_octubre_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESOCTUBREBAJO+" : *");
		this.jLabeles_octubre_bajoNegocioCliente.setToolTipText("Es Octubre Bajo");
		this.jLabeles_octubre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_octubre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_octubre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_octubre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_octubre_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_octubre_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESOCTUBREBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_octubre_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_octubre_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_octubre_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_octubre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_octubre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_octubre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_octubre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_octubre_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_octubre_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_octubre_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_octubre_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_octubre_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_octubre_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_octubre_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_noviembre_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_noviembre_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREBAJO+" : *");
		this.jLabeles_noviembre_bajoNegocioCliente.setToolTipText("Es Noviembre Bajo");
		this.jLabeles_noviembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_noviembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_noviembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_noviembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_noviembre_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_noviembre_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_noviembre_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_noviembre_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_noviembre_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_noviembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_noviembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_noviembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_noviembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_noviembre_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_noviembre_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_noviembre_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_noviembre_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_noviembre_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_noviembre_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_noviembre_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_diciembre_bajoNegocioCliente = new JLabelMe();
		this.jLabeles_diciembre_bajoNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREBAJO+" : *");
		this.jLabeles_diciembre_bajoNegocioCliente.setToolTipText("Es Diciembre Bajo");
		this.jLabeles_diciembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_diciembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_diciembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_diciembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_diciembre_bajoNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_diciembre_bajoNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREBAJO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneles_diciembre_bajoNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jCheckBoxes_diciembre_bajoNegocioCliente= new JCheckBoxMe();
		jCheckBoxes_diciembre_bajoNegocioCliente.setEnabled(false);

		jCheckBoxes_diciembre_bajoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_diciembre_bajoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_diciembre_bajoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_diciembre_bajoNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_diciembre_bajoNegocioClienteBusqueda= new JButtonMe();
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_diciembre_bajoNegocioClienteBusqueda.setText("U");
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_diciembre_bajoNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_diciembre_bajoNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_diciembre_bajoNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_diciembre_bajoNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_diciembre_bajoNegocioClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNegocioCliente = new JLabelMe();
		this.jLabeldescripcionNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionNegocioCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPaneldescripcionNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jTextAreadescripcionNegocioCliente= new JTextAreaMe();
		jTextAreadescripcionNegocioCliente.setEnabled(false);
		jTextAreadescripcionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNegocioCliente.setLineWrap(true);
		jTextAreadescripcionNegocioCliente.setWrapStyleWord(true);
		jTextAreadescripcionNegocioCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNegocioCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNegocioCliente = new JScrollPane(jTextAreadescripcionNegocioCliente);
		jscrollPanedescripcionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionNegocioClienteBusqueda= new JButtonMe();
		this.jButtondescripcionNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNegocioClienteBusqueda.setText("U");
		this.jButtondescripcionNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNegocioClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNegocioCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNegocioCliente = new JLabelMe();
		this.jLabelid_empresaNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNegocioCliente.setToolTipText("Empresa");
		this.jLabelid_empresaNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelid_empresaNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jComboBoxid_empresaNegocioCliente= new JComboBoxMe();
		jComboBoxid_empresaNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNegocioCliente.setEnabled(false);

		this.jButtonid_empresaNegocioCliente= new JButtonMe();
		this.jButtonid_empresaNegocioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNegocioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNegocioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNegocioCliente.setText("Buscar");
		this.jButtonid_empresaNegocioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNegocioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNegocioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNegocioCliente"));

		this.jButtonid_empresaNegocioClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNegocioClienteBusqueda.setText("U");
		this.jButtonid_empresaNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNegocioClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaNegocioClienteUpdate= new JButtonMe();
		this.jButtonid_empresaNegocioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNegocioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNegocioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNegocioClienteUpdate.setText("U");
		this.jButtonid_empresaNegocioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNegocioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNegocioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNegocioClienteUpdate"));



					
		this.jLabelid_clienteNegocioCliente = new JLabelMe();
		this.jLabelid_clienteNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteNegocioCliente.setToolTipText("Cliente");
		this.jLabelid_clienteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelid_clienteNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jComboBoxid_clienteNegocioCliente= new JComboBoxMe();
		jComboBoxid_clienteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteNegocioCliente= new JButtonMe();
		this.jButtonid_clienteNegocioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNegocioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNegocioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNegocioCliente.setText("Buscar");
		this.jButtonid_clienteNegocioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteNegocioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNegocioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNegocioCliente"));

		this.jButtonid_clienteNegocioClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNegocioClienteBusqueda.setText("U");
		this.jButtonid_clienteNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteNegocioClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteNegocioClienteUpdate= new JButtonMe();
		this.jButtonid_clienteNegocioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNegocioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNegocioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNegocioClienteUpdate.setText("U");
		this.jButtonid_clienteNegocioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteNegocioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNegocioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNegocioClienteUpdate"));



					
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente = new JLabelMe();
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente.setText(""+NegocioClienteConstantesFunciones.LABEL_IDTIPOUBICACIONNEGOCIO+" : *");
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente.setToolTipText("Tipo Ubicacion Negocio");
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ubicacion_negocioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ubicacion_negocioNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ubicacion_negocioNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ubicacion_negocioNegocioCliente.setToolTipText(NegocioClienteConstantesFunciones.LABEL_IDTIPOUBICACIONNEGOCIO);
		this.gridaBagLayoutNegocioCliente = new GridBagLayout();
		this.jPanelid_tipo_ubicacion_negocioNegocioCliente.setLayout(this.gridaBagLayoutNegocioCliente);


		jComboBoxid_tipo_ubicacion_negocioNegocioCliente= new JComboBoxMe();
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ubicacion_negocioNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ubicacion_negocioNegocioCliente= new JButtonMe();
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setText("Buscar");
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ubicacion_negocioNegocioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ubicacion_negocioNegocioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ubicacion_negocioNegocioCliente"));

		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setText("U");
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ubicacion_negocioNegocioClienteBusqueda"));

		if(this.negocioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setText("U");
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ubicacion_negocioNegocioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ubicacion_negocioNegocioClienteUpdate"));



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
		//this.jInternalFrameDetalleNegocioCliente = new NegocioClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Negocio Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNegocioCliente= new GridBagLayout();
		

		
		String sToolTipNegocioCliente="";
		sToolTipNegocioCliente=NegocioClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNegocioCliente+="(Cartera.NegocioCliente)";
		}
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipNegocioCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNegocioCliente = new JButtonMe();
		this.jButtonModificarNegocioCliente = new JButtonMe();
        this.jButtonActualizarNegocioCliente = new JButtonMe();
        this.jButtonEliminarNegocioCliente = new JButtonMe();
        this.jButtonCancelarNegocioCliente = new JButtonMe();
        this.jButtonGuardarCambiosNegocioCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaNegocioCliente = new JButtonMe();
		this.jButtonCerrarNegocioCliente = new JButtonMe();
		
		this.jScrollPanelDatosNegocioCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionNegocioCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralNegocioCliente = new JScrollPane();
				
		
		
		this.jPanelCamposNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Negocio Cliente";
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosNegocioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNegocioCliente.setName("jPanelCamposNegocioCliente"); 

		this.jPanelCamposOcultosNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNegocioCliente.setName("jPanelCamposOcultosNegocioCliente"); 

        this.jPanelAccionesNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNegocioCliente.setToolTipText("Acciones");
        this.jPanelAccionesNegocioCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNegocioCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNegocioCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNegocioCliente.setText("Nuevo");
		this.jButtonModificarNegocioCliente.setText("Editar");
        this.jButtonActualizarNegocioCliente.setText("Actualizar");
        this.jButtonEliminarNegocioCliente.setText("Eliminar");
        this.jButtonCancelarNegocioCliente.setText("Cancelar");
        this.jButtonGuardarCambiosNegocioCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaNegocioCliente.setText("Guardar");
		this.jButtonCerrarNegocioCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNegocioCliente,"nuevo_button","Nuevo",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNegocioCliente,"modificar_button","Editar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNegocioCliente,"actualizar_button","Actualizar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNegocioCliente,"eliminar_button","Eliminar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNegocioCliente,"cancelar_button","Cancelar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNegocioCliente,"guardarcambios_button","Guardar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNegocioCliente,"guardarcambiostabla_button","Guardar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNegocioCliente,"cerrar_button","Salir",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNegocioCliente.setToolTipText("Nuevo"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNegocioCliente.setToolTipText("Editar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNegocioCliente.setToolTipText("Actualizar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNegocioCliente.setToolTipText("Eliminar)"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNegocioCliente.setToolTipText("Cancelar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNegocioCliente.setToolTipText("Guardar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNegocioCliente.setToolTipText("Guardar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNegocioCliente.setToolTipText("Salir"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNegocioCliente";
		inputMap = this.jButtonNuevoNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNegocioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNegocioCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNegocioCliente";
		inputMap = this.jButtonActualizarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNegocioCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarNegocioCliente";
		inputMap = this.jButtonEliminarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNegocioCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarNegocioCliente";
		inputMap = this.jButtonCancelarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNegocioCliente"));
		
		//CERRAR		
		sMapKey = "CerrarNegocioCliente";
		inputMap = this.jButtonCerrarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNegocioCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNegocioCliente";
		inputMap = this.jButtonGuardarCambiosTablaNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNegocioCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNegocioCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNegocioCliente.setToolTipText("Nuevo NegocioCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNegocioCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNegocioCliente.setToolTipText("Sin Cerrar Ventana NegocioCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNegocioCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNegocioCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNegocioCliente.setText("Accion");
		this.jComboBoxTiposAccionesNegocioCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNegocioCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNegocioCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNegocioCliente = new JLabelMe();
		
		this.jLabelAccionesNegocioCliente.setText("Acciones");		
		this.jLabelAccionesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNegocioCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNegocioCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNegocioCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNegocioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNegocioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNegocioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNegocioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNegocioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNegocioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNegocioCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNegocioCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNegocioCliente = new GridBagLayout();
		
		this.jPanelCamposNegocioCliente.setLayout(gridaBagLayoutCamposNegocioCliente);
		this.jPanelCamposOcultosNegocioCliente.setLayout(gridaBagLayoutCamposOcultosNegocioCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNegocioCliente.add(jLabelIdNegocioCliente, this.gridBagConstraintsNegocioCliente);



	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNegocioCliente.add(jLabelidNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNegocioCliente.add(jLabelid_empresaNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNegocioCliente.add(jButtonid_empresaNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 3;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNegocioCliente.add(jButtonid_empresaNegocioClienteUpdate, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNegocioCliente.add(jComboBoxid_empresaNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteNegocioCliente.add(jLabelid_clienteNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 2;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteNegocioCliente.add(jButtonid_clienteNegocioCliente, this.gridBagConstraintsNegocioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 3;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNegocioCliente.add(jButtonid_clienteNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 4;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNegocioCliente.add(jButtonid_clienteNegocioClienteUpdate, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteNegocioCliente.add(jComboBoxid_clienteNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_quien_se_facturaNegocioCliente.add(jLabelnombre_quien_se_facturaNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_quien_se_facturaNegocioCliente.add(jButtonnombre_quien_se_facturaNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_quien_se_facturaNegocioCliente.add(jscrollPanenombre_quien_se_facturaNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfaxNegocioCliente.add(jLabelfaxNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfaxNegocioCliente.add(jButtonfaxNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfaxNegocioCliente.add(jTextFieldfaxNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucNegocioCliente.add(jLabelrucNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucNegocioCliente.add(jButtonrucNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucNegocioCliente.add(jTextFieldrucNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoNegocioCliente.add(jLabeltelefonoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoNegocioCliente.add(jButtontelefonoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoNegocioCliente.add(jTextFieldtelefonoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_localNegocioCliente.add(jLabelnombre_localNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_localNegocioCliente.add(jButtonnombre_localNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_localNegocioCliente.add(jscrollPanenombre_localNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailNegocioCliente.add(jLabele_mailNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailNegocioCliente.add(jButtone_mailNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailNegocioCliente.add(jTextFielde_mailNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionNegocioCliente.add(jLabeldireccionNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionNegocioCliente.add(jButtondireccionNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionNegocioCliente.add(jscrollPanedireccionNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_local_propioNegocioCliente.add(jLabeles_local_propioNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_local_propioNegocioCliente.add(jButtones_local_propioNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_local_propioNegocioCliente.add(jCheckBoxes_local_propioNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_aniosNegocioCliente.add(jLabelnumero_aniosNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_aniosNegocioCliente.add(jButtonnumero_aniosNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_aniosNegocioCliente.add(jTextFieldnumero_aniosNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mesesNegocioCliente.add(jLabelnumero_mesesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mesesNegocioCliente.add(jButtonnumero_mesesNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mesesNegocioCliente.add(jTextFieldnumero_mesesNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ubicacion_negocioNegocioCliente.add(jLabelid_tipo_ubicacion_negocioNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ubicacion_negocioNegocioCliente.add(jButtonid_tipo_ubicacion_negocioNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 3;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ubicacion_negocioNegocioCliente.add(jButtonid_tipo_ubicacion_negocioNegocioClienteUpdate, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ubicacion_negocioNegocioCliente.add(jComboBoxid_tipo_ubicacion_negocioNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempleados_fijosNegocioCliente.add(jLabelempleados_fijosNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelempleados_fijosNegocioCliente.add(jButtonempleados_fijosNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempleados_fijosNegocioCliente.add(jTextFieldempleados_fijosNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempleado_temporalesNegocioCliente.add(jLabelempleado_temporalesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelempleado_temporalesNegocioCliente.add(jButtonempleado_temporalesNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempleado_temporalesNegocioCliente.add(jTextFieldempleado_temporalesNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempleados_totalNegocioCliente.add(jLabelempleados_totalNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelempleados_totalNegocioCliente.add(jButtonempleados_totalNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempleados_totalNegocioCliente.add(jTextFieldempleados_totalNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ventas_contadoNegocioCliente.add(jLabelporcentaje_ventas_contadoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ventas_contadoNegocioCliente.add(jButtonporcentaje_ventas_contadoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ventas_contadoNegocioCliente.add(jTextFieldporcentaje_ventas_contadoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ventas_creditoNegocioCliente.add(jLabelporcentaje_ventas_creditoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ventas_creditoNegocioCliente.add(jButtonporcentaje_ventas_creditoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ventas_creditoNegocioCliente.add(jTextFieldporcentaje_ventas_creditoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelplazo_diasNegocioCliente.add(jLabelplazo_diasNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelplazo_diasNegocioCliente.add(jButtonplazo_diasNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelplazo_diasNegocioCliente.add(jTextFieldplazo_diasNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_clientesNegocioCliente.add(jLabelnumero_clientesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_clientesNegocioCliente.add(jButtonnumero_clientesNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_clientesNegocioCliente.add(jTextFieldnumero_clientesNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_maximo_ventas_mensualNegocioCliente.add(jLabelmonto_maximo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_maximo_ventas_mensualNegocioCliente.add(jButtonmonto_maximo_ventas_mensualNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_maximo_ventas_mensualNegocioCliente.add(jTextFieldmonto_maximo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimo_ventas_mensualNegocioCliente.add(jLabelmonto_minimo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimo_ventas_mensualNegocioCliente.add(jButtonmonto_minimo_ventas_mensualNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimo_ventas_mensualNegocioCliente.add(jTextFieldmonto_minimo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_enero_altoNegocioCliente.add(jLabeles_enero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_enero_altoNegocioCliente.add(jButtones_enero_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_enero_altoNegocioCliente.add(jCheckBoxes_enero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_febrero_altoNegocioCliente.add(jLabeles_febrero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_febrero_altoNegocioCliente.add(jButtones_febrero_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_febrero_altoNegocioCliente.add(jCheckBoxes_febrero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_marzo_altoNegocioCliente.add(jLabeles_marzo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_marzo_altoNegocioCliente.add(jButtones_marzo_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_marzo_altoNegocioCliente.add(jCheckBoxes_marzo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_abril_altoNegocioCliente.add(jLabeles_abril_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_abril_altoNegocioCliente.add(jButtones_abril_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_abril_altoNegocioCliente.add(jCheckBoxes_abril_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_mayo_altoNegocioCliente.add(jLabeles_mayo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_mayo_altoNegocioCliente.add(jButtones_mayo_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_mayo_altoNegocioCliente.add(jCheckBoxes_mayo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_junio_altoNegocioCliente.add(jLabeles_junio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_junio_altoNegocioCliente.add(jButtones_junio_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_junio_altoNegocioCliente.add(jCheckBoxes_junio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_julio_altoNegocioCliente.add(jLabeles_julio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_julio_altoNegocioCliente.add(jButtones_julio_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_julio_altoNegocioCliente.add(jCheckBoxes_julio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_agosto_altoNegocioCliente.add(jLabeles_agosto_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_agosto_altoNegocioCliente.add(jButtones_agosto_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_agosto_altoNegocioCliente.add(jCheckBoxes_agosto_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_septiembre_altoNegocioCliente.add(jLabeles_septiembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_septiembre_altoNegocioCliente.add(jButtones_septiembre_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_septiembre_altoNegocioCliente.add(jCheckBoxes_septiembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_octubre_altoNegocioCliente.add(jLabeles_octubre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_octubre_altoNegocioCliente.add(jButtones_octubre_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_octubre_altoNegocioCliente.add(jCheckBoxes_octubre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_noviembre_altoNegocioCliente.add(jLabeles_noviembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_noviembre_altoNegocioCliente.add(jButtones_noviembre_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_noviembre_altoNegocioCliente.add(jCheckBoxes_noviembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_diciembre_altoNegocioCliente.add(jLabeles_diciembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_diciembre_altoNegocioCliente.add(jButtones_diciembre_altoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_diciembre_altoNegocioCliente.add(jCheckBoxes_diciembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_enero_bajoNegocioCliente.add(jLabeles_enero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_enero_bajoNegocioCliente.add(jButtones_enero_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_enero_bajoNegocioCliente.add(jCheckBoxes_enero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_febrero_bajoNegocioCliente.add(jLabeles_febrero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_febrero_bajoNegocioCliente.add(jButtones_febrero_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_febrero_bajoNegocioCliente.add(jCheckBoxes_febrero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_marzo_bajoNegocioCliente.add(jLabeles_marzo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_marzo_bajoNegocioCliente.add(jButtones_marzo_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_marzo_bajoNegocioCliente.add(jCheckBoxes_marzo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_abril_bajoNegocioCliente.add(jLabeles_abril_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_abril_bajoNegocioCliente.add(jButtones_abril_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_abril_bajoNegocioCliente.add(jCheckBoxes_abril_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_mayo_bajoNegocioCliente.add(jLabeles_mayo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_mayo_bajoNegocioCliente.add(jButtones_mayo_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_mayo_bajoNegocioCliente.add(jCheckBoxes_mayo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_junio_bajoNegocioCliente.add(jLabeles_junio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_junio_bajoNegocioCliente.add(jButtones_junio_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_junio_bajoNegocioCliente.add(jCheckBoxes_junio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_julio_bajoNegocioCliente.add(jLabeles_julio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_julio_bajoNegocioCliente.add(jButtones_julio_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_julio_bajoNegocioCliente.add(jCheckBoxes_julio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_agosto_bajoNegocioCliente.add(jLabeles_agosto_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_agosto_bajoNegocioCliente.add(jButtones_agosto_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_agosto_bajoNegocioCliente.add(jCheckBoxes_agosto_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_septiembre_bajoNegocioCliente.add(jLabeles_septiembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_septiembre_bajoNegocioCliente.add(jButtones_septiembre_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_septiembre_bajoNegocioCliente.add(jCheckBoxes_septiembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_octubre_bajoNegocioCliente.add(jLabeles_octubre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_octubre_bajoNegocioCliente.add(jButtones_octubre_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_octubre_bajoNegocioCliente.add(jCheckBoxes_octubre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_noviembre_bajoNegocioCliente.add(jLabeles_noviembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_noviembre_bajoNegocioCliente.add(jButtones_noviembre_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_noviembre_bajoNegocioCliente.add(jCheckBoxes_noviembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_diciembre_bajoNegocioCliente.add(jLabeles_diciembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_diciembre_bajoNegocioCliente.add(jButtones_diciembre_bajoNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_diciembre_bajoNegocioCliente.add(jCheckBoxes_diciembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);


	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 0;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNegocioCliente.add(jLabeldescripcionNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 2;
		this.gridBagConstraintsNegocioCliente.ipadx = 0;
		this.gridBagConstraintsNegocioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNegocioCliente.add(jButtondescripcionNegocioClienteBusqueda, this.gridBagConstraintsNegocioCliente);
	}

	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNegocioCliente.gridy = 0;
	this.gridBagConstraintsNegocioCliente.gridx = 1;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNegocioCliente.add(jscrollPanedescripcionNegocioCliente, this.gridBagConstraintsNegocioCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelidNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelid_clienteNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelnombre_quien_se_facturaNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelfaxNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelrucNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneltelefonoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelnombre_localNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanele_mailNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneldireccionNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_local_propioNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelnumero_aniosNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelnumero_mesesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelid_tipo_ubicacion_negocioNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelempleados_fijosNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelempleado_temporalesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelempleados_totalNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelporcentaje_ventas_contadoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelporcentaje_ventas_creditoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelplazo_diasNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelnumero_clientesNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelmonto_maximo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPanelmonto_minimo_ventas_mensualNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_enero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_febrero_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_marzo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_abril_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_mayo_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_junio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_julio_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_agosto_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_septiembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_octubre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_noviembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_diciembre_altoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_enero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_febrero_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_marzo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_abril_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_mayo_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_junio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_julio_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_agosto_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_septiembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_octubre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_noviembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneles_diciembre_bajoNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNegocioCliente.add(this.jPaneldescripcionNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposNegocioCliente % 2==0) {
		iXPanelCamposNegocioCliente=0;
		iYPanelCamposNegocioCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNegocioCliente.gridy = iYPanelCamposOcultosNegocioCliente;
	this.gridBagConstraintsNegocioCliente.gridx = iXPanelCamposOcultosNegocioCliente++;
	this.gridBagConstraintsNegocioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNegocioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNegocioCliente.add(this.jPanelid_empresaNegocioCliente, this.gridBagConstraintsNegocioCliente);



	if(iXPanelCamposOcultosNegocioCliente % 2==0) {
		iXPanelCamposOcultosNegocioCliente=0;
		iYPanelCamposOcultosNegocioCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesNegocioCliente= new GridBagLayout();
		this.jPanelAccionesNegocioCliente.setLayout(gridaBagLayoutAccionesNegocioCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNegocioCliente= new GridBagLayout();
		this.jPanelAccionesFormularioNegocioCliente.setLayout(gridaBagLayoutAccionesFormularioNegocioCliente);
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNegocioCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNegocioCliente.add(this.jComboBoxTiposAccionesFormularioNegocioCliente, this.gridBagConstraintsNegocioCliente);

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNegocioCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNegocioCliente.add(this.jCheckBoxPostAccionNuevoNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.negocioclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNegocioCliente.add(this.jCheckBoxPostAccionSinCerrarNegocioCliente, this.gridBagConstraintsNegocioCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.negocioclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNegocioCliente.add(this.jCheckBoxPostAccionSinMensajeNegocioCliente, this.gridBagConstraintsNegocioCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesNegocioCliente.add(this.jButtonModificarNegocioCliente, this.gridBagConstraintsNegocioCliente);							

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesNegocioCliente.add(this.jButtonEliminarNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = 0;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesNegocioCliente.add(this.jButtonActualizarNegocioCliente, this.gridBagConstraintsNegocioCliente);


		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = 0;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesNegocioCliente.add(this.jButtonGuardarCambiosNegocioCliente, this.gridBagConstraintsNegocioCliente);	
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = 0;		
		this.gridBagConstraintsNegocioCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesNegocioCliente.add(this.jButtonCancelarNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNegocioCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNegocioCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.negocioclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();						
			this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNegocioCliente.gridx = 0;		
			//this.gridBagConstraintsNegocioCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNegocioCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNegocioCliente.gridx =0;
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNegocioCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNegocioCliente, this.gridBagConstraintsNegocioCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NegocioClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNegocioCliente = new NegocioClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Negocio Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Negocio Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Negocio Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NegocioClienteModel negocioclienteModel=new NegocioClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//NegocioClienteModel.NegocioClienteFocusTraversalPolicy negocioclienteFocusTraversalPolicy = negocioclienteModel.new NegocioClienteFocusTraversalPolicy(this);
			
			//negocioclienteFocusTraversalPolicy.setnegocioclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(negocioclienteModel);
			
			
			this.jContentPaneDetalleNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNegocioCliente = new GridBagLayout();	
			this.jContentPaneDetalleNegocioCliente.setLayout(gridaBagLayoutDetalleNegocioCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNegocioCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
				this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNegocioCliente.gridx = 0;
					
				
				this.jContentPaneDetalleNegocioCliente.add(jTtoolBarDetalleNegocioCliente, gridBagConstraintsNegocioCliente);								
				
}
			
			this.jScrollPanelDatosEdicionNegocioCliente=   new JScrollPane(jContentPaneDetalleNegocioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNegocioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNegocioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNegocioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNegocioCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNegocioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNegocioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNegocioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNegocioCliente.gridx = 0;
	        
			this.jContentPaneDetalleNegocioCliente.add(jPanelCamposNegocioCliente, gridBagConstraintsNegocioCliente);
			
			
			
			
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
						&& negocioclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.negocioclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNegocioCliente= new GridBagConstraints();
						this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNegocioCliente.gridx = 0;
						this.jContentPaneDetalleNegocioCliente.add(this.jTabbedPaneRelacionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNegocioCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNegocioCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
					this.gridBagConstraintsNegocioCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNegocioCliente.gridx = 0;
					
				
					this.jContentPaneDetalleNegocioCliente.add(jPanelCamposOcultosNegocioCliente, gridBagConstraintsNegocioCliente);
				
					this.jPanelCamposOcultosNegocioCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNegocioCliente.gridx = 0;
	        this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNegocioCliente.add(this.jPanelAccionesFormularioNegocioCliente, this.gridBagConstraintsNegocioCliente);							
			
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
	        this.gridBagConstraintsNegocioCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNegocioCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleNegocioCliente.add(this.jPanelAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNegocioCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNegocioCliente=   new JScrollPane(this.jPanelCamposNegocioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNegocioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNegocioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNegocioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNegocioCliente.gridx = 0;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNegocioCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNegocioCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNegocioCliente, this.gridBagConstraintsNegocioCliente);			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNegocioCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNegocioCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionNegocioCliente;
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
