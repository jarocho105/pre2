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
import com.bydan.erp.inventario.util.SaldoMesProductoConstantesFunciones;

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
public class SaldoMesProductoDetalleFormJInternalFrame extends SaldoMesProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSaldoMesProducto;
	
	protected JMenuBar jmenuBarDetalleSaldoMesProducto;
	
	protected JMenu jmenuDetalleSaldoMesProducto;
	protected JMenu jmenuDetalleArchivoSaldoMesProducto;
	protected JMenu jmenuDetalleAccionesSaldoMesProducto;
	protected JMenu jmenuDetalleDatosSaldoMesProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldoMesProducto;	
	protected GridBagConstraints gridBagConstraintsSaldoMesProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SaldoMesProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSaldoMesProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public SaldoMesProductoSessionBean saldomesproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public SaldoMesProductoLogic saldomesproductoLogic;
	
	public JScrollPane jScrollPanelDatosSaldoMesProducto;
	public JScrollPane jScrollPanelDatosEdicionSaldoMesProducto;
	public JScrollPane jScrollPanelDatosGeneralSaldoMesProducto;
	
	protected JPanel jPanelCamposSaldoMesProducto;    
	protected JPanel jPanelCamposOcultosSaldoMesProducto;    	
	protected JPanel jPanelAccionesSaldoMesProducto;
	protected JPanel jPanelAccionesFormularioSaldoMesProducto;
    
	
	
	protected Integer iXPanelCamposSaldoMesProducto=0;
	protected Integer iYPanelCamposSaldoMesProducto=0;
	
	protected Integer iXPanelCamposOcultosSaldoMesProducto=0;
	protected Integer iYPanelCamposOcultosSaldoMesProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSaldoMesProducto;
	public JButton jButtonModificarSaldoMesProducto;
	public JButton jButtonActualizarSaldoMesProducto;
    public JButton jButtonEliminarSaldoMesProducto;
	public JButton jButtonCancelarSaldoMesProducto;
    public JButton jButtonGuardarCambiosSaldoMesProducto;
	public JButton jButtonGuardarCambiosTablaSaldoMesProducto;
	protected JButton jButtonCerrarSaldoMesProducto;
	
	
	protected JButton jButtonProcesarInformacionSaldoMesProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSaldoMesProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSaldoMesProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSaldoMesProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldoMesProducto;
	protected JButton jButtonModificarToolBarSaldoMesProducto;
	protected JButton jButtonActualizarToolBarSaldoMesProducto;
    protected JButton jButtonEliminarToolBarSaldoMesProducto;
	protected JButton jButtonCancelarToolBarSaldoMesProducto;
    protected JButton jButtonGuardarCambiosToolBarSaldoMesProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarSaldoMesProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldoMesProducto;
	protected JButton jButtonCerrarToolBarSaldoMesProducto;
	
	protected JButton jButtonProcesarInformacionToolBarSaldoMesProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldoMesProducto;
	protected JMenuItem jMenuItemModificarSaldoMesProducto;
	protected JMenuItem jMenuItemActualizarSaldoMesProducto;
    protected JMenuItem jMenuItemEliminarSaldoMesProducto;
	protected JMenuItem jMenuItemCancelarSaldoMesProducto;
    protected JMenuItem jMenuItemGuardarCambiosSaldoMesProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldoMesProducto;
	protected JMenuItem jMenuItemCerrarSaldoMesProducto;
	protected JMenuItem jMenuItemDetalleCerrarSaldoMesProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldoMesProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionSaldoMesProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldoMesProducto;
	protected JMenuItem jMenuItemMostrarOcultarSaldoMesProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldoMesProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldoMesProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSaldoMesProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSaldoMesProducto;
	public JLabel jLabelIdSaldoMesProducto;
	public JLabel jLabelidSaldoMesProducto;
	public JButton jButtonidSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelsaldoSaldoMesProducto;
	public JLabel jLabelsaldoSaldoMesProducto;
	public JTextField jTextFieldsaldoSaldoMesProducto;
	public JButton jButtonsaldoSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelcostoSaldoMesProducto;
	public JLabel jLabelcostoSaldoMesProducto;
	public JTextField jTextFieldcostoSaldoMesProducto;
	public JButton jButtoncostoSaldoMesProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSaldoMesProducto;
	public JLabel jLabelid_empresaSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSaldoMesProducto;
	public JButton jButtonid_empresaSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_empresaSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSaldoMesProducto;
	public JLabel jLabelid_sucursalSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSaldoMesProducto;
	public JButton jButtonid_sucursalSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_sucursalSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaSaldoMesProducto;
	public JLabel jLabelid_bodegaSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaSaldoMesProducto;
	public JButton jButtonid_bodegaSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_bodegaSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoSaldoMesProducto;
	public JLabel jLabelid_productoSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoSaldoMesProducto;
	public JButton jButtonid_productoSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_productoSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioSaldoMesProducto;
	public JLabel jLabelid_anioSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioSaldoMesProducto;
	public JButton jButtonid_anioSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_anioSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_anioSaldoMesProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesSaldoMesProducto;
	public JLabel jLabelid_mesSaldoMesProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesSaldoMesProducto;
	public JButton jButtonid_mesSaldoMesProducto= new JButtonMe();
	public JButton jButtonid_mesSaldoMesProductoUpdate= new JButtonMe();
	public JButton jButtonid_mesSaldoMesProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSaldoMesProducto;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SaldoMesProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSaldoMesProducto=new JPanel();
				this.jPanelAccionesFormularioSaldoMesProducto=new JPanel();
				this.jmenuBarDetalleSaldoMesProducto=new JMenuBar();
				this.jTtoolBarDetalleSaldoMesProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SaldoMesProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoMesProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldoMesProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSaldoMesProducto() {
		return this.jButtonActualizarToolBarSaldoMesProducto;
	}
	
	public JButton getjButtonEliminarToolBarSaldoMesProducto() {
		return this.jButtonEliminarToolBarSaldoMesProducto;
	}
	
	public JButton getjButtonCancelarToolBarSaldoMesProducto() {
		return this.jButtonCancelarToolBarSaldoMesProducto;
	}		
	
	public JButton getjButtonProcesarInformacionSaldoMesProducto() {
		return this.jButtonProcesarInformacionSaldoMesProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldoMesProducto)	{
		this.jButtonProcesarInformacionSaldoMesProducto = jButtonProcesarInformacionSaldoMesProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldoMesProducto() {
		return this.jComboBoxTiposAccionesSaldoMesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldoMesProducto(
			JComboBox jComboBoxTiposRelacionesSaldoMesProducto) {
		this.jComboBoxTiposRelacionesSaldoMesProducto = jComboBoxTiposRelacionesSaldoMesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldoMesProducto(
			JComboBox jComboBoxTiposAccionesSaldoMesProducto) {
		this.jComboBoxTiposAccionesSaldoMesProducto = jComboBoxTiposAccionesSaldoMesProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSaldoMesProducto() {
		return this.jComboBoxTiposAccionesFormularioSaldoMesProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSaldoMesProducto(
			JComboBox jComboBoxTiposAccionesFormularioSaldoMesProducto) {
		this.jComboBoxTiposAccionesFormularioSaldoMesProducto = jComboBoxTiposAccionesFormularioSaldoMesProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		
		this.saldomesproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldomesproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldomesproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldoMesProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldo Mes Producto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		SaldoMesProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSaldoMesProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSaldoMesProducto=new JButtonMe();
				this.jButtonModificarToolBarSaldoMesProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto,
							"actualizar","actualizar","Actualizar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto,
							"eliminar","eliminar","Eliminar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto,
							"cancelar","cancelar","Cancelar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSaldoMesProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSaldoMesProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSaldoMesProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSaldoMesProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSaldoMesProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSaldoMesProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldoMesProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldoMesProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldoMesProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSaldoMesProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSaldoMesProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSaldoMesProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSaldoMesProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSaldoMesProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSaldoMesProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSaldoMesProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSaldoMesProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSaldoMesProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSaldoMesProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSaldoMesProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSaldoMesProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSaldoMesProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldoMesProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldoMesProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldoMesProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldoMesProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldoMesProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSaldoMesProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSaldoMesProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSaldoMesProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldoMesProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldoMesProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldoMesProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldoMesProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldoMesProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldoMesProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSaldoMesProducto.add(this.jMenuItemDetalleCerrarSaldoMesProducto);
		
		this.jmenuDetalleAccionesSaldoMesProducto.add(this.jMenuItemActualizarSaldoMesProducto);
		this.jmenuDetalleAccionesSaldoMesProducto.add(this.jMenuItemEliminarSaldoMesProducto);
		this.jmenuDetalleAccionesSaldoMesProducto.add(this.jMenuItemCancelarSaldoMesProducto);		
		
		//this.jmenuDetalleDatosSaldoMesProducto.add(this.jMenuItemDetalleAbrirOrderBySaldoMesProducto);				
		this.jmenuDetalleDatosSaldoMesProducto.add(this.jMenuItemDetalleMostarOcultarSaldoMesProducto);				
				
		//this.jmenuDetalleAccionesSaldoMesProducto.add(this.jMenuItemGuardarCambiosSaldoMesProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSaldoMesProducto.add(this.jmenuDetalleArchivoSaldoMesProducto);		
		this.jmenuBarDetalleSaldoMesProducto.add(this.jmenuDetalleAccionesSaldoMesProducto);		
		this.jmenuBarDetalleSaldoMesProducto.add(this.jmenuDetalleDatosSaldoMesProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSaldoMesProducto);				
	}
	
	
	public void inicializarElementosCamposSaldoMesProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSaldoMesProducto = new JLabelMe();
		jLabelIdSaldoMesProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSaldoMesProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSaldoMesProducto= new GridBagLayout();

		this.jPanelidSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);

		jLabelidSaldoMesProducto = new JLabel();
		jLabelidSaldoMesProducto.setText("Id");

		jLabelidSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsaldoSaldoMesProducto = new JLabelMe();
		this.jLabelsaldoSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoSaldoMesProducto.setToolTipText("Saldo");
		this.jLabelsaldoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelsaldoSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jTextFieldsaldoSaldoMesProducto= new JTextFieldMe();
		jTextFieldsaldoSaldoMesProducto.setEnabled(false);
		jTextFieldsaldoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoSaldoMesProducto.setText("0.0");

		this.jButtonsaldoSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonsaldoSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoSaldoMesProductoBusqueda.setText("U");
		this.jButtonsaldoSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoSaldoMesProductoBusqueda.setVisible(false);		}


					
		this.jLabelcostoSaldoMesProducto = new JLabelMe();
		this.jLabelcostoSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoSaldoMesProducto.setToolTipText("Costo");
		this.jLabelcostoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelcostoSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jTextFieldcostoSaldoMesProducto= new JTextFieldMe();
		jTextFieldcostoSaldoMesProducto.setEnabled(false);
		jTextFieldcostoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoSaldoMesProducto.setText("0.0");

		this.jButtoncostoSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtoncostoSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoSaldoMesProductoBusqueda.setText("U");
		this.jButtoncostoSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoSaldoMesProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSaldoMesProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSaldoMesProducto = new JLabelMe();
		this.jLabelid_empresaSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSaldoMesProducto.setToolTipText("Empresa");
		this.jLabelid_empresaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_empresaSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_empresaSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_empresaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSaldoMesProducto.setEnabled(false);

		this.jButtonid_empresaSaldoMesProducto= new JButtonMe();
		this.jButtonid_empresaSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoMesProducto.setText("Buscar");
		this.jButtonid_empresaSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoMesProducto"));

		this.jButtonid_empresaSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_empresaSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_empresaSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldoMesProductoUpdate.setText("U");
		this.jButtonid_empresaSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoMesProductoUpdate"));



					
		this.jLabelid_sucursalSaldoMesProducto = new JLabelMe();
		this.jLabelid_sucursalSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSaldoMesProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_sucursalSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_sucursalSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_sucursalSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSaldoMesProducto.setEnabled(false);

		this.jButtonid_sucursalSaldoMesProducto= new JButtonMe();
		this.jButtonid_sucursalSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoMesProducto.setText("Buscar");
		this.jButtonid_sucursalSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoMesProducto"));

		this.jButtonid_sucursalSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldoMesProductoUpdate.setText("U");
		this.jButtonid_sucursalSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoMesProductoUpdate"));



					
		this.jLabelid_bodegaSaldoMesProducto = new JLabelMe();
		this.jLabelid_bodegaSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaSaldoMesProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_bodegaSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_bodegaSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_bodegaSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaSaldoMesProducto= new JButtonMe();
		this.jButtonid_bodegaSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSaldoMesProducto.setText("Buscar");
		this.jButtonid_bodegaSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSaldoMesProducto"));

		this.jButtonid_bodegaSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaSaldoMesProductoUpdate.setText("U");
		this.jButtonid_bodegaSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSaldoMesProductoUpdate"));



					
		this.jLabelid_productoSaldoMesProducto = new JLabelMe();
		this.jLabelid_productoSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoSaldoMesProducto.setToolTipText("Producto");
		this.jLabelid_productoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_productoSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_productoSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_productoSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoSaldoMesProducto= new JButtonMe();
		this.jButtonid_productoSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSaldoMesProducto.setText("Buscar");
		this.jButtonid_productoSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSaldoMesProducto"));

		this.jButtonid_productoSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_productoSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_productoSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_productoSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoSaldoMesProductoUpdate.setText("U");
		this.jButtonid_productoSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSaldoMesProductoUpdate"));



					
		this.jLabelid_anioSaldoMesProducto = new JLabelMe();
		this.jLabelid_anioSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioSaldoMesProducto.setToolTipText("Anio");
		this.jLabelid_anioSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_anioSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_anioSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_anioSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioSaldoMesProducto= new JButtonMe();
		this.jButtonid_anioSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoMesProducto.setText("Buscar");
		this.jButtonid_anioSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoMesProducto"));

		this.jButtonid_anioSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_anioSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_anioSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_anioSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_anioSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSaldoMesProductoUpdate.setText("U");
		this.jButtonid_anioSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoMesProductoUpdate"));



					
		this.jLabelid_mesSaldoMesProducto = new JLabelMe();
		this.jLabelid_mesSaldoMesProducto.setText(""+SaldoMesProductoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesSaldoMesProducto.setToolTipText("Mes");
		this.jLabelid_mesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesSaldoMesProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesSaldoMesProducto.setToolTipText(SaldoMesProductoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		this.jPanelid_mesSaldoMesProducto.setLayout(this.gridaBagLayoutSaldoMesProducto);


		jComboBoxid_mesSaldoMesProducto= new JComboBoxMe();
		jComboBoxid_mesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesSaldoMesProducto= new JButtonMe();
		this.jButtonid_mesSaldoMesProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoMesProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoMesProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoMesProducto.setText("Buscar");
		this.jButtonid_mesSaldoMesProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesSaldoMesProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoMesProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoMesProducto"));

		this.jButtonid_mesSaldoMesProductoBusqueda= new JButtonMe();
		this.jButtonid_mesSaldoMesProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoMesProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoMesProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSaldoMesProductoBusqueda.setText("U");
		this.jButtonid_mesSaldoMesProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesSaldoMesProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoMesProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoMesProductoBusqueda"));

		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesSaldoMesProductoBusqueda.setVisible(false);		}

		this.jButtonid_mesSaldoMesProductoUpdate= new JButtonMe();
		this.jButtonid_mesSaldoMesProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoMesProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoMesProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSaldoMesProductoUpdate.setText("U");
		this.jButtonid_mesSaldoMesProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesSaldoMesProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoMesProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoMesProductoUpdate"));



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
		//this.jInternalFrameDetalleSaldoMesProducto = new SaldoMesProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Saldo Mes Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldoMesProducto= new GridBagLayout();
		

		
		String sToolTipSaldoMesProducto="";
		sToolTipSaldoMesProducto=SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldoMesProducto+="(Inventario.SaldoMesProducto)";
		}
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldoMesProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSaldoMesProducto = new JButtonMe();
		this.jButtonModificarSaldoMesProducto = new JButtonMe();
        this.jButtonActualizarSaldoMesProducto = new JButtonMe();
        this.jButtonEliminarSaldoMesProducto = new JButtonMe();
        this.jButtonCancelarSaldoMesProducto = new JButtonMe();
        this.jButtonGuardarCambiosSaldoMesProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaSaldoMesProducto = new JButtonMe();
		this.jButtonCerrarSaldoMesProducto = new JButtonMe();
		
		this.jScrollPanelDatosSaldoMesProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionSaldoMesProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralSaldoMesProducto = new JScrollPane();
				
		
		
		this.jPanelCamposSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Saldo Mes Producto";
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Mes Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldoMesProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSaldoMesProducto.setName("jPanelCamposSaldoMesProducto"); 

		this.jPanelCamposOcultosSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSaldoMesProducto.setName("jPanelCamposOcultosSaldoMesProducto"); 

        this.jPanelAccionesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldoMesProducto.setToolTipText("Acciones");
        this.jPanelAccionesSaldoMesProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSaldoMesProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSaldoMesProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSaldoMesProducto.setText("Nuevo");
		this.jButtonModificarSaldoMesProducto.setText("Editar");
        this.jButtonActualizarSaldoMesProducto.setText("Actualizar");
        this.jButtonEliminarSaldoMesProducto.setText("Eliminar");
        this.jButtonCancelarSaldoMesProducto.setText("Cancelar");
        this.jButtonGuardarCambiosSaldoMesProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaSaldoMesProducto.setText("Guardar");
		this.jButtonCerrarSaldoMesProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldoMesProducto,"nuevo_button","Nuevo",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSaldoMesProducto,"modificar_button","Editar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSaldoMesProducto,"actualizar_button","Actualizar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSaldoMesProducto,"eliminar_button","Eliminar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSaldoMesProducto,"cancelar_button","Cancelar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSaldoMesProducto,"guardarcambios_button","Guardar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldoMesProducto,"guardarcambiostabla_button","Guardar",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldoMesProducto,"cerrar_button","Salir",this.saldomesproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSaldoMesProducto.setToolTipText("Nuevo"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSaldoMesProducto.setToolTipText("Editar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSaldoMesProducto.setToolTipText("Actualizar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSaldoMesProducto.setToolTipText("Eliminar)"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSaldoMesProducto.setToolTipText("Cancelar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSaldoMesProducto.setToolTipText("Guardar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSaldoMesProducto.setToolTipText("Guardar"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldoMesProducto.setToolTipText("Salir"+" "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldoMesProducto";
		inputMap = this.jButtonNuevoSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldoMesProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldoMesProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSaldoMesProducto";
		inputMap = this.jButtonActualizarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSaldoMesProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarSaldoMesProducto";
		inputMap = this.jButtonEliminarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSaldoMesProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarSaldoMesProducto";
		inputMap = this.jButtonCancelarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSaldoMesProducto"));
		
		//CERRAR		
		sMapKey = "CerrarSaldoMesProducto";
		inputMap = this.jButtonCerrarSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldoMesProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldoMesProducto";
		inputMap = this.jButtonGuardarCambiosTablaSaldoMesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldoMesProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSaldoMesProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSaldoMesProducto.setToolTipText("Nuevo SaldoMesProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSaldoMesProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSaldoMesProducto.setToolTipText("Sin Cerrar Ventana SaldoMesProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSaldoMesProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSaldoMesProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSaldoMesProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldoMesProducto.setText("Accion");
		this.jComboBoxTiposAccionesSaldoMesProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSaldoMesProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSaldoMesProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSaldoMesProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSaldoMesProducto = new JLabelMe();
		
		this.jLabelAccionesSaldoMesProducto.setText("Acciones");		
		this.jLabelAccionesSaldoMesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoMesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoMesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSaldoMesProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSaldoMesProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSaldoMesProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesSaldoMesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSaldoMesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSaldoMesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoMesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoMesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSaldoMesProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldoMesProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldoMesProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSaldoMesProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSaldoMesProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSaldoMesProducto = new GridBagLayout();
		
		this.jPanelCamposSaldoMesProducto.setLayout(gridaBagLayoutCamposSaldoMesProducto);
		this.jPanelCamposOcultosSaldoMesProducto.setLayout(gridaBagLayoutCamposOcultosSaldoMesProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSaldoMesProducto.add(jLabelIdSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSaldoMesProducto.add(jLabelidSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSaldoMesProducto.add(jLabelid_empresaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldoMesProducto.add(jButtonid_empresaSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldoMesProducto.add(jButtonid_empresaSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSaldoMesProducto.add(jComboBoxid_empresaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSaldoMesProducto.add(jLabelid_sucursalSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldoMesProducto.add(jButtonid_sucursalSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldoMesProducto.add(jButtonid_sucursalSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSaldoMesProducto.add(jComboBoxid_sucursalSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaSaldoMesProducto.add(jLabelid_bodegaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaSaldoMesProducto.add(jButtonid_bodegaSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaSaldoMesProducto.add(jButtonid_bodegaSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaSaldoMesProducto.add(jComboBoxid_bodegaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoSaldoMesProducto.add(jLabelid_productoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 2;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoSaldoMesProducto.add(jButtonid_productoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoSaldoMesProducto.add(jButtonid_productoSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 4;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoSaldoMesProducto.add(jButtonid_productoSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoSaldoMesProducto.add(jComboBoxid_productoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioSaldoMesProducto.add(jLabelid_anioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSaldoMesProducto.add(jButtonid_anioSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSaldoMesProducto.add(jButtonid_anioSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioSaldoMesProducto.add(jComboBoxid_anioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesSaldoMesProducto.add(jLabelid_mesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSaldoMesProducto.add(jButtonid_mesSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 3;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSaldoMesProducto.add(jButtonid_mesSaldoMesProductoUpdate, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesSaldoMesProducto.add(jComboBoxid_mesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoSaldoMesProducto.add(jLabelsaldoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoSaldoMesProducto.add(jButtonsaldoSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoSaldoMesProducto.add(jTextFieldsaldoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoSaldoMesProducto.add(jLabelcostoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		//this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = 2;
		this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
		this.gridBagConstraintsSaldoMesProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoSaldoMesProducto.add(jButtoncostoSaldoMesProductoBusqueda, this.gridBagConstraintsSaldoMesProducto);
	}

	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoMesProducto.gridy = 0;
	this.gridBagConstraintsSaldoMesProducto.gridx = 1;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoSaldoMesProducto.add(jTextFieldcostoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelidSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelid_bodegaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelid_productoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelid_anioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelid_mesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelsaldoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoMesProducto.add(this.jPanelcostoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposSaldoMesProducto % 1==0) {
		iXPanelCamposSaldoMesProducto=0;
		iYPanelCamposSaldoMesProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposOcultosSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposOcultosSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoMesProducto.add(this.jPanelid_empresaSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposOcultosSaldoMesProducto % 1==0) {
		iXPanelCamposOcultosSaldoMesProducto=0;
		iYPanelCamposOcultosSaldoMesProducto++;
	}
	this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoMesProducto.gridy = iYPanelCamposOcultosSaldoMesProducto;
	this.gridBagConstraintsSaldoMesProducto.gridx = iXPanelCamposOcultosSaldoMesProducto++;
	this.gridBagConstraintsSaldoMesProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoMesProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoMesProducto.add(this.jPanelid_sucursalSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);



	if(iXPanelCamposOcultosSaldoMesProducto % 1==0) {
		iXPanelCamposOcultosSaldoMesProducto=0;
		iYPanelCamposOcultosSaldoMesProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesSaldoMesProducto= new GridBagLayout();
		this.jPanelAccionesSaldoMesProducto.setLayout(gridaBagLayoutAccionesSaldoMesProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSaldoMesProducto= new GridBagLayout();
		this.jPanelAccionesFormularioSaldoMesProducto.setLayout(gridaBagLayoutAccionesFormularioSaldoMesProducto);
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldoMesProducto.add(this.jComboBoxTiposAccionesFormularioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldoMesProducto.add(this.jCheckBoxPostAccionNuevoSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSaldoMesProducto.add(this.jCheckBoxPostAccionSinCerrarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSaldoMesProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSaldoMesProducto.add(this.jCheckBoxPostAccionSinMensajeSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonModificarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);							

		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;
		this.gridBagConstraintsSaldoMesProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonEliminarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonActualizarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);


		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;		
		this.gridBagConstraintsSaldoMesProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonGuardarCambiosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);	
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = 0;		
		this.gridBagConstraintsSaldoMesProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesSaldoMesProducto.add(this.jButtonCancelarSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldoMesProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldoMesProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();						
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;		
			//this.gridBagConstraintsSaldoMesProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldoMesProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldoMesProducto.gridx =0;
		this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldoMesProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSaldoMesProducto = new SaldoMesProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Saldo Mes Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Saldo Mes Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldo Mes Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SaldoMesProductoModel saldomesproductoModel=new SaldoMesProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//SaldoMesProductoModel.SaldoMesProductoFocusTraversalPolicy saldomesproductoFocusTraversalPolicy = saldomesproductoModel.new SaldoMesProductoFocusTraversalPolicy(this);
			
			//saldomesproductoFocusTraversalPolicy.setsaldomesproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(saldomesproductoModel);
			
			
			this.jContentPaneDetalleSaldoMesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSaldoMesProducto = new GridBagLayout();	
			this.jContentPaneDetalleSaldoMesProducto.setLayout(gridaBagLayoutDetalleSaldoMesProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldoMesProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
				this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSaldoMesProducto.gridx = 0;
					
				
				this.jContentPaneDetalleSaldoMesProducto.add(jTtoolBarDetalleSaldoMesProducto, gridBagConstraintsSaldoMesProducto);								
				
}
			
			this.jScrollPanelDatosEdicionSaldoMesProducto=   new JScrollPane(jContentPaneDetalleSaldoMesProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldoMesProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoMesProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoMesProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSaldoMesProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldoMesProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoMesProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoMesProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	        
			this.jContentPaneDetalleSaldoMesProducto.add(jPanelCamposSaldoMesProducto, gridBagConstraintsSaldoMesProducto);
			
			
			
			
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
						&& saldomesproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSaldoMesProducto= new GridBagConstraints();
						this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSaldoMesProducto.gridx = 0;
						this.jContentPaneDetalleSaldoMesProducto.add(this.jTabbedPaneRelacionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSaldoMesProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSaldoMesProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
					this.gridBagConstraintsSaldoMesProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSaldoMesProducto.gridx = 0;
					
				
					this.jContentPaneDetalleSaldoMesProducto.add(jPanelCamposOcultosSaldoMesProducto, gridBagConstraintsSaldoMesProducto);
				
					this.jPanelCamposOcultosSaldoMesProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	        this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSaldoMesProducto.add(this.jPanelAccionesFormularioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);							
			
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
	        this.gridBagConstraintsSaldoMesProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSaldoMesProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleSaldoMesProducto.add(this.jPanelAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSaldoMesProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSaldoMesProducto=   new JScrollPane(this.jPanelCamposSaldoMesProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldoMesProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoMesProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoMesProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;
			this.gridBagConstraintsSaldoMesProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSaldoMesProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSaldoMesProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);			
			
			this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
			this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldoMesProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
			
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		
			
		this.gridBagConstraintsSaldoMesProducto = new GridBagConstraints();
		this.gridBagConstraintsSaldoMesProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldoMesProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldoMesProducto, this.gridBagConstraintsSaldoMesProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSaldoMesProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionSaldoMesProducto;
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
