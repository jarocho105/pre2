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
import com.bydan.erp.tesoreria.util.report.ListadosDocumentosConstantesFunciones;

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
public class ListadosDocumentosDetalleFormJInternalFrame extends ListadosDocumentosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadosDocumentos;
	
	protected JMenuBar jmenuBarDetalleListadosDocumentos;
	
	protected JMenu jmenuDetalleListadosDocumentos;
	protected JMenu jmenuDetalleArchivoListadosDocumentos;
	protected JMenu jmenuDetalleAccionesListadosDocumentos;
	protected JMenu jmenuDetalleDatosListadosDocumentos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosDocumentos;	
	protected GridBagConstraints gridBagConstraintsListadosDocumentos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadosDocumentosBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadosDocumentos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ListadosDocumentosSessionBean listadosdocumentosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public ListadosDocumentosLogic listadosdocumentosLogic;
	
	public JScrollPane jScrollPanelDatosListadosDocumentos;
	public JScrollPane jScrollPanelDatosEdicionListadosDocumentos;
	public JScrollPane jScrollPanelDatosGeneralListadosDocumentos;
	
	protected JPanel jPanelCamposListadosDocumentos;    
	protected JPanel jPanelCamposOcultosListadosDocumentos;    	
	protected JPanel jPanelAccionesListadosDocumentos;
	protected JPanel jPanelAccionesFormularioListadosDocumentos;
    
	
	
	protected Integer iXPanelCamposListadosDocumentos=0;
	protected Integer iYPanelCamposListadosDocumentos=0;
	
	protected Integer iXPanelCamposOcultosListadosDocumentos=0;
	protected Integer iYPanelCamposOcultosListadosDocumentos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadosDocumentos;
	public JButton jButtonModificarListadosDocumentos;
	public JButton jButtonActualizarListadosDocumentos;
    public JButton jButtonEliminarListadosDocumentos;
	public JButton jButtonCancelarListadosDocumentos;
    public JButton jButtonGuardarCambiosListadosDocumentos;
	public JButton jButtonGuardarCambiosTablaListadosDocumentos;
	protected JButton jButtonCerrarListadosDocumentos;
	
	
	protected JButton jButtonProcesarInformacionListadosDocumentos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadosDocumentos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadosDocumentos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadosDocumentos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosDocumentos;
	protected JButton jButtonModificarToolBarListadosDocumentos;
	protected JButton jButtonActualizarToolBarListadosDocumentos;
    protected JButton jButtonEliminarToolBarListadosDocumentos;
	protected JButton jButtonCancelarToolBarListadosDocumentos;
    protected JButton jButtonGuardarCambiosToolBarListadosDocumentos;
	protected JButton jButtonGuardarCambiosTablaToolBarListadosDocumentos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosDocumentos;
	protected JButton jButtonCerrarToolBarListadosDocumentos;
	
	protected JButton jButtonProcesarInformacionToolBarListadosDocumentos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosDocumentos;
	protected JMenuItem jMenuItemModificarListadosDocumentos;
	protected JMenuItem jMenuItemActualizarListadosDocumentos;
    protected JMenuItem jMenuItemEliminarListadosDocumentos;
	protected JMenuItem jMenuItemCancelarListadosDocumentos;
    protected JMenuItem jMenuItemGuardarCambiosListadosDocumentos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosDocumentos;
	protected JMenuItem jMenuItemCerrarListadosDocumentos;
	protected JMenuItem jMenuItemDetalleCerrarListadosDocumentos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosDocumentos;
	
	protected JMenuItem jMenuItemProcesarInformacionListadosDocumentos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosDocumentos;
	protected JMenuItem jMenuItemMostrarOcultarListadosDocumentos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosDocumentos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosDocumentos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosDocumentos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadosDocumentos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadosDocumentos;
	public JLabel jLabelIdListadosDocumentos;
	public JLabel jLabelidListadosDocumentos;
	public JButton jButtonidListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeListadosDocumentos;
	public JLabel jLabelfecha_desdeListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_desdeListadosDocumentos;

	public JDateChooser jDateChooserfecha_desdeListadosDocumentos;
	public JButton jButtonfecha_desdeListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaListadosDocumentos;
	public JLabel jLabelfecha_hastaListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_hastaListadosDocumentos;

	public JDateChooser jDateChooserfecha_hastaListadosDocumentos;
	public JButton jButtonfecha_hastaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelfechaListadosDocumentos;
	public JLabel jLabelfechaListadosDocumentos;
	//public JFormattedTextField jDateChooserfechaListadosDocumentos;

	public JDateChooser jDateChooserfechaListadosDocumentos;
	public JButton jButtonfechaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoListadosDocumentos;
	public JLabel jLabeltipo_movimientoListadosDocumentos;
	public JTextArea jTextAreatipo_movimientoListadosDocumentos;
	public JScrollPane jscrollPanetipo_movimientoListadosDocumentos;
	public JButton jButtontipo_movimientoListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadosDocumentos;
	public JLabel jLabelcodigoListadosDocumentos;
	public JTextField jTextFieldcodigoListadosDocumentos;
	public JButton jButtoncodigoListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioListadosDocumentos;
	public JLabel jLabelbeneficiarioListadosDocumentos;
	public JTextArea jTextAreabeneficiarioListadosDocumentos;
	public JScrollPane jscrollPanebeneficiarioListadosDocumentos;
	public JButton jButtonbeneficiarioListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiario_chequeListadosDocumentos;
	public JLabel jLabelbeneficiario_chequeListadosDocumentos;
	public JTextArea jTextAreabeneficiario_chequeListadosDocumentos;
	public JScrollPane jscrollPanebeneficiario_chequeListadosDocumentos;
	public JButton jButtonbeneficiario_chequeListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPaneldetalleListadosDocumentos;
	public JLabel jLabeldetalleListadosDocumentos;
	public JTextArea jTextAreadetalleListadosDocumentos;
	public JScrollPane jscrollPanedetalleListadosDocumentos;
	public JButton jButtondetalleListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_chequeListadosDocumentos;
	public JLabel jLabelvalor_chequeListadosDocumentos;
	public JTextField jTextFieldvalor_chequeListadosDocumentos;
	public JButton jButtonvalor_chequeListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaListadosDocumentos;
	public JLabel jLabelnombre_empresaListadosDocumentos;
	public JTextArea jTextAreanombre_empresaListadosDocumentos;
	public JScrollPane jscrollPanenombre_empresaListadosDocumentos;
	public JButton jButtonnombre_empresaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelruc_empresaListadosDocumentos;
	public JLabel jLabelruc_empresaListadosDocumentos;
	public JTextField jTextFieldruc_empresaListadosDocumentos;
	public JButton jButtonruc_empresaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_empresaListadosDocumentos;
	public JLabel jLabeldireccion_empresaListadosDocumentos;
	public JTextArea jTextAreadireccion_empresaListadosDocumentos;
	public JScrollPane jscrollPanedireccion_empresaListadosDocumentos;
	public JButton jButtondireccion_empresaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalListadosDocumentos;
	public JLabel jLabelnombre_sucursalListadosDocumentos;
	public JTextArea jTextAreanombre_sucursalListadosDocumentos;
	public JScrollPane jscrollPanenombre_sucursalListadosDocumentos;
	public JButton jButtonnombre_sucursalListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelvalorListadosDocumentos;
	public JLabel jLabelvalorListadosDocumentos;
	public JTextField jTextFieldvalorListadosDocumentos;
	public JButton jButtonvalorListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorListadosDocumentos;
	public JLabel jLabelnumero_mayorListadosDocumentos;
	public JTextArea jTextAreanumero_mayorListadosDocumentos;
	public JScrollPane jscrollPanenumero_mayorListadosDocumentos;
	public JButton jButtonnumero_mayorListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionListadosDocumentos;
	public JLabel jLabelfecha_emisionListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_emisionListadosDocumentos;

	public JDateChooser jDateChooserfecha_emisionListadosDocumentos;
	public JButton jButtonfecha_emisionListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalizacionListadosDocumentos;
	public JLabel jLabelfecha_finalizacionListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_finalizacionListadosDocumentos;

	public JDateChooser jDateChooserfecha_finalizacionListadosDocumentos;
	public JButton jButtonfecha_finalizacionListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_usuarioListadosDocumentos;
	public JLabel jLabelnombre_usuarioListadosDocumentos;
	public JTextField jTextFieldnombre_usuarioListadosDocumentos;
	public JButton jButtonnombre_usuarioListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeListadosDocumentos;
	public JLabel jLabelnumero_chequeListadosDocumentos;
	public JTextField jTextFieldnumero_chequeListadosDocumentos;
	public JButton jButtonnumero_chequeListadosDocumentosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadosDocumentos;
	public JLabel jLabelid_empresaListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadosDocumentos;
	public JButton jButtonid_empresaListadosDocumentos= new JButtonMe();
	public JButton jButtonid_empresaListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalListadosDocumentos;
	public JLabel jLabelid_sucursalListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalListadosDocumentos;
	public JButton jButtonid_sucursalListadosDocumentos= new JButtonMe();
	public JButton jButtonid_sucursalListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioListadosDocumentos;
	public JLabel jLabelid_ejercicioListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioListadosDocumentos;
	public JButton jButtonid_ejercicioListadosDocumentos= new JButtonMe();
	public JButton jButtonid_ejercicioListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioListadosDocumentosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoListadosDocumentos;
	public JLabel jLabelid_tipo_movimientoListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoListadosDocumentos;
	public JButton jButtonid_tipo_movimientoListadosDocumentos= new JButtonMe();
	public JButton jButtonid_tipo_movimientoListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoListadosDocumentosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadosDocumentos;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadosDocumentosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadosDocumentos=new JPanel();
				this.jPanelAccionesFormularioListadosDocumentos=new JPanel();
				this.jmenuBarDetalleListadosDocumentos=new JMenuBar();
				this.jTtoolBarDetalleListadosDocumentos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadosDocumentosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadosDocumentos() {
		return this.jButtonActualizarToolBarListadosDocumentos;
	}
	
	public JButton getjButtonEliminarToolBarListadosDocumentos() {
		return this.jButtonEliminarToolBarListadosDocumentos;
	}
	
	public JButton getjButtonCancelarToolBarListadosDocumentos() {
		return this.jButtonCancelarToolBarListadosDocumentos;
	}		
	
	public JButton getjButtonProcesarInformacionListadosDocumentos() {
		return this.jButtonProcesarInformacionListadosDocumentos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosDocumentos)	{
		this.jButtonProcesarInformacionListadosDocumentos = jButtonProcesarInformacionListadosDocumentos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosDocumentos() {
		return this.jComboBoxTiposAccionesListadosDocumentos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosDocumentos(
			JComboBox jComboBoxTiposRelacionesListadosDocumentos) {
		this.jComboBoxTiposRelacionesListadosDocumentos = jComboBoxTiposRelacionesListadosDocumentos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosDocumentos(
			JComboBox jComboBoxTiposAccionesListadosDocumentos) {
		this.jComboBoxTiposAccionesListadosDocumentos = jComboBoxTiposAccionesListadosDocumentos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadosDocumentos() {
		return this.jComboBoxTiposAccionesFormularioListadosDocumentos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadosDocumentos(
			JComboBox jComboBoxTiposAccionesFormularioListadosDocumentos) {
		this.jComboBoxTiposAccionesFormularioListadosDocumentos = jComboBoxTiposAccionesFormularioListadosDocumentos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
		
		this.listadosdocumentosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosdocumentosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosdocumentosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosDocumentosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Documentos MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadosDocumentosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadosDocumentos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadosDocumentos=new JButtonMe();
				this.jButtonModificarToolBarListadosDocumentos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos,
							"actualizar","actualizar","Actualizar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos,
							"eliminar","eliminar","Eliminar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos,
							"cancelar","cancelar","Cancelar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadosDocumentos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadosDocumentos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadosDocumentos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadosDocumentos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadosDocumentos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosDocumentos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosDocumentos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosDocumentos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadosDocumentos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadosDocumentos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadosDocumentos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadosDocumentos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadosDocumentos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadosDocumentos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadosDocumentos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadosDocumentos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadosDocumentos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadosDocumentos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadosDocumentos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadosDocumentos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadosDocumentos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosDocumentos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosDocumentos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosDocumentos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosDocumentos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosDocumentos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadosDocumentos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadosDocumentos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadosDocumentos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosDocumentos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosDocumentos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosDocumentos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosDocumentos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosDocumentos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosDocumentos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadosDocumentos.add(this.jMenuItemDetalleCerrarListadosDocumentos);
		
		this.jmenuDetalleAccionesListadosDocumentos.add(this.jMenuItemActualizarListadosDocumentos);
		this.jmenuDetalleAccionesListadosDocumentos.add(this.jMenuItemEliminarListadosDocumentos);
		this.jmenuDetalleAccionesListadosDocumentos.add(this.jMenuItemCancelarListadosDocumentos);		
		
		//this.jmenuDetalleDatosListadosDocumentos.add(this.jMenuItemDetalleAbrirOrderByListadosDocumentos);				
		this.jmenuDetalleDatosListadosDocumentos.add(this.jMenuItemDetalleMostarOcultarListadosDocumentos);				
				
		//this.jmenuDetalleAccionesListadosDocumentos.add(this.jMenuItemGuardarCambiosListadosDocumentos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadosDocumentos.add(this.jmenuDetalleArchivoListadosDocumentos);		
		this.jmenuBarDetalleListadosDocumentos.add(this.jmenuDetalleAccionesListadosDocumentos);		
		this.jmenuBarDetalleListadosDocumentos.add(this.jmenuDetalleDatosListadosDocumentos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadosDocumentos);				
	}
	
	
	public void inicializarElementosCamposListadosDocumentos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadosDocumentos = new JLabelMe();
		jLabelIdListadosDocumentos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadosDocumentos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadosDocumentos= new GridBagLayout();

		this.jPanelidListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);

		jLabelidListadosDocumentos = new JLabel();
		jLabelidListadosDocumentos.setText("Id");

		jLabelidListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeListadosDocumentos = new JLabelMe();
		this.jLabelfecha_desdeListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeListadosDocumentos.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelfecha_desdeListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		//jFormattedTextFieldfecha_desdeListadosDocumentos= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeListadosDocumentos= new JDateChooser();
		jDateChooserfecha_desdeListadosDocumentos.setEnabled(false);
		jDateChooserfecha_desdeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeListadosDocumentos.setDate(new Date());
		jDateChooserfecha_desdeListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeListadosDocumentosBusqueda.setText("U");
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaListadosDocumentos = new JLabelMe();
		this.jLabelfecha_hastaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaListadosDocumentos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelfecha_hastaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		//jFormattedTextFieldfecha_hastaListadosDocumentos= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaListadosDocumentos= new JDateChooser();
		jDateChooserfecha_hastaListadosDocumentos.setEnabled(false);
		jDateChooserfecha_hastaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaListadosDocumentos.setDate(new Date());
		jDateChooserfecha_hastaListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaListadosDocumentosBusqueda.setText("U");
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelfechaListadosDocumentos = new JLabelMe();
		this.jLabelfechaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaListadosDocumentos.setToolTipText("Fecha");
		this.jLabelfechaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelfechaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		//jFormattedTextFieldfechaListadosDocumentos= new JFormattedTextFieldMe();

		jDateChooserfechaListadosDocumentos= new JDateChooser();
		jDateChooserfechaListadosDocumentos.setEnabled(false);
		jDateChooserfechaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaListadosDocumentos.setDate(new Date());
		jDateChooserfechaListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonfechaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaListadosDocumentosBusqueda.setText("U");
		this.jButtonfechaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoListadosDocumentos = new JLabelMe();
		this.jLabeltipo_movimientoListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoListadosDocumentos.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPaneltipo_movimientoListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreatipo_movimientoListadosDocumentos= new JTextAreaMe();
		jTextAreatipo_movimientoListadosDocumentos.setEnabled(false);
		jTextAreatipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoListadosDocumentos.setLineWrap(true);
		jTextAreatipo_movimientoListadosDocumentos.setWrapStyleWord(true);
		jTextAreatipo_movimientoListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoListadosDocumentos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoListadosDocumentos = new JScrollPane(jTextAreatipo_movimientoListadosDocumentos);
		jscrollPanetipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontipo_movimientoListadosDocumentosBusqueda= new JButtonMe();
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoListadosDocumentosBusqueda.setText("U");
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoListadosDocumentos = new JLabelMe();
		this.jLabelcodigoListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadosDocumentos.setToolTipText("Codigo");
		this.jLabelcodigoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelcodigoListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldcodigoListadosDocumentos= new JTextFieldMe();

		jTextFieldcodigoListadosDocumentos.setEnabled(false);
		jTextFieldcodigoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadosDocumentosBusqueda= new JButtonMe();
		this.jButtoncodigoListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadosDocumentosBusqueda.setText("U");
		this.jButtoncodigoListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioListadosDocumentos = new JLabelMe();
		this.jLabelbeneficiarioListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioListadosDocumentos.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelbeneficiarioListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreabeneficiarioListadosDocumentos= new JTextAreaMe();
		jTextAreabeneficiarioListadosDocumentos.setEnabled(false);
		jTextAreabeneficiarioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioListadosDocumentos.setLineWrap(true);
		jTextAreabeneficiarioListadosDocumentos.setWrapStyleWord(true);
		jTextAreabeneficiarioListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioListadosDocumentos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioListadosDocumentos = new JScrollPane(jTextAreabeneficiarioListadosDocumentos);
		jscrollPanebeneficiarioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiarioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiarioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtonbeneficiarioListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioListadosDocumentosBusqueda.setText("U");
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiario_chequeListadosDocumentos = new JLabelMe();
		this.jLabelbeneficiario_chequeListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE+" : *");
		this.jLabelbeneficiario_chequeListadosDocumentos.setToolTipText("Beneficiario Cheque");
		this.jLabelbeneficiario_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbeneficiario_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbeneficiario_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiario_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiario_chequeListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiario_chequeListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelbeneficiario_chequeListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreabeneficiario_chequeListadosDocumentos= new JTextAreaMe();
		jTextAreabeneficiario_chequeListadosDocumentos.setEnabled(false);
		jTextAreabeneficiario_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiario_chequeListadosDocumentos.setLineWrap(true);
		jTextAreabeneficiario_chequeListadosDocumentos.setWrapStyleWord(true);
		jTextAreabeneficiario_chequeListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiario_chequeListadosDocumentos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiario_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiario_chequeListadosDocumentos = new JScrollPane(jTextAreabeneficiario_chequeListadosDocumentos);
		jscrollPanebeneficiario_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiario_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiario_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setText("U");
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiario_chequeListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiario_chequeListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiario_chequeListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiario_chequeListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiario_chequeListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabeldetalleListadosDocumentos = new JLabelMe();
		this.jLabeldetalleListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleListadosDocumentos.setToolTipText("Detalle");
		this.jLabeldetalleListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPaneldetalleListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreadetalleListadosDocumentos= new JTextAreaMe();
		jTextAreadetalleListadosDocumentos.setEnabled(false);
		jTextAreadetalleListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleListadosDocumentos.setLineWrap(true);
		jTextAreadetalleListadosDocumentos.setWrapStyleWord(true);
		jTextAreadetalleListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleListadosDocumentos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleListadosDocumentos = new JScrollPane(jTextAreadetalleListadosDocumentos);
		jscrollPanedetalleListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedetalleListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedetalleListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondetalleListadosDocumentosBusqueda= new JButtonMe();
		this.jButtondetalleListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleListadosDocumentosBusqueda.setText("U");
		this.jButtondetalleListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_chequeListadosDocumentos = new JLabelMe();
		this.jLabelvalor_chequeListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE+" : *");
		this.jLabelvalor_chequeListadosDocumentos.setToolTipText("Valor Cheque");
		this.jLabelvalor_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_chequeListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_chequeListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelvalor_chequeListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldvalor_chequeListadosDocumentos= new JTextFieldMe();
		jTextFieldvalor_chequeListadosDocumentos.setEnabled(false);
		jTextFieldvalor_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_chequeListadosDocumentos.setText("0.0");

		this.jButtonvalor_chequeListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_chequeListadosDocumentosBusqueda.setText("U");
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_chequeListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_chequeListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_chequeListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_chequeListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_chequeListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_empresaListadosDocumentos = new JLabelMe();
		this.jLabelnombre_empresaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaListadosDocumentos.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelnombre_empresaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreanombre_empresaListadosDocumentos= new JTextAreaMe();
		jTextAreanombre_empresaListadosDocumentos.setEnabled(false);
		jTextAreanombre_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaListadosDocumentos.setLineWrap(true);
		jTextAreanombre_empresaListadosDocumentos.setWrapStyleWord(true);
		jTextAreanombre_empresaListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaListadosDocumentos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaListadosDocumentos = new JScrollPane(jTextAreanombre_empresaListadosDocumentos);
		jscrollPanenombre_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_empresaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaListadosDocumentosBusqueda.setText("U");
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelruc_empresaListadosDocumentos = new JLabelMe();
		this.jLabelruc_empresaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA+" : *");
		this.jLabelruc_empresaListadosDocumentos.setToolTipText("Ruc Empresa");
		this.jLabelruc_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_empresaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_empresaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelruc_empresaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldruc_empresaListadosDocumentos= new JTextFieldMe();

		jTextFieldruc_empresaListadosDocumentos.setEnabled(false);
		jTextFieldruc_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_empresaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonruc_empresaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_empresaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_empresaListadosDocumentosBusqueda.setText("U");
		this.jButtonruc_empresaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_empresaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_empresaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_empresaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_empresaListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_empresaListadosDocumentos = new JLabelMe();
		this.jLabeldireccion_empresaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA+" : *");
		this.jLabeldireccion_empresaListadosDocumentos.setToolTipText("Direccion Empresa");
		this.jLabeldireccion_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_empresaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_empresaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPaneldireccion_empresaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreadireccion_empresaListadosDocumentos= new JTextAreaMe();
		jTextAreadireccion_empresaListadosDocumentos.setEnabled(false);
		jTextAreadireccion_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_empresaListadosDocumentos.setLineWrap(true);
		jTextAreadireccion_empresaListadosDocumentos.setWrapStyleWord(true);
		jTextAreadireccion_empresaListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_empresaListadosDocumentos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_empresaListadosDocumentos = new JScrollPane(jTextAreadireccion_empresaListadosDocumentos);
		jscrollPanedireccion_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedireccion_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedireccion_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondireccion_empresaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_empresaListadosDocumentosBusqueda.setText("U");
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_empresaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_empresaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_empresaListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalListadosDocumentos = new JLabelMe();
		this.jLabelnombre_sucursalListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalListadosDocumentos.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelnombre_sucursalListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreanombre_sucursalListadosDocumentos= new JTextAreaMe();
		jTextAreanombre_sucursalListadosDocumentos.setEnabled(false);
		jTextAreanombre_sucursalListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalListadosDocumentos.setLineWrap(true);
		jTextAreanombre_sucursalListadosDocumentos.setWrapStyleWord(true);
		jTextAreanombre_sucursalListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalListadosDocumentos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalListadosDocumentos = new JScrollPane(jTextAreanombre_sucursalListadosDocumentos);
		jscrollPanenombre_sucursalListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_sucursalListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_sucursalListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalListadosDocumentosBusqueda.setText("U");
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelvalorListadosDocumentos = new JLabelMe();
		this.jLabelvalorListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorListadosDocumentos.setToolTipText("Valor");
		this.jLabelvalorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelvalorListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldvalorListadosDocumentos= new JTextFieldMe();
		jTextFieldvalorListadosDocumentos.setEnabled(false);
		jTextFieldvalorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorListadosDocumentos.setText("0.0");

		this.jButtonvalorListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonvalorListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorListadosDocumentosBusqueda.setText("U");
		this.jButtonvalorListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorListadosDocumentos = new JLabelMe();
		this.jLabelnumero_mayorListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorListadosDocumentos.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelnumero_mayorListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextAreanumero_mayorListadosDocumentos= new JTextAreaMe();
		jTextAreanumero_mayorListadosDocumentos.setEnabled(false);
		jTextAreanumero_mayorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorListadosDocumentos.setLineWrap(true);
		jTextAreanumero_mayorListadosDocumentos.setWrapStyleWord(true);
		jTextAreanumero_mayorListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorListadosDocumentos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorListadosDocumentos = new JScrollPane(jTextAreanumero_mayorListadosDocumentos);
		jscrollPanenumero_mayorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnumero_mayorListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorListadosDocumentosBusqueda.setText("U");
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionListadosDocumentos = new JLabelMe();
		this.jLabelfecha_emisionListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionListadosDocumentos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelfecha_emisionListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		//jFormattedTextFieldfecha_emisionListadosDocumentos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionListadosDocumentos= new JDateChooser();
		jDateChooserfecha_emisionListadosDocumentos.setEnabled(false);
		jDateChooserfecha_emisionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionListadosDocumentos.setDate(new Date());
		jDateChooserfecha_emisionListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionListadosDocumentosBusqueda.setText("U");
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalizacionListadosDocumentos = new JLabelMe();
		this.jLabelfecha_finalizacionListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION+" : *");
		this.jLabelfecha_finalizacionListadosDocumentos.setToolTipText("Fecha Finalizacion");
		this.jLabelfecha_finalizacionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalizacionListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalizacionListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalizacionListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelfecha_finalizacionListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		//jFormattedTextFieldfecha_finalizacionListadosDocumentos= new JFormattedTextFieldMe();

		jDateChooserfecha_finalizacionListadosDocumentos= new JDateChooser();
		jDateChooserfecha_finalizacionListadosDocumentos.setEnabled(false);
		jDateChooserfecha_finalizacionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalizacionListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalizacionListadosDocumentos.setDate(new Date());
		jDateChooserfecha_finalizacionListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalizacionListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalizacionListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setText("U");
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalizacionListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalizacionListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalizacionListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalizacionListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalizacionListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_usuarioListadosDocumentos = new JLabelMe();
		this.jLabelnombre_usuarioListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO+" : *");
		this.jLabelnombre_usuarioListadosDocumentos.setToolTipText("Nombre Usuario");
		this.jLabelnombre_usuarioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_usuarioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_usuarioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_usuarioListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_usuarioListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelnombre_usuarioListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldnombre_usuarioListadosDocumentos= new JTextFieldMe();

		jTextFieldnombre_usuarioListadosDocumentos.setEnabled(false);
		jTextFieldnombre_usuarioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_usuarioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_usuarioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_usuarioListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_usuarioListadosDocumentosBusqueda.setText("U");
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_usuarioListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_usuarioListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_usuarioListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_usuarioListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_usuarioListadosDocumentosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeListadosDocumentos = new JLabelMe();
		this.jLabelnumero_chequeListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeListadosDocumentos.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelnumero_chequeListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jTextFieldnumero_chequeListadosDocumentos= new JTextFieldMe();

		jTextFieldnumero_chequeListadosDocumentos.setEnabled(false);
		jTextFieldnumero_chequeListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeListadosDocumentosBusqueda.setText("U");
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeListadosDocumentosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadosDocumentos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadosDocumentos = new JLabelMe();
		this.jLabelid_empresaListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadosDocumentos.setToolTipText("Empresa");
		this.jLabelid_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelid_empresaListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jComboBoxid_empresaListadosDocumentos= new JComboBoxMe();
		jComboBoxid_empresaListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadosDocumentos.setEnabled(false);

		this.jButtonid_empresaListadosDocumentos= new JButtonMe();
		this.jButtonid_empresaListadosDocumentos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosDocumentos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosDocumentos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosDocumentos.setText("Buscar");
		this.jButtonid_empresaListadosDocumentos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadosDocumentos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosDocumentos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosDocumentos"));

		this.jButtonid_empresaListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonid_empresaListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosDocumentosBusqueda.setText("U");
		this.jButtonid_empresaListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadosDocumentosBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadosDocumentosUpdate= new JButtonMe();
		this.jButtonid_empresaListadosDocumentosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosDocumentosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosDocumentosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosDocumentosUpdate.setText("U");
		this.jButtonid_empresaListadosDocumentosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadosDocumentosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosDocumentosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosDocumentosUpdate"));



					
		this.jLabelid_sucursalListadosDocumentos = new JLabelMe();
		this.jLabelid_sucursalListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalListadosDocumentos.setToolTipText("Sucursal");
		this.jLabelid_sucursalListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelid_sucursalListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jComboBoxid_sucursalListadosDocumentos= new JComboBoxMe();
		jComboBoxid_sucursalListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalListadosDocumentos.setEnabled(false);

		this.jButtonid_sucursalListadosDocumentos= new JButtonMe();
		this.jButtonid_sucursalListadosDocumentos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosDocumentos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosDocumentos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalListadosDocumentos.setText("Buscar");
		this.jButtonid_sucursalListadosDocumentos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalListadosDocumentos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosDocumentos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosDocumentos"));

		this.jButtonid_sucursalListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonid_sucursalListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalListadosDocumentosBusqueda.setText("U");
		this.jButtonid_sucursalListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalListadosDocumentosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalListadosDocumentosUpdate= new JButtonMe();
		this.jButtonid_sucursalListadosDocumentosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosDocumentosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalListadosDocumentosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalListadosDocumentosUpdate.setText("U");
		this.jButtonid_sucursalListadosDocumentosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalListadosDocumentosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalListadosDocumentosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalListadosDocumentosUpdate"));



					
		this.jLabelid_ejercicioListadosDocumentos = new JLabelMe();
		this.jLabelid_ejercicioListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioListadosDocumentos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelid_ejercicioListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jComboBoxid_ejercicioListadosDocumentos= new JComboBoxMe();
		jComboBoxid_ejercicioListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioListadosDocumentos.setEnabled(false);

		this.jButtonid_ejercicioListadosDocumentos= new JButtonMe();
		this.jButtonid_ejercicioListadosDocumentos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioListadosDocumentos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioListadosDocumentos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioListadosDocumentos.setText("Buscar");
		this.jButtonid_ejercicioListadosDocumentos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioListadosDocumentos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioListadosDocumentos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioListadosDocumentos"));

		this.jButtonid_ejercicioListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioListadosDocumentosBusqueda.setText("U");
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioListadosDocumentosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioListadosDocumentosUpdate= new JButtonMe();
		this.jButtonid_ejercicioListadosDocumentosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioListadosDocumentosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioListadosDocumentosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioListadosDocumentosUpdate.setText("U");
		this.jButtonid_ejercicioListadosDocumentosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioListadosDocumentosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioListadosDocumentosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioListadosDocumentosUpdate"));



					
		this.jLabelid_tipo_movimientoListadosDocumentos = new JLabelMe();
		this.jLabelid_tipo_movimientoListadosDocumentos.setText(""+ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoListadosDocumentos.setToolTipText("Tipo Movimiento Base");
		this.jLabelid_tipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoListadosDocumentos.setToolTipText(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutListadosDocumentos = new GridBagLayout();
		this.jPanelid_tipo_movimientoListadosDocumentos.setLayout(this.gridaBagLayoutListadosDocumentos);


		jComboBoxid_tipo_movimientoListadosDocumentos= new JComboBoxMe();
		jComboBoxid_tipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoListadosDocumentos= new JButtonMe();
		this.jButtonid_tipo_movimientoListadosDocumentos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoListadosDocumentos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoListadosDocumentos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoListadosDocumentos.setText("Buscar");
		this.jButtonid_tipo_movimientoListadosDocumentos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoListadosDocumentos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoListadosDocumentos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoListadosDocumentos"));

		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setText("U");
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoListadosDocumentosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoListadosDocumentosBusqueda"));

		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoListadosDocumentosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoListadosDocumentosUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setText("U");
		this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoListadosDocumentosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoListadosDocumentosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoListadosDocumentosUpdate"));



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
		//this.jInternalFrameDetalleListadosDocumentos = new ListadosDocumentosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listados Documentos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosDocumentos= new GridBagLayout();
		

		
		String sToolTipListadosDocumentos="";
		sToolTipListadosDocumentos=ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosDocumentos+="(Tesoreria.ListadosDocumentos)";
		}
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosDocumentos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadosDocumentos = new JButtonMe();
		this.jButtonModificarListadosDocumentos = new JButtonMe();
        this.jButtonActualizarListadosDocumentos = new JButtonMe();
        this.jButtonEliminarListadosDocumentos = new JButtonMe();
        this.jButtonCancelarListadosDocumentos = new JButtonMe();
        this.jButtonGuardarCambiosListadosDocumentos = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadosDocumentos = new JButtonMe();
		this.jButtonCerrarListadosDocumentos = new JButtonMe();
		
		this.jScrollPanelDatosListadosDocumentos = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadosDocumentos = new JScrollPane();
		this.jScrollPanelDatosGeneralListadosDocumentos = new JScrollPane();
				
		
		
		this.jPanelCamposListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Documentos";
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadosDocumentos.setName("jPanelCamposListadosDocumentos"); 

		this.jPanelCamposOcultosListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadosDocumentos.setName("jPanelCamposOcultosListadosDocumentos"); 

        this.jPanelAccionesListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosDocumentos.setToolTipText("Acciones");
        this.jPanelAccionesListadosDocumentos.setName("Acciones"); 

		this.jPanelAccionesFormularioListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadosDocumentos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadosDocumentos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadosDocumentos.setText("Nuevo");
		this.jButtonModificarListadosDocumentos.setText("Editar");
        this.jButtonActualizarListadosDocumentos.setText("Actualizar");
        this.jButtonEliminarListadosDocumentos.setText("Eliminar");
        this.jButtonCancelarListadosDocumentos.setText("Cancelar");
        this.jButtonGuardarCambiosListadosDocumentos.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadosDocumentos.setText("Guardar");
		this.jButtonCerrarListadosDocumentos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosDocumentos,"nuevo_button","Nuevo",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadosDocumentos,"modificar_button","Editar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadosDocumentos,"actualizar_button","Actualizar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadosDocumentos,"eliminar_button","Eliminar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadosDocumentos,"cancelar_button","Cancelar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadosDocumentos,"guardarcambios_button","Guardar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosDocumentos,"guardarcambiostabla_button","Guardar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosDocumentos,"cerrar_button","Salir",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadosDocumentos.setToolTipText("Nuevo"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadosDocumentos.setToolTipText("Editar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadosDocumentos.setToolTipText("Actualizar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadosDocumentos.setToolTipText("Eliminar)"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadosDocumentos.setToolTipText("Cancelar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadosDocumentos.setToolTipText("Guardar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadosDocumentos.setToolTipText("Guardar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosDocumentos.setToolTipText("Salir"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosDocumentos";
		inputMap = this.jButtonNuevoListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosDocumentos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosDocumentos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadosDocumentos";
		inputMap = this.jButtonActualizarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadosDocumentos"));
		
		//ELIMINAR
		sMapKey = "EliminarListadosDocumentos";
		inputMap = this.jButtonEliminarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadosDocumentos"));
		
		//CANCELAR	
		sMapKey = "CancelarListadosDocumentos";
		inputMap = this.jButtonCancelarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadosDocumentos"));
		
		//CERRAR		
		sMapKey = "CerrarListadosDocumentos";
		inputMap = this.jButtonCerrarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosDocumentos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosDocumentos";
		inputMap = this.jButtonGuardarCambiosTablaListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosDocumentos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadosDocumentos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadosDocumentos.setToolTipText("Nuevo ListadosDocumentos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadosDocumentos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadosDocumentos.setToolTipText("Sin Cerrar Ventana ListadosDocumentos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadosDocumentos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadosDocumentos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosDocumentos.setText("Accion");
		this.jComboBoxTiposAccionesListadosDocumentos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadosDocumentos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadosDocumentos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadosDocumentos = new JLabelMe();
		
		this.jLabelAccionesListadosDocumentos.setText("Acciones");		
		this.jLabelAccionesListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadosDocumentos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadosDocumentos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadosDocumentos=new JTabbedPane();
		this.jTabbedPaneRelacionesListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadosDocumentos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadosDocumentos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosDocumentos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosDocumentos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadosDocumentos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosDocumentos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosDocumentos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadosDocumentos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadosDocumentos = new GridBagLayout();
		
		this.jPanelCamposListadosDocumentos.setLayout(gridaBagLayoutCamposListadosDocumentos);
		this.jPanelCamposOcultosListadosDocumentos.setLayout(gridaBagLayoutCamposOcultosListadosDocumentos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadosDocumentos.add(jLabelIdListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadosDocumentos.add(jLabelidListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadosDocumentos.add(jLabelid_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosDocumentos.add(jButtonid_empresaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 3;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosDocumentos.add(jButtonid_empresaListadosDocumentosUpdate, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadosDocumentos.add(jComboBoxid_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalListadosDocumentos.add(jLabelid_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalListadosDocumentos.add(jButtonid_sucursalListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 3;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalListadosDocumentos.add(jButtonid_sucursalListadosDocumentosUpdate, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalListadosDocumentos.add(jComboBoxid_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioListadosDocumentos.add(jLabelid_ejercicioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioListadosDocumentos.add(jButtonid_ejercicioListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 3;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioListadosDocumentos.add(jButtonid_ejercicioListadosDocumentosUpdate, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioListadosDocumentos.add(jComboBoxid_ejercicioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoListadosDocumentos.add(jLabelid_tipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoListadosDocumentos.add(jButtonid_tipo_movimientoListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 3;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoListadosDocumentos.add(jButtonid_tipo_movimientoListadosDocumentosUpdate, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoListadosDocumentos.add(jComboBoxid_tipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeListadosDocumentos.add(jLabelfecha_desdeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeListadosDocumentos.add(jButtonfecha_desdeListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeListadosDocumentos.add(jDateChooserfecha_desdeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaListadosDocumentos.add(jLabelfecha_hastaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaListadosDocumentos.add(jButtonfecha_hastaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaListadosDocumentos.add(jDateChooserfecha_hastaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaListadosDocumentos.add(jLabelfechaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaListadosDocumentos.add(jButtonfechaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaListadosDocumentos.add(jDateChooserfechaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoListadosDocumentos.add(jLabeltipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoListadosDocumentos.add(jButtontipo_movimientoListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoListadosDocumentos.add(jscrollPanetipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadosDocumentos.add(jLabelcodigoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadosDocumentos.add(jButtoncodigoListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadosDocumentos.add(jTextFieldcodigoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioListadosDocumentos.add(jLabelbeneficiarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioListadosDocumentos.add(jButtonbeneficiarioListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioListadosDocumentos.add(jscrollPanebeneficiarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiario_chequeListadosDocumentos.add(jLabelbeneficiario_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiario_chequeListadosDocumentos.add(jButtonbeneficiario_chequeListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiario_chequeListadosDocumentos.add(jscrollPanebeneficiario_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleListadosDocumentos.add(jLabeldetalleListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleListadosDocumentos.add(jButtondetalleListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleListadosDocumentos.add(jscrollPanedetalleListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_chequeListadosDocumentos.add(jLabelvalor_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_chequeListadosDocumentos.add(jButtonvalor_chequeListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_chequeListadosDocumentos.add(jTextFieldvalor_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaListadosDocumentos.add(jLabelnombre_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaListadosDocumentos.add(jButtonnombre_empresaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaListadosDocumentos.add(jscrollPanenombre_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_empresaListadosDocumentos.add(jLabelruc_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_empresaListadosDocumentos.add(jButtonruc_empresaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_empresaListadosDocumentos.add(jTextFieldruc_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_empresaListadosDocumentos.add(jLabeldireccion_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_empresaListadosDocumentos.add(jButtondireccion_empresaListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_empresaListadosDocumentos.add(jscrollPanedireccion_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalListadosDocumentos.add(jLabelnombre_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalListadosDocumentos.add(jButtonnombre_sucursalListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalListadosDocumentos.add(jscrollPanenombre_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorListadosDocumentos.add(jLabelvalorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorListadosDocumentos.add(jButtonvalorListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorListadosDocumentos.add(jTextFieldvalorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorListadosDocumentos.add(jLabelnumero_mayorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorListadosDocumentos.add(jButtonnumero_mayorListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorListadosDocumentos.add(jscrollPanenumero_mayorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionListadosDocumentos.add(jLabelfecha_emisionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionListadosDocumentos.add(jButtonfecha_emisionListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionListadosDocumentos.add(jDateChooserfecha_emisionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalizacionListadosDocumentos.add(jLabelfecha_finalizacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalizacionListadosDocumentos.add(jButtonfecha_finalizacionListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalizacionListadosDocumentos.add(jDateChooserfecha_finalizacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_usuarioListadosDocumentos.add(jLabelnombre_usuarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_usuarioListadosDocumentos.add(jButtonnombre_usuarioListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_usuarioListadosDocumentos.add(jTextFieldnombre_usuarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 0;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeListadosDocumentos.add(jLabelnumero_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 2;
		this.gridBagConstraintsListadosDocumentos.ipadx = 0;
		this.gridBagConstraintsListadosDocumentos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeListadosDocumentos.add(jButtonnumero_chequeListadosDocumentosBusqueda, this.gridBagConstraintsListadosDocumentos);
	}

	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosDocumentos.gridy = 0;
	this.gridBagConstraintsListadosDocumentos.gridx = 1;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeListadosDocumentos.add(jTextFieldnumero_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelidListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelid_tipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelfecha_desdeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelfecha_hastaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelfechaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPaneltipo_movimientoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelcodigoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelbeneficiarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelbeneficiario_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPaneldetalleListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelvalor_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelnombre_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelruc_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPaneldireccion_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelnombre_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelvalorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelnumero_mayorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelfecha_emisionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelfecha_finalizacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelnombre_usuarioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosDocumentos.add(this.jPanelnumero_chequeListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposListadosDocumentos % 3==0) {
		iXPanelCamposListadosDocumentos=0;
		iYPanelCamposListadosDocumentos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposOcultosListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposOcultosListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosDocumentos.add(this.jPanelid_empresaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposOcultosListadosDocumentos % 3==0) {
		iXPanelCamposOcultosListadosDocumentos=0;
		iYPanelCamposOcultosListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposOcultosListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposOcultosListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosDocumentos.add(this.jPanelid_sucursalListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposOcultosListadosDocumentos % 3==0) {
		iXPanelCamposOcultosListadosDocumentos=0;
		iYPanelCamposOcultosListadosDocumentos++;
	}
	this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosDocumentos.gridy = iYPanelCamposOcultosListadosDocumentos;
	this.gridBagConstraintsListadosDocumentos.gridx = iXPanelCamposOcultosListadosDocumentos++;
	this.gridBagConstraintsListadosDocumentos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosDocumentos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosDocumentos.add(this.jPanelid_ejercicioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);



	if(iXPanelCamposOcultosListadosDocumentos % 3==0) {
		iXPanelCamposOcultosListadosDocumentos=0;
		iYPanelCamposOcultosListadosDocumentos++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadosDocumentos= new GridBagLayout();
		this.jPanelAccionesListadosDocumentos.setLayout(gridaBagLayoutAccionesListadosDocumentos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadosDocumentos= new GridBagLayout();
		this.jPanelAccionesFormularioListadosDocumentos.setLayout(gridaBagLayoutAccionesFormularioListadosDocumentos);
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadosDocumentos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadosDocumentos.add(this.jComboBoxTiposAccionesFormularioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadosDocumentos.add(this.jButtonModificarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);							

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadosDocumentos.add(this.jButtonEliminarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = 0;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosDocumentos.add(this.jButtonActualizarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = 0;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosDocumentos.add(this.jButtonGuardarCambiosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);	
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = 0;		
		this.gridBagConstraintsListadosDocumentos.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadosDocumentos.add(this.jButtonCancelarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosDocumentos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosDocumentos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();						
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosDocumentos.gridx = 0;		
			//this.gridBagConstraintsListadosDocumentos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosDocumentos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosDocumentos.gridx =0;
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosDocumentos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadosDocumentos = new ListadosDocumentosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listados Documentos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listados Documentos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Documentos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadosDocumentosModel listadosdocumentosModel=new ListadosDocumentosModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadosDocumentosModel.ListadosDocumentosFocusTraversalPolicy listadosdocumentosFocusTraversalPolicy = listadosdocumentosModel.new ListadosDocumentosFocusTraversalPolicy(this);
			
			//listadosdocumentosFocusTraversalPolicy.setlistadosdocumentosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadosdocumentosModel);
			
			
			this.jContentPaneDetalleListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadosDocumentos = new GridBagLayout();	
			this.jContentPaneDetalleListadosDocumentos.setLayout(gridaBagLayoutDetalleListadosDocumentos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosDocumentos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
				this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadosDocumentos.gridx = 0;
					
				
				this.jContentPaneDetalleListadosDocumentos.add(jTtoolBarDetalleListadosDocumentos, gridBagConstraintsListadosDocumentos);								
				
}
			
			this.jScrollPanelDatosEdicionListadosDocumentos=   new JScrollPane(jContentPaneDetalleListadosDocumentos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosDocumentos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosDocumentos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosDocumentos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadosDocumentos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosDocumentos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosDocumentos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosDocumentos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadosDocumentos.gridx = 0;
	        
			this.jContentPaneDetalleListadosDocumentos.add(jPanelCamposListadosDocumentos, gridBagConstraintsListadosDocumentos);
			
			
			
			
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
						//&& listadosdocumentosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadosDocumentos= new GridBagConstraints();
						this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadosDocumentos.gridx = 0;
						this.jContentPaneDetalleListadosDocumentos.add(this.jTabbedPaneRelacionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadosDocumentos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadosDocumentos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
					this.gridBagConstraintsListadosDocumentos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadosDocumentos.gridx = 0;
					
				
					this.jContentPaneDetalleListadosDocumentos.add(jPanelCamposOcultosListadosDocumentos, gridBagConstraintsListadosDocumentos);
				
					this.jPanelCamposOcultosListadosDocumentos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadosDocumentos.gridx = 0;
	        this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadosDocumentos.add(this.jPanelAccionesFormularioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);							
			
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
	        this.gridBagConstraintsListadosDocumentos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadosDocumentos.gridx = 0;
	        
			
			this.jContentPaneDetalleListadosDocumentos.add(this.jPanelAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadosDocumentos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadosDocumentos=   new JScrollPane(this.jPanelCamposListadosDocumentos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosDocumentos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosDocumentos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosDocumentos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadosDocumentos.gridx = 0;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadosDocumentos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosDocumentos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosDocumentos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadosDocumentos;//jContentPane;
		
		return jScrollPanelDatosEdicionListadosDocumentos;
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
