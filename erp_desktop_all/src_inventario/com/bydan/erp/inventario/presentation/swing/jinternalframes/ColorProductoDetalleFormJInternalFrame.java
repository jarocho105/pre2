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
import com.bydan.erp.inventario.util.ColorProductoConstantesFunciones;

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
public class ColorProductoDetalleFormJInternalFrame extends ColorProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleColorProducto;
	
	protected JMenuBar jmenuBarDetalleColorProducto;
	
	protected JMenu jmenuDetalleColorProducto;
	protected JMenu jmenuDetalleArchivoColorProducto;
	protected JMenu jmenuDetalleAccionesColorProducto;
	protected JMenu jmenuDetalleDatosColorProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutColorProducto;	
	protected GridBagConstraints gridBagConstraintsColorProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ColorProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleColorProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";

	protected GrupoColorBeanSwingJInternalFrame grupocolorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocolor="";
	
	public ColorProductoSessionBean colorproductoSessionBean;
	
	

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	public GrupoColorSessionBean grupocolorSessionBean;	
	
	public ColorProductoLogic colorproductoLogic;
	
	public JScrollPane jScrollPanelDatosColorProducto;
	public JScrollPane jScrollPanelDatosEdicionColorProducto;
	public JScrollPane jScrollPanelDatosGeneralColorProducto;
	
	protected JPanel jPanelCamposColorProducto;    
	protected JPanel jPanelCamposOcultosColorProducto;    	
	protected JPanel jPanelAccionesColorProducto;
	protected JPanel jPanelAccionesFormularioColorProducto;
    
	
	
	protected Integer iXPanelCamposColorProducto=0;
	protected Integer iYPanelCamposColorProducto=0;
	
	protected Integer iXPanelCamposOcultosColorProducto=0;
	protected Integer iYPanelCamposOcultosColorProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoColorProducto;
	public JButton jButtonModificarColorProducto;
	public JButton jButtonActualizarColorProducto;
    public JButton jButtonEliminarColorProducto;
	public JButton jButtonCancelarColorProducto;
    public JButton jButtonGuardarCambiosColorProducto;
	public JButton jButtonGuardarCambiosTablaColorProducto;
	protected JButton jButtonCerrarColorProducto;
	
	
	protected JButton jButtonProcesarInformacionColorProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoColorProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarColorProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeColorProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarColorProducto;
	protected JButton jButtonModificarToolBarColorProducto;
	protected JButton jButtonActualizarToolBarColorProducto;
    protected JButton jButtonEliminarToolBarColorProducto;
	protected JButton jButtonCancelarToolBarColorProducto;
    protected JButton jButtonGuardarCambiosToolBarColorProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarColorProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarColorProducto;
	protected JButton jButtonCerrarToolBarColorProducto;
	
	protected JButton jButtonProcesarInformacionToolBarColorProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoColorProducto;
	protected JMenuItem jMenuItemModificarColorProducto;
	protected JMenuItem jMenuItemActualizarColorProducto;
    protected JMenuItem jMenuItemEliminarColorProducto;
	protected JMenuItem jMenuItemCancelarColorProducto;
    protected JMenuItem jMenuItemGuardarCambiosColorProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaColorProducto;
	protected JMenuItem jMenuItemCerrarColorProducto;
	protected JMenuItem jMenuItemDetalleCerrarColorProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarColorProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionColorProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosColorProducto;
	protected JMenuItem jMenuItemMostrarOcultarColorProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesColorProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesColorProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesColorProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioColorProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidColorProducto;
	public JLabel jLabelIdColorProducto;
	public JLabel jLabelidColorProducto;
	public JButton jButtonidColorProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoColorProducto;
	public JLabel jLabelcodigoColorProducto;
	public JTextField jTextFieldcodigoColorProducto;
	public JButton jButtoncodigoColorProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreColorProducto;
	public JLabel jLabelnombreColorProducto;
	public JTextArea jTextAreanombreColorProducto;
	public JScrollPane jscrollPanenombreColorProducto;
	public JButton jButtonnombreColorProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaColorProducto;
	public JLabel jLabelid_empresaColorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaColorProducto;
	public JButton jButtonid_empresaColorProducto= new JButtonMe();
	public JButton jButtonid_empresaColorProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaColorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoColorProducto;
	public JLabel jLabelid_tipo_productoColorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoColorProducto;
	public JButton jButtonid_tipo_productoColorProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoColorProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoColorProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_colorColorProducto;
	public JLabel jLabelid_grupo_colorColorProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_colorColorProducto;
	public JButton jButtonid_grupo_colorColorProducto= new JButtonMe();
	public JButton jButtonid_grupo_colorColorProductoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_colorColorProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesColorProducto;
	
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
	
	public ColorProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposColorProducto=new JPanel();
				this.jPanelAccionesFormularioColorProducto=new JPanel();
				this.jmenuBarDetalleColorProducto=new JMenuBar();
				this.jTtoolBarDetalleColorProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ColorProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ColorProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarColorProducto() {
		return this.jButtonActualizarToolBarColorProducto;
	}
	
	public JButton getjButtonEliminarToolBarColorProducto() {
		return this.jButtonEliminarToolBarColorProducto;
	}
	
	public JButton getjButtonCancelarToolBarColorProducto() {
		return this.jButtonCancelarToolBarColorProducto;
	}		
	
	public JButton getjButtonProcesarInformacionColorProducto() {
		return this.jButtonProcesarInformacionColorProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionColorProducto)	{
		this.jButtonProcesarInformacionColorProducto = jButtonProcesarInformacionColorProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesColorProducto() {
		return this.jComboBoxTiposAccionesColorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesColorProducto(
			JComboBox jComboBoxTiposRelacionesColorProducto) {
		this.jComboBoxTiposRelacionesColorProducto = jComboBoxTiposRelacionesColorProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesColorProducto(
			JComboBox jComboBoxTiposAccionesColorProducto) {
		this.jComboBoxTiposAccionesColorProducto = jComboBoxTiposAccionesColorProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioColorProducto() {
		return this.jComboBoxTiposAccionesFormularioColorProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioColorProducto(
			JComboBox jComboBoxTiposAccionesFormularioColorProducto) {
		this.jComboBoxTiposAccionesFormularioColorProducto = jComboBoxTiposAccionesFormularioColorProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.colorproductoSessionBean=new ColorProductoSessionBean();
		
		this.colorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.colorproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ColorProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Color Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleColorProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarColorProducto=new JButtonMe();
				this.jButtonModificarToolBarColorProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarColorProducto,this.jTtoolBarDetalleColorProducto,
							"actualizar","actualizar","Actualizar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarColorProducto,this.jTtoolBarDetalleColorProducto,
							"eliminar","eliminar","Eliminar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarColorProducto,this.jTtoolBarDetalleColorProducto,
							"cancelar","cancelar","Cancelar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarColorProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarColorProducto,this.jTtoolBarDetalleColorProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleColorProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleColorProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoColorProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesColorProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosColorProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoColorProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoColorProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoColorProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarColorProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarColorProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarColorProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarColorProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarColorProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarColorProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarColorProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarColorProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarColorProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarColorProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarColorProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarColorProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosColorProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosColorProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosColorProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarColorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarColorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarColorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarColorProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarColorProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarColorProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarColorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarColorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarColorProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarColorProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarColorProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarColorProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoColorProducto.add(this.jMenuItemDetalleCerrarColorProducto);
		
		this.jmenuDetalleAccionesColorProducto.add(this.jMenuItemActualizarColorProducto);
		this.jmenuDetalleAccionesColorProducto.add(this.jMenuItemEliminarColorProducto);
		this.jmenuDetalleAccionesColorProducto.add(this.jMenuItemCancelarColorProducto);		
		
		//this.jmenuDetalleDatosColorProducto.add(this.jMenuItemDetalleAbrirOrderByColorProducto);				
		this.jmenuDetalleDatosColorProducto.add(this.jMenuItemDetalleMostarOcultarColorProducto);				
				
		//this.jmenuDetalleAccionesColorProducto.add(this.jMenuItemGuardarCambiosColorProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleColorProducto.add(this.jmenuDetalleArchivoColorProducto);		
		this.jmenuBarDetalleColorProducto.add(this.jmenuDetalleAccionesColorProducto);		
		this.jmenuBarDetalleColorProducto.add(this.jmenuDetalleDatosColorProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleColorProducto.add(this.jmenuDetalleColorProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleColorProducto);				
	}
	
	
	public void inicializarElementosCamposColorProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdColorProducto = new JLabelMe();
		jLabelIdColorProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidColorProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutColorProducto= new GridBagLayout();

		this.jPanelidColorProducto.setLayout(this.gridaBagLayoutColorProducto);

		jLabelidColorProducto = new JLabel();
		jLabelidColorProducto.setText("Id");

		jLabelidColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoColorProducto = new JLabelMe();
		this.jLabelcodigoColorProducto.setText(""+ColorProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoColorProducto.setToolTipText("Codigo");
		this.jLabelcodigoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutColorProducto = new GridBagLayout();
		this.jPanelcodigoColorProducto.setLayout(this.gridaBagLayoutColorProducto);


		jTextFieldcodigoColorProducto= new JTextFieldMe();

		jTextFieldcodigoColorProducto.setEnabled(false);
		jTextFieldcodigoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoColorProductoBusqueda= new JButtonMe();
		this.jButtoncodigoColorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoColorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoColorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoColorProductoBusqueda.setText("U");
		this.jButtoncodigoColorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoColorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoColorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoColorProductoBusqueda"));

		if(this.colorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoColorProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreColorProducto = new JLabelMe();
		this.jLabelnombreColorProducto.setText(""+ColorProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreColorProducto.setToolTipText("Nombre");
		this.jLabelnombreColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutColorProducto = new GridBagLayout();
		this.jPanelnombreColorProducto.setLayout(this.gridaBagLayoutColorProducto);


		jTextAreanombreColorProducto= new JTextAreaMe();
		jTextAreanombreColorProducto.setEnabled(false);
		jTextAreanombreColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreColorProducto.setLineWrap(true);
		jTextAreanombreColorProducto.setWrapStyleWord(true);
		jTextAreanombreColorProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreColorProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreColorProducto = new JScrollPane(jTextAreanombreColorProducto);
		jscrollPanenombreColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreColorProductoBusqueda= new JButtonMe();
		this.jButtonnombreColorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreColorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreColorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreColorProductoBusqueda.setText("U");
		this.jButtonnombreColorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreColorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreColorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreColorProductoBusqueda"));

		if(this.colorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreColorProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysColorProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaColorProducto = new JLabelMe();
		this.jLabelid_empresaColorProducto.setText(""+ColorProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaColorProducto.setToolTipText("Empresa");
		this.jLabelid_empresaColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutColorProducto = new GridBagLayout();
		this.jPanelid_empresaColorProducto.setLayout(this.gridaBagLayoutColorProducto);


		jComboBoxid_empresaColorProducto= new JComboBoxMe();
		jComboBoxid_empresaColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaColorProducto.setEnabled(false);

		this.jButtonid_empresaColorProducto= new JButtonMe();
		this.jButtonid_empresaColorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaColorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaColorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaColorProducto.setText("Buscar");
		this.jButtonid_empresaColorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaColorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaColorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaColorProducto"));

		this.jButtonid_empresaColorProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaColorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaColorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaColorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaColorProductoBusqueda.setText("U");
		this.jButtonid_empresaColorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaColorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaColorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaColorProductoBusqueda"));

		if(this.colorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaColorProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaColorProductoUpdate= new JButtonMe();
		this.jButtonid_empresaColorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaColorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaColorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaColorProductoUpdate.setText("U");
		this.jButtonid_empresaColorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaColorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaColorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaColorProductoUpdate"));



					
		this.jLabelid_tipo_productoColorProducto = new JLabelMe();
		this.jLabelid_tipo_productoColorProducto.setText(""+ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoColorProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutColorProducto = new GridBagLayout();
		this.jPanelid_tipo_productoColorProducto.setLayout(this.gridaBagLayoutColorProducto);


		jComboBoxid_tipo_productoColorProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoColorProducto= new JButtonMe();
		this.jButtonid_tipo_productoColorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoColorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoColorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoColorProducto.setText("Buscar");
		this.jButtonid_tipo_productoColorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoColorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoColorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoColorProducto"));

		this.jButtonid_tipo_productoColorProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoColorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoColorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoColorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoColorProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoColorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoColorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoColorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoColorProductoBusqueda"));

		if(this.colorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoColorProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoColorProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoColorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoColorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoColorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoColorProductoUpdate.setText("U");
		this.jButtonid_tipo_productoColorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoColorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoColorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoColorProductoUpdate"));



					
		this.jLabelid_grupo_colorColorProducto = new JLabelMe();
		this.jLabelid_grupo_colorColorProducto.setText(""+ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR+" : *");
		this.jLabelid_grupo_colorColorProducto.setToolTipText("Grupo Color");
		this.jLabelid_grupo_colorColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_colorColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_colorColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_colorColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_colorColorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_colorColorProducto.setToolTipText(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR);
		this.gridaBagLayoutColorProducto = new GridBagLayout();
		this.jPanelid_grupo_colorColorProducto.setLayout(this.gridaBagLayoutColorProducto);


		jComboBoxid_grupo_colorColorProducto= new JComboBoxMe();
		jComboBoxid_grupo_colorColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_colorColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_colorColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_colorColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_colorColorProducto= new JButtonMe();
		this.jButtonid_grupo_colorColorProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_colorColorProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_colorColorProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_colorColorProducto.setText("Buscar");
		this.jButtonid_grupo_colorColorProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_colorColorProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_colorColorProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_colorColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_colorColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_colorColorProducto"));

		this.jButtonid_grupo_colorColorProductoBusqueda= new JButtonMe();
		this.jButtonid_grupo_colorColorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_colorColorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_colorColorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_colorColorProductoBusqueda.setText("U");
		this.jButtonid_grupo_colorColorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_colorColorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_colorColorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_colorColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_colorColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_colorColorProductoBusqueda"));

		if(this.colorproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_colorColorProductoBusqueda.setVisible(false);		}

		this.jButtonid_grupo_colorColorProductoUpdate= new JButtonMe();
		this.jButtonid_grupo_colorColorProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_colorColorProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_colorColorProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_colorColorProductoUpdate.setText("U");
		this.jButtonid_grupo_colorColorProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_colorColorProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_colorColorProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_colorColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_colorColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_colorColorProductoUpdate"));



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
		//this.jInternalFrameDetalleColorProducto = new ColorProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Color Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutColorProducto= new GridBagLayout();
		

		
		String sToolTipColorProducto="";
		sToolTipColorProducto=ColorProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipColorProducto+="(Inventario.ColorProducto)";
		}
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipColorProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoColorProducto = new JButtonMe();
		this.jButtonModificarColorProducto = new JButtonMe();
        this.jButtonActualizarColorProducto = new JButtonMe();
        this.jButtonEliminarColorProducto = new JButtonMe();
        this.jButtonCancelarColorProducto = new JButtonMe();
        this.jButtonGuardarCambiosColorProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaColorProducto = new JButtonMe();
		this.jButtonCerrarColorProducto = new JButtonMe();
		
		this.jScrollPanelDatosColorProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionColorProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralColorProducto = new JScrollPane();
				
		
		
		this.jPanelCamposColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Color Producto";
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Color Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosColorProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposColorProducto.setName("jPanelCamposColorProducto"); 

		this.jPanelCamposOcultosColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosColorProducto.setName("jPanelCamposOcultosColorProducto"); 

        this.jPanelAccionesColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesColorProducto.setToolTipText("Acciones");
        this.jPanelAccionesColorProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioColorProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioColorProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoColorProducto.setText("Nuevo");
		this.jButtonModificarColorProducto.setText("Editar");
        this.jButtonActualizarColorProducto.setText("Actualizar");
        this.jButtonEliminarColorProducto.setText("Eliminar");
        this.jButtonCancelarColorProducto.setText("Cancelar");
        this.jButtonGuardarCambiosColorProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaColorProducto.setText("Guardar");
		this.jButtonCerrarColorProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoColorProducto,"nuevo_button","Nuevo",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarColorProducto,"modificar_button","Editar",this.colorproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarColorProducto,"actualizar_button","Actualizar",this.colorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarColorProducto,"eliminar_button","Eliminar",this.colorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarColorProducto,"cancelar_button","Cancelar",this.colorproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosColorProducto,"guardarcambios_button","Guardar",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaColorProducto,"guardarcambiostabla_button","Guardar",this.colorproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarColorProducto,"cerrar_button","Salir",this.colorproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoColorProducto.setToolTipText("Nuevo"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarColorProducto.setToolTipText("Editar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarColorProducto.setToolTipText("Actualizar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarColorProducto.setToolTipText("Eliminar)"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarColorProducto.setToolTipText("Cancelar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosColorProducto.setToolTipText("Guardar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaColorProducto.setToolTipText("Guardar"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarColorProducto.setToolTipText("Salir"+" "+ColorProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoColorProducto";
		inputMap = this.jButtonNuevoColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoColorProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoColorProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarColorProducto";
		inputMap = this.jButtonActualizarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarColorProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarColorProducto";
		inputMap = this.jButtonEliminarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarColorProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarColorProducto";
		inputMap = this.jButtonCancelarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarColorProducto"));
		
		//CERRAR		
		sMapKey = "CerrarColorProducto";
		inputMap = this.jButtonCerrarColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarColorProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaColorProducto";
		inputMap = this.jButtonGuardarCambiosTablaColorProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaColorProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaColorProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoColorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoColorProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoColorProducto.setToolTipText("Nuevo ColorProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarColorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarColorProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarColorProducto.setToolTipText("Sin Cerrar Ventana ColorProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeColorProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeColorProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeColorProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesColorProducto.setText("Accion");
		this.jComboBoxTiposAccionesColorProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioColorProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioColorProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioColorProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesColorProducto = new JLabelMe();
		
		this.jLabelAccionesColorProducto.setText("Acciones");		
		this.jLabelAccionesColorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposColorProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysColorProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesColorProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesColorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesColorProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesColorProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesColorProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioColorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioColorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioColorProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioColorProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposColorProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosColorProducto = new GridBagLayout();
		
		this.jPanelCamposColorProducto.setLayout(gridaBagLayoutCamposColorProducto);
		this.jPanelCamposOcultosColorProducto.setLayout(gridaBagLayoutCamposOcultosColorProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidColorProducto.add(jLabelIdColorProducto, this.gridBagConstraintsColorProducto);



	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidColorProducto.add(jLabelidColorProducto, this.gridBagConstraintsColorProducto);


	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaColorProducto.add(jLabelid_empresaColorProducto, this.gridBagConstraintsColorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 2;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaColorProducto.add(jButtonid_empresaColorProductoBusqueda, this.gridBagConstraintsColorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 3;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaColorProducto.add(jButtonid_empresaColorProductoUpdate, this.gridBagConstraintsColorProducto);
	}

	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaColorProducto.add(jComboBoxid_empresaColorProducto, this.gridBagConstraintsColorProducto);


	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoColorProducto.add(jLabelid_tipo_productoColorProducto, this.gridBagConstraintsColorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 2;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoColorProducto.add(jButtonid_tipo_productoColorProductoBusqueda, this.gridBagConstraintsColorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 3;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoColorProducto.add(jButtonid_tipo_productoColorProductoUpdate, this.gridBagConstraintsColorProducto);
	}

	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoColorProducto.add(jComboBoxid_tipo_productoColorProducto, this.gridBagConstraintsColorProducto);


	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_colorColorProducto.add(jLabelid_grupo_colorColorProducto, this.gridBagConstraintsColorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 2;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_colorColorProducto.add(jButtonid_grupo_colorColorProductoBusqueda, this.gridBagConstraintsColorProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 3;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_colorColorProducto.add(jButtonid_grupo_colorColorProductoUpdate, this.gridBagConstraintsColorProducto);
	}

	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_colorColorProducto.add(jComboBoxid_grupo_colorColorProducto, this.gridBagConstraintsColorProducto);


	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoColorProducto.add(jLabelcodigoColorProducto, this.gridBagConstraintsColorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 2;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoColorProducto.add(jButtoncodigoColorProductoBusqueda, this.gridBagConstraintsColorProducto);
	}

	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoColorProducto.add(jTextFieldcodigoColorProducto, this.gridBagConstraintsColorProducto);


	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 0;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreColorProducto.add(jLabelnombreColorProducto, this.gridBagConstraintsColorProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		//this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = 2;
		this.gridBagConstraintsColorProducto.ipadx = 0;
		this.gridBagConstraintsColorProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreColorProducto.add(jButtonnombreColorProductoBusqueda, this.gridBagConstraintsColorProducto);
	}

	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorProducto.gridy = 0;
	this.gridBagConstraintsColorProducto.gridx = 1;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreColorProducto.add(jscrollPanenombreColorProducto, this.gridBagConstraintsColorProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorProducto.add(this.jPanelidColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposColorProducto % 1==0) {
		iXPanelCamposColorProducto=0;
		iYPanelCamposColorProducto++;
	}
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorProducto.add(this.jPanelid_tipo_productoColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposColorProducto % 1==0) {
		iXPanelCamposColorProducto=0;
		iYPanelCamposColorProducto++;
	}
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorProducto.add(this.jPanelid_grupo_colorColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposColorProducto % 1==0) {
		iXPanelCamposColorProducto=0;
		iYPanelCamposColorProducto++;
	}
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorProducto.add(this.jPanelcodigoColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposColorProducto % 1==0) {
		iXPanelCamposColorProducto=0;
		iYPanelCamposColorProducto++;
	}
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorProducto.add(this.jPanelnombreColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposColorProducto % 1==0) {
		iXPanelCamposColorProducto=0;
		iYPanelCamposColorProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsColorProducto = new GridBagConstraints();
	this.gridBagConstraintsColorProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorProducto.gridy = iYPanelCamposOcultosColorProducto;
	this.gridBagConstraintsColorProducto.gridx = iXPanelCamposOcultosColorProducto++;
	this.gridBagConstraintsColorProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosColorProducto.add(this.jPanelid_empresaColorProducto, this.gridBagConstraintsColorProducto);



	if(iXPanelCamposOcultosColorProducto % 1==0) {
		iXPanelCamposOcultosColorProducto=0;
		iYPanelCamposOcultosColorProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesColorProducto= new GridBagLayout();
		this.jPanelAccionesColorProducto.setLayout(gridaBagLayoutAccionesColorProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioColorProducto= new GridBagLayout();
		this.jPanelAccionesFormularioColorProducto.setLayout(gridaBagLayoutAccionesFormularioColorProducto);
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsColorProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioColorProducto.add(this.jComboBoxTiposAccionesFormularioColorProducto, this.gridBagConstraintsColorProducto);

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsColorProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioColorProducto.add(this.jCheckBoxPostAccionNuevoColorProducto, this.gridBagConstraintsColorProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsColorProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioColorProducto.add(this.jCheckBoxPostAccionSinCerrarColorProducto, this.gridBagConstraintsColorProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsColorProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioColorProducto.add(this.jCheckBoxPostAccionSinMensajeColorProducto, this.gridBagConstraintsColorProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesColorProducto.add(this.jButtonModificarColorProducto, this.gridBagConstraintsColorProducto);							

		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorProducto.gridy = 0;
		this.gridBagConstraintsColorProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesColorProducto.add(this.jButtonEliminarColorProducto, this.gridBagConstraintsColorProducto);
		
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = 0;		
		this.gridBagConstraintsColorProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesColorProducto.add(this.jButtonActualizarColorProducto, this.gridBagConstraintsColorProducto);


		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = 0;		
		this.gridBagConstraintsColorProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesColorProducto.add(this.jButtonGuardarCambiosColorProducto, this.gridBagConstraintsColorProducto);	
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = 0;		
		this.gridBagConstraintsColorProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesColorProducto.add(this.jButtonCancelarColorProducto, this.gridBagConstraintsColorProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutColorProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutColorProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsColorProducto = new GridBagConstraints();						
			this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorProducto.gridx = 0;		
			//this.gridBagConstraintsColorProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsColorProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsColorProducto.gridx =0;
		this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsColorProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosColorProducto, this.gridBagConstraintsColorProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleColorProducto = new ColorProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Color Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Color Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Color Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ColorProductoModel colorproductoModel=new ColorProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ColorProductoModel.ColorProductoFocusTraversalPolicy colorproductoFocusTraversalPolicy = colorproductoModel.new ColorProductoFocusTraversalPolicy(this);
			
			//colorproductoFocusTraversalPolicy.setcolorproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(colorproductoModel);
			
			
			this.jContentPaneDetalleColorProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleColorProducto = new GridBagLayout();	
			this.jContentPaneDetalleColorProducto.setLayout(gridaBagLayoutDetalleColorProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosColorProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsColorProducto = new GridBagConstraints();
				this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsColorProducto.gridx = 0;
					
				
				this.jContentPaneDetalleColorProducto.add(jTtoolBarDetalleColorProducto, gridBagConstraintsColorProducto);								
				
}
			
			this.jScrollPanelDatosEdicionColorProducto=   new JScrollPane(jContentPaneDetalleColorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionColorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralColorProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralColorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsColorProducto.gridx = 0;
	        
			this.jContentPaneDetalleColorProducto.add(jPanelCamposColorProducto, gridBagConstraintsColorProducto);
			
			
			
			
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
						&& colorproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsColorProducto= new GridBagConstraints();
						this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsColorProducto.gridx = 0;
						this.jContentPaneDetalleColorProducto.add(this.jTabbedPaneRelacionesColorProducto, this.gridBagConstraintsColorProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesColorProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosColorProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsColorProducto = new GridBagConstraints();
					this.gridBagConstraintsColorProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsColorProducto.gridx = 0;
					
				
					this.jContentPaneDetalleColorProducto.add(jPanelCamposOcultosColorProducto, gridBagConstraintsColorProducto);
				
					this.jPanelCamposOcultosColorProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsColorProducto.gridx = 0;
	        this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleColorProducto.add(this.jPanelAccionesFormularioColorProducto, this.gridBagConstraintsColorProducto);							
			
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
	        this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsColorProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleColorProducto.add(this.jPanelAccionesColorProducto, this.gridBagConstraintsColorProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionColorProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionColorProducto=   new JScrollPane(this.jPanelCamposColorProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionColorProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsColorProducto.gridx = 0;
			this.gridBagConstraintsColorProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsColorProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsColorProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionColorProducto, this.gridBagConstraintsColorProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsColorProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioColorProducto, this.gridBagConstraintsColorProducto);			
			
			this.gridBagConstraintsColorProducto = new GridBagConstraints();
			this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsColorProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesColorProducto, this.gridBagConstraintsColorProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposColorProducto, this.gridBagConstraintsColorProducto);
			
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosColorProducto, this.gridBagConstraintsColorProducto);
		
			
		this.gridBagConstraintsColorProducto = new GridBagConstraints();
		this.gridBagConstraintsColorProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsColorProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesColorProducto, this.gridBagConstraintsColorProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralColorProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionColorProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsColorProducto = new GridBagConstraints();
				//this.gridBagConstraintsColorProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsColorProducto.gridx = 0;
				//this.jContentPaneDetalleColorProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsColorProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesColorProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesColorProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesColorProducto.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<ColorProducto> colorproductos,ColorProducto colorproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.colorproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setcolorproductosForeignKey(colorproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setcolorproductoForeignKey(colorproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionColorProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidColorProductoActual(colorproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaColorProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_color_productoFK_IdColorProducto(colorproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameColorProductoForeignKey(colorproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdColorProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdColorProducto");
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
