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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.CompoKitConstantesFunciones;

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
public class CompoKitDetalleFormJInternalFrame extends CompoKitBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCompoKit;
	
	protected JMenuBar jmenuBarDetalleCompoKit;
	
	protected JMenu jmenuDetalleCompoKit;
	protected JMenu jmenuDetalleArchivoCompoKit;
	protected JMenu jmenuDetalleAccionesCompoKit;
	protected JMenu jmenuDetalleDatosCompoKit;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCompoKit;	
	protected GridBagConstraints gridBagConstraintsCompoKit;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CompoKitBeanSwingJInternalFrameAdditional jInternalFrameDetalleCompoKit;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected KitBeanSwingJInternalFrame kitBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_kit="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public CompoKitSessionBean compokitSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public KitSessionBean kitSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public CompoKitLogic compokitLogic;
	
	public JScrollPane jScrollPanelDatosCompoKit;
	public JScrollPane jScrollPanelDatosEdicionCompoKit;
	public JScrollPane jScrollPanelDatosGeneralCompoKit;
	
	protected JPanel jPanelCamposCompoKit;    
	protected JPanel jPanelCamposOcultosCompoKit;    	
	protected JPanel jPanelAccionesCompoKit;
	protected JPanel jPanelAccionesFormularioCompoKit;
    
	
	
	protected Integer iXPanelCamposCompoKit=0;
	protected Integer iYPanelCamposCompoKit=0;
	
	protected Integer iXPanelCamposOcultosCompoKit=0;
	protected Integer iYPanelCamposOcultosCompoKit=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCompoKit;
	public JButton jButtonModificarCompoKit;
	public JButton jButtonActualizarCompoKit;
    public JButton jButtonEliminarCompoKit;
	public JButton jButtonCancelarCompoKit;
    public JButton jButtonGuardarCambiosCompoKit;
	public JButton jButtonGuardarCambiosTablaCompoKit;
	protected JButton jButtonCerrarCompoKit;
	
	
	protected JButton jButtonProcesarInformacionCompoKit;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCompoKit;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCompoKit;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCompoKit;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCompoKit;
	protected JButton jButtonModificarToolBarCompoKit;
	protected JButton jButtonActualizarToolBarCompoKit;
    protected JButton jButtonEliminarToolBarCompoKit;
	protected JButton jButtonCancelarToolBarCompoKit;
    protected JButton jButtonGuardarCambiosToolBarCompoKit;
	protected JButton jButtonGuardarCambiosTablaToolBarCompoKit;
	protected JButton jButtonMostrarOcultarTablaToolBarCompoKit;
	protected JButton jButtonCerrarToolBarCompoKit;
	
	protected JButton jButtonProcesarInformacionToolBarCompoKit;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCompoKit;
	protected JMenuItem jMenuItemModificarCompoKit;
	protected JMenuItem jMenuItemActualizarCompoKit;
    protected JMenuItem jMenuItemEliminarCompoKit;
	protected JMenuItem jMenuItemCancelarCompoKit;
    protected JMenuItem jMenuItemGuardarCambiosCompoKit;
	protected JMenuItem jMenuItemGuardarCambiosTablaCompoKit;
	protected JMenuItem jMenuItemCerrarCompoKit;
	protected JMenuItem jMenuItemDetalleCerrarCompoKit;
	protected JMenuItem jMenuItemDetalleMostarOcultarCompoKit;
	
	protected JMenuItem jMenuItemProcesarInformacionCompoKit;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCompoKit;
	protected JMenuItem jMenuItemMostrarOcultarCompoKit;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCompoKit;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCompoKit;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCompoKit;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCompoKit;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCompoKit;
	public JLabel jLabelIdCompoKit;
	public JLabel jLabelidCompoKit;
	public JButton jButtonidCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelcantidadCompoKit;
	public JLabel jLabelcantidadCompoKit;
	public JTextField jTextFieldcantidadCompoKit;
	public JButton jButtoncantidadCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ingresoCompoKit;
	public JLabel jLabelvalor_ingresoCompoKit;
	public JTextField jTextFieldvalor_ingresoCompoKit;
	public JButton jButtonvalor_ingresoCompoKitBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCompoKit;
	public JLabel jLabeldescripcionCompoKit;
	public JTextArea jTextAreadescripcionCompoKit;
	public JScrollPane jscrollPanedescripcionCompoKit;
	public JButton jButtondescripcionCompoKitBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCompoKit;
	public JLabel jLabelid_empresaCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCompoKit;
	public JButton jButtonid_empresaCompoKit= new JButtonMe();
	public JButton jButtonid_empresaCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_empresaCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCompoKit;
	public JLabel jLabelid_sucursalCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCompoKit;
	public JButton jButtonid_sucursalCompoKit= new JButtonMe();
	public JButton jButtonid_sucursalCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaCompoKit;
	public JLabel jLabelid_bodegaCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaCompoKit;
	public JButton jButtonid_bodegaCompoKit= new JButtonMe();
	public JButton jButtonid_bodegaCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_bodegaCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelid_productoCompoKit;
	public JLabel jLabelid_productoCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoCompoKit;
	public JButton jButtonid_productoCompoKit= new JButtonMe();
	public JButton jButtonid_productoCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_productoCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelid_kitCompoKit;
	public JLabel jLabelid_kitCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_kitCompoKit;
	public JButton jButtonid_kitCompoKit= new JButtonMe();
	public JButton jButtonid_kitCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_kitCompoKitBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadCompoKit;
	public JLabel jLabelid_unidadCompoKit;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadCompoKit;
	public JButton jButtonid_unidadCompoKit= new JButtonMe();
	public JButton jButtonid_unidadCompoKitUpdate= new JButtonMe();
	public JButton jButtonid_unidadCompoKitBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCompoKit;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CompoKitDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCompoKit=new JPanel();
				this.jPanelAccionesFormularioCompoKit=new JPanel();
				this.jmenuBarDetalleCompoKit=new JMenuBar();
				this.jTtoolBarDetalleCompoKit=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CompoKitDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompoKitDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CompoKit No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCompoKit() {
		return this.jButtonActualizarToolBarCompoKit;
	}
	
	public JButton getjButtonEliminarToolBarCompoKit() {
		return this.jButtonEliminarToolBarCompoKit;
	}
	
	public JButton getjButtonCancelarToolBarCompoKit() {
		return this.jButtonCancelarToolBarCompoKit;
	}		
	
	public JButton getjButtonProcesarInformacionCompoKit() {
		return this.jButtonProcesarInformacionCompoKit;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCompoKit)	{
		this.jButtonProcesarInformacionCompoKit = jButtonProcesarInformacionCompoKit;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCompoKit() {
		return this.jComboBoxTiposAccionesCompoKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCompoKit(
			JComboBox jComboBoxTiposRelacionesCompoKit) {
		this.jComboBoxTiposRelacionesCompoKit = jComboBoxTiposRelacionesCompoKit;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCompoKit(
			JComboBox jComboBoxTiposAccionesCompoKit) {
		this.jComboBoxTiposAccionesCompoKit = jComboBoxTiposAccionesCompoKit;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCompoKit() {
		return this.jComboBoxTiposAccionesFormularioCompoKit;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCompoKit(
			JComboBox jComboBoxTiposAccionesFormularioCompoKit) {
		this.jComboBoxTiposAccionesFormularioCompoKit = jComboBoxTiposAccionesFormularioCompoKit;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.compokitSessionBean=new CompoKitSessionBean();
		
		this.compokitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.compokitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.compokitSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CompoKitJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CompoKitJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Compo Kit MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
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
	
		CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCompoKit= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCompoKit=new JButtonMe();
				this.jButtonModificarToolBarCompoKit=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCompoKit,this.jTtoolBarDetalleCompoKit,
							"actualizar","actualizar","Actualizar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCompoKit,this.jTtoolBarDetalleCompoKit,
							"eliminar","eliminar","Eliminar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCompoKit,this.jTtoolBarDetalleCompoKit,
							"cancelar","cancelar","Cancelar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCompoKit=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCompoKit,this.jTtoolBarDetalleCompoKit,
							"guardarcambios","guardarcambios","Guardar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCompoKit=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCompoKit=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCompoKit=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCompoKit=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCompoKit=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCompoKit= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCompoKit.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCompoKit,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCompoKit= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCompoKit.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCompoKit,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCompoKit= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCompoKit.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCompoKit,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCompoKit= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCompoKit.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCompoKit,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCompoKit= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCompoKit.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCompoKit,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCompoKit= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCompoKit.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCompoKit,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCompoKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCompoKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCompoKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCompoKit= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCompoKit.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCompoKit,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCompoKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCompoKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCompoKit,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCompoKit= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCompoKit.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCompoKit,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCompoKit.add(this.jMenuItemDetalleCerrarCompoKit);
		
		this.jmenuDetalleAccionesCompoKit.add(this.jMenuItemActualizarCompoKit);
		this.jmenuDetalleAccionesCompoKit.add(this.jMenuItemEliminarCompoKit);
		this.jmenuDetalleAccionesCompoKit.add(this.jMenuItemCancelarCompoKit);		
		
		//this.jmenuDetalleDatosCompoKit.add(this.jMenuItemDetalleAbrirOrderByCompoKit);				
		this.jmenuDetalleDatosCompoKit.add(this.jMenuItemDetalleMostarOcultarCompoKit);				
				
		//this.jmenuDetalleAccionesCompoKit.add(this.jMenuItemGuardarCambiosCompoKit);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCompoKit.add(this.jmenuDetalleArchivoCompoKit);		
		this.jmenuBarDetalleCompoKit.add(this.jmenuDetalleAccionesCompoKit);		
		this.jmenuBarDetalleCompoKit.add(this.jmenuDetalleDatosCompoKit);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCompoKit);				
	}
	
	
	public void inicializarElementosCamposCompoKit() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCompoKit = new JLabelMe();
		jLabelIdCompoKit.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCompoKit = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCompoKit= new GridBagLayout();

		this.jPanelidCompoKit.setLayout(this.gridaBagLayoutCompoKit);

		jLabelidCompoKit = new JLabel();
		jLabelidCompoKit.setText("Id");

		jLabelidCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadCompoKit = new JLabelMe();
		this.jLabelcantidadCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadCompoKit.setToolTipText("Cantidad");
		this.jLabelcantidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelcantidadCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jTextFieldcantidadCompoKit= new JTextFieldMe();
		jTextFieldcantidadCompoKit.setEnabled(false);
		jTextFieldcantidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadCompoKit.setText("0");

		this.jButtoncantidadCompoKitBusqueda= new JButtonMe();
		this.jButtoncantidadCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadCompoKitBusqueda.setText("U");
		this.jButtoncantidadCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadCompoKitBusqueda.setVisible(false);		}


					
		this.jLabelvalor_ingresoCompoKit = new JLabelMe();
		this.jLabelvalor_ingresoCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_VALORINGRESO+" : *");
		this.jLabelvalor_ingresoCompoKit.setToolTipText("Valor Ingreso");
		this.jLabelvalor_ingresoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ingresoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ingresoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ingresoCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ingresoCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ingresoCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_VALORINGRESO);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelvalor_ingresoCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jTextFieldvalor_ingresoCompoKit= new JTextFieldMe();
		jTextFieldvalor_ingresoCompoKit.setEnabled(false);
		jTextFieldvalor_ingresoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ingresoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ingresoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ingresoCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ingresoCompoKit.setText("0.0");

		this.jButtonvalor_ingresoCompoKitBusqueda= new JButtonMe();
		this.jButtonvalor_ingresoCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ingresoCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ingresoCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ingresoCompoKitBusqueda.setText("U");
		this.jButtonvalor_ingresoCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ingresoCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ingresoCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ingresoCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ingresoCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ingresoCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ingresoCompoKitBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCompoKit = new JLabelMe();
		this.jLabeldescripcionCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCompoKit.setToolTipText("Descripcion");
		this.jLabeldescripcionCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPaneldescripcionCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jTextAreadescripcionCompoKit= new JTextAreaMe();
		jTextAreadescripcionCompoKit.setEnabled(false);
		jTextAreadescripcionCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompoKit.setLineWrap(true);
		jTextAreadescripcionCompoKit.setWrapStyleWord(true);
		jTextAreadescripcionCompoKit.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCompoKit.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCompoKit = new JScrollPane(jTextAreadescripcionCompoKit);
		jscrollPanedescripcionCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCompoKitBusqueda= new JButtonMe();
		this.jButtondescripcionCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCompoKitBusqueda.setText("U");
		this.jButtondescripcionCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCompoKitBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCompoKit() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCompoKit = new JLabelMe();
		this.jLabelid_empresaCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCompoKit.setToolTipText("Empresa");
		this.jLabelid_empresaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_empresaCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_empresaCompoKit= new JComboBoxMe();
		jComboBoxid_empresaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCompoKit.setEnabled(false);

		this.jButtonid_empresaCompoKit= new JButtonMe();
		this.jButtonid_empresaCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompoKit.setText("Buscar");
		this.jButtonid_empresaCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompoKit"));

		this.jButtonid_empresaCompoKitBusqueda= new JButtonMe();
		this.jButtonid_empresaCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCompoKitBusqueda.setText("U");
		this.jButtonid_empresaCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_empresaCompoKitUpdate= new JButtonMe();
		this.jButtonid_empresaCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCompoKitUpdate.setText("U");
		this.jButtonid_empresaCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompoKitUpdate"));



					
		this.jLabelid_sucursalCompoKit = new JLabelMe();
		this.jLabelid_sucursalCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCompoKit.setToolTipText("Sucursal");
		this.jLabelid_sucursalCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_sucursalCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_sucursalCompoKit= new JComboBoxMe();
		jComboBoxid_sucursalCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCompoKit.setEnabled(false);

		this.jButtonid_sucursalCompoKit= new JButtonMe();
		this.jButtonid_sucursalCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompoKit.setText("Buscar");
		this.jButtonid_sucursalCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompoKit"));

		this.jButtonid_sucursalCompoKitBusqueda= new JButtonMe();
		this.jButtonid_sucursalCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCompoKitBusqueda.setText("U");
		this.jButtonid_sucursalCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCompoKitUpdate= new JButtonMe();
		this.jButtonid_sucursalCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCompoKitUpdate.setText("U");
		this.jButtonid_sucursalCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompoKitUpdate"));



					
		this.jLabelid_bodegaCompoKit = new JLabelMe();
		this.jLabelid_bodegaCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaCompoKit.setToolTipText("Bodega");
		this.jLabelid_bodegaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_bodegaCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_bodegaCompoKit= new JComboBoxMe();
		jComboBoxid_bodegaCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaCompoKit= new JButtonMe();
		this.jButtonid_bodegaCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCompoKit.setText("Buscar");
		this.jButtonid_bodegaCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCompoKit"));

		this.jButtonid_bodegaCompoKitBusqueda= new JButtonMe();
		this.jButtonid_bodegaCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCompoKitBusqueda.setText("U");
		this.jButtonid_bodegaCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_bodegaCompoKitUpdate= new JButtonMe();
		this.jButtonid_bodegaCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCompoKitUpdate.setText("U");
		this.jButtonid_bodegaCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCompoKitUpdate"));



					
		this.jLabelid_productoCompoKit = new JLabelMe();
		this.jLabelid_productoCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoCompoKit.setToolTipText("Producto");
		this.jLabelid_productoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_productoCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_productoCompoKit= new JComboBoxMe();
		jComboBoxid_productoCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoCompoKit= new JButtonMe();
		this.jButtonid_productoCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCompoKit.setText("Buscar");
		this.jButtonid_productoCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCompoKit"));

		this.jButtonid_productoCompoKitBusqueda= new JButtonMe();
		this.jButtonid_productoCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoCompoKitBusqueda.setText("U");
		this.jButtonid_productoCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_productoCompoKitUpdate= new JButtonMe();
		this.jButtonid_productoCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoCompoKitUpdate.setText("U");
		this.jButtonid_productoCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCompoKitUpdate"));



					
		this.jLabelid_kitCompoKit = new JLabelMe();
		this.jLabelid_kitCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDKIT+" : *");
		this.jLabelid_kitCompoKit.setToolTipText("Kit");
		this.jLabelid_kitCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_kitCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_kitCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_kitCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_kitCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_kitCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDKIT);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_kitCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_kitCompoKit= new JComboBoxMe();
		jComboBoxid_kitCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_kitCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_kitCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_kitCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_kitCompoKit= new JButtonMe();
		this.jButtonid_kitCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_kitCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_kitCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_kitCompoKit.setText("Buscar");
		this.jButtonid_kitCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_kitCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_kitCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_kitCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_kitCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_kitCompoKit"));

		this.jButtonid_kitCompoKitBusqueda= new JButtonMe();
		this.jButtonid_kitCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_kitCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_kitCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_kitCompoKitBusqueda.setText("U");
		this.jButtonid_kitCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_kitCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_kitCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_kitCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_kitCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_kitCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_kitCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_kitCompoKitUpdate= new JButtonMe();
		this.jButtonid_kitCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_kitCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_kitCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_kitCompoKitUpdate.setText("U");
		this.jButtonid_kitCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_kitCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_kitCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_kitCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_kitCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_kitCompoKitUpdate"));



					
		this.jLabelid_unidadCompoKit = new JLabelMe();
		this.jLabelid_unidadCompoKit.setText(""+CompoKitConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadCompoKit.setToolTipText("Unad");
		this.jLabelid_unidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadCompoKit=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadCompoKit.setToolTipText(CompoKitConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutCompoKit = new GridBagLayout();
		this.jPanelid_unidadCompoKit.setLayout(this.gridaBagLayoutCompoKit);


		jComboBoxid_unidadCompoKit= new JComboBoxMe();
		jComboBoxid_unidadCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadCompoKit= new JButtonMe();
		this.jButtonid_unidadCompoKit.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadCompoKit.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadCompoKit.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadCompoKit.setText("Buscar");
		this.jButtonid_unidadCompoKit.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadCompoKit.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadCompoKit,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadCompoKit"));

		this.jButtonid_unidadCompoKitBusqueda= new JButtonMe();
		this.jButtonid_unidadCompoKitBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadCompoKitBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadCompoKitBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadCompoKitBusqueda.setText("U");
		this.jButtonid_unidadCompoKitBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadCompoKitBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadCompoKitBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadCompoKitBusqueda"));

		if(this.compokitSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadCompoKitBusqueda.setVisible(false);		}

		this.jButtonid_unidadCompoKitUpdate= new JButtonMe();
		this.jButtonid_unidadCompoKitUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadCompoKitUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadCompoKitUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadCompoKitUpdate.setText("U");
		this.jButtonid_unidadCompoKitUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadCompoKitUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadCompoKitUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadCompoKitUpdate"));



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
		//this.jInternalFrameDetalleCompoKit = new CompoKitBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Compo Kit DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCompoKit= new GridBagLayout();
		

		
		String sToolTipCompoKit="";
		sToolTipCompoKit=CompoKitConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCompoKit+="(Inventario.CompoKit)";
		}
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			sToolTipCompoKit+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCompoKit = new JButtonMe();
		this.jButtonModificarCompoKit = new JButtonMe();
        this.jButtonActualizarCompoKit = new JButtonMe();
        this.jButtonEliminarCompoKit = new JButtonMe();
        this.jButtonCancelarCompoKit = new JButtonMe();
        this.jButtonGuardarCambiosCompoKit = new JButtonMe();
		this.jButtonGuardarCambiosTablaCompoKit = new JButtonMe();
		this.jButtonCerrarCompoKit = new JButtonMe();
		
		this.jScrollPanelDatosCompoKit = new JScrollPane();   
        this.jScrollPanelDatosEdicionCompoKit = new JScrollPane();
		this.jScrollPanelDatosGeneralCompoKit = new JScrollPane();
				
		
		
		this.jPanelCamposCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Compo Kit";
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compo Kites" + this.sPath));
		} else {
			this.jScrollPanelDatosCompoKit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCompoKit.setName("jPanelCamposCompoKit"); 

		this.jPanelCamposOcultosCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCompoKit.setName("jPanelCamposOcultosCompoKit"); 

        this.jPanelAccionesCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCompoKit.setToolTipText("Acciones");
        this.jPanelAccionesCompoKit.setName("Acciones"); 

		this.jPanelAccionesFormularioCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCompoKit.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCompoKit.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCompoKit.setText("Nuevo");
		this.jButtonModificarCompoKit.setText("Editar");
        this.jButtonActualizarCompoKit.setText("Actualizar");
        this.jButtonEliminarCompoKit.setText("Eliminar");
        this.jButtonCancelarCompoKit.setText("Cancelar");
        this.jButtonGuardarCambiosCompoKit.setText("Guardar");
		this.jButtonGuardarCambiosTablaCompoKit.setText("Guardar");
		this.jButtonCerrarCompoKit.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCompoKit,"nuevo_button","Nuevo",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCompoKit,"modificar_button","Editar",this.compokitSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCompoKit,"actualizar_button","Actualizar",this.compokitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCompoKit,"eliminar_button","Eliminar",this.compokitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCompoKit,"cancelar_button","Cancelar",this.compokitSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCompoKit,"guardarcambios_button","Guardar",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCompoKit,"guardarcambiostabla_button","Guardar",this.compokitSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCompoKit,"cerrar_button","Salir",this.compokitSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCompoKit.setToolTipText("Nuevo"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCompoKit.setToolTipText("Editar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCompoKit.setToolTipText("Actualizar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCompoKit.setToolTipText("Eliminar)"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCompoKit.setToolTipText("Cancelar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCompoKit.setToolTipText("Guardar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCompoKit.setToolTipText("Guardar"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCompoKit.setToolTipText("Salir"+" "+CompoKitConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCompoKit";
		inputMap = this.jButtonNuevoCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCompoKit.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCompoKit"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCompoKit";
		inputMap = this.jButtonActualizarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCompoKit"));
		
		//ELIMINAR
		sMapKey = "EliminarCompoKit";
		inputMap = this.jButtonEliminarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCompoKit"));
		
		//CANCELAR	
		sMapKey = "CancelarCompoKit";
		inputMap = this.jButtonCancelarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCompoKit"));
		
		//CERRAR		
		sMapKey = "CerrarCompoKit";
		inputMap = this.jButtonCerrarCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCompoKit"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCompoKit";
		inputMap = this.jButtonGuardarCambiosTablaCompoKit.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCompoKit.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCompoKit"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCompoKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCompoKit.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCompoKit.setToolTipText("Nuevo CompoKit");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCompoKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCompoKit.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCompoKit.setToolTipText("Sin Cerrar Ventana CompoKit");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCompoKit = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCompoKit.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCompoKit.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCompoKit.setText("Accion");
		this.jComboBoxTiposAccionesCompoKit.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCompoKit = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCompoKit.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCompoKit.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCompoKit = new JLabelMe();
		
		this.jLabelAccionesCompoKit.setText("Acciones");		
		this.jLabelAccionesCompoKit.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompoKit.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompoKit.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCompoKit();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCompoKit();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCompoKit=new JTabbedPane();
		this.jTabbedPaneRelacionesCompoKit.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCompoKit,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCompoKit.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompoKit.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompoKit.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCompoKit, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCompoKit.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCompoKit.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCompoKit.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCompoKit, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCompoKit = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCompoKit = new GridBagLayout();
		
		this.jPanelCamposCompoKit.setLayout(gridaBagLayoutCamposCompoKit);
		this.jPanelCamposOcultosCompoKit.setLayout(gridaBagLayoutCamposOcultosCompoKit);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCompoKit.add(jLabelIdCompoKit, this.gridBagConstraintsCompoKit);



	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCompoKit.add(jLabelidCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCompoKit.add(jLabelid_empresaCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCompoKit.add(jButtonid_empresaCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCompoKit.add(jButtonid_empresaCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCompoKit.add(jComboBoxid_empresaCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCompoKit.add(jLabelid_sucursalCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCompoKit.add(jButtonid_sucursalCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCompoKit.add(jButtonid_sucursalCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCompoKit.add(jComboBoxid_sucursalCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaCompoKit.add(jLabelid_bodegaCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCompoKit.add(jButtonid_bodegaCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCompoKit.add(jButtonid_bodegaCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaCompoKit.add(jComboBoxid_bodegaCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoCompoKit.add(jLabelid_productoCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 2;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoCompoKit.add(jButtonid_productoCompoKit, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoCompoKit.add(jButtonid_productoCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 4;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoCompoKit.add(jButtonid_productoCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoCompoKit.add(jComboBoxid_productoCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_kitCompoKit.add(jLabelid_kitCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_kitCompoKit.add(jButtonid_kitCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_kitCompoKit.add(jButtonid_kitCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_kitCompoKit.add(jComboBoxid_kitCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadCompoKit.add(jLabelid_unidadCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadCompoKit.add(jButtonid_unidadCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 3;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadCompoKit.add(jButtonid_unidadCompoKitUpdate, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadCompoKit.add(jComboBoxid_unidadCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadCompoKit.add(jLabelcantidadCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadCompoKit.add(jButtoncantidadCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadCompoKit.add(jTextFieldcantidadCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ingresoCompoKit.add(jLabelvalor_ingresoCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ingresoCompoKit.add(jButtonvalor_ingresoCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ingresoCompoKit.add(jTextFieldvalor_ingresoCompoKit, this.gridBagConstraintsCompoKit);


	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 0;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCompoKit.add(jLabeldescripcionCompoKit, this.gridBagConstraintsCompoKit);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		//this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = 2;
		this.gridBagConstraintsCompoKit.ipadx = 0;
		this.gridBagConstraintsCompoKit.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCompoKit.add(jButtondescripcionCompoKitBusqueda, this.gridBagConstraintsCompoKit);
	}

	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompoKit.gridy = 0;
	this.gridBagConstraintsCompoKit.gridx = 1;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCompoKit.add(jscrollPanedescripcionCompoKit, this.gridBagConstraintsCompoKit);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelidCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelid_bodegaCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelid_productoCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelid_kitCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelid_unidadCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelcantidadCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPanelvalor_ingresoCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCompoKit.add(this.jPaneldescripcionCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposCompoKit % 1==0) {
		iXPanelCamposCompoKit=0;
		iYPanelCamposCompoKit++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposOcultosCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposOcultosCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCompoKit.add(this.jPanelid_empresaCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposOcultosCompoKit % 1==0) {
		iXPanelCamposOcultosCompoKit=0;
		iYPanelCamposOcultosCompoKit++;
	}
	this.gridBagConstraintsCompoKit = new GridBagConstraints();
	this.gridBagConstraintsCompoKit.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompoKit.gridy = iYPanelCamposOcultosCompoKit;
	this.gridBagConstraintsCompoKit.gridx = iXPanelCamposOcultosCompoKit++;
	this.gridBagConstraintsCompoKit.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompoKit.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCompoKit.add(this.jPanelid_sucursalCompoKit, this.gridBagConstraintsCompoKit);



	if(iXPanelCamposOcultosCompoKit % 1==0) {
		iXPanelCamposOcultosCompoKit=0;
		iYPanelCamposOcultosCompoKit++;
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
			
		GridBagLayout gridaBagLayoutAccionesCompoKit= new GridBagLayout();
		this.jPanelAccionesCompoKit.setLayout(gridaBagLayoutAccionesCompoKit);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCompoKit= new GridBagLayout();
		this.jPanelAccionesFormularioCompoKit.setLayout(gridaBagLayoutAccionesFormularioCompoKit);
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCompoKit.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCompoKit.add(this.jComboBoxTiposAccionesFormularioCompoKit, this.gridBagConstraintsCompoKit);

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCompoKit.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCompoKit.add(this.jCheckBoxPostAccionNuevoCompoKit, this.gridBagConstraintsCompoKit);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.compokitSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCompoKit.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCompoKit.add(this.jCheckBoxPostAccionSinCerrarCompoKit, this.gridBagConstraintsCompoKit);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.compokitSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCompoKit.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCompoKit.add(this.jCheckBoxPostAccionSinMensajeCompoKit, this.gridBagConstraintsCompoKit);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx = iPosXAccion++;
			
		this.jPanelAccionesCompoKit.add(this.jButtonModificarCompoKit, this.gridBagConstraintsCompoKit);							

		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompoKit.gridy = 0;
		this.gridBagConstraintsCompoKit.gridx =iPosXAccion++;
			
		this.jPanelAccionesCompoKit.add(this.jButtonEliminarCompoKit, this.gridBagConstraintsCompoKit);
		
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = 0;		
		this.gridBagConstraintsCompoKit.gridx = iPosXAccion++;
		
		this.jPanelAccionesCompoKit.add(this.jButtonActualizarCompoKit, this.gridBagConstraintsCompoKit);


		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = 0;		
		this.gridBagConstraintsCompoKit.gridx = iPosXAccion++;
		
		this.jPanelAccionesCompoKit.add(this.jButtonGuardarCambiosCompoKit, this.gridBagConstraintsCompoKit);	
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = 0;		
		this.gridBagConstraintsCompoKit.gridx =iPosXAccion++;
		
		this.jPanelAccionesCompoKit.add(this.jButtonCancelarCompoKit, this.gridBagConstraintsCompoKit);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCompoKit = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCompoKit);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.compokitSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCompoKit = new GridBagConstraints();						
			this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompoKit.gridx = 0;		
			//this.gridBagConstraintsCompoKit.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCompoKit.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCompoKit.gridx =0;
		this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCompoKit.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCompoKit, this.gridBagConstraintsCompoKit);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CompoKitJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCompoKit = new CompoKitBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Compo Kit DATOS");
			
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
			
	        //this.setTitle("[FOR] - Compo Kit DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Compo Kit Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CompoKitModel compokitModel=new CompoKitModel(this);
			
			//SI USARA CLASE INTERNA
			//CompoKitModel.CompoKitFocusTraversalPolicy compokitFocusTraversalPolicy = compokitModel.new CompoKitFocusTraversalPolicy(this);
			
			//compokitFocusTraversalPolicy.setcompokitJInternalFrame(this);
			
			this.setFocusTraversalPolicy(compokitModel);
			
			
			this.jContentPaneDetalleCompoKit = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCompoKit = new GridBagLayout();	
			this.jContentPaneDetalleCompoKit.setLayout(gridaBagLayoutDetalleCompoKit);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCompoKit = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCompoKit = new GridBagConstraints();
				this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCompoKit.gridx = 0;
					
				
				this.jContentPaneDetalleCompoKit.add(jTtoolBarDetalleCompoKit, gridBagConstraintsCompoKit);								
				
}
			
			this.jScrollPanelDatosEdicionCompoKit=   new JScrollPane(jContentPaneDetalleCompoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCompoKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompoKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompoKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCompoKit=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCompoKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompoKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompoKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCompoKit.gridx = 0;
	        
			this.jContentPaneDetalleCompoKit.add(jPanelCamposCompoKit, gridBagConstraintsCompoKit);
			
			
			
			
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
						&& compokitSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.compokitSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCompoKit= new GridBagConstraints();
						this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCompoKit.gridx = 0;
						this.jContentPaneDetalleCompoKit.add(this.jTabbedPaneRelacionesCompoKit, this.gridBagConstraintsCompoKit);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCompoKit.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCompoKit.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCompoKit = new GridBagConstraints();
					this.gridBagConstraintsCompoKit.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCompoKit.gridx = 0;
					
				
					this.jContentPaneDetalleCompoKit.add(jPanelCamposOcultosCompoKit, gridBagConstraintsCompoKit);
				
					this.jPanelCamposOcultosCompoKit.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCompoKit.gridx = 0;
	        this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCompoKit.add(this.jPanelAccionesFormularioCompoKit, this.gridBagConstraintsCompoKit);							
			
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
	        this.gridBagConstraintsCompoKit.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCompoKit.gridx = 0;
	        
			
			this.jContentPaneDetalleCompoKit.add(this.jPanelAccionesCompoKit, this.gridBagConstraintsCompoKit);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCompoKit);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCompoKit=   new JScrollPane(this.jPanelCamposCompoKit,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCompoKit.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompoKit.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompoKit.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCompoKit.gridx = 0;
			this.gridBagConstraintsCompoKit.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCompoKit.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCompoKit.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCompoKit, this.gridBagConstraintsCompoKit);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCompoKit.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCompoKit, this.gridBagConstraintsCompoKit);			
			
			this.gridBagConstraintsCompoKit = new GridBagConstraints();
			this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCompoKit.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCompoKit, this.gridBagConstraintsCompoKit);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCompoKit, this.gridBagConstraintsCompoKit);
			
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCompoKit, this.gridBagConstraintsCompoKit);
		
			
		this.gridBagConstraintsCompoKit = new GridBagConstraints();
		this.gridBagConstraintsCompoKit.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCompoKit.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCompoKit, this.gridBagConstraintsCompoKit);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCompoKit;//jContentPane;
		
		return jScrollPanelDatosEdicionCompoKit;
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
