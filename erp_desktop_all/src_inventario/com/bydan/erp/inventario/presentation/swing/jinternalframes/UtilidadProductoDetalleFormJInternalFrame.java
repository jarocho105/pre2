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
import com.bydan.erp.inventario.util.UtilidadProductoConstantesFunciones;

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
public class UtilidadProductoDetalleFormJInternalFrame extends UtilidadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUtilidadProducto;
	
	protected JMenuBar jmenuBarDetalleUtilidadProducto;
	
	protected JMenu jmenuDetalleUtilidadProducto;
	protected JMenu jmenuDetalleArchivoUtilidadProducto;
	protected JMenu jmenuDetalleAccionesUtilidadProducto;
	protected JMenu jmenuDetalleDatosUtilidadProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadProducto;	
	protected GridBagConstraints gridBagConstraintsUtilidadProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UtilidadProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleUtilidadProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public UtilidadProductoSessionBean utilidadproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public UtilidadProductoLogic utilidadproductoLogic;
	
	public JScrollPane jScrollPanelDatosUtilidadProducto;
	public JScrollPane jScrollPanelDatosEdicionUtilidadProducto;
	public JScrollPane jScrollPanelDatosGeneralUtilidadProducto;
	
	protected JPanel jPanelCamposUtilidadProducto;    
	protected JPanel jPanelCamposOcultosUtilidadProducto;    	
	protected JPanel jPanelAccionesUtilidadProducto;
	protected JPanel jPanelAccionesFormularioUtilidadProducto;
    
	
	
	protected Integer iXPanelCamposUtilidadProducto=0;
	protected Integer iYPanelCamposUtilidadProducto=0;
	
	protected Integer iXPanelCamposOcultosUtilidadProducto=0;
	protected Integer iYPanelCamposOcultosUtilidadProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUtilidadProducto;
	public JButton jButtonModificarUtilidadProducto;
	public JButton jButtonActualizarUtilidadProducto;
    public JButton jButtonEliminarUtilidadProducto;
	public JButton jButtonCancelarUtilidadProducto;
    public JButton jButtonGuardarCambiosUtilidadProducto;
	public JButton jButtonGuardarCambiosTablaUtilidadProducto;
	protected JButton jButtonCerrarUtilidadProducto;
	
	
	protected JButton jButtonProcesarInformacionUtilidadProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUtilidadProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUtilidadProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUtilidadProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadProducto;
	protected JButton jButtonModificarToolBarUtilidadProducto;
	protected JButton jButtonActualizarToolBarUtilidadProducto;
    protected JButton jButtonEliminarToolBarUtilidadProducto;
	protected JButton jButtonCancelarToolBarUtilidadProducto;
    protected JButton jButtonGuardarCambiosToolBarUtilidadProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarUtilidadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadProducto;
	protected JButton jButtonCerrarToolBarUtilidadProducto;
	
	protected JButton jButtonProcesarInformacionToolBarUtilidadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadProducto;
	protected JMenuItem jMenuItemModificarUtilidadProducto;
	protected JMenuItem jMenuItemActualizarUtilidadProducto;
    protected JMenuItem jMenuItemEliminarUtilidadProducto;
	protected JMenuItem jMenuItemCancelarUtilidadProducto;
    protected JMenuItem jMenuItemGuardarCambiosUtilidadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadProducto;
	protected JMenuItem jMenuItemCerrarUtilidadProducto;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionUtilidadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadProducto;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUtilidadProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUtilidadProducto;
	public JLabel jLabelIdUtilidadProducto;
	public JLabel jLabelidUtilidadProducto;
	public JButton jButtonidUtilidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeUtilidadProducto;
	public JLabel jLabelporcentajeUtilidadProducto;
	public JTextField jTextFieldporcentajeUtilidadProducto;
	public JButton jButtonporcentajeUtilidadProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUtilidadProducto;
	public JLabel jLabelid_empresaUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUtilidadProducto;
	public JButton jButtonid_empresaUtilidadProducto= new JButtonMe();
	public JButton jButtonid_empresaUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaUtilidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalUtilidadProducto;
	public JLabel jLabelid_sucursalUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalUtilidadProducto;
	public JButton jButtonid_sucursalUtilidadProducto= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaUtilidadProducto;
	public JLabel jLabelid_bodegaUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaUtilidadProducto;
	public JButton jButtonid_bodegaUtilidadProducto= new JButtonMe();
	public JButton jButtonid_bodegaUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaUtilidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoUtilidadProducto;
	public JLabel jLabelid_productoUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoUtilidadProducto;
	public JButton jButtonid_productoUtilidadProducto= new JButtonMe();
	public JButton jButtonid_productoUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoUtilidadProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUtilidadProducto;
	
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
	
	public UtilidadProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUtilidadProducto=new JPanel();
				this.jPanelAccionesFormularioUtilidadProducto=new JPanel();
				this.jmenuBarDetalleUtilidadProducto=new JMenuBar();
				this.jTtoolBarDetalleUtilidadProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UtilidadProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUtilidadProducto() {
		return this.jButtonActualizarToolBarUtilidadProducto;
	}
	
	public JButton getjButtonEliminarToolBarUtilidadProducto() {
		return this.jButtonEliminarToolBarUtilidadProducto;
	}
	
	public JButton getjButtonCancelarToolBarUtilidadProducto() {
		return this.jButtonCancelarToolBarUtilidadProducto;
	}		
	
	public JButton getjButtonProcesarInformacionUtilidadProducto() {
		return this.jButtonProcesarInformacionUtilidadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadProducto)	{
		this.jButtonProcesarInformacionUtilidadProducto = jButtonProcesarInformacionUtilidadProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadProducto() {
		return this.jComboBoxTiposAccionesUtilidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadProducto(
			JComboBox jComboBoxTiposRelacionesUtilidadProducto) {
		this.jComboBoxTiposRelacionesUtilidadProducto = jComboBoxTiposRelacionesUtilidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadProducto(
			JComboBox jComboBoxTiposAccionesUtilidadProducto) {
		this.jComboBoxTiposAccionesUtilidadProducto = jComboBoxTiposAccionesUtilidadProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUtilidadProducto() {
		return this.jComboBoxTiposAccionesFormularioUtilidadProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUtilidadProducto(
			JComboBox jComboBoxTiposAccionesFormularioUtilidadProducto) {
		this.jComboBoxTiposAccionesFormularioUtilidadProducto = jComboBoxTiposAccionesFormularioUtilidadProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		
		this.utilidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		UtilidadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUtilidadProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUtilidadProducto=new JButtonMe();
				this.jButtonModificarToolBarUtilidadProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto,
							"actualizar","actualizar","Actualizar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto,
							"eliminar","eliminar","Eliminar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto,
							"cancelar","cancelar","Cancelar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUtilidadProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUtilidadProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUtilidadProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUtilidadProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUtilidadProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUtilidadProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUtilidadProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUtilidadProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUtilidadProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUtilidadProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUtilidadProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUtilidadProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUtilidadProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUtilidadProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUtilidadProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUtilidadProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUtilidadProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUtilidadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUtilidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUtilidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUtilidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUtilidadProducto.add(this.jMenuItemDetalleCerrarUtilidadProducto);
		
		this.jmenuDetalleAccionesUtilidadProducto.add(this.jMenuItemActualizarUtilidadProducto);
		this.jmenuDetalleAccionesUtilidadProducto.add(this.jMenuItemEliminarUtilidadProducto);
		this.jmenuDetalleAccionesUtilidadProducto.add(this.jMenuItemCancelarUtilidadProducto);		
		
		//this.jmenuDetalleDatosUtilidadProducto.add(this.jMenuItemDetalleAbrirOrderByUtilidadProducto);				
		this.jmenuDetalleDatosUtilidadProducto.add(this.jMenuItemDetalleMostarOcultarUtilidadProducto);				
				
		//this.jmenuDetalleAccionesUtilidadProducto.add(this.jMenuItemGuardarCambiosUtilidadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUtilidadProducto.add(this.jmenuDetalleArchivoUtilidadProducto);		
		this.jmenuBarDetalleUtilidadProducto.add(this.jmenuDetalleAccionesUtilidadProducto);		
		this.jmenuBarDetalleUtilidadProducto.add(this.jmenuDetalleDatosUtilidadProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUtilidadProducto);				
	}
	
	
	public void inicializarElementosCamposUtilidadProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUtilidadProducto = new JLabelMe();
		jLabelIdUtilidadProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUtilidadProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUtilidadProducto= new GridBagLayout();

		this.jPanelidUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);

		jLabelidUtilidadProducto = new JLabel();
		jLabelidUtilidadProducto.setText("Id");

		jLabelidUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeUtilidadProducto = new JLabelMe();
		this.jLabelporcentajeUtilidadProducto.setText(""+UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeUtilidadProducto.setToolTipText("Porcentaje");
		this.jLabelporcentajeUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutUtilidadProducto = new GridBagLayout();
		this.jPanelporcentajeUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);


		jTextFieldporcentajeUtilidadProducto= new JTextFieldMe();
		jTextFieldporcentajeUtilidadProducto.setEnabled(false);
		jTextFieldporcentajeUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeUtilidadProducto.setText("0.0");

		this.jButtonporcentajeUtilidadProductoBusqueda= new JButtonMe();
		this.jButtonporcentajeUtilidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeUtilidadProductoBusqueda.setText("U");
		this.jButtonporcentajeUtilidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeUtilidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeUtilidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeUtilidadProductoBusqueda"));

		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeUtilidadProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUtilidadProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUtilidadProducto = new JLabelMe();
		this.jLabelid_empresaUtilidadProducto.setText(""+UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUtilidadProducto.setToolTipText("Empresa");
		this.jLabelid_empresaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUtilidadProducto = new GridBagLayout();
		this.jPanelid_empresaUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);


		jComboBoxid_empresaUtilidadProducto= new JComboBoxMe();
		jComboBoxid_empresaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUtilidadProducto.setEnabled(false);

		this.jButtonid_empresaUtilidadProducto= new JButtonMe();
		this.jButtonid_empresaUtilidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadProducto.setText("Buscar");
		this.jButtonid_empresaUtilidadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUtilidadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadProducto"));

		this.jButtonid_empresaUtilidadProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaUtilidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadProductoBusqueda.setText("U");
		this.jButtonid_empresaUtilidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUtilidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadProductoBusqueda"));

		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUtilidadProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaUtilidadProductoUpdate= new JButtonMe();
		this.jButtonid_empresaUtilidadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadProductoUpdate.setText("U");
		this.jButtonid_empresaUtilidadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUtilidadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadProductoUpdate"));



					
		this.jLabelid_sucursalUtilidadProducto = new JLabelMe();
		this.jLabelid_sucursalUtilidadProducto.setText(""+UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalUtilidadProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutUtilidadProducto = new GridBagLayout();
		this.jPanelid_sucursalUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);


		jComboBoxid_sucursalUtilidadProducto= new JComboBoxMe();
		jComboBoxid_sucursalUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalUtilidadProducto.setEnabled(false);

		this.jButtonid_sucursalUtilidadProducto= new JButtonMe();
		this.jButtonid_sucursalUtilidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadProducto.setText("Buscar");
		this.jButtonid_sucursalUtilidadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalUtilidadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadProducto"));

		this.jButtonid_sucursalUtilidadProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalUtilidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadProductoBusqueda.setText("U");
		this.jButtonid_sucursalUtilidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalUtilidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadProductoBusqueda"));

		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalUtilidadProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalUtilidadProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalUtilidadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadProductoUpdate.setText("U");
		this.jButtonid_sucursalUtilidadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalUtilidadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadProductoUpdate"));



					
		this.jLabelid_bodegaUtilidadProducto = new JLabelMe();
		this.jLabelid_bodegaUtilidadProducto.setText(""+UtilidadProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaUtilidadProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutUtilidadProducto = new GridBagLayout();
		this.jPanelid_bodegaUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);


		jComboBoxid_bodegaUtilidadProducto= new JComboBoxMe();
		jComboBoxid_bodegaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaUtilidadProducto= new JButtonMe();
		this.jButtonid_bodegaUtilidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUtilidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUtilidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaUtilidadProducto.setText("Buscar");
		this.jButtonid_bodegaUtilidadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaUtilidadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUtilidadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUtilidadProducto"));

		this.jButtonid_bodegaUtilidadProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaUtilidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUtilidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUtilidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUtilidadProductoBusqueda.setText("U");
		this.jButtonid_bodegaUtilidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaUtilidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUtilidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUtilidadProductoBusqueda"));

		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaUtilidadProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaUtilidadProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaUtilidadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUtilidadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaUtilidadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaUtilidadProductoUpdate.setText("U");
		this.jButtonid_bodegaUtilidadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaUtilidadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaUtilidadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaUtilidadProductoUpdate"));



					
		this.jLabelid_productoUtilidadProducto = new JLabelMe();
		this.jLabelid_productoUtilidadProducto.setText(""+UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoUtilidadProducto.setToolTipText("Producto");
		this.jLabelid_productoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoUtilidadProducto.setToolTipText(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutUtilidadProducto = new GridBagLayout();
		this.jPanelid_productoUtilidadProducto.setLayout(this.gridaBagLayoutUtilidadProducto);


		jComboBoxid_productoUtilidadProducto= new JComboBoxMe();
		jComboBoxid_productoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoUtilidadProducto= new JButtonMe();
		this.jButtonid_productoUtilidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUtilidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUtilidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoUtilidadProducto.setText("Buscar");
		this.jButtonid_productoUtilidadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoUtilidadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUtilidadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUtilidadProducto"));

		this.jButtonid_productoUtilidadProductoBusqueda= new JButtonMe();
		this.jButtonid_productoUtilidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUtilidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUtilidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoUtilidadProductoBusqueda.setText("U");
		this.jButtonid_productoUtilidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoUtilidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUtilidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUtilidadProductoBusqueda"));

		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoUtilidadProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoUtilidadProductoUpdate= new JButtonMe();
		this.jButtonid_productoUtilidadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUtilidadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoUtilidadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoUtilidadProductoUpdate.setText("U");
		this.jButtonid_productoUtilidadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoUtilidadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoUtilidadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoUtilidadProductoUpdate"));



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
		//this.jInternalFrameDetalleUtilidadProducto = new UtilidadProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Utilidad Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadProducto= new GridBagLayout();
		

		
		String sToolTipUtilidadProducto="";
		sToolTipUtilidadProducto=UtilidadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadProducto+="(Inventario.UtilidadProducto)";
		}
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUtilidadProducto = new JButtonMe();
		this.jButtonModificarUtilidadProducto = new JButtonMe();
        this.jButtonActualizarUtilidadProducto = new JButtonMe();
        this.jButtonEliminarUtilidadProducto = new JButtonMe();
        this.jButtonCancelarUtilidadProducto = new JButtonMe();
        this.jButtonGuardarCambiosUtilidadProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaUtilidadProducto = new JButtonMe();
		this.jButtonCerrarUtilidadProducto = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionUtilidadProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralUtilidadProducto = new JScrollPane();
				
		
		
		this.jPanelCamposUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Producto";
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUtilidadProducto.setName("jPanelCamposUtilidadProducto"); 

		this.jPanelCamposOcultosUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUtilidadProducto.setName("jPanelCamposOcultosUtilidadProducto"); 

        this.jPanelAccionesUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUtilidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUtilidadProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUtilidadProducto.setText("Nuevo");
		this.jButtonModificarUtilidadProducto.setText("Editar");
        this.jButtonActualizarUtilidadProducto.setText("Actualizar");
        this.jButtonEliminarUtilidadProducto.setText("Eliminar");
        this.jButtonCancelarUtilidadProducto.setText("Cancelar");
        this.jButtonGuardarCambiosUtilidadProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaUtilidadProducto.setText("Guardar");
		this.jButtonCerrarUtilidadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadProducto,"nuevo_button","Nuevo",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUtilidadProducto,"modificar_button","Editar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUtilidadProducto,"actualizar_button","Actualizar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUtilidadProducto,"eliminar_button","Eliminar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUtilidadProducto,"cancelar_button","Cancelar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUtilidadProducto,"guardarcambios_button","Guardar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadProducto,"guardarcambiostabla_button","Guardar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadProducto,"cerrar_button","Salir",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUtilidadProducto.setToolTipText("Nuevo"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUtilidadProducto.setToolTipText("Editar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUtilidadProducto.setToolTipText("Actualizar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUtilidadProducto.setToolTipText("Eliminar)"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUtilidadProducto.setToolTipText("Cancelar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUtilidadProducto.setToolTipText("Guardar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUtilidadProducto.setToolTipText("Guardar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadProducto.setToolTipText("Salir"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadProducto";
		inputMap = this.jButtonNuevoUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUtilidadProducto";
		inputMap = this.jButtonActualizarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUtilidadProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarUtilidadProducto";
		inputMap = this.jButtonEliminarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUtilidadProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarUtilidadProducto";
		inputMap = this.jButtonCancelarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUtilidadProducto"));
		
		//CERRAR		
		sMapKey = "CerrarUtilidadProducto";
		inputMap = this.jButtonCerrarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadProducto";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUtilidadProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUtilidadProducto.setToolTipText("Nuevo UtilidadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUtilidadProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUtilidadProducto.setToolTipText("Sin Cerrar Ventana UtilidadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUtilidadProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUtilidadProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadProducto.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUtilidadProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUtilidadProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUtilidadProducto = new JLabelMe();
		
		this.jLabelAccionesUtilidadProducto.setText("Acciones");		
		this.jLabelAccionesUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUtilidadProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUtilidadProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUtilidadProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUtilidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUtilidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUtilidadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUtilidadProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUtilidadProducto = new GridBagLayout();
		
		this.jPanelCamposUtilidadProducto.setLayout(gridaBagLayoutCamposUtilidadProducto);
		this.jPanelCamposOcultosUtilidadProducto.setLayout(gridaBagLayoutCamposOcultosUtilidadProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUtilidadProducto.add(jLabelIdUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUtilidadProducto.add(jLabelidUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUtilidadProducto.add(jLabelid_empresaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 2;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadProducto.add(jButtonid_empresaUtilidadProductoBusqueda, this.gridBagConstraintsUtilidadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 3;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadProducto.add(jButtonid_empresaUtilidadProductoUpdate, this.gridBagConstraintsUtilidadProducto);
	}

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUtilidadProducto.add(jComboBoxid_empresaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalUtilidadProducto.add(jLabelid_sucursalUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 2;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadProducto.add(jButtonid_sucursalUtilidadProductoBusqueda, this.gridBagConstraintsUtilidadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 3;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadProducto.add(jButtonid_sucursalUtilidadProductoUpdate, this.gridBagConstraintsUtilidadProducto);
	}

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalUtilidadProducto.add(jComboBoxid_sucursalUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaUtilidadProducto.add(jLabelid_bodegaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 2;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUtilidadProducto.add(jButtonid_bodegaUtilidadProductoBusqueda, this.gridBagConstraintsUtilidadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 3;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaUtilidadProducto.add(jButtonid_bodegaUtilidadProductoUpdate, this.gridBagConstraintsUtilidadProducto);
	}

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaUtilidadProducto.add(jComboBoxid_bodegaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoUtilidadProducto.add(jLabelid_productoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 2;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoUtilidadProducto.add(jButtonid_productoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 3;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoUtilidadProducto.add(jButtonid_productoUtilidadProductoBusqueda, this.gridBagConstraintsUtilidadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 4;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoUtilidadProducto.add(jButtonid_productoUtilidadProductoUpdate, this.gridBagConstraintsUtilidadProducto);
	}

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoUtilidadProducto.add(jComboBoxid_productoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 0;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeUtilidadProducto.add(jLabelporcentajeUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 2;
		this.gridBagConstraintsUtilidadProducto.ipadx = 0;
		this.gridBagConstraintsUtilidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeUtilidadProducto.add(jButtonporcentajeUtilidadProductoBusqueda, this.gridBagConstraintsUtilidadProducto);
	}

	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadProducto.gridy = 0;
	this.gridBagConstraintsUtilidadProducto.gridx = 1;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeUtilidadProducto.add(jTextFieldporcentajeUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadProducto.add(this.jPanelidUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposUtilidadProducto % 1==0) {
		iXPanelCamposUtilidadProducto=0;
		iYPanelCamposUtilidadProducto++;
	}
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadProducto.add(this.jPanelid_bodegaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposUtilidadProducto % 1==0) {
		iXPanelCamposUtilidadProducto=0;
		iYPanelCamposUtilidadProducto++;
	}
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadProducto.add(this.jPanelid_productoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposUtilidadProducto % 1==0) {
		iXPanelCamposUtilidadProducto=0;
		iYPanelCamposUtilidadProducto++;
	}
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadProducto.add(this.jPanelporcentajeUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposUtilidadProducto % 1==0) {
		iXPanelCamposUtilidadProducto=0;
		iYPanelCamposUtilidadProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposOcultosUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposOcultosUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadProducto.add(this.jPanelid_empresaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposOcultosUtilidadProducto % 1==0) {
		iXPanelCamposOcultosUtilidadProducto=0;
		iYPanelCamposOcultosUtilidadProducto++;
	}
	this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadProducto.gridy = iYPanelCamposOcultosUtilidadProducto;
	this.gridBagConstraintsUtilidadProducto.gridx = iXPanelCamposOcultosUtilidadProducto++;
	this.gridBagConstraintsUtilidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadProducto.add(this.jPanelid_sucursalUtilidadProducto, this.gridBagConstraintsUtilidadProducto);



	if(iXPanelCamposOcultosUtilidadProducto % 1==0) {
		iXPanelCamposOcultosUtilidadProducto=0;
		iYPanelCamposOcultosUtilidadProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesUtilidadProducto= new GridBagLayout();
		this.jPanelAccionesUtilidadProducto.setLayout(gridaBagLayoutAccionesUtilidadProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUtilidadProducto= new GridBagLayout();
		this.jPanelAccionesFormularioUtilidadProducto.setLayout(gridaBagLayoutAccionesFormularioUtilidadProducto);
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadProducto.add(this.jComboBoxTiposAccionesFormularioUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadProducto.add(this.jCheckBoxPostAccionNuevoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadProducto.add(this.jCheckBoxPostAccionSinCerrarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadProducto.add(this.jCheckBoxPostAccionSinMensajeUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesUtilidadProducto.add(this.jButtonModificarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);							

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesUtilidadProducto.add(this.jButtonEliminarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = 0;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadProducto.add(this.jButtonActualizarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = 0;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadProducto.add(this.jButtonGuardarCambiosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);	
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = 0;		
		this.gridBagConstraintsUtilidadProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesUtilidadProducto.add(this.jButtonCancelarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadProducto.gridx = 0;		
			//this.gridBagConstraintsUtilidadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadProducto.gridx =0;
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUtilidadProducto = new UtilidadProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Utilidad Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Utilidad Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UtilidadProductoModel utilidadproductoModel=new UtilidadProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//UtilidadProductoModel.UtilidadProductoFocusTraversalPolicy utilidadproductoFocusTraversalPolicy = utilidadproductoModel.new UtilidadProductoFocusTraversalPolicy(this);
			
			//utilidadproductoFocusTraversalPolicy.setutilidadproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(utilidadproductoModel);
			
			
			this.jContentPaneDetalleUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUtilidadProducto = new GridBagLayout();	
			this.jContentPaneDetalleUtilidadProducto.setLayout(gridaBagLayoutDetalleUtilidadProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
				this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUtilidadProducto.gridx = 0;
					
				
				this.jContentPaneDetalleUtilidadProducto.add(jTtoolBarDetalleUtilidadProducto, gridBagConstraintsUtilidadProducto);								
				
}
			
			this.jScrollPanelDatosEdicionUtilidadProducto=   new JScrollPane(jContentPaneDetalleUtilidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUtilidadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUtilidadProducto.gridx = 0;
	        
			this.jContentPaneDetalleUtilidadProducto.add(jPanelCamposUtilidadProducto, gridBagConstraintsUtilidadProducto);
			
			
			
			
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
						&& utilidadproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUtilidadProducto= new GridBagConstraints();
						this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUtilidadProducto.gridx = 0;
						this.jContentPaneDetalleUtilidadProducto.add(this.jTabbedPaneRelacionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUtilidadProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUtilidadProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
					this.gridBagConstraintsUtilidadProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUtilidadProducto.gridx = 0;
					
				
					this.jContentPaneDetalleUtilidadProducto.add(jPanelCamposOcultosUtilidadProducto, gridBagConstraintsUtilidadProducto);
				
					this.jPanelCamposOcultosUtilidadProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUtilidadProducto.gridx = 0;
	        this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUtilidadProducto.add(this.jPanelAccionesFormularioUtilidadProducto, this.gridBagConstraintsUtilidadProducto);							
			
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
	        this.gridBagConstraintsUtilidadProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUtilidadProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleUtilidadProducto.add(this.jPanelAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUtilidadProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUtilidadProducto=   new JScrollPane(this.jPanelCamposUtilidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadProducto.gridx = 0;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUtilidadProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUtilidadProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionUtilidadProducto;
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
