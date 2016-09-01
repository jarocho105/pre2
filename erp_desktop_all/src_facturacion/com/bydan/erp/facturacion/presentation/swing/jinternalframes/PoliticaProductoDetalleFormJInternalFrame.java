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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PoliticaProductoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PoliticaProductoDetalleFormJInternalFrame extends PoliticaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePoliticaProducto;
	
	protected JMenuBar jmenuBarDetallePoliticaProducto;
	
	protected JMenu jmenuDetallePoliticaProducto;
	protected JMenu jmenuDetalleArchivoPoliticaProducto;
	protected JMenu jmenuDetalleAccionesPoliticaProducto;
	protected JMenu jmenuDetalleDatosPoliticaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaProducto;	
	protected GridBagConstraints gridBagConstraintsPoliticaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PoliticaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetallePoliticaProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PoliticaProductoSessionBean politicaproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public PoliticaProductoLogic politicaproductoLogic;
	
	public JScrollPane jScrollPanelDatosPoliticaProducto;
	public JScrollPane jScrollPanelDatosEdicionPoliticaProducto;
	public JScrollPane jScrollPanelDatosGeneralPoliticaProducto;
	
	protected JPanel jPanelCamposPoliticaProducto;    
	protected JPanel jPanelCamposOcultosPoliticaProducto;    	
	protected JPanel jPanelAccionesPoliticaProducto;
	protected JPanel jPanelAccionesFormularioPoliticaProducto;
    
	
	
	protected Integer iXPanelCamposPoliticaProducto=0;
	protected Integer iYPanelCamposPoliticaProducto=0;
	
	protected Integer iXPanelCamposOcultosPoliticaProducto=0;
	protected Integer iYPanelCamposOcultosPoliticaProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPoliticaProducto;
	public JButton jButtonModificarPoliticaProducto;
	public JButton jButtonActualizarPoliticaProducto;
    public JButton jButtonEliminarPoliticaProducto;
	public JButton jButtonCancelarPoliticaProducto;
    public JButton jButtonGuardarCambiosPoliticaProducto;
	public JButton jButtonGuardarCambiosTablaPoliticaProducto;
	protected JButton jButtonCerrarPoliticaProducto;
	
	
	protected JButton jButtonProcesarInformacionPoliticaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPoliticaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPoliticaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePoliticaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaProducto;
	protected JButton jButtonModificarToolBarPoliticaProducto;
	protected JButton jButtonActualizarToolBarPoliticaProducto;
    protected JButton jButtonEliminarToolBarPoliticaProducto;
	protected JButton jButtonCancelarToolBarPoliticaProducto;
    protected JButton jButtonGuardarCambiosToolBarPoliticaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarPoliticaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaProducto;
	protected JButton jButtonCerrarToolBarPoliticaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarPoliticaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaProducto;
	protected JMenuItem jMenuItemModificarPoliticaProducto;
	protected JMenuItem jMenuItemActualizarPoliticaProducto;
    protected JMenuItem jMenuItemEliminarPoliticaProducto;
	protected JMenuItem jMenuItemCancelarPoliticaProducto;
    protected JMenuItem jMenuItemGuardarCambiosPoliticaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaProducto;
	protected JMenuItem jMenuItemCerrarPoliticaProducto;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionPoliticaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaProducto;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPoliticaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPoliticaProducto;
	public JLabel jLabelIdPoliticaProducto;
	public JLabel jLabelidPoliticaProducto;
	public JButton jButtonidPoliticaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPoliticaProducto;
	public JLabel jLabelid_empresaPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPoliticaProducto;
	public JButton jButtonid_empresaPoliticaProducto= new JButtonMe();
	public JButton jButtonid_empresaPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPoliticaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPoliticaProducto;
	public JLabel jLabelid_sucursalPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPoliticaProducto;
	public JButton jButtonid_sucursalPoliticaProducto= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaPoliticaProducto;
	public JLabel jLabelid_bodegaPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaPoliticaProducto;
	public JButton jButtonid_bodegaPoliticaProducto= new JButtonMe();
	public JButton jButtonid_bodegaPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaPoliticaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPoliticaProducto;
	public JLabel jLabelid_productoPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPoliticaProducto;
	public JButton jButtonid_productoPoliticaProducto= new JButtonMe();
	public JButton jButtonid_productoPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoPoliticaProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPoliticaProducto;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PoliticaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPoliticaProducto=new JPanel();
				this.jPanelAccionesFormularioPoliticaProducto=new JPanel();
				this.jmenuBarDetallePoliticaProducto=new JMenuBar();
				this.jTtoolBarDetallePoliticaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PoliticaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPoliticaProducto() {
		return this.jButtonActualizarToolBarPoliticaProducto;
	}
	
	public JButton getjButtonEliminarToolBarPoliticaProducto() {
		return this.jButtonEliminarToolBarPoliticaProducto;
	}
	
	public JButton getjButtonCancelarToolBarPoliticaProducto() {
		return this.jButtonCancelarToolBarPoliticaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionPoliticaProducto() {
		return this.jButtonProcesarInformacionPoliticaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaProducto)	{
		this.jButtonProcesarInformacionPoliticaProducto = jButtonProcesarInformacionPoliticaProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaProducto() {
		return this.jComboBoxTiposAccionesPoliticaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaProducto(
			JComboBox jComboBoxTiposRelacionesPoliticaProducto) {
		this.jComboBoxTiposRelacionesPoliticaProducto = jComboBoxTiposRelacionesPoliticaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaProducto(
			JComboBox jComboBoxTiposAccionesPoliticaProducto) {
		this.jComboBoxTiposAccionesPoliticaProducto = jComboBoxTiposAccionesPoliticaProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPoliticaProducto() {
		return this.jComboBoxTiposAccionesFormularioPoliticaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPoliticaProducto(
			JComboBox jComboBoxTiposAccionesFormularioPoliticaProducto) {
		this.jComboBoxTiposAccionesFormularioPoliticaProducto = jComboBoxTiposAccionesFormularioPoliticaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		
		this.politicaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		PoliticaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePoliticaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPoliticaProducto=new JButtonMe();
				this.jButtonModificarToolBarPoliticaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto,
							"actualizar","actualizar","Actualizar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto,
							"eliminar","eliminar","Eliminar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto,
							"cancelar","cancelar","Cancelar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePoliticaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePoliticaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPoliticaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPoliticaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPoliticaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPoliticaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPoliticaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPoliticaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPoliticaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPoliticaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPoliticaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPoliticaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPoliticaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPoliticaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPoliticaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPoliticaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPoliticaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPoliticaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPoliticaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPoliticaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPoliticaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPoliticaProducto.add(this.jMenuItemDetalleCerrarPoliticaProducto);
		
		this.jmenuDetalleAccionesPoliticaProducto.add(this.jMenuItemActualizarPoliticaProducto);
		this.jmenuDetalleAccionesPoliticaProducto.add(this.jMenuItemEliminarPoliticaProducto);
		this.jmenuDetalleAccionesPoliticaProducto.add(this.jMenuItemCancelarPoliticaProducto);		
		
		//this.jmenuDetalleDatosPoliticaProducto.add(this.jMenuItemDetalleAbrirOrderByPoliticaProducto);				
		this.jmenuDetalleDatosPoliticaProducto.add(this.jMenuItemDetalleMostarOcultarPoliticaProducto);				
				
		//this.jmenuDetalleAccionesPoliticaProducto.add(this.jMenuItemGuardarCambiosPoliticaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePoliticaProducto.add(this.jmenuDetalleArchivoPoliticaProducto);		
		this.jmenuBarDetallePoliticaProducto.add(this.jmenuDetalleAccionesPoliticaProducto);		
		this.jmenuBarDetallePoliticaProducto.add(this.jmenuDetalleDatosPoliticaProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePoliticaProducto);				
	}
	
	
	public void inicializarElementosCamposPoliticaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPoliticaProducto = new JLabelMe();
		jLabelIdPoliticaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPoliticaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPoliticaProducto.setToolTipText(PoliticaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPoliticaProducto= new GridBagLayout();

		this.jPanelidPoliticaProducto.setLayout(this.gridaBagLayoutPoliticaProducto);

		jLabelidPoliticaProducto = new JLabel();
		jLabelidPoliticaProducto.setText("Id");

		jLabelidPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysPoliticaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPoliticaProducto = new JLabelMe();
		this.jLabelid_empresaPoliticaProducto.setText(""+PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPoliticaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPoliticaProducto.setToolTipText(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPoliticaProducto = new GridBagLayout();
		this.jPanelid_empresaPoliticaProducto.setLayout(this.gridaBagLayoutPoliticaProducto);


		jComboBoxid_empresaPoliticaProducto= new JComboBoxMe();
		jComboBoxid_empresaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPoliticaProducto.setEnabled(false);

		this.jButtonid_empresaPoliticaProducto= new JButtonMe();
		this.jButtonid_empresaPoliticaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaProducto.setText("Buscar");
		this.jButtonid_empresaPoliticaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPoliticaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaProducto"));

		this.jButtonid_empresaPoliticaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaPoliticaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaProductoBusqueda.setText("U");
		this.jButtonid_empresaPoliticaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPoliticaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaProductoBusqueda"));

		if(this.politicaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPoliticaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPoliticaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaPoliticaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaProductoUpdate.setText("U");
		this.jButtonid_empresaPoliticaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPoliticaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaProductoUpdate"));



					
		this.jLabelid_sucursalPoliticaProducto = new JLabelMe();
		this.jLabelid_sucursalPoliticaProducto.setText(""+PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPoliticaProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPoliticaProducto.setToolTipText(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPoliticaProducto = new GridBagLayout();
		this.jPanelid_sucursalPoliticaProducto.setLayout(this.gridaBagLayoutPoliticaProducto);


		jComboBoxid_sucursalPoliticaProducto= new JComboBoxMe();
		jComboBoxid_sucursalPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPoliticaProducto.setEnabled(false);

		this.jButtonid_sucursalPoliticaProducto= new JButtonMe();
		this.jButtonid_sucursalPoliticaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaProducto.setText("Buscar");
		this.jButtonid_sucursalPoliticaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPoliticaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaProducto"));

		this.jButtonid_sucursalPoliticaProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPoliticaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaProductoBusqueda.setText("U");
		this.jButtonid_sucursalPoliticaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPoliticaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaProductoBusqueda"));

		if(this.politicaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPoliticaProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPoliticaProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalPoliticaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaProductoUpdate.setText("U");
		this.jButtonid_sucursalPoliticaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPoliticaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaProductoUpdate"));



					
		this.jLabelid_bodegaPoliticaProducto = new JLabelMe();
		this.jLabelid_bodegaPoliticaProducto.setText(""+PoliticaProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaPoliticaProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaPoliticaProducto.setToolTipText(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutPoliticaProducto = new GridBagLayout();
		this.jPanelid_bodegaPoliticaProducto.setLayout(this.gridaBagLayoutPoliticaProducto);


		jComboBoxid_bodegaPoliticaProducto= new JComboBoxMe();
		jComboBoxid_bodegaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaPoliticaProducto= new JButtonMe();
		this.jButtonid_bodegaPoliticaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPoliticaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPoliticaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPoliticaProducto.setText("Buscar");
		this.jButtonid_bodegaPoliticaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaPoliticaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPoliticaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPoliticaProducto"));

		this.jButtonid_bodegaPoliticaProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaPoliticaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPoliticaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPoliticaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPoliticaProductoBusqueda.setText("U");
		this.jButtonid_bodegaPoliticaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaPoliticaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPoliticaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPoliticaProductoBusqueda"));

		if(this.politicaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaPoliticaProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaPoliticaProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaPoliticaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPoliticaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPoliticaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPoliticaProductoUpdate.setText("U");
		this.jButtonid_bodegaPoliticaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaPoliticaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPoliticaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPoliticaProductoUpdate"));



					
		this.jLabelid_productoPoliticaProducto = new JLabelMe();
		this.jLabelid_productoPoliticaProducto.setText(""+PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPoliticaProducto.setToolTipText("Producto");
		this.jLabelid_productoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPoliticaProducto.setToolTipText(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPoliticaProducto = new GridBagLayout();
		this.jPanelid_productoPoliticaProducto.setLayout(this.gridaBagLayoutPoliticaProducto);


		jComboBoxid_productoPoliticaProducto= new JComboBoxMe();
		jComboBoxid_productoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPoliticaProducto= new JButtonMe();
		this.jButtonid_productoPoliticaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaProducto.setText("Buscar");
		this.jButtonid_productoPoliticaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPoliticaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaProducto"));

		this.jButtonid_productoPoliticaProductoBusqueda= new JButtonMe();
		this.jButtonid_productoPoliticaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPoliticaProductoBusqueda.setText("U");
		this.jButtonid_productoPoliticaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPoliticaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaProductoBusqueda"));

		if(this.politicaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPoliticaProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoPoliticaProductoUpdate= new JButtonMe();
		this.jButtonid_productoPoliticaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPoliticaProductoUpdate.setText("U");
		this.jButtonid_productoPoliticaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPoliticaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaProductoUpdate"));



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
		//this.jInternalFrameDetallePoliticaProducto = new PoliticaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Politica Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaProducto= new GridBagLayout();
		

		
		String sToolTipPoliticaProducto="";
		sToolTipPoliticaProducto=PoliticaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaProducto+="(Facturacion.PoliticaProducto)";
		}
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPoliticaProducto = new JButtonMe();
		this.jButtonModificarPoliticaProducto = new JButtonMe();
        this.jButtonActualizarPoliticaProducto = new JButtonMe();
        this.jButtonEliminarPoliticaProducto = new JButtonMe();
        this.jButtonCancelarPoliticaProducto = new JButtonMe();
        this.jButtonGuardarCambiosPoliticaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPoliticaProducto = new JButtonMe();
		this.jButtonCerrarPoliticaProducto = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPoliticaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralPoliticaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Producto";
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPoliticaProducto.setName("jPanelCamposPoliticaProducto"); 

		this.jPanelCamposOcultosPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPoliticaProducto.setName("jPanelCamposOcultosPoliticaProducto"); 

        this.jPanelAccionesPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaProducto.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPoliticaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPoliticaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPoliticaProducto.setText("Nuevo");
		this.jButtonModificarPoliticaProducto.setText("Editar");
        this.jButtonActualizarPoliticaProducto.setText("Actualizar");
        this.jButtonEliminarPoliticaProducto.setText("Eliminar");
        this.jButtonCancelarPoliticaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosPoliticaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPoliticaProducto.setText("Guardar");
		this.jButtonCerrarPoliticaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaProducto,"nuevo_button","Nuevo",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPoliticaProducto,"modificar_button","Editar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPoliticaProducto,"actualizar_button","Actualizar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPoliticaProducto,"eliminar_button","Eliminar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPoliticaProducto,"cancelar_button","Cancelar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPoliticaProducto,"guardarcambios_button","Guardar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaProducto,"guardarcambiostabla_button","Guardar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaProducto,"cerrar_button","Salir",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPoliticaProducto.setToolTipText("Nuevo"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPoliticaProducto.setToolTipText("Editar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPoliticaProducto.setToolTipText("Actualizar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPoliticaProducto.setToolTipText("Eliminar)"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPoliticaProducto.setToolTipText("Cancelar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPoliticaProducto.setToolTipText("Guardar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPoliticaProducto.setToolTipText("Guardar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaProducto.setToolTipText("Salir"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaProducto";
		inputMap = this.jButtonNuevoPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPoliticaProducto";
		inputMap = this.jButtonActualizarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPoliticaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarPoliticaProducto";
		inputMap = this.jButtonEliminarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPoliticaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarPoliticaProducto";
		inputMap = this.jButtonCancelarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPoliticaProducto"));
		
		//CERRAR		
		sMapKey = "CerrarPoliticaProducto";
		inputMap = this.jButtonCerrarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaProducto";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPoliticaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPoliticaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPoliticaProducto.setToolTipText("Nuevo PoliticaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPoliticaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPoliticaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPoliticaProducto.setToolTipText("Sin Cerrar Ventana PoliticaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePoliticaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePoliticaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePoliticaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaProducto.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPoliticaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPoliticaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPoliticaProducto = new JLabelMe();
		
		this.jLabelAccionesPoliticaProducto.setText("Acciones");		
		this.jLabelAccionesPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPoliticaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPoliticaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPoliticaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPoliticaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPoliticaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPoliticaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPoliticaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPoliticaProducto = new GridBagLayout();
		
		this.jPanelCamposPoliticaProducto.setLayout(gridaBagLayoutCamposPoliticaProducto);
		this.jPanelCamposOcultosPoliticaProducto.setLayout(gridaBagLayoutCamposOcultosPoliticaProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 0;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPoliticaProducto.add(jLabelIdPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 1;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPoliticaProducto.add(jLabelidPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 0;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPoliticaProducto.add(jLabelid_empresaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 2;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaProducto.add(jButtonid_empresaPoliticaProductoBusqueda, this.gridBagConstraintsPoliticaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 3;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaProducto.add(jButtonid_empresaPoliticaProductoUpdate, this.gridBagConstraintsPoliticaProducto);
	}

	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 1;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPoliticaProducto.add(jComboBoxid_empresaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 0;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPoliticaProducto.add(jLabelid_sucursalPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 2;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaProducto.add(jButtonid_sucursalPoliticaProductoBusqueda, this.gridBagConstraintsPoliticaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 3;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaProducto.add(jButtonid_sucursalPoliticaProductoUpdate, this.gridBagConstraintsPoliticaProducto);
	}

	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 1;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPoliticaProducto.add(jComboBoxid_sucursalPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 0;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaPoliticaProducto.add(jLabelid_bodegaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 2;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPoliticaProducto.add(jButtonid_bodegaPoliticaProductoBusqueda, this.gridBagConstraintsPoliticaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 3;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPoliticaProducto.add(jButtonid_bodegaPoliticaProductoUpdate, this.gridBagConstraintsPoliticaProducto);
	}

	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 1;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaPoliticaProducto.add(jComboBoxid_bodegaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 0;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPoliticaProducto.add(jLabelid_productoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 2;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPoliticaProducto.add(jButtonid_productoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 3;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPoliticaProducto.add(jButtonid_productoPoliticaProductoBusqueda, this.gridBagConstraintsPoliticaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 4;
		this.gridBagConstraintsPoliticaProducto.ipadx = 0;
		this.gridBagConstraintsPoliticaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPoliticaProducto.add(jButtonid_productoPoliticaProductoUpdate, this.gridBagConstraintsPoliticaProducto);
	}

	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaProducto.gridy = 0;
	this.gridBagConstraintsPoliticaProducto.gridx = 1;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPoliticaProducto.add(jComboBoxid_productoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaProducto.gridy = iYPanelCamposPoliticaProducto;
	this.gridBagConstraintsPoliticaProducto.gridx = iXPanelCamposPoliticaProducto++;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaProducto.add(this.jPanelidPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(iXPanelCamposPoliticaProducto % 1==0) {
		iXPanelCamposPoliticaProducto=0;
		iYPanelCamposPoliticaProducto++;
	}
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaProducto.gridy = iYPanelCamposPoliticaProducto;
	this.gridBagConstraintsPoliticaProducto.gridx = iXPanelCamposPoliticaProducto++;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaProducto.add(this.jPanelid_bodegaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(iXPanelCamposPoliticaProducto % 1==0) {
		iXPanelCamposPoliticaProducto=0;
		iYPanelCamposPoliticaProducto++;
	}
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaProducto.gridy = iYPanelCamposPoliticaProducto;
	this.gridBagConstraintsPoliticaProducto.gridx = iXPanelCamposPoliticaProducto++;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaProducto.add(this.jPanelid_productoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(iXPanelCamposPoliticaProducto % 1==0) {
		iXPanelCamposPoliticaProducto=0;
		iYPanelCamposPoliticaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaProducto.gridy = iYPanelCamposOcultosPoliticaProducto;
	this.gridBagConstraintsPoliticaProducto.gridx = iXPanelCamposOcultosPoliticaProducto++;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaProducto.add(this.jPanelid_empresaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(iXPanelCamposOcultosPoliticaProducto % 1==0) {
		iXPanelCamposOcultosPoliticaProducto=0;
		iYPanelCamposOcultosPoliticaProducto++;
	}
	this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaProducto.gridy = iYPanelCamposOcultosPoliticaProducto;
	this.gridBagConstraintsPoliticaProducto.gridx = iXPanelCamposOcultosPoliticaProducto++;
	this.gridBagConstraintsPoliticaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaProducto.add(this.jPanelid_sucursalPoliticaProducto, this.gridBagConstraintsPoliticaProducto);



	if(iXPanelCamposOcultosPoliticaProducto % 1==0) {
		iXPanelCamposOcultosPoliticaProducto=0;
		iYPanelCamposOcultosPoliticaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPoliticaProducto= new GridBagLayout();
		this.jPanelAccionesPoliticaProducto.setLayout(gridaBagLayoutAccionesPoliticaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPoliticaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioPoliticaProducto.setLayout(gridaBagLayoutAccionesFormularioPoliticaProducto);
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaProducto.add(this.jComboBoxTiposAccionesFormularioPoliticaProducto, this.gridBagConstraintsPoliticaProducto);

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaProducto.add(this.jCheckBoxPostAccionNuevoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaProducto.add(this.jCheckBoxPostAccionSinCerrarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaProducto.add(this.jCheckBoxPostAccionSinMensajePoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPoliticaProducto.add(this.jButtonModificarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);							

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPoliticaProducto.add(this.jButtonEliminarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = 0;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaProducto.add(this.jButtonActualizarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);


		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = 0;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaProducto.add(this.jButtonGuardarCambiosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);	
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = 0;		
		this.gridBagConstraintsPoliticaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPoliticaProducto.add(this.jButtonCancelarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaProducto.gridx = 0;		
			//this.gridBagConstraintsPoliticaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaProducto.gridx =0;
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePoliticaProducto = new PoliticaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Politica Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Politica Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PoliticaProductoModel politicaproductoModel=new PoliticaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//PoliticaProductoModel.PoliticaProductoFocusTraversalPolicy politicaproductoFocusTraversalPolicy = politicaproductoModel.new PoliticaProductoFocusTraversalPolicy(this);
			
			//politicaproductoFocusTraversalPolicy.setpoliticaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(politicaproductoModel);
			
			
			this.jContentPaneDetallePoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePoliticaProducto = new GridBagLayout();	
			this.jContentPaneDetallePoliticaProducto.setLayout(gridaBagLayoutDetallePoliticaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
				this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPoliticaProducto.gridx = 0;
					
				
				this.jContentPaneDetallePoliticaProducto.add(jTtoolBarDetallePoliticaProducto, gridBagConstraintsPoliticaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionPoliticaProducto=   new JScrollPane(jContentPaneDetallePoliticaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPoliticaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPoliticaProducto.gridx = 0;
	        
			this.jContentPaneDetallePoliticaProducto.add(jPanelCamposPoliticaProducto, gridBagConstraintsPoliticaProducto);
			
			
			
			
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
						&& politicaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPoliticaProducto= new GridBagConstraints();
						this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPoliticaProducto.gridx = 0;
						this.jContentPaneDetallePoliticaProducto.add(this.jTabbedPaneRelacionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPoliticaProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPoliticaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
					this.gridBagConstraintsPoliticaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPoliticaProducto.gridx = 0;
					
				
					this.jContentPaneDetallePoliticaProducto.add(jPanelCamposOcultosPoliticaProducto, gridBagConstraintsPoliticaProducto);
				
					this.jPanelCamposOcultosPoliticaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPoliticaProducto.gridx = 0;
	        this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePoliticaProducto.add(this.jPanelAccionesFormularioPoliticaProducto, this.gridBagConstraintsPoliticaProducto);							
			
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
	        this.gridBagConstraintsPoliticaProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPoliticaProducto.gridx = 0;
	        
			
			this.jContentPaneDetallePoliticaProducto.add(this.jPanelAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPoliticaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPoliticaProducto=   new JScrollPane(this.jPanelCamposPoliticaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaProducto.gridx = 0;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPoliticaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPoliticaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionPoliticaProducto;
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
