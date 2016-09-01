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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.DetalleDescuenPoliVentaConstantesFunciones;

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
public class DetalleDescuenPoliVentaDetalleFormJInternalFrame extends DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleDescuenPoliVenta;
	
	protected JMenuBar jmenuBarDetalleDetalleDescuenPoliVenta;
	
	protected JMenu jmenuDetalleDetalleDescuenPoliVenta;
	protected JMenu jmenuDetalleArchivoDetalleDescuenPoliVenta;
	protected JMenu jmenuDetalleAccionesDetalleDescuenPoliVenta;
	protected JMenu jmenuDetalleDatosDetalleDescuenPoliVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleDescuenPoliVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleDescuenPoliVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleDescuenPoliVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public DetalleDescuenPoliVentaSessionBean detalledescuenpoliventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public DetalleDescuenPoliVentaLogic detalledescuenpoliventaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleDescuenPoliVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleDescuenPoliVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleDescuenPoliVenta;
	
	protected JPanel jPanelCamposDetalleDescuenPoliVenta;    
	protected JPanel jPanelCamposOcultosDetalleDescuenPoliVenta;    	
	protected JPanel jPanelAccionesDetalleDescuenPoliVenta;
	protected JPanel jPanelAccionesFormularioDetalleDescuenPoliVenta;
    
	
	
	protected Integer iXPanelCamposDetalleDescuenPoliVenta=0;
	protected Integer iYPanelCamposDetalleDescuenPoliVenta=0;
	
	protected Integer iXPanelCamposOcultosDetalleDescuenPoliVenta=0;
	protected Integer iYPanelCamposOcultosDetalleDescuenPoliVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleDescuenPoliVenta;
	public JButton jButtonModificarDetalleDescuenPoliVenta;
	public JButton jButtonActualizarDetalleDescuenPoliVenta;
    public JButton jButtonEliminarDetalleDescuenPoliVenta;
	public JButton jButtonCancelarDetalleDescuenPoliVenta;
    public JButton jButtonGuardarCambiosDetalleDescuenPoliVenta;
	public JButton jButtonGuardarCambiosTablaDetalleDescuenPoliVenta;
	protected JButton jButtonCerrarDetalleDescuenPoliVenta;
	
	
	protected JButton jButtonProcesarInformacionDetalleDescuenPoliVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonModificarToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonActualizarToolBarDetalleDescuenPoliVenta;
    protected JButton jButtonEliminarToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonCancelarToolBarDetalleDescuenPoliVenta;
    protected JButton jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonCerrarToolBarDetalleDescuenPoliVenta;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleDescuenPoliVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemModificarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemActualizarDetalleDescuenPoliVenta;
    protected JMenuItem jMenuItemEliminarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemCancelarDetalleDescuenPoliVenta;
    protected JMenuItem jMenuItemGuardarCambiosDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemCerrarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleDescuenPoliVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleDescuenPoliVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleDescuenPoliVenta;
	public JLabel jLabelIdDetalleDescuenPoliVenta;
	public JLabel jLabelidDetalleDescuenPoliVenta;
	public JButton jButtonidDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleDescuenPoliVenta;
	public JLabel jLabelvalorDetalleDescuenPoliVenta;
	public JTextField jTextFieldvalorDetalleDescuenPoliVenta;
	public JButton jButtonvalorDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleDescuenPoliVenta;
	public JLabel jLabeldescripcionDetalleDescuenPoliVenta;
	public JTextArea jTextAreadescripcionDetalleDescuenPoliVenta;
	public JScrollPane jscrollPanedescripcionDetalleDescuenPoliVenta;
	public JButton jButtondescripcionDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleDescuenPoliVenta;
	public JLabel jLabelid_empresaDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleDescuenPoliVenta;
	public JButton jButtonid_empresaDetalleDescuenPoliVenta= new JButtonMe();
	public JButton jButtonid_empresaDetalleDescuenPoliVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleDescuenPoliVenta;
	public JLabel jLabelid_sucursalDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleDescuenPoliVenta;
	public JButton jButtonid_sucursalDetalleDescuenPoliVenta= new JButtonMe();
	public JButton jButtonid_sucursalDetalleDescuenPoliVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleDescuenPoliVenta;
	public JLabel jLabelid_clienteDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleDescuenPoliVenta;
	public JButton jButtonid_clienteDetalleDescuenPoliVenta= new JButtonMe();
	public JButton jButtonid_clienteDetalleDescuenPoliVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleDescuenPoliVenta;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleDescuenPoliVenta=new JPanel();
				this.jPanelAccionesFormularioDetalleDescuenPoliVenta=new JPanel();
				this.jmenuBarDetalleDetalleDescuenPoliVenta=new JMenuBar();
				this.jTtoolBarDetalleDetalleDescuenPoliVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleDescuenPoliVenta() {
		return this.jButtonActualizarToolBarDetalleDescuenPoliVenta;
	}
	
	public JButton getjButtonEliminarToolBarDetalleDescuenPoliVenta() {
		return this.jButtonEliminarToolBarDetalleDescuenPoliVenta;
	}
	
	public JButton getjButtonCancelarToolBarDetalleDescuenPoliVenta() {
		return this.jButtonCancelarToolBarDetalleDescuenPoliVenta;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleDescuenPoliVenta() {
		return this.jButtonProcesarInformacionDetalleDescuenPoliVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleDescuenPoliVenta)	{
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta = jButtonProcesarInformacionDetalleDescuenPoliVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposRelacionesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta = jComboBoxTiposRelacionesDetalleDescuenPoliVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposAccionesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta = jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta) {
		this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta = jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		
		this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledescuenpoliventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleDescuenPoliVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Descuen Poli Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleDescuenPoliVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleDescuenPoliVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleDescuenPoliVenta=new JButtonMe();
				this.jButtonModificarToolBarDetalleDescuenPoliVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta,
							"actualizar","actualizar","Actualizar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta,
							"eliminar","eliminar","Eliminar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta,
							"cancelar","cancelar","Cancelar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleDescuenPoliVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleDescuenPoliVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleDescuenPoliVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleDescuenPoliVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleDescuenPoliVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleDescuenPoliVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleDescuenPoliVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleDescuenPoliVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleDescuenPoliVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleDescuenPoliVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleDescuenPoliVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleDescuenPoliVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleDescuenPoliVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleDescuenPoliVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleDescuenPoliVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleDescuenPoliVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleDescuenPoliVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleDescuenPoliVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleDescuenPoliVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleDescuenPoliVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleDescuenPoliVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleDescuenPoliVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleDescuenPoliVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleDescuenPoliVenta.add(this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta);
		
		this.jmenuDetalleAccionesDetalleDescuenPoliVenta.add(this.jMenuItemActualizarDetalleDescuenPoliVenta);
		this.jmenuDetalleAccionesDetalleDescuenPoliVenta.add(this.jMenuItemEliminarDetalleDescuenPoliVenta);
		this.jmenuDetalleAccionesDetalleDescuenPoliVenta.add(this.jMenuItemCancelarDetalleDescuenPoliVenta);		
		
		//this.jmenuDetalleDatosDetalleDescuenPoliVenta.add(this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta);				
		this.jmenuDetalleDatosDetalleDescuenPoliVenta.add(this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta);				
				
		//this.jmenuDetalleAccionesDetalleDescuenPoliVenta.add(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleDescuenPoliVenta.add(this.jmenuDetalleArchivoDetalleDescuenPoliVenta);		
		this.jmenuBarDetalleDetalleDescuenPoliVenta.add(this.jmenuDetalleAccionesDetalleDescuenPoliVenta);		
		this.jmenuBarDetalleDetalleDescuenPoliVenta.add(this.jmenuDetalleDatosDetalleDescuenPoliVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleDescuenPoliVenta);				
	}
	
	
	public void inicializarElementosCamposDetalleDescuenPoliVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleDescuenPoliVenta = new JLabelMe();
		jLabelIdDetalleDescuenPoliVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleDescuenPoliVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleDescuenPoliVenta= new GridBagLayout();

		this.jPanelidDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);

		jLabelidDetalleDescuenPoliVenta = new JLabel();
		jLabelidDetalleDescuenPoliVenta.setText("Id");

		jLabelidDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetalleDescuenPoliVenta = new JLabelMe();
		this.jLabelvalorDetalleDescuenPoliVenta.setText(""+DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleDescuenPoliVenta.setToolTipText("Valor");
		this.jLabelvalorDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		this.jPanelvalorDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);


		jTextFieldvalorDetalleDescuenPoliVenta= new JTextFieldMe();
		jTextFieldvalorDetalleDescuenPoliVenta.setEnabled(false);
		jTextFieldvalorDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleDescuenPoliVenta.setText("0.0");

		this.jButtonvalorDetalleDescuenPoliVentaBusqueda= new JButtonMe();
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setText("U");
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleDescuenPoliVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleDescuenPoliVentaBusqueda"));

		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleDescuenPoliVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleDescuenPoliVenta = new JLabelMe();
		this.jLabeldescripcionDetalleDescuenPoliVenta.setText(""+DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleDescuenPoliVenta.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		this.jPaneldescripcionDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);


		jTextAreadescripcionDetalleDescuenPoliVenta= new JTextAreaMe();
		jTextAreadescripcionDetalleDescuenPoliVenta.setEnabled(false);
		jTextAreadescripcionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleDescuenPoliVenta.setLineWrap(true);
		jTextAreadescripcionDetalleDescuenPoliVenta.setWrapStyleWord(true);
		jTextAreadescripcionDetalleDescuenPoliVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleDescuenPoliVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleDescuenPoliVenta = new JScrollPane(jTextAreadescripcionDetalleDescuenPoliVenta);
		jscrollPanedescripcionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setText("U");
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleDescuenPoliVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleDescuenPoliVentaBusqueda"));

		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleDescuenPoliVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleDescuenPoliVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleDescuenPoliVenta = new JLabelMe();
		this.jLabelid_empresaDetalleDescuenPoliVenta.setText(""+DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleDescuenPoliVenta.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		this.jPanelid_empresaDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);


		jComboBoxid_empresaDetalleDescuenPoliVenta= new JComboBoxMe();
		jComboBoxid_empresaDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleDescuenPoliVenta.setEnabled(false);

		this.jButtonid_empresaDetalleDescuenPoliVenta= new JButtonMe();
		this.jButtonid_empresaDetalleDescuenPoliVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDescuenPoliVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDescuenPoliVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDescuenPoliVenta.setText("Buscar");
		this.jButtonid_empresaDetalleDescuenPoliVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleDescuenPoliVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDescuenPoliVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDescuenPoliVenta"));

		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setText("U");
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDescuenPoliVentaBusqueda"));

		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setText("U");
		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleDescuenPoliVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDescuenPoliVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDescuenPoliVentaUpdate"));



					
		this.jLabelid_sucursalDetalleDescuenPoliVenta = new JLabelMe();
		this.jLabelid_sucursalDetalleDescuenPoliVenta.setText(""+DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleDescuenPoliVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		this.jPanelid_sucursalDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);


		jComboBoxid_sucursalDetalleDescuenPoliVenta= new JComboBoxMe();
		jComboBoxid_sucursalDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleDescuenPoliVenta.setEnabled(false);

		this.jButtonid_sucursalDetalleDescuenPoliVenta= new JButtonMe();
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setText("Buscar");
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleDescuenPoliVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleDescuenPoliVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleDescuenPoliVenta"));

		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleDescuenPoliVentaBusqueda"));

		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setText("U");
		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleDescuenPoliVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleDescuenPoliVentaUpdate"));



					
		this.jLabelid_clienteDetalleDescuenPoliVenta = new JLabelMe();
		this.jLabelid_clienteDetalleDescuenPoliVenta.setText(""+DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleDescuenPoliVenta.setToolTipText("Cliente");
		this.jLabelid_clienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleDescuenPoliVenta.setToolTipText(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		this.jPanelid_clienteDetalleDescuenPoliVenta.setLayout(this.gridaBagLayoutDetalleDescuenPoliVenta);


		jComboBoxid_clienteDetalleDescuenPoliVenta= new JComboBoxMe();
		jComboBoxid_clienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleDescuenPoliVenta= new JButtonMe();
		this.jButtonid_clienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleDescuenPoliVenta.setText("Buscar");
		this.jButtonid_clienteDetalleDescuenPoliVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleDescuenPoliVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleDescuenPoliVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleDescuenPoliVenta"));

		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setText("U");
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleDescuenPoliVentaBusqueda"));

		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setText("U");
		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleDescuenPoliVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleDescuenPoliVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleDescuenPoliVentaUpdate"));



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
		//this.jInternalFrameDetalleDetalleDescuenPoliVenta = new DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Descuen Poli Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleDescuenPoliVenta= new GridBagLayout();
		

		
		String sToolTipDetalleDescuenPoliVenta="";
		sToolTipDetalleDescuenPoliVenta=DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleDescuenPoliVenta+="(Facturacion.DetalleDescuenPoliVenta)";
		}
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleDescuenPoliVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonModificarDetalleDescuenPoliVenta = new JButtonMe();
        this.jButtonActualizarDetalleDescuenPoliVenta = new JButtonMe();
        this.jButtonEliminarDetalleDescuenPoliVenta = new JButtonMe();
        this.jButtonCancelarDetalleDescuenPoliVenta = new JButtonMe();
        this.jButtonGuardarCambiosDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonCerrarDetalleDescuenPoliVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleDescuenPoliVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Descuen Poli Venta";
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleDescuenPoliVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleDescuenPoliVenta.setName("jPanelCamposDetalleDescuenPoliVenta"); 

		this.jPanelCamposOcultosDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleDescuenPoliVenta.setName("jPanelCamposOcultosDetalleDescuenPoliVenta"); 

        this.jPanelAccionesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleDescuenPoliVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleDescuenPoliVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleDescuenPoliVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleDescuenPoliVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleDescuenPoliVenta.setText("Nuevo");
		this.jButtonModificarDetalleDescuenPoliVenta.setText("Editar");
        this.jButtonActualizarDetalleDescuenPoliVenta.setText("Actualizar");
        this.jButtonEliminarDetalleDescuenPoliVenta.setText("Eliminar");
        this.jButtonCancelarDetalleDescuenPoliVenta.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleDescuenPoliVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setText("Guardar");
		this.jButtonCerrarDetalleDescuenPoliVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleDescuenPoliVenta,"nuevo_button","Nuevo",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleDescuenPoliVenta,"modificar_button","Editar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleDescuenPoliVenta,"actualizar_button","Actualizar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleDescuenPoliVenta,"eliminar_button","Eliminar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleDescuenPoliVenta,"cancelar_button","Cancelar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleDescuenPoliVenta,"guardarcambios_button","Guardar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta,"guardarcambiostabla_button","Guardar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleDescuenPoliVenta,"cerrar_button","Salir",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleDescuenPoliVenta.setToolTipText("Nuevo"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleDescuenPoliVenta.setToolTipText("Editar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleDescuenPoliVenta.setToolTipText("Actualizar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleDescuenPoliVenta.setToolTipText("Eliminar)"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleDescuenPoliVenta.setToolTipText("Cancelar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleDescuenPoliVenta.setToolTipText("Guardar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setToolTipText("Guardar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleDescuenPoliVenta.setToolTipText("Salir"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleDescuenPoliVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleDescuenPoliVenta";
		inputMap = this.jButtonActualizarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleDescuenPoliVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleDescuenPoliVenta";
		inputMap = this.jButtonEliminarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleDescuenPoliVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCancelarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleDescuenPoliVenta"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCerrarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleDescuenPoliVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleDescuenPoliVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleDescuenPoliVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta.setToolTipText("Nuevo DetalleDescuenPoliVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta.setToolTipText("Sin Cerrar Ventana DetalleDescuenPoliVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleDescuenPoliVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleDescuenPoliVenta.setText("Acciones");		
		this.jLabelAccionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleDescuenPoliVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleDescuenPoliVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleDescuenPoliVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleDescuenPoliVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleDescuenPoliVenta = new GridBagLayout();
		
		this.jPanelCamposDetalleDescuenPoliVenta.setLayout(gridaBagLayoutCamposDetalleDescuenPoliVenta);
		this.jPanelCamposOcultosDetalleDescuenPoliVenta.setLayout(gridaBagLayoutCamposOcultosDetalleDescuenPoliVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleDescuenPoliVenta.add(jLabelIdDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleDescuenPoliVenta.add(jLabelidDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleDescuenPoliVenta.add(jLabelid_empresaDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 2;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleDescuenPoliVenta.add(jButtonid_empresaDetalleDescuenPoliVentaBusqueda, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 3;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleDescuenPoliVenta.add(jButtonid_empresaDetalleDescuenPoliVentaUpdate, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleDescuenPoliVenta.add(jComboBoxid_empresaDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleDescuenPoliVenta.add(jLabelid_sucursalDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 2;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleDescuenPoliVenta.add(jButtonid_sucursalDetalleDescuenPoliVentaBusqueda, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 3;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleDescuenPoliVenta.add(jButtonid_sucursalDetalleDescuenPoliVentaUpdate, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleDescuenPoliVenta.add(jComboBoxid_sucursalDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteDetalleDescuenPoliVenta.add(jLabelid_clienteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 2;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleDescuenPoliVenta.add(jButtonid_clienteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 3;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleDescuenPoliVenta.add(jButtonid_clienteDetalleDescuenPoliVentaBusqueda, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 4;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleDescuenPoliVenta.add(jButtonid_clienteDetalleDescuenPoliVentaUpdate, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteDetalleDescuenPoliVenta.add(jComboBoxid_clienteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleDescuenPoliVenta.add(jLabelvalorDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 2;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleDescuenPoliVenta.add(jButtonvalorDetalleDescuenPoliVentaBusqueda, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleDescuenPoliVenta.add(jTextFieldvalorDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleDescuenPoliVenta.add(jLabeldescripcionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 2;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleDescuenPoliVenta.add(jButtondescripcionDetalleDescuenPoliVentaBusqueda, this.gridBagConstraintsDetalleDescuenPoliVenta);
	}

	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleDescuenPoliVenta.add(jscrollPanedescripcionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDescuenPoliVenta.add(this.jPanelidDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposDetalleDescuenPoliVenta=0;
		iYPanelCamposDetalleDescuenPoliVenta++;
	}
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDescuenPoliVenta.add(this.jPanelid_clienteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposDetalleDescuenPoliVenta=0;
		iYPanelCamposDetalleDescuenPoliVenta++;
	}
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDescuenPoliVenta.add(this.jPanelvalorDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposDetalleDescuenPoliVenta=0;
		iYPanelCamposDetalleDescuenPoliVenta++;
	}
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDescuenPoliVenta.add(this.jPaneldescripcionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposDetalleDescuenPoliVenta=0;
		iYPanelCamposDetalleDescuenPoliVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposOcultosDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposOcultosDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleDescuenPoliVenta.add(this.jPanelid_empresaDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposOcultosDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposOcultosDetalleDescuenPoliVenta=0;
		iYPanelCamposOcultosDetalleDescuenPoliVenta++;
	}
	this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iYPanelCamposOcultosDetalleDescuenPoliVenta;
	this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iXPanelCamposOcultosDetalleDescuenPoliVenta++;
	this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDescuenPoliVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleDescuenPoliVenta.add(this.jPanelid_sucursalDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);



	if(iXPanelCamposOcultosDetalleDescuenPoliVenta % 1==0) {
		iXPanelCamposOcultosDetalleDescuenPoliVenta=0;
		iYPanelCamposOcultosDetalleDescuenPoliVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleDescuenPoliVenta= new GridBagLayout();
		this.jPanelAccionesDetalleDescuenPoliVenta.setLayout(gridaBagLayoutAccionesDetalleDescuenPoliVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleDescuenPoliVenta= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleDescuenPoliVenta.setLayout(gridaBagLayoutAccionesFormularioDetalleDescuenPoliVenta);
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleDescuenPoliVenta.add(this.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleDescuenPoliVenta.add(this.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleDescuenPoliVenta.add(this.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleDescuenPoliVenta.add(this.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonModificarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);							

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonEliminarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonActualizarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonGuardarCambiosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);	
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonCancelarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleDescuenPoliVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleDescuenPoliVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleDescuenPoliVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleDescuenPoliVenta = new DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Descuen Poli Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Descuen Poli Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Descuen Poli Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleDescuenPoliVentaModel detalledescuenpoliventaModel=new DetalleDescuenPoliVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleDescuenPoliVentaModel.DetalleDescuenPoliVentaFocusTraversalPolicy detalledescuenpoliventaFocusTraversalPolicy = detalledescuenpoliventaModel.new DetalleDescuenPoliVentaFocusTraversalPolicy(this);
			
			//detalledescuenpoliventaFocusTraversalPolicy.setdetalledescuenpoliventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalledescuenpoliventaModel);
			
			
			this.jContentPaneDetalleDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleDescuenPoliVenta = new GridBagLayout();	
			this.jContentPaneDetalleDetalleDescuenPoliVenta.setLayout(gridaBagLayoutDetalleDetalleDescuenPoliVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleDescuenPoliVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleDescuenPoliVenta.add(jTtoolBarDetalleDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta=   new JScrollPane(jContentPaneDetalleDetalleDescuenPoliVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	        
			this.jContentPaneDetalleDetalleDescuenPoliVenta.add(jPanelCamposDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);
			
			
			
			
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
						&& detalledescuenpoliventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleDescuenPoliVenta= new GridBagConstraints();
						this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
						this.jContentPaneDetalleDetalleDescuenPoliVenta.add(this.jTabbedPaneRelacionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleDescuenPoliVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
					this.gridBagConstraintsDetalleDescuenPoliVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleDescuenPoliVenta.add(jPanelCamposOcultosDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);
				
					this.jPanelCamposOcultosDetalleDescuenPoliVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	        this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleDescuenPoliVenta.add(this.jPanelAccionesFormularioDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);							
			
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
	        this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleDescuenPoliVenta.add(this.jPanelAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleDescuenPoliVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta=   new JScrollPane(this.jPanelCamposDetalleDescuenPoliVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleDescuenPoliVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleDescuenPoliVenta;
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
