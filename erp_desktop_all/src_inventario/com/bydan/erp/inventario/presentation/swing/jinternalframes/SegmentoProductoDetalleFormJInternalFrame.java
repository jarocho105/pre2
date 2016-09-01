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
import com.bydan.erp.inventario.util.SegmentoProductoConstantesFunciones;

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
public class SegmentoProductoDetalleFormJInternalFrame extends SegmentoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSegmentoProducto;
	
	protected JMenuBar jmenuBarDetalleSegmentoProducto;
	
	protected JMenu jmenuDetalleSegmentoProducto;
	protected JMenu jmenuDetalleArchivoSegmentoProducto;
	protected JMenu jmenuDetalleAccionesSegmentoProducto;
	protected JMenu jmenuDetalleDatosSegmentoProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSegmentoProducto;	
	protected GridBagConstraints gridBagConstraintsSegmentoProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SegmentoProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSegmentoProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public SegmentoProductoSessionBean segmentoproductoSessionBean;
	
	

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
	
	public SegmentoProductoLogic segmentoproductoLogic;
	
	public JScrollPane jScrollPanelDatosSegmentoProducto;
	public JScrollPane jScrollPanelDatosEdicionSegmentoProducto;
	public JScrollPane jScrollPanelDatosGeneralSegmentoProducto;
	
	protected JPanel jPanelCamposSegmentoProducto;    
	protected JPanel jPanelCamposOcultosSegmentoProducto;    	
	protected JPanel jPanelAccionesSegmentoProducto;
	protected JPanel jPanelAccionesFormularioSegmentoProducto;
    
	
	
	protected Integer iXPanelCamposSegmentoProducto=0;
	protected Integer iYPanelCamposSegmentoProducto=0;
	
	protected Integer iXPanelCamposOcultosSegmentoProducto=0;
	protected Integer iYPanelCamposOcultosSegmentoProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSegmentoProducto;
	public JButton jButtonModificarSegmentoProducto;
	public JButton jButtonActualizarSegmentoProducto;
    public JButton jButtonEliminarSegmentoProducto;
	public JButton jButtonCancelarSegmentoProducto;
    public JButton jButtonGuardarCambiosSegmentoProducto;
	public JButton jButtonGuardarCambiosTablaSegmentoProducto;
	protected JButton jButtonCerrarSegmentoProducto;
	
	
	protected JButton jButtonProcesarInformacionSegmentoProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSegmentoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSegmentoProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSegmentoProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSegmentoProducto;
	protected JButton jButtonModificarToolBarSegmentoProducto;
	protected JButton jButtonActualizarToolBarSegmentoProducto;
    protected JButton jButtonEliminarToolBarSegmentoProducto;
	protected JButton jButtonCancelarToolBarSegmentoProducto;
    protected JButton jButtonGuardarCambiosToolBarSegmentoProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarSegmentoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSegmentoProducto;
	protected JButton jButtonCerrarToolBarSegmentoProducto;
	
	protected JButton jButtonProcesarInformacionToolBarSegmentoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSegmentoProducto;
	protected JMenuItem jMenuItemModificarSegmentoProducto;
	protected JMenuItem jMenuItemActualizarSegmentoProducto;
    protected JMenuItem jMenuItemEliminarSegmentoProducto;
	protected JMenuItem jMenuItemCancelarSegmentoProducto;
    protected JMenuItem jMenuItemGuardarCambiosSegmentoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSegmentoProducto;
	protected JMenuItem jMenuItemCerrarSegmentoProducto;
	protected JMenuItem jMenuItemDetalleCerrarSegmentoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSegmentoProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionSegmentoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSegmentoProducto;
	protected JMenuItem jMenuItemMostrarOcultarSegmentoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSegmentoProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSegmentoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSegmentoProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSegmentoProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSegmentoProducto;
	public JLabel jLabelIdSegmentoProducto;
	public JLabel jLabelidSegmentoProducto;
	public JButton jButtonidSegmentoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSegmentoProducto;
	public JLabel jLabelcodigoSegmentoProducto;
	public JTextField jTextFieldcodigoSegmentoProducto;
	public JButton jButtoncodigoSegmentoProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreSegmentoProducto;
	public JLabel jLabelnombreSegmentoProducto;
	public JTextArea jTextAreanombreSegmentoProducto;
	public JScrollPane jscrollPanenombreSegmentoProducto;
	public JButton jButtonnombreSegmentoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSegmentoProducto;
	public JLabel jLabelid_empresaSegmentoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSegmentoProducto;
	public JButton jButtonid_empresaSegmentoProducto= new JButtonMe();
	public JButton jButtonid_empresaSegmentoProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaSegmentoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoSegmentoProducto;
	public JLabel jLabelid_tipo_productoSegmentoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoSegmentoProducto;
	public JButton jButtonid_tipo_productoSegmentoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoSegmentoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoSegmentoProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSegmentoProducto;
	
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
	
	public SegmentoProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSegmentoProducto=new JPanel();
				this.jPanelAccionesFormularioSegmentoProducto=new JPanel();
				this.jmenuBarDetalleSegmentoProducto=new JMenuBar();
				this.jTtoolBarDetalleSegmentoProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SegmentoProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSegmentoProducto() {
		return this.jButtonActualizarToolBarSegmentoProducto;
	}
	
	public JButton getjButtonEliminarToolBarSegmentoProducto() {
		return this.jButtonEliminarToolBarSegmentoProducto;
	}
	
	public JButton getjButtonCancelarToolBarSegmentoProducto() {
		return this.jButtonCancelarToolBarSegmentoProducto;
	}		
	
	public JButton getjButtonProcesarInformacionSegmentoProducto() {
		return this.jButtonProcesarInformacionSegmentoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSegmentoProducto)	{
		this.jButtonProcesarInformacionSegmentoProducto = jButtonProcesarInformacionSegmentoProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSegmentoProducto() {
		return this.jComboBoxTiposAccionesSegmentoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSegmentoProducto(
			JComboBox jComboBoxTiposRelacionesSegmentoProducto) {
		this.jComboBoxTiposRelacionesSegmentoProducto = jComboBoxTiposRelacionesSegmentoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSegmentoProducto(
			JComboBox jComboBoxTiposAccionesSegmentoProducto) {
		this.jComboBoxTiposAccionesSegmentoProducto = jComboBoxTiposAccionesSegmentoProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSegmentoProducto() {
		return this.jComboBoxTiposAccionesFormularioSegmentoProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSegmentoProducto(
			JComboBox jComboBoxTiposAccionesFormularioSegmentoProducto) {
		this.jComboBoxTiposAccionesFormularioSegmentoProducto = jComboBoxTiposAccionesFormularioSegmentoProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		
		this.segmentoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.segmentoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.segmentoproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SegmentoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Segmento Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSegmentoProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSegmentoProducto=new JButtonMe();
				this.jButtonModificarToolBarSegmentoProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto,
							"actualizar","actualizar","Actualizar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto,
							"eliminar","eliminar","Eliminar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto,
							"cancelar","cancelar","Cancelar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSegmentoProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSegmentoProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSegmentoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSegmentoProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSegmentoProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSegmentoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSegmentoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSegmentoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSegmentoProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSegmentoProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSegmentoProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSegmentoProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSegmentoProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSegmentoProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSegmentoProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSegmentoProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSegmentoProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSegmentoProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSegmentoProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSegmentoProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSegmentoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSegmentoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSegmentoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSegmentoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSegmentoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSegmentoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSegmentoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSegmentoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSegmentoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSegmentoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSegmentoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSegmentoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSegmentoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSegmentoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSegmentoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSegmentoProducto.add(this.jMenuItemDetalleCerrarSegmentoProducto);
		
		this.jmenuDetalleAccionesSegmentoProducto.add(this.jMenuItemActualizarSegmentoProducto);
		this.jmenuDetalleAccionesSegmentoProducto.add(this.jMenuItemEliminarSegmentoProducto);
		this.jmenuDetalleAccionesSegmentoProducto.add(this.jMenuItemCancelarSegmentoProducto);		
		
		//this.jmenuDetalleDatosSegmentoProducto.add(this.jMenuItemDetalleAbrirOrderBySegmentoProducto);				
		this.jmenuDetalleDatosSegmentoProducto.add(this.jMenuItemDetalleMostarOcultarSegmentoProducto);				
				
		//this.jmenuDetalleAccionesSegmentoProducto.add(this.jMenuItemGuardarCambiosSegmentoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSegmentoProducto.add(this.jmenuDetalleArchivoSegmentoProducto);		
		this.jmenuBarDetalleSegmentoProducto.add(this.jmenuDetalleAccionesSegmentoProducto);		
		this.jmenuBarDetalleSegmentoProducto.add(this.jmenuDetalleDatosSegmentoProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSegmentoProducto.add(this.jmenuDetalleSegmentoProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSegmentoProducto);				
	}
	
	
	public void inicializarElementosCamposSegmentoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSegmentoProducto = new JLabelMe();
		jLabelIdSegmentoProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSegmentoProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSegmentoProducto.setToolTipText(SegmentoProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSegmentoProducto= new GridBagLayout();

		this.jPanelidSegmentoProducto.setLayout(this.gridaBagLayoutSegmentoProducto);

		jLabelidSegmentoProducto = new JLabel();
		jLabelidSegmentoProducto.setText("Id");

		jLabelidSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSegmentoProducto = new JLabelMe();
		this.jLabelcodigoSegmentoProducto.setText(""+SegmentoProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSegmentoProducto.setToolTipText("Codigo");
		this.jLabelcodigoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSegmentoProducto.setToolTipText(SegmentoProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSegmentoProducto = new GridBagLayout();
		this.jPanelcodigoSegmentoProducto.setLayout(this.gridaBagLayoutSegmentoProducto);


		jTextFieldcodigoSegmentoProducto= new JTextFieldMe();

		jTextFieldcodigoSegmentoProducto.setEnabled(false);
		jTextFieldcodigoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSegmentoProductoBusqueda= new JButtonMe();
		this.jButtoncodigoSegmentoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSegmentoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSegmentoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSegmentoProductoBusqueda.setText("U");
		this.jButtoncodigoSegmentoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSegmentoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSegmentoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSegmentoProductoBusqueda"));

		if(this.segmentoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSegmentoProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreSegmentoProducto = new JLabelMe();
		this.jLabelnombreSegmentoProducto.setText(""+SegmentoProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSegmentoProducto.setToolTipText("Nombre");
		this.jLabelnombreSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSegmentoProducto.setToolTipText(SegmentoProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSegmentoProducto = new GridBagLayout();
		this.jPanelnombreSegmentoProducto.setLayout(this.gridaBagLayoutSegmentoProducto);


		jTextAreanombreSegmentoProducto= new JTextAreaMe();
		jTextAreanombreSegmentoProducto.setEnabled(false);
		jTextAreanombreSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSegmentoProducto.setLineWrap(true);
		jTextAreanombreSegmentoProducto.setWrapStyleWord(true);
		jTextAreanombreSegmentoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSegmentoProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSegmentoProducto = new JScrollPane(jTextAreanombreSegmentoProducto);
		jscrollPanenombreSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSegmentoProductoBusqueda= new JButtonMe();
		this.jButtonnombreSegmentoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSegmentoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSegmentoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSegmentoProductoBusqueda.setText("U");
		this.jButtonnombreSegmentoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSegmentoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSegmentoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSegmentoProductoBusqueda"));

		if(this.segmentoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSegmentoProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSegmentoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSegmentoProducto = new JLabelMe();
		this.jLabelid_empresaSegmentoProducto.setText(""+SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSegmentoProducto.setToolTipText("Empresa");
		this.jLabelid_empresaSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSegmentoProducto.setToolTipText(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSegmentoProducto = new GridBagLayout();
		this.jPanelid_empresaSegmentoProducto.setLayout(this.gridaBagLayoutSegmentoProducto);


		jComboBoxid_empresaSegmentoProducto= new JComboBoxMe();
		jComboBoxid_empresaSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSegmentoProducto.setEnabled(false);

		this.jButtonid_empresaSegmentoProducto= new JButtonMe();
		this.jButtonid_empresaSegmentoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSegmentoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSegmentoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSegmentoProducto.setText("Buscar");
		this.jButtonid_empresaSegmentoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSegmentoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSegmentoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSegmentoProducto"));

		this.jButtonid_empresaSegmentoProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaSegmentoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSegmentoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSegmentoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSegmentoProductoBusqueda.setText("U");
		this.jButtonid_empresaSegmentoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSegmentoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSegmentoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSegmentoProductoBusqueda"));

		if(this.segmentoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSegmentoProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaSegmentoProductoUpdate= new JButtonMe();
		this.jButtonid_empresaSegmentoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSegmentoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSegmentoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSegmentoProductoUpdate.setText("U");
		this.jButtonid_empresaSegmentoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSegmentoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSegmentoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSegmentoProductoUpdate"));



					
		this.jLabelid_tipo_productoSegmentoProducto = new JLabelMe();
		this.jLabelid_tipo_productoSegmentoProducto.setText(""+SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoSegmentoProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoSegmentoProducto.setToolTipText(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutSegmentoProducto = new GridBagLayout();
		this.jPanelid_tipo_productoSegmentoProducto.setLayout(this.gridaBagLayoutSegmentoProducto);


		jComboBoxid_tipo_productoSegmentoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoSegmentoProducto= new JButtonMe();
		this.jButtonid_tipo_productoSegmentoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoSegmentoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoSegmentoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoSegmentoProducto.setText("Buscar");
		this.jButtonid_tipo_productoSegmentoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoSegmentoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoSegmentoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoSegmentoProducto"));

		this.jButtonid_tipo_productoSegmentoProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoSegmentoProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoSegmentoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoSegmentoProductoBusqueda"));

		if(this.segmentoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoSegmentoProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoSegmentoProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoSegmentoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoSegmentoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoSegmentoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoSegmentoProductoUpdate.setText("U");
		this.jButtonid_tipo_productoSegmentoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoSegmentoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoSegmentoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoSegmentoProductoUpdate"));



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
		//this.jInternalFrameDetalleSegmentoProducto = new SegmentoProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Segmento Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSegmentoProducto= new GridBagLayout();
		

		
		String sToolTipSegmentoProducto="";
		sToolTipSegmentoProducto=SegmentoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSegmentoProducto+="(Inventario.SegmentoProducto)";
		}
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSegmentoProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSegmentoProducto = new JButtonMe();
		this.jButtonModificarSegmentoProducto = new JButtonMe();
        this.jButtonActualizarSegmentoProducto = new JButtonMe();
        this.jButtonEliminarSegmentoProducto = new JButtonMe();
        this.jButtonCancelarSegmentoProducto = new JButtonMe();
        this.jButtonGuardarCambiosSegmentoProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaSegmentoProducto = new JButtonMe();
		this.jButtonCerrarSegmentoProducto = new JButtonMe();
		
		this.jScrollPanelDatosSegmentoProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionSegmentoProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralSegmentoProducto = new JScrollPane();
				
		
		
		this.jPanelCamposSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Segmento Producto";
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSegmentoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSegmentoProducto.setName("jPanelCamposSegmentoProducto"); 

		this.jPanelCamposOcultosSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSegmentoProducto.setName("jPanelCamposOcultosSegmentoProducto"); 

        this.jPanelAccionesSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSegmentoProducto.setToolTipText("Acciones");
        this.jPanelAccionesSegmentoProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSegmentoProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSegmentoProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSegmentoProducto.setText("Nuevo");
		this.jButtonModificarSegmentoProducto.setText("Editar");
        this.jButtonActualizarSegmentoProducto.setText("Actualizar");
        this.jButtonEliminarSegmentoProducto.setText("Eliminar");
        this.jButtonCancelarSegmentoProducto.setText("Cancelar");
        this.jButtonGuardarCambiosSegmentoProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaSegmentoProducto.setText("Guardar");
		this.jButtonCerrarSegmentoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSegmentoProducto,"nuevo_button","Nuevo",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSegmentoProducto,"modificar_button","Editar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSegmentoProducto,"actualizar_button","Actualizar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSegmentoProducto,"eliminar_button","Eliminar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSegmentoProducto,"cancelar_button","Cancelar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSegmentoProducto,"guardarcambios_button","Guardar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSegmentoProducto,"guardarcambiostabla_button","Guardar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSegmentoProducto,"cerrar_button","Salir",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSegmentoProducto.setToolTipText("Nuevo"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSegmentoProducto.setToolTipText("Editar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSegmentoProducto.setToolTipText("Actualizar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSegmentoProducto.setToolTipText("Eliminar)"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSegmentoProducto.setToolTipText("Cancelar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSegmentoProducto.setToolTipText("Guardar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSegmentoProducto.setToolTipText("Guardar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSegmentoProducto.setToolTipText("Salir"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSegmentoProducto";
		inputMap = this.jButtonNuevoSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSegmentoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSegmentoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSegmentoProducto";
		inputMap = this.jButtonActualizarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSegmentoProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarSegmentoProducto";
		inputMap = this.jButtonEliminarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSegmentoProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarSegmentoProducto";
		inputMap = this.jButtonCancelarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSegmentoProducto"));
		
		//CERRAR		
		sMapKey = "CerrarSegmentoProducto";
		inputMap = this.jButtonCerrarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSegmentoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSegmentoProducto";
		inputMap = this.jButtonGuardarCambiosTablaSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSegmentoProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSegmentoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSegmentoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSegmentoProducto.setToolTipText("Nuevo SegmentoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSegmentoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSegmentoProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSegmentoProducto.setToolTipText("Sin Cerrar Ventana SegmentoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSegmentoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSegmentoProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSegmentoProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSegmentoProducto.setText("Accion");
		this.jComboBoxTiposAccionesSegmentoProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSegmentoProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSegmentoProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSegmentoProducto = new JLabelMe();
		
		this.jLabelAccionesSegmentoProducto.setText("Acciones");		
		this.jLabelAccionesSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSegmentoProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSegmentoProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSegmentoProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSegmentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSegmentoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSegmentoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSegmentoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSegmentoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSegmentoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSegmentoProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSegmentoProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSegmentoProducto = new GridBagLayout();
		
		this.jPanelCamposSegmentoProducto.setLayout(gridaBagLayoutCamposSegmentoProducto);
		this.jPanelCamposOcultosSegmentoProducto.setLayout(gridaBagLayoutCamposOcultosSegmentoProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 0;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSegmentoProducto.add(jLabelIdSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 1;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSegmentoProducto.add(jLabelidSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 0;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSegmentoProducto.add(jLabelid_empresaSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 2;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSegmentoProducto.add(jButtonid_empresaSegmentoProductoBusqueda, this.gridBagConstraintsSegmentoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 3;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSegmentoProducto.add(jButtonid_empresaSegmentoProductoUpdate, this.gridBagConstraintsSegmentoProducto);
	}

	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 1;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSegmentoProducto.add(jComboBoxid_empresaSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 0;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoSegmentoProducto.add(jLabelid_tipo_productoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 2;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoSegmentoProducto.add(jButtonid_tipo_productoSegmentoProductoBusqueda, this.gridBagConstraintsSegmentoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 3;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoSegmentoProducto.add(jButtonid_tipo_productoSegmentoProductoUpdate, this.gridBagConstraintsSegmentoProducto);
	}

	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 1;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoSegmentoProducto.add(jComboBoxid_tipo_productoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 0;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSegmentoProducto.add(jLabelcodigoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 2;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSegmentoProducto.add(jButtoncodigoSegmentoProductoBusqueda, this.gridBagConstraintsSegmentoProducto);
	}

	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 1;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSegmentoProducto.add(jTextFieldcodigoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 0;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSegmentoProducto.add(jLabelnombreSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 2;
		this.gridBagConstraintsSegmentoProducto.ipadx = 0;
		this.gridBagConstraintsSegmentoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSegmentoProducto.add(jButtonnombreSegmentoProductoBusqueda, this.gridBagConstraintsSegmentoProducto);
	}

	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSegmentoProducto.gridy = 0;
	this.gridBagConstraintsSegmentoProducto.gridx = 1;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSegmentoProducto.add(jscrollPanenombreSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSegmentoProducto.gridy = iYPanelCamposSegmentoProducto;
	this.gridBagConstraintsSegmentoProducto.gridx = iXPanelCamposSegmentoProducto++;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSegmentoProducto.add(this.jPanelidSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(iXPanelCamposSegmentoProducto % 1==0) {
		iXPanelCamposSegmentoProducto=0;
		iYPanelCamposSegmentoProducto++;
	}
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSegmentoProducto.gridy = iYPanelCamposSegmentoProducto;
	this.gridBagConstraintsSegmentoProducto.gridx = iXPanelCamposSegmentoProducto++;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSegmentoProducto.add(this.jPanelid_tipo_productoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(iXPanelCamposSegmentoProducto % 1==0) {
		iXPanelCamposSegmentoProducto=0;
		iYPanelCamposSegmentoProducto++;
	}
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSegmentoProducto.gridy = iYPanelCamposSegmentoProducto;
	this.gridBagConstraintsSegmentoProducto.gridx = iXPanelCamposSegmentoProducto++;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSegmentoProducto.add(this.jPanelcodigoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(iXPanelCamposSegmentoProducto % 1==0) {
		iXPanelCamposSegmentoProducto=0;
		iYPanelCamposSegmentoProducto++;
	}
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSegmentoProducto.gridy = iYPanelCamposSegmentoProducto;
	this.gridBagConstraintsSegmentoProducto.gridx = iXPanelCamposSegmentoProducto++;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSegmentoProducto.add(this.jPanelnombreSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(iXPanelCamposSegmentoProducto % 1==0) {
		iXPanelCamposSegmentoProducto=0;
		iYPanelCamposSegmentoProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSegmentoProducto.gridy = iYPanelCamposOcultosSegmentoProducto;
	this.gridBagConstraintsSegmentoProducto.gridx = iXPanelCamposOcultosSegmentoProducto++;
	this.gridBagConstraintsSegmentoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSegmentoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSegmentoProducto.add(this.jPanelid_empresaSegmentoProducto, this.gridBagConstraintsSegmentoProducto);



	if(iXPanelCamposOcultosSegmentoProducto % 1==0) {
		iXPanelCamposOcultosSegmentoProducto=0;
		iYPanelCamposOcultosSegmentoProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesSegmentoProducto= new GridBagLayout();
		this.jPanelAccionesSegmentoProducto.setLayout(gridaBagLayoutAccionesSegmentoProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSegmentoProducto= new GridBagLayout();
		this.jPanelAccionesFormularioSegmentoProducto.setLayout(gridaBagLayoutAccionesFormularioSegmentoProducto);
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSegmentoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSegmentoProducto.add(this.jComboBoxTiposAccionesFormularioSegmentoProducto, this.gridBagConstraintsSegmentoProducto);

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSegmentoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSegmentoProducto.add(this.jCheckBoxPostAccionNuevoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSegmentoProducto.add(this.jCheckBoxPostAccionSinCerrarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSegmentoProducto.add(this.jCheckBoxPostAccionSinMensajeSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesSegmentoProducto.add(this.jButtonModificarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);							

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesSegmentoProducto.add(this.jButtonEliminarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = 0;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSegmentoProducto.add(this.jButtonActualizarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);


		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = 0;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSegmentoProducto.add(this.jButtonGuardarCambiosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);	
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = 0;		
		this.gridBagConstraintsSegmentoProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesSegmentoProducto.add(this.jButtonCancelarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSegmentoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSegmentoProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();						
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSegmentoProducto.gridx = 0;		
			//this.gridBagConstraintsSegmentoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSegmentoProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSegmentoProducto.gridx =0;
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSegmentoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSegmentoProducto = new SegmentoProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Segmento Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Segmento Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Segmento Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SegmentoProductoModel segmentoproductoModel=new SegmentoProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//SegmentoProductoModel.SegmentoProductoFocusTraversalPolicy segmentoproductoFocusTraversalPolicy = segmentoproductoModel.new SegmentoProductoFocusTraversalPolicy(this);
			
			//segmentoproductoFocusTraversalPolicy.setsegmentoproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(segmentoproductoModel);
			
			
			this.jContentPaneDetalleSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSegmentoProducto = new GridBagLayout();	
			this.jContentPaneDetalleSegmentoProducto.setLayout(gridaBagLayoutDetalleSegmentoProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSegmentoProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSegmentoProducto.gridx = 0;
					
				
				this.jContentPaneDetalleSegmentoProducto.add(jTtoolBarDetalleSegmentoProducto, gridBagConstraintsSegmentoProducto);								
				
}
			
			this.jScrollPanelDatosEdicionSegmentoProducto=   new JScrollPane(jContentPaneDetalleSegmentoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSegmentoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSegmentoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSegmentoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSegmentoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSegmentoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSegmentoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSegmentoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSegmentoProducto.gridx = 0;
	        
			this.jContentPaneDetalleSegmentoProducto.add(jPanelCamposSegmentoProducto, gridBagConstraintsSegmentoProducto);
			
			
			
			
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
						&& segmentoproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSegmentoProducto= new GridBagConstraints();
						this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSegmentoProducto.gridx = 0;
						this.jContentPaneDetalleSegmentoProducto.add(this.jTabbedPaneRelacionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSegmentoProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSegmentoProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
					this.gridBagConstraintsSegmentoProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSegmentoProducto.gridx = 0;
					
				
					this.jContentPaneDetalleSegmentoProducto.add(jPanelCamposOcultosSegmentoProducto, gridBagConstraintsSegmentoProducto);
				
					this.jPanelCamposOcultosSegmentoProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsSegmentoProducto.gridx = 0;
	        this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSegmentoProducto.add(this.jPanelAccionesFormularioSegmentoProducto, this.gridBagConstraintsSegmentoProducto);							
			
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
	        this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsSegmentoProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleSegmentoProducto.add(this.jPanelAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSegmentoProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSegmentoProducto=   new JScrollPane(this.jPanelCamposSegmentoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSegmentoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSegmentoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSegmentoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSegmentoProducto.gridx = 0;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSegmentoProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSegmentoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSegmentoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSegmentoProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionSegmentoProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				//this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSegmentoProducto.gridx = 0;
				//this.jContentPaneDetalleSegmentoProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSegmentoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSegmentoProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSegmentoProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesSegmentoProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				//this.gridBagConstraintsSegmentoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSegmentoProducto.gridx = 0;
				//this.jContentPaneDetalleSegmentoProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSegmentoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSegmentoProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSegmentoProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesSegmentoProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<SegmentoProducto> segmentoproductos,SegmentoProducto segmentoproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.segmentoproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setsegmentoproductosForeignKey(segmentoproductos);
					productoBeanSwingJInternalFrame.setsegmentoproductoForeignKey(segmentoproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionSegmentoProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidSegmentoProductoActual(segmentoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaSegmentoProducto(true);
					productoBeanSwingJInternalFrame.setid_segmento_productoFK_IdSegmentoProducto(segmentoproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameSegmentoProductoForeignKey(segmentoproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdSegmentoProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSegmentoProducto");
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

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<SegmentoProducto> segmentoproductos,SegmentoProducto segmentoproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.segmentoproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setsegmentoproductosForeignKey(segmentoproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setsegmentoproductoForeignKey(segmentoproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionSegmentoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidSegmentoProductoActual(segmentoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaSegmentoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_segmento_productoFK_IdSegmentoProducto(segmentoproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameSegmentoProductoForeignKey(segmentoproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdSegmentoProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSegmentoProducto");
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
