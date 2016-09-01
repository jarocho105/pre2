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
import com.bydan.erp.inventario.util.MaterialProductoConstantesFunciones;

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
public class MaterialProductoDetalleFormJInternalFrame extends MaterialProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMaterialProducto;
	
	protected JMenuBar jmenuBarDetalleMaterialProducto;
	
	protected JMenu jmenuDetalleMaterialProducto;
	protected JMenu jmenuDetalleArchivoMaterialProducto;
	protected JMenu jmenuDetalleAccionesMaterialProducto;
	protected JMenu jmenuDetalleDatosMaterialProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMaterialProducto;	
	protected GridBagConstraints gridBagConstraintsMaterialProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MaterialProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleMaterialProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public MaterialProductoSessionBean materialproductoSessionBean;
	
	

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
	
	public MaterialProductoLogic materialproductoLogic;
	
	public JScrollPane jScrollPanelDatosMaterialProducto;
	public JScrollPane jScrollPanelDatosEdicionMaterialProducto;
	public JScrollPane jScrollPanelDatosGeneralMaterialProducto;
	
	protected JPanel jPanelCamposMaterialProducto;    
	protected JPanel jPanelCamposOcultosMaterialProducto;    	
	protected JPanel jPanelAccionesMaterialProducto;
	protected JPanel jPanelAccionesFormularioMaterialProducto;
    
	
	
	protected Integer iXPanelCamposMaterialProducto=0;
	protected Integer iYPanelCamposMaterialProducto=0;
	
	protected Integer iXPanelCamposOcultosMaterialProducto=0;
	protected Integer iYPanelCamposOcultosMaterialProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMaterialProducto;
	public JButton jButtonModificarMaterialProducto;
	public JButton jButtonActualizarMaterialProducto;
    public JButton jButtonEliminarMaterialProducto;
	public JButton jButtonCancelarMaterialProducto;
    public JButton jButtonGuardarCambiosMaterialProducto;
	public JButton jButtonGuardarCambiosTablaMaterialProducto;
	protected JButton jButtonCerrarMaterialProducto;
	
	
	protected JButton jButtonProcesarInformacionMaterialProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMaterialProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMaterialProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMaterialProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMaterialProducto;
	protected JButton jButtonModificarToolBarMaterialProducto;
	protected JButton jButtonActualizarToolBarMaterialProducto;
    protected JButton jButtonEliminarToolBarMaterialProducto;
	protected JButton jButtonCancelarToolBarMaterialProducto;
    protected JButton jButtonGuardarCambiosToolBarMaterialProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarMaterialProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarMaterialProducto;
	protected JButton jButtonCerrarToolBarMaterialProducto;
	
	protected JButton jButtonProcesarInformacionToolBarMaterialProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMaterialProducto;
	protected JMenuItem jMenuItemModificarMaterialProducto;
	protected JMenuItem jMenuItemActualizarMaterialProducto;
    protected JMenuItem jMenuItemEliminarMaterialProducto;
	protected JMenuItem jMenuItemCancelarMaterialProducto;
    protected JMenuItem jMenuItemGuardarCambiosMaterialProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMaterialProducto;
	protected JMenuItem jMenuItemCerrarMaterialProducto;
	protected JMenuItem jMenuItemDetalleCerrarMaterialProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMaterialProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionMaterialProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMaterialProducto;
	protected JMenuItem jMenuItemMostrarOcultarMaterialProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMaterialProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMaterialProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMaterialProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMaterialProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMaterialProducto;
	public JLabel jLabelIdMaterialProducto;
	public JLabel jLabelidMaterialProducto;
	public JButton jButtonidMaterialProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoMaterialProducto;
	public JLabel jLabelcodigoMaterialProducto;
	public JTextField jTextFieldcodigoMaterialProducto;
	public JButton jButtoncodigoMaterialProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreMaterialProducto;
	public JLabel jLabelnombreMaterialProducto;
	public JTextArea jTextAreanombreMaterialProducto;
	public JScrollPane jscrollPanenombreMaterialProducto;
	public JButton jButtonnombreMaterialProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMaterialProducto;
	public JLabel jLabelid_empresaMaterialProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMaterialProducto;
	public JButton jButtonid_empresaMaterialProducto= new JButtonMe();
	public JButton jButtonid_empresaMaterialProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaMaterialProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoMaterialProducto;
	public JLabel jLabelid_tipo_productoMaterialProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoMaterialProducto;
	public JButton jButtonid_tipo_productoMaterialProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoMaterialProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoMaterialProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMaterialProducto;
	
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
	
	public MaterialProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMaterialProducto=new JPanel();
				this.jPanelAccionesFormularioMaterialProducto=new JPanel();
				this.jmenuBarDetalleMaterialProducto=new JMenuBar();
				this.jTtoolBarDetalleMaterialProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MaterialProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MaterialProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MaterialProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMaterialProducto() {
		return this.jButtonActualizarToolBarMaterialProducto;
	}
	
	public JButton getjButtonEliminarToolBarMaterialProducto() {
		return this.jButtonEliminarToolBarMaterialProducto;
	}
	
	public JButton getjButtonCancelarToolBarMaterialProducto() {
		return this.jButtonCancelarToolBarMaterialProducto;
	}		
	
	public JButton getjButtonProcesarInformacionMaterialProducto() {
		return this.jButtonProcesarInformacionMaterialProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMaterialProducto)	{
		this.jButtonProcesarInformacionMaterialProducto = jButtonProcesarInformacionMaterialProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMaterialProducto() {
		return this.jComboBoxTiposAccionesMaterialProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMaterialProducto(
			JComboBox jComboBoxTiposRelacionesMaterialProducto) {
		this.jComboBoxTiposRelacionesMaterialProducto = jComboBoxTiposRelacionesMaterialProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMaterialProducto(
			JComboBox jComboBoxTiposAccionesMaterialProducto) {
		this.jComboBoxTiposAccionesMaterialProducto = jComboBoxTiposAccionesMaterialProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMaterialProducto() {
		return this.jComboBoxTiposAccionesFormularioMaterialProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMaterialProducto(
			JComboBox jComboBoxTiposAccionesFormularioMaterialProducto) {
		this.jComboBoxTiposAccionesFormularioMaterialProducto = jComboBoxTiposAccionesFormularioMaterialProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.materialproductoSessionBean=new MaterialProductoSessionBean();
		
		this.materialproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.materialproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.materialproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MaterialProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Material Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMaterialProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMaterialProducto=new JButtonMe();
				this.jButtonModificarToolBarMaterialProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto,
							"actualizar","actualizar","Actualizar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto,
							"eliminar","eliminar","Eliminar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto,
							"cancelar","cancelar","Cancelar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMaterialProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMaterialProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMaterialProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMaterialProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMaterialProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMaterialProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMaterialProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMaterialProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMaterialProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMaterialProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMaterialProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMaterialProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMaterialProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMaterialProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMaterialProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMaterialProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMaterialProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMaterialProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMaterialProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMaterialProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMaterialProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMaterialProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMaterialProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMaterialProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMaterialProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMaterialProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMaterialProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMaterialProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMaterialProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMaterialProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMaterialProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMaterialProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMaterialProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMaterialProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMaterialProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMaterialProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMaterialProducto.add(this.jMenuItemDetalleCerrarMaterialProducto);
		
		this.jmenuDetalleAccionesMaterialProducto.add(this.jMenuItemActualizarMaterialProducto);
		this.jmenuDetalleAccionesMaterialProducto.add(this.jMenuItemEliminarMaterialProducto);
		this.jmenuDetalleAccionesMaterialProducto.add(this.jMenuItemCancelarMaterialProducto);		
		
		//this.jmenuDetalleDatosMaterialProducto.add(this.jMenuItemDetalleAbrirOrderByMaterialProducto);				
		this.jmenuDetalleDatosMaterialProducto.add(this.jMenuItemDetalleMostarOcultarMaterialProducto);				
				
		//this.jmenuDetalleAccionesMaterialProducto.add(this.jMenuItemGuardarCambiosMaterialProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMaterialProducto.add(this.jmenuDetalleArchivoMaterialProducto);		
		this.jmenuBarDetalleMaterialProducto.add(this.jmenuDetalleAccionesMaterialProducto);		
		this.jmenuBarDetalleMaterialProducto.add(this.jmenuDetalleDatosMaterialProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMaterialProducto.add(this.jmenuDetalleMaterialProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMaterialProducto);				
	}
	
	
	public void inicializarElementosCamposMaterialProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMaterialProducto = new JLabelMe();
		jLabelIdMaterialProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMaterialProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMaterialProducto.setToolTipText(MaterialProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMaterialProducto= new GridBagLayout();

		this.jPanelidMaterialProducto.setLayout(this.gridaBagLayoutMaterialProducto);

		jLabelidMaterialProducto = new JLabel();
		jLabelidMaterialProducto.setText("Id");

		jLabelidMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoMaterialProducto = new JLabelMe();
		this.jLabelcodigoMaterialProducto.setText(""+MaterialProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoMaterialProducto.setToolTipText("Codigo");
		this.jLabelcodigoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoMaterialProducto.setToolTipText(MaterialProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutMaterialProducto = new GridBagLayout();
		this.jPanelcodigoMaterialProducto.setLayout(this.gridaBagLayoutMaterialProducto);


		jTextFieldcodigoMaterialProducto= new JTextFieldMe();

		jTextFieldcodigoMaterialProducto.setEnabled(false);
		jTextFieldcodigoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoMaterialProductoBusqueda= new JButtonMe();
		this.jButtoncodigoMaterialProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMaterialProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMaterialProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoMaterialProductoBusqueda.setText("U");
		this.jButtoncodigoMaterialProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoMaterialProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoMaterialProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoMaterialProductoBusqueda"));

		if(this.materialproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoMaterialProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreMaterialProducto = new JLabelMe();
		this.jLabelnombreMaterialProducto.setText(""+MaterialProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMaterialProducto.setToolTipText("Nombre");
		this.jLabelnombreMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMaterialProducto.setToolTipText(MaterialProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMaterialProducto = new GridBagLayout();
		this.jPanelnombreMaterialProducto.setLayout(this.gridaBagLayoutMaterialProducto);


		jTextAreanombreMaterialProducto= new JTextAreaMe();
		jTextAreanombreMaterialProducto.setEnabled(false);
		jTextAreanombreMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMaterialProducto.setLineWrap(true);
		jTextAreanombreMaterialProducto.setWrapStyleWord(true);
		jTextAreanombreMaterialProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreMaterialProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreMaterialProducto = new JScrollPane(jTextAreanombreMaterialProducto);
		jscrollPanenombreMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreMaterialProductoBusqueda= new JButtonMe();
		this.jButtonnombreMaterialProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMaterialProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMaterialProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMaterialProductoBusqueda.setText("U");
		this.jButtonnombreMaterialProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMaterialProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMaterialProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMaterialProductoBusqueda"));

		if(this.materialproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMaterialProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMaterialProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMaterialProducto = new JLabelMe();
		this.jLabelid_empresaMaterialProducto.setText(""+MaterialProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMaterialProducto.setToolTipText("Empresa");
		this.jLabelid_empresaMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMaterialProducto.setToolTipText(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMaterialProducto = new GridBagLayout();
		this.jPanelid_empresaMaterialProducto.setLayout(this.gridaBagLayoutMaterialProducto);


		jComboBoxid_empresaMaterialProducto= new JComboBoxMe();
		jComboBoxid_empresaMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMaterialProducto.setEnabled(false);

		this.jButtonid_empresaMaterialProducto= new JButtonMe();
		this.jButtonid_empresaMaterialProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMaterialProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMaterialProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMaterialProducto.setText("Buscar");
		this.jButtonid_empresaMaterialProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMaterialProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMaterialProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMaterialProducto"));

		this.jButtonid_empresaMaterialProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaMaterialProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMaterialProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMaterialProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMaterialProductoBusqueda.setText("U");
		this.jButtonid_empresaMaterialProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMaterialProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMaterialProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMaterialProductoBusqueda"));

		if(this.materialproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMaterialProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaMaterialProductoUpdate= new JButtonMe();
		this.jButtonid_empresaMaterialProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMaterialProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMaterialProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMaterialProductoUpdate.setText("U");
		this.jButtonid_empresaMaterialProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMaterialProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMaterialProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMaterialProductoUpdate"));



					
		this.jLabelid_tipo_productoMaterialProducto = new JLabelMe();
		this.jLabelid_tipo_productoMaterialProducto.setText(""+MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoMaterialProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoMaterialProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoMaterialProducto.setToolTipText(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutMaterialProducto = new GridBagLayout();
		this.jPanelid_tipo_productoMaterialProducto.setLayout(this.gridaBagLayoutMaterialProducto);


		jComboBoxid_tipo_productoMaterialProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoMaterialProducto= new JButtonMe();
		this.jButtonid_tipo_productoMaterialProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMaterialProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMaterialProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMaterialProducto.setText("Buscar");
		this.jButtonid_tipo_productoMaterialProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoMaterialProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMaterialProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMaterialProducto"));

		this.jButtonid_tipo_productoMaterialProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoMaterialProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMaterialProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMaterialProductoBusqueda"));

		if(this.materialproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoMaterialProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoMaterialProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoMaterialProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMaterialProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMaterialProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoMaterialProductoUpdate.setText("U");
		this.jButtonid_tipo_productoMaterialProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoMaterialProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMaterialProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMaterialProductoUpdate"));



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
		//this.jInternalFrameDetalleMaterialProducto = new MaterialProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Material Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMaterialProducto= new GridBagLayout();
		

		
		String sToolTipMaterialProducto="";
		sToolTipMaterialProducto=MaterialProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMaterialProducto+="(Inventario.MaterialProducto)";
		}
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMaterialProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMaterialProducto = new JButtonMe();
		this.jButtonModificarMaterialProducto = new JButtonMe();
        this.jButtonActualizarMaterialProducto = new JButtonMe();
        this.jButtonEliminarMaterialProducto = new JButtonMe();
        this.jButtonCancelarMaterialProducto = new JButtonMe();
        this.jButtonGuardarCambiosMaterialProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaMaterialProducto = new JButtonMe();
		this.jButtonCerrarMaterialProducto = new JButtonMe();
		
		this.jScrollPanelDatosMaterialProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionMaterialProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralMaterialProducto = new JScrollPane();
				
		
		
		this.jPanelCamposMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Material Producto";
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Material Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosMaterialProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMaterialProducto.setName("jPanelCamposMaterialProducto"); 

		this.jPanelCamposOcultosMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMaterialProducto.setName("jPanelCamposOcultosMaterialProducto"); 

        this.jPanelAccionesMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMaterialProducto.setToolTipText("Acciones");
        this.jPanelAccionesMaterialProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMaterialProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMaterialProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMaterialProducto.setText("Nuevo");
		this.jButtonModificarMaterialProducto.setText("Editar");
        this.jButtonActualizarMaterialProducto.setText("Actualizar");
        this.jButtonEliminarMaterialProducto.setText("Eliminar");
        this.jButtonCancelarMaterialProducto.setText("Cancelar");
        this.jButtonGuardarCambiosMaterialProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaMaterialProducto.setText("Guardar");
		this.jButtonCerrarMaterialProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMaterialProducto,"nuevo_button","Nuevo",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMaterialProducto,"modificar_button","Editar",this.materialproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMaterialProducto,"actualizar_button","Actualizar",this.materialproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMaterialProducto,"eliminar_button","Eliminar",this.materialproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMaterialProducto,"cancelar_button","Cancelar",this.materialproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMaterialProducto,"guardarcambios_button","Guardar",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMaterialProducto,"guardarcambiostabla_button","Guardar",this.materialproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMaterialProducto,"cerrar_button","Salir",this.materialproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMaterialProducto.setToolTipText("Nuevo"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMaterialProducto.setToolTipText("Editar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMaterialProducto.setToolTipText("Actualizar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMaterialProducto.setToolTipText("Eliminar)"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMaterialProducto.setToolTipText("Cancelar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMaterialProducto.setToolTipText("Guardar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMaterialProducto.setToolTipText("Guardar"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMaterialProducto.setToolTipText("Salir"+" "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMaterialProducto";
		inputMap = this.jButtonNuevoMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMaterialProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMaterialProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMaterialProducto";
		inputMap = this.jButtonActualizarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMaterialProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarMaterialProducto";
		inputMap = this.jButtonEliminarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMaterialProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarMaterialProducto";
		inputMap = this.jButtonCancelarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMaterialProducto"));
		
		//CERRAR		
		sMapKey = "CerrarMaterialProducto";
		inputMap = this.jButtonCerrarMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMaterialProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMaterialProducto";
		inputMap = this.jButtonGuardarCambiosTablaMaterialProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMaterialProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMaterialProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMaterialProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMaterialProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMaterialProducto.setToolTipText("Nuevo MaterialProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMaterialProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMaterialProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMaterialProducto.setToolTipText("Sin Cerrar Ventana MaterialProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMaterialProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMaterialProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMaterialProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMaterialProducto.setText("Accion");
		this.jComboBoxTiposAccionesMaterialProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMaterialProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMaterialProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMaterialProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMaterialProducto = new JLabelMe();
		
		this.jLabelAccionesMaterialProducto.setText("Acciones");		
		this.jLabelAccionesMaterialProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMaterialProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMaterialProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMaterialProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMaterialProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMaterialProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesMaterialProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMaterialProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMaterialProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMaterialProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMaterialProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMaterialProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMaterialProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMaterialProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMaterialProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMaterialProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMaterialProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMaterialProducto = new GridBagLayout();
		
		this.jPanelCamposMaterialProducto.setLayout(gridaBagLayoutCamposMaterialProducto);
		this.jPanelCamposOcultosMaterialProducto.setLayout(gridaBagLayoutCamposOcultosMaterialProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 0;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMaterialProducto.add(jLabelIdMaterialProducto, this.gridBagConstraintsMaterialProducto);



	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 1;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMaterialProducto.add(jLabelidMaterialProducto, this.gridBagConstraintsMaterialProducto);


	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 0;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMaterialProducto.add(jLabelid_empresaMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 2;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMaterialProducto.add(jButtonid_empresaMaterialProductoBusqueda, this.gridBagConstraintsMaterialProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 3;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMaterialProducto.add(jButtonid_empresaMaterialProductoUpdate, this.gridBagConstraintsMaterialProducto);
	}

	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 1;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMaterialProducto.add(jComboBoxid_empresaMaterialProducto, this.gridBagConstraintsMaterialProducto);


	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 0;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoMaterialProducto.add(jLabelid_tipo_productoMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 2;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoMaterialProducto.add(jButtonid_tipo_productoMaterialProductoBusqueda, this.gridBagConstraintsMaterialProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 3;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoMaterialProducto.add(jButtonid_tipo_productoMaterialProductoUpdate, this.gridBagConstraintsMaterialProducto);
	}

	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 1;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoMaterialProducto.add(jComboBoxid_tipo_productoMaterialProducto, this.gridBagConstraintsMaterialProducto);


	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 0;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoMaterialProducto.add(jLabelcodigoMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 2;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoMaterialProducto.add(jButtoncodigoMaterialProductoBusqueda, this.gridBagConstraintsMaterialProducto);
	}

	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 1;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoMaterialProducto.add(jTextFieldcodigoMaterialProducto, this.gridBagConstraintsMaterialProducto);


	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 0;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMaterialProducto.add(jLabelnombreMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		//this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = 2;
		this.gridBagConstraintsMaterialProducto.ipadx = 0;
		this.gridBagConstraintsMaterialProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMaterialProducto.add(jButtonnombreMaterialProductoBusqueda, this.gridBagConstraintsMaterialProducto);
	}

	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMaterialProducto.gridy = 0;
	this.gridBagConstraintsMaterialProducto.gridx = 1;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMaterialProducto.add(jscrollPanenombreMaterialProducto, this.gridBagConstraintsMaterialProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMaterialProducto.gridy = iYPanelCamposMaterialProducto;
	this.gridBagConstraintsMaterialProducto.gridx = iXPanelCamposMaterialProducto++;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMaterialProducto.add(this.jPanelidMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(iXPanelCamposMaterialProducto % 1==0) {
		iXPanelCamposMaterialProducto=0;
		iYPanelCamposMaterialProducto++;
	}
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMaterialProducto.gridy = iYPanelCamposMaterialProducto;
	this.gridBagConstraintsMaterialProducto.gridx = iXPanelCamposMaterialProducto++;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMaterialProducto.add(this.jPanelid_tipo_productoMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(iXPanelCamposMaterialProducto % 1==0) {
		iXPanelCamposMaterialProducto=0;
		iYPanelCamposMaterialProducto++;
	}
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMaterialProducto.gridy = iYPanelCamposMaterialProducto;
	this.gridBagConstraintsMaterialProducto.gridx = iXPanelCamposMaterialProducto++;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMaterialProducto.add(this.jPanelcodigoMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(iXPanelCamposMaterialProducto % 1==0) {
		iXPanelCamposMaterialProducto=0;
		iYPanelCamposMaterialProducto++;
	}
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMaterialProducto.gridy = iYPanelCamposMaterialProducto;
	this.gridBagConstraintsMaterialProducto.gridx = iXPanelCamposMaterialProducto++;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMaterialProducto.add(this.jPanelnombreMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(iXPanelCamposMaterialProducto % 1==0) {
		iXPanelCamposMaterialProducto=0;
		iYPanelCamposMaterialProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMaterialProducto.gridy = iYPanelCamposOcultosMaterialProducto;
	this.gridBagConstraintsMaterialProducto.gridx = iXPanelCamposOcultosMaterialProducto++;
	this.gridBagConstraintsMaterialProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMaterialProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMaterialProducto.add(this.jPanelid_empresaMaterialProducto, this.gridBagConstraintsMaterialProducto);



	if(iXPanelCamposOcultosMaterialProducto % 1==0) {
		iXPanelCamposOcultosMaterialProducto=0;
		iYPanelCamposOcultosMaterialProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesMaterialProducto= new GridBagLayout();
		this.jPanelAccionesMaterialProducto.setLayout(gridaBagLayoutAccionesMaterialProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMaterialProducto= new GridBagLayout();
		this.jPanelAccionesFormularioMaterialProducto.setLayout(gridaBagLayoutAccionesFormularioMaterialProducto);
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMaterialProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMaterialProducto.add(this.jComboBoxTiposAccionesFormularioMaterialProducto, this.gridBagConstraintsMaterialProducto);

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMaterialProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMaterialProducto.add(this.jCheckBoxPostAccionNuevoMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMaterialProducto.add(this.jCheckBoxPostAccionSinCerrarMaterialProducto, this.gridBagConstraintsMaterialProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMaterialProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMaterialProducto.add(this.jCheckBoxPostAccionSinMensajeMaterialProducto, this.gridBagConstraintsMaterialProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesMaterialProducto.add(this.jButtonModificarMaterialProducto, this.gridBagConstraintsMaterialProducto);							

		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMaterialProducto.gridy = 0;
		this.gridBagConstraintsMaterialProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesMaterialProducto.add(this.jButtonEliminarMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = 0;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMaterialProducto.add(this.jButtonActualizarMaterialProducto, this.gridBagConstraintsMaterialProducto);


		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = 0;		
		this.gridBagConstraintsMaterialProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMaterialProducto.add(this.jButtonGuardarCambiosMaterialProducto, this.gridBagConstraintsMaterialProducto);	
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = 0;		
		this.gridBagConstraintsMaterialProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesMaterialProducto.add(this.jButtonCancelarMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMaterialProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMaterialProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();						
			this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMaterialProducto.gridx = 0;		
			//this.gridBagConstraintsMaterialProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMaterialProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMaterialProducto.gridx =0;
		this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMaterialProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMaterialProducto, this.gridBagConstraintsMaterialProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMaterialProducto = new MaterialProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Material Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Material Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Material Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MaterialProductoModel materialproductoModel=new MaterialProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//MaterialProductoModel.MaterialProductoFocusTraversalPolicy materialproductoFocusTraversalPolicy = materialproductoModel.new MaterialProductoFocusTraversalPolicy(this);
			
			//materialproductoFocusTraversalPolicy.setmaterialproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(materialproductoModel);
			
			
			this.jContentPaneDetalleMaterialProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMaterialProducto = new GridBagLayout();	
			this.jContentPaneDetalleMaterialProducto.setLayout(gridaBagLayoutDetalleMaterialProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMaterialProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMaterialProducto.gridx = 0;
					
				
				this.jContentPaneDetalleMaterialProducto.add(jTtoolBarDetalleMaterialProducto, gridBagConstraintsMaterialProducto);								
				
}
			
			this.jScrollPanelDatosEdicionMaterialProducto=   new JScrollPane(jContentPaneDetalleMaterialProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMaterialProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMaterialProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMaterialProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMaterialProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMaterialProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMaterialProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMaterialProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMaterialProducto.gridx = 0;
	        
			this.jContentPaneDetalleMaterialProducto.add(jPanelCamposMaterialProducto, gridBagConstraintsMaterialProducto);
			
			
			
			
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
						&& materialproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMaterialProducto= new GridBagConstraints();
						this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMaterialProducto.gridx = 0;
						this.jContentPaneDetalleMaterialProducto.add(this.jTabbedPaneRelacionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMaterialProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMaterialProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
					this.gridBagConstraintsMaterialProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMaterialProducto.gridx = 0;
					
				
					this.jContentPaneDetalleMaterialProducto.add(jPanelCamposOcultosMaterialProducto, gridBagConstraintsMaterialProducto);
				
					this.jPanelCamposOcultosMaterialProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsMaterialProducto.gridx = 0;
	        this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMaterialProducto.add(this.jPanelAccionesFormularioMaterialProducto, this.gridBagConstraintsMaterialProducto);							
			
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
	        this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsMaterialProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleMaterialProducto.add(this.jPanelAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMaterialProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMaterialProducto=   new JScrollPane(this.jPanelCamposMaterialProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMaterialProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMaterialProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMaterialProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMaterialProducto.gridx = 0;
			this.gridBagConstraintsMaterialProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMaterialProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMaterialProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMaterialProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMaterialProducto, this.gridBagConstraintsMaterialProducto);			
			
			this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
			this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMaterialProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMaterialProducto, this.gridBagConstraintsMaterialProducto);
			
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMaterialProducto, this.gridBagConstraintsMaterialProducto);
		
			
		this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
		this.gridBagConstraintsMaterialProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMaterialProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMaterialProducto, this.gridBagConstraintsMaterialProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMaterialProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionMaterialProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				//this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMaterialProducto.gridx = 0;
				//this.jContentPaneDetalleMaterialProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMaterialProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMaterialProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMaterialProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesMaterialProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsMaterialProducto = new GridBagConstraints();
				//this.gridBagConstraintsMaterialProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMaterialProducto.gridx = 0;
				//this.jContentPaneDetalleMaterialProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMaterialProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMaterialProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMaterialProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesMaterialProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<MaterialProducto> materialproductos,MaterialProducto materialproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.materialproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setmaterialproductosForeignKey(materialproductos);
					productoBeanSwingJInternalFrame.setmaterialproductoForeignKey(materialproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionMaterialProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidMaterialProductoActual(materialproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaMaterialProducto(true);
					productoBeanSwingJInternalFrame.setid_material_productoFK_IdMaterialProducto(materialproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameMaterialProductoForeignKey(materialproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdMaterialProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMaterialProducto");
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

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<MaterialProducto> materialproductos,MaterialProducto materialproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.materialproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setmaterialproductosForeignKey(materialproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setmaterialproductoForeignKey(materialproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionMaterialProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidMaterialProductoActual(materialproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaMaterialProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_material_productoFK_IdMaterialProducto(materialproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameMaterialProductoForeignKey(materialproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdMaterialProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMaterialProducto");
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
