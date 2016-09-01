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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasResumidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasResumidosDetalleFormJInternalFrame extends VentasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasResumidos;
	
	protected JMenuBar jmenuBarDetalleVentasResumidos;
	
	protected JMenu jmenuDetalleVentasResumidos;
	protected JMenu jmenuDetalleArchivoVentasResumidos;
	protected JMenu jmenuDetalleAccionesVentasResumidos;
	protected JMenu jmenuDetalleDatosVentasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidos;	
	protected GridBagConstraints gridBagConstraintsVentasResumidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasResumidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasResumidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasResumidosSessionBean ventasresumidosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public VentasResumidosLogic ventasresumidosLogic;
	
	public JScrollPane jScrollPanelDatosVentasResumidos;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidos;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidos;
	
	protected JPanel jPanelCamposVentasResumidos;    
	protected JPanel jPanelCamposOcultosVentasResumidos;    	
	protected JPanel jPanelAccionesVentasResumidos;
	protected JPanel jPanelAccionesFormularioVentasResumidos;
    
	
	
	protected Integer iXPanelCamposVentasResumidos=0;
	protected Integer iYPanelCamposVentasResumidos=0;
	
	protected Integer iXPanelCamposOcultosVentasResumidos=0;
	protected Integer iYPanelCamposOcultosVentasResumidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasResumidos;
	public JButton jButtonModificarVentasResumidos;
	public JButton jButtonActualizarVentasResumidos;
    public JButton jButtonEliminarVentasResumidos;
	public JButton jButtonCancelarVentasResumidos;
    public JButton jButtonGuardarCambiosVentasResumidos;
	public JButton jButtonGuardarCambiosTablaVentasResumidos;
	protected JButton jButtonCerrarVentasResumidos;
	
	
	protected JButton jButtonProcesarInformacionVentasResumidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasResumidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidos;
	protected JButton jButtonModificarToolBarVentasResumidos;
	protected JButton jButtonActualizarToolBarVentasResumidos;
    protected JButton jButtonEliminarToolBarVentasResumidos;
	protected JButton jButtonCancelarToolBarVentasResumidos;
    protected JButton jButtonGuardarCambiosToolBarVentasResumidos;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidos;
	protected JButton jButtonCerrarToolBarVentasResumidos;
	
	protected JButton jButtonProcesarInformacionToolBarVentasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidos;
	protected JMenuItem jMenuItemModificarVentasResumidos;
	protected JMenuItem jMenuItemActualizarVentasResumidos;
    protected JMenuItem jMenuItemEliminarVentasResumidos;
	protected JMenuItem jMenuItemCancelarVentasResumidos;
    protected JMenuItem jMenuItemGuardarCambiosVentasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidos;
	protected JMenuItem jMenuItemCerrarVentasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidos;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasResumidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasResumidos;
	public JLabel jLabelIdVentasResumidos;
	public JLabel jLabelidVentasResumidos;
	public JButton jButtonidVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasResumidos;
	public JLabel jLabelfecha_emision_desdeVentasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeVentasResumidos;
	public JButton jButtonfecha_emision_desdeVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasResumidos;
	public JLabel jLabelfecha_emision_hastaVentasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaVentasResumidos;
	public JButton jButtonfecha_emision_hastaVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoVentasResumidos;
	public JLabel jLabelnombre_completoVentasResumidos;
	public JTextArea jTextAreanombre_completoVentasResumidos;
	public JScrollPane jscrollPanenombre_completoVentasResumidos;
	public JButton jButtonnombre_completoVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelrucVentasResumidos;
	public JLabel jLabelrucVentasResumidos;
	public JTextField jTextFieldrucVentasResumidos;
	public JButton jButtonrucVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoVentasResumidos;
	public JLabel jLabelnombre_productoVentasResumidos;
	public JTextArea jTextAreanombre_productoVentasResumidos;
	public JScrollPane jscrollPanenombre_productoVentasResumidos;
	public JButton jButtonnombre_productoVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadVentasResumidos;
	public JLabel jLabelcantidadVentasResumidos;
	public JTextField jTextFieldcantidadVentasResumidos;
	public JButton jButtoncantidadVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelprecioVentasResumidos;
	public JLabel jLabelprecioVentasResumidos;
	public JTextField jTextFieldprecioVentasResumidos;
	public JButton jButtonprecioVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelmontoVentasResumidos;
	public JLabel jLabelmontoVentasResumidos;
	public JTextField jTextFieldmontoVentasResumidos;
	public JButton jButtonmontoVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoVentasResumidos;
	public JLabel jLabelcodigo_productoVentasResumidos;
	public JTextField jTextFieldcodigo_productoVentasResumidos;
	public JButton jButtoncodigo_productoVentasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasResumidos;
	public JLabel jLabelid_empresaVentasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasResumidos;
	public JButton jButtonid_empresaVentasResumidos= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentasResumidos;
	public JLabel jLabelid_sucursalVentasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentasResumidos;
	public JButton jButtonid_sucursalVentasResumidos= new JButtonMe();
	public JButton jButtonid_sucursalVentasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentasResumidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasResumidos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasResumidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasResumidos=new JPanel();
				this.jPanelAccionesFormularioVentasResumidos=new JPanel();
				this.jmenuBarDetalleVentasResumidos=new JMenuBar();
				this.jTtoolBarDetalleVentasResumidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasResumidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasResumidos() {
		return this.jButtonActualizarToolBarVentasResumidos;
	}
	
	public JButton getjButtonEliminarToolBarVentasResumidos() {
		return this.jButtonEliminarToolBarVentasResumidos;
	}
	
	public JButton getjButtonCancelarToolBarVentasResumidos() {
		return this.jButtonCancelarToolBarVentasResumidos;
	}		
	
	public JButton getjButtonProcesarInformacionVentasResumidos() {
		return this.jButtonProcesarInformacionVentasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidos)	{
		this.jButtonProcesarInformacionVentasResumidos = jButtonProcesarInformacionVentasResumidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidos() {
		return this.jComboBoxTiposAccionesVentasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidos(
			JComboBox jComboBoxTiposRelacionesVentasResumidos) {
		this.jComboBoxTiposRelacionesVentasResumidos = jComboBoxTiposRelacionesVentasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidos(
			JComboBox jComboBoxTiposAccionesVentasResumidos) {
		this.jComboBoxTiposAccionesVentasResumidos = jComboBoxTiposAccionesVentasResumidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasResumidos() {
		return this.jComboBoxTiposAccionesFormularioVentasResumidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasResumidos(
			JComboBox jComboBoxTiposAccionesFormularioVentasResumidos) {
		this.jComboBoxTiposAccionesFormularioVentasResumidos = jComboBoxTiposAccionesFormularioVentasResumidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
		
		this.ventasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasResumidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasResumidos=new JButtonMe();
				this.jButtonModificarToolBarVentasResumidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos,
							"actualizar","actualizar","Actualizar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos,
							"eliminar","eliminar","Eliminar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos,
							"cancelar","cancelar","Cancelar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasResumidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasResumidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasResumidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasResumidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasResumidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasResumidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasResumidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasResumidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasResumidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasResumidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasResumidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasResumidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasResumidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasResumidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasResumidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasResumidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasResumidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasResumidos.add(this.jMenuItemDetalleCerrarVentasResumidos);
		
		this.jmenuDetalleAccionesVentasResumidos.add(this.jMenuItemActualizarVentasResumidos);
		this.jmenuDetalleAccionesVentasResumidos.add(this.jMenuItemEliminarVentasResumidos);
		this.jmenuDetalleAccionesVentasResumidos.add(this.jMenuItemCancelarVentasResumidos);		
		
		//this.jmenuDetalleDatosVentasResumidos.add(this.jMenuItemDetalleAbrirOrderByVentasResumidos);				
		this.jmenuDetalleDatosVentasResumidos.add(this.jMenuItemDetalleMostarOcultarVentasResumidos);				
				
		//this.jmenuDetalleAccionesVentasResumidos.add(this.jMenuItemGuardarCambiosVentasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasResumidos.add(this.jmenuDetalleArchivoVentasResumidos);		
		this.jmenuBarDetalleVentasResumidos.add(this.jmenuDetalleAccionesVentasResumidos);		
		this.jmenuBarDetalleVentasResumidos.add(this.jmenuDetalleDatosVentasResumidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasResumidos);				
	}
	
	
	public void inicializarElementosCamposVentasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasResumidos = new JLabelMe();
		jLabelIdVentasResumidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasResumidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasResumidos= new GridBagLayout();

		this.jPanelidVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);

		jLabelidVentasResumidos = new JLabel();
		jLabelidVentasResumidos.setText("Id");

		jLabelidVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasResumidos = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasResumidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		//jFormattedTextFieldfecha_emision_desdeVentasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasResumidos.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasResumidos = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasResumidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		//jFormattedTextFieldfecha_emision_hastaVentasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasResumidos.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoVentasResumidos = new JLabelMe();
		this.jLabelnombre_completoVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoVentasResumidos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelnombre_completoVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextAreanombre_completoVentasResumidos= new JTextAreaMe();
		jTextAreanombre_completoVentasResumidos.setEnabled(false);
		jTextAreanombre_completoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasResumidos.setLineWrap(true);
		jTextAreanombre_completoVentasResumidos.setWrapStyleWord(true);
		jTextAreanombre_completoVentasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoVentasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoVentasResumidos = new JScrollPane(jTextAreanombre_completoVentasResumidos);
		jscrollPanenombre_completoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoVentasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_completoVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoVentasResumidosBusqueda.setText("U");
		this.jButtonnombre_completoVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelrucVentasResumidos = new JLabelMe();
		this.jLabelrucVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucVentasResumidos.setToolTipText("Ruc");
		this.jLabelrucVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelrucVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextFieldrucVentasResumidos= new JTextFieldMe();

		jTextFieldrucVentasResumidos.setEnabled(false);
		jTextFieldrucVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucVentasResumidosBusqueda= new JButtonMe();
		this.jButtonrucVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucVentasResumidosBusqueda.setText("U");
		this.jButtonrucVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoVentasResumidos = new JLabelMe();
		this.jLabelnombre_productoVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoVentasResumidos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelnombre_productoVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextAreanombre_productoVentasResumidos= new JTextAreaMe();
		jTextAreanombre_productoVentasResumidos.setEnabled(false);
		jTextAreanombre_productoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentasResumidos.setLineWrap(true);
		jTextAreanombre_productoVentasResumidos.setWrapStyleWord(true);
		jTextAreanombre_productoVentasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoVentasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoVentasResumidos = new JScrollPane(jTextAreanombre_productoVentasResumidos);
		jscrollPanenombre_productoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoVentasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_productoVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoVentasResumidosBusqueda.setText("U");
		this.jButtonnombre_productoVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadVentasResumidos = new JLabelMe();
		this.jLabelcantidadVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadVentasResumidos.setToolTipText("Cantad");
		this.jLabelcantidadVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelcantidadVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextFieldcantidadVentasResumidos= new JTextFieldMe();
		jTextFieldcantidadVentasResumidos.setEnabled(false);
		jTextFieldcantidadVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadVentasResumidos.setText("0");

		this.jButtoncantidadVentasResumidosBusqueda= new JButtonMe();
		this.jButtoncantidadVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadVentasResumidosBusqueda.setText("U");
		this.jButtoncantidadVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelprecioVentasResumidos = new JLabelMe();
		this.jLabelprecioVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioVentasResumidos.setToolTipText("Precio");
		this.jLabelprecioVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelprecioVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextFieldprecioVentasResumidos= new JTextFieldMe();
		jTextFieldprecioVentasResumidos.setEnabled(false);
		jTextFieldprecioVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioVentasResumidos.setText("0.0");

		this.jButtonprecioVentasResumidosBusqueda= new JButtonMe();
		this.jButtonprecioVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioVentasResumidosBusqueda.setText("U");
		this.jButtonprecioVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelmontoVentasResumidos = new JLabelMe();
		this.jLabelmontoVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoVentasResumidos.setToolTipText("Monto");
		this.jLabelmontoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelmontoVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextFieldmontoVentasResumidos= new JTextFieldMe();
		jTextFieldmontoVentasResumidos.setEnabled(false);
		jTextFieldmontoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoVentasResumidos.setText("0.0");

		this.jButtonmontoVentasResumidosBusqueda= new JButtonMe();
		this.jButtonmontoVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoVentasResumidosBusqueda.setText("U");
		this.jButtonmontoVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoVentasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoVentasResumidos = new JLabelMe();
		this.jLabelcodigo_productoVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoVentasResumidos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelcodigo_productoVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jTextFieldcodigo_productoVentasResumidos= new JTextFieldMe();

		jTextFieldcodigo_productoVentasResumidos.setEnabled(false);
		jTextFieldcodigo_productoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoVentasResumidosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoVentasResumidosBusqueda.setText("U");
		this.jButtoncodigo_productoVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoVentasResumidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasResumidos = new JLabelMe();
		this.jLabelid_empresaVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasResumidos.setToolTipText("Empresa");
		this.jLabelid_empresaVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelid_empresaVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jComboBoxid_empresaVentasResumidos= new JComboBoxMe();
		jComboBoxid_empresaVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasResumidos.setEnabled(false);

		this.jButtonid_empresaVentasResumidos= new JButtonMe();
		this.jButtonid_empresaVentasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidos.setText("Buscar");
		this.jButtonid_empresaVentasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidos"));

		this.jButtonid_empresaVentasResumidosBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidosBusqueda.setText("U");
		this.jButtonid_empresaVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasResumidosUpdate= new JButtonMe();
		this.jButtonid_empresaVentasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidosUpdate.setText("U");
		this.jButtonid_empresaVentasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidosUpdate"));



					
		this.jLabelid_sucursalVentasResumidos = new JLabelMe();
		this.jLabelid_sucursalVentasResumidos.setText(""+VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentasResumidos.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentasResumidos.setToolTipText(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentasResumidos = new GridBagLayout();
		this.jPanelid_sucursalVentasResumidos.setLayout(this.gridaBagLayoutVentasResumidos);


		jComboBoxid_sucursalVentasResumidos= new JComboBoxMe();
		jComboBoxid_sucursalVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentasResumidos.setEnabled(false);

		this.jButtonid_sucursalVentasResumidos= new JButtonMe();
		this.jButtonid_sucursalVentasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasResumidos.setText("Buscar");
		this.jButtonid_sucursalVentasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidos"));

		this.jButtonid_sucursalVentasResumidosBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasResumidosBusqueda.setText("U");
		this.jButtonid_sucursalVentasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidosBusqueda"));

		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentasResumidosUpdate= new JButtonMe();
		this.jButtonid_sucursalVentasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasResumidosUpdate.setText("U");
		this.jButtonid_sucursalVentasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasResumidosUpdate"));



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
		//this.jInternalFrameDetalleVentasResumidos = new VentasResumidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Resumidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidos= new GridBagLayout();
		

		
		String sToolTipVentasResumidos="";
		sToolTipVentasResumidos=VentasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidos+="(Facturacion.VentasResumidos)";
		}
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasResumidos = new JButtonMe();
		this.jButtonModificarVentasResumidos = new JButtonMe();
        this.jButtonActualizarVentasResumidos = new JButtonMe();
        this.jButtonEliminarVentasResumidos = new JButtonMe();
        this.jButtonCancelarVentasResumidos = new JButtonMe();
        this.jButtonGuardarCambiosVentasResumidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasResumidos = new JButtonMe();
		this.jButtonCerrarVentasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasResumidos = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasResumidos = new JScrollPane();
				
		
		
		this.jPanelCamposVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidos";
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasResumidos.setName("jPanelCamposVentasResumidos"); 

		this.jPanelCamposOcultosVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasResumidos.setName("jPanelCamposOcultosVentasResumidos"); 

        this.jPanelAccionesVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidos.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasResumidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasResumidos.setText("Nuevo");
		this.jButtonModificarVentasResumidos.setText("Editar");
        this.jButtonActualizarVentasResumidos.setText("Actualizar");
        this.jButtonEliminarVentasResumidos.setText("Eliminar");
        this.jButtonCancelarVentasResumidos.setText("Cancelar");
        this.jButtonGuardarCambiosVentasResumidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasResumidos.setText("Guardar");
		this.jButtonCerrarVentasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidos,"nuevo_button","Nuevo",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasResumidos,"modificar_button","Editar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasResumidos,"actualizar_button","Actualizar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasResumidos,"eliminar_button","Eliminar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasResumidos,"cancelar_button","Cancelar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasResumidos,"guardarcambios_button","Guardar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidos,"guardarcambiostabla_button","Guardar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidos,"cerrar_button","Salir",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasResumidos.setToolTipText("Nuevo"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasResumidos.setToolTipText("Editar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasResumidos.setToolTipText("Actualizar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasResumidos.setToolTipText("Eliminar)"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasResumidos.setToolTipText("Cancelar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasResumidos.setToolTipText("Guardar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasResumidos.setToolTipText("Guardar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidos.setToolTipText("Salir"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidos";
		inputMap = this.jButtonNuevoVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasResumidos";
		inputMap = this.jButtonActualizarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasResumidos"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasResumidos";
		inputMap = this.jButtonEliminarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasResumidos"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasResumidos";
		inputMap = this.jButtonCancelarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasResumidos"));
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidos";
		inputMap = this.jButtonCerrarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasResumidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasResumidos.setToolTipText("Nuevo VentasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasResumidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasResumidos.setToolTipText("Sin Cerrar Ventana VentasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasResumidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasResumidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasResumidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasResumidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasResumidos = new JLabelMe();
		
		this.jLabelAccionesVentasResumidos.setText("Acciones");		
		this.jLabelAccionesVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasResumidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasResumidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasResumidos=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasResumidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasResumidos = new GridBagLayout();
		
		this.jPanelCamposVentasResumidos.setLayout(gridaBagLayoutCamposVentasResumidos);
		this.jPanelCamposOcultosVentasResumidos.setLayout(gridaBagLayoutCamposOcultosVentasResumidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasResumidos.add(jLabelIdVentasResumidos, this.gridBagConstraintsVentasResumidos);



	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasResumidos.add(jLabelidVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasResumidos.add(jLabelid_empresaVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidos.add(jButtonid_empresaVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 3;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidos.add(jButtonid_empresaVentasResumidosUpdate, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasResumidos.add(jComboBoxid_empresaVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentasResumidos.add(jLabelid_sucursalVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasResumidos.add(jButtonid_sucursalVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 3;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasResumidos.add(jButtonid_sucursalVentasResumidosUpdate, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentasResumidos.add(jComboBoxid_sucursalVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasResumidos.add(jLabelfecha_emision_desdeVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasResumidos.add(jButtonfecha_emision_desdeVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasResumidos.add(jDateChooserfecha_emision_desdeVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasResumidos.add(jLabelfecha_emision_hastaVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasResumidos.add(jButtonfecha_emision_hastaVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasResumidos.add(jDateChooserfecha_emision_hastaVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoVentasResumidos.add(jLabelnombre_completoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoVentasResumidos.add(jButtonnombre_completoVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoVentasResumidos.add(jscrollPanenombre_completoVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucVentasResumidos.add(jLabelrucVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucVentasResumidos.add(jButtonrucVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucVentasResumidos.add(jTextFieldrucVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoVentasResumidos.add(jLabelnombre_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoVentasResumidos.add(jButtonnombre_productoVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoVentasResumidos.add(jscrollPanenombre_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadVentasResumidos.add(jLabelcantidadVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadVentasResumidos.add(jButtoncantidadVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadVentasResumidos.add(jTextFieldcantidadVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioVentasResumidos.add(jLabelprecioVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioVentasResumidos.add(jButtonprecioVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioVentasResumidos.add(jTextFieldprecioVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoVentasResumidos.add(jLabelmontoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoVentasResumidos.add(jButtonmontoVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoVentasResumidos.add(jTextFieldmontoVentasResumidos, this.gridBagConstraintsVentasResumidos);


	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 0;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoVentasResumidos.add(jLabelcodigo_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 2;
		this.gridBagConstraintsVentasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoVentasResumidos.add(jButtoncodigo_productoVentasResumidosBusqueda, this.gridBagConstraintsVentasResumidos);
	}

	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidos.gridy = 0;
	this.gridBagConstraintsVentasResumidos.gridx = 1;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoVentasResumidos.add(jTextFieldcodigo_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelidVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelfecha_emision_desdeVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelfecha_emision_hastaVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelnombre_completoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelrucVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelnombre_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelcantidadVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelprecioVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelmontoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidos.add(this.jPanelcodigo_productoVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposVentasResumidos % 1==0) {
		iXPanelCamposVentasResumidos=0;
		iYPanelCamposVentasResumidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposOcultosVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposOcultosVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasResumidos.add(this.jPanelid_empresaVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposOcultosVentasResumidos % 1==0) {
		iXPanelCamposOcultosVentasResumidos=0;
		iYPanelCamposOcultosVentasResumidos++;
	}
	this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidos.gridy = iYPanelCamposOcultosVentasResumidos;
	this.gridBagConstraintsVentasResumidos.gridx = iXPanelCamposOcultosVentasResumidos++;
	this.gridBagConstraintsVentasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasResumidos.add(this.jPanelid_sucursalVentasResumidos, this.gridBagConstraintsVentasResumidos);



	if(iXPanelCamposOcultosVentasResumidos % 1==0) {
		iXPanelCamposOcultosVentasResumidos=0;
		iYPanelCamposOcultosVentasResumidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidos= new GridBagLayout();
		this.jPanelAccionesVentasResumidos.setLayout(gridaBagLayoutAccionesVentasResumidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasResumidos= new GridBagLayout();
		this.jPanelAccionesFormularioVentasResumidos.setLayout(gridaBagLayoutAccionesFormularioVentasResumidos);
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasResumidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasResumidos.add(this.jComboBoxTiposAccionesFormularioVentasResumidos, this.gridBagConstraintsVentasResumidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasResumidos.add(this.jButtonModificarVentasResumidos, this.gridBagConstraintsVentasResumidos);							

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasResumidos.add(this.jButtonEliminarVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidos.add(this.jButtonActualizarVentasResumidos, this.gridBagConstraintsVentasResumidos);


		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidos.add(this.jButtonGuardarCambiosVentasResumidos, this.gridBagConstraintsVentasResumidos);	
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasResumidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasResumidos.add(this.jButtonCancelarVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidos.gridx = 0;		
			//this.gridBagConstraintsVentasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidos.gridx =0;
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidos, this.gridBagConstraintsVentasResumidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasResumidos = new VentasResumidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Resumidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Resumidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasResumidosModel ventasresumidosModel=new VentasResumidosModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasResumidosModel.VentasResumidosFocusTraversalPolicy ventasresumidosFocusTraversalPolicy = ventasresumidosModel.new VentasResumidosFocusTraversalPolicy(this);
			
			//ventasresumidosFocusTraversalPolicy.setventasresumidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventasresumidosModel);
			
			
			this.jContentPaneDetalleVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasResumidos = new GridBagLayout();	
			this.jContentPaneDetalleVentasResumidos.setLayout(gridaBagLayoutDetalleVentasResumidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasResumidos.gridx = 0;
					
				
				this.jContentPaneDetalleVentasResumidos.add(jTtoolBarDetalleVentasResumidos, gridBagConstraintsVentasResumidos);								
				
}
			
			this.jScrollPanelDatosEdicionVentasResumidos=   new JScrollPane(jContentPaneDetalleVentasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasResumidos.gridx = 0;
	        
			this.jContentPaneDetalleVentasResumidos.add(jPanelCamposVentasResumidos, gridBagConstraintsVentasResumidos);
			
			
			
			
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
						//&& ventasresumidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasResumidos= new GridBagConstraints();
						this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasResumidos.gridx = 0;
						this.jContentPaneDetalleVentasResumidos.add(this.jTabbedPaneRelacionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasResumidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasResumidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
					this.gridBagConstraintsVentasResumidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasResumidos.gridx = 0;
					
				
					this.jContentPaneDetalleVentasResumidos.add(jPanelCamposOcultosVentasResumidos, gridBagConstraintsVentasResumidos);
				
					this.jPanelCamposOcultosVentasResumidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasResumidos.gridx = 0;
	        this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasResumidos.add(this.jPanelAccionesFormularioVentasResumidos, this.gridBagConstraintsVentasResumidos);							
			
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
	        this.gridBagConstraintsVentasResumidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasResumidos.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasResumidos.add(this.jPanelAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasResumidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasResumidos=   new JScrollPane(this.jPanelCamposVentasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidos.gridx = 0;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasResumidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasResumidos, this.gridBagConstraintsVentasResumidos);			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasResumidos;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasResumidos;
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
