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
import com.bydan.erp.inventario.util.RangoUnidadVentaConstantesFunciones;

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
public class RangoUnidadVentaDetalleFormJInternalFrame extends RangoUnidadVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRangoUnidadVenta;
	
	protected JMenuBar jmenuBarDetalleRangoUnidadVenta;
	
	protected JMenu jmenuDetalleRangoUnidadVenta;
	protected JMenu jmenuDetalleArchivoRangoUnidadVenta;
	protected JMenu jmenuDetalleAccionesRangoUnidadVenta;
	protected JMenu jmenuDetalleDatosRangoUnidadVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRangoUnidadVenta;	
	protected GridBagConstraints gridBagConstraintsRangoUnidadVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RangoUnidadVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleRangoUnidadVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;
	
	

	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrecio=false;
	public PrecioSessionBean precioSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public RangoUnidadVentaLogic rangounidadventaLogic;
	
	public JScrollPane jScrollPanelDatosRangoUnidadVenta;
	public JScrollPane jScrollPanelDatosEdicionRangoUnidadVenta;
	public JScrollPane jScrollPanelDatosGeneralRangoUnidadVenta;
	
	protected JPanel jPanelCamposRangoUnidadVenta;    
	protected JPanel jPanelCamposOcultosRangoUnidadVenta;    	
	protected JPanel jPanelAccionesRangoUnidadVenta;
	protected JPanel jPanelAccionesFormularioRangoUnidadVenta;
    
	
	
	protected Integer iXPanelCamposRangoUnidadVenta=0;
	protected Integer iYPanelCamposRangoUnidadVenta=0;
	
	protected Integer iXPanelCamposOcultosRangoUnidadVenta=0;
	protected Integer iYPanelCamposOcultosRangoUnidadVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRangoUnidadVenta;
	public JButton jButtonModificarRangoUnidadVenta;
	public JButton jButtonActualizarRangoUnidadVenta;
    public JButton jButtonEliminarRangoUnidadVenta;
	public JButton jButtonCancelarRangoUnidadVenta;
    public JButton jButtonGuardarCambiosRangoUnidadVenta;
	public JButton jButtonGuardarCambiosTablaRangoUnidadVenta;
	protected JButton jButtonCerrarRangoUnidadVenta;
	
	
	protected JButton jButtonProcesarInformacionRangoUnidadVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRangoUnidadVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRangoUnidadVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRangoUnidadVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRangoUnidadVenta;
	protected JButton jButtonModificarToolBarRangoUnidadVenta;
	protected JButton jButtonActualizarToolBarRangoUnidadVenta;
    protected JButton jButtonEliminarToolBarRangoUnidadVenta;
	protected JButton jButtonCancelarToolBarRangoUnidadVenta;
    protected JButton jButtonGuardarCambiosToolBarRangoUnidadVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarRangoUnidadVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarRangoUnidadVenta;
	protected JButton jButtonCerrarToolBarRangoUnidadVenta;
	
	protected JButton jButtonProcesarInformacionToolBarRangoUnidadVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRangoUnidadVenta;
	protected JMenuItem jMenuItemModificarRangoUnidadVenta;
	protected JMenuItem jMenuItemActualizarRangoUnidadVenta;
    protected JMenuItem jMenuItemEliminarRangoUnidadVenta;
	protected JMenuItem jMenuItemCancelarRangoUnidadVenta;
    protected JMenuItem jMenuItemGuardarCambiosRangoUnidadVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRangoUnidadVenta;
	protected JMenuItem jMenuItemCerrarRangoUnidadVenta;
	protected JMenuItem jMenuItemDetalleCerrarRangoUnidadVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRangoUnidadVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionRangoUnidadVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRangoUnidadVenta;
	protected JMenuItem jMenuItemMostrarOcultarRangoUnidadVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRangoUnidadVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRangoUnidadVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRangoUnidadVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRangoUnidadVenta;
	public JLabel jLabelIdRangoUnidadVenta;
	public JLabel jLabelidRangoUnidadVenta;
	public JButton jButtonidRangoUnidadVentaBusqueda= new JButtonMe();

	public JPanel jPanelrango_inicialRangoUnidadVenta;
	public JLabel jLabelrango_inicialRangoUnidadVenta;
	public JTextField jTextFieldrango_inicialRangoUnidadVenta;
	public JButton jButtonrango_inicialRangoUnidadVentaBusqueda= new JButtonMe();

	public JPanel jPanelrango_finalRangoUnidadVenta;
	public JLabel jLabelrango_finalRangoUnidadVenta;
	public JTextField jTextFieldrango_finalRangoUnidadVenta;
	public JButton jButtonrango_finalRangoUnidadVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRangoUnidadVenta;
	public JLabel jLabelid_empresaRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRangoUnidadVenta;
	public JButton jButtonid_empresaRangoUnidadVenta= new JButtonMe();
	public JButton jButtonid_empresaRangoUnidadVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaRangoUnidadVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadRangoUnidadVenta;
	public JLabel jLabelid_unidadRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadRangoUnidadVenta;
	public JButton jButtonid_unidadRangoUnidadVenta= new JButtonMe();
	public JButton jButtonid_unidadRangoUnidadVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadRangoUnidadVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRangoUnidadVenta;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RangoUnidadVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRangoUnidadVenta=new JPanel();
				this.jPanelAccionesFormularioRangoUnidadVenta=new JPanel();
				this.jmenuBarDetalleRangoUnidadVenta=new JMenuBar();
				this.jTtoolBarDetalleRangoUnidadVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RangoUnidadVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRangoUnidadVenta() {
		return this.jButtonActualizarToolBarRangoUnidadVenta;
	}
	
	public JButton getjButtonEliminarToolBarRangoUnidadVenta() {
		return this.jButtonEliminarToolBarRangoUnidadVenta;
	}
	
	public JButton getjButtonCancelarToolBarRangoUnidadVenta() {
		return this.jButtonCancelarToolBarRangoUnidadVenta;
	}		
	
	public JButton getjButtonProcesarInformacionRangoUnidadVenta() {
		return this.jButtonProcesarInformacionRangoUnidadVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRangoUnidadVenta)	{
		this.jButtonProcesarInformacionRangoUnidadVenta = jButtonProcesarInformacionRangoUnidadVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRangoUnidadVenta() {
		return this.jComboBoxTiposAccionesRangoUnidadVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRangoUnidadVenta(
			JComboBox jComboBoxTiposRelacionesRangoUnidadVenta) {
		this.jComboBoxTiposRelacionesRangoUnidadVenta = jComboBoxTiposRelacionesRangoUnidadVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRangoUnidadVenta(
			JComboBox jComboBoxTiposAccionesRangoUnidadVenta) {
		this.jComboBoxTiposAccionesRangoUnidadVenta = jComboBoxTiposAccionesRangoUnidadVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRangoUnidadVenta() {
		return this.jComboBoxTiposAccionesFormularioRangoUnidadVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRangoUnidadVenta(
			JComboBox jComboBoxTiposAccionesFormularioRangoUnidadVenta) {
		this.jComboBoxTiposAccionesFormularioRangoUnidadVenta = jComboBoxTiposAccionesFormularioRangoUnidadVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		
		this.rangounidadventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangounidadventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rangounidadventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.precioSessionBean=new PrecioSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RangoUnidadVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rango Unidad Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
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
	
		RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRangoUnidadVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRangoUnidadVenta=new JButtonMe();
				this.jButtonModificarToolBarRangoUnidadVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta,
							"actualizar","actualizar","Actualizar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta,
							"eliminar","eliminar","Eliminar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta,
							"cancelar","cancelar","Cancelar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRangoUnidadVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRangoUnidadVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRangoUnidadVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRangoUnidadVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRangoUnidadVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRangoUnidadVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRangoUnidadVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRangoUnidadVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRangoUnidadVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRangoUnidadVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRangoUnidadVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRangoUnidadVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRangoUnidadVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRangoUnidadVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRangoUnidadVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRangoUnidadVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRangoUnidadVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRangoUnidadVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRangoUnidadVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRangoUnidadVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRangoUnidadVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRangoUnidadVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRangoUnidadVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRangoUnidadVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRangoUnidadVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRangoUnidadVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRangoUnidadVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRangoUnidadVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRangoUnidadVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRangoUnidadVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRangoUnidadVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRangoUnidadVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRangoUnidadVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRangoUnidadVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRangoUnidadVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRangoUnidadVenta.add(this.jMenuItemDetalleCerrarRangoUnidadVenta);
		
		this.jmenuDetalleAccionesRangoUnidadVenta.add(this.jMenuItemActualizarRangoUnidadVenta);
		this.jmenuDetalleAccionesRangoUnidadVenta.add(this.jMenuItemEliminarRangoUnidadVenta);
		this.jmenuDetalleAccionesRangoUnidadVenta.add(this.jMenuItemCancelarRangoUnidadVenta);		
		
		//this.jmenuDetalleDatosRangoUnidadVenta.add(this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta);				
		this.jmenuDetalleDatosRangoUnidadVenta.add(this.jMenuItemDetalleMostarOcultarRangoUnidadVenta);				
				
		//this.jmenuDetalleAccionesRangoUnidadVenta.add(this.jMenuItemGuardarCambiosRangoUnidadVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRangoUnidadVenta.add(this.jmenuDetalleArchivoRangoUnidadVenta);		
		this.jmenuBarDetalleRangoUnidadVenta.add(this.jmenuDetalleAccionesRangoUnidadVenta);		
		this.jmenuBarDetalleRangoUnidadVenta.add(this.jmenuDetalleDatosRangoUnidadVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRangoUnidadVenta.add(this.jmenuDetalleRangoUnidadVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRangoUnidadVenta);				
	}
	
	
	public void inicializarElementosCamposRangoUnidadVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRangoUnidadVenta = new JLabelMe();
		jLabelIdRangoUnidadVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRangoUnidadVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRangoUnidadVenta.setToolTipText(RangoUnidadVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRangoUnidadVenta= new GridBagLayout();

		this.jPanelidRangoUnidadVenta.setLayout(this.gridaBagLayoutRangoUnidadVenta);

		jLabelidRangoUnidadVenta = new JLabel();
		jLabelidRangoUnidadVenta.setText("Id");

		jLabelidRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrango_inicialRangoUnidadVenta = new JLabelMe();
		this.jLabelrango_inicialRangoUnidadVenta.setText(""+RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL+" : *");
		this.jLabelrango_inicialRangoUnidadVenta.setToolTipText("Rango Inicial");
		this.jLabelrango_inicialRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrango_inicialRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrango_inicialRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrango_inicialRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrango_inicialRangoUnidadVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrango_inicialRangoUnidadVenta.setToolTipText(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL);
		this.gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		this.jPanelrango_inicialRangoUnidadVenta.setLayout(this.gridaBagLayoutRangoUnidadVenta);


		jTextFieldrango_inicialRangoUnidadVenta= new JTextFieldMe();
		jTextFieldrango_inicialRangoUnidadVenta.setEnabled(false);
		jTextFieldrango_inicialRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrango_inicialRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrango_inicialRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrango_inicialRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldrango_inicialRangoUnidadVenta.setText("0.0");

		this.jButtonrango_inicialRangoUnidadVentaBusqueda= new JButtonMe();
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrango_inicialRangoUnidadVentaBusqueda.setText("U");
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrango_inicialRangoUnidadVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrango_inicialRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrango_inicialRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rango_inicialRangoUnidadVentaBusqueda"));

		if(this.rangounidadventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrango_inicialRangoUnidadVentaBusqueda.setVisible(false);		}


					
		this.jLabelrango_finalRangoUnidadVenta = new JLabelMe();
		this.jLabelrango_finalRangoUnidadVenta.setText(""+RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL+" : *");
		this.jLabelrango_finalRangoUnidadVenta.setToolTipText("Rango Final");
		this.jLabelrango_finalRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrango_finalRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrango_finalRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrango_finalRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrango_finalRangoUnidadVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrango_finalRangoUnidadVenta.setToolTipText(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL);
		this.gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		this.jPanelrango_finalRangoUnidadVenta.setLayout(this.gridaBagLayoutRangoUnidadVenta);


		jTextFieldrango_finalRangoUnidadVenta= new JTextFieldMe();
		jTextFieldrango_finalRangoUnidadVenta.setEnabled(false);
		jTextFieldrango_finalRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrango_finalRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrango_finalRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrango_finalRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldrango_finalRangoUnidadVenta.setText("0.0");

		this.jButtonrango_finalRangoUnidadVentaBusqueda= new JButtonMe();
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrango_finalRangoUnidadVentaBusqueda.setText("U");
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrango_finalRangoUnidadVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrango_finalRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrango_finalRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rango_finalRangoUnidadVentaBusqueda"));

		if(this.rangounidadventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrango_finalRangoUnidadVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRangoUnidadVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRangoUnidadVenta = new JLabelMe();
		this.jLabelid_empresaRangoUnidadVenta.setText(""+RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRangoUnidadVenta.setToolTipText("Empresa");
		this.jLabelid_empresaRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRangoUnidadVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRangoUnidadVenta.setToolTipText(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		this.jPanelid_empresaRangoUnidadVenta.setLayout(this.gridaBagLayoutRangoUnidadVenta);


		jComboBoxid_empresaRangoUnidadVenta= new JComboBoxMe();
		jComboBoxid_empresaRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRangoUnidadVenta.setEnabled(false);

		this.jButtonid_empresaRangoUnidadVenta= new JButtonMe();
		this.jButtonid_empresaRangoUnidadVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoUnidadVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoUnidadVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoUnidadVenta.setText("Buscar");
		this.jButtonid_empresaRangoUnidadVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRangoUnidadVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoUnidadVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoUnidadVenta"));

		this.jButtonid_empresaRangoUnidadVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRangoUnidadVentaBusqueda.setText("U");
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoUnidadVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoUnidadVentaBusqueda"));

		if(this.rangounidadventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRangoUnidadVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaRangoUnidadVentaUpdate= new JButtonMe();
		this.jButtonid_empresaRangoUnidadVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoUnidadVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoUnidadVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRangoUnidadVentaUpdate.setText("U");
		this.jButtonid_empresaRangoUnidadVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRangoUnidadVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoUnidadVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoUnidadVentaUpdate"));



					
		this.jLabelid_unidadRangoUnidadVenta = new JLabelMe();
		this.jLabelid_unidadRangoUnidadVenta.setText(""+RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadRangoUnidadVenta.setToolTipText("Unad");
		this.jLabelid_unidadRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadRangoUnidadVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadRangoUnidadVenta.setToolTipText(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		this.jPanelid_unidadRangoUnidadVenta.setLayout(this.gridaBagLayoutRangoUnidadVenta);


		jComboBoxid_unidadRangoUnidadVenta= new JComboBoxMe();
		jComboBoxid_unidadRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadRangoUnidadVenta= new JButtonMe();
		this.jButtonid_unidadRangoUnidadVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadRangoUnidadVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadRangoUnidadVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadRangoUnidadVenta.setText("Buscar");
		this.jButtonid_unidadRangoUnidadVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadRangoUnidadVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadRangoUnidadVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadRangoUnidadVenta"));

		this.jButtonid_unidadRangoUnidadVentaBusqueda= new JButtonMe();
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadRangoUnidadVentaBusqueda.setText("U");
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadRangoUnidadVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadRangoUnidadVentaBusqueda"));

		if(this.rangounidadventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadRangoUnidadVentaBusqueda.setVisible(false);		}

		this.jButtonid_unidadRangoUnidadVentaUpdate= new JButtonMe();
		this.jButtonid_unidadRangoUnidadVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadRangoUnidadVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadRangoUnidadVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadRangoUnidadVentaUpdate.setText("U");
		this.jButtonid_unidadRangoUnidadVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadRangoUnidadVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadRangoUnidadVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadRangoUnidadVentaUpdate"));



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
		//this.jInternalFrameDetalleRangoUnidadVenta = new RangoUnidadVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rango Unidad Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRangoUnidadVenta= new GridBagLayout();
		

		
		String sToolTipRangoUnidadVenta="";
		sToolTipRangoUnidadVenta=RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRangoUnidadVenta+="(Inventario.RangoUnidadVenta)";
		}
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRangoUnidadVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRangoUnidadVenta = new JButtonMe();
		this.jButtonModificarRangoUnidadVenta = new JButtonMe();
        this.jButtonActualizarRangoUnidadVenta = new JButtonMe();
        this.jButtonEliminarRangoUnidadVenta = new JButtonMe();
        this.jButtonCancelarRangoUnidadVenta = new JButtonMe();
        this.jButtonGuardarCambiosRangoUnidadVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaRangoUnidadVenta = new JButtonMe();
		this.jButtonCerrarRangoUnidadVenta = new JButtonMe();
		
		this.jScrollPanelDatosRangoUnidadVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionRangoUnidadVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralRangoUnidadVenta = new JScrollPane();
				
		
		
		this.jPanelCamposRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rango Unidad Venta";
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosRangoUnidadVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRangoUnidadVenta.setName("jPanelCamposRangoUnidadVenta"); 

		this.jPanelCamposOcultosRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRangoUnidadVenta.setName("jPanelCamposOcultosRangoUnidadVenta"); 

        this.jPanelAccionesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRangoUnidadVenta.setToolTipText("Acciones");
        this.jPanelAccionesRangoUnidadVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRangoUnidadVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRangoUnidadVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRangoUnidadVenta.setText("Nuevo");
		this.jButtonModificarRangoUnidadVenta.setText("Editar");
        this.jButtonActualizarRangoUnidadVenta.setText("Actualizar");
        this.jButtonEliminarRangoUnidadVenta.setText("Eliminar");
        this.jButtonCancelarRangoUnidadVenta.setText("Cancelar");
        this.jButtonGuardarCambiosRangoUnidadVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.setText("Guardar");
		this.jButtonCerrarRangoUnidadVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRangoUnidadVenta,"nuevo_button","Nuevo",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRangoUnidadVenta,"modificar_button","Editar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRangoUnidadVenta,"actualizar_button","Actualizar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRangoUnidadVenta,"eliminar_button","Eliminar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRangoUnidadVenta,"cancelar_button","Cancelar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRangoUnidadVenta,"guardarcambios_button","Guardar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRangoUnidadVenta,"guardarcambiostabla_button","Guardar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRangoUnidadVenta,"cerrar_button","Salir",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRangoUnidadVenta.setToolTipText("Nuevo"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRangoUnidadVenta.setToolTipText("Editar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRangoUnidadVenta.setToolTipText("Actualizar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRangoUnidadVenta.setToolTipText("Eliminar)"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRangoUnidadVenta.setToolTipText("Cancelar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRangoUnidadVenta.setToolTipText("Guardar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.setToolTipText("Guardar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRangoUnidadVenta.setToolTipText("Salir"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRangoUnidadVenta";
		inputMap = this.jButtonNuevoRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRangoUnidadVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRangoUnidadVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRangoUnidadVenta";
		inputMap = this.jButtonActualizarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRangoUnidadVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarRangoUnidadVenta";
		inputMap = this.jButtonEliminarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRangoUnidadVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarRangoUnidadVenta";
		inputMap = this.jButtonCancelarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRangoUnidadVenta"));
		
		//CERRAR		
		sMapKey = "CerrarRangoUnidadVenta";
		inputMap = this.jButtonCerrarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRangoUnidadVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRangoUnidadVenta";
		inputMap = this.jButtonGuardarCambiosTablaRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRangoUnidadVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRangoUnidadVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRangoUnidadVenta.setToolTipText("Nuevo RangoUnidadVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRangoUnidadVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRangoUnidadVenta.setToolTipText("Sin Cerrar Ventana RangoUnidadVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRangoUnidadVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRangoUnidadVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRangoUnidadVenta.setText("Accion");
		this.jComboBoxTiposAccionesRangoUnidadVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRangoUnidadVenta = new JLabelMe();
		
		this.jLabelAccionesRangoUnidadVenta.setText("Acciones");		
		this.jLabelAccionesRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRangoUnidadVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRangoUnidadVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRangoUnidadVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoUnidadVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRangoUnidadVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRangoUnidadVenta = new GridBagLayout();
		
		this.jPanelCamposRangoUnidadVenta.setLayout(gridaBagLayoutCamposRangoUnidadVenta);
		this.jPanelCamposOcultosRangoUnidadVenta.setLayout(gridaBagLayoutCamposOcultosRangoUnidadVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRangoUnidadVenta.add(jLabelIdRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 1;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRangoUnidadVenta.add(jLabelidRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRangoUnidadVenta.add(jLabelid_empresaRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 2;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRangoUnidadVenta.add(jButtonid_empresaRangoUnidadVentaBusqueda, this.gridBagConstraintsRangoUnidadVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 3;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRangoUnidadVenta.add(jButtonid_empresaRangoUnidadVentaUpdate, this.gridBagConstraintsRangoUnidadVenta);
	}

	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 1;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRangoUnidadVenta.add(jComboBoxid_empresaRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadRangoUnidadVenta.add(jLabelid_unidadRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 2;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadRangoUnidadVenta.add(jButtonid_unidadRangoUnidadVentaBusqueda, this.gridBagConstraintsRangoUnidadVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 3;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadRangoUnidadVenta.add(jButtonid_unidadRangoUnidadVentaUpdate, this.gridBagConstraintsRangoUnidadVenta);
	}

	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 1;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadRangoUnidadVenta.add(jComboBoxid_unidadRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrango_inicialRangoUnidadVenta.add(jLabelrango_inicialRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 2;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelrango_inicialRangoUnidadVenta.add(jButtonrango_inicialRangoUnidadVentaBusqueda, this.gridBagConstraintsRangoUnidadVenta);
	}

	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 1;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrango_inicialRangoUnidadVenta.add(jTextFieldrango_inicialRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrango_finalRangoUnidadVenta.add(jLabelrango_finalRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 2;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
		this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelrango_finalRangoUnidadVenta.add(jButtonrango_finalRangoUnidadVentaBusqueda, this.gridBagConstraintsRangoUnidadVenta);
	}

	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
	this.gridBagConstraintsRangoUnidadVenta.gridx = 1;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrango_finalRangoUnidadVenta.add(jTextFieldrango_finalRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoUnidadVenta.gridy = iYPanelCamposRangoUnidadVenta;
	this.gridBagConstraintsRangoUnidadVenta.gridx = iXPanelCamposRangoUnidadVenta++;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoUnidadVenta.add(this.jPanelidRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(iXPanelCamposRangoUnidadVenta % 1==0) {
		iXPanelCamposRangoUnidadVenta=0;
		iYPanelCamposRangoUnidadVenta++;
	}
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoUnidadVenta.gridy = iYPanelCamposRangoUnidadVenta;
	this.gridBagConstraintsRangoUnidadVenta.gridx = iXPanelCamposRangoUnidadVenta++;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoUnidadVenta.add(this.jPanelid_unidadRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(iXPanelCamposRangoUnidadVenta % 1==0) {
		iXPanelCamposRangoUnidadVenta=0;
		iYPanelCamposRangoUnidadVenta++;
	}
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoUnidadVenta.gridy = iYPanelCamposRangoUnidadVenta;
	this.gridBagConstraintsRangoUnidadVenta.gridx = iXPanelCamposRangoUnidadVenta++;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoUnidadVenta.add(this.jPanelrango_inicialRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(iXPanelCamposRangoUnidadVenta % 1==0) {
		iXPanelCamposRangoUnidadVenta=0;
		iYPanelCamposRangoUnidadVenta++;
	}
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoUnidadVenta.gridy = iYPanelCamposRangoUnidadVenta;
	this.gridBagConstraintsRangoUnidadVenta.gridx = iXPanelCamposRangoUnidadVenta++;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoUnidadVenta.add(this.jPanelrango_finalRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(iXPanelCamposRangoUnidadVenta % 1==0) {
		iXPanelCamposRangoUnidadVenta=0;
		iYPanelCamposRangoUnidadVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoUnidadVenta.gridy = iYPanelCamposOcultosRangoUnidadVenta;
	this.gridBagConstraintsRangoUnidadVenta.gridx = iXPanelCamposOcultosRangoUnidadVenta++;
	this.gridBagConstraintsRangoUnidadVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoUnidadVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRangoUnidadVenta.add(this.jPanelid_empresaRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);



	if(iXPanelCamposOcultosRangoUnidadVenta % 1==0) {
		iXPanelCamposOcultosRangoUnidadVenta=0;
		iYPanelCamposOcultosRangoUnidadVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesRangoUnidadVenta= new GridBagLayout();
		this.jPanelAccionesRangoUnidadVenta.setLayout(gridaBagLayoutAccionesRangoUnidadVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRangoUnidadVenta= new GridBagLayout();
		this.jPanelAccionesFormularioRangoUnidadVenta.setLayout(gridaBagLayoutAccionesFormularioRangoUnidadVenta);
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRangoUnidadVenta.add(this.jComboBoxTiposAccionesFormularioRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRangoUnidadVenta.add(this.jCheckBoxPostAccionNuevoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRangoUnidadVenta.add(this.jCheckBoxPostAccionSinCerrarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRangoUnidadVenta.add(this.jCheckBoxPostAccionSinMensajeRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonModificarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);							

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonEliminarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonActualizarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonGuardarCambiosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);	
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;		
		this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonCancelarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRangoUnidadVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();						
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;		
			//this.gridBagConstraintsRangoUnidadVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRangoUnidadVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRangoUnidadVenta.gridx =0;
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRangoUnidadVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRangoUnidadVenta = new RangoUnidadVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rango Unidad Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rango Unidad Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rango Unidad Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RangoUnidadVentaModel rangounidadventaModel=new RangoUnidadVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//RangoUnidadVentaModel.RangoUnidadVentaFocusTraversalPolicy rangounidadventaFocusTraversalPolicy = rangounidadventaModel.new RangoUnidadVentaFocusTraversalPolicy(this);
			
			//rangounidadventaFocusTraversalPolicy.setrangounidadventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rangounidadventaModel);
			
			
			this.jContentPaneDetalleRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRangoUnidadVenta = new GridBagLayout();	
			this.jContentPaneDetalleRangoUnidadVenta.setLayout(gridaBagLayoutDetalleRangoUnidadVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRangoUnidadVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
					
				
				this.jContentPaneDetalleRangoUnidadVenta.add(jTtoolBarDetalleRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);								
				
}
			
			this.jScrollPanelDatosEdicionRangoUnidadVenta=   new JScrollPane(jContentPaneDetalleRangoUnidadVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRangoUnidadVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	        
			this.jContentPaneDetalleRangoUnidadVenta.add(jPanelCamposRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);
			
			
			
			
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
						&& rangounidadventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(this.puedeCargarPorPartePrecio,false,-1);
					
					if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRangoUnidadVenta= new GridBagConstraints();
						this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
						this.jContentPaneDetalleRangoUnidadVenta.add(this.jTabbedPaneRelacionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRangoUnidadVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRangoUnidadVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
					this.gridBagConstraintsRangoUnidadVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
					
				
					this.jContentPaneDetalleRangoUnidadVenta.add(jPanelCamposOcultosRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);
				
					this.jPanelCamposOcultosRangoUnidadVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	        this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRangoUnidadVenta.add(this.jPanelAccionesFormularioRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);							
			
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
	        this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleRangoUnidadVenta.add(this.jPanelAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRangoUnidadVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRangoUnidadVenta=   new JScrollPane(this.jPanelCamposRangoUnidadVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoUnidadVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRangoUnidadVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRangoUnidadVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionRangoUnidadVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				//this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
				//this.jContentPaneDetalleRangoUnidadVenta.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRangoUnidadVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRangoUnidadVenta.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRangoUnidadVenta.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesRangoUnidadVenta.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.precioSessionBean=new PrecioSessionBean();
		this.precioSessionBean.setConGuardarRelaciones(false);
		this.precioSessionBean.setEsGuardarRelacionado(true);

		this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.precioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.precioSessionBean.getEsGuardarRelacionado()) {

				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.precioSessionBean.setEsGuardarRelacionado(true);

				this.precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.precioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.precioBeanSwingJInternalFrame.setprecioSessionBean(this.precioSessionBean);

				//this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				//this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
				//this.jContentPaneDetalleRangoUnidadVenta.add(this.precioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRangoUnidadVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRangoUnidadVenta.add("Precios",this.precioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRangoUnidadVenta.setComponentAt(iIndexTab,this.precioBeanSwingJInternalFrame.getContentPane());
				}

				//PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.precioSessionBean.setEsGuardarRelacionado(false);
				this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrecio) {
					this.jTabbedPaneRelacionesRangoUnidadVenta.add("Precios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPrecioBeanSwingJInternalFrame(List<RangoUnidadVenta> rangounidadventas,RangoUnidadVenta rangounidadventa,PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					precioBeanSwingJInternalFrame.getPrecioLogic().setConnexion(this.rangounidadventaLogic.getConnexion());

					precioBeanSwingJInternalFrame.setrangounidadventasForeignKey(rangounidadventas);
					precioBeanSwingJInternalFrame.setrangounidadventaForeignKey(rangounidadventa);
					precioBeanSwingJInternalFrame.precioSessionBean.setisBusquedaDesdeForeignKeySesionRangoUnidadVenta(true);
					precioBeanSwingJInternalFrame.precioSessionBean.setlidRangoUnidadVentaActual(rangounidadventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					precioBeanSwingJInternalFrame.cargarCombosForeignKeyPrecio(precioBeanSwingJInternalFrame.isCargarCombosDependencia);
					precioBeanSwingJInternalFrame.setVisibilidadBusquedasParaRangoUnidadVenta(true);
					precioBeanSwingJInternalFrame.setid_rango_unidad_ventaFK_IdRangoUnidadVenta(rangounidadventa.getId());

					if(!this.conCargarFormDetalle) {
						precioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					precioBeanSwingJInternalFrame.setSelectedItemCombosFrameRangoUnidadVentaForeignKey(rangounidadventa,1,false,true,true);
					precioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					precioBeanSwingJInternalFrame.procesarBusqueda("FK_IdRangoUnidadVenta");
					precioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRangoUnidadVenta");
					precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(true);
					precioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrecio("n",precioBeanSwingJInternalFrame.isGuardarCambiosEnLote, precioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					precioBeanSwingJInternalFrame.setAutoscrolls(true);
					precioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("relacionado");
					} else {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");
					}

					precioBeanSwingJInternalFrame.getjButtonRecargarInformacionPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<RangoUnidadVenta> rangounidadventas,RangoUnidadVenta rangounidadventa,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.rangounidadventaLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setrangounidadventasForeignKey(rangounidadventas);
					parametroinventariodefectoBeanSwingJInternalFrame.setrangounidadventaForeignKey(rangounidadventa);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionRangoUnidadVenta(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidRangoUnidadVentaActual(rangounidadventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRangoUnidadVenta(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_rango_unidad_ventaFK_IdRangoUnidadVenta(rangounidadventa.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameRangoUnidadVentaForeignKey(rangounidadventa,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRangoUnidadVenta");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRangoUnidadVenta");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

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
