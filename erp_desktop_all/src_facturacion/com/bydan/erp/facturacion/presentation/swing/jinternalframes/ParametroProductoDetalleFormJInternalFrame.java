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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.ParametroProductoConstantesFunciones;

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
public class ParametroProductoDetalleFormJInternalFrame extends ParametroProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroProducto;
	
	protected JMenuBar jmenuBarDetalleParametroProducto;
	
	protected JMenu jmenuDetalleParametroProducto;
	protected JMenu jmenuDetalleArchivoParametroProducto;
	protected JMenu jmenuDetalleAccionesParametroProducto;
	protected JMenu jmenuDetalleDatosParametroProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroProducto;	
	protected GridBagConstraints gridBagConstraintsParametroProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public ParametroProductoSessionBean parametroproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public FormatoSessionBean formatoSessionBean;	
	
	public ParametroProductoLogic parametroproductoLogic;
	
	public JScrollPane jScrollPanelDatosParametroProducto;
	public JScrollPane jScrollPanelDatosEdicionParametroProducto;
	public JScrollPane jScrollPanelDatosGeneralParametroProducto;
	
	protected JPanel jPanelCamposParametroProducto;    
	protected JPanel jPanelCamposOcultosParametroProducto;    	
	protected JPanel jPanelAccionesParametroProducto;
	protected JPanel jPanelAccionesFormularioParametroProducto;
    
	
	
	protected Integer iXPanelCamposParametroProducto=0;
	protected Integer iYPanelCamposParametroProducto=0;
	
	protected Integer iXPanelCamposOcultosParametroProducto=0;
	protected Integer iYPanelCamposOcultosParametroProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroProducto;
	public JButton jButtonModificarParametroProducto;
	public JButton jButtonActualizarParametroProducto;
    public JButton jButtonEliminarParametroProducto;
	public JButton jButtonCancelarParametroProducto;
    public JButton jButtonGuardarCambiosParametroProducto;
	public JButton jButtonGuardarCambiosTablaParametroProducto;
	protected JButton jButtonCerrarParametroProducto;
	
	
	protected JButton jButtonProcesarInformacionParametroProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroProducto;
	protected JButton jButtonModificarToolBarParametroProducto;
	protected JButton jButtonActualizarToolBarParametroProducto;
    protected JButton jButtonEliminarToolBarParametroProducto;
	protected JButton jButtonCancelarToolBarParametroProducto;
    protected JButton jButtonGuardarCambiosToolBarParametroProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroProducto;
	protected JButton jButtonCerrarToolBarParametroProducto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroProducto;
	protected JMenuItem jMenuItemModificarParametroProducto;
	protected JMenuItem jMenuItemActualizarParametroProducto;
    protected JMenuItem jMenuItemEliminarParametroProducto;
	protected JMenuItem jMenuItemCancelarParametroProducto;
    protected JMenuItem jMenuItemGuardarCambiosParametroProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroProducto;
	protected JMenuItem jMenuItemCerrarParametroProducto;
	protected JMenuItem jMenuItemDetalleCerrarParametroProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroProducto;
	protected JMenuItem jMenuItemMostrarOcultarParametroProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroProducto;
	public JLabel jLabelIdParametroProducto;
	public JLabel jLabelidParametroProducto;
	public JButton jButtonidParametroProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroProducto;
	public JLabel jLabeldescripcionParametroProducto;
	public JTextArea jTextAreadescripcionParametroProducto;
	public JScrollPane jscrollPanedescripcionParametroProducto;
	public JButton jButtondescripcionParametroProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroProducto;
	public JLabel jLabelid_empresaParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroProducto;
	public JButton jButtonid_empresaParametroProducto= new JButtonMe();
	public JButton jButtonid_empresaParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroProducto;
	public JLabel jLabelid_sucursalParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroProducto;
	public JButton jButtonid_sucursalParametroProducto= new JButtonMe();
	public JButton jButtonid_sucursalParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloParametroProducto;
	public JLabel jLabelid_moduloParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloParametroProducto;
	public JButton jButtonid_moduloParametroProducto= new JButtonMe();
	public JButton jButtonid_moduloParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_moduloParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionParametroProducto;
	public JLabel jLabelid_transaccionParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionParametroProducto;
	public JButton jButtonid_transaccionParametroProducto= new JButtonMe();
	public JButton jButtonid_transaccionParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloParametroProducto;
	public JLabel jLabelid_tipo_transaccion_moduloParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloParametroProducto;
	public JButton jButtonid_tipo_transaccion_moduloParametroProducto= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroProducto;
	public JLabel jLabelid_bodegaParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroProducto;
	public JButton jButtonid_bodegaParametroProducto= new JButtonMe();
	public JButton jButtonid_bodegaParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoParametroProducto;
	public JLabel jLabelid_productoParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoParametroProducto;
	public JButton jButtonid_productoParametroProducto= new JButtonMe();
	public JButton jButtonid_productoParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoParametroProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoParametroProducto;
	public JLabel jLabelid_formatoParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoParametroProducto;
	public JButton jButtonid_formatoParametroProducto= new JButtonMe();
	public JButton jButtonid_formatoParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_formatoParametroProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroProducto;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroProducto=new JPanel();
				this.jPanelAccionesFormularioParametroProducto=new JPanel();
				this.jmenuBarDetalleParametroProducto=new JMenuBar();
				this.jTtoolBarDetalleParametroProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroProducto() {
		return this.jButtonActualizarToolBarParametroProducto;
	}
	
	public JButton getjButtonEliminarToolBarParametroProducto() {
		return this.jButtonEliminarToolBarParametroProducto;
	}
	
	public JButton getjButtonCancelarToolBarParametroProducto() {
		return this.jButtonCancelarToolBarParametroProducto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroProducto() {
		return this.jButtonProcesarInformacionParametroProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroProducto)	{
		this.jButtonProcesarInformacionParametroProducto = jButtonProcesarInformacionParametroProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroProducto() {
		return this.jComboBoxTiposAccionesParametroProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroProducto(
			JComboBox jComboBoxTiposRelacionesParametroProducto) {
		this.jComboBoxTiposRelacionesParametroProducto = jComboBoxTiposRelacionesParametroProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroProducto(
			JComboBox jComboBoxTiposAccionesParametroProducto) {
		this.jComboBoxTiposAccionesParametroProducto = jComboBoxTiposAccionesParametroProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroProducto() {
		return this.jComboBoxTiposAccionesFormularioParametroProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroProducto(
			JComboBox jComboBoxTiposAccionesFormularioParametroProducto) {
		this.jComboBoxTiposAccionesFormularioParametroProducto = jComboBoxTiposAccionesFormularioParametroProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		
		this.parametroproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Producto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroProducto=new JButtonMe();
				this.jButtonModificarToolBarParametroProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroProducto,this.jTtoolBarDetalleParametroProducto,
							"actualizar","actualizar","Actualizar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroProducto,this.jTtoolBarDetalleParametroProducto,
							"eliminar","eliminar","Eliminar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroProducto,this.jTtoolBarDetalleParametroProducto,
							"cancelar","cancelar","Cancelar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroProducto,this.jTtoolBarDetalleParametroProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroProducto.add(this.jMenuItemDetalleCerrarParametroProducto);
		
		this.jmenuDetalleAccionesParametroProducto.add(this.jMenuItemActualizarParametroProducto);
		this.jmenuDetalleAccionesParametroProducto.add(this.jMenuItemEliminarParametroProducto);
		this.jmenuDetalleAccionesParametroProducto.add(this.jMenuItemCancelarParametroProducto);		
		
		//this.jmenuDetalleDatosParametroProducto.add(this.jMenuItemDetalleAbrirOrderByParametroProducto);				
		this.jmenuDetalleDatosParametroProducto.add(this.jMenuItemDetalleMostarOcultarParametroProducto);				
				
		//this.jmenuDetalleAccionesParametroProducto.add(this.jMenuItemGuardarCambiosParametroProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroProducto.add(this.jmenuDetalleArchivoParametroProducto);		
		this.jmenuBarDetalleParametroProducto.add(this.jmenuDetalleAccionesParametroProducto);		
		this.jmenuBarDetalleParametroProducto.add(this.jmenuDetalleDatosParametroProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroProducto);				
	}
	
	
	public void inicializarElementosCamposParametroProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroProducto = new JLabelMe();
		jLabelIdParametroProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroProducto= new GridBagLayout();

		this.jPanelidParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);

		jLabelidParametroProducto = new JLabel();
		jLabelidParametroProducto.setText("Id");

		jLabelidParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionParametroProducto = new JLabelMe();
		this.jLabeldescripcionParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionParametroProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPaneldescripcionParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jTextAreadescripcionParametroProducto= new JTextAreaMe();
		jTextAreadescripcionParametroProducto.setEnabled(false);
		jTextAreadescripcionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroProducto.setLineWrap(true);
		jTextAreadescripcionParametroProducto.setWrapStyleWord(true);
		jTextAreadescripcionParametroProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroProducto.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroProducto = new JScrollPane(jTextAreadescripcionParametroProducto);
		jscrollPanedescripcionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionParametroProductoBusqueda= new JButtonMe();
		this.jButtondescripcionParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroProductoBusqueda.setText("U");
		this.jButtondescripcionParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroProducto = new JLabelMe();
		this.jLabelid_empresaParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroProducto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_empresaParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_empresaParametroProducto= new JComboBoxMe();
		jComboBoxid_empresaParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroProducto.setEnabled(false);

		this.jButtonid_empresaParametroProducto= new JButtonMe();
		this.jButtonid_empresaParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroProducto.setText("Buscar");
		this.jButtonid_empresaParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProducto"));

		this.jButtonid_empresaParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroProductoBusqueda.setText("U");
		this.jButtonid_empresaParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroProductoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroProductoUpdate.setText("U");
		this.jButtonid_empresaParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroProductoUpdate"));



					
		this.jLabelid_sucursalParametroProducto = new JLabelMe();
		this.jLabelid_sucursalParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_sucursalParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_sucursalParametroProducto= new JComboBoxMe();
		jComboBoxid_sucursalParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroProducto.setEnabled(false);

		this.jButtonid_sucursalParametroProducto= new JButtonMe();
		this.jButtonid_sucursalParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroProducto.setText("Buscar");
		this.jButtonid_sucursalParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProducto"));

		this.jButtonid_sucursalParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroProductoBusqueda.setText("U");
		this.jButtonid_sucursalParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroProductoUpdate.setText("U");
		this.jButtonid_sucursalParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroProductoUpdate"));



					
		this.jLabelid_moduloParametroProducto = new JLabelMe();
		this.jLabelid_moduloParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloParametroProducto.setToolTipText("Modulo");
		this.jLabelid_moduloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_moduloParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_moduloParametroProducto= new JComboBoxMe();
		jComboBoxid_moduloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloParametroProducto= new JButtonMe();
		this.jButtonid_moduloParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroProducto.setText("Buscar");
		this.jButtonid_moduloParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroProducto"));

		this.jButtonid_moduloParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_moduloParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroProductoBusqueda.setText("U");
		this.jButtonid_moduloParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_moduloParametroProductoUpdate= new JButtonMe();
		this.jButtonid_moduloParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroProductoUpdate.setText("U");
		this.jButtonid_moduloParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroProductoUpdate"));



					
		this.jLabelid_transaccionParametroProducto = new JLabelMe();
		this.jLabelid_transaccionParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionParametroProducto.setToolTipText("Transaccion");
		this.jLabelid_transaccionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_transaccionParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_transaccionParametroProducto= new JComboBoxMe();
		jComboBoxid_transaccionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionParametroProducto= new JButtonMe();
		this.jButtonid_transaccionParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroProducto.setText("Buscar");
		this.jButtonid_transaccionParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProducto"));

		this.jButtonid_transaccionParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_transaccionParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroProductoBusqueda.setText("U");
		this.jButtonid_transaccionParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionParametroProductoUpdate= new JButtonMe();
		this.jButtonid_transaccionParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroProductoUpdate.setText("U");
		this.jButtonid_transaccionParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroProductoUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloParametroProducto = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloParametroProducto.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_tipo_transaccion_moduloParametroProducto= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloParametroProducto.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloParametroProducto= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloParametroProducto"));

		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloParametroProductoUpdate"));



					
		this.jLabelid_bodegaParametroProducto = new JLabelMe();
		this.jLabelid_bodegaParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_bodegaParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_bodegaParametroProducto= new JComboBoxMe();
		jComboBoxid_bodegaParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroProducto= new JButtonMe();
		this.jButtonid_bodegaParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroProducto.setText("Buscar");
		this.jButtonid_bodegaParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProducto"));

		this.jButtonid_bodegaParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroProductoBusqueda.setText("U");
		this.jButtonid_bodegaParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroProductoUpdate.setText("U");
		this.jButtonid_bodegaParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroProductoUpdate"));



					
		this.jLabelid_productoParametroProducto = new JLabelMe();
		this.jLabelid_productoParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoParametroProducto.setToolTipText("Producto");
		this.jLabelid_productoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_productoParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_productoParametroProducto= new JComboBoxMe();
		jComboBoxid_productoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoParametroProducto= new JButtonMe();
		this.jButtonid_productoParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoParametroProducto.setText("Buscar");
		this.jButtonid_productoParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoParametroProducto"));

		this.jButtonid_productoParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_productoParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoParametroProductoBusqueda.setText("U");
		this.jButtonid_productoParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoParametroProductoUpdate= new JButtonMe();
		this.jButtonid_productoParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoParametroProductoUpdate.setText("U");
		this.jButtonid_productoParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoParametroProductoUpdate"));



					
		this.jLabelid_formatoParametroProducto = new JLabelMe();
		this.jLabelid_formatoParametroProducto.setText(""+ParametroProductoConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoParametroProducto.setToolTipText("Formato");
		this.jLabelid_formatoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoParametroProducto.setToolTipText(ParametroProductoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutParametroProducto = new GridBagLayout();
		this.jPanelid_formatoParametroProducto.setLayout(this.gridaBagLayoutParametroProducto);


		jComboBoxid_formatoParametroProducto= new JComboBoxMe();
		jComboBoxid_formatoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoParametroProducto= new JButtonMe();
		this.jButtonid_formatoParametroProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroProducto.setText("Buscar");
		this.jButtonid_formatoParametroProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoParametroProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroProducto"));

		this.jButtonid_formatoParametroProductoBusqueda= new JButtonMe();
		this.jButtonid_formatoParametroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroProductoBusqueda.setText("U");
		this.jButtonid_formatoParametroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoParametroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroProductoBusqueda"));

		if(this.parametroproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoParametroProductoBusqueda.setVisible(false);		}

		this.jButtonid_formatoParametroProductoUpdate= new JButtonMe();
		this.jButtonid_formatoParametroProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroProductoUpdate.setText("U");
		this.jButtonid_formatoParametroProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoParametroProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroProductoUpdate"));



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
		//this.jInternalFrameDetalleParametroProducto = new ParametroProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroProducto= new GridBagLayout();
		

		
		String sToolTipParametroProducto="";
		sToolTipParametroProducto=ParametroProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroProducto+="(Facturacion.ParametroProducto)";
		}
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroProducto = new JButtonMe();
		this.jButtonModificarParametroProducto = new JButtonMe();
        this.jButtonActualizarParametroProducto = new JButtonMe();
        this.jButtonEliminarParametroProducto = new JButtonMe();
        this.jButtonCancelarParametroProducto = new JButtonMe();
        this.jButtonGuardarCambiosParametroProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroProducto = new JButtonMe();
		this.jButtonCerrarParametroProducto = new JButtonMe();
		
		this.jScrollPanelDatosParametroProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroProducto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Producto";
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroProducto.setName("jPanelCamposParametroProducto"); 

		this.jPanelCamposOcultosParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroProducto.setName("jPanelCamposOcultosParametroProducto"); 

        this.jPanelAccionesParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroProducto.setToolTipText("Acciones");
        this.jPanelAccionesParametroProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroProducto.setText("Nuevo");
		this.jButtonModificarParametroProducto.setText("Editar");
        this.jButtonActualizarParametroProducto.setText("Actualizar");
        this.jButtonEliminarParametroProducto.setText("Eliminar");
        this.jButtonCancelarParametroProducto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroProducto.setText("Guardar");
		this.jButtonCerrarParametroProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroProducto,"nuevo_button","Nuevo",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroProducto,"modificar_button","Editar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroProducto,"actualizar_button","Actualizar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroProducto,"eliminar_button","Eliminar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroProducto,"cancelar_button","Cancelar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroProducto,"guardarcambios_button","Guardar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroProducto,"guardarcambiostabla_button","Guardar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroProducto,"cerrar_button","Salir",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroProducto.setToolTipText("Nuevo"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroProducto.setToolTipText("Editar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroProducto.setToolTipText("Actualizar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroProducto.setToolTipText("Eliminar)"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroProducto.setToolTipText("Cancelar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroProducto.setToolTipText("Guardar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroProducto.setToolTipText("Guardar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroProducto.setToolTipText("Salir"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroProducto";
		inputMap = this.jButtonNuevoParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroProducto";
		inputMap = this.jButtonActualizarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroProducto";
		inputMap = this.jButtonEliminarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroProducto";
		inputMap = this.jButtonCancelarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroProducto"));
		
		//CERRAR		
		sMapKey = "CerrarParametroProducto";
		inputMap = this.jButtonCerrarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroProducto";
		inputMap = this.jButtonGuardarCambiosTablaParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroProducto.setToolTipText("Nuevo ParametroProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroProducto.setToolTipText("Sin Cerrar Ventana ParametroProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroProducto.setText("Accion");
		this.jComboBoxTiposAccionesParametroProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroProducto = new JLabelMe();
		
		this.jLabelAccionesParametroProducto.setText("Acciones");		
		this.jLabelAccionesParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroProducto = new GridBagLayout();
		
		this.jPanelCamposParametroProducto.setLayout(gridaBagLayoutCamposParametroProducto);
		this.jPanelCamposOcultosParametroProducto.setLayout(gridaBagLayoutCamposOcultosParametroProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroProducto.add(jLabelIdParametroProducto, this.gridBagConstraintsParametroProducto);



	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroProducto.add(jLabelidParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroProducto.add(jLabelid_empresaParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroProducto.add(jButtonid_empresaParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroProducto.add(jButtonid_empresaParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroProducto.add(jComboBoxid_empresaParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroProducto.add(jLabelid_sucursalParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroProducto.add(jButtonid_sucursalParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroProducto.add(jButtonid_sucursalParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroProducto.add(jComboBoxid_sucursalParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloParametroProducto.add(jLabelid_moduloParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroProducto.add(jButtonid_moduloParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroProducto.add(jButtonid_moduloParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloParametroProducto.add(jComboBoxid_moduloParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionParametroProducto.add(jLabelid_transaccionParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroProducto.add(jButtonid_transaccionParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroProducto.add(jButtonid_transaccionParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionParametroProducto.add(jComboBoxid_transaccionParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloParametroProducto.add(jLabelid_tipo_transaccion_moduloParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloParametroProducto.add(jButtonid_tipo_transaccion_moduloParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloParametroProducto.add(jButtonid_tipo_transaccion_moduloParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloParametroProducto.add(jComboBoxid_tipo_transaccion_moduloParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroProducto.add(jLabelid_bodegaParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroProducto.add(jButtonid_bodegaParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroProducto.add(jButtonid_bodegaParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroProducto.add(jComboBoxid_bodegaParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoParametroProducto.add(jLabelid_productoParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 2;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoParametroProducto.add(jButtonid_productoParametroProducto, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoParametroProducto.add(jButtonid_productoParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 4;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoParametroProducto.add(jButtonid_productoParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoParametroProducto.add(jComboBoxid_productoParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoParametroProducto.add(jLabelid_formatoParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroProducto.add(jButtonid_formatoParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 3;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroProducto.add(jButtonid_formatoParametroProductoUpdate, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoParametroProducto.add(jComboBoxid_formatoParametroProducto, this.gridBagConstraintsParametroProducto);


	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 0;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroProducto.add(jLabeldescripcionParametroProducto, this.gridBagConstraintsParametroProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 2;
		this.gridBagConstraintsParametroProducto.ipadx = 0;
		this.gridBagConstraintsParametroProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroProducto.add(jButtondescripcionParametroProductoBusqueda, this.gridBagConstraintsParametroProducto);
	}

	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroProducto.gridy = 0;
	this.gridBagConstraintsParametroProducto.gridx = 1;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroProducto.add(jscrollPanedescripcionParametroProducto, this.gridBagConstraintsParametroProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelidParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelid_moduloParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelid_transaccionParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelid_bodegaParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelid_productoParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPanelid_formatoParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroProducto.add(this.jPaneldescripcionParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposParametroProducto % 1==0) {
		iXPanelCamposParametroProducto=0;
		iYPanelCamposParametroProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposOcultosParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposOcultosParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroProducto.add(this.jPanelid_empresaParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposOcultosParametroProducto % 1==0) {
		iXPanelCamposOcultosParametroProducto=0;
		iYPanelCamposOcultosParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposOcultosParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposOcultosParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroProducto.add(this.jPanelid_sucursalParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposOcultosParametroProducto % 1==0) {
		iXPanelCamposOcultosParametroProducto=0;
		iYPanelCamposOcultosParametroProducto++;
	}
	this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroProducto.gridy = iYPanelCamposOcultosParametroProducto;
	this.gridBagConstraintsParametroProducto.gridx = iXPanelCamposOcultosParametroProducto++;
	this.gridBagConstraintsParametroProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroProducto.add(this.jPanelid_tipo_transaccion_moduloParametroProducto, this.gridBagConstraintsParametroProducto);



	if(iXPanelCamposOcultosParametroProducto % 1==0) {
		iXPanelCamposOcultosParametroProducto=0;
		iYPanelCamposOcultosParametroProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroProducto= new GridBagLayout();
		this.jPanelAccionesParametroProducto.setLayout(gridaBagLayoutAccionesParametroProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroProducto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroProducto.setLayout(gridaBagLayoutAccionesFormularioParametroProducto);
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroProducto.add(this.jComboBoxTiposAccionesFormularioParametroProducto, this.gridBagConstraintsParametroProducto);

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroProducto.add(this.jCheckBoxPostAccionNuevoParametroProducto, this.gridBagConstraintsParametroProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroProducto.add(this.jCheckBoxPostAccionSinCerrarParametroProducto, this.gridBagConstraintsParametroProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroProducto.add(this.jCheckBoxPostAccionSinMensajeParametroProducto, this.gridBagConstraintsParametroProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroProducto.add(this.jButtonModificarParametroProducto, this.gridBagConstraintsParametroProducto);							

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroProducto.add(this.jButtonEliminarParametroProducto, this.gridBagConstraintsParametroProducto);
		
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = 0;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroProducto.add(this.jButtonActualizarParametroProducto, this.gridBagConstraintsParametroProducto);


		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = 0;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroProducto.add(this.jButtonGuardarCambiosParametroProducto, this.gridBagConstraintsParametroProducto);	
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = 0;		
		this.gridBagConstraintsParametroProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroProducto.add(this.jButtonCancelarParametroProducto, this.gridBagConstraintsParametroProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();						
			this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroProducto.gridx = 0;		
			//this.gridBagConstraintsParametroProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroProducto.gridx =0;
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroProducto, this.gridBagConstraintsParametroProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroProducto = new ParametroProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroProductoModel parametroproductoModel=new ParametroProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroProductoModel.ParametroProductoFocusTraversalPolicy parametroproductoFocusTraversalPolicy = parametroproductoModel.new ParametroProductoFocusTraversalPolicy(this);
			
			//parametroproductoFocusTraversalPolicy.setparametroproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroproductoModel);
			
			
			this.jContentPaneDetalleParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroProducto = new GridBagLayout();	
			this.jContentPaneDetalleParametroProducto.setLayout(gridaBagLayoutDetalleParametroProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroProducto = new GridBagConstraints();
				this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroProducto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroProducto.add(jTtoolBarDetalleParametroProducto, gridBagConstraintsParametroProducto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroProducto=   new JScrollPane(jContentPaneDetalleParametroProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroProducto.gridx = 0;
	        
			this.jContentPaneDetalleParametroProducto.add(jPanelCamposParametroProducto, gridBagConstraintsParametroProducto);
			
			
			
			
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
						&& parametroproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroProducto= new GridBagConstraints();
						this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroProducto.gridx = 0;
						this.jContentPaneDetalleParametroProducto.add(this.jTabbedPaneRelacionesParametroProducto, this.gridBagConstraintsParametroProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroProducto = new GridBagConstraints();
					this.gridBagConstraintsParametroProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroProducto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroProducto.add(jPanelCamposOcultosParametroProducto, gridBagConstraintsParametroProducto);
				
					this.jPanelCamposOcultosParametroProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroProducto.gridx = 0;
	        this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroProducto.add(this.jPanelAccionesFormularioParametroProducto, this.gridBagConstraintsParametroProducto);							
			
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
	        this.gridBagConstraintsParametroProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroProducto.add(this.jPanelAccionesParametroProducto, this.gridBagConstraintsParametroProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroProducto=   new JScrollPane(this.jPanelCamposParametroProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroProducto.gridx = 0;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroProducto, this.gridBagConstraintsParametroProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroProducto, this.gridBagConstraintsParametroProducto);			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroProducto, this.gridBagConstraintsParametroProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroProducto, this.gridBagConstraintsParametroProducto);
			
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroProducto, this.gridBagConstraintsParametroProducto);
		
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroProducto, this.gridBagConstraintsParametroProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroProducto;
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
