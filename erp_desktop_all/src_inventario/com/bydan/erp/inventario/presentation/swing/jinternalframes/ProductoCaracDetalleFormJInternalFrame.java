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
import com.bydan.erp.inventario.util.ProductoCaracConstantesFunciones;

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
public class ProductoCaracDetalleFormJInternalFrame extends ProductoCaracBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoCarac;
	
	protected JMenuBar jmenuBarDetalleProductoCarac;
	
	protected JMenu jmenuDetalleProductoCarac;
	protected JMenu jmenuDetalleArchivoProductoCarac;
	protected JMenu jmenuDetalleAccionesProductoCarac;
	protected JMenu jmenuDetalleDatosProductoCarac;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoCarac;	
	protected GridBagConstraints gridBagConstraintsProductoCarac;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoCaracBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoCarac;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoCaracSessionBean productocaracSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductoCaracLogic productocaracLogic;
	
	public JScrollPane jScrollPanelDatosProductoCarac;
	public JScrollPane jScrollPanelDatosEdicionProductoCarac;
	public JScrollPane jScrollPanelDatosGeneralProductoCarac;
	
	protected JPanel jPanelCamposProductoCarac;    
	protected JPanel jPanelCamposOcultosProductoCarac;    	
	protected JPanel jPanelAccionesProductoCarac;
	protected JPanel jPanelAccionesFormularioProductoCarac;
    
	
	
	protected Integer iXPanelCamposProductoCarac=0;
	protected Integer iYPanelCamposProductoCarac=0;
	
	protected Integer iXPanelCamposOcultosProductoCarac=0;
	protected Integer iYPanelCamposOcultosProductoCarac=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoCarac;
	public JButton jButtonModificarProductoCarac;
	public JButton jButtonActualizarProductoCarac;
    public JButton jButtonEliminarProductoCarac;
	public JButton jButtonCancelarProductoCarac;
    public JButton jButtonGuardarCambiosProductoCarac;
	public JButton jButtonGuardarCambiosTablaProductoCarac;
	protected JButton jButtonCerrarProductoCarac;
	
	
	protected JButton jButtonProcesarInformacionProductoCarac;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoCarac;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoCarac;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoCarac;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoCarac;
	protected JButton jButtonModificarToolBarProductoCarac;
	protected JButton jButtonActualizarToolBarProductoCarac;
    protected JButton jButtonEliminarToolBarProductoCarac;
	protected JButton jButtonCancelarToolBarProductoCarac;
    protected JButton jButtonGuardarCambiosToolBarProductoCarac;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoCarac;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoCarac;
	protected JButton jButtonCerrarToolBarProductoCarac;
	
	protected JButton jButtonProcesarInformacionToolBarProductoCarac;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoCarac;
	protected JMenuItem jMenuItemModificarProductoCarac;
	protected JMenuItem jMenuItemActualizarProductoCarac;
    protected JMenuItem jMenuItemEliminarProductoCarac;
	protected JMenuItem jMenuItemCancelarProductoCarac;
    protected JMenuItem jMenuItemGuardarCambiosProductoCarac;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoCarac;
	protected JMenuItem jMenuItemCerrarProductoCarac;
	protected JMenuItem jMenuItemDetalleCerrarProductoCarac;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoCarac;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoCarac;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoCarac;
	protected JMenuItem jMenuItemMostrarOcultarProductoCarac;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoCarac;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoCarac;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoCarac;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoCarac;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoCarac;
	public JLabel jLabelIdProductoCarac;
	public JLabel jLabelidProductoCarac;
	public JButton jButtonidProductoCaracBusqueda= new JButtonMe();

	public JPanel jPanelcaracteristicaProductoCarac;
	public JLabel jLabelcaracteristicaProductoCarac;
	public JTextArea jTextAreacaracteristicaProductoCarac;
	public JScrollPane jscrollPanecaracteristicaProductoCarac;
	public JButton jButtoncaracteristicaProductoCaracBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoCarac;
	public JLabel jLabelid_empresaProductoCarac;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoCarac;
	public JButton jButtonid_empresaProductoCarac= new JButtonMe();
	public JButton jButtonid_empresaProductoCaracUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoCaracBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoCarac;
	public JLabel jLabelid_sucursalProductoCarac;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoCarac;
	public JButton jButtonid_sucursalProductoCarac= new JButtonMe();
	public JButton jButtonid_sucursalProductoCaracUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoCaracBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoCarac;
	public JLabel jLabelid_productoProductoCarac;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoCarac;
	public JButton jButtonid_productoProductoCarac= new JButtonMe();
	public JButton jButtonid_productoProductoCaracUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoCaracBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoCarac;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoCaracDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoCarac=new JPanel();
				this.jPanelAccionesFormularioProductoCarac=new JPanel();
				this.jmenuBarDetalleProductoCarac=new JMenuBar();
				this.jTtoolBarDetalleProductoCarac=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoCaracDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCaracDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoCarac No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoCarac() {
		return this.jButtonActualizarToolBarProductoCarac;
	}
	
	public JButton getjButtonEliminarToolBarProductoCarac() {
		return this.jButtonEliminarToolBarProductoCarac;
	}
	
	public JButton getjButtonCancelarToolBarProductoCarac() {
		return this.jButtonCancelarToolBarProductoCarac;
	}		
	
	public JButton getjButtonProcesarInformacionProductoCarac() {
		return this.jButtonProcesarInformacionProductoCarac;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoCarac)	{
		this.jButtonProcesarInformacionProductoCarac = jButtonProcesarInformacionProductoCarac;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoCarac() {
		return this.jComboBoxTiposAccionesProductoCarac;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoCarac(
			JComboBox jComboBoxTiposRelacionesProductoCarac) {
		this.jComboBoxTiposRelacionesProductoCarac = jComboBoxTiposRelacionesProductoCarac;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoCarac(
			JComboBox jComboBoxTiposAccionesProductoCarac) {
		this.jComboBoxTiposAccionesProductoCarac = jComboBoxTiposAccionesProductoCarac;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoCarac() {
		return this.jComboBoxTiposAccionesFormularioProductoCarac;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoCarac(
			JComboBox jComboBoxTiposAccionesFormularioProductoCarac) {
		this.jComboBoxTiposAccionesFormularioProductoCarac = jComboBoxTiposAccionesFormularioProductoCarac;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productocaracSessionBean=new ProductoCaracSessionBean();
		
		this.productocaracSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productocaracSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productocaracSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoCaracJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caracteristica MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoCaracJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoCarac= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoCarac=new JButtonMe();
				this.jButtonModificarToolBarProductoCarac=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoCarac,this.jTtoolBarDetalleProductoCarac,
							"actualizar","actualizar","Actualizar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoCarac,this.jTtoolBarDetalleProductoCarac,
							"eliminar","eliminar","Eliminar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoCarac,this.jTtoolBarDetalleProductoCarac,
							"cancelar","cancelar","Cancelar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoCarac=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoCarac,this.jTtoolBarDetalleProductoCarac,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoCarac=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoCarac=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoCarac=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoCarac=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoCarac=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoCarac= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoCarac.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoCarac,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoCarac= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoCarac.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoCarac,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoCarac= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoCarac.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoCarac,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoCarac= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoCarac.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoCarac,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoCarac= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoCarac.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoCarac,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoCarac= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoCarac.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoCarac,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoCarac= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoCarac.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoCarac,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoCarac= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoCarac.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoCarac,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoCarac= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoCarac.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoCarac,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoCarac= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoCarac.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoCarac,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoCarac.add(this.jMenuItemDetalleCerrarProductoCarac);
		
		this.jmenuDetalleAccionesProductoCarac.add(this.jMenuItemActualizarProductoCarac);
		this.jmenuDetalleAccionesProductoCarac.add(this.jMenuItemEliminarProductoCarac);
		this.jmenuDetalleAccionesProductoCarac.add(this.jMenuItemCancelarProductoCarac);		
		
		//this.jmenuDetalleDatosProductoCarac.add(this.jMenuItemDetalleAbrirOrderByProductoCarac);				
		this.jmenuDetalleDatosProductoCarac.add(this.jMenuItemDetalleMostarOcultarProductoCarac);				
				
		//this.jmenuDetalleAccionesProductoCarac.add(this.jMenuItemGuardarCambiosProductoCarac);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoCarac.add(this.jmenuDetalleArchivoProductoCarac);		
		this.jmenuBarDetalleProductoCarac.add(this.jmenuDetalleAccionesProductoCarac);		
		this.jmenuBarDetalleProductoCarac.add(this.jmenuDetalleDatosProductoCarac);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoCarac);				
	}
	
	
	public void inicializarElementosCamposProductoCarac() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoCarac = new JLabelMe();
		jLabelIdProductoCarac.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoCarac = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoCarac.setToolTipText(ProductoCaracConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoCarac= new GridBagLayout();

		this.jPanelidProductoCarac.setLayout(this.gridaBagLayoutProductoCarac);

		jLabelidProductoCarac = new JLabel();
		jLabelidProductoCarac.setText("Id");

		jLabelidProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcaracteristicaProductoCarac = new JLabelMe();
		this.jLabelcaracteristicaProductoCarac.setText(""+ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA+" : *");
		this.jLabelcaracteristicaProductoCarac.setToolTipText("Caracteristica");
		this.jLabelcaracteristicaProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcaracteristicaProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcaracteristicaProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcaracteristicaProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcaracteristicaProductoCarac=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcaracteristicaProductoCarac.setToolTipText(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA);
		this.gridaBagLayoutProductoCarac = new GridBagLayout();
		this.jPanelcaracteristicaProductoCarac.setLayout(this.gridaBagLayoutProductoCarac);


		jTextAreacaracteristicaProductoCarac= new JTextAreaMe();
		jTextAreacaracteristicaProductoCarac.setEnabled(false);
		jTextAreacaracteristicaProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacaracteristicaProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacaracteristicaProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacaracteristicaProductoCarac.setLineWrap(true);
		jTextAreacaracteristicaProductoCarac.setWrapStyleWord(true);
		jTextAreacaracteristicaProductoCarac.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacaracteristicaProductoCarac.setRows(12);

		FuncionesSwing.setBoldTextArea(jTextAreacaracteristicaProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecaracteristicaProductoCarac = new JScrollPane(jTextAreacaracteristicaProductoCarac);
		jscrollPanecaracteristicaProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecaracteristicaProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecaracteristicaProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoncaracteristicaProductoCaracBusqueda= new JButtonMe();
		this.jButtoncaracteristicaProductoCaracBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncaracteristicaProductoCaracBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncaracteristicaProductoCaracBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncaracteristicaProductoCaracBusqueda.setText("U");
		this.jButtoncaracteristicaProductoCaracBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncaracteristicaProductoCaracBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncaracteristicaProductoCaracBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacaracteristicaProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacaracteristicaProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"caracteristicaProductoCaracBusqueda"));

		if(this.productocaracSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncaracteristicaProductoCaracBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoCarac() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoCarac = new JLabelMe();
		this.jLabelid_empresaProductoCarac.setText(""+ProductoCaracConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoCarac.setToolTipText("Empresa");
		this.jLabelid_empresaProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoCarac=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoCarac.setToolTipText(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoCarac = new GridBagLayout();
		this.jPanelid_empresaProductoCarac.setLayout(this.gridaBagLayoutProductoCarac);


		jComboBoxid_empresaProductoCarac= new JComboBoxMe();
		jComboBoxid_empresaProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoCarac.setEnabled(false);

		this.jButtonid_empresaProductoCarac= new JButtonMe();
		this.jButtonid_empresaProductoCarac.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCarac.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCarac.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCarac.setText("Buscar");
		this.jButtonid_empresaProductoCarac.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoCarac.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCarac,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCarac"));

		this.jButtonid_empresaProductoCaracBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoCaracBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCaracBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCaracBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoCaracBusqueda.setText("U");
		this.jButtonid_empresaProductoCaracBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoCaracBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCaracBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCaracBusqueda"));

		if(this.productocaracSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoCaracBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoCaracUpdate= new JButtonMe();
		this.jButtonid_empresaProductoCaracUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCaracUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCaracUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoCaracUpdate.setText("U");
		this.jButtonid_empresaProductoCaracUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoCaracUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCaracUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCaracUpdate"));



					
		this.jLabelid_sucursalProductoCarac = new JLabelMe();
		this.jLabelid_sucursalProductoCarac.setText(""+ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoCarac.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoCarac=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoCarac.setToolTipText(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoCarac = new GridBagLayout();
		this.jPanelid_sucursalProductoCarac.setLayout(this.gridaBagLayoutProductoCarac);


		jComboBoxid_sucursalProductoCarac= new JComboBoxMe();
		jComboBoxid_sucursalProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoCarac.setEnabled(false);

		this.jButtonid_sucursalProductoCarac= new JButtonMe();
		this.jButtonid_sucursalProductoCarac.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCarac.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCarac.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCarac.setText("Buscar");
		this.jButtonid_sucursalProductoCarac.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoCarac.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCarac,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCarac"));

		this.jButtonid_sucursalProductoCaracBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoCaracBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCaracBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCaracBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoCaracBusqueda.setText("U");
		this.jButtonid_sucursalProductoCaracBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoCaracBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCaracBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCaracBusqueda"));

		if(this.productocaracSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoCaracBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoCaracUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoCaracUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCaracUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCaracUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoCaracUpdate.setText("U");
		this.jButtonid_sucursalProductoCaracUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoCaracUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCaracUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCaracUpdate"));



					
		this.jLabelid_productoProductoCarac = new JLabelMe();
		this.jLabelid_productoProductoCarac.setText(""+ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoCarac.setToolTipText("Producto");
		this.jLabelid_productoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoCarac=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoCarac.setToolTipText(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoCarac = new GridBagLayout();
		this.jPanelid_productoProductoCarac.setLayout(this.gridaBagLayoutProductoCarac);


		jComboBoxid_productoProductoCarac= new JComboBoxMe();
		jComboBoxid_productoProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoCarac= new JButtonMe();
		this.jButtonid_productoProductoCarac.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCarac.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCarac.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCarac.setText("Buscar");
		this.jButtonid_productoProductoCarac.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoCarac.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCarac,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCarac"));

		this.jButtonid_productoProductoCaracBusqueda= new JButtonMe();
		this.jButtonid_productoProductoCaracBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCaracBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCaracBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoCaracBusqueda.setText("U");
		this.jButtonid_productoProductoCaracBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoCaracBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCaracBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCaracBusqueda"));

		if(this.productocaracSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoCaracBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoCaracUpdate= new JButtonMe();
		this.jButtonid_productoProductoCaracUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCaracUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCaracUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoCaracUpdate.setText("U");
		this.jButtonid_productoProductoCaracUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoCaracUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCaracUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCaracUpdate"));



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
		//this.jInternalFrameDetalleProductoCarac = new ProductoCaracBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caracteristica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoCarac= new GridBagLayout();
		

		
		String sToolTipProductoCarac="";
		sToolTipProductoCarac=ProductoCaracConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoCarac+="(Inventario.ProductoCarac)";
		}
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoCarac+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoCarac = new JButtonMe();
		this.jButtonModificarProductoCarac = new JButtonMe();
        this.jButtonActualizarProductoCarac = new JButtonMe();
        this.jButtonEliminarProductoCarac = new JButtonMe();
        this.jButtonCancelarProductoCarac = new JButtonMe();
        this.jButtonGuardarCambiosProductoCarac = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoCarac = new JButtonMe();
		this.jButtonCerrarProductoCarac = new JButtonMe();
		
		this.jScrollPanelDatosProductoCarac = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoCarac = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoCarac = new JScrollPane();
				
		
		
		this.jPanelCamposProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caracteristica";
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caracteristicas" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoCarac.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoCarac.setName("jPanelCamposProductoCarac"); 

		this.jPanelCamposOcultosProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoCarac.setName("jPanelCamposOcultosProductoCarac"); 

        this.jPanelAccionesProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoCarac.setToolTipText("Acciones");
        this.jPanelAccionesProductoCarac.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoCarac.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoCarac.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoCarac.setText("Nuevo");
		this.jButtonModificarProductoCarac.setText("Editar");
        this.jButtonActualizarProductoCarac.setText("Actualizar");
        this.jButtonEliminarProductoCarac.setText("Eliminar");
        this.jButtonCancelarProductoCarac.setText("Cancelar");
        this.jButtonGuardarCambiosProductoCarac.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoCarac.setText("Guardar");
		this.jButtonCerrarProductoCarac.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoCarac,"nuevo_button","Nuevo",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoCarac,"modificar_button","Editar",this.productocaracSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoCarac,"actualizar_button","Actualizar",this.productocaracSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoCarac,"eliminar_button","Eliminar",this.productocaracSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoCarac,"cancelar_button","Cancelar",this.productocaracSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoCarac,"guardarcambios_button","Guardar",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoCarac,"guardarcambiostabla_button","Guardar",this.productocaracSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoCarac,"cerrar_button","Salir",this.productocaracSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoCarac.setToolTipText("Nuevo"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoCarac.setToolTipText("Editar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoCarac.setToolTipText("Actualizar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoCarac.setToolTipText("Eliminar)"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoCarac.setToolTipText("Cancelar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoCarac.setToolTipText("Guardar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoCarac.setToolTipText("Guardar"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoCarac.setToolTipText("Salir"+" "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoCarac";
		inputMap = this.jButtonNuevoProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoCarac.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoCarac"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoCarac";
		inputMap = this.jButtonActualizarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoCarac"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoCarac";
		inputMap = this.jButtonEliminarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoCarac"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoCarac";
		inputMap = this.jButtonCancelarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoCarac"));
		
		//CERRAR		
		sMapKey = "CerrarProductoCarac";
		inputMap = this.jButtonCerrarProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoCarac"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoCarac";
		inputMap = this.jButtonGuardarCambiosTablaProductoCarac.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoCarac.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoCarac"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoCarac = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoCarac.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoCarac.setToolTipText("Nuevo ProductoCarac");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoCarac = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoCarac.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoCarac.setToolTipText("Sin Cerrar Ventana ProductoCarac");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoCarac = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoCarac.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoCarac.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoCarac.setText("Accion");
		this.jComboBoxTiposAccionesProductoCarac.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoCarac = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoCarac.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoCarac.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoCarac = new JLabelMe();
		
		this.jLabelAccionesProductoCarac.setText("Acciones");		
		this.jLabelAccionesProductoCarac.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCarac.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCarac.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoCarac();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoCarac();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoCarac=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoCarac.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoCarac,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoCarac.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCarac.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCarac.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoCarac, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoCarac.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoCarac.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoCarac.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoCarac, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoCarac = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoCarac = new GridBagLayout();
		
		this.jPanelCamposProductoCarac.setLayout(gridaBagLayoutCamposProductoCarac);
		this.jPanelCamposOcultosProductoCarac.setLayout(gridaBagLayoutCamposOcultosProductoCarac);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 0;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoCarac.add(jLabelIdProductoCarac, this.gridBagConstraintsProductoCarac);



	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 1;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoCarac.add(jLabelidProductoCarac, this.gridBagConstraintsProductoCarac);


	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 0;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoCarac.add(jLabelid_empresaProductoCarac, this.gridBagConstraintsProductoCarac);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 2;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoCarac.add(jButtonid_empresaProductoCaracBusqueda, this.gridBagConstraintsProductoCarac);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 3;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoCarac.add(jButtonid_empresaProductoCaracUpdate, this.gridBagConstraintsProductoCarac);
	}

	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 1;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoCarac.add(jComboBoxid_empresaProductoCarac, this.gridBagConstraintsProductoCarac);


	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 0;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoCarac.add(jLabelid_sucursalProductoCarac, this.gridBagConstraintsProductoCarac);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 2;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoCarac.add(jButtonid_sucursalProductoCaracBusqueda, this.gridBagConstraintsProductoCarac);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 3;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoCarac.add(jButtonid_sucursalProductoCaracUpdate, this.gridBagConstraintsProductoCarac);
	}

	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 1;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoCarac.add(jComboBoxid_sucursalProductoCarac, this.gridBagConstraintsProductoCarac);


	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 0;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoCarac.add(jLabelid_productoProductoCarac, this.gridBagConstraintsProductoCarac);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 2;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoCarac.add(jButtonid_productoProductoCarac, this.gridBagConstraintsProductoCarac);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 3;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoCarac.add(jButtonid_productoProductoCaracBusqueda, this.gridBagConstraintsProductoCarac);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 4;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoCarac.add(jButtonid_productoProductoCaracUpdate, this.gridBagConstraintsProductoCarac);
	}

	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 1;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoCarac.add(jComboBoxid_productoProductoCarac, this.gridBagConstraintsProductoCarac);


	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 0;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcaracteristicaProductoCarac.add(jLabelcaracteristicaProductoCarac, this.gridBagConstraintsProductoCarac);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		//this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = 2;
		this.gridBagConstraintsProductoCarac.ipadx = 0;
		this.gridBagConstraintsProductoCarac.insets = new Insets(0, 0, 0, 0);
		this.jPanelcaracteristicaProductoCarac.add(jButtoncaracteristicaProductoCaracBusqueda, this.gridBagConstraintsProductoCarac);
	}

	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCarac.gridy = 0;
	this.gridBagConstraintsProductoCarac.gridx = 1;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcaracteristicaProductoCarac.add(jscrollPanecaracteristicaProductoCarac, this.gridBagConstraintsProductoCarac);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCarac.gridy = iYPanelCamposProductoCarac;
	this.gridBagConstraintsProductoCarac.gridx = iXPanelCamposProductoCarac++;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCarac.add(this.jPanelidProductoCarac, this.gridBagConstraintsProductoCarac);



	if(iXPanelCamposProductoCarac % 1==0) {
		iXPanelCamposProductoCarac=0;
		iYPanelCamposProductoCarac++;
	}
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCarac.gridy = iYPanelCamposProductoCarac;
	this.gridBagConstraintsProductoCarac.gridx = iXPanelCamposProductoCarac++;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCarac.add(this.jPanelid_productoProductoCarac, this.gridBagConstraintsProductoCarac);



	if(iXPanelCamposProductoCarac % 1==0) {
		iXPanelCamposProductoCarac=0;
		iYPanelCamposProductoCarac++;
	}
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCarac.gridy = iYPanelCamposProductoCarac;
	this.gridBagConstraintsProductoCarac.gridx = iXPanelCamposProductoCarac++;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCarac.add(this.jPanelcaracteristicaProductoCarac, this.gridBagConstraintsProductoCarac);



	if(iXPanelCamposProductoCarac % 1==0) {
		iXPanelCamposProductoCarac=0;
		iYPanelCamposProductoCarac++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCarac.gridy = iYPanelCamposOcultosProductoCarac;
	this.gridBagConstraintsProductoCarac.gridx = iXPanelCamposOcultosProductoCarac++;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoCarac.add(this.jPanelid_empresaProductoCarac, this.gridBagConstraintsProductoCarac);



	if(iXPanelCamposOcultosProductoCarac % 1==0) {
		iXPanelCamposOcultosProductoCarac=0;
		iYPanelCamposOcultosProductoCarac++;
	}
	this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCarac.gridy = iYPanelCamposOcultosProductoCarac;
	this.gridBagConstraintsProductoCarac.gridx = iXPanelCamposOcultosProductoCarac++;
	this.gridBagConstraintsProductoCarac.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCarac.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoCarac.add(this.jPanelid_sucursalProductoCarac, this.gridBagConstraintsProductoCarac);



	if(iXPanelCamposOcultosProductoCarac % 1==0) {
		iXPanelCamposOcultosProductoCarac=0;
		iYPanelCamposOcultosProductoCarac++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoCarac= new GridBagLayout();
		this.jPanelAccionesProductoCarac.setLayout(gridaBagLayoutAccionesProductoCarac);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoCarac= new GridBagLayout();
		this.jPanelAccionesFormularioProductoCarac.setLayout(gridaBagLayoutAccionesFormularioProductoCarac);
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoCarac.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoCarac.add(this.jComboBoxTiposAccionesFormularioProductoCarac, this.gridBagConstraintsProductoCarac);

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoCarac.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoCarac.add(this.jCheckBoxPostAccionNuevoProductoCarac, this.gridBagConstraintsProductoCarac);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoCarac.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoCarac.add(this.jCheckBoxPostAccionSinCerrarProductoCarac, this.gridBagConstraintsProductoCarac);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoCarac.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoCarac.add(this.jCheckBoxPostAccionSinMensajeProductoCarac, this.gridBagConstraintsProductoCarac);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoCarac.add(this.jButtonModificarProductoCarac, this.gridBagConstraintsProductoCarac);							

		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCarac.gridy = 0;
		this.gridBagConstraintsProductoCarac.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoCarac.add(this.jButtonEliminarProductoCarac, this.gridBagConstraintsProductoCarac);
		
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = 0;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoCarac.add(this.jButtonActualizarProductoCarac, this.gridBagConstraintsProductoCarac);


		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = 0;		
		this.gridBagConstraintsProductoCarac.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoCarac.add(this.jButtonGuardarCambiosProductoCarac, this.gridBagConstraintsProductoCarac);	
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = 0;		
		this.gridBagConstraintsProductoCarac.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoCarac.add(this.jButtonCancelarProductoCarac, this.gridBagConstraintsProductoCarac);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoCarac = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoCarac);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();						
			this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCarac.gridx = 0;		
			//this.gridBagConstraintsProductoCarac.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoCarac.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoCarac.gridx =0;
		this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoCarac.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoCarac, this.gridBagConstraintsProductoCarac);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoCarac = new ProductoCaracBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caracteristica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caracteristica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caracteristica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoCaracModel productocaracModel=new ProductoCaracModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoCaracModel.ProductoCaracFocusTraversalPolicy productocaracFocusTraversalPolicy = productocaracModel.new ProductoCaracFocusTraversalPolicy(this);
			
			//productocaracFocusTraversalPolicy.setproductocaracJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productocaracModel);
			
			
			this.jContentPaneDetalleProductoCarac = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoCarac = new GridBagLayout();	
			this.jContentPaneDetalleProductoCarac.setLayout(gridaBagLayoutDetalleProductoCarac);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoCarac = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoCarac = new GridBagConstraints();
				this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoCarac.gridx = 0;
					
				
				this.jContentPaneDetalleProductoCarac.add(jTtoolBarDetalleProductoCarac, gridBagConstraintsProductoCarac);								
				
}
			
			this.jScrollPanelDatosEdicionProductoCarac=   new JScrollPane(jContentPaneDetalleProductoCarac,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoCarac.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCarac.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCarac.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoCarac=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoCarac.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCarac.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCarac.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoCarac.gridx = 0;
	        
			this.jContentPaneDetalleProductoCarac.add(jPanelCamposProductoCarac, gridBagConstraintsProductoCarac);
			
			
			
			
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
						&& productocaracSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productocaracSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoCarac= new GridBagConstraints();
						this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoCarac.gridx = 0;
						this.jContentPaneDetalleProductoCarac.add(this.jTabbedPaneRelacionesProductoCarac, this.gridBagConstraintsProductoCarac);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoCarac.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoCarac.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoCarac = new GridBagConstraints();
					this.gridBagConstraintsProductoCarac.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoCarac.gridx = 0;
					
				
					this.jContentPaneDetalleProductoCarac.add(jPanelCamposOcultosProductoCarac, gridBagConstraintsProductoCarac);
				
					this.jPanelCamposOcultosProductoCarac.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoCarac.gridx = 0;
	        this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoCarac.add(this.jPanelAccionesFormularioProductoCarac, this.gridBagConstraintsProductoCarac);							
			
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
	        this.gridBagConstraintsProductoCarac.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoCarac.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoCarac.add(this.jPanelAccionesProductoCarac, this.gridBagConstraintsProductoCarac);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoCarac);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoCarac=   new JScrollPane(this.jPanelCamposProductoCarac,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoCarac.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCarac.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCarac.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoCarac.gridx = 0;
			this.gridBagConstraintsProductoCarac.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoCarac.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoCarac.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoCarac, this.gridBagConstraintsProductoCarac);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoCarac.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoCarac, this.gridBagConstraintsProductoCarac);			
			
			this.gridBagConstraintsProductoCarac = new GridBagConstraints();
			this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoCarac.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoCarac, this.gridBagConstraintsProductoCarac);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoCarac, this.gridBagConstraintsProductoCarac);
			
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoCarac, this.gridBagConstraintsProductoCarac);
		
			
		this.gridBagConstraintsProductoCarac = new GridBagConstraints();
		this.gridBagConstraintsProductoCarac.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoCarac.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoCarac, this.gridBagConstraintsProductoCarac);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoCarac;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoCarac;
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
