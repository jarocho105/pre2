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
import com.bydan.erp.inventario.util.TallaProductoConstantesFunciones;

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
public class TallaProductoDetalleFormJInternalFrame extends TallaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTallaProducto;
	
	protected JMenuBar jmenuBarDetalleTallaProducto;
	
	protected JMenu jmenuDetalleTallaProducto;
	protected JMenu jmenuDetalleArchivoTallaProducto;
	protected JMenu jmenuDetalleAccionesTallaProducto;
	protected JMenu jmenuDetalleDatosTallaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTallaProducto;	
	protected GridBagConstraints gridBagConstraintsTallaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TallaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTallaProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public TallaProductoSessionBean tallaproductoSessionBean;
	
	

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
	
	public TallaProductoLogic tallaproductoLogic;
	
	public JScrollPane jScrollPanelDatosTallaProducto;
	public JScrollPane jScrollPanelDatosEdicionTallaProducto;
	public JScrollPane jScrollPanelDatosGeneralTallaProducto;
	
	protected JPanel jPanelCamposTallaProducto;    
	protected JPanel jPanelCamposOcultosTallaProducto;    	
	protected JPanel jPanelAccionesTallaProducto;
	protected JPanel jPanelAccionesFormularioTallaProducto;
    
	
	
	protected Integer iXPanelCamposTallaProducto=0;
	protected Integer iYPanelCamposTallaProducto=0;
	
	protected Integer iXPanelCamposOcultosTallaProducto=0;
	protected Integer iYPanelCamposOcultosTallaProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTallaProducto;
	public JButton jButtonModificarTallaProducto;
	public JButton jButtonActualizarTallaProducto;
    public JButton jButtonEliminarTallaProducto;
	public JButton jButtonCancelarTallaProducto;
    public JButton jButtonGuardarCambiosTallaProducto;
	public JButton jButtonGuardarCambiosTablaTallaProducto;
	protected JButton jButtonCerrarTallaProducto;
	
	
	protected JButton jButtonProcesarInformacionTallaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTallaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTallaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTallaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTallaProducto;
	protected JButton jButtonModificarToolBarTallaProducto;
	protected JButton jButtonActualizarToolBarTallaProducto;
    protected JButton jButtonEliminarToolBarTallaProducto;
	protected JButton jButtonCancelarToolBarTallaProducto;
    protected JButton jButtonGuardarCambiosToolBarTallaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarTallaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarTallaProducto;
	protected JButton jButtonCerrarToolBarTallaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarTallaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTallaProducto;
	protected JMenuItem jMenuItemModificarTallaProducto;
	protected JMenuItem jMenuItemActualizarTallaProducto;
    protected JMenuItem jMenuItemEliminarTallaProducto;
	protected JMenuItem jMenuItemCancelarTallaProducto;
    protected JMenuItem jMenuItemGuardarCambiosTallaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTallaProducto;
	protected JMenuItem jMenuItemCerrarTallaProducto;
	protected JMenuItem jMenuItemDetalleCerrarTallaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTallaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionTallaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTallaProducto;
	protected JMenuItem jMenuItemMostrarOcultarTallaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTallaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTallaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTallaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTallaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTallaProducto;
	public JLabel jLabelIdTallaProducto;
	public JLabel jLabelidTallaProducto;
	public JButton jButtonidTallaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTallaProducto;
	public JLabel jLabelcodigoTallaProducto;
	public JTextField jTextFieldcodigoTallaProducto;
	public JButton jButtoncodigoTallaProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTallaProducto;
	public JLabel jLabelnombreTallaProducto;
	public JTextArea jTextAreanombreTallaProducto;
	public JScrollPane jscrollPanenombreTallaProducto;
	public JButton jButtonnombreTallaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTallaProducto;
	public JLabel jLabelid_empresaTallaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTallaProducto;
	public JButton jButtonid_empresaTallaProducto= new JButtonMe();
	public JButton jButtonid_empresaTallaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTallaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoTallaProducto;
	public JLabel jLabelid_tipo_productoTallaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoTallaProducto;
	public JButton jButtonid_tipo_productoTallaProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoTallaProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoTallaProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTallaProducto;
	
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
	
	public TallaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTallaProducto=new JPanel();
				this.jPanelAccionesFormularioTallaProducto=new JPanel();
				this.jmenuBarDetalleTallaProducto=new JMenuBar();
				this.jTtoolBarDetalleTallaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TallaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTallaProducto() {
		return this.jButtonActualizarToolBarTallaProducto;
	}
	
	public JButton getjButtonEliminarToolBarTallaProducto() {
		return this.jButtonEliminarToolBarTallaProducto;
	}
	
	public JButton getjButtonCancelarToolBarTallaProducto() {
		return this.jButtonCancelarToolBarTallaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionTallaProducto() {
		return this.jButtonProcesarInformacionTallaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTallaProducto)	{
		this.jButtonProcesarInformacionTallaProducto = jButtonProcesarInformacionTallaProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTallaProducto() {
		return this.jComboBoxTiposAccionesTallaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTallaProducto(
			JComboBox jComboBoxTiposRelacionesTallaProducto) {
		this.jComboBoxTiposRelacionesTallaProducto = jComboBoxTiposRelacionesTallaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTallaProducto(
			JComboBox jComboBoxTiposAccionesTallaProducto) {
		this.jComboBoxTiposAccionesTallaProducto = jComboBoxTiposAccionesTallaProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTallaProducto() {
		return this.jComboBoxTiposAccionesFormularioTallaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTallaProducto(
			JComboBox jComboBoxTiposAccionesFormularioTallaProducto) {
		this.jComboBoxTiposAccionesFormularioTallaProducto = jComboBoxTiposAccionesFormularioTallaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tallaproductoSessionBean=new TallaProductoSessionBean();
		
		this.tallaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tallaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TallaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Talla Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTallaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTallaProducto=new JButtonMe();
				this.jButtonModificarToolBarTallaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTallaProducto,this.jTtoolBarDetalleTallaProducto,
							"actualizar","actualizar","Actualizar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTallaProducto,this.jTtoolBarDetalleTallaProducto,
							"eliminar","eliminar","Eliminar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTallaProducto,this.jTtoolBarDetalleTallaProducto,
							"cancelar","cancelar","Cancelar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTallaProducto,this.jTtoolBarDetalleTallaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTallaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTallaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTallaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTallaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTallaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTallaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTallaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTallaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTallaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTallaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTallaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTallaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTallaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTallaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTallaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTallaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTallaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTallaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTallaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTallaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTallaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTallaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTallaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTallaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTallaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTallaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTallaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTallaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTallaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTallaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTallaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTallaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTallaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTallaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTallaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTallaProducto.add(this.jMenuItemDetalleCerrarTallaProducto);
		
		this.jmenuDetalleAccionesTallaProducto.add(this.jMenuItemActualizarTallaProducto);
		this.jmenuDetalleAccionesTallaProducto.add(this.jMenuItemEliminarTallaProducto);
		this.jmenuDetalleAccionesTallaProducto.add(this.jMenuItemCancelarTallaProducto);		
		
		//this.jmenuDetalleDatosTallaProducto.add(this.jMenuItemDetalleAbrirOrderByTallaProducto);				
		this.jmenuDetalleDatosTallaProducto.add(this.jMenuItemDetalleMostarOcultarTallaProducto);				
				
		//this.jmenuDetalleAccionesTallaProducto.add(this.jMenuItemGuardarCambiosTallaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTallaProducto.add(this.jmenuDetalleArchivoTallaProducto);		
		this.jmenuBarDetalleTallaProducto.add(this.jmenuDetalleAccionesTallaProducto);		
		this.jmenuBarDetalleTallaProducto.add(this.jmenuDetalleDatosTallaProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTallaProducto.add(this.jmenuDetalleTallaProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTallaProducto);				
	}
	
	
	public void inicializarElementosCamposTallaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTallaProducto = new JLabelMe();
		jLabelIdTallaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTallaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTallaProducto.setToolTipText(TallaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTallaProducto= new GridBagLayout();

		this.jPanelidTallaProducto.setLayout(this.gridaBagLayoutTallaProducto);

		jLabelidTallaProducto = new JLabel();
		jLabelidTallaProducto.setText("Id");

		jLabelidTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTallaProducto = new JLabelMe();
		this.jLabelcodigoTallaProducto.setText(""+TallaProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTallaProducto.setToolTipText("Codigo");
		this.jLabelcodigoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTallaProducto.setToolTipText(TallaProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTallaProducto = new GridBagLayout();
		this.jPanelcodigoTallaProducto.setLayout(this.gridaBagLayoutTallaProducto);


		jTextFieldcodigoTallaProducto= new JTextFieldMe();

		jTextFieldcodigoTallaProducto.setEnabled(false);
		jTextFieldcodigoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTallaProductoBusqueda= new JButtonMe();
		this.jButtoncodigoTallaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTallaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTallaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTallaProductoBusqueda.setText("U");
		this.jButtoncodigoTallaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTallaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTallaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTallaProductoBusqueda"));

		if(this.tallaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTallaProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTallaProducto = new JLabelMe();
		this.jLabelnombreTallaProducto.setText(""+TallaProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTallaProducto.setToolTipText("Nombre");
		this.jLabelnombreTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTallaProducto.setToolTipText(TallaProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTallaProducto = new GridBagLayout();
		this.jPanelnombreTallaProducto.setLayout(this.gridaBagLayoutTallaProducto);


		jTextAreanombreTallaProducto= new JTextAreaMe();
		jTextAreanombreTallaProducto.setEnabled(false);
		jTextAreanombreTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTallaProducto.setLineWrap(true);
		jTextAreanombreTallaProducto.setWrapStyleWord(true);
		jTextAreanombreTallaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTallaProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTallaProducto = new JScrollPane(jTextAreanombreTallaProducto);
		jscrollPanenombreTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTallaProductoBusqueda= new JButtonMe();
		this.jButtonnombreTallaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTallaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTallaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTallaProductoBusqueda.setText("U");
		this.jButtonnombreTallaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTallaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTallaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTallaProductoBusqueda"));

		if(this.tallaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTallaProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTallaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTallaProducto = new JLabelMe();
		this.jLabelid_empresaTallaProducto.setText(""+TallaProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTallaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTallaProducto.setToolTipText(TallaProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTallaProducto = new GridBagLayout();
		this.jPanelid_empresaTallaProducto.setLayout(this.gridaBagLayoutTallaProducto);


		jComboBoxid_empresaTallaProducto= new JComboBoxMe();
		jComboBoxid_empresaTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTallaProducto.setEnabled(false);

		this.jButtonid_empresaTallaProducto= new JButtonMe();
		this.jButtonid_empresaTallaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaProducto.setText("Buscar");
		this.jButtonid_empresaTallaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTallaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaProducto"));

		this.jButtonid_empresaTallaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaTallaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTallaProductoBusqueda.setText("U");
		this.jButtonid_empresaTallaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTallaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaProductoBusqueda"));

		if(this.tallaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTallaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTallaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaTallaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTallaProductoUpdate.setText("U");
		this.jButtonid_empresaTallaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTallaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaProductoUpdate"));



					
		this.jLabelid_tipo_productoTallaProducto = new JLabelMe();
		this.jLabelid_tipo_productoTallaProducto.setText(""+TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoTallaProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoTallaProducto.setToolTipText(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutTallaProducto = new GridBagLayout();
		this.jPanelid_tipo_productoTallaProducto.setLayout(this.gridaBagLayoutTallaProducto);


		jComboBoxid_tipo_productoTallaProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoTallaProducto= new JButtonMe();
		this.jButtonid_tipo_productoTallaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoTallaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoTallaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoTallaProducto.setText("Buscar");
		this.jButtonid_tipo_productoTallaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoTallaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoTallaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoTallaProducto"));

		this.jButtonid_tipo_productoTallaProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoTallaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoTallaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoTallaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoTallaProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoTallaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoTallaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoTallaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoTallaProductoBusqueda"));

		if(this.tallaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoTallaProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoTallaProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoTallaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoTallaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoTallaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoTallaProductoUpdate.setText("U");
		this.jButtonid_tipo_productoTallaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoTallaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoTallaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoTallaProductoUpdate"));



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
		//this.jInternalFrameDetalleTallaProducto = new TallaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Talla Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTallaProducto= new GridBagLayout();
		

		
		String sToolTipTallaProducto="";
		sToolTipTallaProducto=TallaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTallaProducto+="(Inventario.TallaProducto)";
		}
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTallaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTallaProducto = new JButtonMe();
		this.jButtonModificarTallaProducto = new JButtonMe();
        this.jButtonActualizarTallaProducto = new JButtonMe();
        this.jButtonEliminarTallaProducto = new JButtonMe();
        this.jButtonCancelarTallaProducto = new JButtonMe();
        this.jButtonGuardarCambiosTallaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTallaProducto = new JButtonMe();
		this.jButtonCerrarTallaProducto = new JButtonMe();
		
		this.jScrollPanelDatosTallaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTallaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralTallaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Talla Producto";
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosTallaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTallaProducto.setName("jPanelCamposTallaProducto"); 

		this.jPanelCamposOcultosTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTallaProducto.setName("jPanelCamposOcultosTallaProducto"); 

        this.jPanelAccionesTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTallaProducto.setToolTipText("Acciones");
        this.jPanelAccionesTallaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTallaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTallaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTallaProducto.setText("Nuevo");
		this.jButtonModificarTallaProducto.setText("Editar");
        this.jButtonActualizarTallaProducto.setText("Actualizar");
        this.jButtonEliminarTallaProducto.setText("Eliminar");
        this.jButtonCancelarTallaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosTallaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTallaProducto.setText("Guardar");
		this.jButtonCerrarTallaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTallaProducto,"nuevo_button","Nuevo",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTallaProducto,"modificar_button","Editar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTallaProducto,"actualizar_button","Actualizar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTallaProducto,"eliminar_button","Eliminar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTallaProducto,"cancelar_button","Cancelar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTallaProducto,"guardarcambios_button","Guardar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTallaProducto,"guardarcambiostabla_button","Guardar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTallaProducto,"cerrar_button","Salir",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTallaProducto.setToolTipText("Nuevo"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTallaProducto.setToolTipText("Editar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTallaProducto.setToolTipText("Actualizar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTallaProducto.setToolTipText("Eliminar)"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTallaProducto.setToolTipText("Cancelar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTallaProducto.setToolTipText("Guardar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTallaProducto.setToolTipText("Guardar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTallaProducto.setToolTipText("Salir"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTallaProducto";
		inputMap = this.jButtonNuevoTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTallaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTallaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTallaProducto";
		inputMap = this.jButtonActualizarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTallaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarTallaProducto";
		inputMap = this.jButtonEliminarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTallaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarTallaProducto";
		inputMap = this.jButtonCancelarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTallaProducto"));
		
		//CERRAR		
		sMapKey = "CerrarTallaProducto";
		inputMap = this.jButtonCerrarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTallaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTallaProducto";
		inputMap = this.jButtonGuardarCambiosTablaTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTallaProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTallaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTallaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTallaProducto.setToolTipText("Nuevo TallaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTallaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTallaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTallaProducto.setToolTipText("Sin Cerrar Ventana TallaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTallaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTallaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTallaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTallaProducto.setText("Accion");
		this.jComboBoxTiposAccionesTallaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTallaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTallaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTallaProducto = new JLabelMe();
		
		this.jLabelAccionesTallaProducto.setText("Acciones");		
		this.jLabelAccionesTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTallaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTallaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTallaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTallaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTallaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTallaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTallaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTallaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTallaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTallaProducto = new GridBagLayout();
		
		this.jPanelCamposTallaProducto.setLayout(gridaBagLayoutCamposTallaProducto);
		this.jPanelCamposOcultosTallaProducto.setLayout(gridaBagLayoutCamposOcultosTallaProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 0;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTallaProducto.add(jLabelIdTallaProducto, this.gridBagConstraintsTallaProducto);



	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 1;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTallaProducto.add(jLabelidTallaProducto, this.gridBagConstraintsTallaProducto);


	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 0;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTallaProducto.add(jLabelid_empresaTallaProducto, this.gridBagConstraintsTallaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 2;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTallaProducto.add(jButtonid_empresaTallaProductoBusqueda, this.gridBagConstraintsTallaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 3;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTallaProducto.add(jButtonid_empresaTallaProductoUpdate, this.gridBagConstraintsTallaProducto);
	}

	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 1;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTallaProducto.add(jComboBoxid_empresaTallaProducto, this.gridBagConstraintsTallaProducto);


	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 0;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoTallaProducto.add(jLabelid_tipo_productoTallaProducto, this.gridBagConstraintsTallaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 2;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoTallaProducto.add(jButtonid_tipo_productoTallaProductoBusqueda, this.gridBagConstraintsTallaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 3;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoTallaProducto.add(jButtonid_tipo_productoTallaProductoUpdate, this.gridBagConstraintsTallaProducto);
	}

	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 1;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoTallaProducto.add(jComboBoxid_tipo_productoTallaProducto, this.gridBagConstraintsTallaProducto);


	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 0;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTallaProducto.add(jLabelcodigoTallaProducto, this.gridBagConstraintsTallaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 2;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTallaProducto.add(jButtoncodigoTallaProductoBusqueda, this.gridBagConstraintsTallaProducto);
	}

	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 1;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTallaProducto.add(jTextFieldcodigoTallaProducto, this.gridBagConstraintsTallaProducto);


	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 0;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTallaProducto.add(jLabelnombreTallaProducto, this.gridBagConstraintsTallaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 2;
		this.gridBagConstraintsTallaProducto.ipadx = 0;
		this.gridBagConstraintsTallaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTallaProducto.add(jButtonnombreTallaProductoBusqueda, this.gridBagConstraintsTallaProducto);
	}

	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaProducto.gridy = 0;
	this.gridBagConstraintsTallaProducto.gridx = 1;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTallaProducto.add(jscrollPanenombreTallaProducto, this.gridBagConstraintsTallaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaProducto.gridy = iYPanelCamposTallaProducto;
	this.gridBagConstraintsTallaProducto.gridx = iXPanelCamposTallaProducto++;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaProducto.add(this.jPanelidTallaProducto, this.gridBagConstraintsTallaProducto);



	if(iXPanelCamposTallaProducto % 1==0) {
		iXPanelCamposTallaProducto=0;
		iYPanelCamposTallaProducto++;
	}
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaProducto.gridy = iYPanelCamposTallaProducto;
	this.gridBagConstraintsTallaProducto.gridx = iXPanelCamposTallaProducto++;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaProducto.add(this.jPanelid_tipo_productoTallaProducto, this.gridBagConstraintsTallaProducto);



	if(iXPanelCamposTallaProducto % 1==0) {
		iXPanelCamposTallaProducto=0;
		iYPanelCamposTallaProducto++;
	}
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaProducto.gridy = iYPanelCamposTallaProducto;
	this.gridBagConstraintsTallaProducto.gridx = iXPanelCamposTallaProducto++;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaProducto.add(this.jPanelcodigoTallaProducto, this.gridBagConstraintsTallaProducto);



	if(iXPanelCamposTallaProducto % 1==0) {
		iXPanelCamposTallaProducto=0;
		iYPanelCamposTallaProducto++;
	}
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaProducto.gridy = iYPanelCamposTallaProducto;
	this.gridBagConstraintsTallaProducto.gridx = iXPanelCamposTallaProducto++;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaProducto.add(this.jPanelnombreTallaProducto, this.gridBagConstraintsTallaProducto);



	if(iXPanelCamposTallaProducto % 1==0) {
		iXPanelCamposTallaProducto=0;
		iYPanelCamposTallaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaProducto.gridy = iYPanelCamposOcultosTallaProducto;
	this.gridBagConstraintsTallaProducto.gridx = iXPanelCamposOcultosTallaProducto++;
	this.gridBagConstraintsTallaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTallaProducto.add(this.jPanelid_empresaTallaProducto, this.gridBagConstraintsTallaProducto);



	if(iXPanelCamposOcultosTallaProducto % 1==0) {
		iXPanelCamposOcultosTallaProducto=0;
		iYPanelCamposOcultosTallaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTallaProducto= new GridBagLayout();
		this.jPanelAccionesTallaProducto.setLayout(gridaBagLayoutAccionesTallaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTallaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioTallaProducto.setLayout(gridaBagLayoutAccionesFormularioTallaProducto);
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTallaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTallaProducto.add(this.jComboBoxTiposAccionesFormularioTallaProducto, this.gridBagConstraintsTallaProducto);

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTallaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTallaProducto.add(this.jCheckBoxPostAccionNuevoTallaProducto, this.gridBagConstraintsTallaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTallaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTallaProducto.add(this.jCheckBoxPostAccionSinCerrarTallaProducto, this.gridBagConstraintsTallaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTallaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTallaProducto.add(this.jCheckBoxPostAccionSinMensajeTallaProducto, this.gridBagConstraintsTallaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTallaProducto.add(this.jButtonModificarTallaProducto, this.gridBagConstraintsTallaProducto);							

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTallaProducto.add(this.jButtonEliminarTallaProducto, this.gridBagConstraintsTallaProducto);
		
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = 0;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTallaProducto.add(this.jButtonActualizarTallaProducto, this.gridBagConstraintsTallaProducto);


		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = 0;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTallaProducto.add(this.jButtonGuardarCambiosTallaProducto, this.gridBagConstraintsTallaProducto);	
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = 0;		
		this.gridBagConstraintsTallaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTallaProducto.add(this.jButtonCancelarTallaProducto, this.gridBagConstraintsTallaProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTallaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTallaProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();						
			this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaProducto.gridx = 0;		
			//this.gridBagConstraintsTallaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTallaProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTallaProducto.gridx =0;
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTallaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTallaProducto, this.gridBagConstraintsTallaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTallaProducto = new TallaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Talla Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Talla Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Talla Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TallaProductoModel tallaproductoModel=new TallaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//TallaProductoModel.TallaProductoFocusTraversalPolicy tallaproductoFocusTraversalPolicy = tallaproductoModel.new TallaProductoFocusTraversalPolicy(this);
			
			//tallaproductoFocusTraversalPolicy.settallaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tallaproductoModel);
			
			
			this.jContentPaneDetalleTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTallaProducto = new GridBagLayout();	
			this.jContentPaneDetalleTallaProducto.setLayout(gridaBagLayoutDetalleTallaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTallaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTallaProducto.gridx = 0;
					
				
				this.jContentPaneDetalleTallaProducto.add(jTtoolBarDetalleTallaProducto, gridBagConstraintsTallaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionTallaProducto=   new JScrollPane(jContentPaneDetalleTallaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTallaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTallaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTallaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTallaProducto.gridx = 0;
	        
			this.jContentPaneDetalleTallaProducto.add(jPanelCamposTallaProducto, gridBagConstraintsTallaProducto);
			
			
			
			
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
						&& tallaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTallaProducto= new GridBagConstraints();
						this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTallaProducto.gridx = 0;
						this.jContentPaneDetalleTallaProducto.add(this.jTabbedPaneRelacionesTallaProducto, this.gridBagConstraintsTallaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTallaProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTallaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTallaProducto = new GridBagConstraints();
					this.gridBagConstraintsTallaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTallaProducto.gridx = 0;
					
				
					this.jContentPaneDetalleTallaProducto.add(jPanelCamposOcultosTallaProducto, gridBagConstraintsTallaProducto);
				
					this.jPanelCamposOcultosTallaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTallaProducto.gridx = 0;
	        this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTallaProducto.add(this.jPanelAccionesFormularioTallaProducto, this.gridBagConstraintsTallaProducto);							
			
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
	        this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTallaProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleTallaProducto.add(this.jPanelAccionesTallaProducto, this.gridBagConstraintsTallaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTallaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTallaProducto=   new JScrollPane(this.jPanelCamposTallaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTallaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTallaProducto.gridx = 0;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTallaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTallaProducto, this.gridBagConstraintsTallaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTallaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTallaProducto, this.gridBagConstraintsTallaProducto);			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTallaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTallaProducto, this.gridBagConstraintsTallaProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTallaProducto, this.gridBagConstraintsTallaProducto);
			
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTallaProducto, this.gridBagConstraintsTallaProducto);
		
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTallaProducto, this.gridBagConstraintsTallaProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTallaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionTallaProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				//this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTallaProducto.gridx = 0;
				//this.jContentPaneDetalleTallaProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTallaProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTallaProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTallaProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTallaProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				//this.gridBagConstraintsTallaProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTallaProducto.gridx = 0;
				//this.jContentPaneDetalleTallaProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTallaProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTallaProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTallaProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesTallaProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<TallaProducto> tallaproductos,TallaProducto tallaproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.tallaproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.settallaproductosForeignKey(tallaproductos);
					productoBeanSwingJInternalFrame.settallaproductoForeignKey(tallaproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionTallaProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidTallaProductoActual(tallaproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTallaProducto(true);
					productoBeanSwingJInternalFrame.setid_talla_productoFK_IdTallaProducto(tallaproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameTallaProductoForeignKey(tallaproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTallaProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTallaProducto");
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

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TallaProducto> tallaproductos,TallaProducto tallaproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tallaproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settallaproductosForeignKey(tallaproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.settallaproductoForeignKey(tallaproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTallaProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTallaProductoActual(tallaproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTallaProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_talla_productoFK_IdTallaProducto(tallaproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTallaProductoForeignKey(tallaproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTallaProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTallaProducto");
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
