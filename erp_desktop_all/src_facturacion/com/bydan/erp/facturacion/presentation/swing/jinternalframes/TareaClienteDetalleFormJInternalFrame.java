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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TareaClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TareaClienteDetalleFormJInternalFrame extends TareaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTareaCliente;
	
	protected JMenuBar jmenuBarDetalleTareaCliente;
	
	protected JMenu jmenuDetalleTareaCliente;
	protected JMenu jmenuDetalleArchivoTareaCliente;
	protected JMenu jmenuDetalleAccionesTareaCliente;
	protected JMenu jmenuDetalleDatosTareaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTareaCliente;	
	protected GridBagConstraints gridBagConstraintsTareaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TareaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTareaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public TareaClienteSessionBean tareaclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public TareaClienteLogic tareaclienteLogic;
	
	public JScrollPane jScrollPanelDatosTareaCliente;
	public JScrollPane jScrollPanelDatosEdicionTareaCliente;
	public JScrollPane jScrollPanelDatosGeneralTareaCliente;
	
	protected JPanel jPanelCamposTareaCliente;    
	protected JPanel jPanelCamposOcultosTareaCliente;    	
	protected JPanel jPanelAccionesTareaCliente;
	protected JPanel jPanelAccionesFormularioTareaCliente;
    
	
	
	protected Integer iXPanelCamposTareaCliente=0;
	protected Integer iYPanelCamposTareaCliente=0;
	
	protected Integer iXPanelCamposOcultosTareaCliente=0;
	protected Integer iYPanelCamposOcultosTareaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTareaCliente;
	public JButton jButtonModificarTareaCliente;
	public JButton jButtonActualizarTareaCliente;
    public JButton jButtonEliminarTareaCliente;
	public JButton jButtonCancelarTareaCliente;
    public JButton jButtonGuardarCambiosTareaCliente;
	public JButton jButtonGuardarCambiosTablaTareaCliente;
	protected JButton jButtonCerrarTareaCliente;
	
	
	protected JButton jButtonProcesarInformacionTareaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTareaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTareaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTareaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTareaCliente;
	protected JButton jButtonModificarToolBarTareaCliente;
	protected JButton jButtonActualizarToolBarTareaCliente;
    protected JButton jButtonEliminarToolBarTareaCliente;
	protected JButton jButtonCancelarToolBarTareaCliente;
    protected JButton jButtonGuardarCambiosToolBarTareaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTareaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTareaCliente;
	protected JButton jButtonCerrarToolBarTareaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTareaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTareaCliente;
	protected JMenuItem jMenuItemModificarTareaCliente;
	protected JMenuItem jMenuItemActualizarTareaCliente;
    protected JMenuItem jMenuItemEliminarTareaCliente;
	protected JMenuItem jMenuItemCancelarTareaCliente;
    protected JMenuItem jMenuItemGuardarCambiosTareaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTareaCliente;
	protected JMenuItem jMenuItemCerrarTareaCliente;
	protected JMenuItem jMenuItemDetalleCerrarTareaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTareaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTareaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTareaCliente;
	protected JMenuItem jMenuItemMostrarOcultarTareaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTareaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTareaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTareaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTareaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTareaCliente;
	public JLabel jLabelIdTareaCliente;
	public JLabel jLabelidTareaCliente;
	public JButton jButtonidTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelprecioTareaCliente;
	public JLabel jLabelprecioTareaCliente;
	public JTextField jTextFieldprecioTareaCliente;
	public JButton jButtonprecioTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_metrosTareaCliente;
	public JLabel jLabelnumero_metrosTareaCliente;
	public JTextField jTextFieldnumero_metrosTareaCliente;
	public JButton jButtonnumero_metrosTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_litrosTareaCliente;
	public JLabel jLabelnumero_litrosTareaCliente;
	public JTextField jTextFieldnumero_litrosTareaCliente;
	public JButton jButtonnumero_litrosTareaClienteBusqueda= new JButtonMe();

	public JPanel jPaneltareaTareaCliente;
	public JLabel jLabeltareaTareaCliente;
	public JTextArea jTextAreatareaTareaCliente;
	public JScrollPane jscrollPanetareaTareaCliente;
	public JButton jButtontareaTareaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTareaCliente;
	public JLabel jLabelid_empresaTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTareaCliente;
	public JButton jButtonid_empresaTareaCliente= new JButtonMe();
	public JButton jButtonid_empresaTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteTareaCliente;
	public JLabel jLabelid_clienteTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteTareaCliente;
	public JButton jButtonid_clienteTareaCliente= new JButtonMe();
	public JButton jButtonid_clienteTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaTareaCliente;
	public JLabel jLabelid_facturaTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaTareaCliente;
	public JButton jButtonid_facturaTareaCliente= new JButtonMe();
	public JButton jButtonid_facturaTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_facturaTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_productoTareaCliente;
	public JLabel jLabelid_productoTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoTareaCliente;
	public JButton jButtonid_productoTareaCliente= new JButtonMe();
	public JButton jButtonid_productoTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_productoTareaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadTareaCliente;
	public JLabel jLabelid_unidadTareaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadTareaCliente;
	public JButton jButtonid_unidadTareaCliente= new JButtonMe();
	public JButton jButtonid_unidadTareaClienteUpdate= new JButtonMe();
	public JButton jButtonid_unidadTareaClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTareaCliente;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TareaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTareaCliente=new JPanel();
				this.jPanelAccionesFormularioTareaCliente=new JPanel();
				this.jmenuBarDetalleTareaCliente=new JMenuBar();
				this.jTtoolBarDetalleTareaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TareaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TareaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TareaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTareaCliente() {
		return this.jButtonActualizarToolBarTareaCliente;
	}
	
	public JButton getjButtonEliminarToolBarTareaCliente() {
		return this.jButtonEliminarToolBarTareaCliente;
	}
	
	public JButton getjButtonCancelarToolBarTareaCliente() {
		return this.jButtonCancelarToolBarTareaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTareaCliente() {
		return this.jButtonProcesarInformacionTareaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTareaCliente)	{
		this.jButtonProcesarInformacionTareaCliente = jButtonProcesarInformacionTareaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTareaCliente() {
		return this.jComboBoxTiposAccionesTareaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTareaCliente(
			JComboBox jComboBoxTiposRelacionesTareaCliente) {
		this.jComboBoxTiposRelacionesTareaCliente = jComboBoxTiposRelacionesTareaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTareaCliente(
			JComboBox jComboBoxTiposAccionesTareaCliente) {
		this.jComboBoxTiposAccionesTareaCliente = jComboBoxTiposAccionesTareaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTareaCliente() {
		return this.jComboBoxTiposAccionesFormularioTareaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTareaCliente(
			JComboBox jComboBoxTiposAccionesFormularioTareaCliente) {
		this.jComboBoxTiposAccionesFormularioTareaCliente = jComboBoxTiposAccionesFormularioTareaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tareaclienteSessionBean=new TareaClienteSessionBean();
		
		this.tareaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tareaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tareaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TareaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TareaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarea Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TareaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTareaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTareaCliente=new JButtonMe();
				this.jButtonModificarToolBarTareaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTareaCliente,this.jTtoolBarDetalleTareaCliente,
							"actualizar","actualizar","Actualizar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTareaCliente,this.jTtoolBarDetalleTareaCliente,
							"eliminar","eliminar","Eliminar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTareaCliente,this.jTtoolBarDetalleTareaCliente,
							"cancelar","cancelar","Cancelar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTareaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTareaCliente,this.jTtoolBarDetalleTareaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTareaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTareaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTareaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTareaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTareaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTareaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTareaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTareaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTareaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTareaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTareaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTareaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTareaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTareaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTareaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTareaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTareaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTareaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTareaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTareaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTareaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTareaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTareaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTareaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTareaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTareaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTareaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTareaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTareaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTareaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTareaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTareaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTareaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTareaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTareaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTareaCliente.add(this.jMenuItemDetalleCerrarTareaCliente);
		
		this.jmenuDetalleAccionesTareaCliente.add(this.jMenuItemActualizarTareaCliente);
		this.jmenuDetalleAccionesTareaCliente.add(this.jMenuItemEliminarTareaCliente);
		this.jmenuDetalleAccionesTareaCliente.add(this.jMenuItemCancelarTareaCliente);		
		
		//this.jmenuDetalleDatosTareaCliente.add(this.jMenuItemDetalleAbrirOrderByTareaCliente);				
		this.jmenuDetalleDatosTareaCliente.add(this.jMenuItemDetalleMostarOcultarTareaCliente);				
				
		//this.jmenuDetalleAccionesTareaCliente.add(this.jMenuItemGuardarCambiosTareaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTareaCliente.add(this.jmenuDetalleArchivoTareaCliente);		
		this.jmenuBarDetalleTareaCliente.add(this.jmenuDetalleAccionesTareaCliente);		
		this.jmenuBarDetalleTareaCliente.add(this.jmenuDetalleDatosTareaCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTareaCliente);				
	}
	
	
	public void inicializarElementosCamposTareaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTareaCliente = new JLabelMe();
		jLabelIdTareaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTareaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTareaCliente= new GridBagLayout();

		this.jPanelidTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);

		jLabelidTareaCliente = new JLabel();
		jLabelidTareaCliente.setText("Id");

		jLabelidTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecioTareaCliente = new JLabelMe();
		this.jLabelprecioTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioTareaCliente.setToolTipText("Precio");
		this.jLabelprecioTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelprecioTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jTextFieldprecioTareaCliente= new JTextFieldMe();
		jTextFieldprecioTareaCliente.setEnabled(false);
		jTextFieldprecioTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioTareaCliente.setText("0.0");

		this.jButtonprecioTareaClienteBusqueda= new JButtonMe();
		this.jButtonprecioTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioTareaClienteBusqueda.setText("U");
		this.jButtonprecioTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioTareaClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_metrosTareaCliente = new JLabelMe();
		this.jLabelnumero_metrosTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_NUMEROMETROS+" : *");
		this.jLabelnumero_metrosTareaCliente.setToolTipText("Numero Metros");
		this.jLabelnumero_metrosTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_metrosTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_metrosTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_metrosTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_metrosTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_metrosTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_NUMEROMETROS);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelnumero_metrosTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jTextFieldnumero_metrosTareaCliente= new JTextFieldMe();
		jTextFieldnumero_metrosTareaCliente.setEnabled(false);
		jTextFieldnumero_metrosTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_metrosTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_metrosTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_metrosTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_metrosTareaCliente.setText("0.0");

		this.jButtonnumero_metrosTareaClienteBusqueda= new JButtonMe();
		this.jButtonnumero_metrosTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_metrosTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_metrosTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_metrosTareaClienteBusqueda.setText("U");
		this.jButtonnumero_metrosTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_metrosTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_metrosTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_metrosTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_metrosTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_metrosTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_metrosTareaClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_litrosTareaCliente = new JLabelMe();
		this.jLabelnumero_litrosTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_NUMEROLITROS+" : *");
		this.jLabelnumero_litrosTareaCliente.setToolTipText("Numero Litros");
		this.jLabelnumero_litrosTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_litrosTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_litrosTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_litrosTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_litrosTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_litrosTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_NUMEROLITROS);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelnumero_litrosTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jTextFieldnumero_litrosTareaCliente= new JTextFieldMe();
		jTextFieldnumero_litrosTareaCliente.setEnabled(false);
		jTextFieldnumero_litrosTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_litrosTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_litrosTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_litrosTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_litrosTareaCliente.setText("0.0");

		this.jButtonnumero_litrosTareaClienteBusqueda= new JButtonMe();
		this.jButtonnumero_litrosTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_litrosTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_litrosTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_litrosTareaClienteBusqueda.setText("U");
		this.jButtonnumero_litrosTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_litrosTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_litrosTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_litrosTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_litrosTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_litrosTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_litrosTareaClienteBusqueda.setVisible(false);		}


					
		this.jLabeltareaTareaCliente = new JLabelMe();
		this.jLabeltareaTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_TAREA+" : *");
		this.jLabeltareaTareaCliente.setToolTipText("Tarea");
		this.jLabeltareaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltareaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltareaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltareaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltareaTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltareaTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_TAREA);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPaneltareaTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jTextAreatareaTareaCliente= new JTextAreaMe();
		jTextAreatareaTareaCliente.setEnabled(false);
		jTextAreatareaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaTareaCliente.setLineWrap(true);
		jTextAreatareaTareaCliente.setWrapStyleWord(true);
		jTextAreatareaTareaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatareaTareaCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreatareaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetareaTareaCliente = new JScrollPane(jTextAreatareaTareaCliente);
		jscrollPanetareaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetareaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetareaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontareaTareaClienteBusqueda= new JButtonMe();
		this.jButtontareaTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontareaTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontareaTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontareaTareaClienteBusqueda.setText("U");
		this.jButtontareaTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontareaTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontareaTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatareaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatareaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tareaTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontareaTareaClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTareaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTareaCliente = new JLabelMe();
		this.jLabelid_empresaTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTareaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelid_empresaTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jComboBoxid_empresaTareaCliente= new JComboBoxMe();
		jComboBoxid_empresaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTareaCliente.setEnabled(false);

		this.jButtonid_empresaTareaCliente= new JButtonMe();
		this.jButtonid_empresaTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTareaCliente.setText("Buscar");
		this.jButtonid_empresaTareaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTareaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTareaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTareaCliente"));

		this.jButtonid_empresaTareaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTareaClienteBusqueda.setText("U");
		this.jButtonid_empresaTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTareaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTareaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaTareaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTareaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTareaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTareaClienteUpdate.setText("U");
		this.jButtonid_empresaTareaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTareaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTareaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTareaClienteUpdate"));



					
		this.jLabelid_clienteTareaCliente = new JLabelMe();
		this.jLabelid_clienteTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteTareaCliente.setToolTipText("Cliente");
		this.jLabelid_clienteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelid_clienteTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jComboBoxid_clienteTareaCliente= new JComboBoxMe();
		jComboBoxid_clienteTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteTareaCliente= new JButtonMe();
		this.jButtonid_clienteTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTareaCliente.setText("Buscar");
		this.jButtonid_clienteTareaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteTareaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTareaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTareaCliente"));

		this.jButtonid_clienteTareaClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTareaClienteBusqueda.setText("U");
		this.jButtonid_clienteTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteTareaClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteTareaClienteUpdate= new JButtonMe();
		this.jButtonid_clienteTareaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTareaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTareaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTareaClienteUpdate.setText("U");
		this.jButtonid_clienteTareaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteTareaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTareaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTareaClienteUpdate"));



					
		this.jLabelid_facturaTareaCliente = new JLabelMe();
		this.jLabelid_facturaTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaTareaCliente.setToolTipText("Factura");
		this.jLabelid_facturaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelid_facturaTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jComboBoxid_facturaTareaCliente= new JComboBoxMe();
		jComboBoxid_facturaTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaTareaCliente= new JButtonMe();
		this.jButtonid_facturaTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTareaCliente.setText("Buscar");
		this.jButtonid_facturaTareaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaTareaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTareaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTareaCliente"));

		this.jButtonid_facturaTareaClienteBusqueda= new JButtonMe();
		this.jButtonid_facturaTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTareaClienteBusqueda.setText("U");
		this.jButtonid_facturaTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaTareaClienteBusqueda.setVisible(false);		}

		this.jButtonid_facturaTareaClienteUpdate= new JButtonMe();
		this.jButtonid_facturaTareaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTareaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTareaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTareaClienteUpdate.setText("U");
		this.jButtonid_facturaTareaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaTareaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTareaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTareaClienteUpdate"));



					
		this.jLabelid_productoTareaCliente = new JLabelMe();
		this.jLabelid_productoTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoTareaCliente.setToolTipText("Producto");
		this.jLabelid_productoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelid_productoTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jComboBoxid_productoTareaCliente= new JComboBoxMe();
		jComboBoxid_productoTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoTareaCliente= new JButtonMe();
		this.jButtonid_productoTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoTareaCliente.setText("Buscar");
		this.jButtonid_productoTareaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoTareaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTareaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTareaCliente"));

		this.jButtonid_productoTareaClienteBusqueda= new JButtonMe();
		this.jButtonid_productoTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoTareaClienteBusqueda.setText("U");
		this.jButtonid_productoTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoTareaClienteBusqueda.setVisible(false);		}

		this.jButtonid_productoTareaClienteUpdate= new JButtonMe();
		this.jButtonid_productoTareaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTareaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoTareaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoTareaClienteUpdate.setText("U");
		this.jButtonid_productoTareaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoTareaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoTareaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoTareaClienteUpdate"));



					
		this.jLabelid_unidadTareaCliente = new JLabelMe();
		this.jLabelid_unidadTareaCliente.setText(""+TareaClienteConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadTareaCliente.setToolTipText("Unad");
		this.jLabelid_unidadTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadTareaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadTareaCliente.setToolTipText(TareaClienteConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutTareaCliente = new GridBagLayout();
		this.jPanelid_unidadTareaCliente.setLayout(this.gridaBagLayoutTareaCliente);


		jComboBoxid_unidadTareaCliente= new JComboBoxMe();
		jComboBoxid_unidadTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadTareaCliente= new JButtonMe();
		this.jButtonid_unidadTareaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadTareaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadTareaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadTareaCliente.setText("Buscar");
		this.jButtonid_unidadTareaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadTareaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadTareaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadTareaCliente"));

		this.jButtonid_unidadTareaClienteBusqueda= new JButtonMe();
		this.jButtonid_unidadTareaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadTareaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadTareaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadTareaClienteBusqueda.setText("U");
		this.jButtonid_unidadTareaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadTareaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadTareaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadTareaClienteBusqueda"));

		if(this.tareaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadTareaClienteBusqueda.setVisible(false);		}

		this.jButtonid_unidadTareaClienteUpdate= new JButtonMe();
		this.jButtonid_unidadTareaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadTareaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadTareaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadTareaClienteUpdate.setText("U");
		this.jButtonid_unidadTareaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadTareaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadTareaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadTareaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadTareaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadTareaClienteUpdate"));



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
		//this.jInternalFrameDetalleTareaCliente = new TareaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tarea Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTareaCliente= new GridBagLayout();
		

		
		String sToolTipTareaCliente="";
		sToolTipTareaCliente=TareaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTareaCliente+="(Facturacion.TareaCliente)";
		}
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTareaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTareaCliente = new JButtonMe();
		this.jButtonModificarTareaCliente = new JButtonMe();
        this.jButtonActualizarTareaCliente = new JButtonMe();
        this.jButtonEliminarTareaCliente = new JButtonMe();
        this.jButtonCancelarTareaCliente = new JButtonMe();
        this.jButtonGuardarCambiosTareaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTareaCliente = new JButtonMe();
		this.jButtonCerrarTareaCliente = new JButtonMe();
		
		this.jScrollPanelDatosTareaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTareaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTareaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tarea Cliente";
		
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarea Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTareaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTareaCliente.setName("jPanelCamposTareaCliente"); 

		this.jPanelCamposOcultosTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTareaCliente.setName("jPanelCamposOcultosTareaCliente"); 

        this.jPanelAccionesTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTareaCliente.setToolTipText("Acciones");
        this.jPanelAccionesTareaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTareaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTareaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTareaCliente.setText("Nuevo");
		this.jButtonModificarTareaCliente.setText("Editar");
        this.jButtonActualizarTareaCliente.setText("Actualizar");
        this.jButtonEliminarTareaCliente.setText("Eliminar");
        this.jButtonCancelarTareaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTareaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTareaCliente.setText("Guardar");
		this.jButtonCerrarTareaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTareaCliente,"nuevo_button","Nuevo",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTareaCliente,"modificar_button","Editar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTareaCliente,"actualizar_button","Actualizar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTareaCliente,"eliminar_button","Eliminar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTareaCliente,"cancelar_button","Cancelar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTareaCliente,"guardarcambios_button","Guardar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTareaCliente,"guardarcambiostabla_button","Guardar",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTareaCliente,"cerrar_button","Salir",this.tareaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTareaCliente.setToolTipText("Nuevo"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTareaCliente.setToolTipText("Editar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTareaCliente.setToolTipText("Actualizar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTareaCliente.setToolTipText("Eliminar)"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTareaCliente.setToolTipText("Cancelar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTareaCliente.setToolTipText("Guardar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTareaCliente.setToolTipText("Guardar"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTareaCliente.setToolTipText("Salir"+" "+TareaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTareaCliente";
		inputMap = this.jButtonNuevoTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTareaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTareaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTareaCliente";
		inputMap = this.jButtonActualizarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTareaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTareaCliente";
		inputMap = this.jButtonEliminarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTareaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTareaCliente";
		inputMap = this.jButtonCancelarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTareaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTareaCliente";
		inputMap = this.jButtonCerrarTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTareaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTareaCliente";
		inputMap = this.jButtonGuardarCambiosTablaTareaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTareaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTareaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTareaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTareaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTareaCliente.setToolTipText("Nuevo TareaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTareaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTareaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTareaCliente.setToolTipText("Sin Cerrar Ventana TareaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTareaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTareaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTareaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTareaCliente.setText("Accion");
		this.jComboBoxTiposAccionesTareaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTareaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTareaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTareaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTareaCliente = new JLabelMe();
		
		this.jLabelAccionesTareaCliente.setText("Acciones");		
		this.jLabelAccionesTareaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTareaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTareaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTareaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTareaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTareaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTareaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTareaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTareaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTareaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTareaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTareaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTareaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTareaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTareaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTareaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTareaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTareaCliente = new GridBagLayout();
		
		this.jPanelCamposTareaCliente.setLayout(gridaBagLayoutCamposTareaCliente);
		this.jPanelCamposOcultosTareaCliente.setLayout(gridaBagLayoutCamposOcultosTareaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTareaCliente.add(jLabelIdTareaCliente, this.gridBagConstraintsTareaCliente);



	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTareaCliente.add(jLabelidTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTareaCliente.add(jLabelid_empresaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTareaCliente.add(jButtonid_empresaTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 3;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTareaCliente.add(jButtonid_empresaTareaClienteUpdate, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTareaCliente.add(jComboBoxid_empresaTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteTareaCliente.add(jLabelid_clienteTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 2;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteTareaCliente.add(jButtonid_clienteTareaCliente, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 3;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTareaCliente.add(jButtonid_clienteTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 4;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTareaCliente.add(jButtonid_clienteTareaClienteUpdate, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteTareaCliente.add(jComboBoxid_clienteTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaTareaCliente.add(jLabelid_facturaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 2;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaTareaCliente.add(jButtonid_facturaTareaCliente, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 3;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTareaCliente.add(jButtonid_facturaTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 4;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTareaCliente.add(jButtonid_facturaTareaClienteUpdate, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaTareaCliente.add(jComboBoxid_facturaTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoTareaCliente.add(jLabelid_productoTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 2;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoTareaCliente.add(jButtonid_productoTareaCliente, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 3;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoTareaCliente.add(jButtonid_productoTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 4;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoTareaCliente.add(jButtonid_productoTareaClienteUpdate, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoTareaCliente.add(jComboBoxid_productoTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadTareaCliente.add(jLabelid_unidadTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadTareaCliente.add(jButtonid_unidadTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 3;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadTareaCliente.add(jButtonid_unidadTareaClienteUpdate, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadTareaCliente.add(jComboBoxid_unidadTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioTareaCliente.add(jLabelprecioTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioTareaCliente.add(jButtonprecioTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioTareaCliente.add(jTextFieldprecioTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_metrosTareaCliente.add(jLabelnumero_metrosTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_metrosTareaCliente.add(jButtonnumero_metrosTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_metrosTareaCliente.add(jTextFieldnumero_metrosTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_litrosTareaCliente.add(jLabelnumero_litrosTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_litrosTareaCliente.add(jButtonnumero_litrosTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_litrosTareaCliente.add(jTextFieldnumero_litrosTareaCliente, this.gridBagConstraintsTareaCliente);


	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 0;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltareaTareaCliente.add(jLabeltareaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		//this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = 2;
		this.gridBagConstraintsTareaCliente.ipadx = 0;
		this.gridBagConstraintsTareaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltareaTareaCliente.add(jButtontareaTareaClienteBusqueda, this.gridBagConstraintsTareaCliente);
	}

	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTareaCliente.gridy = 0;
	this.gridBagConstraintsTareaCliente.gridx = 1;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltareaTareaCliente.add(jscrollPanetareaTareaCliente, this.gridBagConstraintsTareaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelidTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelid_clienteTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelid_facturaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelid_productoTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelid_unidadTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelprecioTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelnumero_metrosTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPanelnumero_litrosTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTareaCliente.add(this.jPaneltareaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposTareaCliente % 1==0) {
		iXPanelCamposTareaCliente=0;
		iYPanelCamposTareaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTareaCliente.gridy = iYPanelCamposOcultosTareaCliente;
	this.gridBagConstraintsTareaCliente.gridx = iXPanelCamposOcultosTareaCliente++;
	this.gridBagConstraintsTareaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTareaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTareaCliente.add(this.jPanelid_empresaTareaCliente, this.gridBagConstraintsTareaCliente);



	if(iXPanelCamposOcultosTareaCliente % 1==0) {
		iXPanelCamposOcultosTareaCliente=0;
		iYPanelCamposOcultosTareaCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTareaCliente= new GridBagLayout();
		this.jPanelAccionesTareaCliente.setLayout(gridaBagLayoutAccionesTareaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTareaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTareaCliente.setLayout(gridaBagLayoutAccionesFormularioTareaCliente);
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTareaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTareaCliente.add(this.jComboBoxTiposAccionesFormularioTareaCliente, this.gridBagConstraintsTareaCliente);

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTareaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTareaCliente.add(this.jCheckBoxPostAccionNuevoTareaCliente, this.gridBagConstraintsTareaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTareaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTareaCliente.add(this.jCheckBoxPostAccionSinCerrarTareaCliente, this.gridBagConstraintsTareaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tareaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tareaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTareaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTareaCliente.add(this.jCheckBoxPostAccionSinMensajeTareaCliente, this.gridBagConstraintsTareaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTareaCliente.add(this.jButtonModificarTareaCliente, this.gridBagConstraintsTareaCliente);							

		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTareaCliente.gridy = 0;
		this.gridBagConstraintsTareaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTareaCliente.add(this.jButtonEliminarTareaCliente, this.gridBagConstraintsTareaCliente);
		
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = 0;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTareaCliente.add(this.jButtonActualizarTareaCliente, this.gridBagConstraintsTareaCliente);


		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = 0;		
		this.gridBagConstraintsTareaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTareaCliente.add(this.jButtonGuardarCambiosTareaCliente, this.gridBagConstraintsTareaCliente);	
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = 0;		
		this.gridBagConstraintsTareaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTareaCliente.add(this.jButtonCancelarTareaCliente, this.gridBagConstraintsTareaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTareaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTareaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tareaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();						
			this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTareaCliente.gridx = 0;		
			//this.gridBagConstraintsTareaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTareaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTareaCliente.gridx =0;
		this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTareaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTareaCliente, this.gridBagConstraintsTareaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TareaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTareaCliente = new TareaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tarea Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tarea Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarea Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TareaClienteModel tareaclienteModel=new TareaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TareaClienteModel.TareaClienteFocusTraversalPolicy tareaclienteFocusTraversalPolicy = tareaclienteModel.new TareaClienteFocusTraversalPolicy(this);
			
			//tareaclienteFocusTraversalPolicy.settareaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tareaclienteModel);
			
			
			this.jContentPaneDetalleTareaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTareaCliente = new GridBagLayout();	
			this.jContentPaneDetalleTareaCliente.setLayout(gridaBagLayoutDetalleTareaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTareaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTareaCliente = new GridBagConstraints();
				this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTareaCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTareaCliente.add(jTtoolBarDetalleTareaCliente, gridBagConstraintsTareaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTareaCliente=   new JScrollPane(jContentPaneDetalleTareaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTareaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTareaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTareaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTareaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTareaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTareaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTareaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTareaCliente.gridx = 0;
	        
			this.jContentPaneDetalleTareaCliente.add(jPanelCamposTareaCliente, gridBagConstraintsTareaCliente);
			
			
			
			
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
						&& tareaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tareaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTareaCliente= new GridBagConstraints();
						this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTareaCliente.gridx = 0;
						this.jContentPaneDetalleTareaCliente.add(this.jTabbedPaneRelacionesTareaCliente, this.gridBagConstraintsTareaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTareaCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTareaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTareaCliente = new GridBagConstraints();
					this.gridBagConstraintsTareaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTareaCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTareaCliente.add(jPanelCamposOcultosTareaCliente, gridBagConstraintsTareaCliente);
				
					this.jPanelCamposOcultosTareaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTareaCliente.gridx = 0;
	        this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTareaCliente.add(this.jPanelAccionesFormularioTareaCliente, this.gridBagConstraintsTareaCliente);							
			
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
	        this.gridBagConstraintsTareaCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTareaCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTareaCliente.add(this.jPanelAccionesTareaCliente, this.gridBagConstraintsTareaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTareaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTareaCliente=   new JScrollPane(this.jPanelCamposTareaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTareaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTareaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTareaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTareaCliente.gridx = 0;
			this.gridBagConstraintsTareaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTareaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTareaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTareaCliente, this.gridBagConstraintsTareaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTareaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTareaCliente, this.gridBagConstraintsTareaCliente);			
			
			this.gridBagConstraintsTareaCliente = new GridBagConstraints();
			this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTareaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTareaCliente, this.gridBagConstraintsTareaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTareaCliente, this.gridBagConstraintsTareaCliente);
			
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTareaCliente, this.gridBagConstraintsTareaCliente);
		
			
		this.gridBagConstraintsTareaCliente = new GridBagConstraints();
		this.gridBagConstraintsTareaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTareaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTareaCliente, this.gridBagConstraintsTareaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTareaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTareaCliente;
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
