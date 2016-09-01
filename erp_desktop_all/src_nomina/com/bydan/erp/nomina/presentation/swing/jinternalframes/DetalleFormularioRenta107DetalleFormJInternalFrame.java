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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.DetalleFormularioRenta107ConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class DetalleFormularioRenta107DetalleFormJInternalFrame extends DetalleFormularioRenta107BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleFormularioRenta107;
	
	protected JMenuBar jmenuBarDetalleDetalleFormularioRenta107;
	
	protected JMenu jmenuDetalleDetalleFormularioRenta107;
	protected JMenu jmenuDetalleArchivoDetalleFormularioRenta107;
	protected JMenu jmenuDetalleAccionesDetalleFormularioRenta107;
	protected JMenu jmenuDetalleDatosDetalleFormularioRenta107;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFormularioRenta107;	
	protected GridBagConstraints gridBagConstraintsDetalleFormularioRenta107;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleFormularioRenta107BeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleFormularioRenta107;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormularioRenta107BeanSwingJInternalFrame formulariorenta107BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formulariorenta107="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public DetalleFormularioRenta107SessionBean detalleformulariorenta107SessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormularioRenta107SessionBean formulariorenta107SessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public DetalleFormularioRenta107Logic detalleformulariorenta107Logic;
	
	public JScrollPane jScrollPanelDatosDetalleFormularioRenta107;
	public JScrollPane jScrollPanelDatosEdicionDetalleFormularioRenta107;
	public JScrollPane jScrollPanelDatosGeneralDetalleFormularioRenta107;
	
	protected JPanel jPanelCamposDetalleFormularioRenta107;    
	protected JPanel jPanelCamposOcultosDetalleFormularioRenta107;    	
	protected JPanel jPanelAccionesDetalleFormularioRenta107;
	protected JPanel jPanelAccionesFormularioDetalleFormularioRenta107;
    
	
	
	protected Integer iXPanelCamposDetalleFormularioRenta107=0;
	protected Integer iYPanelCamposDetalleFormularioRenta107=0;
	
	protected Integer iXPanelCamposOcultosDetalleFormularioRenta107=0;
	protected Integer iYPanelCamposOcultosDetalleFormularioRenta107=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleFormularioRenta107;
	public JButton jButtonModificarDetalleFormularioRenta107;
	public JButton jButtonActualizarDetalleFormularioRenta107;
    public JButton jButtonEliminarDetalleFormularioRenta107;
	public JButton jButtonCancelarDetalleFormularioRenta107;
    public JButton jButtonGuardarCambiosDetalleFormularioRenta107;
	public JButton jButtonGuardarCambiosTablaDetalleFormularioRenta107;
	protected JButton jButtonCerrarDetalleFormularioRenta107;
	
	
	protected JButton jButtonProcesarInformacionDetalleFormularioRenta107;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleFormularioRenta107;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFormularioRenta107;
	protected JButton jButtonModificarToolBarDetalleFormularioRenta107;
	protected JButton jButtonActualizarToolBarDetalleFormularioRenta107;
    protected JButton jButtonEliminarToolBarDetalleFormularioRenta107;
	protected JButton jButtonCancelarToolBarDetalleFormularioRenta107;
    protected JButton jButtonGuardarCambiosToolBarDetalleFormularioRenta107;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleFormularioRenta107;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFormularioRenta107;
	protected JButton jButtonCerrarToolBarDetalleFormularioRenta107;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleFormularioRenta107;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFormularioRenta107;
	protected JMenuItem jMenuItemModificarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemActualizarDetalleFormularioRenta107;
    protected JMenuItem jMenuItemEliminarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemCancelarDetalleFormularioRenta107;
    protected JMenuItem jMenuItemGuardarCambiosDetalleFormularioRenta107;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFormularioRenta107;
	protected JMenuItem jMenuItemCerrarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFormularioRenta107;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleFormularioRenta107;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFormularioRenta107;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFormularioRenta107;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFormularioRenta107;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleFormularioRenta107;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleFormularioRenta107;
	public JLabel jLabelIdDetalleFormularioRenta107;
	public JLabel jLabelidDetalleFormularioRenta107;
	public JButton jButtonidDetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelsueldos_301DetalleFormularioRenta107;
	public JLabel jLabelsueldos_301DetalleFormularioRenta107;
	public JTextField jTextFieldsueldos_301DetalleFormularioRenta107;
	public JButton jButtonsueldos_301DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelsobre_sueldos_303DetalleFormularioRenta107;
	public JLabel jLabelsobre_sueldos_303DetalleFormularioRenta107;
	public JTextField jTextFieldsobre_sueldos_303DetalleFormularioRenta107;
	public JButton jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldecimo_tercero_305DetalleFormularioRenta107;
	public JLabel jLabeldecimo_tercero_305DetalleFormularioRenta107;
	public JTextField jTextFielddecimo_tercero_305DetalleFormularioRenta107;
	public JButton jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldecimo_cuarto_307DetalleFormularioRenta107;
	public JLabel jLabeldecimo_cuarto_307DetalleFormularioRenta107;
	public JTextField jTextFielddecimo_cuarto_307DetalleFormularioRenta107;
	public JButton jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelfondo_reserva_309DetalleFormularioRenta107;
	public JLabel jLabelfondo_reserva_309DetalleFormularioRenta107;
	public JTextField jTextFieldfondo_reserva_309DetalleFormularioRenta107;
	public JButton jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelutilidades_311DetalleFormularioRenta107;
	public JLabel jLabelutilidades_311DetalleFormularioRenta107;
	public JTextField jTextFieldutilidades_311DetalleFormularioRenta107;
	public JButton jButtonutilidades_311DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldesahucio_313DetalleFormularioRenta107;
	public JLabel jLabeldesahucio_313DetalleFormularioRenta107;
	public JTextField jTextFielddesahucio_313DetalleFormularioRenta107;
	public JButton jButtondesahucio_313DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneliess_personal_315DetalleFormularioRenta107;
	public JLabel jLabeliess_personal_315DetalleFormularioRenta107;
	public JTextField jTextFieldiess_personal_315DetalleFormularioRenta107;
	public JButton jButtoniess_personal_315DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelgastos_vivienda_317DetalleFormularioRenta107;
	public JLabel jLabelgastos_vivienda_317DetalleFormularioRenta107;
	public JTextField jTextFieldgastos_vivienda_317DetalleFormularioRenta107;
	public JButton jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelgastos_salud_319DetalleFormularioRenta107;
	public JLabel jLabelgastos_salud_319DetalleFormularioRenta107;
	public JTextField jTextFieldgastos_salud_319DetalleFormularioRenta107;
	public JButton jButtongastos_salud_319DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelgastos_educacion_321DetalleFormularioRenta107;
	public JLabel jLabelgastos_educacion_321DetalleFormularioRenta107;
	public JTextField jTextFieldgastos_educacion_321DetalleFormularioRenta107;
	public JButton jButtongastos_educacion_321DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelgastos_alimentacion_323DetalleFormularioRenta107;
	public JLabel jLabelgastos_alimentacion_323DetalleFormularioRenta107;
	public JTextField jTextFieldgastos_alimentacion_323DetalleFormularioRenta107;
	public JButton jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelgastos_vestimenta_325DetalleFormularioRenta107;
	public JLabel jLabelgastos_vestimenta_325DetalleFormularioRenta107;
	public JTextField jTextFieldgastos_vestimenta_325DetalleFormularioRenta107;
	public JButton jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldescuento_discapacidad_327DetalleFormularioRenta107;
	public JLabel jLabeldescuento_discapacidad_327DetalleFormularioRenta107;
	public JTextField jTextFielddescuento_discapacidad_327DetalleFormularioRenta107;
	public JButton jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldescuento_tercera_edad_329DetalleFormularioRenta107;
	public JLabel jLabeldescuento_tercera_edad_329DetalleFormularioRenta107;
	public JTextField jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107;
	public JButton jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelasume_empleador_331DetalleFormularioRenta107;
	public JLabel jLabelasume_empleador_331DetalleFormularioRenta107;
	public JTextField jTextFieldasume_empleador_331DetalleFormularioRenta107;
	public JButton jButtonasume_empleador_331DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelsub_empleador_351DetalleFormularioRenta107;
	public JLabel jLabelsub_empleador_351DetalleFormularioRenta107;
	public JTextField jTextFieldsub_empleador_351DetalleFormularioRenta107;
	public JButton jButtonsub_empleador_351DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelnumero_meses_trabajados_353DetalleFormularioRenta107;
	public JLabel jLabelnumero_meses_trabajados_353DetalleFormularioRenta107;
	public JTextField jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107;
	public JButton jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelingreso_otros_empleadores_401DetalleFormularioRenta107;
	public JLabel jLabelingreso_otros_empleadores_401DetalleFormularioRenta107;
	public JTextField jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107;
	public JButton jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107;
	public JLabel jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107;
	public JTextField jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107;
	public JButton jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107;
	public JLabel jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107;
	public JTextField jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107;
	public JButton jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelbase_imponible_anual_407DetalleFormularioRenta107;
	public JLabel jLabelbase_imponible_anual_407DetalleFormularioRenta107;
	public JTextField jTextFieldbase_imponible_anual_407DetalleFormularioRenta107;
	public JButton jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelimpuesto_causado_409DetalleFormularioRenta107;
	public JLabel jLabelimpuesto_causado_409DetalleFormularioRenta107;
	public JTextField jTextFieldimpuesto_causado_409DetalleFormularioRenta107;
	public JButton jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107;
	public JLabel jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107;
	public JTextField jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107;
	public JButton jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107;
	public JLabel jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107;
	public JTextField jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107;
	public JButton jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleFormularioRenta107;
	public JLabel jLabelid_empresaDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleFormularioRenta107;
	public JButton jButtonid_empresaDetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empresaDetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empresaDetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelid_empleadoDetalleFormularioRenta107;
	public JLabel jLabelid_empleadoDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoDetalleFormularioRenta107;
	public JButton jButtonid_empleadoDetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empleadoDetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empleadoDetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelid_formulario_renta107DetalleFormularioRenta107;
	public JLabel jLabelid_formulario_renta107DetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formulario_renta107DetalleFormularioRenta107;
	public JButton jButtonid_formulario_renta107DetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_formulario_renta107DetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleFormularioRenta107;
	public JLabel jLabelid_ejercicioDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleFormularioRenta107;
	public JButton jButtonid_ejercicioDetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFormularioRenta107Busqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleFormularioRenta107;
	
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
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=520;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleFormularioRenta107=new JPanel();
				this.jPanelAccionesFormularioDetalleFormularioRenta107=new JPanel();
				this.jmenuBarDetalleDetalleFormularioRenta107=new JMenuBar();
				this.jTtoolBarDetalleDetalleFormularioRenta107=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleFormularioRenta107DetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleFormularioRenta107() {
		return this.jButtonActualizarToolBarDetalleFormularioRenta107;
	}
	
	public JButton getjButtonEliminarToolBarDetalleFormularioRenta107() {
		return this.jButtonEliminarToolBarDetalleFormularioRenta107;
	}
	
	public JButton getjButtonCancelarToolBarDetalleFormularioRenta107() {
		return this.jButtonCancelarToolBarDetalleFormularioRenta107;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleFormularioRenta107() {
		return this.jButtonProcesarInformacionDetalleFormularioRenta107;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFormularioRenta107)	{
		this.jButtonProcesarInformacionDetalleFormularioRenta107 = jButtonProcesarInformacionDetalleFormularioRenta107;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFormularioRenta107() {
		return this.jComboBoxTiposAccionesDetalleFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposRelacionesDetalleFormularioRenta107) {
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107 = jComboBoxTiposRelacionesDetalleFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposAccionesDetalleFormularioRenta107) {
		this.jComboBoxTiposAccionesDetalleFormularioRenta107 = jComboBoxTiposAccionesDetalleFormularioRenta107;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleFormularioRenta107() {
		return this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleFormularioRenta107(
			JComboBox jComboBoxTiposAccionesFormularioDetalleFormularioRenta107) {
		this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107 = jComboBoxTiposAccionesFormularioDetalleFormularioRenta107;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleformulariorenta107SessionBean=new DetalleFormularioRenta107SessionBean();
		
		this.detalleformulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFormularioRenta107JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Formulario Renta107 MANTENIMIENTO"));
		
		
		if(iWidth > 2950) {
			iWidth=2950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleFormularioRenta107= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleFormularioRenta107=new JButtonMe();
				this.jButtonModificarToolBarDetalleFormularioRenta107=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleDetalleFormularioRenta107,
							"actualizar","actualizar","Actualizar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleDetalleFormularioRenta107,
							"eliminar","eliminar","Eliminar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleDetalleFormularioRenta107,
							"cancelar","cancelar","Cancelar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleDetalleFormularioRenta107,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleFormularioRenta107=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleFormularioRenta107=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleFormularioRenta107=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleFormularioRenta107=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleFormularioRenta107=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFormularioRenta107= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFormularioRenta107.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFormularioRenta107,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleFormularioRenta107= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleFormularioRenta107.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleFormularioRenta107,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleFormularioRenta107= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleFormularioRenta107.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleFormularioRenta107,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleFormularioRenta107= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleFormularioRenta107.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleFormularioRenta107,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleFormularioRenta107= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleFormularioRenta107.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleFormularioRenta107,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleFormularioRenta107= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFormularioRenta107.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFormularioRenta107,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleFormularioRenta107.add(this.jMenuItemDetalleCerrarDetalleFormularioRenta107);
		
		this.jmenuDetalleAccionesDetalleFormularioRenta107.add(this.jMenuItemActualizarDetalleFormularioRenta107);
		this.jmenuDetalleAccionesDetalleFormularioRenta107.add(this.jMenuItemEliminarDetalleFormularioRenta107);
		this.jmenuDetalleAccionesDetalleFormularioRenta107.add(this.jMenuItemCancelarDetalleFormularioRenta107);		
		
		//this.jmenuDetalleDatosDetalleFormularioRenta107.add(this.jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107);				
		this.jmenuDetalleDatosDetalleFormularioRenta107.add(this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107);				
				
		//this.jmenuDetalleAccionesDetalleFormularioRenta107.add(this.jMenuItemGuardarCambiosDetalleFormularioRenta107);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleFormularioRenta107.add(this.jmenuDetalleArchivoDetalleFormularioRenta107);		
		this.jmenuBarDetalleDetalleFormularioRenta107.add(this.jmenuDetalleAccionesDetalleFormularioRenta107);		
		this.jmenuBarDetalleDetalleFormularioRenta107.add(this.jmenuDetalleDatosDetalleFormularioRenta107);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleFormularioRenta107);				
	}
	
	
	public void inicializarElementosCamposDetalleFormularioRenta107() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleFormularioRenta107 = new JLabelMe();
		jLabelIdDetalleFormularioRenta107.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleFormularioRenta107 = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleFormularioRenta107= new GridBagLayout();

		this.jPanelidDetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);

		jLabelidDetalleFormularioRenta107 = new JLabel();
		jLabelidDetalleFormularioRenta107.setText("Id");

		jLabelidDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsueldos_301DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelsueldos_301DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_SUELDOS_301+" : *");
		this.jLabelsueldos_301DetalleFormularioRenta107.setToolTipText("Sueldos_301");
		this.jLabelsueldos_301DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldos_301DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldos_301DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsueldos_301DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsueldos_301DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsueldos_301DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_SUELDOS_301);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelsueldos_301DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldsueldos_301DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldsueldos_301DetalleFormularioRenta107.setEnabled(false);
		jTextFieldsueldos_301DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldos_301DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldos_301DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsueldos_301DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsueldos_301DetalleFormularioRenta107.setText("0.0");

		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsueldos_301DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsueldos_301DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsueldos_301DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sueldos_301DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsueldos_301DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_SOBRESUELDOS_303+" : *");
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107.setToolTipText("Sobre Sueldos_303");
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsobre_sueldos_303DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsobre_sueldos_303DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsobre_sueldos_303DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsobre_sueldos_303DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_SOBRESUELDOS_303);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelsobre_sueldos_303DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldsobre_sueldos_303DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.setEnabled(false);
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsobre_sueldos_303DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.setText("0.0");

		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsobre_sueldos_303DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sobre_sueldos_303DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOTERCERO_305+" : *");
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107.setToolTipText("Decimo Tercero_305");
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldecimo_tercero_305DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldecimo_tercero_305DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldecimo_tercero_305DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldecimo_tercero_305DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOTERCERO_305);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldecimo_tercero_305DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddecimo_tercero_305DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.setEnabled(false);
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddecimo_tercero_305DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddecimo_tercero_305DetalleFormularioRenta107.setText("0.0");

		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddecimo_tercero_305DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"decimo_tercero_305DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOCUARTO_307+" : *");
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107.setToolTipText("Decimo Cuarto_307");
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldecimo_cuarto_307DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldecimo_cuarto_307DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldecimo_cuarto_307DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldecimo_cuarto_307DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DECIMOCUARTO_307);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldecimo_cuarto_307DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddecimo_cuarto_307DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.setEnabled(false);
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddecimo_cuarto_307DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.setText("0.0");

		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddecimo_cuarto_307DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"decimo_cuarto_307DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelfondo_reserva_309DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelfondo_reserva_309DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_FONDORESERVA_309+" : *");
		this.jLabelfondo_reserva_309DetalleFormularioRenta107.setToolTipText("Fondo Reserva_309");
		this.jLabelfondo_reserva_309DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfondo_reserva_309DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfondo_reserva_309DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfondo_reserva_309DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfondo_reserva_309DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfondo_reserva_309DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_FONDORESERVA_309);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelfondo_reserva_309DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldfondo_reserva_309DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.setEnabled(false);
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfondo_reserva_309DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfondo_reserva_309DetalleFormularioRenta107.setText("0.0");

		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfondo_reserva_309DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fondo_reserva_309DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelutilidades_311DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelutilidades_311DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_UTILIDADES_311+" : *");
		this.jLabelutilidades_311DetalleFormularioRenta107.setToolTipText("Utilidades_311");
		this.jLabelutilidades_311DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidades_311DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidades_311DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidades_311DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidades_311DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidades_311DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_UTILIDADES_311);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelutilidades_311DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldutilidades_311DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldutilidades_311DetalleFormularioRenta107.setEnabled(false);
		jTextFieldutilidades_311DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidades_311DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidades_311DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidades_311DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidades_311DetalleFormularioRenta107.setText("0.0");

		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidades_311DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidades_311DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidades_311DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidades_311DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidades_311DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldesahucio_313DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldesahucio_313DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DESAHUCIO_313+" : *");
		this.jLabeldesahucio_313DetalleFormularioRenta107.setToolTipText("Desahucio_313");
		this.jLabeldesahucio_313DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesahucio_313DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesahucio_313DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldesahucio_313DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldesahucio_313DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldesahucio_313DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DESAHUCIO_313);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldesahucio_313DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddesahucio_313DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddesahucio_313DetalleFormularioRenta107.setEnabled(false);
		jTextFielddesahucio_313DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesahucio_313DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesahucio_313DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddesahucio_313DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddesahucio_313DetalleFormularioRenta107.setText("0.0");

		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondesahucio_313DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddesahucio_313DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddesahucio_313DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"desahucio_313DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondesahucio_313DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeliess_personal_315DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeliess_personal_315DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IESSPERSONAL_315+" : *");
		this.jLabeliess_personal_315DetalleFormularioRenta107.setToolTipText("Iess Personal_315");
		this.jLabeliess_personal_315DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeliess_personal_315DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeliess_personal_315DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeliess_personal_315DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliess_personal_315DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliess_personal_315DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IESSPERSONAL_315);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneliess_personal_315DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldiess_personal_315DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldiess_personal_315DetalleFormularioRenta107.setEnabled(false);
		jTextFieldiess_personal_315DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiess_personal_315DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiess_personal_315DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiess_personal_315DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiess_personal_315DetalleFormularioRenta107.setText("0.0");

		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiess_personal_315DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiess_personal_315DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iess_personal_315DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniess_personal_315DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVIVIENDA_317+" : *");
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107.setToolTipText("Gastos Vivienda_317");
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_vivienda_317DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_vivienda_317DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_vivienda_317DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_vivienda_317DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVIVIENDA_317);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelgastos_vivienda_317DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldgastos_vivienda_317DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.setEnabled(false);
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_vivienda_317DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.setText("0.0");

		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_vivienda_317DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_vivienda_317DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelgastos_salud_319DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelgastos_salud_319DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSSALUD_319+" : *");
		this.jLabelgastos_salud_319DetalleFormularioRenta107.setToolTipText("Gastos Salud_319");
		this.jLabelgastos_salud_319DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_salud_319DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgastos_salud_319DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_salud_319DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_salud_319DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_salud_319DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSSALUD_319);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelgastos_salud_319DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldgastos_salud_319DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldgastos_salud_319DetalleFormularioRenta107.setEnabled(false);
		jTextFieldgastos_salud_319DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_salud_319DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_salud_319DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_salud_319DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_salud_319DetalleFormularioRenta107.setText("0.0");

		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_salud_319DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_salud_319DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_salud_319DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_salud_319DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelgastos_educacion_321DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelgastos_educacion_321DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSEDUCACION_321+" : *");
		this.jLabelgastos_educacion_321DetalleFormularioRenta107.setToolTipText("Gastos Educacion_321");
		this.jLabelgastos_educacion_321DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_educacion_321DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_educacion_321DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_educacion_321DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_educacion_321DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_educacion_321DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSEDUCACION_321);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelgastos_educacion_321DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldgastos_educacion_321DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.setEnabled(false);
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_educacion_321DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_educacion_321DetalleFormularioRenta107.setText("0.0");

		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_educacion_321DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_educacion_321DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_educacion_321DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSALIMENTACION_323+" : *");
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107.setToolTipText("Gastos Alimentacion_323");
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_alimentacion_323DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_alimentacion_323DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_alimentacion_323DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_alimentacion_323DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSALIMENTACION_323);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelgastos_alimentacion_323DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.setEnabled(false);
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_alimentacion_323DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.setText("0.0");

		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_alimentacion_323DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_alimentacion_323DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVESTIMENTA_325+" : *");
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107.setToolTipText("Gastos Vestimenta_325");
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelgastos_vestimenta_325DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelgastos_vestimenta_325DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastos_vestimenta_325DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastos_vestimenta_325DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_GASTOSVESTIMENTA_325);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelgastos_vestimenta_325DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.setEnabled(false);
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastos_vestimenta_325DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.setText("0.0");

		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastos_vestimenta_325DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastos_vestimenta_325DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTODISCAPACIDAD_327+" : *");
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107.setToolTipText("Descuento Discapacidad_327");
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_discapacidad_327DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_discapacidad_327DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTODISCAPACIDAD_327);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.setEnabled(false);
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_discapacidad_327DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.setText("0.0");

		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_discapacidad_327DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_discapacidad_327DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTOTERCERAEDAD_329+" : *");
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107.setToolTipText("Descuento Tercera Edad_329");
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_tercera_edad_329DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_tercera_edad_329DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DESCUENTOTERCERAEDAD_329);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.setEnabled(false);
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.setText("0.0");

		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_tercera_edad_329DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelasume_empleador_331DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelasume_empleador_331DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_ASUMEEMPLEADOR_331+" : *");
		this.jLabelasume_empleador_331DetalleFormularioRenta107.setToolTipText("Asume Empleador_331");
		this.jLabelasume_empleador_331DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelasume_empleador_331DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelasume_empleador_331DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelasume_empleador_331DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelasume_empleador_331DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelasume_empleador_331DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_ASUMEEMPLEADOR_331);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelasume_empleador_331DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldasume_empleador_331DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldasume_empleador_331DetalleFormularioRenta107.setEnabled(false);
		jTextFieldasume_empleador_331DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldasume_empleador_331DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldasume_empleador_331DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldasume_empleador_331DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldasume_empleador_331DetalleFormularioRenta107.setText("0.0");

		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldasume_empleador_331DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldasume_empleador_331DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"asume_empleador_331DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonasume_empleador_331DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelsub_empleador_351DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelsub_empleador_351DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_SUBEMPLEADOR_351+" : *");
		this.jLabelsub_empleador_351DetalleFormularioRenta107.setToolTipText("Sub Empleador_351");
		this.jLabelsub_empleador_351DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_empleador_351DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_empleador_351DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_empleador_351DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_empleador_351DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_empleador_351DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_SUBEMPLEADOR_351);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelsub_empleador_351DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldsub_empleador_351DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldsub_empleador_351DetalleFormularioRenta107.setEnabled(false);
		jTextFieldsub_empleador_351DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_empleador_351DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_empleador_351DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_empleador_351DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_empleador_351DetalleFormularioRenta107.setText("0.0");

		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_empleador_351DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_empleador_351DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_empleador_351DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_empleador_351DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_NUMEROMESESTRABAJADOS_353+" : *");
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107.setToolTipText("Numero Meses Trabajados_353");
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_meses_trabajados_353DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_meses_trabajados_353DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_NUMEROMESESTRABAJADOS_353);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.setEnabled(false);
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.setText("0");

		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_meses_trabajados_353DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_INGRESOOTROSEMPLEADORES_401+" : *");
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107.setToolTipText("Ingreso Otros Empleadores_401");
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelingreso_otros_empleadores_401DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso_otros_empleadores_401DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_INGRESOOTROSEMPLEADORES_401);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.setEnabled(false);
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.setText("0.0");

		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso_otros_empleadores_401DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107 = new JLabelMe();
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_DEDUCCIONGASTOSOTROSEMPLEADORES_403+" : *");
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setToolTipText("Deduccion Gastos Otros Empleadores_403");
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_DEDUCCIONGASTOSOTROSEMPLEADORES_403);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107= new JTextFieldMe();
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setEnabled(false);
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.setText("0.0");

		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_REBAJASOTROSEMPLEADORES_405+" : *");
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107.setToolTipText("Rebajas Otros Empleadores_405");
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_REBAJASOTROSEMPLEADORES_405);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.setEnabled(false);
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.setText("0.0");

		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_BASEIMPONIBLEANUAL_407+" : *");
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107.setToolTipText("Base Imponible Anual_407");
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelbase_imponible_anual_407DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponible_anual_407DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponible_anual_407DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponible_anual_407DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_BASEIMPONIBLEANUAL_407);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelbase_imponible_anual_407DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.setEnabled(false);
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponible_anual_407DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.setText("0.0");

		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponible_anual_407DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponible_anual_407DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTOCAUSADO_409+" : *");
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107.setToolTipText("Impuesto Causado_409");
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_causado_409DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto_causado_409DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto_causado_409DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto_causado_409DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTOCAUSADO_409);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelimpuesto_causado_409DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldimpuesto_causado_409DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.setEnabled(false);
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto_causado_409DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.setText("0.0");

		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto_causado_409DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto_causado_409DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOEMPLEADOR_411+" : *");
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setToolTipText("Impuesto Retenido Empleador_411");
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOEMPLEADOR_411);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.setEnabled(false);
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.setText("0.0");

		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOOTROSEMPLEADORES_413+" : *");
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setToolTipText("Impuesto Retenido Otros Empleadores_413");
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IMPUESTORETENIDOOTROSEMPLEADORES_413);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107= new JTextFieldMe();
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setEnabled(false);
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.setText("0.0");

		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleFormularioRenta107() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleFormularioRenta107 = new JLabelMe();
		this.jLabelid_empresaDetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleFormularioRenta107.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelid_empresaDetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jComboBoxid_empresaDetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empresaDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleFormularioRenta107.setEnabled(false);

		this.jButtonid_empresaDetalleFormularioRenta107= new JButtonMe();
		this.jButtonid_empresaDetalleFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFormularioRenta107.setText("Buscar");
		this.jButtonid_empresaDetalleFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFormularioRenta107"));

		this.jButtonid_empresaDetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleFormularioRenta107Update= new JButtonMe();
		this.jButtonid_empresaDetalleFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFormularioRenta107Update.setText("U");
		this.jButtonid_empresaDetalleFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFormularioRenta107Update"));



					
		this.jLabelid_empleadoDetalleFormularioRenta107 = new JLabelMe();
		this.jLabelid_empleadoDetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoDetalleFormularioRenta107.setToolTipText("Empleado");
		this.jLabelid_empleadoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoDetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoDetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelid_empleadoDetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jComboBoxid_empleadoDetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empleadoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoDetalleFormularioRenta107= new JButtonMe();
		this.jButtonid_empleadoDetalleFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleFormularioRenta107.setText("Buscar");
		this.jButtonid_empleadoDetalleFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoDetalleFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleFormularioRenta107"));

		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoDetalleFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_empleadoDetalleFormularioRenta107Update= new JButtonMe();
		this.jButtonid_empleadoDetalleFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleFormularioRenta107Update.setText("U");
		this.jButtonid_empleadoDetalleFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoDetalleFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleFormularioRenta107Update"));



					
		this.jLabelid_formulario_renta107DetalleFormularioRenta107 = new JLabelMe();
		this.jLabelid_formulario_renta107DetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IDFORMULARIORENTA107+" : *");
		this.jLabelid_formulario_renta107DetalleFormularioRenta107.setToolTipText("Formulario Renta107");
		this.jLabelid_formulario_renta107DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formulario_renta107DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formulario_renta107DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formulario_renta107DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formulario_renta107DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formulario_renta107DetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IDFORMULARIORENTA107);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelid_formulario_renta107DetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jComboBoxid_formulario_renta107DetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formulario_renta107DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formulario_renta107DetalleFormularioRenta107= new JButtonMe();
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setText("Buscar");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formulario_renta107DetalleFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formulario_renta107DetalleFormularioRenta107"));

		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formulario_renta107DetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update= new JButtonMe();
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setText("U");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formulario_renta107DetalleFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formulario_renta107DetalleFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formulario_renta107DetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formulario_renta107DetalleFormularioRenta107Update"));



					
		this.jLabelid_ejercicioDetalleFormularioRenta107 = new JLabelMe();
		this.jLabelid_ejercicioDetalleFormularioRenta107.setText(""+DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleFormularioRenta107.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleFormularioRenta107.setToolTipText(DetalleFormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		this.jPanelid_ejercicioDetalleFormularioRenta107.setLayout(this.gridaBagLayoutDetalleFormularioRenta107);


		jComboBoxid_ejercicioDetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleFormularioRenta107.setEnabled(false);

		this.jButtonid_ejercicioDetalleFormularioRenta107= new JButtonMe();
		this.jButtonid_ejercicioDetalleFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFormularioRenta107.setText("Buscar");
		this.jButtonid_ejercicioDetalleFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFormularioRenta107"));

		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setText("U");
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFormularioRenta107Busqueda"));

		if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleFormularioRenta107Update= new JButtonMe();
		this.jButtonid_ejercicioDetalleFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFormularioRenta107Update.setText("U");
		this.jButtonid_ejercicioDetalleFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFormularioRenta107Update"));



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
		//this.jInternalFrameDetalleDetalleFormularioRenta107 = new DetalleFormularioRenta107BeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Formulario Renta107 DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFormularioRenta107= new GridBagLayout();
		

		
		String sToolTipDetalleFormularioRenta107="";
		sToolTipDetalleFormularioRenta107=DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFormularioRenta107+="(Nomina.DetalleFormularioRenta107)";
		}
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFormularioRenta107+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonModificarDetalleFormularioRenta107 = new JButtonMe();
        this.jButtonActualizarDetalleFormularioRenta107 = new JButtonMe();
        this.jButtonEliminarDetalleFormularioRenta107 = new JButtonMe();
        this.jButtonCancelarDetalleFormularioRenta107 = new JButtonMe();
        this.jButtonGuardarCambiosDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarDetalleFormularioRenta107 = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFormularioRenta107 = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleFormularioRenta107 = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleFormularioRenta107 = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Formulario Renta107";
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleFormularioRenta107.setName("jPanelCamposDetalleFormularioRenta107"); 

		this.jPanelCamposOcultosDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleFormularioRenta107.setName("jPanelCamposOcultosDetalleFormularioRenta107"); 

        this.jPanelAccionesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFormularioRenta107.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleFormularioRenta107.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleFormularioRenta107.setText("Nuevo");
		this.jButtonModificarDetalleFormularioRenta107.setText("Editar");
        this.jButtonActualizarDetalleFormularioRenta107.setText("Actualizar");
        this.jButtonEliminarDetalleFormularioRenta107.setText("Eliminar");
        this.jButtonCancelarDetalleFormularioRenta107.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleFormularioRenta107.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.setText("Guardar");
		this.jButtonCerrarDetalleFormularioRenta107.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFormularioRenta107,"nuevo_button","Nuevo",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleFormularioRenta107,"modificar_button","Editar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleFormularioRenta107,"actualizar_button","Actualizar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleFormularioRenta107,"eliminar_button","Eliminar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleFormularioRenta107,"cancelar_button","Cancelar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleFormularioRenta107,"guardarcambios_button","Guardar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFormularioRenta107,"guardarcambiostabla_button","Guardar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFormularioRenta107,"cerrar_button","Salir",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleFormularioRenta107.setToolTipText("Nuevo"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleFormularioRenta107.setToolTipText("Editar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleFormularioRenta107.setToolTipText("Actualizar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleFormularioRenta107.setToolTipText("Eliminar)"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleFormularioRenta107.setToolTipText("Cancelar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleFormularioRenta107.setToolTipText("Guardar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.setToolTipText("Guardar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFormularioRenta107.setToolTipText("Salir"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFormularioRenta107";
		inputMap = this.jButtonNuevoDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFormularioRenta107"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleFormularioRenta107";
		inputMap = this.jButtonActualizarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleFormularioRenta107"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleFormularioRenta107";
		inputMap = this.jButtonEliminarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleFormularioRenta107"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleFormularioRenta107";
		inputMap = this.jButtonCancelarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleFormularioRenta107"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleFormularioRenta107";
		inputMap = this.jButtonCerrarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFormularioRenta107"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFormularioRenta107";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFormularioRenta107"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleFormularioRenta107.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleFormularioRenta107.setToolTipText("Nuevo DetalleFormularioRenta107");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107.setToolTipText("Sin Cerrar Ventana DetalleFormularioRenta107");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFormularioRenta107.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleFormularioRenta107 = new JLabelMe();
		
		this.jLabelAccionesDetalleFormularioRenta107.setText("Acciones");		
		this.jLabelAccionesDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleFormularioRenta107();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleFormularioRenta107();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleFormularioRenta107=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleFormularioRenta107 = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleFormularioRenta107 = new GridBagLayout();
		
		this.jPanelCamposDetalleFormularioRenta107.setLayout(gridaBagLayoutCamposDetalleFormularioRenta107);
		this.jPanelCamposOcultosDetalleFormularioRenta107.setLayout(gridaBagLayoutCamposOcultosDetalleFormularioRenta107);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleFormularioRenta107.add(jLabelIdDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleFormularioRenta107.add(jLabelidDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleFormularioRenta107.add(jLabelid_empresaDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFormularioRenta107.add(jButtonid_empresaDetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 3;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFormularioRenta107.add(jButtonid_empresaDetalleFormularioRenta107Update, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleFormularioRenta107.add(jComboBoxid_empresaDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoDetalleFormularioRenta107.add(jLabelid_empleadoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleFormularioRenta107.add(jButtonid_empleadoDetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 3;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleFormularioRenta107.add(jButtonid_empleadoDetalleFormularioRenta107Update, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoDetalleFormularioRenta107.add(jComboBoxid_empleadoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formulario_renta107DetalleFormularioRenta107.add(jLabelid_formulario_renta107DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formulario_renta107DetalleFormularioRenta107.add(jButtonid_formulario_renta107DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 3;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formulario_renta107DetalleFormularioRenta107.add(jButtonid_formulario_renta107DetalleFormularioRenta107Update, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formulario_renta107DetalleFormularioRenta107.add(jComboBoxid_formulario_renta107DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleFormularioRenta107.add(jLabelid_ejercicioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFormularioRenta107.add(jButtonid_ejercicioDetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 3;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFormularioRenta107.add(jButtonid_ejercicioDetalleFormularioRenta107Update, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleFormularioRenta107.add(jComboBoxid_ejercicioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsueldos_301DetalleFormularioRenta107.add(jLabelsueldos_301DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelsueldos_301DetalleFormularioRenta107.add(jButtonsueldos_301DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsueldos_301DetalleFormularioRenta107.add(jTextFieldsueldos_301DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsobre_sueldos_303DetalleFormularioRenta107.add(jLabelsobre_sueldos_303DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelsobre_sueldos_303DetalleFormularioRenta107.add(jButtonsobre_sueldos_303DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsobre_sueldos_303DetalleFormularioRenta107.add(jTextFieldsobre_sueldos_303DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldecimo_tercero_305DetalleFormularioRenta107.add(jLabeldecimo_tercero_305DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldecimo_tercero_305DetalleFormularioRenta107.add(jButtondecimo_tercero_305DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldecimo_tercero_305DetalleFormularioRenta107.add(jTextFielddecimo_tercero_305DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldecimo_cuarto_307DetalleFormularioRenta107.add(jLabeldecimo_cuarto_307DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldecimo_cuarto_307DetalleFormularioRenta107.add(jButtondecimo_cuarto_307DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldecimo_cuarto_307DetalleFormularioRenta107.add(jTextFielddecimo_cuarto_307DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfondo_reserva_309DetalleFormularioRenta107.add(jLabelfondo_reserva_309DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelfondo_reserva_309DetalleFormularioRenta107.add(jButtonfondo_reserva_309DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfondo_reserva_309DetalleFormularioRenta107.add(jTextFieldfondo_reserva_309DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidades_311DetalleFormularioRenta107.add(jLabelutilidades_311DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidades_311DetalleFormularioRenta107.add(jButtonutilidades_311DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidades_311DetalleFormularioRenta107.add(jTextFieldutilidades_311DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldesahucio_313DetalleFormularioRenta107.add(jLabeldesahucio_313DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldesahucio_313DetalleFormularioRenta107.add(jButtondesahucio_313DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldesahucio_313DetalleFormularioRenta107.add(jTextFielddesahucio_313DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliess_personal_315DetalleFormularioRenta107.add(jLabeliess_personal_315DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneliess_personal_315DetalleFormularioRenta107.add(jButtoniess_personal_315DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliess_personal_315DetalleFormularioRenta107.add(jTextFieldiess_personal_315DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_vivienda_317DetalleFormularioRenta107.add(jLabelgastos_vivienda_317DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_vivienda_317DetalleFormularioRenta107.add(jButtongastos_vivienda_317DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_vivienda_317DetalleFormularioRenta107.add(jTextFieldgastos_vivienda_317DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_salud_319DetalleFormularioRenta107.add(jLabelgastos_salud_319DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_salud_319DetalleFormularioRenta107.add(jButtongastos_salud_319DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_salud_319DetalleFormularioRenta107.add(jTextFieldgastos_salud_319DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_educacion_321DetalleFormularioRenta107.add(jLabelgastos_educacion_321DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_educacion_321DetalleFormularioRenta107.add(jButtongastos_educacion_321DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_educacion_321DetalleFormularioRenta107.add(jTextFieldgastos_educacion_321DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_alimentacion_323DetalleFormularioRenta107.add(jLabelgastos_alimentacion_323DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_alimentacion_323DetalleFormularioRenta107.add(jButtongastos_alimentacion_323DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_alimentacion_323DetalleFormularioRenta107.add(jTextFieldgastos_alimentacion_323DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastos_vestimenta_325DetalleFormularioRenta107.add(jLabelgastos_vestimenta_325DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastos_vestimenta_325DetalleFormularioRenta107.add(jButtongastos_vestimenta_325DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastos_vestimenta_325DetalleFormularioRenta107.add(jTextFieldgastos_vestimenta_325DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107.add(jLabeldescuento_discapacidad_327DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107.add(jButtondescuento_discapacidad_327DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107.add(jTextFielddescuento_discapacidad_327DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107.add(jLabeldescuento_tercera_edad_329DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107.add(jButtondescuento_tercera_edad_329DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107.add(jTextFielddescuento_tercera_edad_329DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelasume_empleador_331DetalleFormularioRenta107.add(jLabelasume_empleador_331DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelasume_empleador_331DetalleFormularioRenta107.add(jButtonasume_empleador_331DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelasume_empleador_331DetalleFormularioRenta107.add(jTextFieldasume_empleador_331DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_empleador_351DetalleFormularioRenta107.add(jLabelsub_empleador_351DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_empleador_351DetalleFormularioRenta107.add(jButtonsub_empleador_351DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_empleador_351DetalleFormularioRenta107.add(jTextFieldsub_empleador_351DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107.add(jLabelnumero_meses_trabajados_353DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107.add(jButtonnumero_meses_trabajados_353DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107.add(jTextFieldnumero_meses_trabajados_353DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107.add(jLabelingreso_otros_empleadores_401DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107.add(jButtoningreso_otros_empleadores_401DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107.add(jTextFieldingreso_otros_empleadores_401DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.add(jLabeldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.add(jButtondeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107.add(jTextFielddeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107.add(jLabelrebajas_otros_empleadores_405DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107.add(jButtonrebajas_otros_empleadores_405DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107.add(jTextFieldrebajas_otros_empleadores_405DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponible_anual_407DetalleFormularioRenta107.add(jLabelbase_imponible_anual_407DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponible_anual_407DetalleFormularioRenta107.add(jButtonbase_imponible_anual_407DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponible_anual_407DetalleFormularioRenta107.add(jTextFieldbase_imponible_anual_407DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto_causado_409DetalleFormularioRenta107.add(jLabelimpuesto_causado_409DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto_causado_409DetalleFormularioRenta107.add(jButtonimpuesto_causado_409DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto_causado_409DetalleFormularioRenta107.add(jTextFieldimpuesto_causado_409DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107.add(jLabelimpuesto_retenido_empleador_411DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107.add(jButtonimpuesto_retenido_empleador_411DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107.add(jTextFieldimpuesto_retenido_empleador_411DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.add(jLabelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 2;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.add(jButtonimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107Busqueda, this.gridBagConstraintsDetalleFormularioRenta107);
	}

	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107.add(jTextFieldimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelidDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelid_empleadoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelid_formulario_renta107DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelsueldos_301DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelsobre_sueldos_303DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldecimo_tercero_305DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldecimo_cuarto_307DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelfondo_reserva_309DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelutilidades_311DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldesahucio_313DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneliess_personal_315DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelgastos_vivienda_317DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelgastos_salud_319DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelgastos_educacion_321DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelgastos_alimentacion_323DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelgastos_vestimenta_325DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldescuento_discapacidad_327DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldescuento_tercera_edad_329DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelasume_empleador_331DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelsub_empleador_351DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelnumero_meses_trabajados_353DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelingreso_otros_empleadores_401DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPaneldeduccion_gastos_otros_empleadores_403DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelrebajas_otros_empleadores_405DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelbase_imponible_anual_407DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelimpuesto_causado_409DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelimpuesto_retenido_empleador_411DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFormularioRenta107.add(this.jPanelimpuesto_retenido_otros_empleadores_413DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposDetalleFormularioRenta107=0;
		iYPanelCamposDetalleFormularioRenta107++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposOcultosDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposOcultosDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFormularioRenta107.add(this.jPanelid_empresaDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposOcultosDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposOcultosDetalleFormularioRenta107=0;
		iYPanelCamposOcultosDetalleFormularioRenta107++;
	}
	this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFormularioRenta107.gridy = iYPanelCamposOcultosDetalleFormularioRenta107;
	this.gridBagConstraintsDetalleFormularioRenta107.gridx = iXPanelCamposOcultosDetalleFormularioRenta107++;
	this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFormularioRenta107.add(this.jPanelid_ejercicioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);



	if(iXPanelCamposOcultosDetalleFormularioRenta107 % 3==0) {
		iXPanelCamposOcultosDetalleFormularioRenta107=0;
		iYPanelCamposOcultosDetalleFormularioRenta107++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesDetalleFormularioRenta107.setLayout(gridaBagLayoutAccionesDetalleFormularioRenta107);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleFormularioRenta107.setLayout(gridaBagLayoutAccionesFormularioDetalleFormularioRenta107);
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFormularioRenta107.add(this.jComboBoxTiposAccionesFormularioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFormularioRenta107.add(this.jCheckBoxPostAccionNuevoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleformulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFormularioRenta107.add(this.jCheckBoxPostAccionSinCerrarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleformulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFormularioRenta107.add(this.jCheckBoxPostAccionSinMensajeDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonModificarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);							

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonEliminarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonActualizarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonGuardarCambiosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);	
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonCancelarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFormularioRenta107);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;		
			//this.gridBagConstraintsDetalleFormularioRenta107.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =0;
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFormularioRenta107.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleFormularioRenta107JInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleFormularioRenta107 = new DetalleFormularioRenta107BeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Formulario Renta107 DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Formulario Renta107 DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Formulario Renta107 Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleFormularioRenta107Model detalleformulariorenta107Model=new DetalleFormularioRenta107Model(this);
			
			//SI USARA CLASE INTERNA
			//DetalleFormularioRenta107Model.DetalleFormularioRenta107FocusTraversalPolicy detalleformulariorenta107FocusTraversalPolicy = detalleformulariorenta107Model.new DetalleFormularioRenta107FocusTraversalPolicy(this);
			
			//detalleformulariorenta107FocusTraversalPolicy.setdetalleformulariorenta107JInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleformulariorenta107Model);
			
			
			this.jContentPaneDetalleDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleFormularioRenta107 = new GridBagLayout();	
			this.jContentPaneDetalleDetalleFormularioRenta107.setLayout(gridaBagLayoutDetalleDetalleFormularioRenta107);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFormularioRenta107 = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleFormularioRenta107.add(jTtoolBarDetalleDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107=   new JScrollPane(jContentPaneDetalleDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	        
			this.jContentPaneDetalleDetalleFormularioRenta107.add(jPanelCamposDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);
			
			
			
			
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
						&& detalleformulariorenta107SessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleformulariorenta107SessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleFormularioRenta107= new GridBagConstraints();
						this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
						this.jContentPaneDetalleDetalleFormularioRenta107.add(this.jTabbedPaneRelacionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleFormularioRenta107.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleFormularioRenta107.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
					this.gridBagConstraintsDetalleFormularioRenta107.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleFormularioRenta107.add(jPanelCamposOcultosDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);
				
					this.jPanelCamposOcultosDetalleFormularioRenta107.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	        this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleFormularioRenta107.add(this.jPanelAccionesFormularioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);							
			
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
	        this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleFormularioRenta107.add(this.jPanelAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleFormularioRenta107);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107=   new JScrollPane(this.jPanelCamposDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleFormularioRenta107.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleFormularioRenta107;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleFormularioRenta107;
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
