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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PlaneacionCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class PlaneacionCompraDetalleFormJInternalFrame extends PlaneacionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePlaneacionCompra;
	
	protected JMenuBar jmenuBarDetallePlaneacionCompra;
	
	protected JMenu jmenuDetallePlaneacionCompra;
	protected JMenu jmenuDetalleArchivoPlaneacionCompra;
	protected JMenu jmenuDetalleAccionesPlaneacionCompra;
	protected JMenu jmenuDetalleDatosPlaneacionCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaneacionCompra;	
	protected GridBagConstraints gridBagConstraintsPlaneacionCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PlaneacionCompraBeanSwingJInternalFrameAdditional jInternalFrameDetallePlaneacionCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicio="";

	protected MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfin="";
	
	public PlaneacionCompraSessionBean planeacioncompraSessionBean;
	
	

	public DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame=null;
	public DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePlaneacionCompra=false;
	public DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public MesSessionBean mesinicioSessionBean;
	public MesSessionBean mesfinSessionBean;	
	
	public PlaneacionCompraLogic planeacioncompraLogic;
	
	public JScrollPane jScrollPanelDatosPlaneacionCompra;
	public JScrollPane jScrollPanelDatosEdicionPlaneacionCompra;
	public JScrollPane jScrollPanelDatosGeneralPlaneacionCompra;
	
	protected JPanel jPanelCamposPlaneacionCompra;    
	protected JPanel jPanelCamposOcultosPlaneacionCompra;    	
	protected JPanel jPanelAccionesPlaneacionCompra;
	protected JPanel jPanelAccionesFormularioPlaneacionCompra;
    
	
	
	protected Integer iXPanelCamposPlaneacionCompra=0;
	protected Integer iYPanelCamposPlaneacionCompra=0;
	
	protected Integer iXPanelCamposOcultosPlaneacionCompra=0;
	protected Integer iYPanelCamposOcultosPlaneacionCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPlaneacionCompra;
	public JButton jButtonModificarPlaneacionCompra;
	public JButton jButtonActualizarPlaneacionCompra;
    public JButton jButtonEliminarPlaneacionCompra;
	public JButton jButtonCancelarPlaneacionCompra;
    public JButton jButtonGuardarCambiosPlaneacionCompra;
	public JButton jButtonGuardarCambiosTablaPlaneacionCompra;
	protected JButton jButtonCerrarPlaneacionCompra;
	
	
	protected JButton jButtonProcesarInformacionPlaneacionCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPlaneacionCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPlaneacionCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajePlaneacionCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaneacionCompra;
	protected JButton jButtonModificarToolBarPlaneacionCompra;
	protected JButton jButtonActualizarToolBarPlaneacionCompra;
    protected JButton jButtonEliminarToolBarPlaneacionCompra;
	protected JButton jButtonCancelarToolBarPlaneacionCompra;
    protected JButton jButtonGuardarCambiosToolBarPlaneacionCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarPlaneacionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaneacionCompra;
	protected JButton jButtonCerrarToolBarPlaneacionCompra;
	
	protected JButton jButtonProcesarInformacionToolBarPlaneacionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaneacionCompra;
	protected JMenuItem jMenuItemModificarPlaneacionCompra;
	protected JMenuItem jMenuItemActualizarPlaneacionCompra;
    protected JMenuItem jMenuItemEliminarPlaneacionCompra;
	protected JMenuItem jMenuItemCancelarPlaneacionCompra;
    protected JMenuItem jMenuItemGuardarCambiosPlaneacionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaneacionCompra;
	protected JMenuItem jMenuItemCerrarPlaneacionCompra;
	protected JMenuItem jMenuItemDetalleCerrarPlaneacionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaneacionCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionPlaneacionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaneacionCompra;
	protected JMenuItem jMenuItemMostrarOcultarPlaneacionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaneacionCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaneacionCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPlaneacionCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPlaneacionCompra;
	public JLabel jLabelIdPlaneacionCompra;
	public JLabel jLabelidPlaneacionCompra;
	public JButton jButtonidPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoPlaneacionCompra;
	public JLabel jLabelnumero_pre_impresoPlaneacionCompra;
	public JTextField jTextFieldnumero_pre_impresoPlaneacionCompra;
	public JButton jButtonnumero_pre_impresoPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaPlaneacionCompra;
	public JLabel jLabelfechaPlaneacionCompra;
	//public JFormattedTextField jDateChooserfechaPlaneacionCompra;

	public JDateChooser jDateChooserfechaPlaneacionCompra;
	public JButton jButtonfechaPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mesesPlaneacionCompra;
	public JLabel jLabelnumero_mesesPlaneacionCompra;
	public JTextField jTextFieldnumero_mesesPlaneacionCompra;
	public JButton jButtonnumero_mesesPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_cortePlaneacionCompra;
	public JLabel jLabelfecha_cortePlaneacionCompra;
	//public JFormattedTextField jDateChooserfecha_cortePlaneacionCompra;

	public JDateChooser jDateChooserfecha_cortePlaneacionCompra;
	public JButton jButtonfecha_cortePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_pedidoPlaneacionCompra;
	public JLabel jLabelcodigo_pedidoPlaneacionCompra;
	public JTextField jTextFieldcodigo_pedidoPlaneacionCompra;
	public JButton jButtoncodigo_pedidoPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion1PlaneacionCompra;
	public JLabel jLabeldescripcion1PlaneacionCompra;
	public JTextArea jTextAreadescripcion1PlaneacionCompra;
	public JScrollPane jscrollPanedescripcion1PlaneacionCompra;
	public JButton jButtondescripcion1PlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion2PlaneacionCompra;
	public JLabel jLabeldescripcion2PlaneacionCompra;
	public JTextArea jTextAreadescripcion2PlaneacionCompra;
	public JScrollPane jscrollPanedescripcion2PlaneacionCompra;
	public JButton jButtondescripcion2PlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion3PlaneacionCompra;
	public JLabel jLabeldescripcion3PlaneacionCompra;
	public JTextArea jTextAreadescripcion3PlaneacionCompra;
	public JScrollPane jscrollPanedescripcion3PlaneacionCompra;
	public JButton jButtondescripcion3PlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPlaneacionCompra;
	public JLabel jLabelid_empresaPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPlaneacionCompra;
	public JButton jButtonid_empresaPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_empresaPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPlaneacionCompra;
	public JLabel jLabelid_sucursalPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPlaneacionCompra;
	public JButton jButtonid_sucursalPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_sucursalPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPlaneacionCompra;
	public JLabel jLabelid_ejercicioPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPlaneacionCompra;
	public JButton jButtonid_ejercicioPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_ejercicioPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPlaneacionCompra;
	public JLabel jLabelid_periodoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPlaneacionCompra;
	public JButton jButtonid_periodoPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_periodoPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPlaneacionCompra;
	public JLabel jLabelid_empleadoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPlaneacionCompra;
	public JButton jButtonid_empleadoPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_empleadoPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPlaneacionCompra;
	public JLabel jLabelid_usuarioPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPlaneacionCompra;
	public JButton jButtonid_usuarioPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_usuarioPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPlaneacionCompra;
	public JLabel jLabelid_formatoPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPlaneacionCompra;
	public JButton jButtonid_formatoPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_formatoPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_inicioPlaneacionCompra;
	public JLabel jLabelid_mes_inicioPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicioPlaneacionCompra;
	public JButton jButtonid_mes_inicioPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_mes_inicioPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicioPlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_finPlaneacionCompra;
	public JLabel jLabelid_mes_finPlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finPlaneacionCompra;
	public JButton jButtonid_mes_finPlaneacionCompra= new JButtonMe();
	public JButton jButtonid_mes_finPlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mes_finPlaneacionCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPlaneacionCompra;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PlaneacionCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPlaneacionCompra=new JPanel();
				this.jPanelAccionesFormularioPlaneacionCompra=new JPanel();
				this.jmenuBarDetallePlaneacionCompra=new JMenuBar();
				this.jTtoolBarDetallePlaneacionCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PlaneacionCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPlaneacionCompra() {
		return this.jButtonActualizarToolBarPlaneacionCompra;
	}
	
	public JButton getjButtonEliminarToolBarPlaneacionCompra() {
		return this.jButtonEliminarToolBarPlaneacionCompra;
	}
	
	public JButton getjButtonCancelarToolBarPlaneacionCompra() {
		return this.jButtonCancelarToolBarPlaneacionCompra;
	}		
	
	public JButton getjButtonProcesarInformacionPlaneacionCompra() {
		return this.jButtonProcesarInformacionPlaneacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaneacionCompra)	{
		this.jButtonProcesarInformacionPlaneacionCompra = jButtonProcesarInformacionPlaneacionCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaneacionCompra() {
		return this.jComboBoxTiposAccionesPlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaneacionCompra(
			JComboBox jComboBoxTiposRelacionesPlaneacionCompra) {
		this.jComboBoxTiposRelacionesPlaneacionCompra = jComboBoxTiposRelacionesPlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaneacionCompra(
			JComboBox jComboBoxTiposAccionesPlaneacionCompra) {
		this.jComboBoxTiposAccionesPlaneacionCompra = jComboBoxTiposAccionesPlaneacionCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPlaneacionCompra() {
		return this.jComboBoxTiposAccionesFormularioPlaneacionCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPlaneacionCompra(
			JComboBox jComboBoxTiposAccionesFormularioPlaneacionCompra) {
		this.jComboBoxTiposAccionesFormularioPlaneacionCompra = jComboBoxTiposAccionesFormularioPlaneacionCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		
		this.planeacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planeacioncompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaneacionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeacion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
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
	
		PlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlaneacionCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPlaneacionCompra=new JButtonMe();
				this.jButtonModificarToolBarPlaneacionCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"actualizar","actualizar","Actualizar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"eliminar","eliminar","Eliminar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"cancelar","cancelar","Cancelar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePlaneacionCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePlaneacionCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPlaneacionCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPlaneacionCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPlaneacionCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaneacionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaneacionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaneacionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPlaneacionCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPlaneacionCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPlaneacionCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPlaneacionCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPlaneacionCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPlaneacionCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPlaneacionCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPlaneacionCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPlaneacionCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPlaneacionCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPlaneacionCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPlaneacionCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPlaneacionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaneacionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaneacionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPlaneacionCompra.add(this.jMenuItemDetalleCerrarPlaneacionCompra);
		
		this.jmenuDetalleAccionesPlaneacionCompra.add(this.jMenuItemActualizarPlaneacionCompra);
		this.jmenuDetalleAccionesPlaneacionCompra.add(this.jMenuItemEliminarPlaneacionCompra);
		this.jmenuDetalleAccionesPlaneacionCompra.add(this.jMenuItemCancelarPlaneacionCompra);		
		
		//this.jmenuDetalleDatosPlaneacionCompra.add(this.jMenuItemDetalleAbrirOrderByPlaneacionCompra);				
		this.jmenuDetalleDatosPlaneacionCompra.add(this.jMenuItemDetalleMostarOcultarPlaneacionCompra);				
				
		//this.jmenuDetalleAccionesPlaneacionCompra.add(this.jMenuItemGuardarCambiosPlaneacionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePlaneacionCompra.add(this.jmenuDetalleArchivoPlaneacionCompra);		
		this.jmenuBarDetallePlaneacionCompra.add(this.jmenuDetalleAccionesPlaneacionCompra);		
		this.jmenuBarDetallePlaneacionCompra.add(this.jmenuDetalleDatosPlaneacionCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePlaneacionCompra.add(this.jmenuDetallePlaneacionCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePlaneacionCompra);				
	}
	
	
	public void inicializarElementosCamposPlaneacionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPlaneacionCompra = new JLabelMe();
		jLabelIdPlaneacionCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPlaneacionCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPlaneacionCompra= new GridBagLayout();

		this.jPanelidPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);

		jLabelidPlaneacionCompra = new JLabel();
		jLabelidPlaneacionCompra.setText("Id");

		jLabelidPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_pre_impresoPlaneacionCompra = new JLabelMe();
		this.jLabelnumero_pre_impresoPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoPlaneacionCompra.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelnumero_pre_impresoPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextFieldnumero_pre_impresoPlaneacionCompra= new JTextFieldMe();

		jTextFieldnumero_pre_impresoPlaneacionCompra.setEnabled(false);
		jTextFieldnumero_pre_impresoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setText("U");
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaPlaneacionCompra = new JLabelMe();
		this.jLabelfechaPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPlaneacionCompra.setToolTipText("Fecha");
		this.jLabelfechaPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelfechaPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		//jFormattedTextFieldfechaPlaneacionCompra= new JFormattedTextFieldMe();

		jDateChooserfechaPlaneacionCompra= new JDateChooser();
		jDateChooserfechaPlaneacionCompra.setEnabled(false);
		jDateChooserfechaPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPlaneacionCompra.setDate(new Date());
		jDateChooserfechaPlaneacionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPlaneacionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonfechaPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPlaneacionCompraBusqueda.setText("U");
		this.jButtonfechaPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mesesPlaneacionCompra = new JLabelMe();
		this.jLabelnumero_mesesPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES+" : *");
		this.jLabelnumero_mesesPlaneacionCompra.setToolTipText("Numero Meses");
		this.jLabelnumero_mesesPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mesesPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mesesPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mesesPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelnumero_mesesPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextFieldnumero_mesesPlaneacionCompra= new JTextFieldMe();
		jTextFieldnumero_mesesPlaneacionCompra.setEnabled(false);
		jTextFieldnumero_mesesPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mesesPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_mesesPlaneacionCompra.setText("0");

		this.jButtonnumero_mesesPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mesesPlaneacionCompraBusqueda.setText("U");
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mesesPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mesesPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mesesPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mesesPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mesesPlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_cortePlaneacionCompra = new JLabelMe();
		this.jLabelfecha_cortePlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE+" : *");
		this.jLabelfecha_cortePlaneacionCompra.setToolTipText("Fecha Corte");
		this.jLabelfecha_cortePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cortePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cortePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_cortePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_cortePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_cortePlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelfecha_cortePlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		//jFormattedTextFieldfecha_cortePlaneacionCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_cortePlaneacionCompra= new JDateChooser();
		jDateChooserfecha_cortePlaneacionCompra.setEnabled(false);
		jDateChooserfecha_cortePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_cortePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_cortePlaneacionCompra.setDate(new Date());
		jDateChooserfecha_cortePlaneacionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_cortePlaneacionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_cortePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_cortePlaneacionCompraBusqueda.setText("U");
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_cortePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_cortePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_cortePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_cortePlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_cortePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_pedidoPlaneacionCompra = new JLabelMe();
		this.jLabelcodigo_pedidoPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO+" : *");
		this.jLabelcodigo_pedidoPlaneacionCompra.setToolTipText("Codigo Pedido");
		this.jLabelcodigo_pedidoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_pedidoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_pedidoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_pedidoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_pedidoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_pedidoPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelcodigo_pedidoPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextFieldcodigo_pedidoPlaneacionCompra= new JTextFieldMe();

		jTextFieldcodigo_pedidoPlaneacionCompra.setEnabled(false);
		jTextFieldcodigo_pedidoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_pedidoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_pedidoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_pedidoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setText("U");
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_pedidoPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_pedidoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_pedidoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_pedidoPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_pedidoPlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion1PlaneacionCompra = new JLabelMe();
		this.jLabeldescripcion1PlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1+" : *");
		this.jLabeldescripcion1PlaneacionCompra.setToolTipText("Descripcion1");
		this.jLabeldescripcion1PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion1PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion1PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion1PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion1PlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion1PlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPaneldescripcion1PlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextAreadescripcion1PlaneacionCompra= new JTextAreaMe();
		jTextAreadescripcion1PlaneacionCompra.setEnabled(false);
		jTextAreadescripcion1PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion1PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion1PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion1PlaneacionCompra.setLineWrap(true);
		jTextAreadescripcion1PlaneacionCompra.setWrapStyleWord(true);
		jTextAreadescripcion1PlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion1PlaneacionCompra.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion1PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion1PlaneacionCompra = new JScrollPane(jTextAreadescripcion1PlaneacionCompra);
		jscrollPanedescripcion1PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion1PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion1PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion1PlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondescripcion1PlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion1PlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion1PlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion1PlaneacionCompraBusqueda.setText("U");
		this.jButtondescripcion1PlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion1PlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion1PlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion1PlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion1PlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion1PlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion1PlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion2PlaneacionCompra = new JLabelMe();
		this.jLabeldescripcion2PlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2+" : *");
		this.jLabeldescripcion2PlaneacionCompra.setToolTipText("Descripcion2");
		this.jLabeldescripcion2PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion2PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion2PlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion2PlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPaneldescripcion2PlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextAreadescripcion2PlaneacionCompra= new JTextAreaMe();
		jTextAreadescripcion2PlaneacionCompra.setEnabled(false);
		jTextAreadescripcion2PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2PlaneacionCompra.setLineWrap(true);
		jTextAreadescripcion2PlaneacionCompra.setWrapStyleWord(true);
		jTextAreadescripcion2PlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion2PlaneacionCompra.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion2PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion2PlaneacionCompra = new JScrollPane(jTextAreadescripcion2PlaneacionCompra);
		jscrollPanedescripcion2PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion2PlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondescripcion2PlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2PlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2PlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion2PlaneacionCompraBusqueda.setText("U");
		this.jButtondescripcion2PlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion2PlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion2PlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion2PlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion2PlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion2PlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion2PlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion3PlaneacionCompra = new JLabelMe();
		this.jLabeldescripcion3PlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3+" : *");
		this.jLabeldescripcion3PlaneacionCompra.setToolTipText("Descripcion3");
		this.jLabeldescripcion3PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion3PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion3PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion3PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion3PlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion3PlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPaneldescripcion3PlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jTextAreadescripcion3PlaneacionCompra= new JTextAreaMe();
		jTextAreadescripcion3PlaneacionCompra.setEnabled(false);
		jTextAreadescripcion3PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3PlaneacionCompra.setLineWrap(true);
		jTextAreadescripcion3PlaneacionCompra.setWrapStyleWord(true);
		jTextAreadescripcion3PlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion3PlaneacionCompra.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion3PlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion3PlaneacionCompra = new JScrollPane(jTextAreadescripcion3PlaneacionCompra);
		jscrollPanedescripcion3PlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion3PlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion3PlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion3PlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondescripcion3PlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion3PlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion3PlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion3PlaneacionCompraBusqueda.setText("U");
		this.jButtondescripcion3PlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion3PlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion3PlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion3PlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion3PlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion3PlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion3PlaneacionCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPlaneacionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPlaneacionCompra = new JLabelMe();
		this.jLabelid_empresaPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPlaneacionCompra.setToolTipText("Empresa");
		this.jLabelid_empresaPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_empresaPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_empresaPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_empresaPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPlaneacionCompra.setEnabled(false);

		this.jButtonid_empresaPlaneacionCompra= new JButtonMe();
		this.jButtonid_empresaPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionCompra.setText("Buscar");
		this.jButtonid_empresaPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionCompra"));

		this.jButtonid_empresaPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_empresaPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_empresaPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaneacionCompraUpdate.setText("U");
		this.jButtonid_empresaPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionCompraUpdate"));



					
		this.jLabelid_sucursalPlaneacionCompra = new JLabelMe();
		this.jLabelid_sucursalPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPlaneacionCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_sucursalPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_sucursalPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_sucursalPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPlaneacionCompra.setEnabled(false);

		this.jButtonid_sucursalPlaneacionCompra= new JButtonMe();
		this.jButtonid_sucursalPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaneacionCompra.setText("Buscar");
		this.jButtonid_sucursalPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaneacionCompra"));

		this.jButtonid_sucursalPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPlaneacionCompraUpdate.setText("U");
		this.jButtonid_sucursalPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaneacionCompraUpdate"));



					
		this.jLabelid_ejercicioPlaneacionCompra = new JLabelMe();
		this.jLabelid_ejercicioPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPlaneacionCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_ejercicioPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_ejercicioPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_ejercicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPlaneacionCompra.setEnabled(false);

		this.jButtonid_ejercicioPlaneacionCompra= new JButtonMe();
		this.jButtonid_ejercicioPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPlaneacionCompra.setText("Buscar");
		this.jButtonid_ejercicioPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPlaneacionCompra"));

		this.jButtonid_ejercicioPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPlaneacionCompraUpdate.setText("U");
		this.jButtonid_ejercicioPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPlaneacionCompraUpdate"));



					
		this.jLabelid_periodoPlaneacionCompra = new JLabelMe();
		this.jLabelid_periodoPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPlaneacionCompra.setToolTipText("Periodo");
		this.jLabelid_periodoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_periodoPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_periodoPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_periodoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPlaneacionCompra.setEnabled(false);

		this.jButtonid_periodoPlaneacionCompra= new JButtonMe();
		this.jButtonid_periodoPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPlaneacionCompra.setText("Buscar");
		this.jButtonid_periodoPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPlaneacionCompra"));

		this.jButtonid_periodoPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_periodoPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_periodoPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPlaneacionCompraUpdate.setText("U");
		this.jButtonid_periodoPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPlaneacionCompraUpdate"));



					
		this.jLabelid_empleadoPlaneacionCompra = new JLabelMe();
		this.jLabelid_empleadoPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPlaneacionCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_empleadoPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_empleadoPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_empleadoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPlaneacionCompra= new JButtonMe();
		this.jButtonid_empleadoPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaneacionCompra.setText("Buscar");
		this.jButtonid_empleadoPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaneacionCompra"));

		this.jButtonid_empleadoPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPlaneacionCompraUpdate.setText("U");
		this.jButtonid_empleadoPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaneacionCompraUpdate"));



					
		this.jLabelid_usuarioPlaneacionCompra = new JLabelMe();
		this.jLabelid_usuarioPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPlaneacionCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_usuarioPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_usuarioPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_usuarioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPlaneacionCompra.setEnabled(false);

		this.jButtonid_usuarioPlaneacionCompra= new JButtonMe();
		this.jButtonid_usuarioPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPlaneacionCompra.setText("Buscar");
		this.jButtonid_usuarioPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPlaneacionCompra"));

		this.jButtonid_usuarioPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPlaneacionCompraUpdate.setText("U");
		this.jButtonid_usuarioPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPlaneacionCompraUpdate"));



					
		this.jLabelid_formatoPlaneacionCompra = new JLabelMe();
		this.jLabelid_formatoPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoPlaneacionCompra.setToolTipText("Formato");
		this.jLabelid_formatoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_formatoPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_formatoPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_formatoPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPlaneacionCompra= new JButtonMe();
		this.jButtonid_formatoPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPlaneacionCompra.setText("Buscar");
		this.jButtonid_formatoPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPlaneacionCompra"));

		this.jButtonid_formatoPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_formatoPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_formatoPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_formatoPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_formatoPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPlaneacionCompraUpdate.setText("U");
		this.jButtonid_formatoPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPlaneacionCompraUpdate"));



					
		this.jLabelid_mes_inicioPlaneacionCompra = new JLabelMe();
		this.jLabelid_mes_inicioPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO+" : *");
		this.jLabelid_mes_inicioPlaneacionCompra.setToolTipText("Mes Inicio");
		this.jLabelid_mes_inicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_inicioPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_inicioPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_mes_inicioPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_mes_inicioPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_mes_inicioPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicioPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicioPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_inicioPlaneacionCompra= new JButtonMe();
		this.jButtonid_mes_inicioPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicioPlaneacionCompra.setText("Buscar");
		this.jButtonid_mes_inicioPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_inicioPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_inicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioPlaneacionCompra"));

		this.jButtonid_mes_inicioPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_inicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_inicioPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_mes_inicioPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_mes_inicioPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicioPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicioPlaneacionCompraUpdate.setText("U");
		this.jButtonid_mes_inicioPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_inicioPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicioPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_inicioPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicioPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicioPlaneacionCompraUpdate"));



					
		this.jLabelid_mes_finPlaneacionCompra = new JLabelMe();
		this.jLabelid_mes_finPlaneacionCompra.setText(""+PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN+" : *");
		this.jLabelid_mes_finPlaneacionCompra.setToolTipText("Mes Fin");
		this.jLabelid_mes_finPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_finPlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_finPlaneacionCompra.setToolTipText(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN);
		this.gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		this.jPanelid_mes_finPlaneacionCompra.setLayout(this.gridaBagLayoutPlaneacionCompra);


		jComboBoxid_mes_finPlaneacionCompra= new JComboBoxMe();
		jComboBoxid_mes_finPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_finPlaneacionCompra= new JButtonMe();
		this.jButtonid_mes_finPlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finPlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finPlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finPlaneacionCompra.setText("Buscar");
		this.jButtonid_mes_finPlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_finPlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finPlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_finPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finPlaneacionCompra"));

		this.jButtonid_mes_finPlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finPlaneacionCompraBusqueda.setText("U");
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finPlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_finPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finPlaneacionCompraBusqueda"));

		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_finPlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_mes_finPlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_mes_finPlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finPlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finPlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finPlaneacionCompraUpdate.setText("U");
		this.jButtonid_mes_finPlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_finPlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finPlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_finPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finPlaneacionCompraUpdate"));



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
		//this.jInternalFrameDetallePlaneacionCompra = new PlaneacionCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Planeacion Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaneacionCompra= new GridBagLayout();
		

		
		String sToolTipPlaneacionCompra="";
		sToolTipPlaneacionCompra=PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaneacionCompra+="(Inventario.PlaneacionCompra)";
		}
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaneacionCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPlaneacionCompra = new JButtonMe();
		this.jButtonModificarPlaneacionCompra = new JButtonMe();
        this.jButtonActualizarPlaneacionCompra = new JButtonMe();
        this.jButtonEliminarPlaneacionCompra = new JButtonMe();
        this.jButtonCancelarPlaneacionCompra = new JButtonMe();
        this.jButtonGuardarCambiosPlaneacionCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaPlaneacionCompra = new JButtonMe();
		this.jButtonCerrarPlaneacionCompra = new JButtonMe();
		
		this.jScrollPanelDatosPlaneacionCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionPlaneacionCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralPlaneacionCompra = new JScrollPane();
				
		
		
		this.jPanelCamposPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Planeacion Compra";
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPlaneacionCompra.setName("jPanelCamposPlaneacionCompra"); 

		this.jPanelCamposOcultosPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPlaneacionCompra.setName("jPanelCamposOcultosPlaneacionCompra"); 

        this.jPanelAccionesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesPlaneacionCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPlaneacionCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPlaneacionCompra.setText("Nuevo");
		this.jButtonModificarPlaneacionCompra.setText("Editar");
        this.jButtonActualizarPlaneacionCompra.setText("Actualizar");
        this.jButtonEliminarPlaneacionCompra.setText("Eliminar");
        this.jButtonCancelarPlaneacionCompra.setText("Cancelar");
        this.jButtonGuardarCambiosPlaneacionCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaPlaneacionCompra.setText("Guardar");
		this.jButtonCerrarPlaneacionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaneacionCompra,"nuevo_button","Nuevo",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPlaneacionCompra,"modificar_button","Editar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPlaneacionCompra,"actualizar_button","Actualizar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPlaneacionCompra,"eliminar_button","Eliminar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPlaneacionCompra,"cancelar_button","Cancelar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPlaneacionCompra,"guardarcambios_button","Guardar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaneacionCompra,"guardarcambiostabla_button","Guardar",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaneacionCompra,"cerrar_button","Salir",this.planeacioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPlaneacionCompra.setToolTipText("Nuevo"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPlaneacionCompra.setToolTipText("Editar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPlaneacionCompra.setToolTipText("Actualizar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPlaneacionCompra.setToolTipText("Eliminar)"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPlaneacionCompra.setToolTipText("Cancelar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPlaneacionCompra.setToolTipText("Guardar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPlaneacionCompra.setToolTipText("Guardar"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaneacionCompra.setToolTipText("Salir"+" "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaneacionCompra";
		inputMap = this.jButtonNuevoPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaneacionCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPlaneacionCompra";
		inputMap = this.jButtonActualizarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPlaneacionCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarPlaneacionCompra";
		inputMap = this.jButtonEliminarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPlaneacionCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarPlaneacionCompra";
		inputMap = this.jButtonCancelarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPlaneacionCompra"));
		
		//CERRAR		
		sMapKey = "CerrarPlaneacionCompra";
		inputMap = this.jButtonCerrarPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaneacionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaneacionCompra";
		inputMap = this.jButtonGuardarCambiosTablaPlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaneacionCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPlaneacionCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPlaneacionCompra.setToolTipText("Nuevo PlaneacionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPlaneacionCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPlaneacionCompra.setToolTipText("Sin Cerrar Ventana PlaneacionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePlaneacionCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePlaneacionCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaneacionCompra.setText("Accion");
		this.jComboBoxTiposAccionesPlaneacionCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPlaneacionCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPlaneacionCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPlaneacionCompra = new JLabelMe();
		
		this.jLabelAccionesPlaneacionCompra.setText("Acciones");		
		this.jLabelAccionesPlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPlaneacionCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPlaneacionCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPlaneacionCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesPlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPlaneacionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaneacionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaneacionCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPlaneacionCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPlaneacionCompra = new GridBagLayout();
		
		this.jPanelCamposPlaneacionCompra.setLayout(gridaBagLayoutCamposPlaneacionCompra);
		this.jPanelCamposOcultosPlaneacionCompra.setLayout(gridaBagLayoutCamposOcultosPlaneacionCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPlaneacionCompra.add(jLabelIdPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPlaneacionCompra.add(jLabelidPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPlaneacionCompra.add(jLabelid_empresaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaneacionCompra.add(jButtonid_empresaPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaneacionCompra.add(jButtonid_empresaPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPlaneacionCompra.add(jComboBoxid_empresaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPlaneacionCompra.add(jLabelid_sucursalPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPlaneacionCompra.add(jButtonid_sucursalPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPlaneacionCompra.add(jButtonid_sucursalPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPlaneacionCompra.add(jComboBoxid_sucursalPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPlaneacionCompra.add(jLabelid_ejercicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPlaneacionCompra.add(jButtonid_ejercicioPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPlaneacionCompra.add(jButtonid_ejercicioPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPlaneacionCompra.add(jComboBoxid_ejercicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPlaneacionCompra.add(jLabelid_periodoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPlaneacionCompra.add(jButtonid_periodoPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPlaneacionCompra.add(jButtonid_periodoPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPlaneacionCompra.add(jComboBoxid_periodoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPlaneacionCompra.add(jLabelid_empleadoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPlaneacionCompra.add(jButtonid_empleadoPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPlaneacionCompra.add(jButtonid_empleadoPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPlaneacionCompra.add(jComboBoxid_empleadoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPlaneacionCompra.add(jLabelid_usuarioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPlaneacionCompra.add(jButtonid_usuarioPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPlaneacionCompra.add(jButtonid_usuarioPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPlaneacionCompra.add(jComboBoxid_usuarioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPlaneacionCompra.add(jLabelid_formatoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPlaneacionCompra.add(jButtonid_formatoPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPlaneacionCompra.add(jButtonid_formatoPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPlaneacionCompra.add(jComboBoxid_formatoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoPlaneacionCompra.add(jLabelnumero_pre_impresoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoPlaneacionCompra.add(jButtonnumero_pre_impresoPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoPlaneacionCompra.add(jTextFieldnumero_pre_impresoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPlaneacionCompra.add(jLabelfechaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPlaneacionCompra.add(jButtonfechaPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPlaneacionCompra.add(jDateChooserfechaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_inicioPlaneacionCompra.add(jLabelid_mes_inicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicioPlaneacionCompra.add(jButtonid_mes_inicioPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicioPlaneacionCompra.add(jButtonid_mes_inicioPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_inicioPlaneacionCompra.add(jComboBoxid_mes_inicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_finPlaneacionCompra.add(jLabelid_mes_finPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finPlaneacionCompra.add(jButtonid_mes_finPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 3;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finPlaneacionCompra.add(jButtonid_mes_finPlaneacionCompraUpdate, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_finPlaneacionCompra.add(jComboBoxid_mes_finPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mesesPlaneacionCompra.add(jLabelnumero_mesesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mesesPlaneacionCompra.add(jButtonnumero_mesesPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mesesPlaneacionCompra.add(jTextFieldnumero_mesesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_cortePlaneacionCompra.add(jLabelfecha_cortePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_cortePlaneacionCompra.add(jButtonfecha_cortePlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_cortePlaneacionCompra.add(jDateChooserfecha_cortePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_pedidoPlaneacionCompra.add(jLabelcodigo_pedidoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_pedidoPlaneacionCompra.add(jButtoncodigo_pedidoPlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_pedidoPlaneacionCompra.add(jTextFieldcodigo_pedidoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion1PlaneacionCompra.add(jLabeldescripcion1PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion1PlaneacionCompra.add(jButtondescripcion1PlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion1PlaneacionCompra.add(jscrollPanedescripcion1PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion2PlaneacionCompra.add(jLabeldescripcion2PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion2PlaneacionCompra.add(jButtondescripcion2PlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion2PlaneacionCompra.add(jscrollPanedescripcion2PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion3PlaneacionCompra.add(jLabeldescripcion3PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = 2;
		this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsPlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion3PlaneacionCompra.add(jButtondescripcion3PlaneacionCompraBusqueda, this.gridBagConstraintsPlaneacionCompra);
	}

	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionCompra.gridy = 0;
	this.gridBagConstraintsPlaneacionCompra.gridx = 1;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion3PlaneacionCompra.add(jscrollPanedescripcion3PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelidPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelid_empleadoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelid_formatoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelnumero_pre_impresoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelfechaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelid_mes_inicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelid_mes_finPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelnumero_mesesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelfecha_cortePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPanelcodigo_pedidoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPaneldescripcion1PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPaneldescripcion2PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionCompra.add(this.jPaneldescripcion3PlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposPlaneacionCompra % 2==0) {
		iXPanelCamposPlaneacionCompra=0;
		iYPanelCamposPlaneacionCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposOcultosPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposOcultosPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionCompra.add(this.jPanelid_empresaPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposOcultosPlaneacionCompra % 2==0) {
		iXPanelCamposOcultosPlaneacionCompra=0;
		iYPanelCamposOcultosPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposOcultosPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposOcultosPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionCompra.add(this.jPanelid_sucursalPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposOcultosPlaneacionCompra % 2==0) {
		iXPanelCamposOcultosPlaneacionCompra=0;
		iYPanelCamposOcultosPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposOcultosPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposOcultosPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionCompra.add(this.jPanelid_ejercicioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposOcultosPlaneacionCompra % 2==0) {
		iXPanelCamposOcultosPlaneacionCompra=0;
		iYPanelCamposOcultosPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposOcultosPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposOcultosPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionCompra.add(this.jPanelid_periodoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposOcultosPlaneacionCompra % 2==0) {
		iXPanelCamposOcultosPlaneacionCompra=0;
		iYPanelCamposOcultosPlaneacionCompra++;
	}
	this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionCompra.gridy = iYPanelCamposOcultosPlaneacionCompra;
	this.gridBagConstraintsPlaneacionCompra.gridx = iXPanelCamposOcultosPlaneacionCompra++;
	this.gridBagConstraintsPlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionCompra.add(this.jPanelid_usuarioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);



	if(iXPanelCamposOcultosPlaneacionCompra % 2==0) {
		iXPanelCamposOcultosPlaneacionCompra=0;
		iYPanelCamposOcultosPlaneacionCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesPlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesPlaneacionCompra.setLayout(gridaBagLayoutAccionesPlaneacionCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesFormularioPlaneacionCompra.setLayout(gridaBagLayoutAccionesFormularioPlaneacionCompra);
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlaneacionCompra.add(this.jComboBoxTiposAccionesFormularioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlaneacionCompra.add(this.jCheckBoxPostAccionNuevoPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlaneacionCompra.add(this.jCheckBoxPostAccionSinCerrarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlaneacionCompra.add(this.jCheckBoxPostAccionSinMensajePlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonModificarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);							

		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;
		this.gridBagConstraintsPlaneacionCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonEliminarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonActualizarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);


		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsPlaneacionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonGuardarCambiosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);	
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsPlaneacionCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesPlaneacionCompra.add(this.jButtonCancelarPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaneacionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaneacionCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();						
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;		
			//this.gridBagConstraintsPlaneacionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaneacionCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionCompra.gridx =0;
		this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaneacionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePlaneacionCompra = new PlaneacionCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Planeacion Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Planeacion Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeacion Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PlaneacionCompraModel planeacioncompraModel=new PlaneacionCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//PlaneacionCompraModel.PlaneacionCompraFocusTraversalPolicy planeacioncompraFocusTraversalPolicy = planeacioncompraModel.new PlaneacionCompraFocusTraversalPolicy(this);
			
			//planeacioncompraFocusTraversalPolicy.setplaneacioncompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(planeacioncompraModel);
			
			
			this.jContentPaneDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();	
			this.jContentPaneDetallePlaneacionCompra.setLayout(gridaBagLayoutDetallePlaneacionCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaneacionCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPlaneacionCompra.gridx = 0;
					
				
				this.jContentPaneDetallePlaneacionCompra.add(jTtoolBarDetallePlaneacionCompra, gridBagConstraintsPlaneacionCompra);								
				
}
			
			this.jScrollPanelDatosEdicionPlaneacionCompra=   new JScrollPane(jContentPaneDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPlaneacionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	        
			this.jContentPaneDetallePlaneacionCompra.add(jPanelCamposPlaneacionCompra, gridBagConstraintsPlaneacionCompra);
			
			
			
			
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
						&& planeacioncompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(this.puedeCargarPorParteDetallePlaneacionCompra,false,-1);
					
					if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPlaneacionCompra= new GridBagConstraints();
						this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPlaneacionCompra.gridx = 0;
						this.jContentPaneDetallePlaneacionCompra.add(this.jTabbedPaneRelacionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPlaneacionCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPlaneacionCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
					this.gridBagConstraintsPlaneacionCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPlaneacionCompra.gridx = 0;
					
				
					this.jContentPaneDetallePlaneacionCompra.add(jPanelCamposOcultosPlaneacionCompra, gridBagConstraintsPlaneacionCompra);
				
					this.jPanelCamposOcultosPlaneacionCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	        this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePlaneacionCompra.add(this.jPanelAccionesFormularioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);							
			
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
	        this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPlaneacionCompra.gridx = 0;
	        
			
			this.jContentPaneDetallePlaneacionCompra.add(this.jPanelAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPlaneacionCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPlaneacionCompra=   new JScrollPane(this.jPanelCamposPlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;
			this.gridBagConstraintsPlaneacionCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPlaneacionCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPlaneacionCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);			
			
			this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
			
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		
			
		this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaneacionCompra, this.gridBagConstraintsPlaneacionCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPlaneacionCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionPlaneacionCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(false);
		this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);

		this.detalleplaneacioncompraBeanSwingJInternalFrame=null;//new DetallePlaneacionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleplaneacioncompraBeanSwingJInternalFramePopup=new DetallePlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleplaneacioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {

				DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);

				this.detalleplaneacioncompraBeanSwingJInternalFrame=new DetallePlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleplaneacioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleplaneacioncompraBeanSwingJInternalFrame.setdetalleplaneacioncompraSessionBean(this.detalleplaneacioncompraSessionBean);

				//this.gridBagConstraintsPlaneacionCompra = new GridBagConstraints();
				//this.gridBagConstraintsPlaneacionCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPlaneacionCompra.gridx = 0;
				//this.jContentPaneDetallePlaneacionCompra.add(this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPlaneacionCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPlaneacionCompra.add("Detalle Planeacion Compras",this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPlaneacionCompra.setComponentAt(iIndexTab,this.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
				this.detalleplaneacioncompraBeanSwingJInternalFrame=null;//new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePlaneacionCompra) {
					this.jTabbedPaneRelacionesPlaneacionCompra.add("Detalle Planeacion Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePlaneacionCompraBeanSwingJInternalFrame(List<PlaneacionCompra> planeacioncompras,PlaneacionCompra planeacioncompra,DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleplaneacioncompraBeanSwingJInternalFrame=new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleplaneacioncompraBeanSwingJInternalFrame.getDetallePlaneacionCompraLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

					detalleplaneacioncompraBeanSwingJInternalFrame.setplaneacioncomprasForeignKey(planeacioncompras);
					detalleplaneacioncompraBeanSwingJInternalFrame.setplaneacioncompraForeignKey(planeacioncompra);
					detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionPlaneacionCompra(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setlidPlaneacionCompraActual(planeacioncompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleplaneacioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePlaneacionCompra(detalleplaneacioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleplaneacioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaPlaneacionCompra(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setid_planeacion_compraFK_IdPlaneacionCompra(planeacioncompra.getId());

					if(!this.conCargarFormDetalle) {
						detalleplaneacioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleplaneacioncompraBeanSwingJInternalFrame.setSelectedItemCombosFramePlaneacionCompraForeignKey(planeacioncompra,1,false,true,true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleplaneacioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdPlaneacionCompra");
					detalleplaneacioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPlaneacionCompra");
					detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n",detalleplaneacioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleplaneacioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleplaneacioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("relacionado");
					} else {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("no_relacionado");
					}

					detalleplaneacioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePlaneacionCompra().setVisible(false);

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
