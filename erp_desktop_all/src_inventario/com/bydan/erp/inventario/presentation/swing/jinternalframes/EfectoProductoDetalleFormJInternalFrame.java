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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EfectoProductoConstantesFunciones;

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
public class EfectoProductoDetalleFormJInternalFrame extends EfectoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEfectoProducto;
	
	protected JMenuBar jmenuBarDetalleEfectoProducto;
	
	protected JMenu jmenuDetalleEfectoProducto;
	protected JMenu jmenuDetalleArchivoEfectoProducto;
	protected JMenu jmenuDetalleAccionesEfectoProducto;
	protected JMenu jmenuDetalleDatosEfectoProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEfectoProducto;	
	protected GridBagConstraints gridBagConstraintsEfectoProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EfectoProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEfectoProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public EfectoProductoSessionBean efectoproductoSessionBean;
	
	

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;	
	
	public EfectoProductoLogic efectoproductoLogic;
	
	public JScrollPane jScrollPanelDatosEfectoProducto;
	public JScrollPane jScrollPanelDatosEdicionEfectoProducto;
	public JScrollPane jScrollPanelDatosGeneralEfectoProducto;
	
	protected JPanel jPanelCamposEfectoProducto;    
	protected JPanel jPanelCamposOcultosEfectoProducto;    	
	protected JPanel jPanelAccionesEfectoProducto;
	protected JPanel jPanelAccionesFormularioEfectoProducto;
    
	
	
	protected Integer iXPanelCamposEfectoProducto=0;
	protected Integer iYPanelCamposEfectoProducto=0;
	
	protected Integer iXPanelCamposOcultosEfectoProducto=0;
	protected Integer iYPanelCamposOcultosEfectoProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEfectoProducto;
	public JButton jButtonModificarEfectoProducto;
	public JButton jButtonActualizarEfectoProducto;
    public JButton jButtonEliminarEfectoProducto;
	public JButton jButtonCancelarEfectoProducto;
    public JButton jButtonGuardarCambiosEfectoProducto;
	public JButton jButtonGuardarCambiosTablaEfectoProducto;
	protected JButton jButtonCerrarEfectoProducto;
	
	
	protected JButton jButtonProcesarInformacionEfectoProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEfectoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEfectoProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEfectoProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEfectoProducto;
	protected JButton jButtonModificarToolBarEfectoProducto;
	protected JButton jButtonActualizarToolBarEfectoProducto;
    protected JButton jButtonEliminarToolBarEfectoProducto;
	protected JButton jButtonCancelarToolBarEfectoProducto;
    protected JButton jButtonGuardarCambiosToolBarEfectoProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarEfectoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarEfectoProducto;
	protected JButton jButtonCerrarToolBarEfectoProducto;
	
	protected JButton jButtonProcesarInformacionToolBarEfectoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEfectoProducto;
	protected JMenuItem jMenuItemModificarEfectoProducto;
	protected JMenuItem jMenuItemActualizarEfectoProducto;
    protected JMenuItem jMenuItemEliminarEfectoProducto;
	protected JMenuItem jMenuItemCancelarEfectoProducto;
    protected JMenuItem jMenuItemGuardarCambiosEfectoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEfectoProducto;
	protected JMenuItem jMenuItemCerrarEfectoProducto;
	protected JMenuItem jMenuItemDetalleCerrarEfectoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEfectoProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionEfectoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEfectoProducto;
	protected JMenuItem jMenuItemMostrarOcultarEfectoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEfectoProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEfectoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEfectoProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEfectoProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEfectoProducto;
	public JLabel jLabelIdEfectoProducto;
	public JLabel jLabelidEfectoProducto;
	public JButton jButtonidEfectoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEfectoProducto;
	public JLabel jLabelcodigoEfectoProducto;
	public JTextField jTextFieldcodigoEfectoProducto;
	public JButton jButtoncodigoEfectoProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEfectoProducto;
	public JLabel jLabelnombreEfectoProducto;
	public JTextArea jTextAreanombreEfectoProducto;
	public JScrollPane jscrollPanenombreEfectoProducto;
	public JButton jButtonnombreEfectoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEfectoProducto;
	public JLabel jLabelid_empresaEfectoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEfectoProducto;
	public JButton jButtonid_empresaEfectoProducto= new JButtonMe();
	public JButton jButtonid_empresaEfectoProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaEfectoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoEfectoProducto;
	public JLabel jLabelid_tipo_productoEfectoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoEfectoProducto;
	public JButton jButtonid_tipo_productoEfectoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoEfectoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoEfectoProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEfectoProducto;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EfectoProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEfectoProducto=new JPanel();
				this.jPanelAccionesFormularioEfectoProducto=new JPanel();
				this.jmenuBarDetalleEfectoProducto=new JMenuBar();
				this.jTtoolBarDetalleEfectoProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EfectoProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEfectoProducto() {
		return this.jButtonActualizarToolBarEfectoProducto;
	}
	
	public JButton getjButtonEliminarToolBarEfectoProducto() {
		return this.jButtonEliminarToolBarEfectoProducto;
	}
	
	public JButton getjButtonCancelarToolBarEfectoProducto() {
		return this.jButtonCancelarToolBarEfectoProducto;
	}		
	
	public JButton getjButtonProcesarInformacionEfectoProducto() {
		return this.jButtonProcesarInformacionEfectoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEfectoProducto)	{
		this.jButtonProcesarInformacionEfectoProducto = jButtonProcesarInformacionEfectoProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEfectoProducto() {
		return this.jComboBoxTiposAccionesEfectoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEfectoProducto(
			JComboBox jComboBoxTiposRelacionesEfectoProducto) {
		this.jComboBoxTiposRelacionesEfectoProducto = jComboBoxTiposRelacionesEfectoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEfectoProducto(
			JComboBox jComboBoxTiposAccionesEfectoProducto) {
		this.jComboBoxTiposAccionesEfectoProducto = jComboBoxTiposAccionesEfectoProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEfectoProducto() {
		return this.jComboBoxTiposAccionesFormularioEfectoProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEfectoProducto(
			JComboBox jComboBoxTiposAccionesFormularioEfectoProducto) {
		this.jComboBoxTiposAccionesFormularioEfectoProducto = jComboBoxTiposAccionesFormularioEfectoProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		
		this.efectoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.efectoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.efectoproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EfectoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Efecto Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEfectoProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEfectoProducto=new JButtonMe();
				this.jButtonModificarToolBarEfectoProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto,
							"actualizar","actualizar","Actualizar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto,
							"eliminar","eliminar","Eliminar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto,
							"cancelar","cancelar","Cancelar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEfectoProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEfectoProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEfectoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEfectoProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEfectoProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEfectoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEfectoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEfectoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEfectoProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEfectoProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEfectoProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEfectoProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEfectoProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEfectoProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEfectoProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEfectoProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEfectoProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEfectoProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEfectoProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEfectoProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEfectoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEfectoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEfectoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEfectoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEfectoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEfectoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEfectoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEfectoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEfectoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEfectoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEfectoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEfectoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEfectoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEfectoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEfectoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEfectoProducto.add(this.jMenuItemDetalleCerrarEfectoProducto);
		
		this.jmenuDetalleAccionesEfectoProducto.add(this.jMenuItemActualizarEfectoProducto);
		this.jmenuDetalleAccionesEfectoProducto.add(this.jMenuItemEliminarEfectoProducto);
		this.jmenuDetalleAccionesEfectoProducto.add(this.jMenuItemCancelarEfectoProducto);		
		
		//this.jmenuDetalleDatosEfectoProducto.add(this.jMenuItemDetalleAbrirOrderByEfectoProducto);				
		this.jmenuDetalleDatosEfectoProducto.add(this.jMenuItemDetalleMostarOcultarEfectoProducto);				
				
		//this.jmenuDetalleAccionesEfectoProducto.add(this.jMenuItemGuardarCambiosEfectoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEfectoProducto.add(this.jmenuDetalleArchivoEfectoProducto);		
		this.jmenuBarDetalleEfectoProducto.add(this.jmenuDetalleAccionesEfectoProducto);		
		this.jmenuBarDetalleEfectoProducto.add(this.jmenuDetalleDatosEfectoProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEfectoProducto.add(this.jmenuDetalleEfectoProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEfectoProducto);				
	}
	
	
	public void inicializarElementosCamposEfectoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEfectoProducto = new JLabelMe();
		jLabelIdEfectoProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEfectoProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEfectoProducto.setToolTipText(EfectoProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEfectoProducto= new GridBagLayout();

		this.jPanelidEfectoProducto.setLayout(this.gridaBagLayoutEfectoProducto);

		jLabelidEfectoProducto = new JLabel();
		jLabelidEfectoProducto.setText("Id");

		jLabelidEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEfectoProducto = new JLabelMe();
		this.jLabelcodigoEfectoProducto.setText(""+EfectoProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEfectoProducto.setToolTipText("Codigo");
		this.jLabelcodigoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEfectoProducto.setToolTipText(EfectoProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEfectoProducto = new GridBagLayout();
		this.jPanelcodigoEfectoProducto.setLayout(this.gridaBagLayoutEfectoProducto);


		jTextFieldcodigoEfectoProducto= new JTextFieldMe();

		jTextFieldcodigoEfectoProducto.setEnabled(false);
		jTextFieldcodigoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEfectoProductoBusqueda= new JButtonMe();
		this.jButtoncodigoEfectoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEfectoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEfectoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEfectoProductoBusqueda.setText("U");
		this.jButtoncodigoEfectoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEfectoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEfectoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEfectoProductoBusqueda"));

		if(this.efectoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEfectoProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEfectoProducto = new JLabelMe();
		this.jLabelnombreEfectoProducto.setText(""+EfectoProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEfectoProducto.setToolTipText("Nombre");
		this.jLabelnombreEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEfectoProducto.setToolTipText(EfectoProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEfectoProducto = new GridBagLayout();
		this.jPanelnombreEfectoProducto.setLayout(this.gridaBagLayoutEfectoProducto);


		jTextAreanombreEfectoProducto= new JTextAreaMe();
		jTextAreanombreEfectoProducto.setEnabled(false);
		jTextAreanombreEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEfectoProducto.setLineWrap(true);
		jTextAreanombreEfectoProducto.setWrapStyleWord(true);
		jTextAreanombreEfectoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEfectoProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEfectoProducto = new JScrollPane(jTextAreanombreEfectoProducto);
		jscrollPanenombreEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEfectoProductoBusqueda= new JButtonMe();
		this.jButtonnombreEfectoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEfectoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEfectoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEfectoProductoBusqueda.setText("U");
		this.jButtonnombreEfectoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEfectoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEfectoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEfectoProductoBusqueda"));

		if(this.efectoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEfectoProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEfectoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEfectoProducto = new JLabelMe();
		this.jLabelid_empresaEfectoProducto.setText(""+EfectoProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEfectoProducto.setToolTipText("Empresa");
		this.jLabelid_empresaEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEfectoProducto.setToolTipText(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEfectoProducto = new GridBagLayout();
		this.jPanelid_empresaEfectoProducto.setLayout(this.gridaBagLayoutEfectoProducto);


		jComboBoxid_empresaEfectoProducto= new JComboBoxMe();
		jComboBoxid_empresaEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEfectoProducto.setEnabled(false);

		this.jButtonid_empresaEfectoProducto= new JButtonMe();
		this.jButtonid_empresaEfectoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEfectoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEfectoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEfectoProducto.setText("Buscar");
		this.jButtonid_empresaEfectoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEfectoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEfectoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEfectoProducto"));

		this.jButtonid_empresaEfectoProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaEfectoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEfectoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEfectoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEfectoProductoBusqueda.setText("U");
		this.jButtonid_empresaEfectoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEfectoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEfectoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEfectoProductoBusqueda"));

		if(this.efectoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEfectoProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaEfectoProductoUpdate= new JButtonMe();
		this.jButtonid_empresaEfectoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEfectoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEfectoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEfectoProductoUpdate.setText("U");
		this.jButtonid_empresaEfectoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEfectoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEfectoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEfectoProductoUpdate"));



					
		this.jLabelid_tipo_productoEfectoProducto = new JLabelMe();
		this.jLabelid_tipo_productoEfectoProducto.setText(""+EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoEfectoProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoEfectoProducto.setToolTipText(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutEfectoProducto = new GridBagLayout();
		this.jPanelid_tipo_productoEfectoProducto.setLayout(this.gridaBagLayoutEfectoProducto);


		jComboBoxid_tipo_productoEfectoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoEfectoProducto= new JButtonMe();
		this.jButtonid_tipo_productoEfectoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoEfectoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoEfectoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoEfectoProducto.setText("Buscar");
		this.jButtonid_tipo_productoEfectoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoEfectoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoEfectoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoEfectoProducto"));

		this.jButtonid_tipo_productoEfectoProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoEfectoProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoEfectoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoEfectoProductoBusqueda"));

		if(this.efectoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoEfectoProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoEfectoProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoEfectoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoEfectoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoEfectoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoEfectoProductoUpdate.setText("U");
		this.jButtonid_tipo_productoEfectoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoEfectoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoEfectoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoEfectoProductoUpdate"));



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
		//this.jInternalFrameDetalleEfectoProducto = new EfectoProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Efecto Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEfectoProducto= new GridBagLayout();
		

		
		String sToolTipEfectoProducto="";
		sToolTipEfectoProducto=EfectoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEfectoProducto+="(Inventario.EfectoProducto)";
		}
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEfectoProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEfectoProducto = new JButtonMe();
		this.jButtonModificarEfectoProducto = new JButtonMe();
        this.jButtonActualizarEfectoProducto = new JButtonMe();
        this.jButtonEliminarEfectoProducto = new JButtonMe();
        this.jButtonCancelarEfectoProducto = new JButtonMe();
        this.jButtonGuardarCambiosEfectoProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaEfectoProducto = new JButtonMe();
		this.jButtonCerrarEfectoProducto = new JButtonMe();
		
		this.jScrollPanelDatosEfectoProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionEfectoProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralEfectoProducto = new JScrollPane();
				
		
		
		this.jPanelCamposEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Efecto Producto";
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosEfectoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEfectoProducto.setName("jPanelCamposEfectoProducto"); 

		this.jPanelCamposOcultosEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEfectoProducto.setName("jPanelCamposOcultosEfectoProducto"); 

        this.jPanelAccionesEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEfectoProducto.setToolTipText("Acciones");
        this.jPanelAccionesEfectoProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEfectoProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEfectoProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEfectoProducto.setText("Nuevo");
		this.jButtonModificarEfectoProducto.setText("Editar");
        this.jButtonActualizarEfectoProducto.setText("Actualizar");
        this.jButtonEliminarEfectoProducto.setText("Eliminar");
        this.jButtonCancelarEfectoProducto.setText("Cancelar");
        this.jButtonGuardarCambiosEfectoProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaEfectoProducto.setText("Guardar");
		this.jButtonCerrarEfectoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEfectoProducto,"nuevo_button","Nuevo",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEfectoProducto,"modificar_button","Editar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEfectoProducto,"actualizar_button","Actualizar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEfectoProducto,"eliminar_button","Eliminar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEfectoProducto,"cancelar_button","Cancelar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEfectoProducto,"guardarcambios_button","Guardar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEfectoProducto,"guardarcambiostabla_button","Guardar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEfectoProducto,"cerrar_button","Salir",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEfectoProducto.setToolTipText("Nuevo"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEfectoProducto.setToolTipText("Editar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEfectoProducto.setToolTipText("Actualizar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEfectoProducto.setToolTipText("Eliminar)"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEfectoProducto.setToolTipText("Cancelar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEfectoProducto.setToolTipText("Guardar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEfectoProducto.setToolTipText("Guardar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEfectoProducto.setToolTipText("Salir"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEfectoProducto";
		inputMap = this.jButtonNuevoEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEfectoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEfectoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEfectoProducto";
		inputMap = this.jButtonActualizarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEfectoProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarEfectoProducto";
		inputMap = this.jButtonEliminarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEfectoProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarEfectoProducto";
		inputMap = this.jButtonCancelarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEfectoProducto"));
		
		//CERRAR		
		sMapKey = "CerrarEfectoProducto";
		inputMap = this.jButtonCerrarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEfectoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEfectoProducto";
		inputMap = this.jButtonGuardarCambiosTablaEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEfectoProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEfectoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEfectoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEfectoProducto.setToolTipText("Nuevo EfectoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEfectoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEfectoProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEfectoProducto.setToolTipText("Sin Cerrar Ventana EfectoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEfectoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEfectoProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEfectoProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEfectoProducto.setText("Accion");
		this.jComboBoxTiposAccionesEfectoProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEfectoProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEfectoProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEfectoProducto = new JLabelMe();
		
		this.jLabelAccionesEfectoProducto.setText("Acciones");		
		this.jLabelAccionesEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEfectoProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEfectoProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEfectoProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEfectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEfectoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEfectoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEfectoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEfectoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEfectoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEfectoProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEfectoProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEfectoProducto = new GridBagLayout();
		
		this.jPanelCamposEfectoProducto.setLayout(gridaBagLayoutCamposEfectoProducto);
		this.jPanelCamposOcultosEfectoProducto.setLayout(gridaBagLayoutCamposOcultosEfectoProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 0;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEfectoProducto.add(jLabelIdEfectoProducto, this.gridBagConstraintsEfectoProducto);



	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 1;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEfectoProducto.add(jLabelidEfectoProducto, this.gridBagConstraintsEfectoProducto);


	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 0;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEfectoProducto.add(jLabelid_empresaEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 2;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEfectoProducto.add(jButtonid_empresaEfectoProductoBusqueda, this.gridBagConstraintsEfectoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 3;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEfectoProducto.add(jButtonid_empresaEfectoProductoUpdate, this.gridBagConstraintsEfectoProducto);
	}

	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 1;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEfectoProducto.add(jComboBoxid_empresaEfectoProducto, this.gridBagConstraintsEfectoProducto);


	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 0;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoEfectoProducto.add(jLabelid_tipo_productoEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 2;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoEfectoProducto.add(jButtonid_tipo_productoEfectoProductoBusqueda, this.gridBagConstraintsEfectoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 3;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoEfectoProducto.add(jButtonid_tipo_productoEfectoProductoUpdate, this.gridBagConstraintsEfectoProducto);
	}

	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 1;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoEfectoProducto.add(jComboBoxid_tipo_productoEfectoProducto, this.gridBagConstraintsEfectoProducto);


	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 0;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEfectoProducto.add(jLabelcodigoEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 2;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEfectoProducto.add(jButtoncodigoEfectoProductoBusqueda, this.gridBagConstraintsEfectoProducto);
	}

	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 1;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEfectoProducto.add(jTextFieldcodigoEfectoProducto, this.gridBagConstraintsEfectoProducto);


	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 0;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEfectoProducto.add(jLabelnombreEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 2;
		this.gridBagConstraintsEfectoProducto.ipadx = 0;
		this.gridBagConstraintsEfectoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEfectoProducto.add(jButtonnombreEfectoProductoBusqueda, this.gridBagConstraintsEfectoProducto);
	}

	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEfectoProducto.gridy = 0;
	this.gridBagConstraintsEfectoProducto.gridx = 1;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEfectoProducto.add(jscrollPanenombreEfectoProducto, this.gridBagConstraintsEfectoProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEfectoProducto.gridy = iYPanelCamposEfectoProducto;
	this.gridBagConstraintsEfectoProducto.gridx = iXPanelCamposEfectoProducto++;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEfectoProducto.add(this.jPanelidEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(iXPanelCamposEfectoProducto % 1==0) {
		iXPanelCamposEfectoProducto=0;
		iYPanelCamposEfectoProducto++;
	}
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEfectoProducto.gridy = iYPanelCamposEfectoProducto;
	this.gridBagConstraintsEfectoProducto.gridx = iXPanelCamposEfectoProducto++;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEfectoProducto.add(this.jPanelid_tipo_productoEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(iXPanelCamposEfectoProducto % 1==0) {
		iXPanelCamposEfectoProducto=0;
		iYPanelCamposEfectoProducto++;
	}
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEfectoProducto.gridy = iYPanelCamposEfectoProducto;
	this.gridBagConstraintsEfectoProducto.gridx = iXPanelCamposEfectoProducto++;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEfectoProducto.add(this.jPanelcodigoEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(iXPanelCamposEfectoProducto % 1==0) {
		iXPanelCamposEfectoProducto=0;
		iYPanelCamposEfectoProducto++;
	}
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEfectoProducto.gridy = iYPanelCamposEfectoProducto;
	this.gridBagConstraintsEfectoProducto.gridx = iXPanelCamposEfectoProducto++;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEfectoProducto.add(this.jPanelnombreEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(iXPanelCamposEfectoProducto % 1==0) {
		iXPanelCamposEfectoProducto=0;
		iYPanelCamposEfectoProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEfectoProducto.gridy = iYPanelCamposOcultosEfectoProducto;
	this.gridBagConstraintsEfectoProducto.gridx = iXPanelCamposOcultosEfectoProducto++;
	this.gridBagConstraintsEfectoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEfectoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEfectoProducto.add(this.jPanelid_empresaEfectoProducto, this.gridBagConstraintsEfectoProducto);



	if(iXPanelCamposOcultosEfectoProducto % 1==0) {
		iXPanelCamposOcultosEfectoProducto=0;
		iYPanelCamposOcultosEfectoProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesEfectoProducto= new GridBagLayout();
		this.jPanelAccionesEfectoProducto.setLayout(gridaBagLayoutAccionesEfectoProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEfectoProducto= new GridBagLayout();
		this.jPanelAccionesFormularioEfectoProducto.setLayout(gridaBagLayoutAccionesFormularioEfectoProducto);
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEfectoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEfectoProducto.add(this.jComboBoxTiposAccionesFormularioEfectoProducto, this.gridBagConstraintsEfectoProducto);

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEfectoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEfectoProducto.add(this.jCheckBoxPostAccionNuevoEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEfectoProducto.add(this.jCheckBoxPostAccionSinCerrarEfectoProducto, this.gridBagConstraintsEfectoProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEfectoProducto.add(this.jCheckBoxPostAccionSinMensajeEfectoProducto, this.gridBagConstraintsEfectoProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesEfectoProducto.add(this.jButtonModificarEfectoProducto, this.gridBagConstraintsEfectoProducto);							

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesEfectoProducto.add(this.jButtonEliminarEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = 0;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEfectoProducto.add(this.jButtonActualizarEfectoProducto, this.gridBagConstraintsEfectoProducto);


		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = 0;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEfectoProducto.add(this.jButtonGuardarCambiosEfectoProducto, this.gridBagConstraintsEfectoProducto);	
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = 0;		
		this.gridBagConstraintsEfectoProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesEfectoProducto.add(this.jButtonCancelarEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEfectoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEfectoProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();						
			this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEfectoProducto.gridx = 0;		
			//this.gridBagConstraintsEfectoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEfectoProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEfectoProducto.gridx =0;
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEfectoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEfectoProducto, this.gridBagConstraintsEfectoProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEfectoProducto = new EfectoProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Efecto Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Efecto Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Efecto Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EfectoProductoModel efectoproductoModel=new EfectoProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//EfectoProductoModel.EfectoProductoFocusTraversalPolicy efectoproductoFocusTraversalPolicy = efectoproductoModel.new EfectoProductoFocusTraversalPolicy(this);
			
			//efectoproductoFocusTraversalPolicy.setefectoproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(efectoproductoModel);
			
			
			this.jContentPaneDetalleEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEfectoProducto = new GridBagLayout();	
			this.jContentPaneDetalleEfectoProducto.setLayout(gridaBagLayoutDetalleEfectoProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEfectoProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEfectoProducto.gridx = 0;
					
				
				this.jContentPaneDetalleEfectoProducto.add(jTtoolBarDetalleEfectoProducto, gridBagConstraintsEfectoProducto);								
				
}
			
			this.jScrollPanelDatosEdicionEfectoProducto=   new JScrollPane(jContentPaneDetalleEfectoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEfectoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEfectoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEfectoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEfectoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEfectoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEfectoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEfectoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEfectoProducto.gridx = 0;
	        
			this.jContentPaneDetalleEfectoProducto.add(jPanelCamposEfectoProducto, gridBagConstraintsEfectoProducto);
			
			
			
			
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
						&& efectoproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEfectoProducto= new GridBagConstraints();
						this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEfectoProducto.gridx = 0;
						this.jContentPaneDetalleEfectoProducto.add(this.jTabbedPaneRelacionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEfectoProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEfectoProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
					this.gridBagConstraintsEfectoProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEfectoProducto.gridx = 0;
					
				
					this.jContentPaneDetalleEfectoProducto.add(jPanelCamposOcultosEfectoProducto, gridBagConstraintsEfectoProducto);
				
					this.jPanelCamposOcultosEfectoProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEfectoProducto.gridx = 0;
	        this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEfectoProducto.add(this.jPanelAccionesFormularioEfectoProducto, this.gridBagConstraintsEfectoProducto);							
			
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
	        this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEfectoProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleEfectoProducto.add(this.jPanelAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEfectoProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEfectoProducto=   new JScrollPane(this.jPanelCamposEfectoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEfectoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEfectoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEfectoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEfectoProducto.gridx = 0;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEfectoProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEfectoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEfectoProducto, this.gridBagConstraintsEfectoProducto);			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEfectoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEfectoProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionEfectoProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				//this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEfectoProducto.gridx = 0;
				//this.jContentPaneDetalleEfectoProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEfectoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEfectoProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEfectoProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesEfectoProducto.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoSessionBean=new ProductoSessionBean();
		this.productoSessionBean.setConGuardarRelaciones(false);
		this.productoSessionBean.setEsGuardarRelacionado(true);

		this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoSessionBean.getEsGuardarRelacionado()) {

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				//this.gridBagConstraintsEfectoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEfectoProducto.gridx = 0;
				//this.jContentPaneDetalleEfectoProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEfectoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEfectoProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEfectoProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesEfectoProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<EfectoProducto> efectoproductos,EfectoProducto efectoproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.efectoproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setefectoproductosForeignKey(efectoproductos);
					productoBeanSwingJInternalFrame.setefectoproductoForeignKey(efectoproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionEfectoProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidEfectoProductoActual(efectoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEfectoProducto(true);
					productoBeanSwingJInternalFrame.setid_efecto_productoFK_IdEfectoProducto(efectoproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameEfectoProductoForeignKey(efectoproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEfectoProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEfectoProducto");
					productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(true);
					productoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProducto("n",productoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("relacionado");
					} else {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");
					}

					productoBeanSwingJInternalFrame.getjButtonRecargarInformacionProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<EfectoProducto> efectoproductos,EfectoProducto efectoproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.efectoproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setefectoproductosForeignKey(efectoproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setefectoproductoForeignKey(efectoproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionEfectoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidEfectoProductoActual(efectoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEfectoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_efecto_productoFK_IdEfectoProducto(efectoproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameEfectoProductoForeignKey(efectoproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEfectoProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEfectoProducto");
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
