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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.HistorialConciliacionesBancariasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class HistorialConciliacionesBancariasDetalleFormJInternalFrame extends HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialConciliacionesBancarias;
	
	protected JMenuBar jmenuBarDetalleHistorialConciliacionesBancarias;
	
	protected JMenu jmenuDetalleHistorialConciliacionesBancarias;
	protected JMenu jmenuDetalleArchivoHistorialConciliacionesBancarias;
	protected JMenu jmenuDetalleAccionesHistorialConciliacionesBancarias;
	protected JMenu jmenuDetalleDatosHistorialConciliacionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialConciliacionesBancarias;	
	protected GridBagConstraints gridBagConstraintsHistorialConciliacionesBancarias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialConciliacionesBancarias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public HistorialConciliacionesBancariasSessionBean historialconciliacionesbancariasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public HistorialConciliacionesBancariasLogic historialconciliacionesbancariasLogic;
	
	public JScrollPane jScrollPanelDatosHistorialConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionHistorialConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralHistorialConciliacionesBancarias;
	
	protected JPanel jPanelCamposHistorialConciliacionesBancarias;    
	protected JPanel jPanelCamposOcultosHistorialConciliacionesBancarias;    	
	protected JPanel jPanelAccionesHistorialConciliacionesBancarias;
	protected JPanel jPanelAccionesFormularioHistorialConciliacionesBancarias;
    
	
	
	protected Integer iXPanelCamposHistorialConciliacionesBancarias=0;
	protected Integer iYPanelCamposHistorialConciliacionesBancarias=0;
	
	protected Integer iXPanelCamposOcultosHistorialConciliacionesBancarias=0;
	protected Integer iYPanelCamposOcultosHistorialConciliacionesBancarias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialConciliacionesBancarias;
	public JButton jButtonModificarHistorialConciliacionesBancarias;
	public JButton jButtonActualizarHistorialConciliacionesBancarias;
    public JButton jButtonEliminarHistorialConciliacionesBancarias;
	public JButton jButtonCancelarHistorialConciliacionesBancarias;
    public JButton jButtonGuardarCambiosHistorialConciliacionesBancarias;
	public JButton jButtonGuardarCambiosTablaHistorialConciliacionesBancarias;
	protected JButton jButtonCerrarHistorialConciliacionesBancarias;
	
	
	protected JButton jButtonProcesarInformacionHistorialConciliacionesBancarias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonModificarToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonActualizarToolBarHistorialConciliacionesBancarias;
    protected JButton jButtonEliminarToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonCancelarToolBarHistorialConciliacionesBancarias;
    protected JButton jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialConciliacionesBancarias;
	protected JButton jButtonCerrarToolBarHistorialConciliacionesBancarias;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialConciliacionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemModificarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemActualizarHistorialConciliacionesBancarias;
    protected JMenuItem jMenuItemEliminarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemCancelarHistorialConciliacionesBancarias;
    protected JMenuItem jMenuItemGuardarCambiosHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemCerrarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialConciliacionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarHistorialConciliacionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialConciliacionesBancarias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialConciliacionesBancarias;
	public JLabel jLabelIdHistorialConciliacionesBancarias;
	public JLabel jLabelidHistorialConciliacionesBancarias;
	public JButton jButtonidHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeHistorialConciliacionesBancarias;
	public JLabel jLabelfecha_desdeHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdeHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_desdeHistorialConciliacionesBancarias;
	public JButton jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaHistorialConciliacionesBancarias;
	public JLabel jLabelfecha_hastaHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_hastaHistorialConciliacionesBancarias;
	public JButton jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localHistorialConciliacionesBancarias;
	public JLabel jLabeldebito_localHistorialConciliacionesBancarias;
	public JTextField jTextFielddebito_localHistorialConciliacionesBancarias;
	public JButton jButtondebito_localHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localHistorialConciliacionesBancarias;
	public JLabel jLabelcredito_localHistorialConciliacionesBancarias;
	public JTextField jTextFieldcredito_localHistorialConciliacionesBancarias;
	public JButton jButtoncredito_localHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeHistorialConciliacionesBancarias;
	public JLabel jLabelnumero_chequeHistorialConciliacionesBancarias;
	public JTextField jTextFieldnumero_chequeHistorialConciliacionesBancarias;
	public JButton jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoHistorialConciliacionesBancarias;
	public JLabel jLabelcodigoHistorialConciliacionesBancarias;
	public JTextField jTextFieldcodigoHistorialConciliacionesBancarias;
	public JButton jButtoncodigoHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioHistorialConciliacionesBancarias;
	public JLabel jLabelbeneficiarioHistorialConciliacionesBancarias;
	public JTextArea jTextAreabeneficiarioHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanebeneficiarioHistorialConciliacionesBancarias;
	public JButton jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldetalleHistorialConciliacionesBancarias;
	public JLabel jLabeldetalleHistorialConciliacionesBancarias;
	public JTextArea jTextAreadetalleHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanedetalleHistorialConciliacionesBancarias;
	public JButton jButtondetalleHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcuentaHistorialConciliacionesBancarias;
	public JLabel jLabelcuentaHistorialConciliacionesBancarias;
	public JTextField jTextFieldcuentaHistorialConciliacionesBancarias;
	public JButton jButtoncuentaHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneltipo_documentoHistorialConciliacionesBancarias;
	public JLabel jLabeltipo_documentoHistorialConciliacionesBancarias;
	public JTextArea jTextAreatipo_documentoHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanetipo_documentoHistorialConciliacionesBancarias;
	public JButton jButtontipo_documentoHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorHistorialConciliacionesBancarias;
	public JLabel jLabelnumero_mayorHistorialConciliacionesBancarias;
	public JTextArea jTextAreanumero_mayorHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanenumero_mayorHistorialConciliacionesBancarias;
	public JButton jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalizacionHistorialConciliacionesBancarias;
	public JLabel jLabelfecha_finalizacionHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_finalizacionHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_finalizacionHistorialConciliacionesBancarias;
	public JButton jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoHistorialConciliacionesBancarias;
	public JLabel jLabeltipo_movimientoHistorialConciliacionesBancarias;
	public JTextArea jTextAreatipo_movimientoHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanetipo_movimientoHistorialConciliacionesBancarias;
	public JButton jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_librosHistorialConciliacionesBancarias;
	public JLabel jLabelsaldo_librosHistorialConciliacionesBancarias;
	public JTextField jTextFieldsaldo_librosHistorialConciliacionesBancarias;
	public JButton jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfechaHistorialConciliacionesBancarias;
	public JLabel jLabelfechaHistorialConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfechaHistorialConciliacionesBancarias;

	public JDateChooser jDateChooserfechaHistorialConciliacionesBancarias;
	public JButton jButtonfechaHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaHistorialConciliacionesBancarias;
	public JLabel jLabelnumero_cuentaHistorialConciliacionesBancarias;
	public JTextField jTextFieldnumero_cuentaHistorialConciliacionesBancarias;
	public JButton jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableHistorialConciliacionesBancarias;
	public JLabel jLabelnombre_cuenta_contableHistorialConciliacionesBancarias;
	public JTextArea jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias;
	public JScrollPane jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias;
	public JButton jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelanteriorHistorialConciliacionesBancarias;
	public JLabel jLabelanteriorHistorialConciliacionesBancarias;
	public JTextField jTextFieldanteriorHistorialConciliacionesBancarias;
	public JButton jButtonanteriorHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHistorialConciliacionesBancarias;
	public JLabel jLabelid_empresaHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHistorialConciliacionesBancarias;
	public JButton jButtonid_empresaHistorialConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_empresaHistorialConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_empresaHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableHistorialConciliacionesBancarias;
	public JLabel jLabelid_cuenta_contableHistorialConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableHistorialConciliacionesBancarias;
	public JButton jButtonid_cuenta_contableHistorialConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialConciliacionesBancarias;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialConciliacionesBancarias=new JPanel();
				this.jPanelAccionesFormularioHistorialConciliacionesBancarias=new JPanel();
				this.jmenuBarDetalleHistorialConciliacionesBancarias=new JMenuBar();
				this.jTtoolBarDetalleHistorialConciliacionesBancarias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialConciliacionesBancariasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialConciliacionesBancarias() {
		return this.jButtonActualizarToolBarHistorialConciliacionesBancarias;
	}
	
	public JButton getjButtonEliminarToolBarHistorialConciliacionesBancarias() {
		return this.jButtonEliminarToolBarHistorialConciliacionesBancarias;
	}
	
	public JButton getjButtonCancelarToolBarHistorialConciliacionesBancarias() {
		return this.jButtonCancelarToolBarHistorialConciliacionesBancarias;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialConciliacionesBancarias() {
		return this.jButtonProcesarInformacionHistorialConciliacionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialConciliacionesBancarias)	{
		this.jButtonProcesarInformacionHistorialConciliacionesBancarias = jButtonProcesarInformacionHistorialConciliacionesBancarias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposRelacionesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposRelacionesHistorialConciliacionesBancarias = jComboBoxTiposRelacionesHistorialConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesHistorialConciliacionesBancarias) {
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias = jComboBoxTiposAccionesHistorialConciliacionesBancarias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias) {
		this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias = jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialconciliacionesbancariasSessionBean=new HistorialConciliacionesBancariasSessionBean();
		
		this.historialconciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialconciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialConciliacionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Conciliaciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialConciliacionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialConciliacionesBancarias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialConciliacionesBancarias=new JButtonMe();
				this.jButtonModificarToolBarHistorialConciliacionesBancarias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias,
							"actualizar","actualizar","Actualizar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias,
							"eliminar","eliminar","Eliminar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias,
							"cancelar","cancelar","Cancelar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialConciliacionesBancarias,this.jTtoolBarDetalleHistorialConciliacionesBancarias,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialConciliacionesBancarias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialConciliacionesBancarias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialConciliacionesBancarias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialConciliacionesBancarias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialConciliacionesBancarias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialConciliacionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialConciliacionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialConciliacionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialConciliacionesBancarias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialConciliacionesBancarias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialConciliacionesBancarias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialConciliacionesBancarias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialConciliacionesBancarias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialConciliacionesBancarias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialConciliacionesBancarias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialConciliacionesBancarias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialConciliacionesBancarias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialConciliacionesBancarias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialConciliacionesBancarias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialConciliacionesBancarias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialConciliacionesBancarias.add(this.jMenuItemDetalleCerrarHistorialConciliacionesBancarias);
		
		this.jmenuDetalleAccionesHistorialConciliacionesBancarias.add(this.jMenuItemActualizarHistorialConciliacionesBancarias);
		this.jmenuDetalleAccionesHistorialConciliacionesBancarias.add(this.jMenuItemEliminarHistorialConciliacionesBancarias);
		this.jmenuDetalleAccionesHistorialConciliacionesBancarias.add(this.jMenuItemCancelarHistorialConciliacionesBancarias);		
		
		//this.jmenuDetalleDatosHistorialConciliacionesBancarias.add(this.jMenuItemDetalleAbrirOrderByHistorialConciliacionesBancarias);				
		this.jmenuDetalleDatosHistorialConciliacionesBancarias.add(this.jMenuItemDetalleMostarOcultarHistorialConciliacionesBancarias);				
				
		//this.jmenuDetalleAccionesHistorialConciliacionesBancarias.add(this.jMenuItemGuardarCambiosHistorialConciliacionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialConciliacionesBancarias.add(this.jmenuDetalleArchivoHistorialConciliacionesBancarias);		
		this.jmenuBarDetalleHistorialConciliacionesBancarias.add(this.jmenuDetalleAccionesHistorialConciliacionesBancarias);		
		this.jmenuBarDetalleHistorialConciliacionesBancarias.add(this.jmenuDetalleDatosHistorialConciliacionesBancarias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialConciliacionesBancarias);				
	}
	
	
	public void inicializarElementosCamposHistorialConciliacionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialConciliacionesBancarias = new JLabelMe();
		jLabelIdHistorialConciliacionesBancarias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialConciliacionesBancarias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialConciliacionesBancarias= new GridBagLayout();

		this.jPanelidHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);

		jLabelidHistorialConciliacionesBancarias = new JLabel();
		jLabelidHistorialConciliacionesBancarias.setText("Id");

		jLabelidHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelfecha_desdeHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeHistorialConciliacionesBancarias.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelfecha_desdeHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		//jFormattedTextFieldfecha_desdeHistorialConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setEnabled(false);
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelfecha_hastaHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaHistorialConciliacionesBancarias.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelfecha_hastaHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		//jFormattedTextFieldfecha_hastaHistorialConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setEnabled(false);
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabeldebito_localHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localHistorialConciliacionesBancarias.setToolTipText("Debito Local");
		this.jLabeldebito_localHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPaneldebito_localHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFielddebito_localHistorialConciliacionesBancarias= new JTextFieldMe();
		jTextFielddebito_localHistorialConciliacionesBancarias.setEnabled(false);
		jTextFielddebito_localHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localHistorialConciliacionesBancarias.setText("0.0");

		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelcredito_localHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localHistorialConciliacionesBancarias.setToolTipText("Credito Local");
		this.jLabelcredito_localHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelcredito_localHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldcredito_localHistorialConciliacionesBancarias= new JTextFieldMe();
		jTextFieldcredito_localHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldcredito_localHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localHistorialConciliacionesBancarias.setText("0.0");

		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelnumero_chequeHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeHistorialConciliacionesBancarias.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelnumero_chequeHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldnumero_chequeHistorialConciliacionesBancarias= new JTextFieldMe();

		jTextFieldnumero_chequeHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldnumero_chequeHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelcodigoHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoHistorialConciliacionesBancarias.setToolTipText("Codigo");
		this.jLabelcodigoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelcodigoHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldcodigoHistorialConciliacionesBancarias= new JTextFieldMe();

		jTextFieldcodigoHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldcodigoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelbeneficiarioHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioHistorialConciliacionesBancarias.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelbeneficiarioHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreabeneficiarioHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioHistorialConciliacionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioHistorialConciliacionesBancarias = new JScrollPane(jTextAreabeneficiarioHistorialConciliacionesBancarias);
		jscrollPanebeneficiarioHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldetalleHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabeldetalleHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleHistorialConciliacionesBancarias.setToolTipText("Detalle");
		this.jLabeldetalleHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPaneldetalleHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreadetalleHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreadetalleHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreadetalleHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreadetalleHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreadetalleHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleHistorialConciliacionesBancarias.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleHistorialConciliacionesBancarias = new JScrollPane(jTextAreadetalleHistorialConciliacionesBancarias);
		jscrollPanedetalleHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcuentaHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelcuentaHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA+" : *");
		this.jLabelcuentaHistorialConciliacionesBancarias.setToolTipText("Cuenta");
		this.jLabelcuentaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuentaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcuentaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuentaHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuentaHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_CUENTA);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelcuentaHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldcuentaHistorialConciliacionesBancarias= new JTextFieldMe();

		jTextFieldcuentaHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldcuentaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuentaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuentaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuentaHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuentaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuentaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuentaHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuentaHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeltipo_documentoHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabeltipo_documentoHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO+" : *");
		this.jLabeltipo_documentoHistorialConciliacionesBancarias.setToolTipText("Tipo Documento");
		this.jLabeltipo_documentoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_documentoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_documentoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_documentoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_documentoHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_documentoHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPaneltipo_documentoHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreatipo_documentoHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_documentoHistorialConciliacionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_documentoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_documentoHistorialConciliacionesBancarias = new JScrollPane(jTextAreatipo_documentoHistorialConciliacionesBancarias);
		jscrollPanetipo_documentoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_documentoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_documentoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_documentoHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_documentoHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_documentoHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_documentoHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelnumero_mayorHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorHistorialConciliacionesBancarias.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelnumero_mayorHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreanumero_mayorHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorHistorialConciliacionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorHistorialConciliacionesBancarias = new JScrollPane(jTextAreanumero_mayorHistorialConciliacionesBancarias);
		jscrollPanenumero_mayorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION+" : *");
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias.setToolTipText("Fecha Finalizacion");
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalizacionHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalizacionHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalizacionHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHAFINALIZACION);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelfecha_finalizacionHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		//jFormattedTextFieldfecha_finalizacionHistorialConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setEnabled(false);
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalizacionHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalizacionHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalizacionHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalizacionHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPaneltipo_movimientoHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreatipo_movimientoHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoHistorialConciliacionesBancarias = new JScrollPane(jTextAreatipo_movimientoHistorialConciliacionesBancarias);
		jscrollPanetipo_movimientoHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_librosHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelsaldo_librosHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS+" : *");
		this.jLabelsaldo_librosHistorialConciliacionesBancarias.setToolTipText("Saldo Libros");
		this.jLabelsaldo_librosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_librosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_librosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_librosHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_librosHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_librosHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_SALDOLIBROS);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelsaldo_librosHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldsaldo_librosHistorialConciliacionesBancarias= new JTextFieldMe();
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_librosHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_librosHistorialConciliacionesBancarias.setText("0.0");

		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_librosHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_librosHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfechaHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelfechaHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaHistorialConciliacionesBancarias.setToolTipText("Fecha");
		this.jLabelfechaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelfechaHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		//jFormattedTextFieldfechaHistorialConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfechaHistorialConciliacionesBancarias= new JDateChooser();
		jDateChooserfechaHistorialConciliacionesBancarias.setEnabled(false);
		jDateChooserfechaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaHistorialConciliacionesBancarias.setDate(new Date());
		jDateChooserfechaHistorialConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaHistorialConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelnumero_cuentaHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldnumero_cuentaHistorialConciliacionesBancarias= new JTextFieldMe();

		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias= new JTextAreaMe();
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setEnabled(false);
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setLineWrap(true);
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias = new JScrollPane(jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias);
		jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelanteriorHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelanteriorHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR+" : *");
		this.jLabelanteriorHistorialConciliacionesBancarias.setToolTipText("Anterior");
		this.jLabelanteriorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanteriorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanteriorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanteriorHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanteriorHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanteriorHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_ANTERIOR);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelanteriorHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jTextFieldanteriorHistorialConciliacionesBancarias= new JTextFieldMe();
		jTextFieldanteriorHistorialConciliacionesBancarias.setEnabled(false);
		jTextFieldanteriorHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanteriorHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanteriorHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanteriorHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanteriorHistorialConciliacionesBancarias.setText("0.0");

		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanteriorHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanteriorHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanteriorHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anteriorHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanteriorHistorialConciliacionesBancariasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHistorialConciliacionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelid_empresaHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHistorialConciliacionesBancarias.setToolTipText("Empresa");
		this.jLabelid_empresaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelid_empresaHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jComboBoxid_empresaHistorialConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_empresaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHistorialConciliacionesBancarias.setEnabled(false);

		this.jButtonid_empresaHistorialConciliacionesBancarias= new JButtonMe();
		this.jButtonid_empresaHistorialConciliacionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialConciliacionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialConciliacionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialConciliacionesBancarias.setText("Buscar");
		this.jButtonid_empresaHistorialConciliacionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHistorialConciliacionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialConciliacionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialConciliacionesBancarias"));

		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHistorialConciliacionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate= new JButtonMe();
		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setText("U");
		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHistorialConciliacionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialConciliacionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialConciliacionesBancariasUpdate"));



					
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias = new JLabelMe();
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias.setText(""+HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableHistorialConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.setToolTipText(HistorialConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.setLayout(this.gridaBagLayoutHistorialConciliacionesBancarias);


		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setText("Buscar");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialConciliacionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialConciliacionesBancarias"));

		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setText("U");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialConciliacionesBancariasBusqueda"));

		if(this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setText("U");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableHistorialConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableHistorialConciliacionesBancariasUpdate"));



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
		//this.jInternalFrameDetalleHistorialConciliacionesBancarias = new HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Conciliaciones Bancarias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialConciliacionesBancarias= new GridBagLayout();
		

		
		String sToolTipHistorialConciliacionesBancarias="";
		sToolTipHistorialConciliacionesBancarias=HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialConciliacionesBancarias+="(Tesoreria.HistorialConciliacionesBancarias)";
		}
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialConciliacionesBancarias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonModificarHistorialConciliacionesBancarias = new JButtonMe();
        this.jButtonActualizarHistorialConciliacionesBancarias = new JButtonMe();
        this.jButtonEliminarHistorialConciliacionesBancarias = new JButtonMe();
        this.jButtonCancelarHistorialConciliacionesBancarias = new JButtonMe();
        this.jButtonGuardarCambiosHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarHistorialConciliacionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosHistorialConciliacionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Conciliaciones Bancarias";
		
		if(!this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Conciliaciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialConciliacionesBancarias.setName("jPanelCamposHistorialConciliacionesBancarias"); 

		this.jPanelCamposOcultosHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialConciliacionesBancarias.setName("jPanelCamposOcultosHistorialConciliacionesBancarias"); 

        this.jPanelAccionesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesHistorialConciliacionesBancarias.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialConciliacionesBancarias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialConciliacionesBancarias.setText("Nuevo");
		this.jButtonModificarHistorialConciliacionesBancarias.setText("Editar");
        this.jButtonActualizarHistorialConciliacionesBancarias.setText("Actualizar");
        this.jButtonEliminarHistorialConciliacionesBancarias.setText("Eliminar");
        this.jButtonCancelarHistorialConciliacionesBancarias.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialConciliacionesBancarias.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setText("Guardar");
		this.jButtonCerrarHistorialConciliacionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialConciliacionesBancarias,"nuevo_button","Nuevo",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialConciliacionesBancarias,"modificar_button","Editar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialConciliacionesBancarias,"actualizar_button","Actualizar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialConciliacionesBancarias,"eliminar_button","Eliminar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialConciliacionesBancarias,"cancelar_button","Cancelar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialConciliacionesBancarias,"guardarcambios_button","Guardar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias,"guardarcambiostabla_button","Guardar",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialConciliacionesBancarias,"cerrar_button","Salir",this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialConciliacionesBancarias.setToolTipText("Nuevo"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialConciliacionesBancarias.setToolTipText("Editar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialConciliacionesBancarias.setToolTipText("Actualizar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialConciliacionesBancarias.setToolTipText("Eliminar)"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialConciliacionesBancarias.setToolTipText("Cancelar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialConciliacionesBancarias.setToolTipText("Guardar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.setToolTipText("Guardar"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialConciliacionesBancarias.setToolTipText("Salir"+" "+HistorialConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialConciliacionesBancarias";
		inputMap = this.jButtonNuevoHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialConciliacionesBancarias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialConciliacionesBancarias";
		inputMap = this.jButtonActualizarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialConciliacionesBancarias"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialConciliacionesBancarias";
		inputMap = this.jButtonEliminarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialConciliacionesBancarias"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCancelarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialConciliacionesBancarias"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialConciliacionesBancarias";
		inputMap = this.jButtonCerrarHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialConciliacionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialConciliacionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialConciliacionesBancarias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias.setToolTipText("Nuevo HistorialConciliacionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias.setToolTipText("Sin Cerrar Ventana HistorialConciliacionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialConciliacionesBancarias = new JLabelMe();
		
		this.jLabelAccionesHistorialConciliacionesBancarias.setText("Acciones");		
		this.jLabelAccionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialConciliacionesBancarias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialConciliacionesBancarias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialConciliacionesBancarias=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialConciliacionesBancarias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialConciliacionesBancarias = new GridBagLayout();
		
		this.jPanelCamposHistorialConciliacionesBancarias.setLayout(gridaBagLayoutCamposHistorialConciliacionesBancarias);
		this.jPanelCamposOcultosHistorialConciliacionesBancarias.setLayout(gridaBagLayoutCamposOcultosHistorialConciliacionesBancarias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialConciliacionesBancarias.add(jLabelIdHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialConciliacionesBancarias.add(jLabelidHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHistorialConciliacionesBancarias.add(jLabelid_empresaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialConciliacionesBancarias.add(jButtonid_empresaHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 3;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialConciliacionesBancarias.add(jButtonid_empresaHistorialConciliacionesBancariasUpdate, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHistorialConciliacionesBancarias.add(jComboBoxid_empresaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.add(jLabelid_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.add(jButtonid_cuenta_contableHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 3;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.add(jButtonid_cuenta_contableHistorialConciliacionesBancariasUpdate, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableHistorialConciliacionesBancarias.add(jComboBoxid_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeHistorialConciliacionesBancarias.add(jLabelfecha_desdeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeHistorialConciliacionesBancarias.add(jButtonfecha_desdeHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeHistorialConciliacionesBancarias.add(jDateChooserfecha_desdeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaHistorialConciliacionesBancarias.add(jLabelfecha_hastaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaHistorialConciliacionesBancarias.add(jButtonfecha_hastaHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaHistorialConciliacionesBancarias.add(jDateChooserfecha_hastaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localHistorialConciliacionesBancarias.add(jLabeldebito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localHistorialConciliacionesBancarias.add(jButtondebito_localHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localHistorialConciliacionesBancarias.add(jTextFielddebito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localHistorialConciliacionesBancarias.add(jLabelcredito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localHistorialConciliacionesBancarias.add(jButtoncredito_localHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localHistorialConciliacionesBancarias.add(jTextFieldcredito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeHistorialConciliacionesBancarias.add(jLabelnumero_chequeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeHistorialConciliacionesBancarias.add(jButtonnumero_chequeHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeHistorialConciliacionesBancarias.add(jTextFieldnumero_chequeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoHistorialConciliacionesBancarias.add(jLabelcodigoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoHistorialConciliacionesBancarias.add(jButtoncodigoHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoHistorialConciliacionesBancarias.add(jTextFieldcodigoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioHistorialConciliacionesBancarias.add(jLabelbeneficiarioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioHistorialConciliacionesBancarias.add(jButtonbeneficiarioHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioHistorialConciliacionesBancarias.add(jscrollPanebeneficiarioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleHistorialConciliacionesBancarias.add(jLabeldetalleHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleHistorialConciliacionesBancarias.add(jButtondetalleHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleHistorialConciliacionesBancarias.add(jscrollPanedetalleHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuentaHistorialConciliacionesBancarias.add(jLabelcuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuentaHistorialConciliacionesBancarias.add(jButtoncuentaHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuentaHistorialConciliacionesBancarias.add(jTextFieldcuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_documentoHistorialConciliacionesBancarias.add(jLabeltipo_documentoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_documentoHistorialConciliacionesBancarias.add(jButtontipo_documentoHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_documentoHistorialConciliacionesBancarias.add(jscrollPanetipo_documentoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorHistorialConciliacionesBancarias.add(jLabelnumero_mayorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorHistorialConciliacionesBancarias.add(jButtonnumero_mayorHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorHistorialConciliacionesBancarias.add(jscrollPanenumero_mayorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalizacionHistorialConciliacionesBancarias.add(jLabelfecha_finalizacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalizacionHistorialConciliacionesBancarias.add(jButtonfecha_finalizacionHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalizacionHistorialConciliacionesBancarias.add(jDateChooserfecha_finalizacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoHistorialConciliacionesBancarias.add(jLabeltipo_movimientoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoHistorialConciliacionesBancarias.add(jButtontipo_movimientoHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoHistorialConciliacionesBancarias.add(jscrollPanetipo_movimientoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_librosHistorialConciliacionesBancarias.add(jLabelsaldo_librosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_librosHistorialConciliacionesBancarias.add(jButtonsaldo_librosHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_librosHistorialConciliacionesBancarias.add(jTextFieldsaldo_librosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaHistorialConciliacionesBancarias.add(jLabelfechaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaHistorialConciliacionesBancarias.add(jButtonfechaHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaHistorialConciliacionesBancarias.add(jDateChooserfechaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaHistorialConciliacionesBancarias.add(jLabelnumero_cuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaHistorialConciliacionesBancarias.add(jButtonnumero_cuentaHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaHistorialConciliacionesBancarias.add(jTextFieldnumero_cuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.add(jLabelnombre_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.add(jButtonnombre_cuenta_contableHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias.add(jscrollPanenombre_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanteriorHistorialConciliacionesBancarias.add(jLabelanteriorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelanteriorHistorialConciliacionesBancarias.add(jButtonanteriorHistorialConciliacionesBancariasBusqueda, this.gridBagConstraintsHistorialConciliacionesBancarias);
	}

	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanteriorHistorialConciliacionesBancarias.add(jTextFieldanteriorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelidHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelid_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelfecha_desdeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelfecha_hastaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPaneldebito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelcredito_localHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelnumero_chequeHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelcodigoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelbeneficiarioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPaneldetalleHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelcuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPaneltipo_documentoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelnumero_mayorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelfecha_finalizacionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPaneltipo_movimientoHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelsaldo_librosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelfechaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelnumero_cuentaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelnombre_cuenta_contableHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialConciliacionesBancarias.add(this.jPanelanteriorHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposHistorialConciliacionesBancarias=0;
		iYPanelCamposHistorialConciliacionesBancarias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iYPanelCamposOcultosHistorialConciliacionesBancarias;
	this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iXPanelCamposOcultosHistorialConciliacionesBancarias++;
	this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialConciliacionesBancarias.add(this.jPanelid_empresaHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);



	if(iXPanelCamposOcultosHistorialConciliacionesBancarias % 2==0) {
		iXPanelCamposOcultosHistorialConciliacionesBancarias=0;
		iYPanelCamposOcultosHistorialConciliacionesBancarias++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesHistorialConciliacionesBancarias.setLayout(gridaBagLayoutAccionesHistorialConciliacionesBancarias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialConciliacionesBancarias.setLayout(gridaBagLayoutAccionesFormularioHistorialConciliacionesBancarias);
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialConciliacionesBancarias.add(this.jComboBoxTiposAccionesFormularioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonModificarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);							

		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonEliminarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonActualizarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);


		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonGuardarCambiosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);	
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialConciliacionesBancarias.add(this.jButtonCancelarHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialConciliacionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialConciliacionesBancarias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialconciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;		
			//this.gridBagConstraintsHistorialConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialConciliacionesBancarias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =0;
		this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialConciliacionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialConciliacionesBancarias = new HistorialConciliacionesBancariasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Conciliaciones Bancarias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Conciliaciones Bancarias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Conciliaciones Bancarias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialConciliacionesBancariasModel historialconciliacionesbancariasModel=new HistorialConciliacionesBancariasModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialConciliacionesBancariasModel.HistorialConciliacionesBancariasFocusTraversalPolicy historialconciliacionesbancariasFocusTraversalPolicy = historialconciliacionesbancariasModel.new HistorialConciliacionesBancariasFocusTraversalPolicy(this);
			
			//historialconciliacionesbancariasFocusTraversalPolicy.sethistorialconciliacionesbancariasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialconciliacionesbancariasModel);
			
			
			this.jContentPaneDetalleHistorialConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialConciliacionesBancarias = new GridBagLayout();	
			this.jContentPaneDetalleHistorialConciliacionesBancarias.setLayout(gridaBagLayoutDetalleHistorialConciliacionesBancarias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialConciliacionesBancarias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialConciliacionesBancarias.add(jTtoolBarDetalleHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias=   new JScrollPane(jContentPaneDetalleHistorialConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	        
			this.jContentPaneDetalleHistorialConciliacionesBancarias.add(jPanelCamposHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);
			
			
			
			
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
						//&& historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialconciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialConciliacionesBancarias= new GridBagConstraints();
						this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
						this.jContentPaneDetalleHistorialConciliacionesBancarias.add(this.jTabbedPaneRelacionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialConciliacionesBancarias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialConciliacionesBancarias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
					this.gridBagConstraintsHistorialConciliacionesBancarias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialConciliacionesBancarias.add(jPanelCamposOcultosHistorialConciliacionesBancarias, gridBagConstraintsHistorialConciliacionesBancarias);
				
					this.jPanelCamposOcultosHistorialConciliacionesBancarias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	        this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialConciliacionesBancarias.add(this.jPanelAccionesFormularioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);							
			
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
	        this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialConciliacionesBancarias.add(this.jPanelAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialConciliacionesBancarias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias=   new JScrollPane(this.jPanelCamposHistorialConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
			this.gridBagConstraintsHistorialConciliacionesBancarias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialConciliacionesBancarias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);			
			
			this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
			
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		
			
		this.gridBagConstraintsHistorialConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialConciliacionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialConciliacionesBancarias, this.gridBagConstraintsHistorialConciliacionesBancarias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialConciliacionesBancarias;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialConciliacionesBancarias;
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
