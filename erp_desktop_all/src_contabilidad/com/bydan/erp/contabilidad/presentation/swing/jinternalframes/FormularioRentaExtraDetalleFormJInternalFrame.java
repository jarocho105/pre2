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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.FormularioRentaExtraConstantesFunciones;

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
public class FormularioRentaExtraDetalleFormJInternalFrame extends FormularioRentaExtraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormularioRentaExtra;
	
	protected JMenuBar jmenuBarDetalleFormularioRentaExtra;
	
	protected JMenu jmenuDetalleFormularioRentaExtra;
	protected JMenu jmenuDetalleArchivoFormularioRentaExtra;
	protected JMenu jmenuDetalleAccionesFormularioRentaExtra;
	protected JMenu jmenuDetalleDatosFormularioRentaExtra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRentaExtra;	
	protected GridBagConstraints gridBagConstraintsFormularioRentaExtra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormularioRentaExtraBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormularioRentaExtra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformulariorenta="";

	protected FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";
	
	public FormularioRentaExtraSessionBean formulariorentaextraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
	public FormaPagoSessionBean formapagoSessionBean;
	public BancoSessionBean bancoSessionBean;	
	
	public FormularioRentaExtraLogic formulariorentaextraLogic;
	
	public JScrollPane jScrollPanelDatosFormularioRentaExtra;
	public JScrollPane jScrollPanelDatosEdicionFormularioRentaExtra;
	public JScrollPane jScrollPanelDatosGeneralFormularioRentaExtra;
	
	protected JPanel jPanelCamposFormularioRentaExtra;    
	protected JPanel jPanelCamposOcultosFormularioRentaExtra;    	
	protected JPanel jPanelAccionesFormularioRentaExtra;
	protected JPanel jPanelAccionesFormularioFormularioRentaExtra;
    
	
	
	protected Integer iXPanelCamposFormularioRentaExtra=0;
	protected Integer iYPanelCamposFormularioRentaExtra=0;
	
	protected Integer iXPanelCamposOcultosFormularioRentaExtra=0;
	protected Integer iYPanelCamposOcultosFormularioRentaExtra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormularioRentaExtra;
	public JButton jButtonModificarFormularioRentaExtra;
	public JButton jButtonActualizarFormularioRentaExtra;
    public JButton jButtonEliminarFormularioRentaExtra;
	public JButton jButtonCancelarFormularioRentaExtra;
    public JButton jButtonGuardarCambiosFormularioRentaExtra;
	public JButton jButtonGuardarCambiosTablaFormularioRentaExtra;
	protected JButton jButtonCerrarFormularioRentaExtra;
	
	
	protected JButton jButtonProcesarInformacionFormularioRentaExtra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormularioRentaExtra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormularioRentaExtra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormularioRentaExtra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRentaExtra;
	protected JButton jButtonModificarToolBarFormularioRentaExtra;
	protected JButton jButtonActualizarToolBarFormularioRentaExtra;
    protected JButton jButtonEliminarToolBarFormularioRentaExtra;
	protected JButton jButtonCancelarToolBarFormularioRentaExtra;
    protected JButton jButtonGuardarCambiosToolBarFormularioRentaExtra;
	protected JButton jButtonGuardarCambiosTablaToolBarFormularioRentaExtra;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRentaExtra;
	protected JButton jButtonCerrarToolBarFormularioRentaExtra;
	
	protected JButton jButtonProcesarInformacionToolBarFormularioRentaExtra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRentaExtra;
	protected JMenuItem jMenuItemModificarFormularioRentaExtra;
	protected JMenuItem jMenuItemActualizarFormularioRentaExtra;
    protected JMenuItem jMenuItemEliminarFormularioRentaExtra;
	protected JMenuItem jMenuItemCancelarFormularioRentaExtra;
    protected JMenuItem jMenuItemGuardarCambiosFormularioRentaExtra;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRentaExtra;
	protected JMenuItem jMenuItemCerrarFormularioRentaExtra;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRentaExtra;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRentaExtra;
	
	protected JMenuItem jMenuItemProcesarInformacionFormularioRentaExtra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRentaExtra;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRentaExtra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRentaExtra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRentaExtra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormularioRentaExtra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormularioRentaExtra;
	public JLabel jLabelIdFormularioRentaExtra;
	public JLabel jLabelidFormularioRentaExtra;
	public JButton jButtonidFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelpago_previoFormularioRentaExtra;
	public JLabel jLabelpago_previoFormularioRentaExtra;
	public JTextField jTextFieldpago_previoFormularioRentaExtra;
	public JButton jButtonpago_previoFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelinteres_moraFormularioRentaExtra;
	public JLabel jLabelinteres_moraFormularioRentaExtra;
	public JTextField jTextFieldinteres_moraFormularioRentaExtra;
	public JButton jButtoninteres_moraFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_multaFormularioRentaExtra;
	public JLabel jLabelvalor_multaFormularioRentaExtra;
	public JTextField jTextFieldvalor_multaFormularioRentaExtra;
	public JButton jButtonvalor_multaFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelforma_pago1FormularioRentaExtra;
	public JLabel jLabelforma_pago1FormularioRentaExtra;
	public JTextField jTextFieldforma_pago1FormularioRentaExtra;
	public JButton jButtonforma_pago1FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelforma_pago2FormularioRentaExtra;
	public JLabel jLabelforma_pago2FormularioRentaExtra;
	public JTextField jTextFieldforma_pago2FormularioRentaExtra;
	public JButton jButtonforma_pago2FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nota_credito1FormularioRentaExtra;
	public JLabel jLabelnumero_nota_credito1FormularioRentaExtra;
	public JTextField jTextFieldnumero_nota_credito1FormularioRentaExtra;
	public JButton jButtonnumero_nota_credito1FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nota_credito2FormularioRentaExtra;
	public JLabel jLabelnumero_nota_credito2FormularioRentaExtra;
	public JTextField jTextFieldnumero_nota_credito2FormularioRentaExtra;
	public JButton jButtonnumero_nota_credito2FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nota_credito3FormularioRentaExtra;
	public JLabel jLabelnumero_nota_credito3FormularioRentaExtra;
	public JTextField jTextFieldnumero_nota_credito3FormularioRentaExtra;
	public JButton jButtonnumero_nota_credito3FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nota_credito4FormularioRentaExtra;
	public JLabel jLabelnumero_nota_credito4FormularioRentaExtra;
	public JTextField jTextFieldnumero_nota_credito4FormularioRentaExtra;
	public JButton jButtonnumero_nota_credito4FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_nota_credito1FormularioRentaExtra;
	public JLabel jLabelvalor_nota_credito1FormularioRentaExtra;
	public JTextField jTextFieldvalor_nota_credito1FormularioRentaExtra;
	public JButton jButtonvalor_nota_credito1FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_nota_credito2FormularioRentaExtra;
	public JLabel jLabelvalor_nota_credito2FormularioRentaExtra;
	public JTextField jTextFieldvalor_nota_credito2FormularioRentaExtra;
	public JButton jButtonvalor_nota_credito2FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_nota_credito3FormularioRentaExtra;
	public JLabel jLabelvalor_nota_credito3FormularioRentaExtra;
	public JTextField jTextFieldvalor_nota_credito3FormularioRentaExtra;
	public JButton jButtonvalor_nota_credito3FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_nota_credito4FormularioRentaExtra;
	public JLabel jLabelvalor_nota_credito4FormularioRentaExtra;
	public JTextField jTextFieldvalor_nota_credito4FormularioRentaExtra;
	public JButton jButtonvalor_nota_credito4FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobante1FormularioRentaExtra;
	public JLabel jLabelnumero_comprobante1FormularioRentaExtra;
	public JTextField jTextFieldnumero_comprobante1FormularioRentaExtra;
	public JButton jButtonnumero_comprobante1FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobante2FormularioRentaExtra;
	public JLabel jLabelnumero_comprobante2FormularioRentaExtra;
	public JTextField jTextFieldnumero_comprobante2FormularioRentaExtra;
	public JButton jButtonnumero_comprobante2FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comprobante1FormularioRentaExtra;
	public JLabel jLabelvalor_comprobante1FormularioRentaExtra;
	public JTextField jTextFieldvalor_comprobante1FormularioRentaExtra;
	public JButton jButtonvalor_comprobante1FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comprobante2FormularioRentaExtra;
	public JLabel jLabelvalor_comprobante2FormularioRentaExtra;
	public JTextField jTextFieldvalor_comprobante2FormularioRentaExtra;
	public JButton jButtonvalor_comprobante2FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor301FormularioRentaExtra;
	public JLabel jLabelvalor301FormularioRentaExtra;
	public JTextField jTextFieldvalor301FormularioRentaExtra;
	public JButton jButtonvalor301FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor303FormularioRentaExtra;
	public JLabel jLabelvalor303FormularioRentaExtra;
	public JTextField jTextFieldvalor303FormularioRentaExtra;
	public JButton jButtonvalor303FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor305FormularioRentaExtra;
	public JLabel jLabelvalor305FormularioRentaExtra;
	public JTextField jTextFieldvalor305FormularioRentaExtra;
	public JButton jButtonvalor305FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor307FormularioRentaExtra;
	public JLabel jLabelvalor307FormularioRentaExtra;
	public JTextField jTextFieldvalor307FormularioRentaExtra;
	public JButton jButtonvalor307FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor351FormularioRentaExtra;
	public JLabel jLabelvalor351FormularioRentaExtra;
	public JTextField jTextFieldvalor351FormularioRentaExtra;
	public JButton jButtonvalor351FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor355FormularioRentaExtra;
	public JLabel jLabelvalor355FormularioRentaExtra;
	public JTextField jTextFieldvalor355FormularioRentaExtra;
	public JButton jButtonvalor355FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor357FormularioRentaExtra;
	public JLabel jLabelvalor357FormularioRentaExtra;
	public JTextField jTextFieldvalor357FormularioRentaExtra;
	public JButton jButtonvalor357FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor359FormularioRentaExtra;
	public JLabel jLabelvalor359FormularioRentaExtra;
	public JTextField jTextFieldvalor359FormularioRentaExtra;
	public JButton jButtonvalor359FormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelvalor361FormularioRentaExtra;
	public JLabel jLabelvalor361FormularioRentaExtra;
	public JTextField jTextFieldvalor361FormularioRentaExtra;
	public JButton jButtonvalor361FormularioRentaExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormularioRentaExtra;
	public JLabel jLabelid_empresaFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormularioRentaExtra;
	public JButton jButtonid_empresaFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_empresaFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormularioRentaExtra;
	public JLabel jLabelid_ejercicioFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormularioRentaExtra;
	public JButton jButtonid_ejercicioFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormularioRentaExtra;
	public JLabel jLabelid_periodoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormularioRentaExtra;
	public JButton jButtonid_periodoFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_periodoFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_dato_formulario_rentaFormularioRentaExtra;
	public JLabel jLabelid_dato_formulario_rentaFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_rentaFormularioRentaExtra;
	public JButton jButtonid_dato_formulario_rentaFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_forma_pagoFormularioRentaExtra;
	public JLabel jLabelid_forma_pagoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_forma_pagoFormularioRentaExtra;
	public JButton jButtonid_forma_pagoFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_forma_pagoFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_forma_pagoFormularioRentaExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoFormularioRentaExtra;
	public JLabel jLabelid_bancoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFormularioRentaExtra;
	public JButton jButtonid_bancoFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_bancoFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_bancoFormularioRentaExtraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormularioRentaExtra;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1350;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormularioRentaExtraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormularioRentaExtra=new JPanel();
				this.jPanelAccionesFormularioFormularioRentaExtra=new JPanel();
				this.jmenuBarDetalleFormularioRentaExtra=new JMenuBar();
				this.jTtoolBarDetalleFormularioRentaExtra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormularioRentaExtraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormularioRentaExtra() {
		return this.jButtonActualizarToolBarFormularioRentaExtra;
	}
	
	public JButton getjButtonEliminarToolBarFormularioRentaExtra() {
		return this.jButtonEliminarToolBarFormularioRentaExtra;
	}
	
	public JButton getjButtonCancelarToolBarFormularioRentaExtra() {
		return this.jButtonCancelarToolBarFormularioRentaExtra;
	}		
	
	public JButton getjButtonProcesarInformacionFormularioRentaExtra() {
		return this.jButtonProcesarInformacionFormularioRentaExtra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRentaExtra)	{
		this.jButtonProcesarInformacionFormularioRentaExtra = jButtonProcesarInformacionFormularioRentaExtra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRentaExtra() {
		return this.jComboBoxTiposAccionesFormularioRentaExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRentaExtra(
			JComboBox jComboBoxTiposRelacionesFormularioRentaExtra) {
		this.jComboBoxTiposRelacionesFormularioRentaExtra = jComboBoxTiposRelacionesFormularioRentaExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRentaExtra(
			JComboBox jComboBoxTiposAccionesFormularioRentaExtra) {
		this.jComboBoxTiposAccionesFormularioRentaExtra = jComboBoxTiposAccionesFormularioRentaExtra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormularioRentaExtra() {
		return this.jComboBoxTiposAccionesFormularioFormularioRentaExtra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormularioRentaExtra(
			JComboBox jComboBoxTiposAccionesFormularioFormularioRentaExtra) {
		this.jComboBoxTiposAccionesFormularioFormularioRentaExtra = jComboBoxTiposAccionesFormularioFormularioRentaExtra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		
		this.formulariorentaextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorentaextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorentaextraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRentaExtraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta Extra MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
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
	
		FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormularioRentaExtra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormularioRentaExtra=new JButtonMe();
				this.jButtonModificarToolBarFormularioRentaExtra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormularioRentaExtra,this.jTtoolBarDetalleFormularioRentaExtra,
							"actualizar","actualizar","Actualizar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormularioRentaExtra,this.jTtoolBarDetalleFormularioRentaExtra,
							"eliminar","eliminar","Eliminar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormularioRentaExtra,this.jTtoolBarDetalleFormularioRentaExtra,
							"cancelar","cancelar","Cancelar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormularioRentaExtra,this.jTtoolBarDetalleFormularioRentaExtra,
							"guardarcambios","guardarcambios","Guardar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormularioRentaExtra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormularioRentaExtra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormularioRentaExtra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormularioRentaExtra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormularioRentaExtra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRentaExtra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRentaExtra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRentaExtra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormularioRentaExtra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormularioRentaExtra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormularioRentaExtra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormularioRentaExtra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormularioRentaExtra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormularioRentaExtra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormularioRentaExtra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormularioRentaExtra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormularioRentaExtra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormularioRentaExtra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormularioRentaExtra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormularioRentaExtra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormularioRentaExtra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRentaExtra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRentaExtra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRentaExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRentaExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRentaExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormularioRentaExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormularioRentaExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormularioRentaExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRentaExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRentaExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRentaExtra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRentaExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRentaExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRentaExtra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormularioRentaExtra.add(this.jMenuItemDetalleCerrarFormularioRentaExtra);
		
		this.jmenuDetalleAccionesFormularioRentaExtra.add(this.jMenuItemActualizarFormularioRentaExtra);
		this.jmenuDetalleAccionesFormularioRentaExtra.add(this.jMenuItemEliminarFormularioRentaExtra);
		this.jmenuDetalleAccionesFormularioRentaExtra.add(this.jMenuItemCancelarFormularioRentaExtra);		
		
		//this.jmenuDetalleDatosFormularioRentaExtra.add(this.jMenuItemDetalleAbrirOrderByFormularioRentaExtra);				
		this.jmenuDetalleDatosFormularioRentaExtra.add(this.jMenuItemDetalleMostarOcultarFormularioRentaExtra);				
				
		//this.jmenuDetalleAccionesFormularioRentaExtra.add(this.jMenuItemGuardarCambiosFormularioRentaExtra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormularioRentaExtra.add(this.jmenuDetalleArchivoFormularioRentaExtra);		
		this.jmenuBarDetalleFormularioRentaExtra.add(this.jmenuDetalleAccionesFormularioRentaExtra);		
		this.jmenuBarDetalleFormularioRentaExtra.add(this.jmenuDetalleDatosFormularioRentaExtra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormularioRentaExtra);				
	}
	
	
	public void inicializarElementosCamposFormularioRentaExtra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormularioRentaExtra = new JLabelMe();
		jLabelIdFormularioRentaExtra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormularioRentaExtra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormularioRentaExtra= new GridBagLayout();

		this.jPanelidFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);

		jLabelidFormularioRentaExtra = new JLabel();
		jLabelidFormularioRentaExtra.setText("Id");

		jLabelidFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelpago_previoFormularioRentaExtra = new JLabelMe();
		this.jLabelpago_previoFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_PAGOPREVIO+" : *");
		this.jLabelpago_previoFormularioRentaExtra.setToolTipText("Pago Previo");
		this.jLabelpago_previoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpago_previoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpago_previoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpago_previoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpago_previoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpago_previoFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_PAGOPREVIO);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelpago_previoFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldpago_previoFormularioRentaExtra= new JTextFieldMe();
		jTextFieldpago_previoFormularioRentaExtra.setEnabled(false);
		jTextFieldpago_previoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpago_previoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpago_previoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpago_previoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpago_previoFormularioRentaExtra.setText("0.0");

		this.jButtonpago_previoFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpago_previoFormularioRentaExtraBusqueda.setText("U");
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpago_previoFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpago_previoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpago_previoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pago_previoFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpago_previoFormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelinteres_moraFormularioRentaExtra = new JLabelMe();
		this.jLabelinteres_moraFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_INTERESMORA+" : *");
		this.jLabelinteres_moraFormularioRentaExtra.setToolTipText("Interes Mora");
		this.jLabelinteres_moraFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteres_moraFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteres_moraFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteres_moraFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteres_moraFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteres_moraFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_INTERESMORA);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelinteres_moraFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldinteres_moraFormularioRentaExtra= new JTextFieldMe();
		jTextFieldinteres_moraFormularioRentaExtra.setEnabled(false);
		jTextFieldinteres_moraFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteres_moraFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteres_moraFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteres_moraFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteres_moraFormularioRentaExtra.setText("0.0");

		this.jButtoninteres_moraFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteres_moraFormularioRentaExtraBusqueda.setText("U");
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteres_moraFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteres_moraFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteres_moraFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interes_moraFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteres_moraFormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_multaFormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_multaFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORMULTA+" : *");
		this.jLabelvalor_multaFormularioRentaExtra.setToolTipText("Valor Multa");
		this.jLabelvalor_multaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_multaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_multaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_multaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_multaFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_multaFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORMULTA);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_multaFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_multaFormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_multaFormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_multaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_multaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_multaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_multaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_multaFormularioRentaExtra.setText("0.0");

		this.jButtonvalor_multaFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_multaFormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_multaFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_multaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_multaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_multaFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_multaFormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelforma_pago1FormularioRentaExtra = new JLabelMe();
		this.jLabelforma_pago1FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO1+" : *");
		this.jLabelforma_pago1FormularioRentaExtra.setToolTipText("Forma Pago1");
		this.jLabelforma_pago1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pago1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pago1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelforma_pago1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelforma_pago1FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelforma_pago1FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO1);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelforma_pago1FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldforma_pago1FormularioRentaExtra= new JTextFieldMe();
		jTextFieldforma_pago1FormularioRentaExtra.setEnabled(false);
		jTextFieldforma_pago1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pago1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pago1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldforma_pago1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldforma_pago1FormularioRentaExtra.setText("0.0");

		this.jButtonforma_pago1FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonforma_pago1FormularioRentaExtraBusqueda.setText("U");
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonforma_pago1FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldforma_pago1FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldforma_pago1FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"forma_pago1FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonforma_pago1FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelforma_pago2FormularioRentaExtra = new JLabelMe();
		this.jLabelforma_pago2FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO2+" : *");
		this.jLabelforma_pago2FormularioRentaExtra.setToolTipText("Forma Pago2");
		this.jLabelforma_pago2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pago2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pago2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelforma_pago2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelforma_pago2FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelforma_pago2FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO2);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelforma_pago2FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldforma_pago2FormularioRentaExtra= new JTextFieldMe();
		jTextFieldforma_pago2FormularioRentaExtra.setEnabled(false);
		jTextFieldforma_pago2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pago2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pago2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldforma_pago2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldforma_pago2FormularioRentaExtra.setText("0.0");

		this.jButtonforma_pago2FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonforma_pago2FormularioRentaExtraBusqueda.setText("U");
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonforma_pago2FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldforma_pago2FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldforma_pago2FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"forma_pago2FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonforma_pago2FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nota_credito1FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_nota_credito1FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO1+" : *");
		this.jLabelnumero_nota_credito1FormularioRentaExtra.setToolTipText("Numero Nota Credito1");
		this.jLabelnumero_nota_credito1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nota_credito1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nota_credito1FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nota_credito1FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO1);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_nota_credito1FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_nota_credito1FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_nota_credito1FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_nota_credito1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nota_credito1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nota_credito1FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nota_credito1FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nota_credito1FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nota_credito1FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nota_credito2FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_nota_credito2FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO2+" : *");
		this.jLabelnumero_nota_credito2FormularioRentaExtra.setToolTipText("Numero Nota Credito2");
		this.jLabelnumero_nota_credito2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nota_credito2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nota_credito2FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nota_credito2FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO2);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_nota_credito2FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_nota_credito2FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_nota_credito2FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_nota_credito2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nota_credito2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nota_credito2FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nota_credito2FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nota_credito2FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nota_credito2FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nota_credito3FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_nota_credito3FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO3+" : *");
		this.jLabelnumero_nota_credito3FormularioRentaExtra.setToolTipText("Numero Nota Credito3");
		this.jLabelnumero_nota_credito3FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito3FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito3FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nota_credito3FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nota_credito3FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nota_credito3FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO3);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_nota_credito3FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_nota_credito3FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_nota_credito3FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_nota_credito3FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito3FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito3FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nota_credito3FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nota_credito3FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nota_credito3FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nota_credito3FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nota_credito3FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nota_credito4FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_nota_credito4FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO4+" : *");
		this.jLabelnumero_nota_credito4FormularioRentaExtra.setToolTipText("Numero Nota Credito4");
		this.jLabelnumero_nota_credito4FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito4FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_nota_credito4FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nota_credito4FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nota_credito4FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nota_credito4FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO4);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_nota_credito4FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_nota_credito4FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_nota_credito4FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_nota_credito4FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito4FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nota_credito4FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nota_credito4FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nota_credito4FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nota_credito4FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nota_credito4FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nota_credito4FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_nota_credito1FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_nota_credito1FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO1+" : *");
		this.jLabelvalor_nota_credito1FormularioRentaExtra.setToolTipText("Valor Nota Credito1");
		this.jLabelvalor_nota_credito1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_nota_credito1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_nota_credito1FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_nota_credito1FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO1);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_nota_credito1FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_nota_credito1FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_nota_credito1FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_nota_credito1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_nota_credito1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_nota_credito1FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_nota_credito1FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_nota_credito1FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_nota_credito1FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_nota_credito1FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_nota_credito2FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_nota_credito2FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO2+" : *");
		this.jLabelvalor_nota_credito2FormularioRentaExtra.setToolTipText("Valor Nota Credito2");
		this.jLabelvalor_nota_credito2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_nota_credito2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_nota_credito2FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_nota_credito2FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO2);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_nota_credito2FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_nota_credito2FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_nota_credito2FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_nota_credito2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_nota_credito2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_nota_credito2FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_nota_credito2FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_nota_credito2FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_nota_credito2FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_nota_credito2FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_nota_credito3FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_nota_credito3FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO3+" : *");
		this.jLabelvalor_nota_credito3FormularioRentaExtra.setToolTipText("Valor Nota Credito3");
		this.jLabelvalor_nota_credito3FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito3FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito3FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_nota_credito3FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_nota_credito3FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_nota_credito3FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO3);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_nota_credito3FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_nota_credito3FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_nota_credito3FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_nota_credito3FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito3FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito3FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_nota_credito3FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_nota_credito3FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_nota_credito3FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_nota_credito3FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_nota_credito3FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_nota_credito3FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_nota_credito4FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_nota_credito4FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO4+" : *");
		this.jLabelvalor_nota_credito4FormularioRentaExtra.setToolTipText("Valor Nota Credito4");
		this.jLabelvalor_nota_credito4FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito4FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_nota_credito4FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_nota_credito4FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_nota_credito4FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_nota_credito4FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO4);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_nota_credito4FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_nota_credito4FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_nota_credito4FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_nota_credito4FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito4FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_nota_credito4FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_nota_credito4FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_nota_credito4FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_nota_credito4FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_nota_credito4FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_nota_credito4FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_nota_credito4FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobante1FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_comprobante1FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE1+" : *");
		this.jLabelnumero_comprobante1FormularioRentaExtra.setToolTipText("Numero Comprobante1");
		this.jLabelnumero_comprobante1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobante1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobante1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobante1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobante1FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobante1FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE1);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_comprobante1FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_comprobante1FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_comprobante1FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_comprobante1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobante1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobante1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobante1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobante1FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobante1FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobante1FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobante1FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobante2FormularioRentaExtra = new JLabelMe();
		this.jLabelnumero_comprobante2FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE2+" : *");
		this.jLabelnumero_comprobante2FormularioRentaExtra.setToolTipText("Numero Comprobante2");
		this.jLabelnumero_comprobante2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobante2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobante2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobante2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobante2FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobante2FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE2);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelnumero_comprobante2FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldnumero_comprobante2FormularioRentaExtra= new JTextFieldMe();

		jTextFieldnumero_comprobante2FormularioRentaExtra.setEnabled(false);
		jTextFieldnumero_comprobante2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobante2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobante2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobante2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setText("U");
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobante2FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobante2FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobante2FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobante2FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comprobante1FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_comprobante1FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE1+" : *");
		this.jLabelvalor_comprobante1FormularioRentaExtra.setToolTipText("Valor Comprobante1");
		this.jLabelvalor_comprobante1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comprobante1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comprobante1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comprobante1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comprobante1FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comprobante1FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE1);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_comprobante1FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_comprobante1FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_comprobante1FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_comprobante1FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comprobante1FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comprobante1FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comprobante1FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comprobante1FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comprobante1FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comprobante1FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comprobante1FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comprobante1FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comprobante2FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor_comprobante2FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE2+" : *");
		this.jLabelvalor_comprobante2FormularioRentaExtra.setToolTipText("Valor Comprobante2");
		this.jLabelvalor_comprobante2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comprobante2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comprobante2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comprobante2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comprobante2FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comprobante2FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE2);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor_comprobante2FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor_comprobante2FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor_comprobante2FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor_comprobante2FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comprobante2FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comprobante2FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comprobante2FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comprobante2FormularioRentaExtra.setText("0.0");

		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comprobante2FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comprobante2FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comprobante2FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comprobante2FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor301FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor301FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR301+" : *");
		this.jLabelvalor301FormularioRentaExtra.setToolTipText("Valor301");
		this.jLabelvalor301FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor301FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor301FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor301FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor301FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor301FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR301);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor301FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor301FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor301FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor301FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor301FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor301FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor301FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor301FormularioRentaExtra.setText("0.0");

		this.jButtonvalor301FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor301FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor301FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor301FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor301FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor301FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor301FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor301FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor301FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor301FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor301FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor301FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor303FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor303FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR303+" : *");
		this.jLabelvalor303FormularioRentaExtra.setToolTipText("Valor303");
		this.jLabelvalor303FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor303FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor303FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor303FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor303FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor303FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR303);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor303FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor303FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor303FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor303FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor303FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor303FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor303FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor303FormularioRentaExtra.setText("0.0");

		this.jButtonvalor303FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor303FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor303FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor303FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor303FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor303FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor303FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor303FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor303FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor303FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor303FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor303FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor305FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor305FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR305+" : *");
		this.jLabelvalor305FormularioRentaExtra.setToolTipText("Valor305");
		this.jLabelvalor305FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor305FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor305FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor305FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor305FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor305FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR305);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor305FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor305FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor305FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor305FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor305FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor305FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor305FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor305FormularioRentaExtra.setText("0.0");

		this.jButtonvalor305FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor305FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor305FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor305FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor305FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor305FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor305FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor305FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor305FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor305FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor305FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor305FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor307FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor307FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR307+" : *");
		this.jLabelvalor307FormularioRentaExtra.setToolTipText("Valor307");
		this.jLabelvalor307FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor307FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor307FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor307FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor307FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor307FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR307);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor307FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor307FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor307FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor307FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor307FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor307FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor307FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor307FormularioRentaExtra.setText("0.0");

		this.jButtonvalor307FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor307FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor307FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor307FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor307FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor307FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor307FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor307FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor307FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor307FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor307FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor307FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor351FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor351FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR351+" : *");
		this.jLabelvalor351FormularioRentaExtra.setToolTipText("Valor351");
		this.jLabelvalor351FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor351FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor351FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor351FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor351FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor351FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR351);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor351FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor351FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor351FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor351FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor351FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor351FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor351FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor351FormularioRentaExtra.setText("0.0");

		this.jButtonvalor351FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor351FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor351FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor351FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor351FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor351FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor351FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor351FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor351FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor351FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor351FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor351FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor355FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor355FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR355+" : *");
		this.jLabelvalor355FormularioRentaExtra.setToolTipText("Valor355");
		this.jLabelvalor355FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor355FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor355FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor355FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor355FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor355FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR355);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor355FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor355FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor355FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor355FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor355FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor355FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor355FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor355FormularioRentaExtra.setText("0.0");

		this.jButtonvalor355FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor355FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor355FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor355FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor355FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor355FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor355FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor355FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor355FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor355FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor355FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor355FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor357FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor357FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR357+" : *");
		this.jLabelvalor357FormularioRentaExtra.setToolTipText("Valor357");
		this.jLabelvalor357FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor357FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor357FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor357FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor357FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor357FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR357);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor357FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor357FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor357FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor357FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor357FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor357FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor357FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor357FormularioRentaExtra.setText("0.0");

		this.jButtonvalor357FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor357FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor357FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor357FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor357FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor357FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor357FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor357FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor357FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor357FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor357FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor357FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor359FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor359FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR359+" : *");
		this.jLabelvalor359FormularioRentaExtra.setToolTipText("Valor359");
		this.jLabelvalor359FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor359FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor359FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor359FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor359FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor359FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR359);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor359FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor359FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor359FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor359FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor359FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor359FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor359FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor359FormularioRentaExtra.setText("0.0");

		this.jButtonvalor359FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor359FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor359FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor359FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor359FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor359FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor359FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor359FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor359FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor359FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor359FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor359FormularioRentaExtraBusqueda.setVisible(false);		}


					
		this.jLabelvalor361FormularioRentaExtra = new JLabelMe();
		this.jLabelvalor361FormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_VALOR361+" : *");
		this.jLabelvalor361FormularioRentaExtra.setToolTipText("Valor361");
		this.jLabelvalor361FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor361FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor361FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor361FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor361FormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor361FormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_VALOR361);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelvalor361FormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jTextFieldvalor361FormularioRentaExtra= new JTextFieldMe();
		jTextFieldvalor361FormularioRentaExtra.setEnabled(false);
		jTextFieldvalor361FormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor361FormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor361FormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor361FormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor361FormularioRentaExtra.setText("0.0");

		this.jButtonvalor361FormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonvalor361FormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor361FormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor361FormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor361FormularioRentaExtraBusqueda.setText("U");
		this.jButtonvalor361FormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor361FormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor361FormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor361FormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor361FormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor361FormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor361FormularioRentaExtraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormularioRentaExtra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormularioRentaExtra = new JLabelMe();
		this.jLabelid_empresaFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormularioRentaExtra.setToolTipText("Empresa");
		this.jLabelid_empresaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_empresaFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_empresaFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_empresaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormularioRentaExtra.setEnabled(false);

		this.jButtonid_empresaFormularioRentaExtra= new JButtonMe();
		this.jButtonid_empresaFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRentaExtra.setText("Buscar");
		this.jButtonid_empresaFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRentaExtra"));

		this.jButtonid_empresaFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_empresaFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_empresaFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRentaExtraUpdate"));



					
		this.jLabelid_ejercicioFormularioRentaExtra = new JLabelMe();
		this.jLabelid_ejercicioFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormularioRentaExtra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_ejercicioFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_ejercicioFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_ejercicioFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormularioRentaExtra.setEnabled(false);

		this.jButtonid_ejercicioFormularioRentaExtra= new JButtonMe();
		this.jButtonid_ejercicioFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRentaExtra.setText("Buscar");
		this.jButtonid_ejercicioFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRentaExtra"));

		this.jButtonid_ejercicioFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_ejercicioFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRentaExtraUpdate"));



					
		this.jLabelid_periodoFormularioRentaExtra = new JLabelMe();
		this.jLabelid_periodoFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormularioRentaExtra.setToolTipText("Periodo");
		this.jLabelid_periodoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_periodoFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_periodoFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_periodoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormularioRentaExtra.setEnabled(false);

		this.jButtonid_periodoFormularioRentaExtra= new JButtonMe();
		this.jButtonid_periodoFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRentaExtra.setText("Buscar");
		this.jButtonid_periodoFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRentaExtra"));

		this.jButtonid_periodoFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_periodoFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_periodoFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRentaExtraUpdate"));



					
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra = new JLabelMe();
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDDATOFORMULARIORENTA+" : *");
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra.setToolTipText("Dato Formulario Renta");
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_dato_formulario_rentaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_rentaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_dato_formulario_rentaFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_dato_formulario_rentaFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDDATOFORMULARIORENTA);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_dato_formulario_rentaFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_dato_formulario_rentaFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_rentaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_dato_formulario_rentaFormularioRentaExtra= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setText("Buscar");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRentaExtra"));

		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRentaExtraUpdate"));



					
		this.jLabelid_forma_pagoFormularioRentaExtra = new JLabelMe();
		this.jLabelid_forma_pagoFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDFORMAPAGO+" : *");
		this.jLabelid_forma_pagoFormularioRentaExtra.setToolTipText("Forma Pago");
		this.jLabelid_forma_pagoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_forma_pagoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_forma_pagoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_forma_pagoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_forma_pagoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_forma_pagoFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDFORMAPAGO);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_forma_pagoFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_forma_pagoFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_forma_pagoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_forma_pagoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_forma_pagoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_forma_pagoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_forma_pagoFormularioRentaExtra= new JButtonMe();
		this.jButtonid_forma_pagoFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_forma_pagoFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_forma_pagoFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_forma_pagoFormularioRentaExtra.setText("Buscar");
		this.jButtonid_forma_pagoFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_forma_pagoFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_forma_pagoFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_forma_pagoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_forma_pagoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_forma_pagoFormularioRentaExtra"));

		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_forma_pagoFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_forma_pagoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_forma_pagoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_forma_pagoFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_forma_pagoFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_forma_pagoFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_forma_pagoFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_forma_pagoFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_forma_pagoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_forma_pagoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_forma_pagoFormularioRentaExtraUpdate"));



					
		this.jLabelid_bancoFormularioRentaExtra = new JLabelMe();
		this.jLabelid_bancoFormularioRentaExtra.setText(""+FormularioRentaExtraConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoFormularioRentaExtra.setToolTipText("Banco");
		this.jLabelid_bancoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoFormularioRentaExtra.setToolTipText(FormularioRentaExtraConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		this.jPanelid_bancoFormularioRentaExtra.setLayout(this.gridaBagLayoutFormularioRentaExtra);


		jComboBoxid_bancoFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_bancoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoFormularioRentaExtra= new JButtonMe();
		this.jButtonid_bancoFormularioRentaExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormularioRentaExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormularioRentaExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormularioRentaExtra.setText("Buscar");
		this.jButtonid_bancoFormularioRentaExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoFormularioRentaExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormularioRentaExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormularioRentaExtra"));

		this.jButtonid_bancoFormularioRentaExtraBusqueda= new JButtonMe();
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoFormularioRentaExtraBusqueda.setText("U");
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormularioRentaExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormularioRentaExtraBusqueda"));

		if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoFormularioRentaExtraBusqueda.setVisible(false);		}

		this.jButtonid_bancoFormularioRentaExtraUpdate= new JButtonMe();
		this.jButtonid_bancoFormularioRentaExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormularioRentaExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormularioRentaExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoFormularioRentaExtraUpdate.setText("U");
		this.jButtonid_bancoFormularioRentaExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoFormularioRentaExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormularioRentaExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoFormularioRentaExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormularioRentaExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormularioRentaExtraUpdate"));



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
		//this.jInternalFrameDetalleFormularioRentaExtra = new FormularioRentaExtraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formulario Renta Extra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRentaExtra= new GridBagLayout();
		

		
		String sToolTipFormularioRentaExtra="";
		sToolTipFormularioRentaExtra=FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRentaExtra+="(Contabilidad.FormularioRentaExtra)";
		}
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRentaExtra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormularioRentaExtra = new JButtonMe();
		this.jButtonModificarFormularioRentaExtra = new JButtonMe();
        this.jButtonActualizarFormularioRentaExtra = new JButtonMe();
        this.jButtonEliminarFormularioRentaExtra = new JButtonMe();
        this.jButtonCancelarFormularioRentaExtra = new JButtonMe();
        this.jButtonGuardarCambiosFormularioRentaExtra = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormularioRentaExtra = new JButtonMe();
		this.jButtonCerrarFormularioRentaExtra = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRentaExtra = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormularioRentaExtra = new JScrollPane();
		this.jScrollPanelDatosGeneralFormularioRentaExtra = new JScrollPane();
				
		
		
		this.jPanelCamposFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta Extra";
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRentaExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormularioRentaExtra.setName("jPanelCamposFormularioRentaExtra"); 

		this.jPanelCamposOcultosFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormularioRentaExtra.setName("jPanelCamposOcultosFormularioRentaExtra"); 

        this.jPanelAccionesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRentaExtra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRentaExtra.setName("Acciones"); 

		this.jPanelAccionesFormularioFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormularioRentaExtra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormularioRentaExtra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormularioRentaExtra.setText("Nuevo");
		this.jButtonModificarFormularioRentaExtra.setText("Editar");
        this.jButtonActualizarFormularioRentaExtra.setText("Actualizar");
        this.jButtonEliminarFormularioRentaExtra.setText("Eliminar");
        this.jButtonCancelarFormularioRentaExtra.setText("Cancelar");
        this.jButtonGuardarCambiosFormularioRentaExtra.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.setText("Guardar");
		this.jButtonCerrarFormularioRentaExtra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRentaExtra,"nuevo_button","Nuevo",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormularioRentaExtra,"modificar_button","Editar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormularioRentaExtra,"actualizar_button","Actualizar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormularioRentaExtra,"eliminar_button","Eliminar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormularioRentaExtra,"cancelar_button","Cancelar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormularioRentaExtra,"guardarcambios_button","Guardar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRentaExtra,"guardarcambiostabla_button","Guardar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRentaExtra,"cerrar_button","Salir",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormularioRentaExtra.setToolTipText("Nuevo"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormularioRentaExtra.setToolTipText("Editar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormularioRentaExtra.setToolTipText("Actualizar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormularioRentaExtra.setToolTipText("Eliminar)"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormularioRentaExtra.setToolTipText("Cancelar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormularioRentaExtra.setToolTipText("Guardar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.setToolTipText("Guardar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRentaExtra.setToolTipText("Salir"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRentaExtra";
		inputMap = this.jButtonNuevoFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRentaExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRentaExtra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormularioRentaExtra";
		inputMap = this.jButtonActualizarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormularioRentaExtra"));
		
		//ELIMINAR
		sMapKey = "EliminarFormularioRentaExtra";
		inputMap = this.jButtonEliminarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormularioRentaExtra"));
		
		//CANCELAR	
		sMapKey = "CancelarFormularioRentaExtra";
		inputMap = this.jButtonCancelarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormularioRentaExtra"));
		
		//CERRAR		
		sMapKey = "CerrarFormularioRentaExtra";
		inputMap = this.jButtonCerrarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRentaExtra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRentaExtra";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRentaExtra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormularioRentaExtra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormularioRentaExtra.setToolTipText("Nuevo FormularioRentaExtra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormularioRentaExtra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormularioRentaExtra.setToolTipText("Sin Cerrar Ventana FormularioRentaExtra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormularioRentaExtra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormularioRentaExtra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRentaExtra.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRentaExtra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormularioRentaExtra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormularioRentaExtra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormularioRentaExtra = new JLabelMe();
		
		this.jLabelAccionesFormularioRentaExtra.setText("Acciones");		
		this.jLabelAccionesFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormularioRentaExtra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormularioRentaExtra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormularioRentaExtra=new JTabbedPane();
		this.jTabbedPaneRelacionesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRentaExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRentaExtra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormularioRentaExtra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormularioRentaExtra = new GridBagLayout();
		
		this.jPanelCamposFormularioRentaExtra.setLayout(gridaBagLayoutCamposFormularioRentaExtra);
		this.jPanelCamposOcultosFormularioRentaExtra.setLayout(gridaBagLayoutCamposOcultosFormularioRentaExtra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormularioRentaExtra.add(jLabelIdFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormularioRentaExtra.add(jLabelidFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormularioRentaExtra.add(jLabelid_empresaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRentaExtra.add(jButtonid_empresaFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRentaExtra.add(jButtonid_empresaFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormularioRentaExtra.add(jComboBoxid_empresaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormularioRentaExtra.add(jLabelid_ejercicioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRentaExtra.add(jButtonid_ejercicioFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRentaExtra.add(jButtonid_ejercicioFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormularioRentaExtra.add(jComboBoxid_ejercicioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormularioRentaExtra.add(jLabelid_periodoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioRentaExtra.add(jButtonid_periodoFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioRentaExtra.add(jButtonid_periodoFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormularioRentaExtra.add(jComboBoxid_periodoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_dato_formulario_rentaFormularioRentaExtra.add(jLabelid_dato_formulario_rentaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_rentaFormularioRentaExtra.add(jButtonid_dato_formulario_rentaFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_rentaFormularioRentaExtra.add(jButtonid_dato_formulario_rentaFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_dato_formulario_rentaFormularioRentaExtra.add(jComboBoxid_dato_formulario_rentaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_forma_pagoFormularioRentaExtra.add(jLabelid_forma_pagoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_forma_pagoFormularioRentaExtra.add(jButtonid_forma_pagoFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_forma_pagoFormularioRentaExtra.add(jButtonid_forma_pagoFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_forma_pagoFormularioRentaExtra.add(jComboBoxid_forma_pagoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoFormularioRentaExtra.add(jLabelid_bancoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoFormularioRentaExtra.add(jButtonid_bancoFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 3;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoFormularioRentaExtra.add(jButtonid_bancoFormularioRentaExtraUpdate, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoFormularioRentaExtra.add(jComboBoxid_bancoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpago_previoFormularioRentaExtra.add(jLabelpago_previoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelpago_previoFormularioRentaExtra.add(jButtonpago_previoFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpago_previoFormularioRentaExtra.add(jTextFieldpago_previoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteres_moraFormularioRentaExtra.add(jLabelinteres_moraFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteres_moraFormularioRentaExtra.add(jButtoninteres_moraFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteres_moraFormularioRentaExtra.add(jTextFieldinteres_moraFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_multaFormularioRentaExtra.add(jLabelvalor_multaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_multaFormularioRentaExtra.add(jButtonvalor_multaFormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_multaFormularioRentaExtra.add(jTextFieldvalor_multaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelforma_pago1FormularioRentaExtra.add(jLabelforma_pago1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelforma_pago1FormularioRentaExtra.add(jButtonforma_pago1FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelforma_pago1FormularioRentaExtra.add(jTextFieldforma_pago1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelforma_pago2FormularioRentaExtra.add(jLabelforma_pago2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelforma_pago2FormularioRentaExtra.add(jButtonforma_pago2FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelforma_pago2FormularioRentaExtra.add(jTextFieldforma_pago2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nota_credito1FormularioRentaExtra.add(jLabelnumero_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nota_credito1FormularioRentaExtra.add(jButtonnumero_nota_credito1FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nota_credito1FormularioRentaExtra.add(jTextFieldnumero_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nota_credito2FormularioRentaExtra.add(jLabelnumero_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nota_credito2FormularioRentaExtra.add(jButtonnumero_nota_credito2FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nota_credito2FormularioRentaExtra.add(jTextFieldnumero_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nota_credito3FormularioRentaExtra.add(jLabelnumero_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nota_credito3FormularioRentaExtra.add(jButtonnumero_nota_credito3FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nota_credito3FormularioRentaExtra.add(jTextFieldnumero_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nota_credito4FormularioRentaExtra.add(jLabelnumero_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nota_credito4FormularioRentaExtra.add(jButtonnumero_nota_credito4FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nota_credito4FormularioRentaExtra.add(jTextFieldnumero_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_nota_credito1FormularioRentaExtra.add(jLabelvalor_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_nota_credito1FormularioRentaExtra.add(jButtonvalor_nota_credito1FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_nota_credito1FormularioRentaExtra.add(jTextFieldvalor_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_nota_credito2FormularioRentaExtra.add(jLabelvalor_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_nota_credito2FormularioRentaExtra.add(jButtonvalor_nota_credito2FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_nota_credito2FormularioRentaExtra.add(jTextFieldvalor_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_nota_credito3FormularioRentaExtra.add(jLabelvalor_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_nota_credito3FormularioRentaExtra.add(jButtonvalor_nota_credito3FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_nota_credito3FormularioRentaExtra.add(jTextFieldvalor_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_nota_credito4FormularioRentaExtra.add(jLabelvalor_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_nota_credito4FormularioRentaExtra.add(jButtonvalor_nota_credito4FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_nota_credito4FormularioRentaExtra.add(jTextFieldvalor_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobante1FormularioRentaExtra.add(jLabelnumero_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobante1FormularioRentaExtra.add(jButtonnumero_comprobante1FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobante1FormularioRentaExtra.add(jTextFieldnumero_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobante2FormularioRentaExtra.add(jLabelnumero_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobante2FormularioRentaExtra.add(jButtonnumero_comprobante2FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobante2FormularioRentaExtra.add(jTextFieldnumero_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comprobante1FormularioRentaExtra.add(jLabelvalor_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comprobante1FormularioRentaExtra.add(jButtonvalor_comprobante1FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comprobante1FormularioRentaExtra.add(jTextFieldvalor_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comprobante2FormularioRentaExtra.add(jLabelvalor_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comprobante2FormularioRentaExtra.add(jButtonvalor_comprobante2FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comprobante2FormularioRentaExtra.add(jTextFieldvalor_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor301FormularioRentaExtra.add(jLabelvalor301FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor301FormularioRentaExtra.add(jButtonvalor301FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor301FormularioRentaExtra.add(jTextFieldvalor301FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor303FormularioRentaExtra.add(jLabelvalor303FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor303FormularioRentaExtra.add(jButtonvalor303FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor303FormularioRentaExtra.add(jTextFieldvalor303FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor305FormularioRentaExtra.add(jLabelvalor305FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor305FormularioRentaExtra.add(jButtonvalor305FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor305FormularioRentaExtra.add(jTextFieldvalor305FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor307FormularioRentaExtra.add(jLabelvalor307FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor307FormularioRentaExtra.add(jButtonvalor307FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor307FormularioRentaExtra.add(jTextFieldvalor307FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor351FormularioRentaExtra.add(jLabelvalor351FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor351FormularioRentaExtra.add(jButtonvalor351FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor351FormularioRentaExtra.add(jTextFieldvalor351FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor355FormularioRentaExtra.add(jLabelvalor355FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor355FormularioRentaExtra.add(jButtonvalor355FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor355FormularioRentaExtra.add(jTextFieldvalor355FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor357FormularioRentaExtra.add(jLabelvalor357FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor357FormularioRentaExtra.add(jButtonvalor357FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor357FormularioRentaExtra.add(jTextFieldvalor357FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor359FormularioRentaExtra.add(jLabelvalor359FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor359FormularioRentaExtra.add(jButtonvalor359FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor359FormularioRentaExtra.add(jTextFieldvalor359FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor361FormularioRentaExtra.add(jLabelvalor361FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 2;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
		this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor361FormularioRentaExtra.add(jButtonvalor361FormularioRentaExtraBusqueda, this.gridBagConstraintsFormularioRentaExtra);
	}

	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
	this.gridBagConstraintsFormularioRentaExtra.gridx = 1;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor361FormularioRentaExtra.add(jTextFieldvalor361FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelidFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelid_dato_formulario_rentaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelid_forma_pagoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelid_bancoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelpago_previoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelinteres_moraFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_multaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelforma_pago1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelforma_pago2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_nota_credito1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_nota_credito2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_nota_credito3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_nota_credito4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelnumero_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_comprobante1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor_comprobante2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor301FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor303FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor305FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor307FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor351FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor355FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor357FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor359FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRentaExtra.add(this.jPanelvalor361FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposFormularioRentaExtra % 4==0) {
		iXPanelCamposFormularioRentaExtra=0;
		iYPanelCamposFormularioRentaExtra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposOcultosFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposOcultosFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRentaExtra.add(this.jPanelid_empresaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposOcultosFormularioRentaExtra % 4==0) {
		iXPanelCamposOcultosFormularioRentaExtra=0;
		iYPanelCamposOcultosFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposOcultosFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposOcultosFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRentaExtra.add(this.jPanelid_ejercicioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposOcultosFormularioRentaExtra % 4==0) {
		iXPanelCamposOcultosFormularioRentaExtra=0;
		iYPanelCamposOcultosFormularioRentaExtra++;
	}
	this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRentaExtra.gridy = iYPanelCamposOcultosFormularioRentaExtra;
	this.gridBagConstraintsFormularioRentaExtra.gridx = iXPanelCamposOcultosFormularioRentaExtra++;
	this.gridBagConstraintsFormularioRentaExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRentaExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRentaExtra.add(this.jPanelid_periodoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);



	if(iXPanelCamposOcultosFormularioRentaExtra % 4==0) {
		iXPanelCamposOcultosFormularioRentaExtra=0;
		iYPanelCamposOcultosFormularioRentaExtra++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormularioRentaExtra= new GridBagLayout();
		this.jPanelAccionesFormularioRentaExtra.setLayout(gridaBagLayoutAccionesFormularioRentaExtra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormularioRentaExtra= new GridBagLayout();
		this.jPanelAccionesFormularioFormularioRentaExtra.setLayout(gridaBagLayoutAccionesFormularioFormularioRentaExtra);
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRentaExtra.add(this.jComboBoxTiposAccionesFormularioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRentaExtra.add(this.jCheckBoxPostAccionNuevoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formulariorentaextraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRentaExtra.add(this.jCheckBoxPostAccionSinCerrarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formulariorentaextraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRentaExtra.add(this.jCheckBoxPostAccionSinMensajeFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonModificarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);							

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonEliminarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonActualizarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonGuardarCambiosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);	
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;		
		this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonCancelarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRentaExtra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;		
			//this.gridBagConstraintsFormularioRentaExtra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRentaExtra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRentaExtra.gridx =0;
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRentaExtra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormularioRentaExtraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormularioRentaExtra = new FormularioRentaExtraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formulario Renta Extra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formulario Renta Extra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Renta Extra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormularioRentaExtraModel formulariorentaextraModel=new FormularioRentaExtraModel(this);
			
			//SI USARA CLASE INTERNA
			//FormularioRentaExtraModel.FormularioRentaExtraFocusTraversalPolicy formulariorentaextraFocusTraversalPolicy = formulariorentaextraModel.new FormularioRentaExtraFocusTraversalPolicy(this);
			
			//formulariorentaextraFocusTraversalPolicy.setformulariorentaextraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formulariorentaextraModel);
			
			
			this.jContentPaneDetalleFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormularioRentaExtra = new GridBagLayout();	
			this.jContentPaneDetalleFormularioRentaExtra.setLayout(gridaBagLayoutDetalleFormularioRentaExtra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRentaExtra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
				this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
					
				
				this.jContentPaneDetalleFormularioRentaExtra.add(jTtoolBarDetalleFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);								
				
}
			
			this.jScrollPanelDatosEdicionFormularioRentaExtra=   new JScrollPane(jContentPaneDetalleFormularioRentaExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormularioRentaExtra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	        
			this.jContentPaneDetalleFormularioRentaExtra.add(jPanelCamposFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);
			
			
			
			
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
						&& formulariorentaextraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formulariorentaextraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormularioRentaExtra= new GridBagConstraints();
						this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
						this.jContentPaneDetalleFormularioRentaExtra.add(this.jTabbedPaneRelacionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormularioRentaExtra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormularioRentaExtra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
					this.gridBagConstraintsFormularioRentaExtra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
					
				
					this.jContentPaneDetalleFormularioRentaExtra.add(jPanelCamposOcultosFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);
				
					this.jPanelCamposOcultosFormularioRentaExtra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	        this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormularioRentaExtra.add(this.jPanelAccionesFormularioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);							
			
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
	        this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
	        
			
			this.jContentPaneDetalleFormularioRentaExtra.add(this.jPanelAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormularioRentaExtra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormularioRentaExtra=   new JScrollPane(this.jPanelCamposFormularioRentaExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRentaExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormularioRentaExtra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormularioRentaExtra;//jContentPane;
		
		return jScrollPanelDatosEdicionFormularioRentaExtra;
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
