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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.VentaGeneralConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class VentaGeneralDetalleFormJInternalFrame extends VentaGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentaGeneral;
	
	protected JMenuBar jmenuBarDetalleVentaGeneral;
	
	protected JMenu jmenuDetalleVentaGeneral;
	protected JMenu jmenuDetalleArchivoVentaGeneral;
	protected JMenu jmenuDetalleAccionesVentaGeneral;
	protected JMenu jmenuDetalleDatosVentaGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentaGeneral;	
	protected GridBagConstraints gridBagConstraintsVentaGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentaGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentaGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public VentaGeneralSessionBean ventageneralSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public VentaGeneralLogic ventageneralLogic;
	
	public JScrollPane jScrollPanelDatosVentaGeneral;
	public JScrollPane jScrollPanelDatosEdicionVentaGeneral;
	public JScrollPane jScrollPanelDatosGeneralVentaGeneral;
	
	protected JPanel jPanelCamposVentaGeneral;    
	protected JPanel jPanelCamposOcultosVentaGeneral;    	
	protected JPanel jPanelAccionesVentaGeneral;
	protected JPanel jPanelAccionesFormularioVentaGeneral;
    
	
	
	protected Integer iXPanelCamposVentaGeneral=0;
	protected Integer iYPanelCamposVentaGeneral=0;
	
	protected Integer iXPanelCamposOcultosVentaGeneral=0;
	protected Integer iYPanelCamposOcultosVentaGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentaGeneral;
	public JButton jButtonModificarVentaGeneral;
	public JButton jButtonActualizarVentaGeneral;
    public JButton jButtonEliminarVentaGeneral;
	public JButton jButtonCancelarVentaGeneral;
    public JButton jButtonGuardarCambiosVentaGeneral;
	public JButton jButtonGuardarCambiosTablaVentaGeneral;
	protected JButton jButtonCerrarVentaGeneral;
	
	
	protected JButton jButtonProcesarInformacionVentaGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentaGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentaGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentaGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentaGeneral;
	protected JButton jButtonModificarToolBarVentaGeneral;
	protected JButton jButtonActualizarToolBarVentaGeneral;
    protected JButton jButtonEliminarToolBarVentaGeneral;
	protected JButton jButtonCancelarToolBarVentaGeneral;
    protected JButton jButtonGuardarCambiosToolBarVentaGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarVentaGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarVentaGeneral;
	protected JButton jButtonCerrarToolBarVentaGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarVentaGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentaGeneral;
	protected JMenuItem jMenuItemModificarVentaGeneral;
	protected JMenuItem jMenuItemActualizarVentaGeneral;
    protected JMenuItem jMenuItemEliminarVentaGeneral;
	protected JMenuItem jMenuItemCancelarVentaGeneral;
    protected JMenuItem jMenuItemGuardarCambiosVentaGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentaGeneral;
	protected JMenuItem jMenuItemCerrarVentaGeneral;
	protected JMenuItem jMenuItemDetalleCerrarVentaGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentaGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionVentaGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentaGeneral;
	protected JMenuItem jMenuItemMostrarOcultarVentaGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentaGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentaGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentaGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentaGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentaGeneral;
	public JLabel jLabelIdVentaGeneral;
	public JLabel jLabelidVentaGeneral;
	public JButton jButtonidVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeVentaGeneral;
	public JLabel jLabelfecha_desdeVentaGeneral;
	//public JFormattedTextField jDateChooserfecha_desdeVentaGeneral;

	public JDateChooser jDateChooserfecha_desdeVentaGeneral;
	public JButton jButtonfecha_desdeVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaVentaGeneral;
	public JLabel jLabelfecha_hastaVentaGeneral;
	//public JFormattedTextField jDateChooserfecha_hastaVentaGeneral;

	public JDateChooser jDateChooserfecha_hastaVentaGeneral;
	public JButton jButtonfecha_hastaVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoVentaGeneral;
	public JLabel jLabelnombre_productoVentaGeneral;
	public JTextArea jTextAreanombre_productoVentaGeneral;
	public JScrollPane jscrollPanenombre_productoVentaGeneral;
	public JButton jButtonnombre_productoVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteVentaGeneral;
	public JLabel jLabelnombre_clienteVentaGeneral;
	public JTextArea jTextAreanombre_clienteVentaGeneral;
	public JScrollPane jscrollPanenombre_clienteVentaGeneral;
	public JButton jButtonnombre_clienteVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfechaVentaGeneral;
	public JLabel jLabelfechaVentaGeneral;
	//public JFormattedTextField jDateChooserfechaVentaGeneral;

	public JDateChooser jDateChooserfechaVentaGeneral;
	public JButton jButtonfechaVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialVentaGeneral;
	public JLabel jLabelsecuencialVentaGeneral;
	public JTextField jTextFieldsecuencialVentaGeneral;
	public JButton jButtonsecuencialVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcantidadVentaGeneral;
	public JLabel jLabelcantidadVentaGeneral;
	public JTextField jTextFieldcantidadVentaGeneral;
	public JButton jButtoncantidadVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelprecioVentaGeneral;
	public JLabel jLabelprecioVentaGeneral;
	public JTextField jTextFieldprecioVentaGeneral;
	public JButton jButtonprecioVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoVentaGeneral;
	public JLabel jLabeldescuentoVentaGeneral;
	public JTextField jTextFielddescuentoVentaGeneral;
	public JButton jButtondescuentoVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelivaVentaGeneral;
	public JLabel jLabelivaVentaGeneral;
	public JTextField jTextFieldivaVentaGeneral;
	public JButton jButtonivaVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPaneliceVentaGeneral;
	public JLabel jLabeliceVentaGeneral;
	public JTextField jTextFieldiceVentaGeneral;
	public JButton jButtoniceVentaGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentaGeneral;
	public JLabel jLabelid_empresaVentaGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentaGeneral;
	public JButton jButtonid_empresaVentaGeneral= new JButtonMe();
	public JButton jButtonid_empresaVentaGeneralUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentaGeneral;
	public JLabel jLabelid_sucursalVentaGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentaGeneral;
	public JButton jButtonid_sucursalVentaGeneral= new JButtonMe();
	public JButton jButtonid_sucursalVentaGeneralUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteVentaGeneral;
	public JLabel jLabelid_clienteVentaGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteVentaGeneral;
	public JButton jButtonid_clienteVentaGeneral= new JButtonMe();
	public JButton jButtonid_clienteVentaGeneralUpdate= new JButtonMe();
	public JButton jButtonid_clienteVentaGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_productoVentaGeneral;
	public JLabel jLabelid_productoVentaGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoVentaGeneral;
	public JButton jButtonid_productoVentaGeneral= new JButtonMe();
	public JButton jButtonid_productoVentaGeneralUpdate= new JButtonMe();
	public JButton jButtonid_productoVentaGeneralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentaGeneral;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentaGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentaGeneral=new JPanel();
				this.jPanelAccionesFormularioVentaGeneral=new JPanel();
				this.jmenuBarDetalleVentaGeneral=new JMenuBar();
				this.jTtoolBarDetalleVentaGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentaGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentaGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentaGeneral() {
		return this.jButtonActualizarToolBarVentaGeneral;
	}
	
	public JButton getjButtonEliminarToolBarVentaGeneral() {
		return this.jButtonEliminarToolBarVentaGeneral;
	}
	
	public JButton getjButtonCancelarToolBarVentaGeneral() {
		return this.jButtonCancelarToolBarVentaGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionVentaGeneral() {
		return this.jButtonProcesarInformacionVentaGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentaGeneral)	{
		this.jButtonProcesarInformacionVentaGeneral = jButtonProcesarInformacionVentaGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentaGeneral() {
		return this.jComboBoxTiposAccionesVentaGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentaGeneral(
			JComboBox jComboBoxTiposRelacionesVentaGeneral) {
		this.jComboBoxTiposRelacionesVentaGeneral = jComboBoxTiposRelacionesVentaGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentaGeneral(
			JComboBox jComboBoxTiposAccionesVentaGeneral) {
		this.jComboBoxTiposAccionesVentaGeneral = jComboBoxTiposAccionesVentaGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentaGeneral() {
		return this.jComboBoxTiposAccionesFormularioVentaGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentaGeneral(
			JComboBox jComboBoxTiposAccionesFormularioVentaGeneral) {
		this.jComboBoxTiposAccionesFormularioVentaGeneral = jComboBoxTiposAccionesFormularioVentaGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventageneralSessionBean=new VentaGeneralSessionBean();
		
		this.ventageneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventageneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventageneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentaGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentaGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Venta General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
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
	
		VentaGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentaGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentaGeneral=new JButtonMe();
				this.jButtonModificarToolBarVentaGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral,
							"actualizar","actualizar","Actualizar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral,
							"eliminar","eliminar","Eliminar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral,
							"cancelar","cancelar","Cancelar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentaGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentaGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentaGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentaGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentaGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentaGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentaGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentaGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentaGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentaGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentaGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentaGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentaGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentaGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentaGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentaGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentaGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentaGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentaGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentaGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentaGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentaGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentaGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentaGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentaGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentaGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentaGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentaGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentaGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentaGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentaGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentaGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentaGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentaGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentaGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentaGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentaGeneral.add(this.jMenuItemDetalleCerrarVentaGeneral);
		
		this.jmenuDetalleAccionesVentaGeneral.add(this.jMenuItemActualizarVentaGeneral);
		this.jmenuDetalleAccionesVentaGeneral.add(this.jMenuItemEliminarVentaGeneral);
		this.jmenuDetalleAccionesVentaGeneral.add(this.jMenuItemCancelarVentaGeneral);		
		
		//this.jmenuDetalleDatosVentaGeneral.add(this.jMenuItemDetalleAbrirOrderByVentaGeneral);				
		this.jmenuDetalleDatosVentaGeneral.add(this.jMenuItemDetalleMostarOcultarVentaGeneral);				
				
		//this.jmenuDetalleAccionesVentaGeneral.add(this.jMenuItemGuardarCambiosVentaGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentaGeneral.add(this.jmenuDetalleArchivoVentaGeneral);		
		this.jmenuBarDetalleVentaGeneral.add(this.jmenuDetalleAccionesVentaGeneral);		
		this.jmenuBarDetalleVentaGeneral.add(this.jmenuDetalleDatosVentaGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentaGeneral);				
	}
	
	
	public void inicializarElementosCamposVentaGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentaGeneral = new JLabelMe();
		jLabelIdVentaGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentaGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentaGeneral= new GridBagLayout();

		this.jPanelidVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);

		jLabelidVentaGeneral = new JLabel();
		jLabelidVentaGeneral.setText("Id");

		jLabelidVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeVentaGeneral = new JLabelMe();
		this.jLabelfecha_desdeVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeVentaGeneral.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelfecha_desdeVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		//jFormattedTextFieldfecha_desdeVentaGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeVentaGeneral= new JDateChooser();
		jDateChooserfecha_desdeVentaGeneral.setEnabled(false);
		jDateChooserfecha_desdeVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeVentaGeneral.setDate(new Date());
		jDateChooserfecha_desdeVentaGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeVentaGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeVentaGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_desdeVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeVentaGeneralBusqueda.setText("U");
		this.jButtonfecha_desdeVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaVentaGeneral = new JLabelMe();
		this.jLabelfecha_hastaVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaVentaGeneral.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelfecha_hastaVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		//jFormattedTextFieldfecha_hastaVentaGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaVentaGeneral= new JDateChooser();
		jDateChooserfecha_hastaVentaGeneral.setEnabled(false);
		jDateChooserfecha_hastaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaVentaGeneral.setDate(new Date());
		jDateChooserfecha_hastaVentaGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaVentaGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaVentaGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_hastaVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaVentaGeneralBusqueda.setText("U");
		this.jButtonfecha_hastaVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoVentaGeneral = new JLabelMe();
		this.jLabelnombre_productoVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoVentaGeneral.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelnombre_productoVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextAreanombre_productoVentaGeneral= new JTextAreaMe();
		jTextAreanombre_productoVentaGeneral.setEnabled(false);
		jTextAreanombre_productoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaGeneral.setLineWrap(true);
		jTextAreanombre_productoVentaGeneral.setWrapStyleWord(true);
		jTextAreanombre_productoVentaGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoVentaGeneral.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoVentaGeneral = new JScrollPane(jTextAreanombre_productoVentaGeneral);
		jscrollPanenombre_productoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoVentaGeneralBusqueda= new JButtonMe();
		this.jButtonnombre_productoVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoVentaGeneralBusqueda.setText("U");
		this.jButtonnombre_productoVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteVentaGeneral = new JLabelMe();
		this.jLabelnombre_clienteVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteVentaGeneral.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelnombre_clienteVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextAreanombre_clienteVentaGeneral= new JTextAreaMe();
		jTextAreanombre_clienteVentaGeneral.setEnabled(false);
		jTextAreanombre_clienteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteVentaGeneral.setLineWrap(true);
		jTextAreanombre_clienteVentaGeneral.setWrapStyleWord(true);
		jTextAreanombre_clienteVentaGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteVentaGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteVentaGeneral = new JScrollPane(jTextAreanombre_clienteVentaGeneral);
		jscrollPanenombre_clienteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteVentaGeneralBusqueda= new JButtonMe();
		this.jButtonnombre_clienteVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteVentaGeneralBusqueda.setText("U");
		this.jButtonnombre_clienteVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfechaVentaGeneral = new JLabelMe();
		this.jLabelfechaVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaVentaGeneral.setToolTipText("Fecha");
		this.jLabelfechaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelfechaVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		//jFormattedTextFieldfechaVentaGeneral= new JFormattedTextFieldMe();

		jDateChooserfechaVentaGeneral= new JDateChooser();
		jDateChooserfechaVentaGeneral.setEnabled(false);
		jDateChooserfechaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaVentaGeneral.setDate(new Date());
		jDateChooserfechaVentaGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaVentaGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaVentaGeneralBusqueda= new JButtonMe();
		this.jButtonfechaVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaVentaGeneralBusqueda.setText("U");
		this.jButtonfechaVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialVentaGeneral = new JLabelMe();
		this.jLabelsecuencialVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialVentaGeneral.setToolTipText("Secuencial");
		this.jLabelsecuencialVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelsecuencialVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFieldsecuencialVentaGeneral= new JTextFieldMe();

		jTextFieldsecuencialVentaGeneral.setEnabled(false);
		jTextFieldsecuencialVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialVentaGeneralBusqueda= new JButtonMe();
		this.jButtonsecuencialVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialVentaGeneralBusqueda.setText("U");
		this.jButtonsecuencialVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcantidadVentaGeneral = new JLabelMe();
		this.jLabelcantidadVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadVentaGeneral.setToolTipText("Cantad");
		this.jLabelcantidadVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelcantidadVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFieldcantidadVentaGeneral= new JTextFieldMe();
		jTextFieldcantidadVentaGeneral.setEnabled(false);
		jTextFieldcantidadVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadVentaGeneral.setText("0.0");

		this.jButtoncantidadVentaGeneralBusqueda= new JButtonMe();
		this.jButtoncantidadVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadVentaGeneralBusqueda.setText("U");
		this.jButtoncantidadVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelprecioVentaGeneral = new JLabelMe();
		this.jLabelprecioVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioVentaGeneral.setToolTipText("Precio");
		this.jLabelprecioVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelprecioVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFieldprecioVentaGeneral= new JTextFieldMe();
		jTextFieldprecioVentaGeneral.setEnabled(false);
		jTextFieldprecioVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioVentaGeneral.setText("0.0");

		this.jButtonprecioVentaGeneralBusqueda= new JButtonMe();
		this.jButtonprecioVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioVentaGeneralBusqueda.setText("U");
		this.jButtonprecioVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoVentaGeneral = new JLabelMe();
		this.jLabeldescuentoVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoVentaGeneral.setToolTipText("Descuento");
		this.jLabeldescuentoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPaneldescuentoVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFielddescuentoVentaGeneral= new JTextFieldMe();
		jTextFielddescuentoVentaGeneral.setEnabled(false);
		jTextFielddescuentoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoVentaGeneral.setText("0.0");

		this.jButtondescuentoVentaGeneralBusqueda= new JButtonMe();
		this.jButtondescuentoVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoVentaGeneralBusqueda.setText("U");
		this.jButtondescuentoVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabelivaVentaGeneral = new JLabelMe();
		this.jLabelivaVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaVentaGeneral.setToolTipText("Iva");
		this.jLabelivaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelivaVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFieldivaVentaGeneral= new JTextFieldMe();
		jTextFieldivaVentaGeneral.setEnabled(false);
		jTextFieldivaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaVentaGeneral.setText("0.0");

		this.jButtonivaVentaGeneralBusqueda= new JButtonMe();
		this.jButtonivaVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaVentaGeneralBusqueda.setText("U");
		this.jButtonivaVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaVentaGeneralBusqueda.setVisible(false);		}


					
		this.jLabeliceVentaGeneral = new JLabelMe();
		this.jLabeliceVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceVentaGeneral.setToolTipText("Ice");
		this.jLabeliceVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPaneliceVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jTextFieldiceVentaGeneral= new JTextFieldMe();
		jTextFieldiceVentaGeneral.setEnabled(false);
		jTextFieldiceVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceVentaGeneral.setText("0.0");

		this.jButtoniceVentaGeneralBusqueda= new JButtonMe();
		this.jButtoniceVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceVentaGeneralBusqueda.setText("U");
		this.jButtoniceVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceVentaGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentaGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentaGeneral = new JLabelMe();
		this.jLabelid_empresaVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentaGeneral.setToolTipText("Empresa");
		this.jLabelid_empresaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelid_empresaVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jComboBoxid_empresaVentaGeneral= new JComboBoxMe();
		jComboBoxid_empresaVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentaGeneral.setEnabled(false);

		this.jButtonid_empresaVentaGeneral= new JButtonMe();
		this.jButtonid_empresaVentaGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaGeneral.setText("Buscar");
		this.jButtonid_empresaVentaGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentaGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaGeneral"));

		this.jButtonid_empresaVentaGeneralBusqueda= new JButtonMe();
		this.jButtonid_empresaVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentaGeneralBusqueda.setText("U");
		this.jButtonid_empresaVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentaGeneralBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentaGeneralUpdate= new JButtonMe();
		this.jButtonid_empresaVentaGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentaGeneralUpdate.setText("U");
		this.jButtonid_empresaVentaGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentaGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaGeneralUpdate"));



					
		this.jLabelid_sucursalVentaGeneral = new JLabelMe();
		this.jLabelid_sucursalVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentaGeneral.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelid_sucursalVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jComboBoxid_sucursalVentaGeneral= new JComboBoxMe();
		jComboBoxid_sucursalVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentaGeneral.setEnabled(false);

		this.jButtonid_sucursalVentaGeneral= new JButtonMe();
		this.jButtonid_sucursalVentaGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaGeneral.setText("Buscar");
		this.jButtonid_sucursalVentaGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentaGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaGeneral"));

		this.jButtonid_sucursalVentaGeneralBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentaGeneralBusqueda.setText("U");
		this.jButtonid_sucursalVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentaGeneralBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentaGeneralUpdate= new JButtonMe();
		this.jButtonid_sucursalVentaGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentaGeneralUpdate.setText("U");
		this.jButtonid_sucursalVentaGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentaGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaGeneralUpdate"));



					
		this.jLabelid_clienteVentaGeneral = new JLabelMe();
		this.jLabelid_clienteVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteVentaGeneral.setToolTipText("Cliente");
		this.jLabelid_clienteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelid_clienteVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jComboBoxid_clienteVentaGeneral= new JComboBoxMe();
		jComboBoxid_clienteVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_clienteVentaGeneral.setEnabled(false);

		this.jButtonid_clienteVentaGeneral= new JButtonMe();
		this.jButtonid_clienteVentaGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVentaGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVentaGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVentaGeneral.setText("Buscar");
		this.jButtonid_clienteVentaGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteVentaGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVentaGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVentaGeneral"));

		this.jButtonid_clienteVentaGeneralBusqueda= new JButtonMe();
		this.jButtonid_clienteVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteVentaGeneralBusqueda.setText("U");
		this.jButtonid_clienteVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteVentaGeneralBusqueda.setVisible(false);		}

		this.jButtonid_clienteVentaGeneralUpdate= new JButtonMe();
		this.jButtonid_clienteVentaGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVentaGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVentaGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteVentaGeneralUpdate.setText("U");
		this.jButtonid_clienteVentaGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteVentaGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVentaGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVentaGeneralUpdate"));



					
		this.jLabelid_productoVentaGeneral = new JLabelMe();
		this.jLabelid_productoVentaGeneral.setText(""+VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoVentaGeneral.setToolTipText("Producto");
		this.jLabelid_productoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoVentaGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoVentaGeneral.setToolTipText(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutVentaGeneral = new GridBagLayout();
		this.jPanelid_productoVentaGeneral.setLayout(this.gridaBagLayoutVentaGeneral);


		jComboBoxid_productoVentaGeneral= new JComboBoxMe();
		jComboBoxid_productoVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_productoVentaGeneral.setEnabled(false);

		this.jButtonid_productoVentaGeneral= new JButtonMe();
		this.jButtonid_productoVentaGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaGeneral.setText("Buscar");
		this.jButtonid_productoVentaGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoVentaGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaGeneral"));

		this.jButtonid_productoVentaGeneralBusqueda= new JButtonMe();
		this.jButtonid_productoVentaGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoVentaGeneralBusqueda.setText("U");
		this.jButtonid_productoVentaGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoVentaGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaGeneralBusqueda"));

		if(this.ventageneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoVentaGeneralBusqueda.setVisible(false);		}

		this.jButtonid_productoVentaGeneralUpdate= new JButtonMe();
		this.jButtonid_productoVentaGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoVentaGeneralUpdate.setText("U");
		this.jButtonid_productoVentaGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoVentaGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaGeneralUpdate"));



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
		//this.jInternalFrameDetalleVentaGeneral = new VentaGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Venta General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentaGeneral= new GridBagLayout();
		

		
		String sToolTipVentaGeneral="";
		sToolTipVentaGeneral=VentaGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentaGeneral+="(PuntoVenta.VentaGeneral)";
		}
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentaGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentaGeneral = new JButtonMe();
		this.jButtonModificarVentaGeneral = new JButtonMe();
        this.jButtonActualizarVentaGeneral = new JButtonMe();
        this.jButtonEliminarVentaGeneral = new JButtonMe();
        this.jButtonCancelarVentaGeneral = new JButtonMe();
        this.jButtonGuardarCambiosVentaGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentaGeneral = new JButtonMe();
		this.jButtonCerrarVentaGeneral = new JButtonMe();
		
		this.jScrollPanelDatosVentaGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentaGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralVentaGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Venta General";
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosVentaGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentaGeneral.setName("jPanelCamposVentaGeneral"); 

		this.jPanelCamposOcultosVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentaGeneral.setName("jPanelCamposOcultosVentaGeneral"); 

        this.jPanelAccionesVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentaGeneral.setToolTipText("Acciones");
        this.jPanelAccionesVentaGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentaGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentaGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentaGeneral.setText("Nuevo");
		this.jButtonModificarVentaGeneral.setText("Editar");
        this.jButtonActualizarVentaGeneral.setText("Actualizar");
        this.jButtonEliminarVentaGeneral.setText("Eliminar");
        this.jButtonCancelarVentaGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosVentaGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentaGeneral.setText("Guardar");
		this.jButtonCerrarVentaGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentaGeneral,"nuevo_button","Nuevo",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentaGeneral,"modificar_button","Editar",this.ventageneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentaGeneral,"actualizar_button","Actualizar",this.ventageneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentaGeneral,"eliminar_button","Eliminar",this.ventageneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentaGeneral,"cancelar_button","Cancelar",this.ventageneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentaGeneral,"guardarcambios_button","Guardar",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentaGeneral,"guardarcambiostabla_button","Guardar",this.ventageneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentaGeneral,"cerrar_button","Salir",this.ventageneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentaGeneral.setToolTipText("Nuevo"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentaGeneral.setToolTipText("Editar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentaGeneral.setToolTipText("Actualizar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentaGeneral.setToolTipText("Eliminar)"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentaGeneral.setToolTipText("Cancelar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentaGeneral.setToolTipText("Guardar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentaGeneral.setToolTipText("Guardar"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentaGeneral.setToolTipText("Salir"+" "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentaGeneral";
		inputMap = this.jButtonNuevoVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentaGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentaGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentaGeneral";
		inputMap = this.jButtonActualizarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentaGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarVentaGeneral";
		inputMap = this.jButtonEliminarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentaGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarVentaGeneral";
		inputMap = this.jButtonCancelarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentaGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarVentaGeneral";
		inputMap = this.jButtonCerrarVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentaGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentaGeneral";
		inputMap = this.jButtonGuardarCambiosTablaVentaGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentaGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentaGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentaGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentaGeneral.setToolTipText("Nuevo VentaGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentaGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentaGeneral.setToolTipText("Sin Cerrar Ventana VentaGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentaGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentaGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentaGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentaGeneral.setText("Accion");
		this.jComboBoxTiposAccionesVentaGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentaGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentaGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentaGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentaGeneral = new JLabelMe();
		
		this.jLabelAccionesVentaGeneral.setText("Acciones");		
		this.jLabelAccionesVentaGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentaGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentaGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentaGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesVentaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentaGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentaGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentaGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentaGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentaGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentaGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentaGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentaGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentaGeneral = new GridBagLayout();
		
		this.jPanelCamposVentaGeneral.setLayout(gridaBagLayoutCamposVentaGeneral);
		this.jPanelCamposOcultosVentaGeneral.setLayout(gridaBagLayoutCamposOcultosVentaGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentaGeneral.add(jLabelIdVentaGeneral, this.gridBagConstraintsVentaGeneral);



	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentaGeneral.add(jLabelidVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentaGeneral.add(jLabelid_empresaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentaGeneral.add(jButtonid_empresaVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 3;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentaGeneral.add(jButtonid_empresaVentaGeneralUpdate, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentaGeneral.add(jComboBoxid_empresaVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentaGeneral.add(jLabelid_sucursalVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentaGeneral.add(jButtonid_sucursalVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 3;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentaGeneral.add(jButtonid_sucursalVentaGeneralUpdate, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentaGeneral.add(jComboBoxid_sucursalVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteVentaGeneral.add(jLabelid_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteVentaGeneral.add(jButtonid_clienteVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 3;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteVentaGeneral.add(jButtonid_clienteVentaGeneralUpdate, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteVentaGeneral.add(jComboBoxid_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoVentaGeneral.add(jLabelid_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoVentaGeneral.add(jButtonid_productoVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 3;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoVentaGeneral.add(jButtonid_productoVentaGeneralUpdate, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoVentaGeneral.add(jComboBoxid_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeVentaGeneral.add(jLabelfecha_desdeVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeVentaGeneral.add(jButtonfecha_desdeVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeVentaGeneral.add(jDateChooserfecha_desdeVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaVentaGeneral.add(jLabelfecha_hastaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaVentaGeneral.add(jButtonfecha_hastaVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaVentaGeneral.add(jDateChooserfecha_hastaVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoVentaGeneral.add(jLabelnombre_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoVentaGeneral.add(jButtonnombre_productoVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoVentaGeneral.add(jscrollPanenombre_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteVentaGeneral.add(jLabelnombre_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteVentaGeneral.add(jButtonnombre_clienteVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteVentaGeneral.add(jscrollPanenombre_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaVentaGeneral.add(jLabelfechaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaVentaGeneral.add(jButtonfechaVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaVentaGeneral.add(jDateChooserfechaVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialVentaGeneral.add(jLabelsecuencialVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialVentaGeneral.add(jButtonsecuencialVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialVentaGeneral.add(jTextFieldsecuencialVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadVentaGeneral.add(jLabelcantidadVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadVentaGeneral.add(jButtoncantidadVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadVentaGeneral.add(jTextFieldcantidadVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioVentaGeneral.add(jLabelprecioVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioVentaGeneral.add(jButtonprecioVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioVentaGeneral.add(jTextFieldprecioVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoVentaGeneral.add(jLabeldescuentoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoVentaGeneral.add(jButtondescuentoVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoVentaGeneral.add(jTextFielddescuentoVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaVentaGeneral.add(jLabelivaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaVentaGeneral.add(jButtonivaVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaVentaGeneral.add(jTextFieldivaVentaGeneral, this.gridBagConstraintsVentaGeneral);


	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 0;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceVentaGeneral.add(jLabeliceVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		//this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = 2;
		this.gridBagConstraintsVentaGeneral.ipadx = 0;
		this.gridBagConstraintsVentaGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceVentaGeneral.add(jButtoniceVentaGeneralBusqueda, this.gridBagConstraintsVentaGeneral);
	}

	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaGeneral.gridy = 0;
	this.gridBagConstraintsVentaGeneral.gridx = 1;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceVentaGeneral.add(jTextFieldiceVentaGeneral, this.gridBagConstraintsVentaGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelidVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelfecha_desdeVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelfecha_hastaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelnombre_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelnombre_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelfechaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelsecuencialVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelcantidadVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelprecioVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPaneldescuentoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPanelivaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaGeneral.add(this.jPaneliceVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposVentaGeneral % 2==0) {
		iXPanelCamposVentaGeneral=0;
		iYPanelCamposVentaGeneral++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposOcultosVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposOcultosVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaGeneral.add(this.jPanelid_empresaVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposOcultosVentaGeneral % 2==0) {
		iXPanelCamposOcultosVentaGeneral=0;
		iYPanelCamposOcultosVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposOcultosVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposOcultosVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaGeneral.add(this.jPanelid_sucursalVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposOcultosVentaGeneral % 2==0) {
		iXPanelCamposOcultosVentaGeneral=0;
		iYPanelCamposOcultosVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposOcultosVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposOcultosVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaGeneral.add(this.jPanelid_clienteVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposOcultosVentaGeneral % 2==0) {
		iXPanelCamposOcultosVentaGeneral=0;
		iYPanelCamposOcultosVentaGeneral++;
	}
	this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaGeneral.gridy = iYPanelCamposOcultosVentaGeneral;
	this.gridBagConstraintsVentaGeneral.gridx = iXPanelCamposOcultosVentaGeneral++;
	this.gridBagConstraintsVentaGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaGeneral.add(this.jPanelid_productoVentaGeneral, this.gridBagConstraintsVentaGeneral);



	if(iXPanelCamposOcultosVentaGeneral % 2==0) {
		iXPanelCamposOcultosVentaGeneral=0;
		iYPanelCamposOcultosVentaGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentaGeneral= new GridBagLayout();
		this.jPanelAccionesVentaGeneral.setLayout(gridaBagLayoutAccionesVentaGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentaGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioVentaGeneral.setLayout(gridaBagLayoutAccionesFormularioVentaGeneral);
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentaGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentaGeneral.add(this.jComboBoxTiposAccionesFormularioVentaGeneral, this.gridBagConstraintsVentaGeneral);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentaGeneral.add(this.jButtonModificarVentaGeneral, this.gridBagConstraintsVentaGeneral);							

		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaGeneral.gridy = 0;
		this.gridBagConstraintsVentaGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentaGeneral.add(this.jButtonEliminarVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = 0;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentaGeneral.add(this.jButtonActualizarVentaGeneral, this.gridBagConstraintsVentaGeneral);


		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = 0;		
		this.gridBagConstraintsVentaGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentaGeneral.add(this.jButtonGuardarCambiosVentaGeneral, this.gridBagConstraintsVentaGeneral);	
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = 0;		
		this.gridBagConstraintsVentaGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentaGeneral.add(this.jButtonCancelarVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentaGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentaGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();						
			this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaGeneral.gridx = 0;		
			//this.gridBagConstraintsVentaGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentaGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentaGeneral.gridx =0;
		this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentaGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentaGeneral, this.gridBagConstraintsVentaGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentaGeneral = new VentaGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Venta General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Venta General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Venta General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentaGeneralModel ventageneralModel=new VentaGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//VentaGeneralModel.VentaGeneralFocusTraversalPolicy ventageneralFocusTraversalPolicy = ventageneralModel.new VentaGeneralFocusTraversalPolicy(this);
			
			//ventageneralFocusTraversalPolicy.setventageneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventageneralModel);
			
			
			this.jContentPaneDetalleVentaGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentaGeneral = new GridBagLayout();	
			this.jContentPaneDetalleVentaGeneral.setLayout(gridaBagLayoutDetalleVentaGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentaGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
				this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentaGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleVentaGeneral.add(jTtoolBarDetalleVentaGeneral, gridBagConstraintsVentaGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionVentaGeneral=   new JScrollPane(jContentPaneDetalleVentaGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentaGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentaGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentaGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentaGeneral.gridx = 0;
	        
			this.jContentPaneDetalleVentaGeneral.add(jPanelCamposVentaGeneral, gridBagConstraintsVentaGeneral);
			
			
			
			
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
						//&& ventageneralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentaGeneral= new GridBagConstraints();
						this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentaGeneral.gridx = 0;
						this.jContentPaneDetalleVentaGeneral.add(this.jTabbedPaneRelacionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentaGeneral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentaGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
					this.gridBagConstraintsVentaGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentaGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleVentaGeneral.add(jPanelCamposOcultosVentaGeneral, gridBagConstraintsVentaGeneral);
				
					this.jPanelCamposOcultosVentaGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentaGeneral.gridx = 0;
	        this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentaGeneral.add(this.jPanelAccionesFormularioVentaGeneral, this.gridBagConstraintsVentaGeneral);							
			
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
	        this.gridBagConstraintsVentaGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentaGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleVentaGeneral.add(this.jPanelAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentaGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentaGeneral=   new JScrollPane(this.jPanelCamposVentaGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentaGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentaGeneral.gridx = 0;
			this.gridBagConstraintsVentaGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentaGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentaGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentaGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentaGeneral, this.gridBagConstraintsVentaGeneral);			
			
			this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
			this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentaGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentaGeneral, this.gridBagConstraintsVentaGeneral);
			
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentaGeneral, this.gridBagConstraintsVentaGeneral);
		
			
		this.gridBagConstraintsVentaGeneral = new GridBagConstraints();
		this.gridBagConstraintsVentaGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentaGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentaGeneral, this.gridBagConstraintsVentaGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentaGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionVentaGeneral;
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
