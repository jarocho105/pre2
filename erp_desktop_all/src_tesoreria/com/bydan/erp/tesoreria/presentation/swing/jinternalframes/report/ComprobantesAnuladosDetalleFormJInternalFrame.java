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
import com.bydan.erp.tesoreria.util.report.ComprobantesAnuladosConstantesFunciones;

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
public class ComprobantesAnuladosDetalleFormJInternalFrame extends ComprobantesAnuladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComprobantesAnulados;
	
	protected JMenuBar jmenuBarDetalleComprobantesAnulados;
	
	protected JMenu jmenuDetalleComprobantesAnulados;
	protected JMenu jmenuDetalleArchivoComprobantesAnulados;
	protected JMenu jmenuDetalleAccionesComprobantesAnulados;
	protected JMenu jmenuDetalleDatosComprobantesAnulados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobantesAnulados;	
	protected GridBagConstraints gridBagConstraintsComprobantesAnulados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComprobantesAnuladosBeanSwingJInternalFrameAdditional jInternalFrameDetalleComprobantesAnulados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ComprobantesAnuladosSessionBean comprobantesanuladosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public ComprobantesAnuladosLogic comprobantesanuladosLogic;
	
	public JScrollPane jScrollPanelDatosComprobantesAnulados;
	public JScrollPane jScrollPanelDatosEdicionComprobantesAnulados;
	public JScrollPane jScrollPanelDatosGeneralComprobantesAnulados;
	
	protected JPanel jPanelCamposComprobantesAnulados;    
	protected JPanel jPanelCamposOcultosComprobantesAnulados;    	
	protected JPanel jPanelAccionesComprobantesAnulados;
	protected JPanel jPanelAccionesFormularioComprobantesAnulados;
    
	
	
	protected Integer iXPanelCamposComprobantesAnulados=0;
	protected Integer iYPanelCamposComprobantesAnulados=0;
	
	protected Integer iXPanelCamposOcultosComprobantesAnulados=0;
	protected Integer iYPanelCamposOcultosComprobantesAnulados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComprobantesAnulados;
	public JButton jButtonModificarComprobantesAnulados;
	public JButton jButtonActualizarComprobantesAnulados;
    public JButton jButtonEliminarComprobantesAnulados;
	public JButton jButtonCancelarComprobantesAnulados;
    public JButton jButtonGuardarCambiosComprobantesAnulados;
	public JButton jButtonGuardarCambiosTablaComprobantesAnulados;
	protected JButton jButtonCerrarComprobantesAnulados;
	
	
	protected JButton jButtonProcesarInformacionComprobantesAnulados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComprobantesAnulados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComprobantesAnulados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComprobantesAnulados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobantesAnulados;
	protected JButton jButtonModificarToolBarComprobantesAnulados;
	protected JButton jButtonActualizarToolBarComprobantesAnulados;
    protected JButton jButtonEliminarToolBarComprobantesAnulados;
	protected JButton jButtonCancelarToolBarComprobantesAnulados;
    protected JButton jButtonGuardarCambiosToolBarComprobantesAnulados;
	protected JButton jButtonGuardarCambiosTablaToolBarComprobantesAnulados;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobantesAnulados;
	protected JButton jButtonCerrarToolBarComprobantesAnulados;
	
	protected JButton jButtonProcesarInformacionToolBarComprobantesAnulados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobantesAnulados;
	protected JMenuItem jMenuItemModificarComprobantesAnulados;
	protected JMenuItem jMenuItemActualizarComprobantesAnulados;
    protected JMenuItem jMenuItemEliminarComprobantesAnulados;
	protected JMenuItem jMenuItemCancelarComprobantesAnulados;
    protected JMenuItem jMenuItemGuardarCambiosComprobantesAnulados;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobantesAnulados;
	protected JMenuItem jMenuItemCerrarComprobantesAnulados;
	protected JMenuItem jMenuItemDetalleCerrarComprobantesAnulados;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobantesAnulados;
	
	protected JMenuItem jMenuItemProcesarInformacionComprobantesAnulados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobantesAnulados;
	protected JMenuItem jMenuItemMostrarOcultarComprobantesAnulados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobantesAnulados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobantesAnulados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComprobantesAnulados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComprobantesAnulados;
	public JLabel jLabelIdComprobantesAnulados;
	public JLabel jLabelidComprobantesAnulados;
	public JButton jButtonidComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeComprobantesAnulados;
	public JLabel jLabelfecha_desdeComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_desdeComprobantesAnulados;

	public JDateChooser jDateChooserfecha_desdeComprobantesAnulados;
	public JButton jButtonfecha_desdeComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaComprobantesAnulados;
	public JLabel jLabelfecha_hastaComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_hastaComprobantesAnulados;

	public JDateChooser jDateChooserfecha_hastaComprobantesAnulados;
	public JButton jButtonfecha_hastaComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoComprobantesAnulados;
	public JLabel jLabeltipo_movimientoComprobantesAnulados;
	public JTextArea jTextAreatipo_movimientoComprobantesAnulados;
	public JScrollPane jscrollPanetipo_movimientoComprobantesAnulados;
	public JButton jButtontipo_movimientoComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelvalorComprobantesAnulados;
	public JLabel jLabelvalorComprobantesAnulados;
	public JTextField jTextFieldvalorComprobantesAnulados;
	public JButton jButtonvalorComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorComprobantesAnulados;
	public JLabel jLabelnumero_mayorComprobantesAnulados;
	public JTextArea jTextAreanumero_mayorComprobantesAnulados;
	public JScrollPane jscrollPanenumero_mayorComprobantesAnulados;
	public JButton jButtonnumero_mayorComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioComprobantesAnulados;
	public JLabel jLabelbeneficiarioComprobantesAnulados;
	public JTextArea jTextAreabeneficiarioComprobantesAnulados;
	public JScrollPane jscrollPanebeneficiarioComprobantesAnulados;
	public JButton jButtonbeneficiarioComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelfechaComprobantesAnulados;
	public JLabel jLabelfechaComprobantesAnulados;
	//public JFormattedTextField jDateChooserfechaComprobantesAnulados;

	public JDateChooser jDateChooserfechaComprobantesAnulados;
	public JButton jButtonfechaComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionComprobantesAnulados;
	public JLabel jLabelfecha_emisionComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_emisionComprobantesAnulados;

	public JDateChooser jDateChooserfecha_emisionComprobantesAnulados;
	public JButton jButtonfecha_emisionComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalizacionComprobantesAnulados;
	public JLabel jLabelfecha_finalizacionComprobantesAnulados;
	//public JFormattedTextField jDateChooserfecha_finalizacionComprobantesAnulados;

	public JDateChooser jDateChooserfecha_finalizacionComprobantesAnulados;
	public JButton jButtonfecha_finalizacionComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_usuarioComprobantesAnulados;
	public JLabel jLabelnombre_usuarioComprobantesAnulados;
	public JTextField jTextFieldnombre_usuarioComprobantesAnulados;
	public JButton jButtonnombre_usuarioComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPaneldetalleComprobantesAnulados;
	public JLabel jLabeldetalleComprobantesAnulados;
	public JTextArea jTextAreadetalleComprobantesAnulados;
	public JScrollPane jscrollPanedetalleComprobantesAnulados;
	public JButton jButtondetalleComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeComprobantesAnulados;
	public JLabel jLabelnumero_chequeComprobantesAnulados;
	public JTextField jTextFieldnumero_chequeComprobantesAnulados;
	public JButton jButtonnumero_chequeComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaComprobantesAnulados;
	public JLabel jLabelnombre_empresaComprobantesAnulados;
	public JTextArea jTextAreanombre_empresaComprobantesAnulados;
	public JScrollPane jscrollPanenombre_empresaComprobantesAnulados;
	public JButton jButtonnombre_empresaComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelruc_empresaComprobantesAnulados;
	public JLabel jLabelruc_empresaComprobantesAnulados;
	public JTextField jTextFieldruc_empresaComprobantesAnulados;
	public JButton jButtonruc_empresaComprobantesAnuladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComprobantesAnulados;
	public JLabel jLabelid_empresaComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComprobantesAnulados;
	public JButton jButtonid_empresaComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_empresaComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_empresaComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalComprobantesAnulados;
	public JLabel jLabelid_sucursalComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalComprobantesAnulados;
	public JButton jButtonid_sucursalComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_sucursalComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioComprobantesAnulados;
	public JLabel jLabelid_ejercicioComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioComprobantesAnulados;
	public JButton jButtonid_ejercicioComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_ejercicioComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloComprobantesAnulados;
	public JLabel jLabelid_moduloComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloComprobantesAnulados;
	public JButton jButtonid_moduloComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_moduloComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_moduloComprobantesAnuladosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoComprobantesAnulados;
	public JLabel jLabelid_tipo_movimientoComprobantesAnulados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoComprobantesAnulados;
	public JButton jButtonid_tipo_movimientoComprobantesAnulados= new JButtonMe();
	public JButton jButtonid_tipo_movimientoComprobantesAnuladosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoComprobantesAnuladosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComprobantesAnulados;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComprobantesAnuladosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComprobantesAnulados=new JPanel();
				this.jPanelAccionesFormularioComprobantesAnulados=new JPanel();
				this.jmenuBarDetalleComprobantesAnulados=new JMenuBar();
				this.jTtoolBarDetalleComprobantesAnulados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComprobantesAnuladosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobantesAnuladosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobantesAnulados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComprobantesAnulados() {
		return this.jButtonActualizarToolBarComprobantesAnulados;
	}
	
	public JButton getjButtonEliminarToolBarComprobantesAnulados() {
		return this.jButtonEliminarToolBarComprobantesAnulados;
	}
	
	public JButton getjButtonCancelarToolBarComprobantesAnulados() {
		return this.jButtonCancelarToolBarComprobantesAnulados;
	}		
	
	public JButton getjButtonProcesarInformacionComprobantesAnulados() {
		return this.jButtonProcesarInformacionComprobantesAnulados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobantesAnulados)	{
		this.jButtonProcesarInformacionComprobantesAnulados = jButtonProcesarInformacionComprobantesAnulados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobantesAnulados() {
		return this.jComboBoxTiposAccionesComprobantesAnulados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobantesAnulados(
			JComboBox jComboBoxTiposRelacionesComprobantesAnulados) {
		this.jComboBoxTiposRelacionesComprobantesAnulados = jComboBoxTiposRelacionesComprobantesAnulados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobantesAnulados(
			JComboBox jComboBoxTiposAccionesComprobantesAnulados) {
		this.jComboBoxTiposAccionesComprobantesAnulados = jComboBoxTiposAccionesComprobantesAnulados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComprobantesAnulados() {
		return this.jComboBoxTiposAccionesFormularioComprobantesAnulados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComprobantesAnulados(
			JComboBox jComboBoxTiposAccionesFormularioComprobantesAnulados) {
		this.jComboBoxTiposAccionesFormularioComprobantesAnulados = jComboBoxTiposAccionesFormularioComprobantesAnulados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
		
		this.comprobantesanuladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantesanuladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantesanuladosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobantesAnuladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobantesAnuladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobantes Anulados MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
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
	
		ComprobantesAnuladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComprobantesAnulados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComprobantesAnulados=new JButtonMe();
				this.jButtonModificarToolBarComprobantesAnulados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados,
							"actualizar","actualizar","Actualizar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados,
							"eliminar","eliminar","Eliminar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados,
							"cancelar","cancelar","Cancelar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComprobantesAnulados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados,
							"guardarcambios","guardarcambios","Guardar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComprobantesAnulados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComprobantesAnulados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComprobantesAnulados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComprobantesAnulados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComprobantesAnulados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobantesAnulados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobantesAnulados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobantesAnulados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComprobantesAnulados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComprobantesAnulados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComprobantesAnulados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComprobantesAnulados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComprobantesAnulados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComprobantesAnulados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComprobantesAnulados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComprobantesAnulados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComprobantesAnulados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComprobantesAnulados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComprobantesAnulados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComprobantesAnulados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComprobantesAnulados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobantesAnulados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobantesAnulados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobantesAnulados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobantesAnulados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobantesAnulados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComprobantesAnulados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComprobantesAnulados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComprobantesAnulados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobantesAnulados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobantesAnulados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobantesAnulados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobantesAnulados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobantesAnulados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobantesAnulados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComprobantesAnulados.add(this.jMenuItemDetalleCerrarComprobantesAnulados);
		
		this.jmenuDetalleAccionesComprobantesAnulados.add(this.jMenuItemActualizarComprobantesAnulados);
		this.jmenuDetalleAccionesComprobantesAnulados.add(this.jMenuItemEliminarComprobantesAnulados);
		this.jmenuDetalleAccionesComprobantesAnulados.add(this.jMenuItemCancelarComprobantesAnulados);		
		
		//this.jmenuDetalleDatosComprobantesAnulados.add(this.jMenuItemDetalleAbrirOrderByComprobantesAnulados);				
		this.jmenuDetalleDatosComprobantesAnulados.add(this.jMenuItemDetalleMostarOcultarComprobantesAnulados);				
				
		//this.jmenuDetalleAccionesComprobantesAnulados.add(this.jMenuItemGuardarCambiosComprobantesAnulados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComprobantesAnulados.add(this.jmenuDetalleArchivoComprobantesAnulados);		
		this.jmenuBarDetalleComprobantesAnulados.add(this.jmenuDetalleAccionesComprobantesAnulados);		
		this.jmenuBarDetalleComprobantesAnulados.add(this.jmenuDetalleDatosComprobantesAnulados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComprobantesAnulados);				
	}
	
	
	public void inicializarElementosCamposComprobantesAnulados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComprobantesAnulados = new JLabelMe();
		jLabelIdComprobantesAnulados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComprobantesAnulados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComprobantesAnulados= new GridBagLayout();

		this.jPanelidComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);

		jLabelidComprobantesAnulados = new JLabel();
		jLabelidComprobantesAnulados.setText("Id");

		jLabelidComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeComprobantesAnulados = new JLabelMe();
		this.jLabelfecha_desdeComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeComprobantesAnulados.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelfecha_desdeComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		//jFormattedTextFieldfecha_desdeComprobantesAnulados= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_desdeComprobantesAnulados.setEnabled(false);
		jDateChooserfecha_desdeComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_desdeComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setText("U");
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaComprobantesAnulados = new JLabelMe();
		this.jLabelfecha_hastaComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaComprobantesAnulados.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelfecha_hastaComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		//jFormattedTextFieldfecha_hastaComprobantesAnulados= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_hastaComprobantesAnulados.setEnabled(false);
		jDateChooserfecha_hastaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_hastaComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setText("U");
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoComprobantesAnulados = new JLabelMe();
		this.jLabeltipo_movimientoComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoComprobantesAnulados.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPaneltipo_movimientoComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextAreatipo_movimientoComprobantesAnulados= new JTextAreaMe();
		jTextAreatipo_movimientoComprobantesAnulados.setEnabled(false);
		jTextAreatipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComprobantesAnulados.setLineWrap(true);
		jTextAreatipo_movimientoComprobantesAnulados.setWrapStyleWord(true);
		jTextAreatipo_movimientoComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoComprobantesAnulados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoComprobantesAnulados = new JScrollPane(jTextAreatipo_movimientoComprobantesAnulados);
		jscrollPanetipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setText("U");
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelvalorComprobantesAnulados = new JLabelMe();
		this.jLabelvalorComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorComprobantesAnulados.setToolTipText("Valor");
		this.jLabelvalorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelvalorComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextFieldvalorComprobantesAnulados= new JTextFieldMe();
		jTextFieldvalorComprobantesAnulados.setEnabled(false);
		jTextFieldvalorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorComprobantesAnulados.setText("0.0");

		this.jButtonvalorComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonvalorComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorComprobantesAnuladosBusqueda.setText("U");
		this.jButtonvalorComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorComprobantesAnulados = new JLabelMe();
		this.jLabelnumero_mayorComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorComprobantesAnulados.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelnumero_mayorComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextAreanumero_mayorComprobantesAnulados= new JTextAreaMe();
		jTextAreanumero_mayorComprobantesAnulados.setEnabled(false);
		jTextAreanumero_mayorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorComprobantesAnulados.setLineWrap(true);
		jTextAreanumero_mayorComprobantesAnulados.setWrapStyleWord(true);
		jTextAreanumero_mayorComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorComprobantesAnulados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorComprobantesAnulados = new JScrollPane(jTextAreanumero_mayorComprobantesAnulados);
		jscrollPanenumero_mayorComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setText("U");
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioComprobantesAnulados = new JLabelMe();
		this.jLabelbeneficiarioComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioComprobantesAnulados.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelbeneficiarioComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextAreabeneficiarioComprobantesAnulados= new JTextAreaMe();
		jTextAreabeneficiarioComprobantesAnulados.setEnabled(false);
		jTextAreabeneficiarioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioComprobantesAnulados.setLineWrap(true);
		jTextAreabeneficiarioComprobantesAnulados.setWrapStyleWord(true);
		jTextAreabeneficiarioComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioComprobantesAnulados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioComprobantesAnulados = new JScrollPane(jTextAreabeneficiarioComprobantesAnulados);
		jscrollPanebeneficiarioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanebeneficiarioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonbeneficiarioComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setText("U");
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelfechaComprobantesAnulados = new JLabelMe();
		this.jLabelfechaComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaComprobantesAnulados.setToolTipText("Fecha");
		this.jLabelfechaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelfechaComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		//jFormattedTextFieldfechaComprobantesAnulados= new JFormattedTextFieldMe();

		jDateChooserfechaComprobantesAnulados= new JDateChooser();
		jDateChooserfechaComprobantesAnulados.setEnabled(false);
		jDateChooserfechaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaComprobantesAnulados.setDate(new Date());
		jDateChooserfechaComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonfechaComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaComprobantesAnuladosBusqueda.setText("U");
		this.jButtonfechaComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionComprobantesAnulados = new JLabelMe();
		this.jLabelfecha_emisionComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionComprobantesAnulados.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelfecha_emisionComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		//jFormattedTextFieldfecha_emisionComprobantesAnulados= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_emisionComprobantesAnulados.setEnabled(false);
		jDateChooserfecha_emisionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_emisionComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setText("U");
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalizacionComprobantesAnulados = new JLabelMe();
		this.jLabelfecha_finalizacionComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_FECHAFINALIZACION+" : *");
		this.jLabelfecha_finalizacionComprobantesAnulados.setToolTipText("Fecha Finalizacion");
		this.jLabelfecha_finalizacionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalizacionComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalizacionComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalizacionComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAFINALIZACION);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelfecha_finalizacionComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		//jFormattedTextFieldfecha_finalizacionComprobantesAnulados= new JFormattedTextFieldMe();

		jDateChooserfecha_finalizacionComprobantesAnulados= new JDateChooser();
		jDateChooserfecha_finalizacionComprobantesAnulados.setEnabled(false);
		jDateChooserfecha_finalizacionComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalizacionComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalizacionComprobantesAnulados.setDate(new Date());
		jDateChooserfecha_finalizacionComprobantesAnulados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalizacionComprobantesAnulados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setText("U");
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalizacionComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalizacionComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalizacionComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalizacionComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_usuarioComprobantesAnulados = new JLabelMe();
		this.jLabelnombre_usuarioComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREUSUARIO+" : *");
		this.jLabelnombre_usuarioComprobantesAnulados.setToolTipText("Nombre Usuario");
		this.jLabelnombre_usuarioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_usuarioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_usuarioComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_usuarioComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREUSUARIO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelnombre_usuarioComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextFieldnombre_usuarioComprobantesAnulados= new JTextFieldMe();

		jTextFieldnombre_usuarioComprobantesAnulados.setEnabled(false);
		jTextFieldnombre_usuarioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_usuarioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setText("U");
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_usuarioComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_usuarioComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_usuarioComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_usuarioComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_usuarioComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabeldetalleComprobantesAnulados = new JLabelMe();
		this.jLabeldetalleComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleComprobantesAnulados.setToolTipText("Detalle");
		this.jLabeldetalleComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPaneldetalleComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextAreadetalleComprobantesAnulados= new JTextAreaMe();
		jTextAreadetalleComprobantesAnulados.setEnabled(false);
		jTextAreadetalleComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleComprobantesAnulados.setLineWrap(true);
		jTextAreadetalleComprobantesAnulados.setWrapStyleWord(true);
		jTextAreadetalleComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleComprobantesAnulados.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleComprobantesAnulados = new JScrollPane(jTextAreadetalleComprobantesAnulados);
		jscrollPanedetalleComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtondetalleComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleComprobantesAnuladosBusqueda.setText("U");
		this.jButtondetalleComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeComprobantesAnulados = new JLabelMe();
		this.jLabelnumero_chequeComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeComprobantesAnulados.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelnumero_chequeComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextFieldnumero_chequeComprobantesAnulados= new JTextFieldMe();

		jTextFieldnumero_chequeComprobantesAnulados.setEnabled(false);
		jTextFieldnumero_chequeComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setText("U");
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_empresaComprobantesAnulados = new JLabelMe();
		this.jLabelnombre_empresaComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaComprobantesAnulados.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelnombre_empresaComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextAreanombre_empresaComprobantesAnulados= new JTextAreaMe();
		jTextAreanombre_empresaComprobantesAnulados.setEnabled(false);
		jTextAreanombre_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaComprobantesAnulados.setLineWrap(true);
		jTextAreanombre_empresaComprobantesAnulados.setWrapStyleWord(true);
		jTextAreanombre_empresaComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaComprobantesAnulados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaComprobantesAnulados = new JScrollPane(jTextAreanombre_empresaComprobantesAnulados);
		jscrollPanenombre_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empresaComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setText("U");
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaComprobantesAnuladosBusqueda.setVisible(false);		}


					
		this.jLabelruc_empresaComprobantesAnulados = new JLabelMe();
		this.jLabelruc_empresaComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_RUCEMPRESA+" : *");
		this.jLabelruc_empresaComprobantesAnulados.setToolTipText("Ruc Empresa");
		this.jLabelruc_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_empresaComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_empresaComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_RUCEMPRESA);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelruc_empresaComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jTextFieldruc_empresaComprobantesAnulados= new JTextFieldMe();

		jTextFieldruc_empresaComprobantesAnulados.setEnabled(false);
		jTextFieldruc_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_empresaComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_empresaComprobantesAnuladosBusqueda.setText("U");
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_empresaComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_empresaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_empresaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_empresaComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_empresaComprobantesAnuladosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComprobantesAnulados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComprobantesAnulados = new JLabelMe();
		this.jLabelid_empresaComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComprobantesAnulados.setToolTipText("Empresa");
		this.jLabelid_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelid_empresaComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jComboBoxid_empresaComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_empresaComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComprobantesAnulados.setEnabled(false);

		this.jButtonid_empresaComprobantesAnulados= new JButtonMe();
		this.jButtonid_empresaComprobantesAnulados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobantesAnulados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobantesAnulados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComprobantesAnulados.setText("Buscar");
		this.jButtonid_empresaComprobantesAnulados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComprobantesAnulados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobantesAnulados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobantesAnulados"));

		this.jButtonid_empresaComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobantesAnuladosBusqueda.setText("U");
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComprobantesAnuladosBusqueda.setVisible(false);		}

		this.jButtonid_empresaComprobantesAnuladosUpdate= new JButtonMe();
		this.jButtonid_empresaComprobantesAnuladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobantesAnuladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComprobantesAnuladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComprobantesAnuladosUpdate.setText("U");
		this.jButtonid_empresaComprobantesAnuladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComprobantesAnuladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComprobantesAnuladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComprobantesAnuladosUpdate"));



					
		this.jLabelid_sucursalComprobantesAnulados = new JLabelMe();
		this.jLabelid_sucursalComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalComprobantesAnulados.setToolTipText("Sucursal");
		this.jLabelid_sucursalComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelid_sucursalComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jComboBoxid_sucursalComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_sucursalComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalComprobantesAnulados.setEnabled(false);

		this.jButtonid_sucursalComprobantesAnulados= new JButtonMe();
		this.jButtonid_sucursalComprobantesAnulados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobantesAnulados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobantesAnulados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalComprobantesAnulados.setText("Buscar");
		this.jButtonid_sucursalComprobantesAnulados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalComprobantesAnulados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobantesAnulados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobantesAnulados"));

		this.jButtonid_sucursalComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobantesAnuladosBusqueda.setText("U");
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalComprobantesAnuladosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalComprobantesAnuladosUpdate= new JButtonMe();
		this.jButtonid_sucursalComprobantesAnuladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobantesAnuladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalComprobantesAnuladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalComprobantesAnuladosUpdate.setText("U");
		this.jButtonid_sucursalComprobantesAnuladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalComprobantesAnuladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalComprobantesAnuladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalComprobantesAnuladosUpdate"));



					
		this.jLabelid_ejercicioComprobantesAnulados = new JLabelMe();
		this.jLabelid_ejercicioComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioComprobantesAnulados.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelid_ejercicioComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jComboBoxid_ejercicioComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_ejercicioComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioComprobantesAnulados.setEnabled(false);

		this.jButtonid_ejercicioComprobantesAnulados= new JButtonMe();
		this.jButtonid_ejercicioComprobantesAnulados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComprobantesAnulados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComprobantesAnulados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComprobantesAnulados.setText("Buscar");
		this.jButtonid_ejercicioComprobantesAnulados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioComprobantesAnulados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComprobantesAnulados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComprobantesAnulados"));

		this.jButtonid_ejercicioComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setText("U");
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioComprobantesAnuladosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioComprobantesAnuladosUpdate= new JButtonMe();
		this.jButtonid_ejercicioComprobantesAnuladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComprobantesAnuladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComprobantesAnuladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComprobantesAnuladosUpdate.setText("U");
		this.jButtonid_ejercicioComprobantesAnuladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioComprobantesAnuladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComprobantesAnuladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComprobantesAnuladosUpdate"));



					
		this.jLabelid_moduloComprobantesAnulados = new JLabelMe();
		this.jLabelid_moduloComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloComprobantesAnulados.setToolTipText("Modulo");
		this.jLabelid_moduloComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelid_moduloComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jComboBoxid_moduloComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_moduloComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloComprobantesAnulados.setEnabled(false);

		this.jButtonid_moduloComprobantesAnulados= new JButtonMe();
		this.jButtonid_moduloComprobantesAnulados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloComprobantesAnulados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloComprobantesAnulados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloComprobantesAnulados.setText("Buscar");
		this.jButtonid_moduloComprobantesAnulados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloComprobantesAnulados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloComprobantesAnulados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloComprobantesAnulados"));

		this.jButtonid_moduloComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloComprobantesAnuladosBusqueda.setText("U");
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloComprobantesAnuladosBusqueda.setVisible(false);		}

		this.jButtonid_moduloComprobantesAnuladosUpdate= new JButtonMe();
		this.jButtonid_moduloComprobantesAnuladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloComprobantesAnuladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloComprobantesAnuladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloComprobantesAnuladosUpdate.setText("U");
		this.jButtonid_moduloComprobantesAnuladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloComprobantesAnuladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloComprobantesAnuladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloComprobantesAnuladosUpdate"));



					
		this.jLabelid_tipo_movimientoComprobantesAnulados = new JLabelMe();
		this.jLabelid_tipo_movimientoComprobantesAnulados.setText(""+ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoComprobantesAnulados.setToolTipText("Tipo Movimiento Base");
		this.jLabelid_tipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoComprobantesAnulados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoComprobantesAnulados.setToolTipText(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		this.jPanelid_tipo_movimientoComprobantesAnulados.setLayout(this.gridaBagLayoutComprobantesAnulados);


		jComboBoxid_tipo_movimientoComprobantesAnulados= new JComboBoxMe();
		jComboBoxid_tipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoComprobantesAnulados= new JButtonMe();
		this.jButtonid_tipo_movimientoComprobantesAnulados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoComprobantesAnulados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoComprobantesAnulados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoComprobantesAnulados.setText("Buscar");
		this.jButtonid_tipo_movimientoComprobantesAnulados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoComprobantesAnulados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoComprobantesAnulados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoComprobantesAnulados"));

		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setText("U");
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoComprobantesAnuladosBusqueda"));

		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setText("U");
		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoComprobantesAnuladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoComprobantesAnuladosUpdate"));



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
		//this.jInternalFrameDetalleComprobantesAnulados = new ComprobantesAnuladosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comprobantes Anulados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobantesAnulados= new GridBagLayout();
		

		
		String sToolTipComprobantesAnulados="";
		sToolTipComprobantesAnulados=ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobantesAnulados+="(Tesoreria.ComprobantesAnulados)";
		}
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobantesAnulados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComprobantesAnulados = new JButtonMe();
		this.jButtonModificarComprobantesAnulados = new JButtonMe();
        this.jButtonActualizarComprobantesAnulados = new JButtonMe();
        this.jButtonEliminarComprobantesAnulados = new JButtonMe();
        this.jButtonCancelarComprobantesAnulados = new JButtonMe();
        this.jButtonGuardarCambiosComprobantesAnulados = new JButtonMe();
		this.jButtonGuardarCambiosTablaComprobantesAnulados = new JButtonMe();
		this.jButtonCerrarComprobantesAnulados = new JButtonMe();
		
		this.jScrollPanelDatosComprobantesAnulados = new JScrollPane();   
        this.jScrollPanelDatosEdicionComprobantesAnulados = new JScrollPane();
		this.jScrollPanelDatosGeneralComprobantesAnulados = new JScrollPane();
				
		
		
		this.jPanelCamposComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobantes Anulados";
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobantes Anuladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobantesAnulados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComprobantesAnulados.setName("jPanelCamposComprobantesAnulados"); 

		this.jPanelCamposOcultosComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComprobantesAnulados.setName("jPanelCamposOcultosComprobantesAnulados"); 

        this.jPanelAccionesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobantesAnulados.setToolTipText("Acciones");
        this.jPanelAccionesComprobantesAnulados.setName("Acciones"); 

		this.jPanelAccionesFormularioComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComprobantesAnulados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComprobantesAnulados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComprobantesAnulados.setText("Nuevo");
		this.jButtonModificarComprobantesAnulados.setText("Editar");
        this.jButtonActualizarComprobantesAnulados.setText("Actualizar");
        this.jButtonEliminarComprobantesAnulados.setText("Eliminar");
        this.jButtonCancelarComprobantesAnulados.setText("Cancelar");
        this.jButtonGuardarCambiosComprobantesAnulados.setText("Guardar");
		this.jButtonGuardarCambiosTablaComprobantesAnulados.setText("Guardar");
		this.jButtonCerrarComprobantesAnulados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobantesAnulados,"nuevo_button","Nuevo",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComprobantesAnulados,"modificar_button","Editar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComprobantesAnulados,"actualizar_button","Actualizar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComprobantesAnulados,"eliminar_button","Eliminar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComprobantesAnulados,"cancelar_button","Cancelar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComprobantesAnulados,"guardarcambios_button","Guardar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobantesAnulados,"guardarcambiostabla_button","Guardar",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobantesAnulados,"cerrar_button","Salir",this.comprobantesanuladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComprobantesAnulados.setToolTipText("Nuevo"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComprobantesAnulados.setToolTipText("Editar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComprobantesAnulados.setToolTipText("Actualizar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComprobantesAnulados.setToolTipText("Eliminar)"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComprobantesAnulados.setToolTipText("Cancelar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComprobantesAnulados.setToolTipText("Guardar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComprobantesAnulados.setToolTipText("Guardar"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobantesAnulados.setToolTipText("Salir"+" "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobantesAnulados";
		inputMap = this.jButtonNuevoComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobantesAnulados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobantesAnulados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComprobantesAnulados";
		inputMap = this.jButtonActualizarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComprobantesAnulados"));
		
		//ELIMINAR
		sMapKey = "EliminarComprobantesAnulados";
		inputMap = this.jButtonEliminarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComprobantesAnulados"));
		
		//CANCELAR	
		sMapKey = "CancelarComprobantesAnulados";
		inputMap = this.jButtonCancelarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComprobantesAnulados"));
		
		//CERRAR		
		sMapKey = "CerrarComprobantesAnulados";
		inputMap = this.jButtonCerrarComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobantesAnulados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobantesAnulados";
		inputMap = this.jButtonGuardarCambiosTablaComprobantesAnulados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobantesAnulados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComprobantesAnulados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComprobantesAnulados.setToolTipText("Nuevo ComprobantesAnulados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComprobantesAnulados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComprobantesAnulados.setToolTipText("Sin Cerrar Ventana ComprobantesAnulados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComprobantesAnulados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComprobantesAnulados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComprobantesAnulados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobantesAnulados.setText("Accion");
		this.jComboBoxTiposAccionesComprobantesAnulados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComprobantesAnulados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComprobantesAnulados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComprobantesAnulados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComprobantesAnulados = new JLabelMe();
		
		this.jLabelAccionesComprobantesAnulados.setText("Acciones");		
		this.jLabelAccionesComprobantesAnulados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobantesAnulados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobantesAnulados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComprobantesAnulados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComprobantesAnulados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComprobantesAnulados=new JTabbedPane();
		this.jTabbedPaneRelacionesComprobantesAnulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComprobantesAnulados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComprobantesAnulados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobantesAnulados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobantesAnulados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComprobantesAnulados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobantesAnulados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComprobantesAnulados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComprobantesAnulados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComprobantesAnulados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComprobantesAnulados = new GridBagLayout();
		
		this.jPanelCamposComprobantesAnulados.setLayout(gridaBagLayoutCamposComprobantesAnulados);
		this.jPanelCamposOcultosComprobantesAnulados.setLayout(gridaBagLayoutCamposOcultosComprobantesAnulados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComprobantesAnulados.add(jLabelIdComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComprobantesAnulados.add(jLabelidComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComprobantesAnulados.add(jLabelid_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobantesAnulados.add(jButtonid_empresaComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 3;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComprobantesAnulados.add(jButtonid_empresaComprobantesAnuladosUpdate, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComprobantesAnulados.add(jComboBoxid_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalComprobantesAnulados.add(jLabelid_sucursalComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobantesAnulados.add(jButtonid_sucursalComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 3;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalComprobantesAnulados.add(jButtonid_sucursalComprobantesAnuladosUpdate, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalComprobantesAnulados.add(jComboBoxid_sucursalComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioComprobantesAnulados.add(jLabelid_ejercicioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComprobantesAnulados.add(jButtonid_ejercicioComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 3;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComprobantesAnulados.add(jButtonid_ejercicioComprobantesAnuladosUpdate, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioComprobantesAnulados.add(jComboBoxid_ejercicioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloComprobantesAnulados.add(jLabelid_moduloComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloComprobantesAnulados.add(jButtonid_moduloComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 3;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloComprobantesAnulados.add(jButtonid_moduloComprobantesAnuladosUpdate, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloComprobantesAnulados.add(jComboBoxid_moduloComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoComprobantesAnulados.add(jLabelid_tipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoComprobantesAnulados.add(jButtonid_tipo_movimientoComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 3;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoComprobantesAnulados.add(jButtonid_tipo_movimientoComprobantesAnuladosUpdate, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoComprobantesAnulados.add(jComboBoxid_tipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeComprobantesAnulados.add(jLabelfecha_desdeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeComprobantesAnulados.add(jButtonfecha_desdeComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeComprobantesAnulados.add(jDateChooserfecha_desdeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaComprobantesAnulados.add(jLabelfecha_hastaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaComprobantesAnulados.add(jButtonfecha_hastaComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaComprobantesAnulados.add(jDateChooserfecha_hastaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoComprobantesAnulados.add(jLabeltipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoComprobantesAnulados.add(jButtontipo_movimientoComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoComprobantesAnulados.add(jscrollPanetipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorComprobantesAnulados.add(jLabelvalorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorComprobantesAnulados.add(jButtonvalorComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorComprobantesAnulados.add(jTextFieldvalorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorComprobantesAnulados.add(jLabelnumero_mayorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorComprobantesAnulados.add(jButtonnumero_mayorComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorComprobantesAnulados.add(jscrollPanenumero_mayorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioComprobantesAnulados.add(jLabelbeneficiarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioComprobantesAnulados.add(jButtonbeneficiarioComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioComprobantesAnulados.add(jscrollPanebeneficiarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaComprobantesAnulados.add(jLabelfechaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaComprobantesAnulados.add(jButtonfechaComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaComprobantesAnulados.add(jDateChooserfechaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionComprobantesAnulados.add(jLabelfecha_emisionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionComprobantesAnulados.add(jButtonfecha_emisionComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionComprobantesAnulados.add(jDateChooserfecha_emisionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalizacionComprobantesAnulados.add(jLabelfecha_finalizacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalizacionComprobantesAnulados.add(jButtonfecha_finalizacionComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalizacionComprobantesAnulados.add(jDateChooserfecha_finalizacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_usuarioComprobantesAnulados.add(jLabelnombre_usuarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_usuarioComprobantesAnulados.add(jButtonnombre_usuarioComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_usuarioComprobantesAnulados.add(jTextFieldnombre_usuarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleComprobantesAnulados.add(jLabeldetalleComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleComprobantesAnulados.add(jButtondetalleComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleComprobantesAnulados.add(jscrollPanedetalleComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeComprobantesAnulados.add(jLabelnumero_chequeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeComprobantesAnulados.add(jButtonnumero_chequeComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeComprobantesAnulados.add(jTextFieldnumero_chequeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaComprobantesAnulados.add(jLabelnombre_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaComprobantesAnulados.add(jButtonnombre_empresaComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaComprobantesAnulados.add(jscrollPanenombre_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_empresaComprobantesAnulados.add(jLabelruc_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		//this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = 2;
		this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
		this.gridBagConstraintsComprobantesAnulados.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_empresaComprobantesAnulados.add(jButtonruc_empresaComprobantesAnuladosBusqueda, this.gridBagConstraintsComprobantesAnulados);
	}

	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComprobantesAnulados.gridy = 0;
	this.gridBagConstraintsComprobantesAnulados.gridx = 1;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_empresaComprobantesAnulados.add(jTextFieldruc_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelidComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelid_tipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelfecha_desdeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelfecha_hastaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPaneltipo_movimientoComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelvalorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelnumero_mayorComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelbeneficiarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelfechaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelfecha_emisionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelfecha_finalizacionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelnombre_usuarioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPaneldetalleComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelnumero_chequeComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelnombre_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComprobantesAnulados.add(this.jPanelruc_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposComprobantesAnulados % 2==0) {
		iXPanelCamposComprobantesAnulados=0;
		iYPanelCamposComprobantesAnulados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposOcultosComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposOcultosComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobantesAnulados.add(this.jPanelid_empresaComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposOcultosComprobantesAnulados % 2==0) {
		iXPanelCamposOcultosComprobantesAnulados=0;
		iYPanelCamposOcultosComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposOcultosComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposOcultosComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobantesAnulados.add(this.jPanelid_sucursalComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposOcultosComprobantesAnulados % 2==0) {
		iXPanelCamposOcultosComprobantesAnulados=0;
		iYPanelCamposOcultosComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposOcultosComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposOcultosComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobantesAnulados.add(this.jPanelid_ejercicioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposOcultosComprobantesAnulados % 2==0) {
		iXPanelCamposOcultosComprobantesAnulados=0;
		iYPanelCamposOcultosComprobantesAnulados++;
	}
	this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComprobantesAnulados.gridy = iYPanelCamposOcultosComprobantesAnulados;
	this.gridBagConstraintsComprobantesAnulados.gridx = iXPanelCamposOcultosComprobantesAnulados++;
	this.gridBagConstraintsComprobantesAnulados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComprobantesAnulados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComprobantesAnulados.add(this.jPanelid_moduloComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);



	if(iXPanelCamposOcultosComprobantesAnulados % 2==0) {
		iXPanelCamposOcultosComprobantesAnulados=0;
		iYPanelCamposOcultosComprobantesAnulados++;
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
			
		GridBagLayout gridaBagLayoutAccionesComprobantesAnulados= new GridBagLayout();
		this.jPanelAccionesComprobantesAnulados.setLayout(gridaBagLayoutAccionesComprobantesAnulados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComprobantesAnulados= new GridBagLayout();
		this.jPanelAccionesFormularioComprobantesAnulados.setLayout(gridaBagLayoutAccionesFormularioComprobantesAnulados);
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComprobantesAnulados.add(this.jComboBoxTiposAccionesFormularioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccion++;
			
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonModificarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);							

		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;
		this.gridBagConstraintsComprobantesAnulados.gridx =iPosXAccion++;
			
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonEliminarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonActualizarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);


		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;		
		this.gridBagConstraintsComprobantesAnulados.gridx = iPosXAccion++;
		
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonGuardarCambiosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);	
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = 0;		
		this.gridBagConstraintsComprobantesAnulados.gridx =iPosXAccion++;
		
		this.jPanelAccionesComprobantesAnulados.add(this.jButtonCancelarComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobantesAnulados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobantesAnulados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();						
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;		
			//this.gridBagConstraintsComprobantesAnulados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobantesAnulados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobantesAnulados.gridx =0;
		this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobantesAnulados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComprobantesAnulados = new ComprobantesAnuladosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comprobantes Anulados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comprobantes Anulados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobantes Anulados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComprobantesAnuladosModel comprobantesanuladosModel=new ComprobantesAnuladosModel(this);
			
			//SI USARA CLASE INTERNA
			//ComprobantesAnuladosModel.ComprobantesAnuladosFocusTraversalPolicy comprobantesanuladosFocusTraversalPolicy = comprobantesanuladosModel.new ComprobantesAnuladosFocusTraversalPolicy(this);
			
			//comprobantesanuladosFocusTraversalPolicy.setcomprobantesanuladosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comprobantesanuladosModel);
			
			
			this.jContentPaneDetalleComprobantesAnulados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComprobantesAnulados = new GridBagLayout();	
			this.jContentPaneDetalleComprobantesAnulados.setLayout(gridaBagLayoutDetalleComprobantesAnulados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobantesAnulados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
				this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComprobantesAnulados.gridx = 0;
					
				
				this.jContentPaneDetalleComprobantesAnulados.add(jTtoolBarDetalleComprobantesAnulados, gridBagConstraintsComprobantesAnulados);								
				
}
			
			this.jScrollPanelDatosEdicionComprobantesAnulados=   new JScrollPane(jContentPaneDetalleComprobantesAnulados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobantesAnulados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobantesAnulados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobantesAnulados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComprobantesAnulados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobantesAnulados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobantesAnulados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobantesAnulados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	        
			this.jContentPaneDetalleComprobantesAnulados.add(jPanelCamposComprobantesAnulados, gridBagConstraintsComprobantesAnulados);
			
			
			
			
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
						//&& comprobantesanuladosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComprobantesAnulados= new GridBagConstraints();
						this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComprobantesAnulados.gridx = 0;
						this.jContentPaneDetalleComprobantesAnulados.add(this.jTabbedPaneRelacionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComprobantesAnulados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComprobantesAnulados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
					this.gridBagConstraintsComprobantesAnulados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComprobantesAnulados.gridx = 0;
					
				
					this.jContentPaneDetalleComprobantesAnulados.add(jPanelCamposOcultosComprobantesAnulados, gridBagConstraintsComprobantesAnulados);
				
					this.jPanelCamposOcultosComprobantesAnulados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	        this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComprobantesAnulados.add(this.jPanelAccionesFormularioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);							
			
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
	        this.gridBagConstraintsComprobantesAnulados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComprobantesAnulados.gridx = 0;
	        
			
			this.jContentPaneDetalleComprobantesAnulados.add(this.jPanelAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComprobantesAnulados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComprobantesAnulados=   new JScrollPane(this.jPanelCamposComprobantesAnulados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComprobantesAnulados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobantesAnulados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComprobantesAnulados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;
			this.gridBagConstraintsComprobantesAnulados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComprobantesAnulados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComprobantesAnulados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);			
			
			this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
			this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComprobantesAnulados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
			
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		
			
		this.gridBagConstraintsComprobantesAnulados = new GridBagConstraints();
		this.gridBagConstraintsComprobantesAnulados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobantesAnulados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobantesAnulados, this.gridBagConstraintsComprobantesAnulados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComprobantesAnulados;//jContentPane;
		
		return jScrollPanelDatosEdicionComprobantesAnulados;
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
