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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.DiarioGeneralConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class DiarioGeneralDetalleFormJInternalFrame extends DiarioGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDiarioGeneral;
	
	protected JMenuBar jmenuBarDetalleDiarioGeneral;
	
	protected JMenu jmenuDetalleDiarioGeneral;
	protected JMenu jmenuDetalleArchivoDiarioGeneral;
	protected JMenu jmenuDetalleAccionesDiarioGeneral;
	protected JMenu jmenuDetalleDatosDiarioGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiarioGeneral;	
	protected GridBagConstraints gridBagConstraintsDiarioGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DiarioGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleDiarioGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public DiarioGeneralSessionBean diariogeneralSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public DiarioGeneralLogic diariogeneralLogic;
	
	public JScrollPane jScrollPanelDatosDiarioGeneral;
	public JScrollPane jScrollPanelDatosEdicionDiarioGeneral;
	public JScrollPane jScrollPanelDatosGeneralDiarioGeneral;
	
	protected JPanel jPanelCamposDiarioGeneral;    
	protected JPanel jPanelCamposOcultosDiarioGeneral;    	
	protected JPanel jPanelAccionesDiarioGeneral;
	protected JPanel jPanelAccionesFormularioDiarioGeneral;
    
	
	
	protected Integer iXPanelCamposDiarioGeneral=0;
	protected Integer iYPanelCamposDiarioGeneral=0;
	
	protected Integer iXPanelCamposOcultosDiarioGeneral=0;
	protected Integer iYPanelCamposOcultosDiarioGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDiarioGeneral;
	public JButton jButtonModificarDiarioGeneral;
	public JButton jButtonActualizarDiarioGeneral;
    public JButton jButtonEliminarDiarioGeneral;
	public JButton jButtonCancelarDiarioGeneral;
    public JButton jButtonGuardarCambiosDiarioGeneral;
	public JButton jButtonGuardarCambiosTablaDiarioGeneral;
	protected JButton jButtonCerrarDiarioGeneral;
	
	
	protected JButton jButtonProcesarInformacionDiarioGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDiarioGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDiarioGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDiarioGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiarioGeneral;
	protected JButton jButtonModificarToolBarDiarioGeneral;
	protected JButton jButtonActualizarToolBarDiarioGeneral;
    protected JButton jButtonEliminarToolBarDiarioGeneral;
	protected JButton jButtonCancelarToolBarDiarioGeneral;
    protected JButton jButtonGuardarCambiosToolBarDiarioGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarDiarioGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarDiarioGeneral;
	protected JButton jButtonCerrarToolBarDiarioGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarDiarioGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiarioGeneral;
	protected JMenuItem jMenuItemModificarDiarioGeneral;
	protected JMenuItem jMenuItemActualizarDiarioGeneral;
    protected JMenuItem jMenuItemEliminarDiarioGeneral;
	protected JMenuItem jMenuItemCancelarDiarioGeneral;
    protected JMenuItem jMenuItemGuardarCambiosDiarioGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiarioGeneral;
	protected JMenuItem jMenuItemCerrarDiarioGeneral;
	protected JMenuItem jMenuItemDetalleCerrarDiarioGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiarioGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionDiarioGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiarioGeneral;
	protected JMenuItem jMenuItemMostrarOcultarDiarioGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiarioGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiarioGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiarioGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDiarioGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDiarioGeneral;
	public JLabel jLabelIdDiarioGeneral;
	public JLabel jLabelidDiarioGeneral;
	public JButton jButtonidDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioDiarioGeneral;
	public JLabel jLabelfecha_inicioDiarioGeneral;
	//public JFormattedTextField jDateChooserfecha_inicioDiarioGeneral;

	public JDateChooser jDateChooserfecha_inicioDiarioGeneral;
	public JButton jButtonfecha_inicioDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finDiarioGeneral;
	public JLabel jLabelfecha_finDiarioGeneral;
	//public JFormattedTextField jDateChooserfecha_finDiarioGeneral;

	public JDateChooser jDateChooserfecha_finDiarioGeneral;
	public JButton jButtonfecha_finDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoDiarioGeneral;
	public JLabel jLabeltipo_movimientoDiarioGeneral;
	public JTextArea jTextAreatipo_movimientoDiarioGeneral;
	public JScrollPane jscrollPanetipo_movimientoDiarioGeneral;
	public JButton jButtontipo_movimientoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorDiarioGeneral;
	public JLabel jLabelnumero_mayorDiarioGeneral;
	public JTextArea jTextAreanumero_mayorDiarioGeneral;
	public JScrollPane jscrollPanenumero_mayorDiarioGeneral;
	public JButton jButtonnumero_mayorDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDiarioGeneral;
	public JLabel jLabelcodigoDiarioGeneral;
	public JTextField jTextFieldcodigoDiarioGeneral;
	public JButton jButtoncodigoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombreDiarioGeneral;
	public JLabel jLabelnombreDiarioGeneral;
	public JTextArea jTextAreanombreDiarioGeneral;
	public JScrollPane jscrollPanenombreDiarioGeneral;
	public JButton jButtonnombreDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asientoDiarioGeneral;
	public JLabel jLabelcodigo_asientoDiarioGeneral;
	public JTextField jTextFieldcodigo_asientoDiarioGeneral;
	public JButton jButtoncodigo_asientoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localDiarioGeneral;
	public JLabel jLabeldebito_localDiarioGeneral;
	public JTextField jTextFielddebito_localDiarioGeneral;
	public JButton jButtondebito_localDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localDiarioGeneral;
	public JLabel jLabelcredito_localDiarioGeneral;
	public JTextField jTextFieldcredito_localDiarioGeneral;
	public JButton jButtoncredito_localDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPaneldebito_extranDiarioGeneral;
	public JLabel jLabeldebito_extranDiarioGeneral;
	public JTextField jTextFielddebito_extranDiarioGeneral;
	public JButton jButtondebito_extranDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcredito_extranDiarioGeneral;
	public JLabel jLabelcredito_extranDiarioGeneral;
	public JTextField jTextFieldcredito_extranDiarioGeneral;
	public JButton jButtoncredito_extranDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfechaDiarioGeneral;
	public JLabel jLabelfechaDiarioGeneral;
	//public JFormattedTextField jDateChooserfechaDiarioGeneral;

	public JDateChooser jDateChooserfechaDiarioGeneral;
	public JButton jButtonfechaDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPaneldetalleDiarioGeneral;
	public JLabel jLabeldetalleDiarioGeneral;
	public JTextArea jTextAreadetalleDiarioGeneral;
	public JScrollPane jscrollPanedetalleDiarioGeneral;
	public JButton jButtondetalleDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombre_estadoDiarioGeneral;
	public JLabel jLabelnombre_estadoDiarioGeneral;
	public JTextField jTextFieldnombre_estadoDiarioGeneral;
	public JButton jButtonnombre_estadoDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDiarioGeneral;
	public JLabel jLabelid_empresaDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDiarioGeneral;
	public JButton jButtonid_empresaDiarioGeneral= new JButtonMe();
	public JButton jButtonid_empresaDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_empresaDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDiarioGeneral;
	public JLabel jLabelid_sucursalDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDiarioGeneral;
	public JButton jButtonid_sucursalDiarioGeneral= new JButtonMe();
	public JButton jButtonid_sucursalDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDiarioGeneral;
	public JLabel jLabelid_ejercicioDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDiarioGeneral;
	public JButton jButtonid_ejercicioDiarioGeneral= new JButtonMe();
	public JButton jButtonid_ejercicioDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDiarioGeneral;
	public JLabel jLabelid_periodoDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDiarioGeneral;
	public JButton jButtonid_periodoDiarioGeneral= new JButtonMe();
	public JButton jButtonid_periodoDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_periodoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDiarioGeneral;
	public JLabel jLabelid_moduloDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDiarioGeneral;
	public JButton jButtonid_moduloDiarioGeneral= new JButtonMe();
	public JButton jButtonid_moduloDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_moduloDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoDiarioGeneral;
	public JLabel jLabelid_tipo_movimientoDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoDiarioGeneral;
	public JButton jButtonid_tipo_movimientoDiarioGeneral= new JButtonMe();
	public JButton jButtonid_tipo_movimientoDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoDiarioGeneral;
	public JLabel jLabelid_tipo_documentoDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoDiarioGeneral;
	public JButton jButtonid_tipo_documentoDiarioGeneral= new JButtonMe();
	public JButton jButtonid_tipo_documentoDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoDiarioGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDiarioGeneral;
	public JLabel jLabelid_asiento_contableDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDiarioGeneral;
	public JButton jButtonid_asiento_contableDiarioGeneral= new JButtonMe();
	public JButton jButtonid_asiento_contableDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDiarioGeneralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDiarioGeneral;
	
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
	public int iHeightFormulario=564;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DiarioGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDiarioGeneral=new JPanel();
				this.jPanelAccionesFormularioDiarioGeneral=new JPanel();
				this.jmenuBarDetalleDiarioGeneral=new JMenuBar();
				this.jTtoolBarDetalleDiarioGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DiarioGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDiarioGeneral() {
		return this.jButtonActualizarToolBarDiarioGeneral;
	}
	
	public JButton getjButtonEliminarToolBarDiarioGeneral() {
		return this.jButtonEliminarToolBarDiarioGeneral;
	}
	
	public JButton getjButtonCancelarToolBarDiarioGeneral() {
		return this.jButtonCancelarToolBarDiarioGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionDiarioGeneral() {
		return this.jButtonProcesarInformacionDiarioGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiarioGeneral)	{
		this.jButtonProcesarInformacionDiarioGeneral = jButtonProcesarInformacionDiarioGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiarioGeneral() {
		return this.jComboBoxTiposAccionesDiarioGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiarioGeneral(
			JComboBox jComboBoxTiposRelacionesDiarioGeneral) {
		this.jComboBoxTiposRelacionesDiarioGeneral = jComboBoxTiposRelacionesDiarioGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiarioGeneral(
			JComboBox jComboBoxTiposAccionesDiarioGeneral) {
		this.jComboBoxTiposAccionesDiarioGeneral = jComboBoxTiposAccionesDiarioGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDiarioGeneral() {
		return this.jComboBoxTiposAccionesFormularioDiarioGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDiarioGeneral(
			JComboBox jComboBoxTiposAccionesFormularioDiarioGeneral) {
		this.jComboBoxTiposAccionesFormularioDiarioGeneral = jComboBoxTiposAccionesFormularioDiarioGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
		
		this.diariogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diariogeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiarioGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diario General MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		DiarioGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDiarioGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDiarioGeneral=new JButtonMe();
				this.jButtonModificarToolBarDiarioGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral,
							"actualizar","actualizar","Actualizar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral,
							"eliminar","eliminar","Eliminar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral,
							"cancelar","cancelar","Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDiarioGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDiarioGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDiarioGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDiarioGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDiarioGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiarioGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiarioGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiarioGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDiarioGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDiarioGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDiarioGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDiarioGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDiarioGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDiarioGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDiarioGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDiarioGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDiarioGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDiarioGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDiarioGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDiarioGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDiarioGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiarioGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiarioGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiarioGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiarioGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiarioGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDiarioGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDiarioGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDiarioGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiarioGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiarioGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiarioGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiarioGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiarioGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiarioGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDiarioGeneral.add(this.jMenuItemDetalleCerrarDiarioGeneral);
		
		this.jmenuDetalleAccionesDiarioGeneral.add(this.jMenuItemActualizarDiarioGeneral);
		this.jmenuDetalleAccionesDiarioGeneral.add(this.jMenuItemEliminarDiarioGeneral);
		this.jmenuDetalleAccionesDiarioGeneral.add(this.jMenuItemCancelarDiarioGeneral);		
		
		//this.jmenuDetalleDatosDiarioGeneral.add(this.jMenuItemDetalleAbrirOrderByDiarioGeneral);				
		this.jmenuDetalleDatosDiarioGeneral.add(this.jMenuItemDetalleMostarOcultarDiarioGeneral);				
				
		//this.jmenuDetalleAccionesDiarioGeneral.add(this.jMenuItemGuardarCambiosDiarioGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDiarioGeneral.add(this.jmenuDetalleArchivoDiarioGeneral);		
		this.jmenuBarDetalleDiarioGeneral.add(this.jmenuDetalleAccionesDiarioGeneral);		
		this.jmenuBarDetalleDiarioGeneral.add(this.jmenuDetalleDatosDiarioGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDiarioGeneral);				
	}
	
	
	public void inicializarElementosCamposDiarioGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDiarioGeneral = new JLabelMe();
		jLabelIdDiarioGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDiarioGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDiarioGeneral= new GridBagLayout();

		this.jPanelidDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);

		jLabelidDiarioGeneral = new JLabel();
		jLabelidDiarioGeneral.setText("Id");

		jLabelidDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioDiarioGeneral = new JLabelMe();
		this.jLabelfecha_inicioDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioDiarioGeneral.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelfecha_inicioDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		//jFormattedTextFieldfecha_inicioDiarioGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioDiarioGeneral= new JDateChooser();
		jDateChooserfecha_inicioDiarioGeneral.setEnabled(false);
		jDateChooserfecha_inicioDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioDiarioGeneral.setDate(new Date());
		jDateChooserfecha_inicioDiarioGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioDiarioGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioDiarioGeneralBusqueda.setText("U");
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finDiarioGeneral = new JLabelMe();
		this.jLabelfecha_finDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finDiarioGeneral.setToolTipText("Fecha Fin");
		this.jLabelfecha_finDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelfecha_finDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		//jFormattedTextFieldfecha_finDiarioGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_finDiarioGeneral= new JDateChooser();
		jDateChooserfecha_finDiarioGeneral.setEnabled(false);
		jDateChooserfecha_finDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finDiarioGeneral.setDate(new Date());
		jDateChooserfecha_finDiarioGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finDiarioGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_finDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finDiarioGeneralBusqueda.setText("U");
		this.jButtonfecha_finDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoDiarioGeneral = new JLabelMe();
		this.jLabeltipo_movimientoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoDiarioGeneral.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPaneltipo_movimientoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextAreatipo_movimientoDiarioGeneral= new JTextAreaMe();
		jTextAreatipo_movimientoDiarioGeneral.setEnabled(false);
		jTextAreatipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDiarioGeneral.setLineWrap(true);
		jTextAreatipo_movimientoDiarioGeneral.setWrapStyleWord(true);
		jTextAreatipo_movimientoDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoDiarioGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoDiarioGeneral = new JScrollPane(jTextAreatipo_movimientoDiarioGeneral);
		jscrollPanetipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontipo_movimientoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoDiarioGeneralBusqueda.setText("U");
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorDiarioGeneral = new JLabelMe();
		this.jLabelnumero_mayorDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorDiarioGeneral.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelnumero_mayorDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextAreanumero_mayorDiarioGeneral= new JTextAreaMe();
		jTextAreanumero_mayorDiarioGeneral.setEnabled(false);
		jTextAreanumero_mayorDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiarioGeneral.setLineWrap(true);
		jTextAreanumero_mayorDiarioGeneral.setWrapStyleWord(true);
		jTextAreanumero_mayorDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorDiarioGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorDiarioGeneral = new JScrollPane(jTextAreanumero_mayorDiarioGeneral);
		jscrollPanenumero_mayorDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnumero_mayorDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorDiarioGeneralBusqueda.setText("U");
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDiarioGeneral = new JLabelMe();
		this.jLabelcodigoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDiarioGeneral.setToolTipText("Codigo");
		this.jLabelcodigoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelcodigoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFieldcodigoDiarioGeneral= new JTextFieldMe();

		jTextFieldcodigoDiarioGeneral.setEnabled(false);
		jTextFieldcodigoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtoncodigoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDiarioGeneralBusqueda.setText("U");
		this.jButtoncodigoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnombreDiarioGeneral = new JLabelMe();
		this.jLabelnombreDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDiarioGeneral.setToolTipText("Nombre");
		this.jLabelnombreDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelnombreDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextAreanombreDiarioGeneral= new JTextAreaMe();
		jTextAreanombreDiarioGeneral.setEnabled(false);
		jTextAreanombreDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDiarioGeneral.setLineWrap(true);
		jTextAreanombreDiarioGeneral.setWrapStyleWord(true);
		jTextAreanombreDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDiarioGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDiarioGeneral = new JScrollPane(jTextAreanombreDiarioGeneral);
		jscrollPanenombreDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombreDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombreDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonnombreDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDiarioGeneralBusqueda.setText("U");
		this.jButtonnombreDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asientoDiarioGeneral = new JLabelMe();
		this.jLabelcodigo_asientoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO+" : *");
		this.jLabelcodigo_asientoDiarioGeneral.setToolTipText("Codigo Asiento");
		this.jLabelcodigo_asientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asientoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asientoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelcodigo_asientoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFieldcodigo_asientoDiarioGeneral= new JTextFieldMe();

		jTextFieldcodigo_asientoDiarioGeneral.setEnabled(false);
		jTextFieldcodigo_asientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asientoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asientoDiarioGeneralBusqueda.setText("U");
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asientoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asientoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asientoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asientoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asientoDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localDiarioGeneral = new JLabelMe();
		this.jLabeldebito_localDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localDiarioGeneral.setToolTipText("Debito");
		this.jLabeldebito_localDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPaneldebito_localDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFielddebito_localDiarioGeneral= new JTextFieldMe();
		jTextFielddebito_localDiarioGeneral.setEnabled(false);
		jTextFielddebito_localDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localDiarioGeneral.setText("0.0");

		this.jButtondebito_localDiarioGeneralBusqueda= new JButtonMe();
		this.jButtondebito_localDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localDiarioGeneralBusqueda.setText("U");
		this.jButtondebito_localDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localDiarioGeneral = new JLabelMe();
		this.jLabelcredito_localDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localDiarioGeneral.setToolTipText("Credito");
		this.jLabelcredito_localDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelcredito_localDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFieldcredito_localDiarioGeneral= new JTextFieldMe();
		jTextFieldcredito_localDiarioGeneral.setEnabled(false);
		jTextFieldcredito_localDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localDiarioGeneral.setText("0.0");

		this.jButtoncredito_localDiarioGeneralBusqueda= new JButtonMe();
		this.jButtoncredito_localDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localDiarioGeneralBusqueda.setText("U");
		this.jButtoncredito_localDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabeldebito_extranDiarioGeneral = new JLabelMe();
		this.jLabeldebito_extranDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN+" : *");
		this.jLabeldebito_extranDiarioGeneral.setToolTipText("Debito Extranjero");
		this.jLabeldebito_extranDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_extranDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_extranDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_extranDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_extranDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_extranDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPaneldebito_extranDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFielddebito_extranDiarioGeneral= new JTextFieldMe();
		jTextFielddebito_extranDiarioGeneral.setEnabled(false);
		jTextFielddebito_extranDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_extranDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_extranDiarioGeneral.setText("0.0");

		this.jButtondebito_extranDiarioGeneralBusqueda= new JButtonMe();
		this.jButtondebito_extranDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_extranDiarioGeneralBusqueda.setText("U");
		this.jButtondebito_extranDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_extranDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_extranDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_extranDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_extranDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_extranDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_extranDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcredito_extranDiarioGeneral = new JLabelMe();
		this.jLabelcredito_extranDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN+" : *");
		this.jLabelcredito_extranDiarioGeneral.setToolTipText("Credito Extranjero");
		this.jLabelcredito_extranDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_extranDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_extranDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_extranDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_extranDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_extranDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelcredito_extranDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFieldcredito_extranDiarioGeneral= new JTextFieldMe();
		jTextFieldcredito_extranDiarioGeneral.setEnabled(false);
		jTextFieldcredito_extranDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_extranDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_extranDiarioGeneral.setText("0.0");

		this.jButtoncredito_extranDiarioGeneralBusqueda= new JButtonMe();
		this.jButtoncredito_extranDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_extranDiarioGeneralBusqueda.setText("U");
		this.jButtoncredito_extranDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_extranDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_extranDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_extranDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_extranDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_extranDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_extranDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfechaDiarioGeneral = new JLabelMe();
		this.jLabelfechaDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDiarioGeneral.setToolTipText("Fecha");
		this.jLabelfechaDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelfechaDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		//jFormattedTextFieldfechaDiarioGeneral= new JFormattedTextFieldMe();

		jDateChooserfechaDiarioGeneral= new JDateChooser();
		jDateChooserfechaDiarioGeneral.setEnabled(false);
		jDateChooserfechaDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDiarioGeneral.setDate(new Date());
		jDateChooserfechaDiarioGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDiarioGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonfechaDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDiarioGeneralBusqueda.setText("U");
		this.jButtonfechaDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabeldetalleDiarioGeneral = new JLabelMe();
		this.jLabeldetalleDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleDiarioGeneral.setToolTipText("Detalle");
		this.jLabeldetalleDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPaneldetalleDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextAreadetalleDiarioGeneral= new JTextAreaMe();
		jTextAreadetalleDiarioGeneral.setEnabled(false);
		jTextAreadetalleDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiarioGeneral.setLineWrap(true);
		jTextAreadetalleDiarioGeneral.setWrapStyleWord(true);
		jTextAreadetalleDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleDiarioGeneral.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleDiarioGeneral = new JScrollPane(jTextAreadetalleDiarioGeneral);
		jscrollPanedetalleDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedetalleDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedetalleDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondetalleDiarioGeneralBusqueda= new JButtonMe();
		this.jButtondetalleDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleDiarioGeneralBusqueda.setText("U");
		this.jButtondetalleDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleDiarioGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnombre_estadoDiarioGeneral = new JLabelMe();
		this.jLabelnombre_estadoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO+" : *");
		this.jLabelnombre_estadoDiarioGeneral.setToolTipText("Nombre Estado");
		this.jLabelnombre_estadoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_estadoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_estadoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_estadoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_estadoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_estadoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelnombre_estadoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jTextFieldnombre_estadoDiarioGeneral= new JTextFieldMe();

		jTextFieldnombre_estadoDiarioGeneral.setEnabled(false);
		jTextFieldnombre_estadoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_estadoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_estadoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_estadoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_estadoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_estadoDiarioGeneralBusqueda.setText("U");
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_estadoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_estadoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_estadoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_estadoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_estadoDiarioGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDiarioGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDiarioGeneral = new JLabelMe();
		this.jLabelid_empresaDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDiarioGeneral.setToolTipText("Empresa");
		this.jLabelid_empresaDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_empresaDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_empresaDiarioGeneral= new JComboBoxMe();
		jComboBoxid_empresaDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDiarioGeneral.setEnabled(false);

		this.jButtonid_empresaDiarioGeneral= new JButtonMe();
		this.jButtonid_empresaDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiarioGeneral.setText("Buscar");
		this.jButtonid_empresaDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiarioGeneral"));

		this.jButtonid_empresaDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_empresaDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiarioGeneralBusqueda.setText("U");
		this.jButtonid_empresaDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_empresaDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_empresaDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiarioGeneralUpdate.setText("U");
		this.jButtonid_empresaDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiarioGeneralUpdate"));



					
		this.jLabelid_sucursalDiarioGeneral = new JLabelMe();
		this.jLabelid_sucursalDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDiarioGeneral.setToolTipText("Sucursal");
		this.jLabelid_sucursalDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_sucursalDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_sucursalDiarioGeneral= new JComboBoxMe();
		jComboBoxid_sucursalDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDiarioGeneral.setEnabled(false);

		this.jButtonid_sucursalDiarioGeneral= new JButtonMe();
		this.jButtonid_sucursalDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiarioGeneral.setText("Buscar");
		this.jButtonid_sucursalDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiarioGeneral"));

		this.jButtonid_sucursalDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_sucursalDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiarioGeneralBusqueda.setText("U");
		this.jButtonid_sucursalDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_sucursalDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiarioGeneralUpdate.setText("U");
		this.jButtonid_sucursalDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiarioGeneralUpdate"));



					
		this.jLabelid_ejercicioDiarioGeneral = new JLabelMe();
		this.jLabelid_ejercicioDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDiarioGeneral.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_ejercicioDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_ejercicioDiarioGeneral= new JComboBoxMe();
		jComboBoxid_ejercicioDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDiarioGeneral.setEnabled(false);

		this.jButtonid_ejercicioDiarioGeneral= new JButtonMe();
		this.jButtonid_ejercicioDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiarioGeneral.setText("Buscar");
		this.jButtonid_ejercicioDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiarioGeneral"));

		this.jButtonid_ejercicioDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDiarioGeneralBusqueda.setText("U");
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_ejercicioDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDiarioGeneralUpdate.setText("U");
		this.jButtonid_ejercicioDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiarioGeneralUpdate"));



					
		this.jLabelid_periodoDiarioGeneral = new JLabelMe();
		this.jLabelid_periodoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDiarioGeneral.setToolTipText("Periodo");
		this.jLabelid_periodoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_periodoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_periodoDiarioGeneral= new JComboBoxMe();
		jComboBoxid_periodoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDiarioGeneral.setEnabled(false);

		this.jButtonid_periodoDiarioGeneral= new JButtonMe();
		this.jButtonid_periodoDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDiarioGeneral.setText("Buscar");
		this.jButtonid_periodoDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDiarioGeneral"));

		this.jButtonid_periodoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_periodoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDiarioGeneralBusqueda.setText("U");
		this.jButtonid_periodoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_periodoDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_periodoDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDiarioGeneralUpdate.setText("U");
		this.jButtonid_periodoDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDiarioGeneralUpdate"));



					
		this.jLabelid_moduloDiarioGeneral = new JLabelMe();
		this.jLabelid_moduloDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDiarioGeneral.setToolTipText("Modulo");
		this.jLabelid_moduloDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_moduloDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_moduloDiarioGeneral= new JComboBoxMe();
		jComboBoxid_moduloDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDiarioGeneral.setEnabled(false);

		this.jButtonid_moduloDiarioGeneral= new JButtonMe();
		this.jButtonid_moduloDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDiarioGeneral.setText("Buscar");
		this.jButtonid_moduloDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDiarioGeneral"));

		this.jButtonid_moduloDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_moduloDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDiarioGeneralBusqueda.setText("U");
		this.jButtonid_moduloDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_moduloDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_moduloDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDiarioGeneralUpdate.setText("U");
		this.jButtonid_moduloDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDiarioGeneralUpdate"));



					
		this.jLabelid_tipo_movimientoDiarioGeneral = new JLabelMe();
		this.jLabelid_tipo_movimientoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoDiarioGeneral.setToolTipText("Tipo Movimiento Base");
		this.jLabelid_tipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_tipo_movimientoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_tipo_movimientoDiarioGeneral= new JComboBoxMe();
		jComboBoxid_tipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoDiarioGeneral= new JButtonMe();
		this.jButtonid_tipo_movimientoDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiarioGeneral.setText("Buscar");
		this.jButtonid_tipo_movimientoDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiarioGeneral"));

		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setText("U");
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setText("U");
		this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiarioGeneralUpdate"));



					
		this.jLabelid_tipo_documentoDiarioGeneral = new JLabelMe();
		this.jLabelid_tipo_documentoDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoDiarioGeneral.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_tipo_documentoDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_tipo_documentoDiarioGeneral= new JComboBoxMe();
		jComboBoxid_tipo_documentoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoDiarioGeneral= new JButtonMe();
		this.jButtonid_tipo_documentoDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDiarioGeneral.setText("Buscar");
		this.jButtonid_tipo_documentoDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDiarioGeneral"));

		this.jButtonid_tipo_documentoDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setText("U");
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoDiarioGeneralUpdate.setText("U");
		this.jButtonid_tipo_documentoDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDiarioGeneralUpdate"));



					
		this.jLabelid_asiento_contableDiarioGeneral = new JLabelMe();
		this.jLabelid_asiento_contableDiarioGeneral.setText(""+DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDiarioGeneral.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDiarioGeneral.setToolTipText(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDiarioGeneral = new GridBagLayout();
		this.jPanelid_asiento_contableDiarioGeneral.setLayout(this.gridaBagLayoutDiarioGeneral);


		jComboBoxid_asiento_contableDiarioGeneral= new JComboBoxMe();
		jComboBoxid_asiento_contableDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableDiarioGeneral.setEnabled(false);

		this.jButtonid_asiento_contableDiarioGeneral= new JButtonMe();
		this.jButtonid_asiento_contableDiarioGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDiarioGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDiarioGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDiarioGeneral.setText("Buscar");
		this.jButtonid_asiento_contableDiarioGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDiarioGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDiarioGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDiarioGeneral"));

		this.jButtonid_asiento_contableDiarioGeneralBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDiarioGeneralBusqueda.setText("U");
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDiarioGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDiarioGeneralBusqueda"));

		if(this.diariogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDiarioGeneralBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDiarioGeneralUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDiarioGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDiarioGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDiarioGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDiarioGeneralUpdate.setText("U");
		this.jButtonid_asiento_contableDiarioGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDiarioGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDiarioGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDiarioGeneralUpdate"));



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
		//this.jInternalFrameDetalleDiarioGeneral = new DiarioGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Diario General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiarioGeneral= new GridBagLayout();
		

		
		String sToolTipDiarioGeneral="";
		sToolTipDiarioGeneral=DiarioGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiarioGeneral+="(Contabilidad.DiarioGeneral)";
		}
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiarioGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDiarioGeneral = new JButtonMe();
		this.jButtonModificarDiarioGeneral = new JButtonMe();
        this.jButtonActualizarDiarioGeneral = new JButtonMe();
        this.jButtonEliminarDiarioGeneral = new JButtonMe();
        this.jButtonCancelarDiarioGeneral = new JButtonMe();
        this.jButtonGuardarCambiosDiarioGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaDiarioGeneral = new JButtonMe();
		this.jButtonCerrarDiarioGeneral = new JButtonMe();
		
		this.jScrollPanelDatosDiarioGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionDiarioGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralDiarioGeneral = new JScrollPane();
		//this.jScrollPanelDatosDiarioGeneralTotales = new JScrollPane();		
		
		
		this.jPanelCamposDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Diario General";
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDiarioGeneralTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDiarioGeneral.setName("jPanelCamposDiarioGeneral"); 

		this.jPanelCamposOcultosDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDiarioGeneral.setName("jPanelCamposOcultosDiarioGeneral"); 

        this.jPanelAccionesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiarioGeneral.setToolTipText("Acciones");
        this.jPanelAccionesDiarioGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDiarioGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDiarioGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDiarioGeneral.setText("Nuevo");
		this.jButtonModificarDiarioGeneral.setText("Editar");
        this.jButtonActualizarDiarioGeneral.setText("Actualizar");
        this.jButtonEliminarDiarioGeneral.setText("Eliminar");
        this.jButtonCancelarDiarioGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosDiarioGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaDiarioGeneral.setText("Guardar");
		this.jButtonCerrarDiarioGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiarioGeneral,"nuevo_button","Nuevo",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDiarioGeneral,"modificar_button","Editar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDiarioGeneral,"actualizar_button","Actualizar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDiarioGeneral,"eliminar_button","Eliminar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDiarioGeneral,"cancelar_button","Cancelar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDiarioGeneral,"guardarcambios_button","Guardar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiarioGeneral,"guardarcambiostabla_button","Guardar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiarioGeneral,"cerrar_button","Salir",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDiarioGeneral.setToolTipText("Nuevo"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDiarioGeneral.setToolTipText("Editar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDiarioGeneral.setToolTipText("Actualizar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDiarioGeneral.setToolTipText("Eliminar)"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDiarioGeneral.setToolTipText("Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDiarioGeneral.setToolTipText("Guardar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDiarioGeneral.setToolTipText("Guardar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiarioGeneral.setToolTipText("Salir"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiarioGeneral";
		inputMap = this.jButtonNuevoDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiarioGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiarioGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDiarioGeneral";
		inputMap = this.jButtonActualizarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDiarioGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarDiarioGeneral";
		inputMap = this.jButtonEliminarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDiarioGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarDiarioGeneral";
		inputMap = this.jButtonCancelarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDiarioGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarDiarioGeneral";
		inputMap = this.jButtonCerrarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiarioGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiarioGeneral";
		inputMap = this.jButtonGuardarCambiosTablaDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiarioGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDiarioGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDiarioGeneral.setToolTipText("Nuevo DiarioGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDiarioGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDiarioGeneral.setToolTipText("Sin Cerrar Ventana DiarioGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDiarioGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDiarioGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiarioGeneral.setText("Accion");
		this.jComboBoxTiposAccionesDiarioGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDiarioGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDiarioGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDiarioGeneral = new JLabelMe();
		
		this.jLabelAccionesDiarioGeneral.setText("Acciones");		
		this.jLabelAccionesDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDiarioGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDiarioGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDiarioGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDiarioGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDiarioGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiarioGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiarioGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDiarioGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiarioGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiarioGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDiarioGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDiarioGeneral = new GridBagLayout();
		
		this.jPanelCamposDiarioGeneral.setLayout(gridaBagLayoutCamposDiarioGeneral);
		this.jPanelCamposOcultosDiarioGeneral.setLayout(gridaBagLayoutCamposOcultosDiarioGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDiarioGeneral.add(jLabelIdDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDiarioGeneral.add(jLabelidDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDiarioGeneral.add(jLabelid_empresaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiarioGeneral.add(jButtonid_empresaDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiarioGeneral.add(jButtonid_empresaDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDiarioGeneral.add(jComboBoxid_empresaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDiarioGeneral.add(jLabelid_sucursalDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiarioGeneral.add(jButtonid_sucursalDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiarioGeneral.add(jButtonid_sucursalDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDiarioGeneral.add(jComboBoxid_sucursalDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDiarioGeneral.add(jLabelid_ejercicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDiarioGeneral.add(jButtonid_ejercicioDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDiarioGeneral.add(jButtonid_ejercicioDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDiarioGeneral.add(jComboBoxid_ejercicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDiarioGeneral.add(jLabelid_periodoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDiarioGeneral.add(jButtonid_periodoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDiarioGeneral.add(jButtonid_periodoDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDiarioGeneral.add(jComboBoxid_periodoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDiarioGeneral.add(jLabelid_moduloDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDiarioGeneral.add(jButtonid_moduloDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDiarioGeneral.add(jButtonid_moduloDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDiarioGeneral.add(jComboBoxid_moduloDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoDiarioGeneral.add(jLabelid_tipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoDiarioGeneral.add(jButtonid_tipo_movimientoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoDiarioGeneral.add(jButtonid_tipo_movimientoDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoDiarioGeneral.add(jComboBoxid_tipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoDiarioGeneral.add(jLabelid_tipo_documentoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoDiarioGeneral.add(jButtonid_tipo_documentoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoDiarioGeneral.add(jButtonid_tipo_documentoDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoDiarioGeneral.add(jComboBoxid_tipo_documentoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioDiarioGeneral.add(jLabelfecha_inicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioDiarioGeneral.add(jButtonfecha_inicioDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioDiarioGeneral.add(jDateChooserfecha_inicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finDiarioGeneral.add(jLabelfecha_finDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finDiarioGeneral.add(jButtonfecha_finDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finDiarioGeneral.add(jDateChooserfecha_finDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDiarioGeneral.add(jLabelid_asiento_contableDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDiarioGeneral.add(jButtonid_asiento_contableDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 3;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDiarioGeneral.add(jButtonid_asiento_contableDiarioGeneralUpdate, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDiarioGeneral.add(jComboBoxid_asiento_contableDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoDiarioGeneral.add(jLabeltipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoDiarioGeneral.add(jButtontipo_movimientoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoDiarioGeneral.add(jscrollPanetipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorDiarioGeneral.add(jLabelnumero_mayorDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorDiarioGeneral.add(jButtonnumero_mayorDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorDiarioGeneral.add(jscrollPanenumero_mayorDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDiarioGeneral.add(jLabelcodigoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDiarioGeneral.add(jButtoncodigoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDiarioGeneral.add(jTextFieldcodigoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDiarioGeneral.add(jLabelnombreDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDiarioGeneral.add(jButtonnombreDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDiarioGeneral.add(jscrollPanenombreDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asientoDiarioGeneral.add(jLabelcodigo_asientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asientoDiarioGeneral.add(jButtoncodigo_asientoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asientoDiarioGeneral.add(jTextFieldcodigo_asientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localDiarioGeneral.add(jLabeldebito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localDiarioGeneral.add(jButtondebito_localDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localDiarioGeneral.add(jTextFielddebito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localDiarioGeneral.add(jLabelcredito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localDiarioGeneral.add(jButtoncredito_localDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localDiarioGeneral.add(jTextFieldcredito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_extranDiarioGeneral.add(jLabeldebito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_extranDiarioGeneral.add(jButtondebito_extranDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_extranDiarioGeneral.add(jTextFielddebito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_extranDiarioGeneral.add(jLabelcredito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_extranDiarioGeneral.add(jButtoncredito_extranDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_extranDiarioGeneral.add(jTextFieldcredito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDiarioGeneral.add(jLabelfechaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDiarioGeneral.add(jButtonfechaDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDiarioGeneral.add(jDateChooserfechaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleDiarioGeneral.add(jLabeldetalleDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleDiarioGeneral.add(jButtondetalleDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleDiarioGeneral.add(jscrollPanedetalleDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 0;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_estadoDiarioGeneral.add(jLabelnombre_estadoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 2;
		this.gridBagConstraintsDiarioGeneral.ipadx = 0;
		this.gridBagConstraintsDiarioGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_estadoDiarioGeneral.add(jButtonnombre_estadoDiarioGeneralBusqueda, this.gridBagConstraintsDiarioGeneral);
	}

	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiarioGeneral.gridy = 0;
	this.gridBagConstraintsDiarioGeneral.gridx = 1;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_estadoDiarioGeneral.add(jTextFieldnombre_estadoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelidDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelid_tipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelid_tipo_documentoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelfecha_inicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelfecha_finDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPaneltipo_movimientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelnumero_mayorDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelcodigoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelnombreDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelcodigo_asientoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPaneldebito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelcredito_localDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPaneldebito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelcredito_extranDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelfechaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPaneldetalleDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiarioGeneral.add(this.jPanelnombre_estadoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposDiarioGeneral % 3==0) {
		iXPanelCamposDiarioGeneral=0;
		iYPanelCamposDiarioGeneral++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_empresaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_sucursalDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_ejercicioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_periodoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_moduloDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
	}
	this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiarioGeneral.gridy = iYPanelCamposOcultosDiarioGeneral;
	this.gridBagConstraintsDiarioGeneral.gridx = iXPanelCamposOcultosDiarioGeneral++;
	this.gridBagConstraintsDiarioGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiarioGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiarioGeneral.add(this.jPanelid_asiento_contableDiarioGeneral, this.gridBagConstraintsDiarioGeneral);



	if(iXPanelCamposOcultosDiarioGeneral % 3==0) {
		iXPanelCamposOcultosDiarioGeneral=0;
		iYPanelCamposOcultosDiarioGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesDiarioGeneral= new GridBagLayout();
		this.jPanelAccionesDiarioGeneral.setLayout(gridaBagLayoutAccionesDiarioGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDiarioGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioDiarioGeneral.setLayout(gridaBagLayoutAccionesFormularioDiarioGeneral);
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDiarioGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDiarioGeneral.add(this.jComboBoxTiposAccionesFormularioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesDiarioGeneral.add(this.jButtonModificarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);							

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesDiarioGeneral.add(this.jButtonEliminarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = 0;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiarioGeneral.add(this.jButtonActualizarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = 0;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiarioGeneral.add(this.jButtonGuardarCambiosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);	
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = 0;		
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesDiarioGeneral.add(this.jButtonCancelarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiarioGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiarioGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();						
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiarioGeneral.gridx = 0;		
			//this.gridBagConstraintsDiarioGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiarioGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiarioGeneral.gridx =0;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiarioGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDiarioGeneral = new DiarioGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Diario General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Diario General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diario General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DiarioGeneralModel diariogeneralModel=new DiarioGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//DiarioGeneralModel.DiarioGeneralFocusTraversalPolicy diariogeneralFocusTraversalPolicy = diariogeneralModel.new DiarioGeneralFocusTraversalPolicy(this);
			
			//diariogeneralFocusTraversalPolicy.setdiariogeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(diariogeneralModel);
			
			
			this.jContentPaneDetalleDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDiarioGeneral = new GridBagLayout();	
			this.jContentPaneDetalleDiarioGeneral.setLayout(gridaBagLayoutDetalleDiarioGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiarioGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
				this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDiarioGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleDiarioGeneral.add(jTtoolBarDetalleDiarioGeneral, gridBagConstraintsDiarioGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionDiarioGeneral=   new JScrollPane(jContentPaneDetalleDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiarioGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiarioGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiarioGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDiarioGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiarioGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiarioGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiarioGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDiarioGeneral.gridx = 0;
	        
			this.jContentPaneDetalleDiarioGeneral.add(jPanelCamposDiarioGeneral, gridBagConstraintsDiarioGeneral);
			
			
			
			
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
						//&& diariogeneralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDiarioGeneral= new GridBagConstraints();
						this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDiarioGeneral.gridx = 0;
						this.jContentPaneDetalleDiarioGeneral.add(this.jTabbedPaneRelacionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDiarioGeneral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDiarioGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
					this.gridBagConstraintsDiarioGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDiarioGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleDiarioGeneral.add(jPanelCamposOcultosDiarioGeneral, gridBagConstraintsDiarioGeneral);
				
					this.jPanelCamposOcultosDiarioGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDiarioGeneral.gridx = 0;
	        this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDiarioGeneral.add(this.jPanelAccionesFormularioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);							
			
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
	        this.gridBagConstraintsDiarioGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDiarioGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleDiarioGeneral.add(this.jPanelAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDiarioGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDiarioGeneral=   new JScrollPane(this.jPanelCamposDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiarioGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiarioGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiarioGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDiarioGeneral.gridx = 0;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDiarioGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiarioGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiarioGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDiarioGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionDiarioGeneral;
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
