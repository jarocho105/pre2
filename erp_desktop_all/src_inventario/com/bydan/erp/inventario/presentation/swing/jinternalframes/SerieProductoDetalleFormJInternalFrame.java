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
import com.bydan.erp.inventario.util.SerieProductoConstantesFunciones;

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
public class SerieProductoDetalleFormJInternalFrame extends SerieProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSerieProducto;
	
	protected JMenuBar jmenuBarDetalleSerieProducto;
	
	protected JMenu jmenuDetalleSerieProducto;
	protected JMenu jmenuDetalleArchivoSerieProducto;
	protected JMenu jmenuDetalleAccionesSerieProducto;
	protected JMenu jmenuDetalleDatosSerieProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSerieProducto;	
	protected GridBagConstraints gridBagConstraintsSerieProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SerieProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSerieProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public SerieProductoSessionBean serieproductoSessionBean;
	
	

	public DetalleSerieProductoBeanSwingJInternalFrame detalleserieproductoBeanSwingJInternalFrame=null;
	public DetalleSerieProductoBeanSwingJInternalFrame detalleserieproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleSerieProducto=false;
	public DetalleSerieProductoSessionBean detalleserieproductoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public SerieProductoLogic serieproductoLogic;
	
	public JScrollPane jScrollPanelDatosSerieProducto;
	public JScrollPane jScrollPanelDatosEdicionSerieProducto;
	public JScrollPane jScrollPanelDatosGeneralSerieProducto;
	
	protected JPanel jPanelCamposSerieProducto;    
	protected JPanel jPanelCamposOcultosSerieProducto;    	
	protected JPanel jPanelAccionesSerieProducto;
	protected JPanel jPanelAccionesFormularioSerieProducto;
    
	
	
	protected Integer iXPanelCamposSerieProducto=0;
	protected Integer iYPanelCamposSerieProducto=0;
	
	protected Integer iXPanelCamposOcultosSerieProducto=0;
	protected Integer iYPanelCamposOcultosSerieProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSerieProducto;
	public JButton jButtonModificarSerieProducto;
	public JButton jButtonActualizarSerieProducto;
    public JButton jButtonEliminarSerieProducto;
	public JButton jButtonCancelarSerieProducto;
    public JButton jButtonGuardarCambiosSerieProducto;
	public JButton jButtonGuardarCambiosTablaSerieProducto;
	protected JButton jButtonCerrarSerieProducto;
	
	
	protected JButton jButtonProcesarInformacionSerieProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSerieProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSerieProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSerieProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSerieProducto;
	protected JButton jButtonModificarToolBarSerieProducto;
	protected JButton jButtonActualizarToolBarSerieProducto;
    protected JButton jButtonEliminarToolBarSerieProducto;
	protected JButton jButtonCancelarToolBarSerieProducto;
    protected JButton jButtonGuardarCambiosToolBarSerieProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarSerieProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSerieProducto;
	protected JButton jButtonCerrarToolBarSerieProducto;
	
	protected JButton jButtonProcesarInformacionToolBarSerieProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSerieProducto;
	protected JMenuItem jMenuItemModificarSerieProducto;
	protected JMenuItem jMenuItemActualizarSerieProducto;
    protected JMenuItem jMenuItemEliminarSerieProducto;
	protected JMenuItem jMenuItemCancelarSerieProducto;
    protected JMenuItem jMenuItemGuardarCambiosSerieProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSerieProducto;
	protected JMenuItem jMenuItemCerrarSerieProducto;
	protected JMenuItem jMenuItemDetalleCerrarSerieProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSerieProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionSerieProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSerieProducto;
	protected JMenuItem jMenuItemMostrarOcultarSerieProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSerieProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSerieProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSerieProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSerieProducto;
	public JLabel jLabelIdSerieProducto;
	public JLabel jLabelidSerieProducto;
	public JButton jButtonidSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSerieProducto;
	public JLabel jLabelcodigoSerieProducto;
	public JTextField jTextFieldcodigoSerieProducto;
	public JButton jButtoncodigoSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraSerieProducto;
	public JLabel jLabelfecha_compraSerieProducto;
	//public JFormattedTextField jDateChooserfecha_compraSerieProducto;

	public JDateChooser jDateChooserfecha_compraSerieProducto;
	public JButton jButtonfecha_compraSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaSerieProducto;
	public JLabel jLabelfecha_entregaSerieProducto;
	//public JFormattedTextField jDateChooserfecha_entregaSerieProducto;

	public JDateChooser jDateChooserfecha_entregaSerieProducto;
	public JButton jButtonfecha_entregaSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaSerieProducto;
	public JLabel jLabelfecha_ventaSerieProducto;
	//public JFormattedTextField jDateChooserfecha_ventaSerieProducto;

	public JDateChooser jDateChooserfecha_ventaSerieProducto;
	public JButton jButtonfecha_ventaSerieProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSerieProducto;
	public JLabel jLabeldescripcionSerieProducto;
	public JTextArea jTextAreadescripcionSerieProducto;
	public JScrollPane jscrollPanedescripcionSerieProducto;
	public JButton jButtondescripcionSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSerieProducto;
	public JLabel jLabelid_empresaSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSerieProducto;
	public JButton jButtonid_empresaSerieProducto= new JButtonMe();
	public JButton jButtonid_empresaSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaSerieProducto;
	public JLabel jLabelid_bodegaSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaSerieProducto;
	public JButton jButtonid_bodegaSerieProducto= new JButtonMe();
	public JButton jButtonid_bodegaSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoSerieProducto;
	public JLabel jLabelid_productoSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoSerieProducto;
	public JButton jButtonid_productoSerieProducto= new JButtonMe();
	public JButton jButtonid_productoSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoSerieProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSerieProducto;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SerieProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSerieProducto=new JPanel();
				this.jPanelAccionesFormularioSerieProducto=new JPanel();
				this.jmenuBarDetalleSerieProducto=new JMenuBar();
				this.jTtoolBarDetalleSerieProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SerieProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSerieProducto() {
		return this.jButtonActualizarToolBarSerieProducto;
	}
	
	public JButton getjButtonEliminarToolBarSerieProducto() {
		return this.jButtonEliminarToolBarSerieProducto;
	}
	
	public JButton getjButtonCancelarToolBarSerieProducto() {
		return this.jButtonCancelarToolBarSerieProducto;
	}		
	
	public JButton getjButtonProcesarInformacionSerieProducto() {
		return this.jButtonProcesarInformacionSerieProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSerieProducto)	{
		this.jButtonProcesarInformacionSerieProducto = jButtonProcesarInformacionSerieProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSerieProducto() {
		return this.jComboBoxTiposAccionesSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSerieProducto(
			JComboBox jComboBoxTiposRelacionesSerieProducto) {
		this.jComboBoxTiposRelacionesSerieProducto = jComboBoxTiposRelacionesSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSerieProducto(
			JComboBox jComboBoxTiposAccionesSerieProducto) {
		this.jComboBoxTiposAccionesSerieProducto = jComboBoxTiposAccionesSerieProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSerieProducto() {
		return this.jComboBoxTiposAccionesFormularioSerieProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSerieProducto(
			JComboBox jComboBoxTiposAccionesFormularioSerieProducto) {
		this.jComboBoxTiposAccionesFormularioSerieProducto = jComboBoxTiposAccionesFormularioSerieProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.serieproductoSessionBean=new SerieProductoSessionBean();
		
		this.serieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.serieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.serieproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SerieProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Serie Producto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		SerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSerieProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSerieProducto=new JButtonMe();
				this.jButtonModificarToolBarSerieProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"actualizar","actualizar","Actualizar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"eliminar","eliminar","Eliminar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"cancelar","cancelar","Cancelar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSerieProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSerieProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSerieProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSerieProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSerieProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSerieProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSerieProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSerieProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSerieProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSerieProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSerieProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSerieProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSerieProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSerieProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSerieProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSerieProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSerieProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSerieProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSerieProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSerieProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSerieProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSerieProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSerieProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSerieProducto.add(this.jMenuItemDetalleCerrarSerieProducto);
		
		this.jmenuDetalleAccionesSerieProducto.add(this.jMenuItemActualizarSerieProducto);
		this.jmenuDetalleAccionesSerieProducto.add(this.jMenuItemEliminarSerieProducto);
		this.jmenuDetalleAccionesSerieProducto.add(this.jMenuItemCancelarSerieProducto);		
		
		//this.jmenuDetalleDatosSerieProducto.add(this.jMenuItemDetalleAbrirOrderBySerieProducto);				
		this.jmenuDetalleDatosSerieProducto.add(this.jMenuItemDetalleMostarOcultarSerieProducto);				
				
		//this.jmenuDetalleAccionesSerieProducto.add(this.jMenuItemGuardarCambiosSerieProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSerieProducto.add(this.jmenuDetalleArchivoSerieProducto);		
		this.jmenuBarDetalleSerieProducto.add(this.jmenuDetalleAccionesSerieProducto);		
		this.jmenuBarDetalleSerieProducto.add(this.jmenuDetalleDatosSerieProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSerieProducto.add(this.jmenuDetalleSerieProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSerieProducto);				
	}
	
	
	public void inicializarElementosCamposSerieProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSerieProducto = new JLabelMe();
		jLabelIdSerieProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSerieProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSerieProducto= new GridBagLayout();

		this.jPanelidSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);

		jLabelidSerieProducto = new JLabel();
		jLabelidSerieProducto.setText("Id");

		jLabelidSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSerieProducto = new JLabelMe();
		this.jLabelcodigoSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSerieProducto.setToolTipText("Codigo");
		this.jLabelcodigoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelcodigoSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		jTextFieldcodigoSerieProducto= new JTextFieldMe();
		jTextFieldcodigoSerieProducto.setEnabled(false);
		jTextFieldcodigoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcodigoSerieProducto.setText("0.0");

		this.jButtoncodigoSerieProductoBusqueda= new JButtonMe();
		this.jButtoncodigoSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSerieProductoBusqueda.setText("U");
		this.jButtoncodigoSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSerieProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraSerieProducto = new JLabelMe();
		this.jLabelfecha_compraSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraSerieProducto.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelfecha_compraSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		//jFormattedTextFieldfecha_compraSerieProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_compraSerieProducto= new JDateChooser();
		jDateChooserfecha_compraSerieProducto.setEnabled(false);
		jDateChooserfecha_compraSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraSerieProducto.setDate(new Date());
		jDateChooserfecha_compraSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraSerieProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraSerieProductoBusqueda= new JButtonMe();
		this.jButtonfecha_compraSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraSerieProductoBusqueda.setText("U");
		this.jButtonfecha_compraSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraSerieProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaSerieProducto = new JLabelMe();
		this.jLabelfecha_entregaSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaSerieProducto.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelfecha_entregaSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		//jFormattedTextFieldfecha_entregaSerieProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaSerieProducto= new JDateChooser();
		jDateChooserfecha_entregaSerieProducto.setEnabled(false);
		jDateChooserfecha_entregaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaSerieProducto.setDate(new Date());
		jDateChooserfecha_entregaSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaSerieProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaSerieProductoBusqueda= new JButtonMe();
		this.jButtonfecha_entregaSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaSerieProductoBusqueda.setText("U");
		this.jButtonfecha_entregaSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaSerieProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ventaSerieProducto = new JLabelMe();
		this.jLabelfecha_ventaSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaSerieProducto.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelfecha_ventaSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		//jFormattedTextFieldfecha_ventaSerieProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaSerieProducto= new JDateChooser();
		jDateChooserfecha_ventaSerieProducto.setEnabled(false);
		jDateChooserfecha_ventaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaSerieProducto.setDate(new Date());
		jDateChooserfecha_ventaSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaSerieProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaSerieProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ventaSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaSerieProductoBusqueda.setText("U");
		this.jButtonfecha_ventaSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaSerieProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSerieProducto = new JLabelMe();
		this.jLabeldescripcionSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionSerieProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPaneldescripcionSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		jTextAreadescripcionSerieProducto= new JTextAreaMe();
		jTextAreadescripcionSerieProducto.setEnabled(false);
		jTextAreadescripcionSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSerieProducto.setLineWrap(true);
		jTextAreadescripcionSerieProducto.setWrapStyleWord(true);
		jTextAreadescripcionSerieProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSerieProducto.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSerieProducto = new JScrollPane(jTextAreadescripcionSerieProducto);
		jscrollPanedescripcionSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSerieProductoBusqueda= new JButtonMe();
		this.jButtondescripcionSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSerieProductoBusqueda.setText("U");
		this.jButtondescripcionSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSerieProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSerieProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSerieProducto = new JLabelMe();
		this.jLabelid_empresaSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSerieProducto.setToolTipText("Empresa");
		this.jLabelid_empresaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelid_empresaSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		jComboBoxid_empresaSerieProducto= new JComboBoxMe();
		jComboBoxid_empresaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSerieProducto.setEnabled(false);

		this.jButtonid_empresaSerieProducto= new JButtonMe();
		this.jButtonid_empresaSerieProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSerieProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSerieProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSerieProducto.setText("Buscar");
		this.jButtonid_empresaSerieProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSerieProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSerieProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSerieProducto"));

		this.jButtonid_empresaSerieProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSerieProductoBusqueda.setText("U");
		this.jButtonid_empresaSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSerieProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaSerieProductoUpdate= new JButtonMe();
		this.jButtonid_empresaSerieProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSerieProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSerieProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSerieProductoUpdate.setText("U");
		this.jButtonid_empresaSerieProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSerieProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSerieProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSerieProductoUpdate"));



					
		this.jLabelid_bodegaSerieProducto = new JLabelMe();
		this.jLabelid_bodegaSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaSerieProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelid_bodegaSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		jComboBoxid_bodegaSerieProducto= new JComboBoxMe();
		jComboBoxid_bodegaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaSerieProducto= new JButtonMe();
		this.jButtonid_bodegaSerieProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSerieProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSerieProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaSerieProducto.setText("Buscar");
		this.jButtonid_bodegaSerieProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaSerieProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSerieProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSerieProducto"));

		this.jButtonid_bodegaSerieProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaSerieProductoBusqueda.setText("U");
		this.jButtonid_bodegaSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaSerieProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaSerieProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaSerieProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSerieProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaSerieProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaSerieProductoUpdate.setText("U");
		this.jButtonid_bodegaSerieProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaSerieProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaSerieProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaSerieProductoUpdate"));



					
		this.jLabelid_productoSerieProducto = new JLabelMe();
		this.jLabelid_productoSerieProducto.setText(""+SerieProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoSerieProducto.setToolTipText("Producto");
		this.jLabelid_productoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoSerieProducto.setToolTipText(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutSerieProducto = new GridBagLayout();
		this.jPanelid_productoSerieProducto.setLayout(this.gridaBagLayoutSerieProducto);


		jComboBoxid_productoSerieProducto= new JComboBoxMe();
		jComboBoxid_productoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoSerieProducto= new JButtonMe();
		this.jButtonid_productoSerieProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSerieProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSerieProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoSerieProducto.setText("Buscar");
		this.jButtonid_productoSerieProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoSerieProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSerieProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSerieProducto"));

		this.jButtonid_productoSerieProductoBusqueda= new JButtonMe();
		this.jButtonid_productoSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoSerieProductoBusqueda.setText("U");
		this.jButtonid_productoSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSerieProductoBusqueda"));

		if(this.serieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoSerieProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoSerieProductoUpdate= new JButtonMe();
		this.jButtonid_productoSerieProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSerieProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoSerieProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoSerieProductoUpdate.setText("U");
		this.jButtonid_productoSerieProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoSerieProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoSerieProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoSerieProductoUpdate"));



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
		//this.jInternalFrameDetalleSerieProducto = new SerieProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Serie Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSerieProducto= new GridBagLayout();
		

		
		String sToolTipSerieProducto="";
		sToolTipSerieProducto=SerieProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSerieProducto+="(Inventario.SerieProducto)";
		}
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSerieProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSerieProducto = new JButtonMe();
		this.jButtonModificarSerieProducto = new JButtonMe();
        this.jButtonActualizarSerieProducto = new JButtonMe();
        this.jButtonEliminarSerieProducto = new JButtonMe();
        this.jButtonCancelarSerieProducto = new JButtonMe();
        this.jButtonGuardarCambiosSerieProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaSerieProducto = new JButtonMe();
		this.jButtonCerrarSerieProducto = new JButtonMe();
		
		this.jScrollPanelDatosSerieProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionSerieProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralSerieProducto = new JScrollPane();
				
		
		
		this.jPanelCamposSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Serie Producto";
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSerieProducto.setName("jPanelCamposSerieProducto"); 

		this.jPanelCamposOcultosSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSerieProducto.setName("jPanelCamposOcultosSerieProducto"); 

        this.jPanelAccionesSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesSerieProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSerieProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSerieProducto.setText("Nuevo");
		this.jButtonModificarSerieProducto.setText("Editar");
        this.jButtonActualizarSerieProducto.setText("Actualizar");
        this.jButtonEliminarSerieProducto.setText("Eliminar");
        this.jButtonCancelarSerieProducto.setText("Cancelar");
        this.jButtonGuardarCambiosSerieProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaSerieProducto.setText("Guardar");
		this.jButtonCerrarSerieProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSerieProducto,"nuevo_button","Nuevo",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSerieProducto,"modificar_button","Editar",this.serieproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSerieProducto,"actualizar_button","Actualizar",this.serieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSerieProducto,"eliminar_button","Eliminar",this.serieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSerieProducto,"cancelar_button","Cancelar",this.serieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSerieProducto,"guardarcambios_button","Guardar",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSerieProducto,"guardarcambiostabla_button","Guardar",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSerieProducto,"cerrar_button","Salir",this.serieproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSerieProducto.setToolTipText("Nuevo"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSerieProducto.setToolTipText("Editar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSerieProducto.setToolTipText("Actualizar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSerieProducto.setToolTipText("Eliminar)"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSerieProducto.setToolTipText("Cancelar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSerieProducto.setToolTipText("Guardar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSerieProducto.setToolTipText("Guardar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSerieProducto.setToolTipText("Salir"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSerieProducto";
		inputMap = this.jButtonNuevoSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSerieProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSerieProducto";
		inputMap = this.jButtonActualizarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSerieProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarSerieProducto";
		inputMap = this.jButtonEliminarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSerieProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarSerieProducto";
		inputMap = this.jButtonCancelarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSerieProducto"));
		
		//CERRAR		
		sMapKey = "CerrarSerieProducto";
		inputMap = this.jButtonCerrarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSerieProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSerieProducto";
		inputMap = this.jButtonGuardarCambiosTablaSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSerieProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSerieProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSerieProducto.setToolTipText("Nuevo SerieProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSerieProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSerieProducto.setToolTipText("Sin Cerrar Ventana SerieProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSerieProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSerieProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSerieProducto.setText("Accion");
		this.jComboBoxTiposAccionesSerieProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSerieProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSerieProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSerieProducto = new JLabelMe();
		
		this.jLabelAccionesSerieProducto.setText("Acciones");		
		this.jLabelAccionesSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSerieProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSerieProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSerieProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSerieProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSerieProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSerieProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSerieProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSerieProducto = new GridBagLayout();
		
		this.jPanelCamposSerieProducto.setLayout(gridaBagLayoutCamposSerieProducto);
		this.jPanelCamposOcultosSerieProducto.setLayout(gridaBagLayoutCamposOcultosSerieProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSerieProducto.add(jLabelIdSerieProducto, this.gridBagConstraintsSerieProducto);



	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSerieProducto.add(jLabelidSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSerieProducto.add(jLabelid_empresaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSerieProducto.add(jButtonid_empresaSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 3;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSerieProducto.add(jButtonid_empresaSerieProductoUpdate, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSerieProducto.add(jComboBoxid_empresaSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaSerieProducto.add(jLabelid_bodegaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaSerieProducto.add(jButtonid_bodegaSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 3;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaSerieProducto.add(jButtonid_bodegaSerieProductoUpdate, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaSerieProducto.add(jComboBoxid_bodegaSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoSerieProducto.add(jLabelid_productoSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 2;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoSerieProducto.add(jButtonid_productoSerieProducto, this.gridBagConstraintsSerieProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 3;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoSerieProducto.add(jButtonid_productoSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 4;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoSerieProducto.add(jButtonid_productoSerieProductoUpdate, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoSerieProducto.add(jComboBoxid_productoSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSerieProducto.add(jLabelcodigoSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSerieProducto.add(jButtoncodigoSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSerieProducto.add(jTextFieldcodigoSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraSerieProducto.add(jLabelfecha_compraSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraSerieProducto.add(jButtonfecha_compraSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraSerieProducto.add(jDateChooserfecha_compraSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaSerieProducto.add(jLabelfecha_entregaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaSerieProducto.add(jButtonfecha_entregaSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaSerieProducto.add(jDateChooserfecha_entregaSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaSerieProducto.add(jLabelfecha_ventaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaSerieProducto.add(jButtonfecha_ventaSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaSerieProducto.add(jDateChooserfecha_ventaSerieProducto, this.gridBagConstraintsSerieProducto);


	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 0;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSerieProducto.add(jLabeldescripcionSerieProducto, this.gridBagConstraintsSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 2;
		this.gridBagConstraintsSerieProducto.ipadx = 0;
		this.gridBagConstraintsSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSerieProducto.add(jButtondescripcionSerieProductoBusqueda, this.gridBagConstraintsSerieProducto);
	}

	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSerieProducto.gridy = 0;
	this.gridBagConstraintsSerieProducto.gridx = 1;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSerieProducto.add(jscrollPanedescripcionSerieProducto, this.gridBagConstraintsSerieProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelidSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelid_bodegaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelid_productoSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelcodigoSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelfecha_compraSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelfecha_entregaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPanelfecha_ventaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSerieProducto.add(this.jPaneldescripcionSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposSerieProducto % 1==0) {
		iXPanelCamposSerieProducto=0;
		iYPanelCamposSerieProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSerieProducto.gridy = iYPanelCamposOcultosSerieProducto;
	this.gridBagConstraintsSerieProducto.gridx = iXPanelCamposOcultosSerieProducto++;
	this.gridBagConstraintsSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSerieProducto.add(this.jPanelid_empresaSerieProducto, this.gridBagConstraintsSerieProducto);



	if(iXPanelCamposOcultosSerieProducto % 1==0) {
		iXPanelCamposOcultosSerieProducto=0;
		iYPanelCamposOcultosSerieProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesSerieProducto= new GridBagLayout();
		this.jPanelAccionesSerieProducto.setLayout(gridaBagLayoutAccionesSerieProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSerieProducto= new GridBagLayout();
		this.jPanelAccionesFormularioSerieProducto.setLayout(gridaBagLayoutAccionesFormularioSerieProducto);
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSerieProducto.add(this.jComboBoxTiposAccionesFormularioSerieProducto, this.gridBagConstraintsSerieProducto);

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSerieProducto.add(this.jCheckBoxPostAccionNuevoSerieProducto, this.gridBagConstraintsSerieProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSerieProducto.add(this.jCheckBoxPostAccionSinCerrarSerieProducto, this.gridBagConstraintsSerieProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSerieProducto.add(this.jCheckBoxPostAccionSinMensajeSerieProducto, this.gridBagConstraintsSerieProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesSerieProducto.add(this.jButtonModificarSerieProducto, this.gridBagConstraintsSerieProducto);							

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesSerieProducto.add(this.jButtonEliminarSerieProducto, this.gridBagConstraintsSerieProducto);
		
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = 0;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSerieProducto.add(this.jButtonActualizarSerieProducto, this.gridBagConstraintsSerieProducto);


		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = 0;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesSerieProducto.add(this.jButtonGuardarCambiosSerieProducto, this.gridBagConstraintsSerieProducto);	
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = 0;		
		this.gridBagConstraintsSerieProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesSerieProducto.add(this.jButtonCancelarSerieProducto, this.gridBagConstraintsSerieProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSerieProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSerieProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();						
			this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSerieProducto.gridx = 0;		
			//this.gridBagConstraintsSerieProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSerieProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSerieProducto.gridx =0;
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSerieProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSerieProducto, this.gridBagConstraintsSerieProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSerieProducto = new SerieProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Serie Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Serie Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Serie Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SerieProductoModel serieproductoModel=new SerieProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//SerieProductoModel.SerieProductoFocusTraversalPolicy serieproductoFocusTraversalPolicy = serieproductoModel.new SerieProductoFocusTraversalPolicy(this);
			
			//serieproductoFocusTraversalPolicy.setserieproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(serieproductoModel);
			
			
			this.jContentPaneDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSerieProducto = new GridBagLayout();	
			this.jContentPaneDetalleSerieProducto.setLayout(gridaBagLayoutDetalleSerieProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSerieProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSerieProducto.gridx = 0;
					
				
				this.jContentPaneDetalleSerieProducto.add(jTtoolBarDetalleSerieProducto, gridBagConstraintsSerieProducto);								
				
}
			
			this.jScrollPanelDatosEdicionSerieProducto=   new JScrollPane(jContentPaneDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSerieProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSerieProducto.gridx = 0;
	        
			this.jContentPaneDetalleSerieProducto.add(jPanelCamposSerieProducto, gridBagConstraintsSerieProducto);
			
			
			
			
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
						&& serieproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleSerieProducto(this.puedeCargarPorParteDetalleSerieProducto,false,-1);
					
					if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSerieProducto= new GridBagConstraints();
						this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSerieProducto.gridx = 0;
						this.jContentPaneDetalleSerieProducto.add(this.jTabbedPaneRelacionesSerieProducto, this.gridBagConstraintsSerieProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSerieProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleSerieProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSerieProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSerieProducto = new GridBagConstraints();
					this.gridBagConstraintsSerieProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSerieProducto.gridx = 0;
					
				
					this.jContentPaneDetalleSerieProducto.add(jPanelCamposOcultosSerieProducto, gridBagConstraintsSerieProducto);
				
					this.jPanelCamposOcultosSerieProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsSerieProducto.gridx = 0;
	        this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSerieProducto.add(this.jPanelAccionesFormularioSerieProducto, this.gridBagConstraintsSerieProducto);							
			
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
	        this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsSerieProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleSerieProducto.add(this.jPanelAccionesSerieProducto, this.gridBagConstraintsSerieProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSerieProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSerieProducto=   new JScrollPane(this.jPanelCamposSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSerieProducto.gridx = 0;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSerieProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSerieProducto, this.gridBagConstraintsSerieProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSerieProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSerieProducto, this.gridBagConstraintsSerieProducto);			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSerieProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSerieProducto, this.gridBagConstraintsSerieProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSerieProducto, this.gridBagConstraintsSerieProducto);
			
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSerieProducto, this.gridBagConstraintsSerieProducto);
		
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSerieProducto, this.gridBagConstraintsSerieProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSerieProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionSerieProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleSerieProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		this.detalleserieproductoSessionBean.setConGuardarRelaciones(false);
		this.detalleserieproductoSessionBean.setEsGuardarRelacionado(true);

		this.detalleserieproductoBeanSwingJInternalFrame=null;//new DetalleSerieProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleserieproductoBeanSwingJInternalFramePopup=new DetalleSerieProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleserieproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {

				DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleserieproductoSessionBean.setEsGuardarRelacionado(true);

				this.detalleserieproductoBeanSwingJInternalFrame=new DetalleSerieProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleserieproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleserieproductoBeanSwingJInternalFrame.setdetalleserieproductoSessionBean(this.detalleserieproductoSessionBean);

				//this.gridBagConstraintsSerieProducto = new GridBagConstraints();
				//this.gridBagConstraintsSerieProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSerieProducto.gridx = 0;
				//this.jContentPaneDetalleSerieProducto.add(this.detalleserieproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSerieProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSerieProducto.add("Detalle Serie Productos",this.detalleserieproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSerieProducto.setComponentAt(iIndexTab,this.detalleserieproductoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleserieproductoSessionBean.setEsGuardarRelacionado(false);
				this.detalleserieproductoBeanSwingJInternalFrame=null;//new DetalleSerieProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleSerieProducto) {
					this.jTabbedPaneRelacionesSerieProducto.add("Detalle Serie Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleSerieProductoBeanSwingJInternalFrame(List<SerieProducto> serieproductos,SerieProducto serieproducto,DetalleSerieProductoBeanSwingJInternalFrame detalleserieproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleserieproductoBeanSwingJInternalFrame=new DetalleSerieProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleserieproductoBeanSwingJInternalFrame.getDetalleSerieProductoLogic().setConnexion(this.serieproductoLogic.getConnexion());

					detalleserieproductoBeanSwingJInternalFrame.setserieproductosForeignKey(serieproductos);
					detalleserieproductoBeanSwingJInternalFrame.setserieproductoForeignKey(serieproducto);
					detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setisBusquedaDesdeForeignKeySesionSerieProducto(true);
					detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setlidSerieProductoActual(serieproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleserieproductoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleSerieProducto(detalleserieproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleserieproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaSerieProducto(true);
					detalleserieproductoBeanSwingJInternalFrame.setid_serie_productoFK_IdSerieProducto(serieproducto.getId());

					if(!this.conCargarFormDetalle) {
						detalleserieproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleserieproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameSerieProductoForeignKey(serieproducto,1,false,true,true);
					detalleserieproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleserieproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdSerieProducto");
					detalleserieproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSerieProducto");
					detalleserieproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleSerieProducto(true);
					detalleserieproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleSerieProducto("n",detalleserieproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleserieproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleserieproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleserieproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleserieproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleSerieProducto("relacionado");
					} else {
						detalleserieproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleSerieProducto("no_relacionado");
					}

					detalleserieproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleSerieProducto().setVisible(false);

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
