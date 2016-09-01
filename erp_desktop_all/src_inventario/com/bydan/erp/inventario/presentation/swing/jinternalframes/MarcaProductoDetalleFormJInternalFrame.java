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
import com.bydan.erp.inventario.util.MarcaProductoConstantesFunciones;

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
public class MarcaProductoDetalleFormJInternalFrame extends MarcaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMarcaProducto;
	
	protected JMenuBar jmenuBarDetalleMarcaProducto;
	
	protected JMenu jmenuDetalleMarcaProducto;
	protected JMenu jmenuDetalleArchivoMarcaProducto;
	protected JMenu jmenuDetalleAccionesMarcaProducto;
	protected JMenu jmenuDetalleDatosMarcaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMarcaProducto;	
	protected GridBagConstraints gridBagConstraintsMarcaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MarcaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleMarcaProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public MarcaProductoSessionBean marcaproductoSessionBean;
	
	

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
	
	public MarcaProductoLogic marcaproductoLogic;
	
	public JScrollPane jScrollPanelDatosMarcaProducto;
	public JScrollPane jScrollPanelDatosEdicionMarcaProducto;
	public JScrollPane jScrollPanelDatosGeneralMarcaProducto;
	
	protected JPanel jPanelCamposMarcaProducto;    
	protected JPanel jPanelCamposOcultosMarcaProducto;    	
	protected JPanel jPanelAccionesMarcaProducto;
	protected JPanel jPanelAccionesFormularioMarcaProducto;
    
	
	
	protected Integer iXPanelCamposMarcaProducto=0;
	protected Integer iYPanelCamposMarcaProducto=0;
	
	protected Integer iXPanelCamposOcultosMarcaProducto=0;
	protected Integer iYPanelCamposOcultosMarcaProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMarcaProducto;
	public JButton jButtonModificarMarcaProducto;
	public JButton jButtonActualizarMarcaProducto;
    public JButton jButtonEliminarMarcaProducto;
	public JButton jButtonCancelarMarcaProducto;
    public JButton jButtonGuardarCambiosMarcaProducto;
	public JButton jButtonGuardarCambiosTablaMarcaProducto;
	protected JButton jButtonCerrarMarcaProducto;
	
	
	protected JButton jButtonProcesarInformacionMarcaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMarcaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMarcaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMarcaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMarcaProducto;
	protected JButton jButtonModificarToolBarMarcaProducto;
	protected JButton jButtonActualizarToolBarMarcaProducto;
    protected JButton jButtonEliminarToolBarMarcaProducto;
	protected JButton jButtonCancelarToolBarMarcaProducto;
    protected JButton jButtonGuardarCambiosToolBarMarcaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarMarcaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarMarcaProducto;
	protected JButton jButtonCerrarToolBarMarcaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarMarcaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMarcaProducto;
	protected JMenuItem jMenuItemModificarMarcaProducto;
	protected JMenuItem jMenuItemActualizarMarcaProducto;
    protected JMenuItem jMenuItemEliminarMarcaProducto;
	protected JMenuItem jMenuItemCancelarMarcaProducto;
    protected JMenuItem jMenuItemGuardarCambiosMarcaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMarcaProducto;
	protected JMenuItem jMenuItemCerrarMarcaProducto;
	protected JMenuItem jMenuItemDetalleCerrarMarcaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMarcaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionMarcaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMarcaProducto;
	protected JMenuItem jMenuItemMostrarOcultarMarcaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMarcaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMarcaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMarcaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMarcaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMarcaProducto;
	public JLabel jLabelIdMarcaProducto;
	public JLabel jLabelidMarcaProducto;
	public JButton jButtonidMarcaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoMarcaProducto;
	public JLabel jLabelcodigoMarcaProducto;
	public JTextField jTextFieldcodigoMarcaProducto;
	public JButton jButtoncodigoMarcaProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreMarcaProducto;
	public JLabel jLabelnombreMarcaProducto;
	public JTextArea jTextAreanombreMarcaProducto;
	public JScrollPane jscrollPanenombreMarcaProducto;
	public JButton jButtonnombreMarcaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMarcaProducto;
	public JLabel jLabelid_empresaMarcaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMarcaProducto;
	public JButton jButtonid_empresaMarcaProducto= new JButtonMe();
	public JButton jButtonid_empresaMarcaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaMarcaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoMarcaProducto;
	public JLabel jLabelid_tipo_productoMarcaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoMarcaProducto;
	public JButton jButtonid_tipo_productoMarcaProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoMarcaProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoMarcaProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMarcaProducto;
	
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
	
	public MarcaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMarcaProducto=new JPanel();
				this.jPanelAccionesFormularioMarcaProducto=new JPanel();
				this.jmenuBarDetalleMarcaProducto=new JMenuBar();
				this.jTtoolBarDetalleMarcaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MarcaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMarcaProducto() {
		return this.jButtonActualizarToolBarMarcaProducto;
	}
	
	public JButton getjButtonEliminarToolBarMarcaProducto() {
		return this.jButtonEliminarToolBarMarcaProducto;
	}
	
	public JButton getjButtonCancelarToolBarMarcaProducto() {
		return this.jButtonCancelarToolBarMarcaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionMarcaProducto() {
		return this.jButtonProcesarInformacionMarcaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMarcaProducto)	{
		this.jButtonProcesarInformacionMarcaProducto = jButtonProcesarInformacionMarcaProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMarcaProducto() {
		return this.jComboBoxTiposAccionesMarcaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMarcaProducto(
			JComboBox jComboBoxTiposRelacionesMarcaProducto) {
		this.jComboBoxTiposRelacionesMarcaProducto = jComboBoxTiposRelacionesMarcaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMarcaProducto(
			JComboBox jComboBoxTiposAccionesMarcaProducto) {
		this.jComboBoxTiposAccionesMarcaProducto = jComboBoxTiposAccionesMarcaProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMarcaProducto() {
		return this.jComboBoxTiposAccionesFormularioMarcaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMarcaProducto(
			JComboBox jComboBoxTiposAccionesFormularioMarcaProducto) {
		this.jComboBoxTiposAccionesFormularioMarcaProducto = jComboBoxTiposAccionesFormularioMarcaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		
		this.marcaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.marcaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.marcaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MarcaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Marca Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMarcaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMarcaProducto=new JButtonMe();
				this.jButtonModificarToolBarMarcaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto,
							"actualizar","actualizar","Actualizar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto,
							"eliminar","eliminar","Eliminar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto,
							"cancelar","cancelar","Cancelar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMarcaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMarcaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMarcaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMarcaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMarcaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMarcaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMarcaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMarcaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMarcaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMarcaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMarcaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMarcaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMarcaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMarcaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMarcaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMarcaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMarcaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMarcaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMarcaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMarcaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMarcaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMarcaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMarcaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMarcaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMarcaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMarcaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMarcaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMarcaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMarcaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMarcaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMarcaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMarcaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMarcaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMarcaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMarcaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMarcaProducto.add(this.jMenuItemDetalleCerrarMarcaProducto);
		
		this.jmenuDetalleAccionesMarcaProducto.add(this.jMenuItemActualizarMarcaProducto);
		this.jmenuDetalleAccionesMarcaProducto.add(this.jMenuItemEliminarMarcaProducto);
		this.jmenuDetalleAccionesMarcaProducto.add(this.jMenuItemCancelarMarcaProducto);		
		
		//this.jmenuDetalleDatosMarcaProducto.add(this.jMenuItemDetalleAbrirOrderByMarcaProducto);				
		this.jmenuDetalleDatosMarcaProducto.add(this.jMenuItemDetalleMostarOcultarMarcaProducto);				
				
		//this.jmenuDetalleAccionesMarcaProducto.add(this.jMenuItemGuardarCambiosMarcaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMarcaProducto.add(this.jmenuDetalleArchivoMarcaProducto);		
		this.jmenuBarDetalleMarcaProducto.add(this.jmenuDetalleAccionesMarcaProducto);		
		this.jmenuBarDetalleMarcaProducto.add(this.jmenuDetalleDatosMarcaProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMarcaProducto.add(this.jmenuDetalleMarcaProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMarcaProducto);				
	}
	
	
	public void inicializarElementosCamposMarcaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMarcaProducto = new JLabelMe();
		jLabelIdMarcaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMarcaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMarcaProducto.setToolTipText(MarcaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMarcaProducto= new GridBagLayout();

		this.jPanelidMarcaProducto.setLayout(this.gridaBagLayoutMarcaProducto);

		jLabelidMarcaProducto = new JLabel();
		jLabelidMarcaProducto.setText("Id");

		jLabelidMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoMarcaProducto = new JLabelMe();
		this.jLabelcodigoMarcaProducto.setText(""+MarcaProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoMarcaProducto.setToolTipText("Codigo");
		this.jLabelcodigoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoMarcaProducto.setToolTipText(MarcaProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutMarcaProducto = new GridBagLayout();
		this.jPanelcodigoMarcaProducto.setLayout(this.gridaBagLayoutMarcaProducto);


		jTextFieldcodigoMarcaProducto= new JTextFieldMe();

		jTextFieldcodigoMarcaProducto.setEnabled(false);
		jTextFieldcodigoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoMarcaProductoBusqueda= new JButtonMe();
		this.jButtoncodigoMarcaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMarcaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMarcaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoMarcaProductoBusqueda.setText("U");
		this.jButtoncodigoMarcaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoMarcaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoMarcaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoMarcaProductoBusqueda"));

		if(this.marcaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoMarcaProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreMarcaProducto = new JLabelMe();
		this.jLabelnombreMarcaProducto.setText(""+MarcaProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMarcaProducto.setToolTipText("Nombre");
		this.jLabelnombreMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMarcaProducto.setToolTipText(MarcaProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMarcaProducto = new GridBagLayout();
		this.jPanelnombreMarcaProducto.setLayout(this.gridaBagLayoutMarcaProducto);


		jTextAreanombreMarcaProducto= new JTextAreaMe();
		jTextAreanombreMarcaProducto.setEnabled(false);
		jTextAreanombreMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMarcaProducto.setLineWrap(true);
		jTextAreanombreMarcaProducto.setWrapStyleWord(true);
		jTextAreanombreMarcaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreMarcaProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreMarcaProducto = new JScrollPane(jTextAreanombreMarcaProducto);
		jscrollPanenombreMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreMarcaProductoBusqueda= new JButtonMe();
		this.jButtonnombreMarcaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMarcaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMarcaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMarcaProductoBusqueda.setText("U");
		this.jButtonnombreMarcaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMarcaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMarcaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMarcaProductoBusqueda"));

		if(this.marcaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMarcaProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMarcaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMarcaProducto = new JLabelMe();
		this.jLabelid_empresaMarcaProducto.setText(""+MarcaProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMarcaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMarcaProducto.setToolTipText(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMarcaProducto = new GridBagLayout();
		this.jPanelid_empresaMarcaProducto.setLayout(this.gridaBagLayoutMarcaProducto);


		jComboBoxid_empresaMarcaProducto= new JComboBoxMe();
		jComboBoxid_empresaMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMarcaProducto.setEnabled(false);

		this.jButtonid_empresaMarcaProducto= new JButtonMe();
		this.jButtonid_empresaMarcaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMarcaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMarcaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMarcaProducto.setText("Buscar");
		this.jButtonid_empresaMarcaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMarcaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMarcaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMarcaProducto"));

		this.jButtonid_empresaMarcaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaMarcaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMarcaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMarcaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMarcaProductoBusqueda.setText("U");
		this.jButtonid_empresaMarcaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMarcaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMarcaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMarcaProductoBusqueda"));

		if(this.marcaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMarcaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaMarcaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaMarcaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMarcaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMarcaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMarcaProductoUpdate.setText("U");
		this.jButtonid_empresaMarcaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMarcaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMarcaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMarcaProductoUpdate"));



					
		this.jLabelid_tipo_productoMarcaProducto = new JLabelMe();
		this.jLabelid_tipo_productoMarcaProducto.setText(""+MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoMarcaProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoMarcaProducto.setToolTipText(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutMarcaProducto = new GridBagLayout();
		this.jPanelid_tipo_productoMarcaProducto.setLayout(this.gridaBagLayoutMarcaProducto);


		jComboBoxid_tipo_productoMarcaProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoMarcaProducto= new JButtonMe();
		this.jButtonid_tipo_productoMarcaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMarcaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMarcaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoMarcaProducto.setText("Buscar");
		this.jButtonid_tipo_productoMarcaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoMarcaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMarcaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMarcaProducto"));

		this.jButtonid_tipo_productoMarcaProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoMarcaProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMarcaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMarcaProductoBusqueda"));

		if(this.marcaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoMarcaProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoMarcaProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoMarcaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMarcaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoMarcaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoMarcaProductoUpdate.setText("U");
		this.jButtonid_tipo_productoMarcaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoMarcaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoMarcaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoMarcaProductoUpdate"));



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
		//this.jInternalFrameDetalleMarcaProducto = new MarcaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Marca Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMarcaProducto= new GridBagLayout();
		

		
		String sToolTipMarcaProducto="";
		sToolTipMarcaProducto=MarcaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMarcaProducto+="(Inventario.MarcaProducto)";
		}
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMarcaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMarcaProducto = new JButtonMe();
		this.jButtonModificarMarcaProducto = new JButtonMe();
        this.jButtonActualizarMarcaProducto = new JButtonMe();
        this.jButtonEliminarMarcaProducto = new JButtonMe();
        this.jButtonCancelarMarcaProducto = new JButtonMe();
        this.jButtonGuardarCambiosMarcaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaMarcaProducto = new JButtonMe();
		this.jButtonCerrarMarcaProducto = new JButtonMe();
		
		this.jScrollPanelDatosMarcaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionMarcaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralMarcaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Marca Producto";
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosMarcaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMarcaProducto.setName("jPanelCamposMarcaProducto"); 

		this.jPanelCamposOcultosMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMarcaProducto.setName("jPanelCamposOcultosMarcaProducto"); 

        this.jPanelAccionesMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMarcaProducto.setToolTipText("Acciones");
        this.jPanelAccionesMarcaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMarcaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMarcaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMarcaProducto.setText("Nuevo");
		this.jButtonModificarMarcaProducto.setText("Editar");
        this.jButtonActualizarMarcaProducto.setText("Actualizar");
        this.jButtonEliminarMarcaProducto.setText("Eliminar");
        this.jButtonCancelarMarcaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosMarcaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaMarcaProducto.setText("Guardar");
		this.jButtonCerrarMarcaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMarcaProducto,"nuevo_button","Nuevo",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMarcaProducto,"modificar_button","Editar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMarcaProducto,"actualizar_button","Actualizar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMarcaProducto,"eliminar_button","Eliminar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMarcaProducto,"cancelar_button","Cancelar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMarcaProducto,"guardarcambios_button","Guardar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMarcaProducto,"guardarcambiostabla_button","Guardar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMarcaProducto,"cerrar_button","Salir",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMarcaProducto.setToolTipText("Nuevo"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMarcaProducto.setToolTipText("Editar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMarcaProducto.setToolTipText("Actualizar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMarcaProducto.setToolTipText("Eliminar)"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMarcaProducto.setToolTipText("Cancelar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMarcaProducto.setToolTipText("Guardar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMarcaProducto.setToolTipText("Guardar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMarcaProducto.setToolTipText("Salir"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMarcaProducto";
		inputMap = this.jButtonNuevoMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMarcaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMarcaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMarcaProducto";
		inputMap = this.jButtonActualizarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMarcaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarMarcaProducto";
		inputMap = this.jButtonEliminarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMarcaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarMarcaProducto";
		inputMap = this.jButtonCancelarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMarcaProducto"));
		
		//CERRAR		
		sMapKey = "CerrarMarcaProducto";
		inputMap = this.jButtonCerrarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMarcaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMarcaProducto";
		inputMap = this.jButtonGuardarCambiosTablaMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMarcaProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMarcaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMarcaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMarcaProducto.setToolTipText("Nuevo MarcaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMarcaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMarcaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMarcaProducto.setToolTipText("Sin Cerrar Ventana MarcaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMarcaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMarcaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMarcaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMarcaProducto.setText("Accion");
		this.jComboBoxTiposAccionesMarcaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMarcaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMarcaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMarcaProducto = new JLabelMe();
		
		this.jLabelAccionesMarcaProducto.setText("Acciones");		
		this.jLabelAccionesMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMarcaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMarcaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMarcaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMarcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMarcaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMarcaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMarcaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMarcaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMarcaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMarcaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMarcaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMarcaProducto = new GridBagLayout();
		
		this.jPanelCamposMarcaProducto.setLayout(gridaBagLayoutCamposMarcaProducto);
		this.jPanelCamposOcultosMarcaProducto.setLayout(gridaBagLayoutCamposOcultosMarcaProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 0;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMarcaProducto.add(jLabelIdMarcaProducto, this.gridBagConstraintsMarcaProducto);



	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 1;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMarcaProducto.add(jLabelidMarcaProducto, this.gridBagConstraintsMarcaProducto);


	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 0;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMarcaProducto.add(jLabelid_empresaMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 2;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMarcaProducto.add(jButtonid_empresaMarcaProductoBusqueda, this.gridBagConstraintsMarcaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 3;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMarcaProducto.add(jButtonid_empresaMarcaProductoUpdate, this.gridBagConstraintsMarcaProducto);
	}

	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 1;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMarcaProducto.add(jComboBoxid_empresaMarcaProducto, this.gridBagConstraintsMarcaProducto);


	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 0;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoMarcaProducto.add(jLabelid_tipo_productoMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 2;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoMarcaProducto.add(jButtonid_tipo_productoMarcaProductoBusqueda, this.gridBagConstraintsMarcaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 3;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoMarcaProducto.add(jButtonid_tipo_productoMarcaProductoUpdate, this.gridBagConstraintsMarcaProducto);
	}

	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 1;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoMarcaProducto.add(jComboBoxid_tipo_productoMarcaProducto, this.gridBagConstraintsMarcaProducto);


	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 0;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoMarcaProducto.add(jLabelcodigoMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 2;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoMarcaProducto.add(jButtoncodigoMarcaProductoBusqueda, this.gridBagConstraintsMarcaProducto);
	}

	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 1;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoMarcaProducto.add(jTextFieldcodigoMarcaProducto, this.gridBagConstraintsMarcaProducto);


	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 0;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMarcaProducto.add(jLabelnombreMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 2;
		this.gridBagConstraintsMarcaProducto.ipadx = 0;
		this.gridBagConstraintsMarcaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMarcaProducto.add(jButtonnombreMarcaProductoBusqueda, this.gridBagConstraintsMarcaProducto);
	}

	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMarcaProducto.gridy = 0;
	this.gridBagConstraintsMarcaProducto.gridx = 1;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMarcaProducto.add(jscrollPanenombreMarcaProducto, this.gridBagConstraintsMarcaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMarcaProducto.gridy = iYPanelCamposMarcaProducto;
	this.gridBagConstraintsMarcaProducto.gridx = iXPanelCamposMarcaProducto++;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMarcaProducto.add(this.jPanelidMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(iXPanelCamposMarcaProducto % 1==0) {
		iXPanelCamposMarcaProducto=0;
		iYPanelCamposMarcaProducto++;
	}
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMarcaProducto.gridy = iYPanelCamposMarcaProducto;
	this.gridBagConstraintsMarcaProducto.gridx = iXPanelCamposMarcaProducto++;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMarcaProducto.add(this.jPanelid_tipo_productoMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(iXPanelCamposMarcaProducto % 1==0) {
		iXPanelCamposMarcaProducto=0;
		iYPanelCamposMarcaProducto++;
	}
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMarcaProducto.gridy = iYPanelCamposMarcaProducto;
	this.gridBagConstraintsMarcaProducto.gridx = iXPanelCamposMarcaProducto++;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMarcaProducto.add(this.jPanelcodigoMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(iXPanelCamposMarcaProducto % 1==0) {
		iXPanelCamposMarcaProducto=0;
		iYPanelCamposMarcaProducto++;
	}
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMarcaProducto.gridy = iYPanelCamposMarcaProducto;
	this.gridBagConstraintsMarcaProducto.gridx = iXPanelCamposMarcaProducto++;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMarcaProducto.add(this.jPanelnombreMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(iXPanelCamposMarcaProducto % 1==0) {
		iXPanelCamposMarcaProducto=0;
		iYPanelCamposMarcaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMarcaProducto.gridy = iYPanelCamposOcultosMarcaProducto;
	this.gridBagConstraintsMarcaProducto.gridx = iXPanelCamposOcultosMarcaProducto++;
	this.gridBagConstraintsMarcaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMarcaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMarcaProducto.add(this.jPanelid_empresaMarcaProducto, this.gridBagConstraintsMarcaProducto);



	if(iXPanelCamposOcultosMarcaProducto % 1==0) {
		iXPanelCamposOcultosMarcaProducto=0;
		iYPanelCamposOcultosMarcaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesMarcaProducto= new GridBagLayout();
		this.jPanelAccionesMarcaProducto.setLayout(gridaBagLayoutAccionesMarcaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMarcaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioMarcaProducto.setLayout(gridaBagLayoutAccionesFormularioMarcaProducto);
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMarcaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMarcaProducto.add(this.jComboBoxTiposAccionesFormularioMarcaProducto, this.gridBagConstraintsMarcaProducto);

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMarcaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMarcaProducto.add(this.jCheckBoxPostAccionNuevoMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMarcaProducto.add(this.jCheckBoxPostAccionSinCerrarMarcaProducto, this.gridBagConstraintsMarcaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMarcaProducto.add(this.jCheckBoxPostAccionSinMensajeMarcaProducto, this.gridBagConstraintsMarcaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesMarcaProducto.add(this.jButtonModificarMarcaProducto, this.gridBagConstraintsMarcaProducto);							

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesMarcaProducto.add(this.jButtonEliminarMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = 0;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMarcaProducto.add(this.jButtonActualizarMarcaProducto, this.gridBagConstraintsMarcaProducto);


		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = 0;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMarcaProducto.add(this.jButtonGuardarCambiosMarcaProducto, this.gridBagConstraintsMarcaProducto);	
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = 0;		
		this.gridBagConstraintsMarcaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesMarcaProducto.add(this.jButtonCancelarMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMarcaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMarcaProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();						
			this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMarcaProducto.gridx = 0;		
			//this.gridBagConstraintsMarcaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMarcaProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMarcaProducto.gridx =0;
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMarcaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMarcaProducto, this.gridBagConstraintsMarcaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMarcaProducto = new MarcaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Marca Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Marca Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Marca Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MarcaProductoModel marcaproductoModel=new MarcaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//MarcaProductoModel.MarcaProductoFocusTraversalPolicy marcaproductoFocusTraversalPolicy = marcaproductoModel.new MarcaProductoFocusTraversalPolicy(this);
			
			//marcaproductoFocusTraversalPolicy.setmarcaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(marcaproductoModel);
			
			
			this.jContentPaneDetalleMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMarcaProducto = new GridBagLayout();	
			this.jContentPaneDetalleMarcaProducto.setLayout(gridaBagLayoutDetalleMarcaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMarcaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMarcaProducto.gridx = 0;
					
				
				this.jContentPaneDetalleMarcaProducto.add(jTtoolBarDetalleMarcaProducto, gridBagConstraintsMarcaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionMarcaProducto=   new JScrollPane(jContentPaneDetalleMarcaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMarcaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMarcaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMarcaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMarcaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMarcaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMarcaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMarcaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMarcaProducto.gridx = 0;
	        
			this.jContentPaneDetalleMarcaProducto.add(jPanelCamposMarcaProducto, gridBagConstraintsMarcaProducto);
			
			
			
			
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
						&& marcaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMarcaProducto= new GridBagConstraints();
						this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMarcaProducto.gridx = 0;
						this.jContentPaneDetalleMarcaProducto.add(this.jTabbedPaneRelacionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMarcaProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMarcaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
					this.gridBagConstraintsMarcaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMarcaProducto.gridx = 0;
					
				
					this.jContentPaneDetalleMarcaProducto.add(jPanelCamposOcultosMarcaProducto, gridBagConstraintsMarcaProducto);
				
					this.jPanelCamposOcultosMarcaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsMarcaProducto.gridx = 0;
	        this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMarcaProducto.add(this.jPanelAccionesFormularioMarcaProducto, this.gridBagConstraintsMarcaProducto);							
			
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
	        this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsMarcaProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleMarcaProducto.add(this.jPanelAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMarcaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMarcaProducto=   new JScrollPane(this.jPanelCamposMarcaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMarcaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMarcaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMarcaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMarcaProducto.gridx = 0;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMarcaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMarcaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMarcaProducto, this.gridBagConstraintsMarcaProducto);			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMarcaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMarcaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionMarcaProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				//this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMarcaProducto.gridx = 0;
				//this.jContentPaneDetalleMarcaProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMarcaProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMarcaProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMarcaProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesMarcaProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				//this.gridBagConstraintsMarcaProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMarcaProducto.gridx = 0;
				//this.jContentPaneDetalleMarcaProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMarcaProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMarcaProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMarcaProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesMarcaProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<MarcaProducto> marcaproductos,MarcaProducto marcaproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.marcaproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setmarcaproductosForeignKey(marcaproductos);
					productoBeanSwingJInternalFrame.setmarcaproductoForeignKey(marcaproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionMarcaProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidMarcaProductoActual(marcaproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaMarcaProducto(true);
					productoBeanSwingJInternalFrame.setid_marca_productoFK_IdMarcaProducto(marcaproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameMarcaProductoForeignKey(marcaproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdMarcaProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMarcaProducto");
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

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<MarcaProducto> marcaproductos,MarcaProducto marcaproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.marcaproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setmarcaproductosForeignKey(marcaproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setmarcaproductoForeignKey(marcaproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionMarcaProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidMarcaProductoActual(marcaproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaMarcaProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_marca_productoFK_IdMarcaProducto(marcaproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameMarcaProductoForeignKey(marcaproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdMarcaProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMarcaProducto");
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
