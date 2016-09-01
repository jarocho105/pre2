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
import com.bydan.erp.inventario.util.ProductoEspeciConstantesFunciones;

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
public class ProductoEspeciDetalleFormJInternalFrame extends ProductoEspeciBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoEspeci;
	
	protected JMenuBar jmenuBarDetalleProductoEspeci;
	
	protected JMenu jmenuDetalleProductoEspeci;
	protected JMenu jmenuDetalleArchivoProductoEspeci;
	protected JMenu jmenuDetalleAccionesProductoEspeci;
	protected JMenu jmenuDetalleDatosProductoEspeci;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoEspeci;	
	protected GridBagConstraints gridBagConstraintsProductoEspeci;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoEspeciBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoEspeci;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public ProductoEspeciSessionBean productoespeciSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public ProductoEspeciLogic productoespeciLogic;
	
	public JScrollPane jScrollPanelDatosProductoEspeci;
	public JScrollPane jScrollPanelDatosEdicionProductoEspeci;
	public JScrollPane jScrollPanelDatosGeneralProductoEspeci;
	
	protected JPanel jPanelCamposProductoEspeci;    
	protected JPanel jPanelCamposOcultosProductoEspeci;    	
	protected JPanel jPanelAccionesProductoEspeci;
	protected JPanel jPanelAccionesFormularioProductoEspeci;
    
	
	
	protected Integer iXPanelCamposProductoEspeci=0;
	protected Integer iYPanelCamposProductoEspeci=0;
	
	protected Integer iXPanelCamposOcultosProductoEspeci=0;
	protected Integer iYPanelCamposOcultosProductoEspeci=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoEspeci;
	public JButton jButtonModificarProductoEspeci;
	public JButton jButtonActualizarProductoEspeci;
    public JButton jButtonEliminarProductoEspeci;
	public JButton jButtonCancelarProductoEspeci;
    public JButton jButtonGuardarCambiosProductoEspeci;
	public JButton jButtonGuardarCambiosTablaProductoEspeci;
	protected JButton jButtonCerrarProductoEspeci;
	
	
	protected JButton jButtonProcesarInformacionProductoEspeci;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoEspeci;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoEspeci;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoEspeci;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoEspeci;
	protected JButton jButtonModificarToolBarProductoEspeci;
	protected JButton jButtonActualizarToolBarProductoEspeci;
    protected JButton jButtonEliminarToolBarProductoEspeci;
	protected JButton jButtonCancelarToolBarProductoEspeci;
    protected JButton jButtonGuardarCambiosToolBarProductoEspeci;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoEspeci;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoEspeci;
	protected JButton jButtonCerrarToolBarProductoEspeci;
	
	protected JButton jButtonProcesarInformacionToolBarProductoEspeci;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoEspeci;
	protected JMenuItem jMenuItemModificarProductoEspeci;
	protected JMenuItem jMenuItemActualizarProductoEspeci;
    protected JMenuItem jMenuItemEliminarProductoEspeci;
	protected JMenuItem jMenuItemCancelarProductoEspeci;
    protected JMenuItem jMenuItemGuardarCambiosProductoEspeci;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoEspeci;
	protected JMenuItem jMenuItemCerrarProductoEspeci;
	protected JMenuItem jMenuItemDetalleCerrarProductoEspeci;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoEspeci;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoEspeci;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoEspeci;
	protected JMenuItem jMenuItemMostrarOcultarProductoEspeci;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoEspeci;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoEspeci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoEspeci;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoEspeci;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoEspeci;
	public JLabel jLabelIdProductoEspeci;
	public JLabel jLabelidProductoEspeci;
	public JButton jButtonidProductoEspeciBusqueda= new JButtonMe();

	public JPanel jPanelespecificacionProductoEspeci;
	public JLabel jLabelespecificacionProductoEspeci;
	public JTextArea jTextAreaespecificacionProductoEspeci;
	public JScrollPane jscrollPaneespecificacionProductoEspeci;
	public JButton jButtonespecificacionProductoEspeciBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoEspeci;
	public JLabel jLabelid_empresaProductoEspeci;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoEspeci;
	public JButton jButtonid_empresaProductoEspeci= new JButtonMe();
	public JButton jButtonid_empresaProductoEspeciUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoEspeciBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoEspeci;
	public JLabel jLabelid_sucursalProductoEspeci;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoEspeci;
	public JButton jButtonid_sucursalProductoEspeci= new JButtonMe();
	public JButton jButtonid_sucursalProductoEspeciUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoEspeciBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoEspeci;
	public JLabel jLabelid_productoProductoEspeci;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoEspeci;
	public JButton jButtonid_productoProductoEspeci= new JButtonMe();
	public JButton jButtonid_productoProductoEspeciUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoEspeciBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoEspeci;
	
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
	
	public ProductoEspeciDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoEspeci=new JPanel();
				this.jPanelAccionesFormularioProductoEspeci=new JPanel();
				this.jmenuBarDetalleProductoEspeci=new JMenuBar();
				this.jTtoolBarDetalleProductoEspeci=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoEspeciDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoEspeciDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoEspeci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoEspeci() {
		return this.jButtonActualizarToolBarProductoEspeci;
	}
	
	public JButton getjButtonEliminarToolBarProductoEspeci() {
		return this.jButtonEliminarToolBarProductoEspeci;
	}
	
	public JButton getjButtonCancelarToolBarProductoEspeci() {
		return this.jButtonCancelarToolBarProductoEspeci;
	}		
	
	public JButton getjButtonProcesarInformacionProductoEspeci() {
		return this.jButtonProcesarInformacionProductoEspeci;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoEspeci)	{
		this.jButtonProcesarInformacionProductoEspeci = jButtonProcesarInformacionProductoEspeci;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoEspeci() {
		return this.jComboBoxTiposAccionesProductoEspeci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoEspeci(
			JComboBox jComboBoxTiposRelacionesProductoEspeci) {
		this.jComboBoxTiposRelacionesProductoEspeci = jComboBoxTiposRelacionesProductoEspeci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoEspeci(
			JComboBox jComboBoxTiposAccionesProductoEspeci) {
		this.jComboBoxTiposAccionesProductoEspeci = jComboBoxTiposAccionesProductoEspeci;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoEspeci() {
		return this.jComboBoxTiposAccionesFormularioProductoEspeci;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoEspeci(
			JComboBox jComboBoxTiposAccionesFormularioProductoEspeci) {
		this.jComboBoxTiposAccionesFormularioProductoEspeci = jComboBoxTiposAccionesFormularioProductoEspeci;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		
		this.productoespeciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoespeciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoespeciSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoEspeciJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Especificacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoEspeciJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoEspeci= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoEspeci=new JButtonMe();
				this.jButtonModificarToolBarProductoEspeci=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci,
							"actualizar","actualizar","Actualizar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci,
							"eliminar","eliminar","Eliminar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci,
							"cancelar","cancelar","Cancelar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoEspeci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoEspeci=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoEspeci=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoEspeci=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoEspeci=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoEspeci=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoEspeci= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoEspeci.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoEspeci,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoEspeci= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoEspeci.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoEspeci,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoEspeci= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoEspeci.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoEspeci,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoEspeci= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoEspeci.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoEspeci,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoEspeci= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoEspeci.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoEspeci,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoEspeci= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoEspeci.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoEspeci,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoEspeci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoEspeci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoEspeci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoEspeci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoEspeci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoEspeci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoEspeci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoEspeci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoEspeci,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoEspeci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoEspeci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoEspeci,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoEspeci.add(this.jMenuItemDetalleCerrarProductoEspeci);
		
		this.jmenuDetalleAccionesProductoEspeci.add(this.jMenuItemActualizarProductoEspeci);
		this.jmenuDetalleAccionesProductoEspeci.add(this.jMenuItemEliminarProductoEspeci);
		this.jmenuDetalleAccionesProductoEspeci.add(this.jMenuItemCancelarProductoEspeci);		
		
		//this.jmenuDetalleDatosProductoEspeci.add(this.jMenuItemDetalleAbrirOrderByProductoEspeci);				
		this.jmenuDetalleDatosProductoEspeci.add(this.jMenuItemDetalleMostarOcultarProductoEspeci);				
				
		//this.jmenuDetalleAccionesProductoEspeci.add(this.jMenuItemGuardarCambiosProductoEspeci);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoEspeci.add(this.jmenuDetalleArchivoProductoEspeci);		
		this.jmenuBarDetalleProductoEspeci.add(this.jmenuDetalleAccionesProductoEspeci);		
		this.jmenuBarDetalleProductoEspeci.add(this.jmenuDetalleDatosProductoEspeci);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoEspeci);				
	}
	
	
	public void inicializarElementosCamposProductoEspeci() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoEspeci = new JLabelMe();
		jLabelIdProductoEspeci.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoEspeci = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoEspeci.setToolTipText(ProductoEspeciConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoEspeci= new GridBagLayout();

		this.jPanelidProductoEspeci.setLayout(this.gridaBagLayoutProductoEspeci);

		jLabelidProductoEspeci = new JLabel();
		jLabelidProductoEspeci.setText("Id");

		jLabelidProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelespecificacionProductoEspeci = new JLabelMe();
		this.jLabelespecificacionProductoEspeci.setText(""+ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION+" : *");
		this.jLabelespecificacionProductoEspeci.setToolTipText("Especificacion");
		this.jLabelespecificacionProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelespecificacionProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelespecificacionProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelespecificacionProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelespecificacionProductoEspeci=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelespecificacionProductoEspeci.setToolTipText(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION);
		this.gridaBagLayoutProductoEspeci = new GridBagLayout();
		this.jPanelespecificacionProductoEspeci.setLayout(this.gridaBagLayoutProductoEspeci);


		jTextAreaespecificacionProductoEspeci= new JTextAreaMe();
		jTextAreaespecificacionProductoEspeci.setEnabled(false);
		jTextAreaespecificacionProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaespecificacionProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaespecificacionProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaespecificacionProductoEspeci.setLineWrap(true);
		jTextAreaespecificacionProductoEspeci.setWrapStyleWord(true);
		jTextAreaespecificacionProductoEspeci.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaespecificacionProductoEspeci.setRows(12);

		FuncionesSwing.setBoldTextArea(jTextAreaespecificacionProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneespecificacionProductoEspeci = new JScrollPane(jTextAreaespecificacionProductoEspeci);
		jscrollPaneespecificacionProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneespecificacionProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneespecificacionProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonespecificacionProductoEspeciBusqueda= new JButtonMe();
		this.jButtonespecificacionProductoEspeciBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonespecificacionProductoEspeciBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonespecificacionProductoEspeciBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonespecificacionProductoEspeciBusqueda.setText("U");
		this.jButtonespecificacionProductoEspeciBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonespecificacionProductoEspeciBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonespecificacionProductoEspeciBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaespecificacionProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaespecificacionProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"especificacionProductoEspeciBusqueda"));

		if(this.productoespeciSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonespecificacionProductoEspeciBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoEspeci() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoEspeci = new JLabelMe();
		this.jLabelid_empresaProductoEspeci.setText(""+ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoEspeci.setToolTipText("Empresa");
		this.jLabelid_empresaProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoEspeci=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoEspeci.setToolTipText(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoEspeci = new GridBagLayout();
		this.jPanelid_empresaProductoEspeci.setLayout(this.gridaBagLayoutProductoEspeci);


		jComboBoxid_empresaProductoEspeci= new JComboBoxMe();
		jComboBoxid_empresaProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoEspeci.setEnabled(false);

		this.jButtonid_empresaProductoEspeci= new JButtonMe();
		this.jButtonid_empresaProductoEspeci.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEspeci.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEspeci.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoEspeci.setText("Buscar");
		this.jButtonid_empresaProductoEspeci.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoEspeci.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEspeci,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEspeci"));

		this.jButtonid_empresaProductoEspeciBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoEspeciBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEspeciBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEspeciBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoEspeciBusqueda.setText("U");
		this.jButtonid_empresaProductoEspeciBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoEspeciBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEspeciBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEspeciBusqueda"));

		if(this.productoespeciSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoEspeciBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoEspeciUpdate= new JButtonMe();
		this.jButtonid_empresaProductoEspeciUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEspeciUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoEspeciUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoEspeciUpdate.setText("U");
		this.jButtonid_empresaProductoEspeciUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoEspeciUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoEspeciUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoEspeciUpdate"));



					
		this.jLabelid_sucursalProductoEspeci = new JLabelMe();
		this.jLabelid_sucursalProductoEspeci.setText(""+ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoEspeci.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoEspeci=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoEspeci.setToolTipText(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoEspeci = new GridBagLayout();
		this.jPanelid_sucursalProductoEspeci.setLayout(this.gridaBagLayoutProductoEspeci);


		jComboBoxid_sucursalProductoEspeci= new JComboBoxMe();
		jComboBoxid_sucursalProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoEspeci.setEnabled(false);

		this.jButtonid_sucursalProductoEspeci= new JButtonMe();
		this.jButtonid_sucursalProductoEspeci.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEspeci.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEspeci.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoEspeci.setText("Buscar");
		this.jButtonid_sucursalProductoEspeci.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoEspeci.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEspeci,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEspeci"));

		this.jButtonid_sucursalProductoEspeciBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoEspeciBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEspeciBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEspeciBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoEspeciBusqueda.setText("U");
		this.jButtonid_sucursalProductoEspeciBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoEspeciBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEspeciBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEspeciBusqueda"));

		if(this.productoespeciSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoEspeciBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoEspeciUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoEspeciUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEspeciUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoEspeciUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoEspeciUpdate.setText("U");
		this.jButtonid_sucursalProductoEspeciUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoEspeciUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoEspeciUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoEspeciUpdate"));



					
		this.jLabelid_productoProductoEspeci = new JLabelMe();
		this.jLabelid_productoProductoEspeci.setText(""+ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoEspeci.setToolTipText("Producto");
		this.jLabelid_productoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoEspeci=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoEspeci.setToolTipText(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoEspeci = new GridBagLayout();
		this.jPanelid_productoProductoEspeci.setLayout(this.gridaBagLayoutProductoEspeci);


		jComboBoxid_productoProductoEspeci= new JComboBoxMe();
		jComboBoxid_productoProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoEspeci= new JButtonMe();
		this.jButtonid_productoProductoEspeci.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEspeci.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEspeci.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoEspeci.setText("Buscar");
		this.jButtonid_productoProductoEspeci.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoEspeci.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEspeci,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEspeci"));

		this.jButtonid_productoProductoEspeciBusqueda= new JButtonMe();
		this.jButtonid_productoProductoEspeciBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEspeciBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEspeciBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoEspeciBusqueda.setText("U");
		this.jButtonid_productoProductoEspeciBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoEspeciBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEspeciBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEspeciBusqueda"));

		if(this.productoespeciSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoEspeciBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoEspeciUpdate= new JButtonMe();
		this.jButtonid_productoProductoEspeciUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEspeciUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoEspeciUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoEspeciUpdate.setText("U");
		this.jButtonid_productoProductoEspeciUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoEspeciUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoEspeciUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoEspeciUpdate"));



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
		//this.jInternalFrameDetalleProductoEspeci = new ProductoEspeciBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Especificacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoEspeci= new GridBagLayout();
		

		
		String sToolTipProductoEspeci="";
		sToolTipProductoEspeci=ProductoEspeciConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoEspeci+="(Inventario.ProductoEspeci)";
		}
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoEspeci+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoEspeci = new JButtonMe();
		this.jButtonModificarProductoEspeci = new JButtonMe();
        this.jButtonActualizarProductoEspeci = new JButtonMe();
        this.jButtonEliminarProductoEspeci = new JButtonMe();
        this.jButtonCancelarProductoEspeci = new JButtonMe();
        this.jButtonGuardarCambiosProductoEspeci = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoEspeci = new JButtonMe();
		this.jButtonCerrarProductoEspeci = new JButtonMe();
		
		this.jScrollPanelDatosProductoEspeci = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoEspeci = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoEspeci = new JScrollPane();
				
		
		
		this.jPanelCamposProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Especificacion";
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificacions" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoEspeci.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoEspeci.setName("jPanelCamposProductoEspeci"); 

		this.jPanelCamposOcultosProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoEspeci.setName("jPanelCamposOcultosProductoEspeci"); 

        this.jPanelAccionesProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoEspeci.setToolTipText("Acciones");
        this.jPanelAccionesProductoEspeci.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoEspeci.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoEspeci.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoEspeci.setText("Nuevo");
		this.jButtonModificarProductoEspeci.setText("Editar");
        this.jButtonActualizarProductoEspeci.setText("Actualizar");
        this.jButtonEliminarProductoEspeci.setText("Eliminar");
        this.jButtonCancelarProductoEspeci.setText("Cancelar");
        this.jButtonGuardarCambiosProductoEspeci.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoEspeci.setText("Guardar");
		this.jButtonCerrarProductoEspeci.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoEspeci,"nuevo_button","Nuevo",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoEspeci,"modificar_button","Editar",this.productoespeciSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoEspeci,"actualizar_button","Actualizar",this.productoespeciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoEspeci,"eliminar_button","Eliminar",this.productoespeciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoEspeci,"cancelar_button","Cancelar",this.productoespeciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoEspeci,"guardarcambios_button","Guardar",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoEspeci,"guardarcambiostabla_button","Guardar",this.productoespeciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoEspeci,"cerrar_button","Salir",this.productoespeciSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoEspeci.setToolTipText("Nuevo"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoEspeci.setToolTipText("Editar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoEspeci.setToolTipText("Actualizar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoEspeci.setToolTipText("Eliminar)"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoEspeci.setToolTipText("Cancelar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoEspeci.setToolTipText("Guardar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoEspeci.setToolTipText("Guardar"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoEspeci.setToolTipText("Salir"+" "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoEspeci";
		inputMap = this.jButtonNuevoProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoEspeci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoEspeci"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoEspeci";
		inputMap = this.jButtonActualizarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoEspeci"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoEspeci";
		inputMap = this.jButtonEliminarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoEspeci"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoEspeci";
		inputMap = this.jButtonCancelarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoEspeci"));
		
		//CERRAR		
		sMapKey = "CerrarProductoEspeci";
		inputMap = this.jButtonCerrarProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoEspeci"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoEspeci";
		inputMap = this.jButtonGuardarCambiosTablaProductoEspeci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoEspeci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoEspeci"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoEspeci = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoEspeci.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoEspeci.setToolTipText("Nuevo ProductoEspeci");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoEspeci = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoEspeci.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoEspeci.setToolTipText("Sin Cerrar Ventana ProductoEspeci");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoEspeci = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoEspeci.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoEspeci.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoEspeci.setText("Accion");
		this.jComboBoxTiposAccionesProductoEspeci.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoEspeci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoEspeci.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoEspeci.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoEspeci = new JLabelMe();
		
		this.jLabelAccionesProductoEspeci.setText("Acciones");		
		this.jLabelAccionesProductoEspeci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEspeci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoEspeci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoEspeci();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoEspeci();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoEspeci=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoEspeci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoEspeci,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoEspeci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEspeci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoEspeci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoEspeci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoEspeci.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoEspeci.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoEspeci.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoEspeci, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoEspeci = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoEspeci = new GridBagLayout();
		
		this.jPanelCamposProductoEspeci.setLayout(gridaBagLayoutCamposProductoEspeci);
		this.jPanelCamposOcultosProductoEspeci.setLayout(gridaBagLayoutCamposOcultosProductoEspeci);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 0;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoEspeci.add(jLabelIdProductoEspeci, this.gridBagConstraintsProductoEspeci);



	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 1;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoEspeci.add(jLabelidProductoEspeci, this.gridBagConstraintsProductoEspeci);


	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 0;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoEspeci.add(jLabelid_empresaProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 2;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoEspeci.add(jButtonid_empresaProductoEspeciBusqueda, this.gridBagConstraintsProductoEspeci);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 3;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoEspeci.add(jButtonid_empresaProductoEspeciUpdate, this.gridBagConstraintsProductoEspeci);
	}

	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 1;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoEspeci.add(jComboBoxid_empresaProductoEspeci, this.gridBagConstraintsProductoEspeci);


	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 0;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoEspeci.add(jLabelid_sucursalProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 2;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoEspeci.add(jButtonid_sucursalProductoEspeciBusqueda, this.gridBagConstraintsProductoEspeci);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 3;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoEspeci.add(jButtonid_sucursalProductoEspeciUpdate, this.gridBagConstraintsProductoEspeci);
	}

	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 1;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoEspeci.add(jComboBoxid_sucursalProductoEspeci, this.gridBagConstraintsProductoEspeci);


	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 0;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoEspeci.add(jLabelid_productoProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 2;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoEspeci.add(jButtonid_productoProductoEspeci, this.gridBagConstraintsProductoEspeci);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 3;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoEspeci.add(jButtonid_productoProductoEspeciBusqueda, this.gridBagConstraintsProductoEspeci);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 4;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoEspeci.add(jButtonid_productoProductoEspeciUpdate, this.gridBagConstraintsProductoEspeci);
	}

	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 1;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoEspeci.add(jComboBoxid_productoProductoEspeci, this.gridBagConstraintsProductoEspeci);


	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 0;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelespecificacionProductoEspeci.add(jLabelespecificacionProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		//this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = 2;
		this.gridBagConstraintsProductoEspeci.ipadx = 0;
		this.gridBagConstraintsProductoEspeci.insets = new Insets(0, 0, 0, 0);
		this.jPanelespecificacionProductoEspeci.add(jButtonespecificacionProductoEspeciBusqueda, this.gridBagConstraintsProductoEspeci);
	}

	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoEspeci.gridy = 0;
	this.gridBagConstraintsProductoEspeci.gridx = 1;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelespecificacionProductoEspeci.add(jscrollPaneespecificacionProductoEspeci, this.gridBagConstraintsProductoEspeci);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEspeci.gridy = iYPanelCamposProductoEspeci;
	this.gridBagConstraintsProductoEspeci.gridx = iXPanelCamposProductoEspeci++;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEspeci.add(this.jPanelidProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(iXPanelCamposProductoEspeci % 1==0) {
		iXPanelCamposProductoEspeci=0;
		iYPanelCamposProductoEspeci++;
	}
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEspeci.gridy = iYPanelCamposProductoEspeci;
	this.gridBagConstraintsProductoEspeci.gridx = iXPanelCamposProductoEspeci++;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEspeci.add(this.jPanelid_productoProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(iXPanelCamposProductoEspeci % 1==0) {
		iXPanelCamposProductoEspeci=0;
		iYPanelCamposProductoEspeci++;
	}
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEspeci.gridy = iYPanelCamposProductoEspeci;
	this.gridBagConstraintsProductoEspeci.gridx = iXPanelCamposProductoEspeci++;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoEspeci.add(this.jPanelespecificacionProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(iXPanelCamposProductoEspeci % 1==0) {
		iXPanelCamposProductoEspeci=0;
		iYPanelCamposProductoEspeci++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEspeci.gridy = iYPanelCamposOcultosProductoEspeci;
	this.gridBagConstraintsProductoEspeci.gridx = iXPanelCamposOcultosProductoEspeci++;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoEspeci.add(this.jPanelid_empresaProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(iXPanelCamposOcultosProductoEspeci % 1==0) {
		iXPanelCamposOcultosProductoEspeci=0;
		iYPanelCamposOcultosProductoEspeci++;
	}
	this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoEspeci.gridy = iYPanelCamposOcultosProductoEspeci;
	this.gridBagConstraintsProductoEspeci.gridx = iXPanelCamposOcultosProductoEspeci++;
	this.gridBagConstraintsProductoEspeci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoEspeci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoEspeci.add(this.jPanelid_sucursalProductoEspeci, this.gridBagConstraintsProductoEspeci);



	if(iXPanelCamposOcultosProductoEspeci % 1==0) {
		iXPanelCamposOcultosProductoEspeci=0;
		iYPanelCamposOcultosProductoEspeci++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoEspeci= new GridBagLayout();
		this.jPanelAccionesProductoEspeci.setLayout(gridaBagLayoutAccionesProductoEspeci);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoEspeci= new GridBagLayout();
		this.jPanelAccionesFormularioProductoEspeci.setLayout(gridaBagLayoutAccionesFormularioProductoEspeci);
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoEspeci.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoEspeci.add(this.jComboBoxTiposAccionesFormularioProductoEspeci, this.gridBagConstraintsProductoEspeci);

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoEspeci.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoEspeci.add(this.jCheckBoxPostAccionNuevoProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoEspeci.add(this.jCheckBoxPostAccionSinCerrarProductoEspeci, this.gridBagConstraintsProductoEspeci);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoEspeci.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoEspeci.add(this.jCheckBoxPostAccionSinMensajeProductoEspeci, this.gridBagConstraintsProductoEspeci);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoEspeci.add(this.jButtonModificarProductoEspeci, this.gridBagConstraintsProductoEspeci);							

		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoEspeci.gridy = 0;
		this.gridBagConstraintsProductoEspeci.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoEspeci.add(this.jButtonEliminarProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = 0;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoEspeci.add(this.jButtonActualizarProductoEspeci, this.gridBagConstraintsProductoEspeci);


		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = 0;		
		this.gridBagConstraintsProductoEspeci.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoEspeci.add(this.jButtonGuardarCambiosProductoEspeci, this.gridBagConstraintsProductoEspeci);	
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = 0;		
		this.gridBagConstraintsProductoEspeci.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoEspeci.add(this.jButtonCancelarProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoEspeci = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoEspeci);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();						
			this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoEspeci.gridx = 0;		
			//this.gridBagConstraintsProductoEspeci.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoEspeci.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoEspeci.gridx =0;
		this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoEspeci.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoEspeci, this.gridBagConstraintsProductoEspeci);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoEspeci = new ProductoEspeciBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Especificacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Especificacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Especificacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoEspeciModel productoespeciModel=new ProductoEspeciModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoEspeciModel.ProductoEspeciFocusTraversalPolicy productoespeciFocusTraversalPolicy = productoespeciModel.new ProductoEspeciFocusTraversalPolicy(this);
			
			//productoespeciFocusTraversalPolicy.setproductoespeciJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoespeciModel);
			
			
			this.jContentPaneDetalleProductoEspeci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoEspeci = new GridBagLayout();	
			this.jContentPaneDetalleProductoEspeci.setLayout(gridaBagLayoutDetalleProductoEspeci);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoEspeci = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
				this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoEspeci.gridx = 0;
					
				
				this.jContentPaneDetalleProductoEspeci.add(jTtoolBarDetalleProductoEspeci, gridBagConstraintsProductoEspeci);								
				
}
			
			this.jScrollPanelDatosEdicionProductoEspeci=   new JScrollPane(jContentPaneDetalleProductoEspeci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoEspeci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEspeci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEspeci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoEspeci=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoEspeci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEspeci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoEspeci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoEspeci.gridx = 0;
	        
			this.jContentPaneDetalleProductoEspeci.add(jPanelCamposProductoEspeci, gridBagConstraintsProductoEspeci);
			
			
			
			
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
						&& productoespeciSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoEspeci= new GridBagConstraints();
						this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoEspeci.gridx = 0;
						this.jContentPaneDetalleProductoEspeci.add(this.jTabbedPaneRelacionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoEspeci.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoEspeci.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
					this.gridBagConstraintsProductoEspeci.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoEspeci.gridx = 0;
					
				
					this.jContentPaneDetalleProductoEspeci.add(jPanelCamposOcultosProductoEspeci, gridBagConstraintsProductoEspeci);
				
					this.jPanelCamposOcultosProductoEspeci.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoEspeci.gridx = 0;
	        this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoEspeci.add(this.jPanelAccionesFormularioProductoEspeci, this.gridBagConstraintsProductoEspeci);							
			
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
	        this.gridBagConstraintsProductoEspeci.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoEspeci.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoEspeci.add(this.jPanelAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoEspeci);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoEspeci=   new JScrollPane(this.jPanelCamposProductoEspeci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoEspeci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEspeci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoEspeci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoEspeci.gridx = 0;
			this.gridBagConstraintsProductoEspeci.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoEspeci.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoEspeci.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoEspeci.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoEspeci, this.gridBagConstraintsProductoEspeci);			
			
			this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
			this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoEspeci.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoEspeci, this.gridBagConstraintsProductoEspeci);
			
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoEspeci, this.gridBagConstraintsProductoEspeci);
		
			
		this.gridBagConstraintsProductoEspeci = new GridBagConstraints();
		this.gridBagConstraintsProductoEspeci.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoEspeci.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoEspeci, this.gridBagConstraintsProductoEspeci);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoEspeci;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoEspeci;
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
