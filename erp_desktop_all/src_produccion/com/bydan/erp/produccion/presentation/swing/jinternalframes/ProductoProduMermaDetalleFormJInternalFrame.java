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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProductoProduMermaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProductoProduMermaDetalleFormJInternalFrame extends ProductoProduMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProduMerma;
	
	protected JMenuBar jmenuBarDetalleProductoProduMerma;
	
	protected JMenu jmenuDetalleProductoProduMerma;
	protected JMenu jmenuDetalleArchivoProductoProduMerma;
	protected JMenu jmenuDetalleAccionesProductoProduMerma;
	protected JMenu jmenuDetalleDatosProductoProduMerma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMerma;	
	protected GridBagConstraints gridBagConstraintsProductoProduMerma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProduMermaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProduMerma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomermaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduMermaSessionBean productoprodumermaSessionBean;
	
	
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoProduMermaLogic productoprodumermaLogic;
	
	public JScrollPane jScrollPanelDatosProductoProduMerma;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMerma;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMerma;
	
	protected JPanel jPanelCamposProductoProduMerma;    
	protected JPanel jPanelCamposOcultosProductoProduMerma;    	
	protected JPanel jPanelAccionesProductoProduMerma;
	protected JPanel jPanelAccionesFormularioProductoProduMerma;
    
	
	
	protected Integer iXPanelCamposProductoProduMerma=0;
	protected Integer iYPanelCamposProductoProduMerma=0;
	
	protected Integer iXPanelCamposOcultosProductoProduMerma=0;
	protected Integer iYPanelCamposOcultosProductoProduMerma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProduMerma;
	public JButton jButtonModificarProductoProduMerma;
	public JButton jButtonActualizarProductoProduMerma;
    public JButton jButtonEliminarProductoProduMerma;
	public JButton jButtonCancelarProductoProduMerma;
    public JButton jButtonGuardarCambiosProductoProduMerma;
	public JButton jButtonGuardarCambiosTablaProductoProduMerma;
	protected JButton jButtonCerrarProductoProduMerma;
	
	
	protected JButton jButtonProcesarInformacionProductoProduMerma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProduMerma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProduMerma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProduMerma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMerma;
	protected JButton jButtonModificarToolBarProductoProduMerma;
	protected JButton jButtonActualizarToolBarProductoProduMerma;
    protected JButton jButtonEliminarToolBarProductoProduMerma;
	protected JButton jButtonCancelarToolBarProductoProduMerma;
    protected JButton jButtonGuardarCambiosToolBarProductoProduMerma;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProduMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMerma;
	protected JButton jButtonCerrarToolBarProductoProduMerma;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProduMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMerma;
	protected JMenuItem jMenuItemModificarProductoProduMerma;
	protected JMenuItem jMenuItemActualizarProductoProduMerma;
    protected JMenuItem jMenuItemEliminarProductoProduMerma;
	protected JMenuItem jMenuItemCancelarProductoProduMerma;
    protected JMenuItem jMenuItemGuardarCambiosProductoProduMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMerma;
	protected JMenuItem jMenuItemCerrarProductoProduMerma;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMerma;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMerma;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMerma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMerma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProduMerma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProduMerma;
	public JLabel jLabelIdProductoProduMerma;
	public JLabel jLabelidProductoProduMerma;
	public JButton jButtonidProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoProduMerma;
	public JLabel jLabelcantidadProductoProduMerma;
	public JTextField jTextFieldcantidadProductoProduMerma;
	public JButton jButtoncantidadProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoProduMerma;
	public JLabel jLabelcostoProductoProduMerma;
	public JTextField jTextFieldcostoProductoProduMerma;
	public JButton jButtoncostoProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoProduMerma;
	public JLabel jLabelcosto_totalProductoProduMerma;
	public JTextField jTextFieldcosto_totalProductoProduMerma;
	public JButton jButtoncosto_totalProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoProduMerma;
	public JLabel jLabeldescripcionProductoProduMerma;
	public JTextArea jTextAreadescripcionProductoProduMerma;
	public JScrollPane jscrollPanedescripcionProductoProduMerma;
	public JButton jButtondescripcionProductoProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_producto_defi_produProductoProduMerma;
	public JLabel jLabelid_producto_defi_produProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produProductoProduMerma;
	public JButton jButtonid_producto_defi_produProductoProduMerma= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_merma_empresaProductoProduMerma;
	public JLabel jLabelid_tipo_merma_empresaProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaProductoProduMerma;
	public JButton jButtonid_tipo_merma_empresaProductoProduMerma= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoProduMerma;
	public JLabel jLabelid_unidadProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoProduMerma;
	public JButton jButtonid_unidadProductoProduMerma= new JButtonMe();
	public JButton jButtonid_unidadProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoProduMermaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProduMerma;
	
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
	
	public ProductoProduMermaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProduMerma=new JPanel();
				this.jPanelAccionesFormularioProductoProduMerma=new JPanel();
				this.jmenuBarDetalleProductoProduMerma=new JMenuBar();
				this.jTtoolBarDetalleProductoProduMerma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProduMermaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProduMerma() {
		return this.jButtonActualizarToolBarProductoProduMerma;
	}
	
	public JButton getjButtonEliminarToolBarProductoProduMerma() {
		return this.jButtonEliminarToolBarProductoProduMerma;
	}
	
	public JButton getjButtonCancelarToolBarProductoProduMerma() {
		return this.jButtonCancelarToolBarProductoProduMerma;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProduMerma() {
		return this.jButtonProcesarInformacionProductoProduMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMerma)	{
		this.jButtonProcesarInformacionProductoProduMerma = jButtonProcesarInformacionProductoProduMerma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMerma() {
		return this.jComboBoxTiposAccionesProductoProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMerma(
			JComboBox jComboBoxTiposRelacionesProductoProduMerma) {
		this.jComboBoxTiposRelacionesProductoProduMerma = jComboBoxTiposRelacionesProductoProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMerma(
			JComboBox jComboBoxTiposAccionesProductoProduMerma) {
		this.jComboBoxTiposAccionesProductoProduMerma = jComboBoxTiposAccionesProductoProduMerma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProduMerma() {
		return this.jComboBoxTiposAccionesFormularioProductoProduMerma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProduMerma(
			JComboBox jComboBoxTiposAccionesFormularioProductoProduMerma) {
		this.jComboBoxTiposAccionesFormularioProductoProduMerma = jComboBoxTiposAccionesFormularioProductoProduMerma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		
		this.productoprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumermaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Merma Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProduMerma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProduMerma=new JButtonMe();
				this.jButtonModificarToolBarProductoProduMerma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma,
							"actualizar","actualizar","Actualizar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma,
							"eliminar","eliminar","Eliminar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma,
							"cancelar","cancelar","Cancelar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProduMerma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProduMerma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProduMerma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProduMerma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProduMerma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProduMerma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProduMerma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProduMerma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProduMerma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProduMerma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProduMerma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProduMerma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProduMerma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProduMerma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProduMerma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProduMerma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProduMerma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProduMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProduMerma.add(this.jMenuItemDetalleCerrarProductoProduMerma);
		
		this.jmenuDetalleAccionesProductoProduMerma.add(this.jMenuItemActualizarProductoProduMerma);
		this.jmenuDetalleAccionesProductoProduMerma.add(this.jMenuItemEliminarProductoProduMerma);
		this.jmenuDetalleAccionesProductoProduMerma.add(this.jMenuItemCancelarProductoProduMerma);		
		
		//this.jmenuDetalleDatosProductoProduMerma.add(this.jMenuItemDetalleAbrirOrderByProductoProduMerma);				
		this.jmenuDetalleDatosProductoProduMerma.add(this.jMenuItemDetalleMostarOcultarProductoProduMerma);				
				
		//this.jmenuDetalleAccionesProductoProduMerma.add(this.jMenuItemGuardarCambiosProductoProduMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProduMerma.add(this.jmenuDetalleArchivoProductoProduMerma);		
		this.jmenuBarDetalleProductoProduMerma.add(this.jmenuDetalleAccionesProductoProduMerma);		
		this.jmenuBarDetalleProductoProduMerma.add(this.jmenuDetalleDatosProductoProduMerma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProduMerma);				
	}
	
	
	public void inicializarElementosCamposProductoProduMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProduMerma = new JLabelMe();
		jLabelIdProductoProduMerma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProduMerma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProduMerma= new GridBagLayout();

		this.jPanelidProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);

		jLabelidProductoProduMerma = new JLabel();
		jLabelidProductoProduMerma.setText("Id");

		jLabelidProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoProduMerma = new JLabelMe();
		this.jLabelcantidadProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoProduMerma.setToolTipText("Cantad");
		this.jLabelcantidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelcantidadProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jTextFieldcantidadProductoProduMerma= new JTextFieldMe();
		jTextFieldcantidadProductoProduMerma.setEnabled(false);
		jTextFieldcantidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoProduMerma.setText("0");

		this.jButtoncantidadProductoProduMermaBusqueda= new JButtonMe();
		this.jButtoncantidadProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoProduMermaBusqueda.setText("U");
		this.jButtoncantidadProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoProduMermaBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoProduMerma = new JLabelMe();
		this.jLabelcostoProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoProduMerma.setToolTipText("Costo");
		this.jLabelcostoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelcostoProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jTextFieldcostoProductoProduMerma= new JTextFieldMe();
		jTextFieldcostoProductoProduMerma.setEnabled(false);
		jTextFieldcostoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoProduMerma.setText("0.0");

		this.jButtoncostoProductoProduMermaBusqueda= new JButtonMe();
		this.jButtoncostoProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoProduMermaBusqueda.setText("U");
		this.jButtoncostoProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoProduMermaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoProduMerma = new JLabelMe();
		this.jLabelcosto_totalProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoProduMerma.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelcosto_totalProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jTextFieldcosto_totalProductoProduMerma= new JTextFieldMe();
		jTextFieldcosto_totalProductoProduMerma.setEnabled(false);
		jTextFieldcosto_totalProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoProduMerma.setText("0.0");

		this.jButtoncosto_totalProductoProduMermaBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoProduMermaBusqueda.setText("U");
		this.jButtoncosto_totalProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoProduMermaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoProduMerma = new JLabelMe();
		this.jLabeldescripcionProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoProduMerma.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPaneldescripcionProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jTextAreadescripcionProductoProduMerma= new JTextAreaMe();
		jTextAreadescripcionProductoProduMerma.setEnabled(false);
		jTextAreadescripcionProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMerma.setLineWrap(true);
		jTextAreadescripcionProductoProduMerma.setWrapStyleWord(true);
		jTextAreadescripcionProductoProduMerma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoProduMerma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoProduMerma = new JScrollPane(jTextAreadescripcionProductoProduMerma);
		jscrollPanedescripcionProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoProduMermaBusqueda= new JButtonMe();
		this.jButtondescripcionProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoProduMermaBusqueda.setText("U");
		this.jButtondescripcionProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoProduMermaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProduMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_producto_defi_produProductoProduMerma = new JLabelMe();
		this.jLabelid_producto_defi_produProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU+" : *");
		this.jLabelid_producto_defi_produProductoProduMerma.setToolTipText("Producto Defi Produ");
		this.jLabelid_producto_defi_produProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_defi_produProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_defi_produProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelid_producto_defi_produProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jComboBoxid_producto_defi_produProductoProduMerma= new JComboBoxMe();
		jComboBoxid_producto_defi_produProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_defi_produProductoProduMerma= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMerma.setText("Buscar");
		this.jButtonid_producto_defi_produProductoProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_defi_produProductoProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_defi_produProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMerma"));

		this.jButtonid_producto_defi_produProductoProduMermaBusqueda= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setText("U");
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_defi_produProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_defi_produProductoProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_producto_defi_produProductoProduMermaUpdate= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduMermaUpdate.setText("U");
		this.jButtonid_producto_defi_produProductoProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_defi_produProductoProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_defi_produProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMermaUpdate"));



					
		this.jLabelid_tipo_merma_empresaProductoProduMerma = new JLabelMe();
		this.jLabelid_tipo_merma_empresaProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA+" : *");
		this.jLabelid_tipo_merma_empresaProductoProduMerma.setToolTipText("Tipo Merma Empresa");
		this.jLabelid_tipo_merma_empresaProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_merma_empresaProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_merma_empresaProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelid_tipo_merma_empresaProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jComboBoxid_tipo_merma_empresaProductoProduMerma= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_merma_empresaProductoProduMerma= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setText("Buscar");
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMerma"));

		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setText("U");
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setText("U");
		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMermaUpdate"));



					
		this.jLabelid_unidadProductoProduMerma = new JLabelMe();
		this.jLabelid_unidadProductoProduMerma.setText(""+ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoProduMerma.setToolTipText("Unad");
		this.jLabelid_unidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoProduMerma.setToolTipText(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoProduMerma = new GridBagLayout();
		this.jPanelid_unidadProductoProduMerma.setLayout(this.gridaBagLayoutProductoProduMerma);


		jComboBoxid_unidadProductoProduMerma= new JComboBoxMe();
		jComboBoxid_unidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoProduMerma= new JButtonMe();
		this.jButtonid_unidadProductoProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMerma.setText("Buscar");
		this.jButtonid_unidadProductoProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMerma"));

		this.jButtonid_unidadProductoProduMermaBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduMermaBusqueda.setText("U");
		this.jButtonid_unidadProductoProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMermaBusqueda"));

		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoProduMermaUpdate= new JButtonMe();
		this.jButtonid_unidadProductoProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduMermaUpdate.setText("U");
		this.jButtonid_unidadProductoProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMermaUpdate"));



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
		//this.jInternalFrameDetalleProductoProduMerma = new ProductoProduMermaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Merma Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMerma= new GridBagLayout();
		

		
		String sToolTipProductoProduMerma="";
		sToolTipProductoProduMerma=ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMerma+="(Produccion.ProductoProduMerma)";
		}
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMerma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProduMerma = new JButtonMe();
		this.jButtonModificarProductoProduMerma = new JButtonMe();
        this.jButtonActualizarProductoProduMerma = new JButtonMe();
        this.jButtonEliminarProductoProduMerma = new JButtonMe();
        this.jButtonCancelarProductoProduMerma = new JButtonMe();
        this.jButtonGuardarCambiosProductoProduMerma = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProduMerma = new JButtonMe();
		this.jButtonCerrarProductoProduMerma = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMerma = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProduMerma = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProduMerma = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Merma Produccion";
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProduMerma.setName("jPanelCamposProductoProduMerma"); 

		this.jPanelCamposOcultosProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProduMerma.setName("jPanelCamposOcultosProductoProduMerma"); 

        this.jPanelAccionesProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMerma.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProduMerma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProduMerma.setText("Nuevo");
		this.jButtonModificarProductoProduMerma.setText("Editar");
        this.jButtonActualizarProductoProduMerma.setText("Actualizar");
        this.jButtonEliminarProductoProduMerma.setText("Eliminar");
        this.jButtonCancelarProductoProduMerma.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProduMerma.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProduMerma.setText("Guardar");
		this.jButtonCerrarProductoProduMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMerma,"nuevo_button","Nuevo",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProduMerma,"modificar_button","Editar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProduMerma,"actualizar_button","Actualizar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProduMerma,"eliminar_button","Eliminar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProduMerma,"cancelar_button","Cancelar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProduMerma,"guardarcambios_button","Guardar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMerma,"guardarcambiostabla_button","Guardar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMerma,"cerrar_button","Salir",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProduMerma.setToolTipText("Nuevo"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProduMerma.setToolTipText("Editar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProduMerma.setToolTipText("Actualizar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProduMerma.setToolTipText("Eliminar)"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProduMerma.setToolTipText("Cancelar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProduMerma.setToolTipText("Guardar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProduMerma.setToolTipText("Guardar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMerma.setToolTipText("Salir"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMerma";
		inputMap = this.jButtonNuevoProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMerma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProduMerma";
		inputMap = this.jButtonActualizarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProduMerma"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProduMerma";
		inputMap = this.jButtonEliminarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProduMerma"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProduMerma";
		inputMap = this.jButtonCancelarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProduMerma"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMerma";
		inputMap = this.jButtonCerrarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMerma";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMerma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProduMerma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProduMerma.setToolTipText("Nuevo ProductoProduMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProduMerma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProduMerma.setToolTipText("Sin Cerrar Ventana ProductoProduMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProduMerma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProduMerma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMerma.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMerma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProduMerma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProduMerma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProduMerma = new JLabelMe();
		
		this.jLabelAccionesProductoProduMerma.setText("Acciones");		
		this.jLabelAccionesProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProduMerma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProduMerma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProduMerma=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMerma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProduMerma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProduMerma = new GridBagLayout();
		
		this.jPanelCamposProductoProduMerma.setLayout(gridaBagLayoutCamposProductoProduMerma);
		this.jPanelCamposOcultosProductoProduMerma.setLayout(gridaBagLayoutCamposOcultosProductoProduMerma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProduMerma.add(jLabelIdProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProduMerma.add(jLabelidProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_defi_produProductoProduMerma.add(jLabelid_producto_defi_produProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMerma.add(jButtonid_producto_defi_produProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 3;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMerma.add(jButtonid_producto_defi_produProductoProduMermaUpdate, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_defi_produProductoProduMerma.add(jComboBoxid_producto_defi_produProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_merma_empresaProductoProduMerma.add(jLabelid_tipo_merma_empresaProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoProduMerma.add(jButtonid_tipo_merma_empresaProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 3;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoProduMerma.add(jButtonid_tipo_merma_empresaProductoProduMermaUpdate, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_merma_empresaProductoProduMerma.add(jComboBoxid_tipo_merma_empresaProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoProduMerma.add(jLabelid_unidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMerma.add(jButtonid_unidadProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 3;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMerma.add(jButtonid_unidadProductoProduMermaUpdate, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoProduMerma.add(jComboBoxid_unidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoProduMerma.add(jLabelcantidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoProduMerma.add(jButtoncantidadProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoProduMerma.add(jTextFieldcantidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoProduMerma.add(jLabelcostoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoProduMerma.add(jButtoncostoProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoProduMerma.add(jTextFieldcostoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoProduMerma.add(jLabelcosto_totalProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoProduMerma.add(jButtoncosto_totalProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoProduMerma.add(jTextFieldcosto_totalProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 0;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoProduMerma.add(jLabeldescripcionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 2;
		this.gridBagConstraintsProductoProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoProduMerma.add(jButtondescripcionProductoProduMermaBusqueda, this.gridBagConstraintsProductoProduMerma);
	}

	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMerma.gridy = 0;
	this.gridBagConstraintsProductoProduMerma.gridx = 1;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoProduMerma.add(jscrollPanedescripcionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelidProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelid_producto_defi_produProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelid_tipo_merma_empresaProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelid_unidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelcantidadProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelcostoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPanelcosto_totalProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
	this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMerma.gridy = iYPanelCamposProductoProduMerma;
	this.gridBagConstraintsProductoProduMerma.gridx = iXPanelCamposProductoProduMerma++;
	this.gridBagConstraintsProductoProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMerma.add(this.jPaneldescripcionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);



	if(iXPanelCamposProductoProduMerma % 1==0) {
		iXPanelCamposProductoProduMerma=0;
		iYPanelCamposProductoProduMerma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMerma= new GridBagLayout();
		this.jPanelAccionesProductoProduMerma.setLayout(gridaBagLayoutAccionesProductoProduMerma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProduMerma= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProduMerma.setLayout(gridaBagLayoutAccionesFormularioProductoProduMerma);
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMerma.add(this.jComboBoxTiposAccionesFormularioProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMerma.add(this.jCheckBoxPostAccionNuevoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMerma.add(this.jCheckBoxPostAccionSinCerrarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMerma.add(this.jCheckBoxPostAccionSinMensajeProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProduMerma.add(this.jButtonModificarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);							

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProduMerma.add(this.jButtonEliminarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMerma.add(this.jButtonActualizarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMerma.add(this.jButtonGuardarCambiosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);	
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoProduMerma.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProduMerma.add(this.jButtonCancelarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMerma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMerma.gridx = 0;		
			//this.gridBagConstraintsProductoProduMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMerma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMerma.gridx =0;
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProduMerma = new ProductoProduMermaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Merma Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Merma Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Merma Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProduMermaModel productoprodumermaModel=new ProductoProduMermaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProduMermaModel.ProductoProduMermaFocusTraversalPolicy productoprodumermaFocusTraversalPolicy = productoprodumermaModel.new ProductoProduMermaFocusTraversalPolicy(this);
			
			//productoprodumermaFocusTraversalPolicy.setproductoprodumermaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoprodumermaModel);
			
			
			this.jContentPaneDetalleProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProduMerma = new GridBagLayout();	
			this.jContentPaneDetalleProductoProduMerma.setLayout(gridaBagLayoutDetalleProductoProduMerma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMerma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProduMerma.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProduMerma.add(jTtoolBarDetalleProductoProduMerma, gridBagConstraintsProductoProduMerma);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProduMerma=   new JScrollPane(jContentPaneDetalleProductoProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProduMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProduMerma.gridx = 0;
	        
			this.jContentPaneDetalleProductoProduMerma.add(jPanelCamposProductoProduMerma, gridBagConstraintsProductoProduMerma);
			
			
			
			
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
						&& productoprodumermaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProduMerma= new GridBagConstraints();
						this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProduMerma.gridx = 0;
						this.jContentPaneDetalleProductoProduMerma.add(this.jTabbedPaneRelacionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProduMerma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProduMerma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
					this.gridBagConstraintsProductoProduMerma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProduMerma.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProduMerma.add(jPanelCamposOcultosProductoProduMerma, gridBagConstraintsProductoProduMerma);
				
					this.jPanelCamposOcultosProductoProduMerma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProduMerma.gridx = 0;
	        this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProduMerma.add(this.jPanelAccionesFormularioProductoProduMerma, this.gridBagConstraintsProductoProduMerma);							
			
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
	        this.gridBagConstraintsProductoProduMerma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProduMerma.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProduMerma.add(this.jPanelAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProduMerma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProduMerma=   new JScrollPane(this.jPanelCamposProductoProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMerma.gridx = 0;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProduMerma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProduMerma;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProduMerma;
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
