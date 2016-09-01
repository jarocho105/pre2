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
import com.bydan.erp.produccion.util.ProductoProduMaquinaConstantesFunciones;

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
public class ProductoProduMaquinaDetalleFormJInternalFrame extends ProductoProduMaquinaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProduMaquina;
	
	protected JMenuBar jmenuBarDetalleProductoProduMaquina;
	
	protected JMenu jmenuDetalleProductoProduMaquina;
	protected JMenu jmenuDetalleArchivoProductoProduMaquina;
	protected JMenu jmenuDetalleAccionesProductoProduMaquina;
	protected JMenu jmenuDetalleDatosProductoProduMaquina;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMaquina;	
	protected GridBagConstraints gridBagConstraintsProductoProduMaquina;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProduMaquinaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProduMaquina;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoareaempresaprodu="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomaquinaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
	
	
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoProduMaquinaLogic productoprodumaquinaLogic;
	
	public JScrollPane jScrollPanelDatosProductoProduMaquina;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMaquina;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMaquina;
	
	protected JPanel jPanelCamposProductoProduMaquina;    
	protected JPanel jPanelCamposOcultosProductoProduMaquina;    	
	protected JPanel jPanelAccionesProductoProduMaquina;
	protected JPanel jPanelAccionesFormularioProductoProduMaquina;
    
	
	
	protected Integer iXPanelCamposProductoProduMaquina=0;
	protected Integer iYPanelCamposProductoProduMaquina=0;
	
	protected Integer iXPanelCamposOcultosProductoProduMaquina=0;
	protected Integer iYPanelCamposOcultosProductoProduMaquina=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProduMaquina;
	public JButton jButtonModificarProductoProduMaquina;
	public JButton jButtonActualizarProductoProduMaquina;
    public JButton jButtonEliminarProductoProduMaquina;
	public JButton jButtonCancelarProductoProduMaquina;
    public JButton jButtonGuardarCambiosProductoProduMaquina;
	public JButton jButtonGuardarCambiosTablaProductoProduMaquina;
	protected JButton jButtonCerrarProductoProduMaquina;
	
	
	protected JButton jButtonProcesarInformacionProductoProduMaquina;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProduMaquina;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProduMaquina;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProduMaquina;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMaquina;
	protected JButton jButtonModificarToolBarProductoProduMaquina;
	protected JButton jButtonActualizarToolBarProductoProduMaquina;
    protected JButton jButtonEliminarToolBarProductoProduMaquina;
	protected JButton jButtonCancelarToolBarProductoProduMaquina;
    protected JButton jButtonGuardarCambiosToolBarProductoProduMaquina;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProduMaquina;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMaquina;
	protected JButton jButtonCerrarToolBarProductoProduMaquina;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProduMaquina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMaquina;
	protected JMenuItem jMenuItemModificarProductoProduMaquina;
	protected JMenuItem jMenuItemActualizarProductoProduMaquina;
    protected JMenuItem jMenuItemEliminarProductoProduMaquina;
	protected JMenuItem jMenuItemCancelarProductoProduMaquina;
    protected JMenuItem jMenuItemGuardarCambiosProductoProduMaquina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMaquina;
	protected JMenuItem jMenuItemCerrarProductoProduMaquina;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMaquina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMaquina;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMaquina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMaquina;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMaquina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMaquina;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMaquina;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProduMaquina;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProduMaquina;
	public JLabel jLabelIdProductoProduMaquina;
	public JLabel jLabelidProductoProduMaquina;
	public JButton jButtonidProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoProduMaquina;
	public JLabel jLabelcantidadProductoProduMaquina;
	public JTextField jTextFieldcantidadProductoProduMaquina;
	public JButton jButtoncantidadProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoProduMaquina;
	public JLabel jLabelcostoProductoProduMaquina;
	public JTextField jTextFieldcostoProductoProduMaquina;
	public JButton jButtoncostoProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoProduMaquina;
	public JLabel jLabelcosto_totalProductoProduMaquina;
	public JTextField jTextFieldcosto_totalProductoProduMaquina;
	public JButton jButtoncosto_totalProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoProduMaquina;
	public JLabel jLabeldescripcionProductoProduMaquina;
	public JTextArea jTextAreadescripcionProductoProduMaquina;
	public JScrollPane jscrollPanedescripcionProductoProduMaquina;
	public JButton jButtondescripcionProductoProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_producto_defi_produProductoProduMaquina;
	public JLabel jLabelid_producto_defi_produProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produProductoProduMaquina;
	public JButton jButtonid_producto_defi_produProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_area_empresa_produProductoProduMaquina;
	public JLabel jLabelid_tipo_area_empresa_produProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_area_empresa_produProductoProduMaquina;
	public JButton jButtonid_tipo_area_empresa_produProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_empresa_produProductoProduMaquina;
	public JLabel jLabelid_tipo_proceso_empresa_produProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina;
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_merma_empresaProductoProduMaquina;
	public JLabel jLabelid_tipo_merma_empresaProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaProductoProduMaquina;
	public JButton jButtonid_tipo_merma_empresaProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoProduMaquina;
	public JLabel jLabelid_unidadProductoProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoProduMaquina;
	public JButton jButtonid_unidadProductoProduMaquina= new JButtonMe();
	public JButton jButtonid_unidadProductoProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoProduMaquinaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProduMaquina;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoProduMaquinaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProduMaquina=new JPanel();
				this.jPanelAccionesFormularioProductoProduMaquina=new JPanel();
				this.jmenuBarDetalleProductoProduMaquina=new JMenuBar();
				this.jTtoolBarDetalleProductoProduMaquina=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProduMaquinaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMaquinaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProduMaquina() {
		return this.jButtonActualizarToolBarProductoProduMaquina;
	}
	
	public JButton getjButtonEliminarToolBarProductoProduMaquina() {
		return this.jButtonEliminarToolBarProductoProduMaquina;
	}
	
	public JButton getjButtonCancelarToolBarProductoProduMaquina() {
		return this.jButtonCancelarToolBarProductoProduMaquina;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProduMaquina() {
		return this.jButtonProcesarInformacionProductoProduMaquina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMaquina)	{
		this.jButtonProcesarInformacionProductoProduMaquina = jButtonProcesarInformacionProductoProduMaquina;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMaquina() {
		return this.jComboBoxTiposAccionesProductoProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMaquina(
			JComboBox jComboBoxTiposRelacionesProductoProduMaquina) {
		this.jComboBoxTiposRelacionesProductoProduMaquina = jComboBoxTiposRelacionesProductoProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMaquina(
			JComboBox jComboBoxTiposAccionesProductoProduMaquina) {
		this.jComboBoxTiposAccionesProductoProduMaquina = jComboBoxTiposAccionesProductoProduMaquina;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProduMaquina() {
		return this.jComboBoxTiposAccionesFormularioProductoProduMaquina;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProduMaquina(
			JComboBox jComboBoxTiposAccionesFormularioProductoProduMaquina) {
		this.jComboBoxTiposAccionesFormularioProductoProduMaquina = jComboBoxTiposAccionesFormularioProductoProduMaquina;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumaquinaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduMaquinaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Maquina Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProduMaquina= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProduMaquina=new JButtonMe();
				this.jButtonModificarToolBarProductoProduMaquina=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina,
							"actualizar","actualizar","Actualizar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina,
							"eliminar","eliminar","Eliminar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina,
							"cancelar","cancelar","Cancelar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProduMaquina=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProduMaquina=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProduMaquina=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProduMaquina=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProduMaquina=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMaquina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMaquina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMaquina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProduMaquina= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProduMaquina.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProduMaquina,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProduMaquina= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProduMaquina.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProduMaquina,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProduMaquina= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProduMaquina.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProduMaquina,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProduMaquina= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProduMaquina.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProduMaquina,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProduMaquina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMaquina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMaquina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProduMaquina.add(this.jMenuItemDetalleCerrarProductoProduMaquina);
		
		this.jmenuDetalleAccionesProductoProduMaquina.add(this.jMenuItemActualizarProductoProduMaquina);
		this.jmenuDetalleAccionesProductoProduMaquina.add(this.jMenuItemEliminarProductoProduMaquina);
		this.jmenuDetalleAccionesProductoProduMaquina.add(this.jMenuItemCancelarProductoProduMaquina);		
		
		//this.jmenuDetalleDatosProductoProduMaquina.add(this.jMenuItemDetalleAbrirOrderByProductoProduMaquina);				
		this.jmenuDetalleDatosProductoProduMaquina.add(this.jMenuItemDetalleMostarOcultarProductoProduMaquina);				
				
		//this.jmenuDetalleAccionesProductoProduMaquina.add(this.jMenuItemGuardarCambiosProductoProduMaquina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProduMaquina.add(this.jmenuDetalleArchivoProductoProduMaquina);		
		this.jmenuBarDetalleProductoProduMaquina.add(this.jmenuDetalleAccionesProductoProduMaquina);		
		this.jmenuBarDetalleProductoProduMaquina.add(this.jmenuDetalleDatosProductoProduMaquina);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProduMaquina);				
	}
	
	
	public void inicializarElementosCamposProductoProduMaquina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProduMaquina = new JLabelMe();
		jLabelIdProductoProduMaquina.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProduMaquina = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProduMaquina= new GridBagLayout();

		this.jPanelidProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);

		jLabelidProductoProduMaquina = new JLabel();
		jLabelidProductoProduMaquina.setText("Id");

		jLabelidProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoProduMaquina = new JLabelMe();
		this.jLabelcantidadProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoProduMaquina.setToolTipText("Cantad");
		this.jLabelcantidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelcantidadProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jTextFieldcantidadProductoProduMaquina= new JTextFieldMe();
		jTextFieldcantidadProductoProduMaquina.setEnabled(false);
		jTextFieldcantidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoProduMaquina.setText("0");

		this.jButtoncantidadProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncantidadProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoProduMaquinaBusqueda.setText("U");
		this.jButtoncantidadProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoProduMaquina = new JLabelMe();
		this.jLabelcostoProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoProduMaquina.setToolTipText("Costo");
		this.jLabelcostoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelcostoProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jTextFieldcostoProductoProduMaquina= new JTextFieldMe();
		jTextFieldcostoProductoProduMaquina.setEnabled(false);
		jTextFieldcostoProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoProduMaquina.setText("0.0");

		this.jButtoncostoProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncostoProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoProduMaquinaBusqueda.setText("U");
		this.jButtoncostoProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoProduMaquina = new JLabelMe();
		this.jLabelcosto_totalProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoProduMaquina.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelcosto_totalProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jTextFieldcosto_totalProductoProduMaquina= new JTextFieldMe();
		jTextFieldcosto_totalProductoProduMaquina.setEnabled(false);
		jTextFieldcosto_totalProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoProduMaquina.setText("0.0");

		this.jButtoncosto_totalProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoProduMaquinaBusqueda.setText("U");
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoProduMaquina = new JLabelMe();
		this.jLabeldescripcionProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoProduMaquina.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPaneldescripcionProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jTextAreadescripcionProductoProduMaquina= new JTextAreaMe();
		jTextAreadescripcionProductoProduMaquina.setEnabled(false);
		jTextAreadescripcionProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMaquina.setLineWrap(true);
		jTextAreadescripcionProductoProduMaquina.setWrapStyleWord(true);
		jTextAreadescripcionProductoProduMaquina.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoProduMaquina.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoProduMaquina = new JScrollPane(jTextAreadescripcionProductoProduMaquina);
		jscrollPanedescripcionProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtondescripcionProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoProduMaquinaBusqueda.setText("U");
		this.jButtondescripcionProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoProduMaquinaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProduMaquina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_producto_defi_produProductoProduMaquina = new JLabelMe();
		this.jLabelid_producto_defi_produProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU+" : *");
		this.jLabelid_producto_defi_produProductoProduMaquina.setToolTipText("Producto Defi Produ");
		this.jLabelid_producto_defi_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_defi_produProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_defi_produProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelid_producto_defi_produProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jComboBoxid_producto_defi_produProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_producto_defi_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_defi_produProductoProduMaquina= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMaquina.setText("Buscar");
		this.jButtonid_producto_defi_produProductoProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_defi_produProductoProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_defi_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMaquina"));

		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setText("U");
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_defi_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setText("U");
		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_defi_produProductoProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_defi_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMaquinaUpdate"));



					
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina = new JLabelMe();
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU+" : *");
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina.setToolTipText("Tipo Area Empresa Produ");
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_area_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_area_empresa_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_area_empresa_produProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_area_empresa_produProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_area_empresa_produProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jComboBoxid_tipo_area_empresa_produProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_area_empresa_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_area_empresa_produProductoProduMaquina= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setText("Buscar");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoProduMaquina"));

		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoProduMaquinaUpdate"));



					
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina = new JLabelMe();
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU+" : *");
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina.setToolTipText("Tipo Proceso Empresa Produ");
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setText("Buscar");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduMaquina"));

		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduMaquinaUpdate"));



					
		this.jLabelid_tipo_merma_empresaProductoProduMaquina = new JLabelMe();
		this.jLabelid_tipo_merma_empresaProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA+" : *");
		this.jLabelid_tipo_merma_empresaProductoProduMaquina.setToolTipText("Tipo Merma Empresa");
		this.jLabelid_tipo_merma_empresaProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_merma_empresaProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_merma_empresaProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_merma_empresaProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jComboBoxid_tipo_merma_empresaProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_merma_empresaProductoProduMaquina= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setText("Buscar");
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMaquina"));

		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoProduMaquinaUpdate"));



					
		this.jLabelid_unidadProductoProduMaquina = new JLabelMe();
		this.jLabelid_unidadProductoProduMaquina.setText(""+ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoProduMaquina.setToolTipText("Unad");
		this.jLabelid_unidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoProduMaquina.setToolTipText(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		this.jPanelid_unidadProductoProduMaquina.setLayout(this.gridaBagLayoutProductoProduMaquina);


		jComboBoxid_unidadProductoProduMaquina= new JComboBoxMe();
		jComboBoxid_unidadProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoProduMaquina= new JButtonMe();
		this.jButtonid_unidadProductoProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMaquina.setText("Buscar");
		this.jButtonid_unidadProductoProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMaquina"));

		this.jButtonid_unidadProductoProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduMaquinaBusqueda.setText("U");
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMaquinaBusqueda"));

		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_unidadProductoProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduMaquinaUpdate.setText("U");
		this.jButtonid_unidadProductoProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMaquinaUpdate"));



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
		//this.jInternalFrameDetalleProductoProduMaquina = new ProductoProduMaquinaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Maquina Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMaquina= new GridBagLayout();
		

		
		String sToolTipProductoProduMaquina="";
		sToolTipProductoProduMaquina=ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMaquina+="(Produccion.ProductoProduMaquina)";
		}
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMaquina+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProduMaquina = new JButtonMe();
		this.jButtonModificarProductoProduMaquina = new JButtonMe();
        this.jButtonActualizarProductoProduMaquina = new JButtonMe();
        this.jButtonEliminarProductoProduMaquina = new JButtonMe();
        this.jButtonCancelarProductoProduMaquina = new JButtonMe();
        this.jButtonGuardarCambiosProductoProduMaquina = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProduMaquina = new JButtonMe();
		this.jButtonCerrarProductoProduMaquina = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMaquina = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProduMaquina = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProduMaquina = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Maquina Produccion";
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Maquina Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProduMaquina.setName("jPanelCamposProductoProduMaquina"); 

		this.jPanelCamposOcultosProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProduMaquina.setName("jPanelCamposOcultosProductoProduMaquina"); 

        this.jPanelAccionesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMaquina.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProduMaquina.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProduMaquina.setText("Nuevo");
		this.jButtonModificarProductoProduMaquina.setText("Editar");
        this.jButtonActualizarProductoProduMaquina.setText("Actualizar");
        this.jButtonEliminarProductoProduMaquina.setText("Eliminar");
        this.jButtonCancelarProductoProduMaquina.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProduMaquina.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProduMaquina.setText("Guardar");
		this.jButtonCerrarProductoProduMaquina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMaquina,"nuevo_button","Nuevo",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProduMaquina,"modificar_button","Editar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProduMaquina,"actualizar_button","Actualizar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProduMaquina,"eliminar_button","Eliminar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProduMaquina,"cancelar_button","Cancelar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProduMaquina,"guardarcambios_button","Guardar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMaquina,"guardarcambiostabla_button","Guardar",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMaquina,"cerrar_button","Salir",this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProduMaquina.setToolTipText("Nuevo"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProduMaquina.setToolTipText("Editar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProduMaquina.setToolTipText("Actualizar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProduMaquina.setToolTipText("Eliminar)"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProduMaquina.setToolTipText("Cancelar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProduMaquina.setToolTipText("Guardar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProduMaquina.setToolTipText("Guardar"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMaquina.setToolTipText("Salir"+" "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMaquina";
		inputMap = this.jButtonNuevoProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMaquina"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProduMaquina";
		inputMap = this.jButtonActualizarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProduMaquina"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProduMaquina";
		inputMap = this.jButtonEliminarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProduMaquina"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProduMaquina";
		inputMap = this.jButtonCancelarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProduMaquina"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMaquina";
		inputMap = this.jButtonCerrarProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMaquina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMaquina";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMaquina"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProduMaquina.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProduMaquina.setToolTipText("Nuevo ProductoProduMaquina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProduMaquina.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProduMaquina.setToolTipText("Sin Cerrar Ventana ProductoProduMaquina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProduMaquina.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProduMaquina.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMaquina.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMaquina.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProduMaquina.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProduMaquina.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProduMaquina = new JLabelMe();
		
		this.jLabelAccionesProductoProduMaquina.setText("Acciones");		
		this.jLabelAccionesProductoProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProduMaquina();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProduMaquina();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProduMaquina=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMaquina.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProduMaquina = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProduMaquina = new GridBagLayout();
		
		this.jPanelCamposProductoProduMaquina.setLayout(gridaBagLayoutCamposProductoProduMaquina);
		this.jPanelCamposOcultosProductoProduMaquina.setLayout(gridaBagLayoutCamposOcultosProductoProduMaquina);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProduMaquina.add(jLabelIdProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProduMaquina.add(jLabelidProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_defi_produProductoProduMaquina.add(jLabelid_producto_defi_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMaquina.add(jButtonid_producto_defi_produProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMaquina.add(jButtonid_producto_defi_produProductoProduMaquinaUpdate, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_defi_produProductoProduMaquina.add(jComboBoxid_producto_defi_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_area_empresa_produProductoProduMaquina.add(jLabelid_tipo_area_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_area_empresa_produProductoProduMaquina.add(jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_area_empresa_produProductoProduMaquina.add(jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_area_empresa_produProductoProduMaquina.add(jComboBoxid_tipo_area_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.add(jLabelid_tipo_proceso_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.add(jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.add(jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.add(jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_merma_empresaProductoProduMaquina.add(jLabelid_tipo_merma_empresaProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoProduMaquina.add(jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoProduMaquina.add(jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_merma_empresaProductoProduMaquina.add(jComboBoxid_tipo_merma_empresaProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoProduMaquina.add(jLabelid_unidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMaquina.add(jButtonid_unidadProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMaquina.add(jButtonid_unidadProductoProduMaquinaUpdate, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoProduMaquina.add(jComboBoxid_unidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoProduMaquina.add(jLabelcantidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoProduMaquina.add(jButtoncantidadProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoProduMaquina.add(jTextFieldcantidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoProduMaquina.add(jLabelcostoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoProduMaquina.add(jButtoncostoProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoProduMaquina.add(jTextFieldcostoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoProduMaquina.add(jLabelcosto_totalProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoProduMaquina.add(jButtoncosto_totalProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoProduMaquina.add(jTextFieldcosto_totalProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoProduMaquina.add(jLabeldescripcionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoProduMaquina.add(jButtondescripcionProductoProduMaquinaBusqueda, this.gridBagConstraintsProductoProduMaquina);
	}

	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoProduMaquina.add(jscrollPanedescripcionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelidProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelid_producto_defi_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelid_tipo_area_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelid_tipo_proceso_empresa_produProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelid_tipo_merma_empresaProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelid_unidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelcantidadProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelcostoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPanelcosto_totalProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
	}
	this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMaquina.gridy = iYPanelCamposProductoProduMaquina;
	this.gridBagConstraintsProductoProduMaquina.gridx = iXPanelCamposProductoProduMaquina++;
	this.gridBagConstraintsProductoProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMaquina.add(this.jPaneldescripcionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);



	if(iXPanelCamposProductoProduMaquina % 1==0) {
		iXPanelCamposProductoProduMaquina=0;
		iYPanelCamposProductoProduMaquina++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMaquina= new GridBagLayout();
		this.jPanelAccionesProductoProduMaquina.setLayout(gridaBagLayoutAccionesProductoProduMaquina);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProduMaquina= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProduMaquina.setLayout(gridaBagLayoutAccionesFormularioProductoProduMaquina);
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMaquina.add(this.jComboBoxTiposAccionesFormularioProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMaquina.add(this.jCheckBoxPostAccionNuevoProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMaquina.add(this.jCheckBoxPostAccionSinCerrarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMaquina.add(this.jCheckBoxPostAccionSinMensajeProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonModificarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);							

		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoProduMaquina.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonEliminarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonActualizarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);


		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoProduMaquina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonGuardarCambiosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);	
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoProduMaquina.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProduMaquina.add(this.jButtonCancelarProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMaquina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMaquina);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;		
			//this.gridBagConstraintsProductoProduMaquina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMaquina.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMaquina.gridx =0;
		this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMaquina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProduMaquina = new ProductoProduMaquinaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Maquina Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Maquina Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Maquina Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProduMaquinaModel productoprodumaquinaModel=new ProductoProduMaquinaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProduMaquinaModel.ProductoProduMaquinaFocusTraversalPolicy productoprodumaquinaFocusTraversalPolicy = productoprodumaquinaModel.new ProductoProduMaquinaFocusTraversalPolicy(this);
			
			//productoprodumaquinaFocusTraversalPolicy.setproductoprodumaquinaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoprodumaquinaModel);
			
			
			this.jContentPaneDetalleProductoProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProduMaquina = new GridBagLayout();	
			this.jContentPaneDetalleProductoProduMaquina.setLayout(gridaBagLayoutDetalleProductoProduMaquina);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMaquina = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProduMaquina.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProduMaquina.add(jTtoolBarDetalleProductoProduMaquina, gridBagConstraintsProductoProduMaquina);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProduMaquina=   new JScrollPane(jContentPaneDetalleProductoProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProduMaquina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	        
			this.jContentPaneDetalleProductoProduMaquina.add(jPanelCamposProductoProduMaquina, gridBagConstraintsProductoProduMaquina);
			
			
			
			
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
						&& productoprodumaquinaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProduMaquina= new GridBagConstraints();
						this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProduMaquina.gridx = 0;
						this.jContentPaneDetalleProductoProduMaquina.add(this.jTabbedPaneRelacionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProduMaquina.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProduMaquina.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
					this.gridBagConstraintsProductoProduMaquina.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProduMaquina.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProduMaquina.add(jPanelCamposOcultosProductoProduMaquina, gridBagConstraintsProductoProduMaquina);
				
					this.jPanelCamposOcultosProductoProduMaquina.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	        this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProduMaquina.add(this.jPanelAccionesFormularioProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);							
			
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
	        this.gridBagConstraintsProductoProduMaquina.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProduMaquina.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProduMaquina.add(this.jPanelAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProduMaquina);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProduMaquina=   new JScrollPane(this.jPanelCamposProductoProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;
			this.gridBagConstraintsProductoProduMaquina.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProduMaquina.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProduMaquina.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);			
			
			this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMaquina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
			
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		
			
		this.gridBagConstraintsProductoProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMaquina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMaquina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMaquina, this.gridBagConstraintsProductoProduMaquina);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProduMaquina;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProduMaquina;
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
