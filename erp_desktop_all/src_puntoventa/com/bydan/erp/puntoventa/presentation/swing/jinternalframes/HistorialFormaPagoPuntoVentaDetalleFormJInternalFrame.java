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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.HistorialFormaPagoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame extends HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialFormaPagoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleHistorialFormaPagoPuntoVenta;
	
	protected JMenu jmenuDetalleHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleArchivoHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleAccionesHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleDatosHistorialFormaPagoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialFormaPagoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsHistorialFormaPagoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialFormaPagoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public HistorialFormaPagoPuntoVentaSessionBean historialformapagopuntoventaSessionBean;
	
	
	
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public HistorialFormaPagoPuntoVentaLogic historialformapagopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosHistorialFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta;
	
	protected JPanel jPanelCamposHistorialFormaPagoPuntoVenta;    
	protected JPanel jPanelCamposOcultosHistorialFormaPagoPuntoVenta;    	
	protected JPanel jPanelAccionesHistorialFormaPagoPuntoVenta;
	protected JPanel jPanelAccionesFormularioHistorialFormaPagoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposHistorialFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposHistorialFormaPagoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosHistorialFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosHistorialFormaPagoPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialFormaPagoPuntoVenta;
	public JButton jButtonModificarHistorialFormaPagoPuntoVenta;
	public JButton jButtonActualizarHistorialFormaPagoPuntoVenta;
    public JButton jButtonEliminarHistorialFormaPagoPuntoVenta;
	public JButton jButtonCancelarHistorialFormaPagoPuntoVenta;
    public JButton jButtonGuardarCambiosHistorialFormaPagoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCerrarHistorialFormaPagoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonModificarToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonActualizarToolBarHistorialFormaPagoPuntoVenta;
    protected JButton jButtonEliminarToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCancelarToolBarHistorialFormaPagoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCerrarToolBarHistorialFormaPagoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialFormaPagoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemModificarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemActualizarHistorialFormaPagoPuntoVenta;
    protected JMenuItem jMenuItemEliminarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCancelarHistorialFormaPagoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCerrarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialFormaPagoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialFormaPagoPuntoVenta;
	public JLabel jLabelIdHistorialFormaPagoPuntoVenta;
	public JLabel jLabelidHistorialFormaPagoPuntoVenta;
	public JButton jButtonidHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaHistorialFormaPagoPuntoVenta;
	public JLabel jLabelid_empresaHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHistorialFormaPagoPuntoVenta;
	public JButton jButtonid_empresaHistorialFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalHistorialFormaPagoPuntoVenta;
	public JLabel jLabelid_sucursalHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalHistorialFormaPagoPuntoVenta;
	public JButton jButtonid_sucursalHistorialFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta;
	
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
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialFormaPagoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta=new JPanel();
				this.jmenuBarDetalleHistorialFormaPagoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialFormaPagoPuntoVenta() {
		return this.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarHistorialFormaPagoPuntoVenta() {
		return this.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarHistorialFormaPagoPuntoVenta() {
		return this.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialFormaPagoPuntoVenta() {
		return this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialFormaPagoPuntoVenta)	{
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta = jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta = jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta = jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta = jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		
		this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialFormaPagoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Forma Pago Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialFormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialFormaPagoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarHistorialFormaPagoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialFormaPagoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialFormaPagoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialFormaPagoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialFormaPagoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialFormaPagoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialFormaPagoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialFormaPagoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialFormaPagoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialFormaPagoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialFormaPagoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialFormaPagoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialFormaPagoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialFormaPagoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialFormaPagoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialFormaPagoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialFormaPagoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialFormaPagoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialFormaPagoPuntoVenta.add(this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta);
		
		this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemActualizarHistorialFormaPagoPuntoVenta);
		this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemEliminarHistorialFormaPagoPuntoVenta);
		this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemCancelarHistorialFormaPagoPuntoVenta);		
		
		//this.jmenuDetalleDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta);				
		this.jmenuDetalleDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta);				
				
		//this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialFormaPagoPuntoVenta.add(this.jmenuDetalleArchivoHistorialFormaPagoPuntoVenta);		
		this.jmenuBarDetalleHistorialFormaPagoPuntoVenta.add(this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta);		
		this.jmenuBarDetalleHistorialFormaPagoPuntoVenta.add(this.jmenuDetalleDatosHistorialFormaPagoPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialFormaPagoPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposHistorialFormaPagoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialFormaPagoPuntoVenta = new JLabelMe();
		jLabelIdHistorialFormaPagoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialFormaPagoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialFormaPagoPuntoVenta.setToolTipText(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta= new GridBagLayout();

		this.jPanelidHistorialFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutHistorialFormaPagoPuntoVenta);

		jLabelidHistorialFormaPagoPuntoVenta = new JLabel();
		jLabelidHistorialFormaPagoPuntoVenta.setText("Id");

		jLabelidHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysHistorialFormaPagoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setText(""+HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA+" : *");
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setToolTipText("Factura Punto Venta");
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setToolTipText(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutHistorialFormaPagoPuntoVenta);


		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVenta"));

		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda"));

		if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta.setText(""+HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHistorialFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHistorialFormaPagoPuntoVenta.setToolTipText(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaHistorialFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutHistorialFormaPagoPuntoVenta);


		jComboBoxid_empresaHistorialFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaHistorialFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHistorialFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPagoPuntoVenta"));

		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPagoPuntoVentaBusqueda"));

		if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta.setText(""+HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalHistorialFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.setToolTipText(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutHistorialFormaPagoPuntoVenta);


		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPagoPuntoVenta"));

		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPagoPuntoVentaBusqueda"));

		if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalHistorialFormaPagoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleHistorialFormaPagoPuntoVenta = new HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Forma Pago Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipHistorialFormaPagoPuntoVenta="";
		sToolTipHistorialFormaPagoPuntoVenta=HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialFormaPagoPuntoVenta+="(PuntoVenta.HistorialFormaPagoPuntoVenta)";
		}
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialFormaPagoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonModificarHistorialFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonActualizarHistorialFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonEliminarHistorialFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonCancelarHistorialFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarHistorialFormaPagoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Forma Pago Punto Venta";
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialFormaPagoPuntoVenta.setName("jPanelCamposHistorialFormaPagoPuntoVenta"); 

		this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.setName("jPanelCamposOcultosHistorialFormaPagoPuntoVenta"); 

        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialFormaPagoPuntoVenta.setText("Nuevo");
		this.jButtonModificarHistorialFormaPagoPuntoVenta.setText("Editar");
        this.jButtonActualizarHistorialFormaPagoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarHistorialFormaPagoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarHistorialFormaPagoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialFormaPagoPuntoVenta,"nuevo_button","Nuevo",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialFormaPagoPuntoVenta,"modificar_button","Editar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialFormaPagoPuntoVenta,"actualizar_button","Actualizar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialFormaPagoPuntoVenta,"eliminar_button","Eliminar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialFormaPagoPuntoVenta,"cancelar_button","Cancelar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta,"guardarcambios_button","Guardar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialFormaPagoPuntoVenta,"cerrar_button","Salir",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.setToolTipText("Nuevo"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialFormaPagoPuntoVenta.setToolTipText("Editar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialFormaPagoPuntoVenta.setToolTipText("Actualizar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialFormaPagoPuntoVenta.setToolTipText("Eliminar)"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.setToolTipText("Salir"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialFormaPagoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonActualizarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialFormaPagoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonEliminarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialFormaPagoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCancelarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialFormaPagoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCerrarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialFormaPagoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialFormaPagoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta.setToolTipText("Nuevo HistorialFormaPagoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta.setToolTipText("Sin Cerrar Ventana HistorialFormaPagoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialFormaPagoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialFormaPagoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialFormaPagoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialFormaPagoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposHistorialFormaPagoPuntoVenta);
		this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosHistorialFormaPagoPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialFormaPagoPuntoVenta.add(jLabelIdHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialFormaPagoPuntoVenta.add(jLabelidHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);


	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.add(jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.add(jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.add(jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.add(jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);


	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHistorialFormaPagoPuntoVenta.add(jLabelid_empresaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialFormaPagoPuntoVenta.add(jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialFormaPagoPuntoVenta.add(jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHistorialFormaPagoPuntoVenta.add(jComboBoxid_empresaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);


	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.add(jLabelid_sucursalHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.add(jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.add(jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalHistorialFormaPagoPuntoVenta.add(jComboBoxid_sucursalHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iYPanelCamposHistorialFormaPagoPuntoVenta;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iXPanelCamposHistorialFormaPagoPuntoVenta++;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPagoPuntoVenta.add(this.jPanelidHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(iXPanelCamposHistorialFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposHistorialFormaPagoPuntoVenta=0;
		iYPanelCamposHistorialFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iYPanelCamposHistorialFormaPagoPuntoVenta;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iXPanelCamposHistorialFormaPagoPuntoVenta++;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialFormaPagoPuntoVenta.add(this.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(iXPanelCamposHistorialFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposHistorialFormaPagoPuntoVenta=0;
		iYPanelCamposHistorialFormaPagoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosHistorialFormaPagoPuntoVenta;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosHistorialFormaPagoPuntoVenta++;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.add(this.jPanelid_empresaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosHistorialFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosHistorialFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosHistorialFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosHistorialFormaPagoPuntoVenta;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosHistorialFormaPagoPuntoVenta++;
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.add(this.jPanelid_sucursalHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosHistorialFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosHistorialFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosHistorialFormaPagoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesHistorialFormaPagoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioHistorialFormaPagoPuntoVenta);
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonModificarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);							

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonEliminarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonActualizarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);


		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);	
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonCancelarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialFormaPagoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialFormaPagoPuntoVenta = new HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Forma Pago Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Forma Pago Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Forma Pago Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialFormaPagoPuntoVentaModel historialformapagopuntoventaModel=new HistorialFormaPagoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialFormaPagoPuntoVentaModel.HistorialFormaPagoPuntoVentaFocusTraversalPolicy historialformapagopuntoventaFocusTraversalPolicy = historialformapagopuntoventaModel.new HistorialFormaPagoPuntoVentaFocusTraversalPolicy(this);
			
			//historialformapagopuntoventaFocusTraversalPolicy.sethistorialformapagopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialformapagopuntoventaModel);
			
			
			this.jContentPaneDetalleHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialFormaPagoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutDetalleHistorialFormaPagoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialFormaPagoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(jTtoolBarDetalleHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta=   new JScrollPane(jContentPaneDetalleHistorialFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(jPanelCamposHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			
			
			
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
						&& historialformapagopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialFormaPagoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(jPanelCamposOcultosHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);
				
					this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);							
			
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialFormaPagoPuntoVenta.add(this.jPanelAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta=   new JScrollPane(this.jPanelCamposHistorialFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta;
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
