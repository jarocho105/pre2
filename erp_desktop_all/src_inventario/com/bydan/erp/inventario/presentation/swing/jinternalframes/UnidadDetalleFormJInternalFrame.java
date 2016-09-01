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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.UnidadConstantesFunciones;

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
public class UnidadDetalleFormJInternalFrame extends UnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUnidad;
	
	protected JMenuBar jmenuBarDetalleUnidad;
	
	protected JMenu jmenuDetalleUnidad;
	protected JMenu jmenuDetalleArchivoUnidad;
	protected JMenu jmenuDetalleAccionesUnidad;
	protected JMenu jmenuDetalleDatosUnidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUnidad;	
	protected GridBagConstraints gridBagConstraintsUnidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UnidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleUnidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoUnidadBeanSwingJInternalFrame tipounidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipounidad="";
	
	public UnidadSessionBean unidadSessionBean;
	
	

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame=null;
	public ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConversionInven=false;
	public ConversionInvenSessionBean conversioninvenSessionBean;

	public RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame=null;
	public RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRangoUnidadVenta=false;
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;

	public ValorPorUnidadBeanSwingJInternalFrame valorporunidadBeanSwingJInternalFrame=null;
	public ValorPorUnidadBeanSwingJInternalFrame valorporunidadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteValorPorUnidad=false;
	public ValorPorUnidadSessionBean valorporunidadSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoUnidadSessionBean tipounidadSessionBean;	
	
	public UnidadLogic unidadLogic;
	
	public JScrollPane jScrollPanelDatosUnidad;
	public JScrollPane jScrollPanelDatosEdicionUnidad;
	public JScrollPane jScrollPanelDatosGeneralUnidad;
	
	protected JPanel jPanelCamposUnidad;    
	protected JPanel jPanelCamposOcultosUnidad;    	
	protected JPanel jPanelAccionesUnidad;
	protected JPanel jPanelAccionesFormularioUnidad;
    
	
	
	protected Integer iXPanelCamposUnidad=0;
	protected Integer iYPanelCamposUnidad=0;
	
	protected Integer iXPanelCamposOcultosUnidad=0;
	protected Integer iYPanelCamposOcultosUnidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUnidad;
	public JButton jButtonModificarUnidad;
	public JButton jButtonActualizarUnidad;
    public JButton jButtonEliminarUnidad;
	public JButton jButtonCancelarUnidad;
    public JButton jButtonGuardarCambiosUnidad;
	public JButton jButtonGuardarCambiosTablaUnidad;
	protected JButton jButtonCerrarUnidad;
	
	
	protected JButton jButtonProcesarInformacionUnidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUnidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUnidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUnidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUnidad;
	protected JButton jButtonModificarToolBarUnidad;
	protected JButton jButtonActualizarToolBarUnidad;
    protected JButton jButtonEliminarToolBarUnidad;
	protected JButton jButtonCancelarToolBarUnidad;
    protected JButton jButtonGuardarCambiosToolBarUnidad;
	protected JButton jButtonGuardarCambiosTablaToolBarUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarUnidad;
	protected JButton jButtonCerrarToolBarUnidad;
	
	protected JButton jButtonProcesarInformacionToolBarUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUnidad;
	protected JMenuItem jMenuItemModificarUnidad;
	protected JMenuItem jMenuItemActualizarUnidad;
    protected JMenuItem jMenuItemEliminarUnidad;
	protected JMenuItem jMenuItemCancelarUnidad;
    protected JMenuItem jMenuItemGuardarCambiosUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaUnidad;
	protected JMenuItem jMenuItemCerrarUnidad;
	protected JMenuItem jMenuItemDetalleCerrarUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarUnidad;
	
	protected JMenuItem jMenuItemProcesarInformacionUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUnidad;
	protected JMenuItem jMenuItemMostrarOcultarUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUnidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUnidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUnidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUnidad;
	public JLabel jLabelIdUnidad;
	public JLabel jLabelidUnidad;
	public JButton jButtonidUnidadBusqueda= new JButtonMe();

	public JPanel jPanelnombreUnidad;
	public JLabel jLabelnombreUnidad;
	public JTextField jTextFieldnombreUnidad;
	public JButton jButtonnombreUnidadBusqueda= new JButtonMe();

	public JPanel jPanelsiglasUnidad;
	public JLabel jLabelsiglasUnidad;
	public JTextField jTextFieldsiglasUnidad;
	public JButton jButtonsiglasUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUnidad;
	public JLabel jLabelid_empresaUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUnidad;
	public JButton jButtonid_empresaUnidad= new JButtonMe();
	public JButton jButtonid_empresaUnidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_unidadUnidad;
	public JLabel jLabelid_tipo_unidadUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_unidadUnidad;
	public JButton jButtonid_tipo_unidadUnidad= new JButtonMe();
	public JButton jButtonid_tipo_unidadUnidadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_unidadUnidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUnidad;
	
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
	
	public UnidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUnidad=new JPanel();
				this.jPanelAccionesFormularioUnidad=new JPanel();
				this.jmenuBarDetalleUnidad=new JMenuBar();
				this.jTtoolBarDetalleUnidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UnidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUnidad() {
		return this.jButtonActualizarToolBarUnidad;
	}
	
	public JButton getjButtonEliminarToolBarUnidad() {
		return this.jButtonEliminarToolBarUnidad;
	}
	
	public JButton getjButtonCancelarToolBarUnidad() {
		return this.jButtonCancelarToolBarUnidad;
	}		
	
	public JButton getjButtonProcesarInformacionUnidad() {
		return this.jButtonProcesarInformacionUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUnidad)	{
		this.jButtonProcesarInformacionUnidad = jButtonProcesarInformacionUnidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUnidad() {
		return this.jComboBoxTiposAccionesUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUnidad(
			JComboBox jComboBoxTiposRelacionesUnidad) {
		this.jComboBoxTiposRelacionesUnidad = jComboBoxTiposRelacionesUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUnidad(
			JComboBox jComboBoxTiposAccionesUnidad) {
		this.jComboBoxTiposAccionesUnidad = jComboBoxTiposAccionesUnidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUnidad() {
		return this.jComboBoxTiposAccionesFormularioUnidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUnidad(
			JComboBox jComboBoxTiposAccionesFormularioUnidad) {
		this.jComboBoxTiposAccionesFormularioUnidad = jComboBoxTiposAccionesFormularioUnidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.unidadSessionBean=new UnidadSessionBean();
		
		this.unidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.unidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.unidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		//this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		//this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
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
	
		UnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUnidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUnidad=new JButtonMe();
				this.jButtonModificarToolBarUnidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUnidad,this.jTtoolBarDetalleUnidad,
							"actualizar","actualizar","Actualizar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUnidad,this.jTtoolBarDetalleUnidad,
							"eliminar","eliminar","Eliminar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUnidad,this.jTtoolBarDetalleUnidad,
							"cancelar","cancelar","Cancelar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUnidad,this.jTtoolBarDetalleUnidad,
							"guardarcambios","guardarcambios","Guardar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUnidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUnidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUnidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUnidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUnidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUnidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUnidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUnidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUnidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUnidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUnidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUnidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUnidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUnidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUnidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUnidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUnidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUnidad.add(this.jMenuItemDetalleCerrarUnidad);
		
		this.jmenuDetalleAccionesUnidad.add(this.jMenuItemActualizarUnidad);
		this.jmenuDetalleAccionesUnidad.add(this.jMenuItemEliminarUnidad);
		this.jmenuDetalleAccionesUnidad.add(this.jMenuItemCancelarUnidad);		
		
		//this.jmenuDetalleDatosUnidad.add(this.jMenuItemDetalleAbrirOrderByUnidad);				
		this.jmenuDetalleDatosUnidad.add(this.jMenuItemDetalleMostarOcultarUnidad);				
				
		//this.jmenuDetalleAccionesUnidad.add(this.jMenuItemGuardarCambiosUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUnidad.add(this.jmenuDetalleArchivoUnidad);		
		this.jmenuBarDetalleUnidad.add(this.jmenuDetalleAccionesUnidad);		
		this.jmenuBarDetalleUnidad.add(this.jmenuDetalleDatosUnidad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleUnidad.add(this.jmenuDetalleUnidad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUnidad);				
	}
	
	
	public void inicializarElementosCamposUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUnidad = new JLabelMe();
		jLabelIdUnidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUnidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUnidad.setToolTipText(UnidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUnidad= new GridBagLayout();

		this.jPanelidUnidad.setLayout(this.gridaBagLayoutUnidad);

		jLabelidUnidad = new JLabel();
		jLabelidUnidad.setText("Id");

		jLabelidUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreUnidad = new JLabelMe();
		this.jLabelnombreUnidad.setText(""+UnidadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreUnidad.setToolTipText("Nombre");
		this.jLabelnombreUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreUnidad.setToolTipText(UnidadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutUnidad = new GridBagLayout();
		this.jPanelnombreUnidad.setLayout(this.gridaBagLayoutUnidad);


		jTextFieldnombreUnidad= new JTextFieldMe();

		jTextFieldnombreUnidad.setEnabled(false);
		jTextFieldnombreUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreUnidadBusqueda= new JButtonMe();
		this.jButtonnombreUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreUnidadBusqueda.setText("U");
		this.jButtonnombreUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreUnidadBusqueda"));

		if(this.unidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreUnidadBusqueda.setVisible(false);		}


					
		this.jLabelsiglasUnidad = new JLabelMe();
		this.jLabelsiglasUnidad.setText(""+UnidadConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasUnidad.setToolTipText("Siglas");
		this.jLabelsiglasUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasUnidad.setToolTipText(UnidadConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutUnidad = new GridBagLayout();
		this.jPanelsiglasUnidad.setLayout(this.gridaBagLayoutUnidad);


		jTextFieldsiglasUnidad= new JTextFieldMe();

		jTextFieldsiglasUnidad.setEnabled(false);
		jTextFieldsiglasUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasUnidadBusqueda= new JButtonMe();
		this.jButtonsiglasUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasUnidadBusqueda.setText("U");
		this.jButtonsiglasUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasUnidadBusqueda"));

		if(this.unidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasUnidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUnidad = new JLabelMe();
		this.jLabelid_empresaUnidad.setText(""+UnidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUnidad.setToolTipText("Empresa");
		this.jLabelid_empresaUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUnidad.setToolTipText(UnidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUnidad = new GridBagLayout();
		this.jPanelid_empresaUnidad.setLayout(this.gridaBagLayoutUnidad);


		jComboBoxid_empresaUnidad= new JComboBoxMe();
		jComboBoxid_empresaUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUnidad.setEnabled(false);

		this.jButtonid_empresaUnidad= new JButtonMe();
		this.jButtonid_empresaUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUnidad.setText("Buscar");
		this.jButtonid_empresaUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUnidad"));

		this.jButtonid_empresaUnidadBusqueda= new JButtonMe();
		this.jButtonid_empresaUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUnidadBusqueda.setText("U");
		this.jButtonid_empresaUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUnidadBusqueda"));

		if(this.unidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUnidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaUnidadUpdate= new JButtonMe();
		this.jButtonid_empresaUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUnidadUpdate.setText("U");
		this.jButtonid_empresaUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUnidadUpdate"));



					
		this.jLabelid_tipo_unidadUnidad = new JLabelMe();
		this.jLabelid_tipo_unidadUnidad.setText(""+UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD+" : *");
		this.jLabelid_tipo_unidadUnidad.setToolTipText("Tipo Unidad");
		this.jLabelid_tipo_unidadUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_unidadUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_unidadUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_unidadUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_unidadUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_unidadUnidad.setToolTipText(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD);
		this.gridaBagLayoutUnidad = new GridBagLayout();
		this.jPanelid_tipo_unidadUnidad.setLayout(this.gridaBagLayoutUnidad);


		jComboBoxid_tipo_unidadUnidad= new JComboBoxMe();
		jComboBoxid_tipo_unidadUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_unidadUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_unidadUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_unidadUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_unidadUnidad= new JButtonMe();
		this.jButtonid_tipo_unidadUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_unidadUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_unidadUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_unidadUnidad.setText("Buscar");
		this.jButtonid_tipo_unidadUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_unidadUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_unidadUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_unidadUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_unidadUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_unidadUnidad"));

		this.jButtonid_tipo_unidadUnidadBusqueda= new JButtonMe();
		this.jButtonid_tipo_unidadUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_unidadUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_unidadUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_unidadUnidadBusqueda.setText("U");
		this.jButtonid_tipo_unidadUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_unidadUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_unidadUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_unidadUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_unidadUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_unidadUnidadBusqueda"));

		if(this.unidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_unidadUnidadBusqueda.setVisible(false);		}

		this.jButtonid_tipo_unidadUnidadUpdate= new JButtonMe();
		this.jButtonid_tipo_unidadUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_unidadUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_unidadUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_unidadUnidadUpdate.setText("U");
		this.jButtonid_tipo_unidadUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_unidadUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_unidadUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_unidadUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_unidadUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_unidadUnidadUpdate"));



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
		//this.jInternalFrameDetalleUnidad = new UnidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Unidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUnidad= new GridBagLayout();
		

		
		String sToolTipUnidad="";
		sToolTipUnidad=UnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUnidad+="(Inventario.Unidad)";
		}
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipUnidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUnidad = new JButtonMe();
		this.jButtonModificarUnidad = new JButtonMe();
        this.jButtonActualizarUnidad = new JButtonMe();
        this.jButtonEliminarUnidad = new JButtonMe();
        this.jButtonCancelarUnidad = new JButtonMe();
        this.jButtonGuardarCambiosUnidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaUnidad = new JButtonMe();
		this.jButtonCerrarUnidad = new JButtonMe();
		
		this.jScrollPanelDatosUnidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionUnidad = new JScrollPane();
		this.jScrollPanelDatosGeneralUnidad = new JScrollPane();
				
		
		
		this.jPanelCamposUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Unidad";
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUnidad.setName("jPanelCamposUnidad"); 

		this.jPanelCamposOcultosUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUnidad.setName("jPanelCamposOcultosUnidad"); 

        this.jPanelAccionesUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUnidad.setToolTipText("Acciones");
        this.jPanelAccionesUnidad.setName("Acciones"); 

		this.jPanelAccionesFormularioUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUnidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUnidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUnidad.setText("Nuevo");
		this.jButtonModificarUnidad.setText("Editar");
        this.jButtonActualizarUnidad.setText("Actualizar");
        this.jButtonEliminarUnidad.setText("Eliminar");
        this.jButtonCancelarUnidad.setText("Cancelar");
        this.jButtonGuardarCambiosUnidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaUnidad.setText("Guardar");
		this.jButtonCerrarUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUnidad,"nuevo_button","Nuevo",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUnidad,"modificar_button","Editar",this.unidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUnidad,"actualizar_button","Actualizar",this.unidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUnidad,"eliminar_button","Eliminar",this.unidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUnidad,"cancelar_button","Cancelar",this.unidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUnidad,"guardarcambios_button","Guardar",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUnidad,"guardarcambiostabla_button","Guardar",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUnidad,"cerrar_button","Salir",this.unidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUnidad.setToolTipText("Nuevo"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUnidad.setToolTipText("Editar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUnidad.setToolTipText("Actualizar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUnidad.setToolTipText("Eliminar)"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUnidad.setToolTipText("Cancelar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUnidad.setToolTipText("Guardar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUnidad.setToolTipText("Guardar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUnidad.setToolTipText("Salir"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUnidad";
		inputMap = this.jButtonNuevoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUnidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUnidad";
		inputMap = this.jButtonActualizarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUnidad"));
		
		//ELIMINAR
		sMapKey = "EliminarUnidad";
		inputMap = this.jButtonEliminarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUnidad"));
		
		//CANCELAR	
		sMapKey = "CancelarUnidad";
		inputMap = this.jButtonCancelarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUnidad"));
		
		//CERRAR		
		sMapKey = "CerrarUnidad";
		inputMap = this.jButtonCerrarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUnidad";
		inputMap = this.jButtonGuardarCambiosTablaUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUnidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUnidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUnidad.setToolTipText("Nuevo Unidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUnidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUnidad.setToolTipText("Sin Cerrar Ventana Unidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUnidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUnidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUnidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUnidad.setText("Accion");
		this.jComboBoxTiposAccionesUnidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUnidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUnidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUnidad = new JLabelMe();
		
		this.jLabelAccionesUnidad.setText("Acciones");		
		this.jLabelAccionesUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUnidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUnidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUnidad=new JTabbedPane();
		this.jTabbedPaneRelacionesUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUnidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUnidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUnidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUnidad = new GridBagLayout();
		
		this.jPanelCamposUnidad.setLayout(gridaBagLayoutCamposUnidad);
		this.jPanelCamposOcultosUnidad.setLayout(gridaBagLayoutCamposOcultosUnidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 0;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUnidad.add(jLabelIdUnidad, this.gridBagConstraintsUnidad);



	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 1;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUnidad.add(jLabelidUnidad, this.gridBagConstraintsUnidad);


	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 0;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUnidad.add(jLabelid_empresaUnidad, this.gridBagConstraintsUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 2;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUnidad.add(jButtonid_empresaUnidadBusqueda, this.gridBagConstraintsUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 3;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUnidad.add(jButtonid_empresaUnidadUpdate, this.gridBagConstraintsUnidad);
	}

	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 1;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUnidad.add(jComboBoxid_empresaUnidad, this.gridBagConstraintsUnidad);


	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 0;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_unidadUnidad.add(jLabelid_tipo_unidadUnidad, this.gridBagConstraintsUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 2;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_unidadUnidad.add(jButtonid_tipo_unidadUnidadBusqueda, this.gridBagConstraintsUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 3;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_unidadUnidad.add(jButtonid_tipo_unidadUnidadUpdate, this.gridBagConstraintsUnidad);
	}

	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 1;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_unidadUnidad.add(jComboBoxid_tipo_unidadUnidad, this.gridBagConstraintsUnidad);


	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 0;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreUnidad.add(jLabelnombreUnidad, this.gridBagConstraintsUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 2;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreUnidad.add(jButtonnombreUnidadBusqueda, this.gridBagConstraintsUnidad);
	}

	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 1;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreUnidad.add(jTextFieldnombreUnidad, this.gridBagConstraintsUnidad);


	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 0;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasUnidad.add(jLabelsiglasUnidad, this.gridBagConstraintsUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 2;
		this.gridBagConstraintsUnidad.ipadx = 0;
		this.gridBagConstraintsUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasUnidad.add(jButtonsiglasUnidadBusqueda, this.gridBagConstraintsUnidad);
	}

	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUnidad.gridy = 0;
	this.gridBagConstraintsUnidad.gridx = 1;
	this.gridBagConstraintsUnidad.ipadx = 0;
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasUnidad.add(jTextFieldsiglasUnidad, this.gridBagConstraintsUnidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUnidad.gridy = iYPanelCamposUnidad;
	this.gridBagConstraintsUnidad.gridx = iXPanelCamposUnidad++;
	this.gridBagConstraintsUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUnidad.add(this.jPanelidUnidad, this.gridBagConstraintsUnidad);



	if(iXPanelCamposUnidad % 1==0) {
		iXPanelCamposUnidad=0;
		iYPanelCamposUnidad++;
	}
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUnidad.gridy = iYPanelCamposUnidad;
	this.gridBagConstraintsUnidad.gridx = iXPanelCamposUnidad++;
	this.gridBagConstraintsUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUnidad.add(this.jPanelid_tipo_unidadUnidad, this.gridBagConstraintsUnidad);



	if(iXPanelCamposUnidad % 1==0) {
		iXPanelCamposUnidad=0;
		iYPanelCamposUnidad++;
	}
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUnidad.gridy = iYPanelCamposUnidad;
	this.gridBagConstraintsUnidad.gridx = iXPanelCamposUnidad++;
	this.gridBagConstraintsUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUnidad.add(this.jPanelnombreUnidad, this.gridBagConstraintsUnidad);



	if(iXPanelCamposUnidad % 1==0) {
		iXPanelCamposUnidad=0;
		iYPanelCamposUnidad++;
	}
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUnidad.gridy = iYPanelCamposUnidad;
	this.gridBagConstraintsUnidad.gridx = iXPanelCamposUnidad++;
	this.gridBagConstraintsUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUnidad.add(this.jPanelsiglasUnidad, this.gridBagConstraintsUnidad);



	if(iXPanelCamposUnidad % 1==0) {
		iXPanelCamposUnidad=0;
		iYPanelCamposUnidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUnidad = new GridBagConstraints();
	this.gridBagConstraintsUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUnidad.gridy = iYPanelCamposOcultosUnidad;
	this.gridBagConstraintsUnidad.gridx = iXPanelCamposOcultosUnidad++;
	this.gridBagConstraintsUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUnidad.add(this.jPanelid_empresaUnidad, this.gridBagConstraintsUnidad);



	if(iXPanelCamposOcultosUnidad % 1==0) {
		iXPanelCamposOcultosUnidad=0;
		iYPanelCamposOcultosUnidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesUnidad= new GridBagLayout();
		this.jPanelAccionesUnidad.setLayout(gridaBagLayoutAccionesUnidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUnidad= new GridBagLayout();
		this.jPanelAccionesFormularioUnidad.setLayout(gridaBagLayoutAccionesFormularioUnidad);
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUnidad.add(this.jComboBoxTiposAccionesFormularioUnidad, this.gridBagConstraintsUnidad);

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUnidad.add(this.jCheckBoxPostAccionNuevoUnidad, this.gridBagConstraintsUnidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.unidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUnidad.add(this.jCheckBoxPostAccionSinCerrarUnidad, this.gridBagConstraintsUnidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.unidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUnidad.add(this.jCheckBoxPostAccionSinMensajeUnidad, this.gridBagConstraintsUnidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesUnidad.add(this.jButtonModificarUnidad, this.gridBagConstraintsUnidad);							

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesUnidad.add(this.jButtonEliminarUnidad, this.gridBagConstraintsUnidad);
		
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = 0;		
		this.gridBagConstraintsUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesUnidad.add(this.jButtonActualizarUnidad, this.gridBagConstraintsUnidad);


		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = 0;		
		this.gridBagConstraintsUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesUnidad.add(this.jButtonGuardarCambiosUnidad, this.gridBagConstraintsUnidad);	
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = 0;		
		this.gridBagConstraintsUnidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesUnidad.add(this.jButtonCancelarUnidad, this.gridBagConstraintsUnidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUnidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.unidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUnidad = new GridBagConstraints();						
			this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUnidad.gridx = 0;		
			//this.gridBagConstraintsUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUnidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUnidad.gridx =0;
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUnidad, this.gridBagConstraintsUnidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UnidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUnidad = new UnidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Unidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Unidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Unidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UnidadModel unidadModel=new UnidadModel(this);
			
			//SI USARA CLASE INTERNA
			//UnidadModel.UnidadFocusTraversalPolicy unidadFocusTraversalPolicy = unidadModel.new UnidadFocusTraversalPolicy(this);
			
			//unidadFocusTraversalPolicy.setunidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(unidadModel);
			
			
			this.jContentPaneDetalleUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUnidad = new GridBagLayout();	
			this.jContentPaneDetalleUnidad.setLayout(gridaBagLayoutDetalleUnidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUnidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUnidad = new GridBagConstraints();
				this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUnidad.gridx = 0;
					
				
				this.jContentPaneDetalleUnidad.add(jTtoolBarDetalleUnidad, gridBagConstraintsUnidad);								
				
}
			
			this.jScrollPanelDatosEdicionUnidad=   new JScrollPane(jContentPaneDetalleUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUnidad.gridx = 0;
	        
			this.jContentPaneDetalleUnidad.add(jPanelCamposUnidad, gridBagConstraintsUnidad);
			
			
			
			
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
						&& unidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConversionInven(this.puedeCargarPorParteConversionInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRangoUnidadVenta(this.puedeCargarPorParteRangoUnidadVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameValorPorUnidad(this.puedeCargarPorParteValorPorUnidad,false,-1);
					
					if(this.unidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUnidad= new GridBagConstraints();
						this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUnidad.gridx = 0;
						this.jContentPaneDetalleUnidad.add(this.jTabbedPaneRelacionesUnidad, this.gridBagConstraintsUnidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUnidad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConversionInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRangoUnidadVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameValorPorUnidad(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUnidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUnidad = new GridBagConstraints();
					this.gridBagConstraintsUnidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUnidad.gridx = 0;
					
				
					this.jContentPaneDetalleUnidad.add(jPanelCamposOcultosUnidad, gridBagConstraintsUnidad);
				
					this.jPanelCamposOcultosUnidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsUnidad.gridx = 0;
	        this.gridBagConstraintsUnidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUnidad.add(this.jPanelAccionesFormularioUnidad, this.gridBagConstraintsUnidad);							
			
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
	        this.gridBagConstraintsUnidad.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsUnidad.gridx = 0;
	        
			
			this.jContentPaneDetalleUnidad.add(this.jPanelAccionesUnidad, this.gridBagConstraintsUnidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUnidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUnidad=   new JScrollPane(this.jPanelCamposUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUnidad.gridx = 0;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUnidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUnidad, this.gridBagConstraintsUnidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUnidad, this.gridBagConstraintsUnidad);			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUnidad, this.gridBagConstraintsUnidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUnidad, this.gridBagConstraintsUnidad);
			
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUnidad, this.gridBagConstraintsUnidad);
		
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUnidad, this.gridBagConstraintsUnidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUnidad;//jContentPane;
		
		return jScrollPanelDatosEdicionUnidad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConversionInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		this.conversioninvenSessionBean.setConGuardarRelaciones(false);
		this.conversioninvenSessionBean.setEsGuardarRelacionado(true);

		this.conversioninvenBeanSwingJInternalFrame=null;//new ConversionInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.conversioninvenBeanSwingJInternalFramePopup=new ConversionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.conversioninvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {

				ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.conversioninvenSessionBean.setEsGuardarRelacionado(true);

				this.conversioninvenBeanSwingJInternalFrame=new ConversionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.conversioninvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.conversioninvenBeanSwingJInternalFrame.setconversioninvenSessionBean(this.conversioninvenSessionBean);

				//this.gridBagConstraintsUnidad = new GridBagConstraints();
				//this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUnidad.gridx = 0;
				//this.jContentPaneDetalleUnidad.add(this.conversioninvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUnidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUnidad.add("Conversion Invenes",this.conversioninvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUnidad.setComponentAt(iIndexTab,this.conversioninvenBeanSwingJInternalFrame.getContentPane());
				}

				//ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.conversioninvenSessionBean.setEsGuardarRelacionado(false);
				this.conversioninvenBeanSwingJInternalFrame=null;//new ConversionInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConversionInven) {
					this.jTabbedPaneRelacionesUnidad.add("Conversion Invenes",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsUnidad = new GridBagConstraints();
				//this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUnidad.gridx = 0;
				//this.jContentPaneDetalleUnidad.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUnidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUnidad.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUnidad.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesUnidad.add("Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRangoUnidadVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		this.rangounidadventaSessionBean.setConGuardarRelaciones(false);
		this.rangounidadventaSessionBean.setEsGuardarRelacionado(true);

		this.rangounidadventaBeanSwingJInternalFrame=null;//new RangoUnidadVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rangounidadventaBeanSwingJInternalFramePopup=new RangoUnidadVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rangounidadventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {

				RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rangounidadventaSessionBean.setEsGuardarRelacionado(true);

				this.rangounidadventaBeanSwingJInternalFrame=new RangoUnidadVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rangounidadventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rangounidadventaBeanSwingJInternalFrame.setrangounidadventaSessionBean(this.rangounidadventaSessionBean);

				//this.gridBagConstraintsUnidad = new GridBagConstraints();
				//this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUnidad.gridx = 0;
				//this.jContentPaneDetalleUnidad.add(this.rangounidadventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUnidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUnidad.add("Rango Unidad Ventas",this.rangounidadventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUnidad.setComponentAt(iIndexTab,this.rangounidadventaBeanSwingJInternalFrame.getContentPane());
				}

				//RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rangounidadventaSessionBean.setEsGuardarRelacionado(false);
				this.rangounidadventaBeanSwingJInternalFrame=null;//new RangoUnidadVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRangoUnidadVenta) {
					this.jTabbedPaneRelacionesUnidad.add("Rango Unidad Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameValorPorUnidad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		this.valorporunidadSessionBean.setConGuardarRelaciones(false);
		this.valorporunidadSessionBean.setEsGuardarRelacionado(true);

		this.valorporunidadBeanSwingJInternalFrame=null;//new ValorPorUnidadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.valorporunidadBeanSwingJInternalFramePopup=new ValorPorUnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.valorporunidadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {

				ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.valorporunidadSessionBean.setEsGuardarRelacionado(true);

				this.valorporunidadBeanSwingJInternalFrame=new ValorPorUnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.valorporunidadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.valorporunidadBeanSwingJInternalFrame.setvalorporunidadSessionBean(this.valorporunidadSessionBean);

				//this.gridBagConstraintsUnidad = new GridBagConstraints();
				//this.gridBagConstraintsUnidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUnidad.gridx = 0;
				//this.jContentPaneDetalleUnidad.add(this.valorporunidadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUnidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUnidad.add("Valor Por Unidades",this.valorporunidadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUnidad.setComponentAt(iIndexTab,this.valorporunidadBeanSwingJInternalFrame.getContentPane());
				}

				//ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.valorporunidadSessionBean.setEsGuardarRelacionado(false);
				this.valorporunidadBeanSwingJInternalFrame=null;//new ValorPorUnidadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteValorPorUnidad) {
					this.jTabbedPaneRelacionesUnidad.add("Valor Por Unidades",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<Unidad> unidads,Unidad unidad,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.unidadLogic.getConnexion());

					productoBeanSwingJInternalFrame.setunidadsForeignKey(unidads);
					productoBeanSwingJInternalFrame.setunidadForeignKey(unidad);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidUnidadActual(unidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUnidad(true);
					productoBeanSwingJInternalFrame.setid_unidadFK_IdUnidad(unidad.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameUnidadForeignKey(unidad,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUnidad");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUnidad");
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

		public void cargarConversionInvenBeanSwingJInternalFrame(List<Unidad> unidads,Unidad unidad,ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//conversioninvenBeanSwingJInternalFrame=new ConversionInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					conversioninvenBeanSwingJInternalFrame.getConversionInvenLogic().setConnexion(this.unidadLogic.getConnexion());

					conversioninvenBeanSwingJInternalFrame.setunidadconversionsForeignKey(unidads);
					conversioninvenBeanSwingJInternalFrame.setunidadconversionForeignKey(unidad);
					conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setisBusquedaDesdeForeignKeySesionUnidadConversion(true);
					conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setlidUnidadConversionActual(unidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					conversioninvenBeanSwingJInternalFrame.cargarCombosForeignKeyConversionInven(conversioninvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					conversioninvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaUnidadConversion(true);
					conversioninvenBeanSwingJInternalFrame.setid_unidad_conversionFK_IdUnidadConversion(unidad.getId());

					if(!this.conCargarFormDetalle) {
						conversioninvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					conversioninvenBeanSwingJInternalFrame.setSelectedItemCombosFrameUnidadConversionForeignKey(unidad,1,false,true,true);
					conversioninvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					conversioninvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdUnidad");
					conversioninvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUnidad");
					conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(true);
					conversioninvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConversionInven("n",conversioninvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, conversioninvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					conversioninvenBeanSwingJInternalFrame.setAutoscrolls(true);
					conversioninvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("relacionado");
					} else {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("no_relacionado");
					}

					conversioninvenBeanSwingJInternalFrame.getjButtonRecargarInformacionConversionInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRangoUnidadVentaBeanSwingJInternalFrame(List<Unidad> unidads,Unidad unidad,RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rangounidadventaBeanSwingJInternalFrame=new RangoUnidadVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rangounidadventaBeanSwingJInternalFrame.getRangoUnidadVentaLogic().setConnexion(this.unidadLogic.getConnexion());

					rangounidadventaBeanSwingJInternalFrame.setunidadsForeignKey(unidads);
					rangounidadventaBeanSwingJInternalFrame.setunidadForeignKey(unidad);
					rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
					rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setlidUnidadActual(unidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rangounidadventaBeanSwingJInternalFrame.cargarCombosForeignKeyRangoUnidadVenta(rangounidadventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					rangounidadventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUnidad(true);
					rangounidadventaBeanSwingJInternalFrame.setid_unidadFK_IdUnidad(unidad.getId());

					if(!this.conCargarFormDetalle) {
						rangounidadventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rangounidadventaBeanSwingJInternalFrame.setSelectedItemCombosFrameUnidadForeignKey(unidad,1,false,true,true);
					rangounidadventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rangounidadventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUnidad");
					rangounidadventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUnidad");
					rangounidadventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRangoUnidadVenta(true);
					rangounidadventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRangoUnidadVenta("n",rangounidadventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, rangounidadventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rangounidadventaBeanSwingJInternalFrame.setAutoscrolls(true);
					rangounidadventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rangounidadventaBeanSwingJInternalFrame.actualizarEstadoPanelsRangoUnidadVenta("relacionado");
					} else {
						rangounidadventaBeanSwingJInternalFrame.actualizarEstadoPanelsRangoUnidadVenta("no_relacionado");
					}

					rangounidadventaBeanSwingJInternalFrame.getjButtonRecargarInformacionRangoUnidadVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarValorPorUnidadBeanSwingJInternalFrame(List<Unidad> unidads,Unidad unidad,ValorPorUnidadBeanSwingJInternalFrame valorporunidadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//valorporunidadBeanSwingJInternalFrame=new ValorPorUnidadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					valorporunidadBeanSwingJInternalFrame.getValorPorUnidadLogic().setConnexion(this.unidadLogic.getConnexion());

					valorporunidadBeanSwingJInternalFrame.setunidadsForeignKey(unidads);
					valorporunidadBeanSwingJInternalFrame.setunidadForeignKey(unidad);
					valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
					valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setlidUnidadActual(unidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					valorporunidadBeanSwingJInternalFrame.cargarCombosForeignKeyValorPorUnidad(valorporunidadBeanSwingJInternalFrame.isCargarCombosDependencia);
					valorporunidadBeanSwingJInternalFrame.setVisibilidadBusquedasParaUnidad(true);
					valorporunidadBeanSwingJInternalFrame.setid_unidadFK_IdUnidad(unidad.getId());

					if(!this.conCargarFormDetalle) {
						valorporunidadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					valorporunidadBeanSwingJInternalFrame.setSelectedItemCombosFrameUnidadForeignKey(unidad,1,false,true,true);
					valorporunidadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					valorporunidadBeanSwingJInternalFrame.procesarBusqueda("FK_IdUnidad");
					valorporunidadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUnidad");
					valorporunidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaValorPorUnidad(true);
					valorporunidadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesValorPorUnidad("n",valorporunidadBeanSwingJInternalFrame.isGuardarCambiosEnLote, valorporunidadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					valorporunidadBeanSwingJInternalFrame.setAutoscrolls(true);
					valorporunidadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						valorporunidadBeanSwingJInternalFrame.actualizarEstadoPanelsValorPorUnidad("relacionado");
					} else {
						valorporunidadBeanSwingJInternalFrame.actualizarEstadoPanelsValorPorUnidad("no_relacionado");
					}

					valorporunidadBeanSwingJInternalFrame.getjButtonRecargarInformacionValorPorUnidad().setVisible(false);

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
