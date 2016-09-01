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
import com.bydan.erp.nomina.util.RubroEmpleaConstantesFunciones;

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
public class RubroEmpleaDetalleFormJInternalFrame extends RubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRubroEmplea;
	
	protected JMenuBar jmenuBarDetalleRubroEmplea;
	
	protected JMenu jmenuDetalleRubroEmplea;
	protected JMenu jmenuDetalleArchivoRubroEmplea;
	protected JMenu jmenuDetalleAccionesRubroEmplea;
	protected JMenu jmenuDetalleDatosRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsRubroEmplea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RubroEmpleaBeanSwingJInternalFrameAdditional jInternalFrameDetalleRubroEmplea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoCalculoBeanSwingJInternalFrame tipocalculoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalculo="";

	protected TipoRubroEmpleaBeanSwingJInternalFrame tiporubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporubroemplea="";

	protected TipoGrupoRubroEmpleaBeanSwingJInternalFrame tipogruporubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogruporubroemplea="";
	
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	
	

	public HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame=null;
	public HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHistorialPagoNomi=false;
	public HistorialPagoNomiSessionBean historialpagonomiSessionBean;

	public RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame=null;
	public RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEstructura=false;
	public RubroEstructuraSessionBean rubroestructuraSessionBean;

	public DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame=null;
	public DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefiProvisionEmpleado=false;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;

	public EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFrame=null;
	public EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoPagoRubro=false;
	public EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean;

	public HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame=null;
	public HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHistorialPagoMesNomi=false;
	public HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean;

	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame=null;
	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmpleado=false;
	public RubroEmpleadoSessionBean rubroempleadoSessionBean;

	public ValorRubroVariableBeanSwingJInternalFrame valorrubrovariableBeanSwingJInternalFrame=null;
	public ValorRubroVariableBeanSwingJInternalFrame valorrubrovariableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteValorRubroVariable=false;
	public ValorRubroVariableSessionBean valorrubrovariableSessionBean;

	public TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame=null;
	public TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoPrestamo=false;
	public TipoPrestamoSessionBean tipoprestamoSessionBean;

	public RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame=null;
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmpleaCuentaContable=false;
	public RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoCalculoSessionBean tipocalculoSessionBean;
	public TipoRubroEmpleaSessionBean tiporubroempleaSessionBean;
	public TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean;	
	
	public RubroEmpleaLogic rubroempleaLogic;
	
	public JScrollPane jScrollPanelDatosRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralRubroEmplea;
	
	protected JPanel jPanelCamposRubroEmplea;    
	protected JPanel jPanelCamposOcultosRubroEmplea;    	
	protected JPanel jPanelAccionesRubroEmplea;
	protected JPanel jPanelAccionesFormularioRubroEmplea;
    
	
	
	protected Integer iXPanelCamposRubroEmplea=0;
	protected Integer iYPanelCamposRubroEmplea=0;
	
	protected Integer iXPanelCamposOcultosRubroEmplea=0;
	protected Integer iYPanelCamposOcultosRubroEmplea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRubroEmplea;
	public JButton jButtonModificarRubroEmplea;
	public JButton jButtonActualizarRubroEmplea;
    public JButton jButtonEliminarRubroEmplea;
	public JButton jButtonCancelarRubroEmplea;
    public JButton jButtonGuardarCambiosRubroEmplea;
	public JButton jButtonGuardarCambiosTablaRubroEmplea;
	protected JButton jButtonCerrarRubroEmplea;
	
	
	protected JButton jButtonProcesarInformacionRubroEmplea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRubroEmplea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmplea;
	protected JButton jButtonModificarToolBarRubroEmplea;
	protected JButton jButtonActualizarToolBarRubroEmplea;
    protected JButton jButtonEliminarToolBarRubroEmplea;
	protected JButton jButtonCancelarToolBarRubroEmplea;
    protected JButton jButtonGuardarCambiosToolBarRubroEmplea;
	protected JButton jButtonGuardarCambiosTablaToolBarRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmplea;
	protected JButton jButtonCerrarToolBarRubroEmplea;
	
	protected JButton jButtonProcesarInformacionToolBarRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmplea;
	protected JMenuItem jMenuItemModificarRubroEmplea;
	protected JMenuItem jMenuItemActualizarRubroEmplea;
    protected JMenuItem jMenuItemEliminarRubroEmplea;
	protected JMenuItem jMenuItemCancelarRubroEmplea;
    protected JMenuItem jMenuItemGuardarCambiosRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmplea;
	protected JMenuItem jMenuItemCerrarRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmplea;
	
	protected JMenuItem jMenuItemProcesarInformacionRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmplea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmplea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRubroEmplea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRubroEmplea;
	public JLabel jLabelIdRubroEmplea;
	public JLabel jLabelidRubroEmplea;
	public JButton jButtonidRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoRubroEmplea;
	public JLabel jLabelcodigoRubroEmplea;
	public JTextField jTextFieldcodigoRubroEmplea;
	public JButton jButtoncodigoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelnombreRubroEmplea;
	public JLabel jLabelnombreRubroEmplea;
	public JTextArea jTextAreanombreRubroEmplea;
	public JScrollPane jscrollPanenombreRubroEmplea;
	public JButton jButtonnombreRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelformulaRubroEmplea;
	public JLabel jLabelformulaRubroEmplea;
	public JTextArea jTextAreaformulaRubroEmplea;
	public JScrollPane jscrollPaneformulaRubroEmplea;
	public JButton jButtonformulaRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelaliasRubroEmplea;
	public JLabel jLabelaliasRubroEmplea;
	public JTextField jTextFieldaliasRubroEmplea;
	public JButton jButtonaliasRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialRubroEmplea;
	public JLabel jLabelsecuencialRubroEmplea;
	public JTextField jTextFieldsecuencialRubroEmplea;
	public JButton jButtonsecuencialRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_rol_pagosRubroEmplea;
	public JLabel jLabelpara_rol_pagosRubroEmplea;
	public JCheckBox jCheckBoxpara_rol_pagosRubroEmplea;
	public JButton jButtonpara_rol_pagosRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_sueldoRubroEmplea;
	public JLabel jLabelpara_sueldoRubroEmplea;
	public JCheckBox jCheckBoxpara_sueldoRubroEmplea;
	public JButton jButtonpara_sueldoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_vacacionesRubroEmplea;
	public JLabel jLabelpara_vacacionesRubroEmplea;
	public JCheckBox jCheckBoxpara_vacacionesRubroEmplea;
	public JButton jButtonpara_vacacionesRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_impuesto_rentaRubroEmplea;
	public JLabel jLabelpara_impuesto_rentaRubroEmplea;
	public JCheckBox jCheckBoxpara_impuesto_rentaRubroEmplea;
	public JButton jButtonpara_impuesto_rentaRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_seguro_socialRubroEmplea;
	public JLabel jLabelpara_seguro_socialRubroEmplea;
	public JCheckBox jCheckBoxpara_seguro_socialRubroEmplea;
	public JButton jButtonpara_seguro_socialRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_provisionesRubroEmplea;
	public JLabel jLabelpara_provisionesRubroEmplea;
	public JCheckBox jCheckBoxpara_provisionesRubroEmplea;
	public JButton jButtonpara_provisionesRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_utilidadesRubroEmplea;
	public JLabel jLabelpara_utilidadesRubroEmplea;
	public JCheckBox jCheckBoxpara_utilidadesRubroEmplea;
	public JButton jButtonpara_utilidadesRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelpara_rubro_iessRubroEmplea;
	public JLabel jLabelpara_rubro_iessRubroEmplea;
	public JCheckBox jCheckBoxpara_rubro_iessRubroEmplea;
	public JButton jButtonpara_rubro_iessRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPaneles_fondo_reservaRubroEmplea;
	public JLabel jLabeles_fondo_reservaRubroEmplea;
	public JCheckBox jCheckBoxes_fondo_reservaRubroEmplea;
	public JButton jButtones_fondo_reservaRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPaneles_decimo_terceroRubroEmplea;
	public JLabel jLabeles_decimo_terceroRubroEmplea;
	public JCheckBox jCheckBoxes_decimo_terceroRubroEmplea;
	public JButton jButtones_decimo_terceroRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPaneles_decimo_cuartoRubroEmplea;
	public JLabel jLabeles_decimo_cuartoRubroEmplea;
	public JCheckBox jCheckBoxes_decimo_cuartoRubroEmplea;
	public JButton jButtones_decimo_cuartoRubroEmpleaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRubroEmplea;
	public JLabel jLabelid_empresaRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRubroEmplea;
	public JButton jButtonid_empresaRubroEmplea= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_calculoRubroEmplea;
	public JLabel jLabelid_tipo_calculoRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calculoRubroEmplea;
	public JButton jButtonid_tipo_calculoRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_calculoRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calculoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_rubro_empleaRubroEmplea;
	public JLabel jLabelid_tipo_rubro_empleaRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_rubro_empleaRubroEmplea;
	public JButton jButtonid_tipo_rubro_empleaRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_rubro_empleaRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_rubro_empleaRubroEmplea;
	public JLabel jLabelid_tipo_grupo_rubro_empleaRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea;
	public JButton jButtonid_tipo_grupo_rubro_empleaRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRubroEmplea;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RubroEmpleaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRubroEmplea=new JPanel();
				this.jPanelAccionesFormularioRubroEmplea=new JPanel();
				this.jmenuBarDetalleRubroEmplea=new JMenuBar();
				this.jTtoolBarDetalleRubroEmplea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RubroEmpleaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRubroEmplea() {
		return this.jButtonActualizarToolBarRubroEmplea;
	}
	
	public JButton getjButtonEliminarToolBarRubroEmplea() {
		return this.jButtonEliminarToolBarRubroEmplea;
	}
	
	public JButton getjButtonCancelarToolBarRubroEmplea() {
		return this.jButtonCancelarToolBarRubroEmplea;
	}		
	
	public JButton getjButtonProcesarInformacionRubroEmplea() {
		return this.jButtonProcesarInformacionRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmplea)	{
		this.jButtonProcesarInformacionRubroEmplea = jButtonProcesarInformacionRubroEmplea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmplea() {
		return this.jComboBoxTiposAccionesRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmplea(
			JComboBox jComboBoxTiposRelacionesRubroEmplea) {
		this.jComboBoxTiposRelacionesRubroEmplea = jComboBoxTiposRelacionesRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmplea(
			JComboBox jComboBoxTiposAccionesRubroEmplea) {
		this.jComboBoxTiposAccionesRubroEmplea = jComboBoxTiposAccionesRubroEmplea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRubroEmplea() {
		return this.jComboBoxTiposAccionesFormularioRubroEmplea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRubroEmplea(
			JComboBox jComboBoxTiposAccionesFormularioRubroEmplea) {
		this.jComboBoxTiposAccionesFormularioRubroEmplea = jComboBoxTiposAccionesFormularioRubroEmplea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rubroempleaSessionBean=new RubroEmpleaSessionBean();
		
		this.rubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		//this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		//this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		//this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		//this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		//this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		//this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		//this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		//this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Emplea MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
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
	
		RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRubroEmplea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRubroEmplea=new JButtonMe();
				this.jButtonModificarToolBarRubroEmplea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRubroEmplea,this.jTtoolBarDetalleRubroEmplea,
							"actualizar","actualizar","Actualizar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRubroEmplea,this.jTtoolBarDetalleRubroEmplea,
							"eliminar","eliminar","Eliminar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRubroEmplea,this.jTtoolBarDetalleRubroEmplea,
							"cancelar","cancelar","Cancelar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRubroEmplea,this.jTtoolBarDetalleRubroEmplea,
							"guardarcambios","guardarcambios","Guardar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRubroEmplea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRubroEmplea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRubroEmplea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRubroEmplea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRubroEmplea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRubroEmplea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRubroEmplea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRubroEmplea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRubroEmplea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRubroEmplea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRubroEmplea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRubroEmplea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRubroEmplea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRubroEmplea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRubroEmplea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRubroEmplea.add(this.jMenuItemDetalleCerrarRubroEmplea);
		
		this.jmenuDetalleAccionesRubroEmplea.add(this.jMenuItemActualizarRubroEmplea);
		this.jmenuDetalleAccionesRubroEmplea.add(this.jMenuItemEliminarRubroEmplea);
		this.jmenuDetalleAccionesRubroEmplea.add(this.jMenuItemCancelarRubroEmplea);		
		
		//this.jmenuDetalleDatosRubroEmplea.add(this.jMenuItemDetalleAbrirOrderByRubroEmplea);				
		this.jmenuDetalleDatosRubroEmplea.add(this.jMenuItemDetalleMostarOcultarRubroEmplea);				
				
		//this.jmenuDetalleAccionesRubroEmplea.add(this.jMenuItemGuardarCambiosRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRubroEmplea.add(this.jmenuDetalleArchivoRubroEmplea);		
		this.jmenuBarDetalleRubroEmplea.add(this.jmenuDetalleAccionesRubroEmplea);		
		this.jmenuBarDetalleRubroEmplea.add(this.jmenuDetalleDatosRubroEmplea);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRubroEmplea.add(this.jmenuDetalleRubroEmplea);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRubroEmplea);				
	}
	
	
	public void inicializarElementosCamposRubroEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRubroEmplea = new JLabelMe();
		jLabelIdRubroEmplea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRubroEmplea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRubroEmplea= new GridBagLayout();

		this.jPanelidRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);

		jLabelidRubroEmplea = new JLabel();
		jLabelidRubroEmplea.setText("Id");

		jLabelidRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoRubroEmplea = new JLabelMe();
		this.jLabelcodigoRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoRubroEmplea.setToolTipText("Codigo");
		this.jLabelcodigoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelcodigoRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jTextFieldcodigoRubroEmplea= new JTextFieldMe();

		jTextFieldcodigoRubroEmplea.setEnabled(false);
		jTextFieldcodigoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtoncodigoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoRubroEmpleaBusqueda.setText("U");
		this.jButtoncodigoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelnombreRubroEmplea = new JLabelMe();
		this.jLabelnombreRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRubroEmplea.setToolTipText("Nombre");
		this.jLabelnombreRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelnombreRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jTextAreanombreRubroEmplea= new JTextAreaMe();
		jTextAreanombreRubroEmplea.setEnabled(false);
		jTextAreanombreRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubroEmplea.setLineWrap(true);
		jTextAreanombreRubroEmplea.setWrapStyleWord(true);
		jTextAreanombreRubroEmplea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreRubroEmplea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreRubroEmplea = new JScrollPane(jTextAreanombreRubroEmplea);
		jscrollPanenombreRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonnombreRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRubroEmpleaBusqueda.setText("U");
		this.jButtonnombreRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelformulaRubroEmplea = new JLabelMe();
		this.jLabelformulaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_FORMULA+" : *");
		this.jLabelformulaRubroEmplea.setToolTipText("Formula");
		this.jLabelformulaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelformulaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelformulaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelformulaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_FORMULA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelformulaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jTextAreaformulaRubroEmplea= new JTextAreaMe();
		jTextAreaformulaRubroEmplea.setEnabled(false);
		jTextAreaformulaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaRubroEmplea.setLineWrap(true);
		jTextAreaformulaRubroEmplea.setWrapStyleWord(true);
		jTextAreaformulaRubroEmplea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaformulaRubroEmplea.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaformulaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneformulaRubroEmplea = new JScrollPane(jTextAreaformulaRubroEmplea);
		jscrollPaneformulaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformulaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformulaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonformulaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonformulaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonformulaRubroEmpleaBusqueda.setText("U");
		this.jButtonformulaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonformulaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonformulaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaformulaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaformulaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"formulaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonformulaRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelaliasRubroEmplea = new JLabelMe();
		this.jLabelaliasRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_ALIAS+" : *");
		this.jLabelaliasRubroEmplea.setToolTipText("Alias");
		this.jLabelaliasRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaliasRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaliasRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaliasRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaliasRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaliasRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_ALIAS);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelaliasRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jTextFieldaliasRubroEmplea= new JTextFieldMe();

		jTextFieldaliasRubroEmplea.setEnabled(false);
		jTextFieldaliasRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaliasRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaliasRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaliasRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonaliasRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonaliasRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaliasRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaliasRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaliasRubroEmpleaBusqueda.setText("U");
		this.jButtonaliasRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaliasRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaliasRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaliasRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaliasRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aliasRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaliasRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialRubroEmplea = new JLabelMe();
		this.jLabelsecuencialRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialRubroEmplea.setToolTipText("Secuencial");
		this.jLabelsecuencialRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelsecuencialRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jTextFieldsecuencialRubroEmplea= new JTextFieldMe();
		jTextFieldsecuencialRubroEmplea.setEnabled(false);
		jTextFieldsecuencialRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencialRubroEmplea.setText("0");

		this.jButtonsecuencialRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonsecuencialRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialRubroEmpleaBusqueda.setText("U");
		this.jButtonsecuencialRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_rol_pagosRubroEmplea = new JLabelMe();
		this.jLabelpara_rol_pagosRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARAROLPAGOS+" : *");
		this.jLabelpara_rol_pagosRubroEmplea.setToolTipText("Para Rol Pagos");
		this.jLabelpara_rol_pagosRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_rol_pagosRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_rol_pagosRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_rol_pagosRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_rol_pagosRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_rol_pagosRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARAROLPAGOS);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_rol_pagosRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_rol_pagosRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_rol_pagosRubroEmplea.setEnabled(false);

		jCheckBoxpara_rol_pagosRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_rol_pagosRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_rol_pagosRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_rol_pagosRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_rol_pagosRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_rol_pagosRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_rol_pagosRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_rol_pagosRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_rol_pagosRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_rol_pagosRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_sueldoRubroEmplea = new JLabelMe();
		this.jLabelpara_sueldoRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARASUELDO+" : *");
		this.jLabelpara_sueldoRubroEmplea.setToolTipText("Para Sueldo");
		this.jLabelpara_sueldoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_sueldoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_sueldoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_sueldoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_sueldoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_sueldoRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARASUELDO);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_sueldoRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_sueldoRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_sueldoRubroEmplea.setEnabled(false);

		jCheckBoxpara_sueldoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_sueldoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_sueldoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_sueldoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_sueldoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_sueldoRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_sueldoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_sueldoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_sueldoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_sueldoRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_sueldoRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_vacacionesRubroEmplea = new JLabelMe();
		this.jLabelpara_vacacionesRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARAVACACIONES+" : *");
		this.jLabelpara_vacacionesRubroEmplea.setToolTipText("Para Vacaciones");
		this.jLabelpara_vacacionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_vacacionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_vacacionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_vacacionesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_vacacionesRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_vacacionesRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARAVACACIONES);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_vacacionesRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_vacacionesRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_vacacionesRubroEmplea.setEnabled(false);

		jCheckBoxpara_vacacionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_vacacionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_vacacionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_vacacionesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_vacacionesRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_vacacionesRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_vacacionesRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_vacacionesRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_vacacionesRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_vacacionesRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_vacacionesRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_impuesto_rentaRubroEmplea = new JLabelMe();
		this.jLabelpara_impuesto_rentaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARAIMPUESTORENTA+" : *");
		this.jLabelpara_impuesto_rentaRubroEmplea.setToolTipText("Para Impuesto Renta");
		this.jLabelpara_impuesto_rentaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_impuesto_rentaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_impuesto_rentaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_impuesto_rentaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_impuesto_rentaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_impuesto_rentaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARAIMPUESTORENTA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_impuesto_rentaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_impuesto_rentaRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_impuesto_rentaRubroEmplea.setEnabled(false);

		jCheckBoxpara_impuesto_rentaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_impuesto_rentaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_impuesto_rentaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_impuesto_rentaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_impuesto_rentaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_impuesto_rentaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_impuesto_rentaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_impuesto_rentaRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_seguro_socialRubroEmplea = new JLabelMe();
		this.jLabelpara_seguro_socialRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARASEGUROSOCIAL+" : *");
		this.jLabelpara_seguro_socialRubroEmplea.setToolTipText("Para Seguro Social");
		this.jLabelpara_seguro_socialRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_seguro_socialRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_seguro_socialRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_seguro_socialRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_seguro_socialRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_seguro_socialRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARASEGUROSOCIAL);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_seguro_socialRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_seguro_socialRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_seguro_socialRubroEmplea.setEnabled(false);

		jCheckBoxpara_seguro_socialRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_seguro_socialRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_seguro_socialRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_seguro_socialRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_seguro_socialRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_seguro_socialRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_seguro_socialRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_seguro_socialRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_seguro_socialRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_seguro_socialRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_provisionesRubroEmplea = new JLabelMe();
		this.jLabelpara_provisionesRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARAPROVISIONES+" : *");
		this.jLabelpara_provisionesRubroEmplea.setToolTipText("Para Provisiones");
		this.jLabelpara_provisionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_provisionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpara_provisionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_provisionesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_provisionesRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_provisionesRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARAPROVISIONES);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_provisionesRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_provisionesRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_provisionesRubroEmplea.setEnabled(false);

		jCheckBoxpara_provisionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_provisionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_provisionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_provisionesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_provisionesRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_provisionesRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_provisionesRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_provisionesRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_provisionesRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_provisionesRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_provisionesRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_utilidadesRubroEmplea = new JLabelMe();
		this.jLabelpara_utilidadesRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARAUTILIDADES+" : *");
		this.jLabelpara_utilidadesRubroEmplea.setToolTipText("Para Utilades");
		this.jLabelpara_utilidadesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_utilidadesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_utilidadesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_utilidadesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_utilidadesRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_utilidadesRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARAUTILIDADES);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_utilidadesRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_utilidadesRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_utilidadesRubroEmplea.setEnabled(false);

		jCheckBoxpara_utilidadesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_utilidadesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_utilidadesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_utilidadesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_utilidadesRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_utilidadesRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_utilidadesRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_utilidadesRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_utilidadesRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_utilidadesRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_utilidadesRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelpara_rubro_iessRubroEmplea = new JLabelMe();
		this.jLabelpara_rubro_iessRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_PARARUBROIESS+" : *");
		this.jLabelpara_rubro_iessRubroEmplea.setToolTipText("Pararubro Iess");
		this.jLabelpara_rubro_iessRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_rubro_iessRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_rubro_iessRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_rubro_iessRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_rubro_iessRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_rubro_iessRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_PARARUBROIESS);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelpara_rubro_iessRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxpara_rubro_iessRubroEmplea= new JCheckBoxMe();
		jCheckBoxpara_rubro_iessRubroEmplea.setEnabled(false);

		jCheckBoxpara_rubro_iessRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_rubro_iessRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_rubro_iessRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_rubro_iessRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_rubro_iessRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setText("U");
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_rubro_iessRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_rubro_iessRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_rubro_iessRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_rubro_iessRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_rubro_iessRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabeles_fondo_reservaRubroEmplea = new JLabelMe();
		this.jLabeles_fondo_reservaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_ESFONDORESERVA+" : *");
		this.jLabeles_fondo_reservaRubroEmplea.setToolTipText("Es Fondo Reserva");
		this.jLabeles_fondo_reservaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_fondo_reservaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_fondo_reservaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_fondo_reservaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_fondo_reservaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_fondo_reservaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_ESFONDORESERVA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPaneles_fondo_reservaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxes_fondo_reservaRubroEmplea= new JCheckBoxMe();
		jCheckBoxes_fondo_reservaRubroEmplea.setEnabled(false);

		jCheckBoxes_fondo_reservaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_fondo_reservaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_fondo_reservaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_fondo_reservaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_fondo_reservaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_fondo_reservaRubroEmpleaBusqueda.setText("U");
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_fondo_reservaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_fondo_reservaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_fondo_reservaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_fondo_reservaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_fondo_reservaRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabeles_decimo_terceroRubroEmplea = new JLabelMe();
		this.jLabeles_decimo_terceroRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_ESDECIMOTERCERO+" : *");
		this.jLabeles_decimo_terceroRubroEmplea.setToolTipText("Es Decimo Tercero");
		this.jLabeles_decimo_terceroRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_decimo_terceroRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_decimo_terceroRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_decimo_terceroRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_decimo_terceroRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_decimo_terceroRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_ESDECIMOTERCERO);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPaneles_decimo_terceroRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxes_decimo_terceroRubroEmplea= new JCheckBoxMe();
		jCheckBoxes_decimo_terceroRubroEmplea.setEnabled(false);

		jCheckBoxes_decimo_terceroRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_decimo_terceroRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_decimo_terceroRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_decimo_terceroRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_decimo_terceroRubroEmpleaBusqueda= new JButtonMe();
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_decimo_terceroRubroEmpleaBusqueda.setText("U");
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_decimo_terceroRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_decimo_terceroRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_decimo_terceroRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_decimo_terceroRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_decimo_terceroRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabeles_decimo_cuartoRubroEmplea = new JLabelMe();
		this.jLabeles_decimo_cuartoRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_ESDECIMOCUARTO+" : *");
		this.jLabeles_decimo_cuartoRubroEmplea.setToolTipText("Es Decimo Cuarto");
		this.jLabeles_decimo_cuartoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_decimo_cuartoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_decimo_cuartoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_decimo_cuartoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_decimo_cuartoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_decimo_cuartoRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_ESDECIMOCUARTO);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPaneles_decimo_cuartoRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jCheckBoxes_decimo_cuartoRubroEmplea= new JCheckBoxMe();
		jCheckBoxes_decimo_cuartoRubroEmplea.setEnabled(false);

		jCheckBoxes_decimo_cuartoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_decimo_cuartoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_decimo_cuartoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_decimo_cuartoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_decimo_cuartoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setText("U");
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_decimo_cuartoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_decimo_cuartoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_decimo_cuartoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_decimo_cuartoRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_decimo_cuartoRubroEmpleaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRubroEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRubroEmplea = new JLabelMe();
		this.jLabelid_empresaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRubroEmplea.setToolTipText("Empresa");
		this.jLabelid_empresaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelid_empresaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jComboBoxid_empresaRubroEmplea= new JComboBoxMe();
		jComboBoxid_empresaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRubroEmplea.setEnabled(false);

		this.jButtonid_empresaRubroEmplea= new JButtonMe();
		this.jButtonid_empresaRubroEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmplea.setText("Buscar");
		this.jButtonid_empresaRubroEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRubroEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmplea"));

		this.jButtonid_empresaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonid_empresaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleaBusqueda.setText("U");
		this.jButtonid_empresaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRubroEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_empresaRubroEmpleaUpdate= new JButtonMe();
		this.jButtonid_empresaRubroEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleaUpdate.setText("U");
		this.jButtonid_empresaRubroEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRubroEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleaUpdate"));



					
		this.jLabelid_tipo_calculoRubroEmplea = new JLabelMe();
		this.jLabelid_tipo_calculoRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_IDTIPOCALCULO+" : *");
		this.jLabelid_tipo_calculoRubroEmplea.setToolTipText("Tipo Calculo");
		this.jLabelid_tipo_calculoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_calculoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_calculoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calculoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_calculoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_calculoRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_IDTIPOCALCULO);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelid_tipo_calculoRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jComboBoxid_tipo_calculoRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_calculoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calculoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calculoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calculoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_calculoRubroEmplea= new JButtonMe();
		this.jButtonid_tipo_calculoRubroEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calculoRubroEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calculoRubroEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calculoRubroEmplea.setText("Buscar");
		this.jButtonid_tipo_calculoRubroEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_calculoRubroEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calculoRubroEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_calculoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calculoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calculoRubroEmplea"));

		this.jButtonid_tipo_calculoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setText("U");
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calculoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_calculoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calculoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calculoRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_calculoRubroEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_calculoRubroEmpleaUpdate= new JButtonMe();
		this.jButtonid_tipo_calculoRubroEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calculoRubroEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calculoRubroEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calculoRubroEmpleaUpdate.setText("U");
		this.jButtonid_tipo_calculoRubroEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_calculoRubroEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calculoRubroEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_calculoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calculoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calculoRubroEmpleaUpdate"));



					
		this.jLabelid_tipo_rubro_empleaRubroEmplea = new JLabelMe();
		this.jLabelid_tipo_rubro_empleaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_IDTIPORUBROEMPLEA+" : *");
		this.jLabelid_tipo_rubro_empleaRubroEmplea.setToolTipText("Tipo Rubro Emplea");
		this.jLabelid_tipo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_rubro_empleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_rubro_empleaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_rubro_empleaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_IDTIPORUBROEMPLEA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelid_tipo_rubro_empleaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jComboBoxid_tipo_rubro_empleaRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_rubro_empleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_rubro_empleaRubroEmplea= new JButtonMe();
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setText("Buscar");
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_rubro_empleaRubroEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rubro_empleaRubroEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rubro_empleaRubroEmplea"));

		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setText("U");
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rubro_empleaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate= new JButtonMe();
		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setText("U");
		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_rubro_empleaRubroEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_rubro_empleaRubroEmpleaUpdate"));



					
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea = new JLabelMe();
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea.setText(""+RubroEmpleaConstantesFunciones.LABEL_IDTIPOGRUPORUBROEMPLEA+" : *");
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea.setToolTipText("Tipo Grupo Rubro Emplea");
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_rubro_empleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.setToolTipText(RubroEmpleaConstantesFunciones.LABEL_IDTIPOGRUPORUBROEMPLEA);
		this.gridaBagLayoutRubroEmplea = new GridBagLayout();
		this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.setLayout(this.gridaBagLayoutRubroEmplea);


		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea= new JButtonMe();
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setText("Buscar");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_rubro_empleaRubroEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_rubro_empleaRubroEmplea"));

		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setText("U");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_rubro_empleaRubroEmpleaBusqueda"));

		if(this.rubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setText("U");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_rubro_empleaRubroEmpleaUpdate"));



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
		//this.jInternalFrameDetalleRubroEmplea = new RubroEmpleaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rubro Emplea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmplea= new GridBagLayout();
		

		
		String sToolTipRubroEmplea="";
		sToolTipRubroEmplea=RubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmplea+="(Nomina.RubroEmplea)";
		}
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmplea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRubroEmplea = new JButtonMe();
		this.jButtonModificarRubroEmplea = new JButtonMe();
        this.jButtonActualizarRubroEmplea = new JButtonMe();
        this.jButtonEliminarRubroEmplea = new JButtonMe();
        this.jButtonCancelarRubroEmplea = new JButtonMe();
        this.jButtonGuardarCambiosRubroEmplea = new JButtonMe();
		this.jButtonGuardarCambiosTablaRubroEmplea = new JButtonMe();
		this.jButtonCerrarRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosEdicionRubroEmplea = new JScrollPane();
		this.jScrollPanelDatosGeneralRubroEmplea = new JScrollPane();
				
		
		
		this.jPanelCamposRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Emplea";
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRubroEmplea.setName("jPanelCamposRubroEmplea"); 

		this.jPanelCamposOcultosRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRubroEmplea.setName("jPanelCamposOcultosRubroEmplea"); 

        this.jPanelAccionesRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmplea.setName("Acciones"); 

		this.jPanelAccionesFormularioRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRubroEmplea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRubroEmplea.setText("Nuevo");
		this.jButtonModificarRubroEmplea.setText("Editar");
        this.jButtonActualizarRubroEmplea.setText("Actualizar");
        this.jButtonEliminarRubroEmplea.setText("Eliminar");
        this.jButtonCancelarRubroEmplea.setText("Cancelar");
        this.jButtonGuardarCambiosRubroEmplea.setText("Guardar");
		this.jButtonGuardarCambiosTablaRubroEmplea.setText("Guardar");
		this.jButtonCerrarRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmplea,"nuevo_button","Nuevo",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRubroEmplea,"modificar_button","Editar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRubroEmplea,"actualizar_button","Actualizar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRubroEmplea,"eliminar_button","Eliminar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRubroEmplea,"cancelar_button","Cancelar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRubroEmplea,"guardarcambios_button","Guardar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmplea,"guardarcambiostabla_button","Guardar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmplea,"cerrar_button","Salir",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRubroEmplea.setToolTipText("Nuevo"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRubroEmplea.setToolTipText("Editar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRubroEmplea.setToolTipText("Actualizar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRubroEmplea.setToolTipText("Eliminar)"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRubroEmplea.setToolTipText("Cancelar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRubroEmplea.setToolTipText("Guardar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRubroEmplea.setToolTipText("Guardar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmplea.setToolTipText("Salir"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmplea";
		inputMap = this.jButtonNuevoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmplea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRubroEmplea";
		inputMap = this.jButtonActualizarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRubroEmplea"));
		
		//ELIMINAR
		sMapKey = "EliminarRubroEmplea";
		inputMap = this.jButtonEliminarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRubroEmplea"));
		
		//CANCELAR	
		sMapKey = "CancelarRubroEmplea";
		inputMap = this.jButtonCancelarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRubroEmplea"));
		
		//CERRAR		
		sMapKey = "CerrarRubroEmplea";
		inputMap = this.jButtonCerrarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmplea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRubroEmplea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRubroEmplea.setToolTipText("Nuevo RubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRubroEmplea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRubroEmplea.setToolTipText("Sin Cerrar Ventana RubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRubroEmplea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRubroEmplea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmplea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRubroEmplea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRubroEmplea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesRubroEmplea.setText("Acciones");		
		this.jLabelAccionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRubroEmplea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRubroEmplea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRubroEmplea=new JTabbedPane();
		this.jTabbedPaneRelacionesRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRubroEmplea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmplea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmplea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRubroEmplea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRubroEmplea = new GridBagLayout();
		
		this.jPanelCamposRubroEmplea.setLayout(gridaBagLayoutCamposRubroEmplea);
		this.jPanelCamposOcultosRubroEmplea.setLayout(gridaBagLayoutCamposOcultosRubroEmplea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRubroEmplea.add(jLabelIdRubroEmplea, this.gridBagConstraintsRubroEmplea);



	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRubroEmplea.add(jLabelidRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRubroEmplea.add(jLabelid_empresaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmplea.add(jButtonid_empresaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 3;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmplea.add(jButtonid_empresaRubroEmpleaUpdate, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRubroEmplea.add(jComboBoxid_empresaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_calculoRubroEmplea.add(jLabelid_tipo_calculoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calculoRubroEmplea.add(jButtonid_tipo_calculoRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 3;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calculoRubroEmplea.add(jButtonid_tipo_calculoRubroEmpleaUpdate, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_calculoRubroEmplea.add(jComboBoxid_tipo_calculoRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_rubro_empleaRubroEmplea.add(jLabelid_tipo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_rubro_empleaRubroEmplea.add(jButtonid_tipo_rubro_empleaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 3;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_rubro_empleaRubroEmplea.add(jButtonid_tipo_rubro_empleaRubroEmpleaUpdate, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_rubro_empleaRubroEmplea.add(jComboBoxid_tipo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.add(jLabelid_tipo_grupo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.add(jButtonid_tipo_grupo_rubro_empleaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 3;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.add(jButtonid_tipo_grupo_rubro_empleaRubroEmpleaUpdate, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea.add(jComboBoxid_tipo_grupo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoRubroEmplea.add(jLabelcodigoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoRubroEmplea.add(jButtoncodigoRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoRubroEmplea.add(jTextFieldcodigoRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRubroEmplea.add(jLabelnombreRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRubroEmplea.add(jButtonnombreRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRubroEmplea.add(jscrollPanenombreRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelformulaRubroEmplea.add(jLabelformulaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelformulaRubroEmplea.add(jButtonformulaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelformulaRubroEmplea.add(jscrollPaneformulaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaliasRubroEmplea.add(jLabelaliasRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelaliasRubroEmplea.add(jButtonaliasRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaliasRubroEmplea.add(jTextFieldaliasRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialRubroEmplea.add(jLabelsecuencialRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialRubroEmplea.add(jButtonsecuencialRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialRubroEmplea.add(jTextFieldsecuencialRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_rol_pagosRubroEmplea.add(jLabelpara_rol_pagosRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_rol_pagosRubroEmplea.add(jButtonpara_rol_pagosRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_rol_pagosRubroEmplea.add(jCheckBoxpara_rol_pagosRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_sueldoRubroEmplea.add(jLabelpara_sueldoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_sueldoRubroEmplea.add(jButtonpara_sueldoRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_sueldoRubroEmplea.add(jCheckBoxpara_sueldoRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_vacacionesRubroEmplea.add(jLabelpara_vacacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_vacacionesRubroEmplea.add(jButtonpara_vacacionesRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_vacacionesRubroEmplea.add(jCheckBoxpara_vacacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_impuesto_rentaRubroEmplea.add(jLabelpara_impuesto_rentaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_impuesto_rentaRubroEmplea.add(jButtonpara_impuesto_rentaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_impuesto_rentaRubroEmplea.add(jCheckBoxpara_impuesto_rentaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_seguro_socialRubroEmplea.add(jLabelpara_seguro_socialRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_seguro_socialRubroEmplea.add(jButtonpara_seguro_socialRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_seguro_socialRubroEmplea.add(jCheckBoxpara_seguro_socialRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_provisionesRubroEmplea.add(jLabelpara_provisionesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_provisionesRubroEmplea.add(jButtonpara_provisionesRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_provisionesRubroEmplea.add(jCheckBoxpara_provisionesRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_utilidadesRubroEmplea.add(jLabelpara_utilidadesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_utilidadesRubroEmplea.add(jButtonpara_utilidadesRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_utilidadesRubroEmplea.add(jCheckBoxpara_utilidadesRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_rubro_iessRubroEmplea.add(jLabelpara_rubro_iessRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_rubro_iessRubroEmplea.add(jButtonpara_rubro_iessRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_rubro_iessRubroEmplea.add(jCheckBoxpara_rubro_iessRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_fondo_reservaRubroEmplea.add(jLabeles_fondo_reservaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_fondo_reservaRubroEmplea.add(jButtones_fondo_reservaRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_fondo_reservaRubroEmplea.add(jCheckBoxes_fondo_reservaRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_decimo_terceroRubroEmplea.add(jLabeles_decimo_terceroRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_decimo_terceroRubroEmplea.add(jButtones_decimo_terceroRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_decimo_terceroRubroEmplea.add(jCheckBoxes_decimo_terceroRubroEmplea, this.gridBagConstraintsRubroEmplea);


	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 0;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_decimo_cuartoRubroEmplea.add(jLabeles_decimo_cuartoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 2;
		this.gridBagConstraintsRubroEmplea.ipadx = 0;
		this.gridBagConstraintsRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_decimo_cuartoRubroEmplea.add(jButtones_decimo_cuartoRubroEmpleaBusqueda, this.gridBagConstraintsRubroEmplea);
	}

	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmplea.gridy = 0;
	this.gridBagConstraintsRubroEmplea.gridx = 1;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_decimo_cuartoRubroEmplea.add(jCheckBoxes_decimo_cuartoRubroEmplea, this.gridBagConstraintsRubroEmplea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelidRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelid_tipo_calculoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelid_tipo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelid_tipo_grupo_rubro_empleaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelcodigoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelnombreRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelformulaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelaliasRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelsecuencialRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_rol_pagosRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_sueldoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_vacacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_impuesto_rentaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_seguro_socialRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_provisionesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_utilidadesRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPanelpara_rubro_iessRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPaneles_fondo_reservaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPaneles_decimo_terceroRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmplea.add(this.jPaneles_decimo_cuartoRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposRubroEmplea % 2==0) {
		iXPanelCamposRubroEmplea=0;
		iYPanelCamposRubroEmplea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmplea.gridy = iYPanelCamposOcultosRubroEmplea;
	this.gridBagConstraintsRubroEmplea.gridx = iXPanelCamposOcultosRubroEmplea++;
	this.gridBagConstraintsRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEmplea.add(this.jPanelid_empresaRubroEmplea, this.gridBagConstraintsRubroEmplea);



	if(iXPanelCamposOcultosRubroEmplea % 2==0) {
		iXPanelCamposOcultosRubroEmplea=0;
		iYPanelCamposOcultosRubroEmplea++;
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
			
		GridBagLayout gridaBagLayoutAccionesRubroEmplea= new GridBagLayout();
		this.jPanelAccionesRubroEmplea.setLayout(gridaBagLayoutAccionesRubroEmplea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRubroEmplea= new GridBagLayout();
		this.jPanelAccionesFormularioRubroEmplea.setLayout(gridaBagLayoutAccionesFormularioRubroEmplea);
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmplea.add(this.jComboBoxTiposAccionesFormularioRubroEmplea, this.gridBagConstraintsRubroEmplea);

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmplea.add(this.jCheckBoxPostAccionNuevoRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rubroempleaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmplea.add(this.jCheckBoxPostAccionSinCerrarRubroEmplea, this.gridBagConstraintsRubroEmplea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmplea.add(this.jCheckBoxPostAccionSinMensajeRubroEmplea, this.gridBagConstraintsRubroEmplea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXAccion++;
			
		this.jPanelAccionesRubroEmplea.add(this.jButtonModificarRubroEmplea, this.gridBagConstraintsRubroEmplea);							

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx =iPosXAccion++;
			
		this.jPanelAccionesRubroEmplea.add(this.jButtonEliminarRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = 0;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmplea.add(this.jButtonActualizarRubroEmplea, this.gridBagConstraintsRubroEmplea);


		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = 0;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmplea.add(this.jButtonGuardarCambiosRubroEmplea, this.gridBagConstraintsRubroEmplea);	
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = 0;		
		this.gridBagConstraintsRubroEmplea.gridx =iPosXAccion++;
		
		this.jPanelAccionesRubroEmplea.add(this.jButtonCancelarRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmplea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmplea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmplea.gridx =0;
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmplea, this.gridBagConstraintsRubroEmplea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRubroEmplea = new RubroEmpleaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rubro Emplea DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rubro Emplea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Emplea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RubroEmpleaModel rubroempleaModel=new RubroEmpleaModel(this);
			
			//SI USARA CLASE INTERNA
			//RubroEmpleaModel.RubroEmpleaFocusTraversalPolicy rubroempleaFocusTraversalPolicy = rubroempleaModel.new RubroEmpleaFocusTraversalPolicy(this);
			
			//rubroempleaFocusTraversalPolicy.setrubroempleaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rubroempleaModel);
			
			
			this.jContentPaneDetalleRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRubroEmplea = new GridBagLayout();	
			this.jContentPaneDetalleRubroEmplea.setLayout(gridaBagLayoutDetalleRubroEmplea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmplea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRubroEmplea.gridx = 0;
					
				
				this.jContentPaneDetalleRubroEmplea.add(jTtoolBarDetalleRubroEmplea, gridBagConstraintsRubroEmplea);								
				
}
			
			this.jScrollPanelDatosEdicionRubroEmplea=   new JScrollPane(jContentPaneDetalleRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRubroEmplea.gridx = 0;
	        
			this.jContentPaneDetalleRubroEmplea.add(jPanelCamposRubroEmplea, gridBagConstraintsRubroEmplea);
			
			
			
			
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
						&& rubroempleaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefiProvisionEmpleado(this.puedeCargarPorParteDefiProvisionEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(this.puedeCargarPorParteEmpleadoPagoRubro,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(this.puedeCargarPorParteHistorialPagoMesNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(this.puedeCargarPorParteHistorialPagoNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(this.puedeCargarPorParteRubroEmpleaCuentaContable,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(this.puedeCargarPorParteRubroEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEstructura(this.puedeCargarPorParteRubroEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoPrestamo(this.puedeCargarPorParteTipoPrestamo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameValorRubroVariable(this.puedeCargarPorParteValorRubroVariable,false,-1);
					
					if(this.rubroempleaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRubroEmplea= new GridBagConstraints();
						this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRubroEmplea.gridx = 0;
						this.jContentPaneDetalleRubroEmplea.add(this.jTabbedPaneRelacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRubroEmplea.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefiProvisionEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoPrestamo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameValorRubroVariable(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRubroEmplea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
					this.gridBagConstraintsRubroEmplea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRubroEmplea.gridx = 0;
					
				
					this.jContentPaneDetalleRubroEmplea.add(jPanelCamposOcultosRubroEmplea, gridBagConstraintsRubroEmplea);
				
					this.jPanelCamposOcultosRubroEmplea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;//28;		
	        this.gridBagConstraintsRubroEmplea.gridx = 0;
	        this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRubroEmplea.add(this.jPanelAccionesFormularioRubroEmplea, this.gridBagConstraintsRubroEmplea);							
			
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
	        this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones;//28;		
	        this.gridBagConstraintsRubroEmplea.gridx = 0;
	        
			
			this.jContentPaneDetalleRubroEmplea.add(this.jPanelAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRubroEmplea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRubroEmplea=   new JScrollPane(this.jPanelCamposRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmplea.gridx = 0;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRubroEmplea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRubroEmplea, this.gridBagConstraintsRubroEmplea);			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRubroEmplea;//jContentPane;
		
		return jScrollPanelDatosEdicionRubroEmplea;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDefiProvisionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(false);
		this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.defiprovisionempleadoBeanSwingJInternalFrame=null;//new DefiProvisionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.defiprovisionempleadoBeanSwingJInternalFramePopup=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.defiprovisionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {

				DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.defiprovisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.defiprovisionempleadoBeanSwingJInternalFrame.setdefiprovisionempleadoSessionBean(this.defiprovisionempleadoSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.defiprovisionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Defi Provision Empleados",this.defiprovisionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.defiprovisionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DefiProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.defiprovisionempleadoBeanSwingJInternalFrame=null;//new DefiProvisionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefiProvisionEmpleado) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Defi Provision Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		this.empleadopagorubroSessionBean.setConGuardarRelaciones(false);
		this.empleadopagorubroSessionBean.setEsGuardarRelacionado(true);

		this.empleadopagorubroBeanSwingJInternalFrame=null;//new EmpleadoPagoRubroBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadopagorubroBeanSwingJInternalFramePopup=new EmpleadoPagoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadopagorubroBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {

				EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadopagorubroSessionBean.setEsGuardarRelacionado(true);

				this.empleadopagorubroBeanSwingJInternalFrame=new EmpleadoPagoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadopagorubroBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadopagorubroBeanSwingJInternalFrame.setempleadopagorubroSessionBean(this.empleadopagorubroSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.empleadopagorubroBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Empleado Pago Rubros",this.empleadopagorubroBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.empleadopagorubroBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoPagoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadopagorubroSessionBean.setEsGuardarRelacionado(false);
				this.empleadopagorubroBeanSwingJInternalFrame=null;//new EmpleadoPagoRubroBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoPagoRubro) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Empleado Pago Rubros",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		this.historialpagomesnomiSessionBean.setConGuardarRelaciones(false);
		this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(true);

		this.historialpagomesnomiBeanSwingJInternalFrame=null;//new HistorialPagoMesNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialpagomesnomiBeanSwingJInternalFramePopup=new HistorialPagoMesNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialpagomesnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {

				HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(true);

				this.historialpagomesnomiBeanSwingJInternalFrame=new HistorialPagoMesNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialpagomesnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.historialpagomesnomiBeanSwingJInternalFrame.sethistorialpagomesnomiSessionBean(this.historialpagomesnomiSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Historial Pago Mes Nomis",this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane());
				}

				//HistorialPagoMesNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(false);
				this.historialpagomesnomiBeanSwingJInternalFrame=null;//new HistorialPagoMesNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialPagoMesNomi) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Historial Pago Mes Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		this.historialpagonomiSessionBean.setConGuardarRelaciones(false);
		this.historialpagonomiSessionBean.setEsGuardarRelacionado(true);

		this.historialpagonomiBeanSwingJInternalFrame=null;//new HistorialPagoNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialpagonomiBeanSwingJInternalFramePopup=new HistorialPagoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialpagonomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {

				HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.historialpagonomiSessionBean.setEsGuardarRelacionado(true);

				this.historialpagonomiBeanSwingJInternalFrame=new HistorialPagoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialpagonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.historialpagonomiBeanSwingJInternalFrame.sethistorialpagonomiSessionBean(this.historialpagonomiSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.historialpagonomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Historial Pago Nomis",this.historialpagonomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.historialpagonomiBeanSwingJInternalFrame.getContentPane());
				}

				//HistorialPagoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialpagonomiSessionBean.setEsGuardarRelacionado(false);
				this.historialpagonomiBeanSwingJInternalFrame=null;//new HistorialPagoNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialPagoNomi) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Historial Pago Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(false);
		this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleacuentacontableBeanSwingJInternalFrame=null;//new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleacuentacontableBeanSwingJInternalFramePopup=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleacuentacontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleacuentacontableBeanSwingJInternalFrame=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleacuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleacuentacontableBeanSwingJInternalFrame.setrubroempleacuentacontableSessionBean(this.rubroempleacuentacontableSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Emplea Cuenta Contables",this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleaCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleacuentacontableBeanSwingJInternalFrame=null;//new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmpleaCuentaContable) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Emplea Cuenta Contables",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		this.rubroempleadoSessionBean.setConGuardarRelaciones(false);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleadoBeanSwingJInternalFramePopup=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleadoBeanSwingJInternalFrame.setrubroempleadoSessionBean(this.rubroempleadoSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.rubroempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Empleados",this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleadoSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmpleado) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		this.rubroestructuraSessionBean.setConGuardarRelaciones(false);
		this.rubroestructuraSessionBean.setEsGuardarRelacionado(true);

		this.rubroestructuraBeanSwingJInternalFrame=null;//new RubroEstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroestructuraBeanSwingJInternalFramePopup=new RubroEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroestructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {

				RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroestructuraSessionBean.setEsGuardarRelacionado(true);

				this.rubroestructuraBeanSwingJInternalFrame=new RubroEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroestructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroestructuraBeanSwingJInternalFrame.setrubroestructuraSessionBean(this.rubroestructuraSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.rubroestructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Estructuras",this.rubroestructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.rubroestructuraBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroestructuraSessionBean.setEsGuardarRelacionado(false);
				this.rubroestructuraBeanSwingJInternalFrame=null;//new RubroEstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEstructura) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Rubro Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoPrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		this.tipoprestamoSessionBean.setConGuardarRelaciones(false);
		this.tipoprestamoSessionBean.setEsGuardarRelacionado(true);

		this.tipoprestamoBeanSwingJInternalFrame=null;//new TipoPrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipoprestamoBeanSwingJInternalFramePopup=new TipoPrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipoprestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {

				TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipoprestamoSessionBean.setEsGuardarRelacionado(true);

				this.tipoprestamoBeanSwingJInternalFrame=new TipoPrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipoprestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipoprestamoBeanSwingJInternalFrame.settipoprestamoSessionBean(this.tipoprestamoSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.tipoprestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Tipo Prestamos",this.tipoprestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.tipoprestamoBeanSwingJInternalFrame.getContentPane());
				}

				//TipoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipoprestamoSessionBean.setEsGuardarRelacionado(false);
				this.tipoprestamoBeanSwingJInternalFrame=null;//new TipoPrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoPrestamo) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Tipo Prestamos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameValorRubroVariable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		this.valorrubrovariableSessionBean.setConGuardarRelaciones(false);
		this.valorrubrovariableSessionBean.setEsGuardarRelacionado(true);

		this.valorrubrovariableBeanSwingJInternalFrame=null;//new ValorRubroVariableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.valorrubrovariableBeanSwingJInternalFramePopup=new ValorRubroVariableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.valorrubrovariableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {

				ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.valorrubrovariableSessionBean.setEsGuardarRelacionado(true);

				this.valorrubrovariableBeanSwingJInternalFrame=new ValorRubroVariableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.valorrubrovariableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.valorrubrovariableBeanSwingJInternalFrame.setvalorrubrovariableSessionBean(this.valorrubrovariableSessionBean);

				//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleRubroEmplea.add(this.valorrubrovariableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Valor Rubro Variables",this.valorrubrovariableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRubroEmplea.setComponentAt(iIndexTab,this.valorrubrovariableBeanSwingJInternalFrame.getContentPane());
				}

				//ValorRubroVariableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.valorrubrovariableSessionBean.setEsGuardarRelacionado(false);
				this.valorrubrovariableBeanSwingJInternalFrame=null;//new ValorRubroVariableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteValorRubroVariable) {
					this.jTabbedPaneRelacionesRubroEmplea.add("Valor Rubro Variables",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarHistorialPagoNomiBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialpagonomiBeanSwingJInternalFrame=new HistorialPagoNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialpagonomiBeanSwingJInternalFrame.getHistorialPagoNomiLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					historialpagonomiBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					historialpagonomiBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					historialpagonomiBeanSwingJInternalFrame.historialpagonomiSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					historialpagonomiBeanSwingJInternalFrame.historialpagonomiSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					historialpagonomiBeanSwingJInternalFrame.cargarCombosForeignKeyHistorialPagoNomi(historialpagonomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					historialpagonomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					historialpagonomiBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						historialpagonomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					historialpagonomiBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					historialpagonomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialpagonomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					historialpagonomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					historialpagonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaHistorialPagoNomi(true);
					historialpagonomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHistorialPagoNomi("n",historialpagonomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, historialpagonomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					historialpagonomiBeanSwingJInternalFrame.setAutoscrolls(true);
					historialpagonomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialpagonomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoNomi("relacionado");
					} else {
						historialpagonomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoNomi("no_relacionado");
					}

					historialpagonomiBeanSwingJInternalFrame.getjButtonRecargarInformacionHistorialPagoNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEstructuraBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroestructuraBeanSwingJInternalFrame=new RubroEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroestructuraBeanSwingJInternalFrame.getRubroEstructuraLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					rubroestructuraBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					rubroestructuraBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					rubroestructuraBeanSwingJInternalFrame.rubroestructuraSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					rubroestructuraBeanSwingJInternalFrame.rubroestructuraSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroestructuraBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEstructura(rubroestructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroestructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					rubroestructuraBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						rubroestructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroestructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					rubroestructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroestructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					rubroestructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					rubroestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEstructura(true);
					rubroestructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEstructura("n",rubroestructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroestructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroestructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroestructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEstructura("relacionado");
					} else {
						rubroestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEstructura("no_relacionado");
					}

					rubroestructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDefiProvisionEmpleadoBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					defiprovisionempleadoBeanSwingJInternalFrame.getDefiProvisionEmpleadoLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					defiprovisionempleadoBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					defiprovisionempleadoBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					defiprovisionempleadoBeanSwingJInternalFrame.defiprovisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					defiprovisionempleadoBeanSwingJInternalFrame.defiprovisionempleadoSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					defiprovisionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					defiprovisionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					defiprovisionempleadoBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						defiprovisionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					defiprovisionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					defiprovisionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					defiprovisionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					defiprovisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					defiprovisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefiProvisionEmpleado(true);
					defiprovisionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDefiProvisionEmpleado("n",defiprovisionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, defiprovisionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					defiprovisionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					defiprovisionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						defiprovisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDefiProvisionEmpleado("relacionado");
					} else {
						defiprovisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDefiProvisionEmpleado("no_relacionado");
					}

					defiprovisionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDefiProvisionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoPagoRubroBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadopagorubroBeanSwingJInternalFrame=new EmpleadoPagoRubroBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadopagorubroBeanSwingJInternalFrame.getEmpleadoPagoRubroLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					empleadopagorubroBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					empleadopagorubroBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					empleadopagorubroBeanSwingJInternalFrame.empleadopagorubroSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					empleadopagorubroBeanSwingJInternalFrame.empleadopagorubroSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadopagorubroBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoPagoRubro(empleadopagorubroBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadopagorubroBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					empleadopagorubroBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						empleadopagorubroBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadopagorubroBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					empleadopagorubroBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadopagorubroBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					empleadopagorubroBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					empleadopagorubroBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoPagoRubro(true);
					empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n",empleadopagorubroBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadopagorubroBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadopagorubroBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadopagorubroBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoPagoRubro("relacionado");
					} else {
						empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoPagoRubro("no_relacionado");
					}

					empleadopagorubroBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoPagoRubro().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHistorialPagoMesNomiBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialpagomesnomiBeanSwingJInternalFrame=new HistorialPagoMesNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialpagomesnomiBeanSwingJInternalFrame.getHistorialPagoMesNomiLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					historialpagomesnomiBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					historialpagomesnomiBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					historialpagomesnomiBeanSwingJInternalFrame.historialpagomesnomiSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					historialpagomesnomiBeanSwingJInternalFrame.historialpagomesnomiSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					historialpagomesnomiBeanSwingJInternalFrame.cargarCombosForeignKeyHistorialPagoMesNomi(historialpagomesnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					historialpagomesnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					historialpagomesnomiBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						historialpagomesnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					historialpagomesnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					historialpagomesnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialpagomesnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					historialpagomesnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					historialpagomesnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaHistorialPagoMesNomi(true);
					historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n",historialpagomesnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, historialpagomesnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					historialpagomesnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					historialpagomesnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoMesNomi("relacionado");
					} else {
						historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoMesNomi("no_relacionado");
					}

					historialpagomesnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionHistorialPagoMesNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEmpleadoBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleadoBeanSwingJInternalFrame.getRubroEmpleadoLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					rubroempleadoBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					rubroempleadoBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmpleado(rubroempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					rubroempleadoBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					rubroempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					rubroempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					rubroempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleado(true);
					rubroempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmpleado("n",rubroempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("relacionado");
					} else {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("no_relacionado");
					}

					rubroempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarValorRubroVariableBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,ValorRubroVariableBeanSwingJInternalFrame valorrubrovariableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//valorrubrovariableBeanSwingJInternalFrame=new ValorRubroVariableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					valorrubrovariableBeanSwingJInternalFrame.getValorRubroVariableLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					valorrubrovariableBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					valorrubrovariableBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					valorrubrovariableBeanSwingJInternalFrame.valorrubrovariableSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					valorrubrovariableBeanSwingJInternalFrame.valorrubrovariableSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					valorrubrovariableBeanSwingJInternalFrame.cargarCombosForeignKeyValorRubroVariable(valorrubrovariableBeanSwingJInternalFrame.isCargarCombosDependencia);
					valorrubrovariableBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					valorrubrovariableBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						valorrubrovariableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					valorrubrovariableBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					valorrubrovariableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					valorrubrovariableBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					valorrubrovariableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					valorrubrovariableBeanSwingJInternalFrame.inicializarActualizarBindingTablaValorRubroVariable(true);
					valorrubrovariableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesValorRubroVariable("n",valorrubrovariableBeanSwingJInternalFrame.isGuardarCambiosEnLote, valorrubrovariableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					valorrubrovariableBeanSwingJInternalFrame.setAutoscrolls(true);
					valorrubrovariableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						valorrubrovariableBeanSwingJInternalFrame.actualizarEstadoPanelsValorRubroVariable("relacionado");
					} else {
						valorrubrovariableBeanSwingJInternalFrame.actualizarEstadoPanelsValorRubroVariable("no_relacionado");
					}

					valorrubrovariableBeanSwingJInternalFrame.getjButtonRecargarInformacionValorRubroVariable().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTipoPrestamoBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipoprestamoBeanSwingJInternalFrame=new TipoPrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipoprestamoBeanSwingJInternalFrame.getTipoPrestamoLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					tipoprestamoBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					tipoprestamoBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					tipoprestamoBeanSwingJInternalFrame.tipoprestamoSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					tipoprestamoBeanSwingJInternalFrame.tipoprestamoSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipoprestamoBeanSwingJInternalFrame.cargarCombosForeignKeyTipoPrestamo(tipoprestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipoprestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					tipoprestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipoprestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					tipoprestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					tipoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrestamo(true);
					tipoprestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoPrestamo("n",tipoprestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipoprestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipoprestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					tipoprestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipoprestamoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoPrestamo("relacionado");
					} else {
						tipoprestamoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoPrestamo("no_relacionado");
					}

					tipoprestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoPrestamo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEmpleaCuentaContableBeanSwingJInternalFrame(List<RubroEmplea> rubroempleas,RubroEmplea rubroemplea,RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleacuentacontableBeanSwingJInternalFrame=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleacuentacontableBeanSwingJInternalFrame.getRubroEmpleaCuentaContableLogic().setConnexion(this.rubroempleaLogic.getConnexion());

					rubroempleacuentacontableBeanSwingJInternalFrame.setrubroempleasForeignKey(rubroempleas);
					rubroempleacuentacontableBeanSwingJInternalFrame.setrubroempleaForeignKey(rubroemplea);
					rubroempleacuentacontableBeanSwingJInternalFrame.rubroempleacuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionRubroEmplea(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.rubroempleacuentacontableSessionBean.setlidRubroEmpleaActual(rubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleacuentacontableBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmpleaCuentaContable(rubroempleacuentacontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleacuentacontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaRubroEmplea(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setid_rubro_empleaFK_IdRubroEmplea(rubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleacuentacontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleacuentacontableBeanSwingJInternalFrame.setSelectedItemCombosFrameRubroEmpleaForeignKey(rubroemplea,1,false,true,true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleacuentacontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdRubroEmplea");
					rubroempleacuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRubroEmplea");
					rubroempleacuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n",rubroempleacuentacontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleacuentacontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleacuentacontableBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleaCuentaContable("relacionado");
					} else {
						rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleaCuentaContable("no_relacionado");
					}

					rubroempleacuentacontableBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmpleaCuentaContable().setVisible(false);

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
